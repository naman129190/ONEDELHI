package org.apache.commons.compress.archivers.zip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.apache.commons.compress.utils.IOUtils;

public class ZipArchiveInputStream extends ArchiveInputStream {
    private static final byte[] CFH = ZipLong.CFH_SIG.getBytes();
    private static final int CFH_LEN = 46;

    /* renamed from: DD */
    private static final byte[] f38874DD = ZipLong.DD_SIG.getBytes();
    private static final byte[] LFH = ZipLong.LFH_SIG.getBytes();
    private static final int LFH_LEN = 30;
    private static final long TWO_EXP_32 = 4294967296L;
    private final byte[] LFH_BUF;
    private final byte[] SHORT_BUF;
    private final byte[] SKIP_BUF;
    private final byte[] TWO_DWORD_BUF;
    private final byte[] WORD_BUF;
    private boolean allowStoredEntriesWithDataDescriptor;
    private final ByteBuffer buf;
    private boolean closed;
    /* access modifiers changed from: private */
    public CurrentEntry current;
    public final String encoding;
    private int entriesRead;
    private boolean hitCentralDirectory;

    /* renamed from: in */
    private final InputStream f38875in;
    private final Inflater inf;
    private ByteArrayInputStream lastStoredEntry;
    private final boolean useUnicodeExtraFields;
    private final ZipEncoding zipEncoding;

    public class BoundedInputStream extends InputStream {

        /* renamed from: in */
        private final InputStream f38876in;
        private final long max;
        private long pos = 0;

        public BoundedInputStream(InputStream inputStream, long j) {
            this.max = j;
            this.f38876in = inputStream;
        }

        public int available() throws IOException {
            long j = this.max;
            if (j < 0 || this.pos < j) {
                return this.f38876in.available();
            }
            return 0;
        }

        public int read() throws IOException {
            long j = this.max;
            if (j >= 0 && this.pos >= j) {
                return -1;
            }
            int read = this.f38876in.read();
            this.pos++;
            ZipArchiveInputStream.this.count(1);
            CurrentEntry.access$708(ZipArchiveInputStream.this.current);
            return read;
        }

        public int read(byte[] bArr) throws IOException {
            return read(bArr, 0, bArr.length);
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.max;
            if (j >= 0 && this.pos >= j) {
                return -1;
            }
            int read = this.f38876in.read(bArr, i, (int) (j >= 0 ? Math.min((long) i2, j - this.pos) : (long) i2));
            if (read == -1) {
                return -1;
            }
            long j2 = (long) read;
            this.pos += j2;
            ZipArchiveInputStream.this.count(read);
            CurrentEntry.access$714(ZipArchiveInputStream.this.current, j2);
            return read;
        }

        public long skip(long j) throws IOException {
            long j2 = this.max;
            if (j2 >= 0) {
                j = Math.min(j, j2 - this.pos);
            }
            long skip = this.f38876in.skip(j);
            this.pos += skip;
            return skip;
        }
    }

    public static final class CurrentEntry {
        /* access modifiers changed from: private */
        public long bytesRead;
        /* access modifiers changed from: private */
        public long bytesReadFromStream;
        /* access modifiers changed from: private */
        public final CRC32 crc;
        /* access modifiers changed from: private */
        public final ZipArchiveEntry entry;
        /* access modifiers changed from: private */
        public boolean hasDataDescriptor;
        /* access modifiers changed from: private */

        /* renamed from: in */
        public InputStream f38877in;
        /* access modifiers changed from: private */
        public boolean usesZip64;

        private CurrentEntry() {
            this.entry = new ZipArchiveEntry();
            this.crc = new CRC32();
        }

        public static /* synthetic */ long access$614(CurrentEntry currentEntry, long j) {
            long j2 = currentEntry.bytesRead + j;
            currentEntry.bytesRead = j2;
            return j2;
        }

        public static /* synthetic */ long access$708(CurrentEntry currentEntry) {
            long j = currentEntry.bytesReadFromStream;
            currentEntry.bytesReadFromStream = 1 + j;
            return j;
        }

        public static /* synthetic */ long access$714(CurrentEntry currentEntry, long j) {
            long j2 = currentEntry.bytesReadFromStream + j;
            currentEntry.bytesReadFromStream = j2;
            return j2;
        }
    }

    public ZipArchiveInputStream(InputStream inputStream) {
        this(inputStream, "UTF8");
    }

    public ZipArchiveInputStream(InputStream inputStream, String str) {
        this(inputStream, str, true);
    }

    public ZipArchiveInputStream(InputStream inputStream, String str, boolean z) {
        this(inputStream, str, z, false);
    }

    public ZipArchiveInputStream(InputStream inputStream, String str, boolean z, boolean z2) {
        this.inf = new Inflater(true);
        ByteBuffer allocate = ByteBuffer.allocate(512);
        this.buf = allocate;
        this.current = null;
        this.closed = false;
        this.hitCentralDirectory = false;
        this.lastStoredEntry = null;
        this.allowStoredEntriesWithDataDescriptor = false;
        this.LFH_BUF = new byte[30];
        this.SKIP_BUF = new byte[1024];
        this.SHORT_BUF = new byte[2];
        this.WORD_BUF = new byte[4];
        this.TWO_DWORD_BUF = new byte[16];
        this.entriesRead = 0;
        this.encoding = str;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str);
        this.useUnicodeExtraFields = z;
        this.f38875in = new PushbackInputStream(inputStream, allocate.capacity());
        this.allowStoredEntriesWithDataDescriptor = z2;
        allocate.limit(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean bufferContainsSignature(java.io.ByteArrayOutputStream r12, int r13, int r14, int r15) throws java.io.IOException {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0004:
            if (r1 != 0) goto L_0x00a6
            int r4 = r14 + -4
            if (r2 >= r4) goto L_0x00a6
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            byte r4 = r4[r2]
            byte[] r5 = LFH
            byte r6 = r5[r0]
            if (r4 != r6) goto L_0x00a2
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r6 = r2 + 1
            byte r4 = r4[r6]
            r6 = 1
            byte r7 = r5[r6]
            if (r4 != r7) goto L_0x00a2
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r7 = r2 + 2
            byte r4 = r4[r7]
            r8 = 2
            byte r9 = r5[r8]
            r10 = 3
            if (r4 != r9) goto L_0x0045
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r9 = r2 + 3
            byte r4 = r4[r9]
            byte r5 = r5[r10]
            if (r4 == r5) goto L_0x0061
        L_0x0045:
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            byte r4 = r4[r2]
            byte[] r5 = CFH
            byte r9 = r5[r8]
            if (r4 != r9) goto L_0x0068
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r9 = r2 + 3
            byte r4 = r4[r9]
            byte r5 = r5[r10]
            if (r4 != r5) goto L_0x0068
        L_0x0061:
            int r1 = r13 + r14
            int r1 = r1 - r2
            int r1 = r1 - r15
        L_0x0065:
            r3 = r1
            r1 = 1
            goto L_0x0088
        L_0x0068:
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            byte r4 = r4[r7]
            byte[] r5 = f38874DD
            byte r7 = r5[r8]
            if (r4 != r7) goto L_0x0088
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r7 = r2 + 3
            byte r4 = r4[r7]
            byte r5 = r5[r10]
            if (r4 != r5) goto L_0x0088
            int r1 = r13 + r14
            int r1 = r1 - r2
            goto L_0x0065
        L_0x0088:
            if (r1 == 0) goto L_0x00a2
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            int r5 = r13 + r14
            int r5 = r5 - r3
            r11.pushback(r4, r5, r3)
            java.nio.ByteBuffer r4 = r11.buf
            byte[] r4 = r4.array()
            r12.write(r4, r0, r2)
            r11.readDataDescriptor()
        L_0x00a2:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int):boolean");
    }

    private int cacheBytesRead(ByteArrayOutputStream byteArrayOutputStream, int i, int i2, int i3) {
        int i4 = i + i2;
        int i5 = (i4 - i3) - 3;
        if (i5 <= 0) {
            return i4;
        }
        byteArrayOutputStream.write(this.buf.array(), 0, i5);
        int i6 = i3 + 3;
        System.arraycopy(this.buf.array(), i5, this.buf.array(), 0, i6);
        return i6;
    }

    private static boolean checksig(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private void closeEntry() throws IOException {
        if (!this.closed) {
            CurrentEntry currentEntry = this.current;
            if (currentEntry != null) {
                if (currentEntry.bytesReadFromStream > this.current.entry.getCompressedSize() || this.current.hasDataDescriptor) {
                    skip(Long.MAX_VALUE);
                    int access$700 = (int) (this.current.bytesReadFromStream - (this.current.entry.getMethod() == 8 ? getBytesInflated() : this.current.bytesRead));
                    if (access$700 > 0) {
                        pushback(this.buf.array(), this.buf.limit() - access$700, access$700);
                    }
                } else {
                    drainCurrentEntryData();
                }
                if (this.lastStoredEntry == null && this.current.hasDataDescriptor) {
                    readDataDescriptor();
                }
                this.inf.reset();
                this.buf.clear().flip();
                this.current = null;
                this.lastStoredEntry = null;
                return;
            }
            return;
        }
        throw new IOException("The stream is closed");
    }

    private void drainCurrentEntryData() throws IOException {
        long compressedSize = this.current.entry.getCompressedSize() - this.current.bytesReadFromStream;
        while (compressedSize > 0) {
            long read = (long) this.f38875in.read(this.buf.array(), 0, (int) Math.min((long) this.buf.capacity(), compressedSize));
            if (read >= 0) {
                count(read);
                compressedSize -= read;
            } else {
                throw new EOFException("Truncated ZIP entry: " + this.current.entry.getName());
            }
        }
    }

    private int fill() throws IOException {
        if (!this.closed) {
            int read = this.f38875in.read(this.buf.array());
            if (read > 0) {
                this.buf.limit(read);
                count(this.buf.limit());
                this.inf.setInput(this.buf.array(), 0, this.buf.limit());
            }
            return read;
        }
        throw new IOException("The stream is closed");
    }

    private void findEocdRecord() throws IOException {
        boolean z = false;
        int i = -1;
        while (true) {
            if (!z) {
                i = readOneByte();
                if (i <= -1) {
                    return;
                }
            }
            if (!isFirstByteOfEocdSig(i)) {
                z = false;
            } else {
                i = readOneByte();
                byte[] bArr = ZipArchiveOutputStream.EOCD_SIG;
                if (i == bArr[1]) {
                    i = readOneByte();
                    if (i == bArr[2]) {
                        i = readOneByte();
                        if (i == -1 || i == bArr[3]) {
                            return;
                        }
                    } else if (i == -1) {
                        return;
                    }
                } else if (i == -1) {
                    return;
                }
                z = isFirstByteOfEocdSig(i);
            }
        }
    }

    private long getBytesInflated() {
        long bytesRead = this.inf.getBytesRead();
        if (this.current.bytesReadFromStream >= 4294967296L) {
            while (true) {
                long j = bytesRead + 4294967296L;
                if (j > this.current.bytesReadFromStream) {
                    break;
                }
                bytesRead = j;
            }
        }
        return bytesRead;
    }

    private boolean isFirstByteOfEocdSig(int i) {
        return i == ZipArchiveOutputStream.EOCD_SIG[0];
    }

    public static boolean matches(byte[] bArr, int i) {
        byte[] bArr2 = ZipArchiveOutputStream.LFH_SIG;
        if (i < bArr2.length) {
            return false;
        }
        return checksig(bArr, bArr2) || checksig(bArr, ZipArchiveOutputStream.EOCD_SIG) || checksig(bArr, ZipArchiveOutputStream.DD_SIG) || checksig(bArr, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
    }

    private void processZip64Extra(ZipLong zipLong, ZipLong zipLong2) {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = (Zip64ExtendedInformationExtraField) this.current.entry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        boolean unused = this.current.usesZip64 = zip64ExtendedInformationExtraField != null;
        if (!this.current.hasDataDescriptor) {
            if (zip64ExtendedInformationExtraField != null) {
                ZipLong zipLong3 = ZipLong.ZIP64_MAGIC;
                if (zipLong2.equals(zipLong3) || zipLong.equals(zipLong3)) {
                    this.current.entry.setCompressedSize(zip64ExtendedInformationExtraField.getCompressedSize().getLongValue());
                    this.current.entry.setSize(zip64ExtendedInformationExtraField.getSize().getLongValue());
                    return;
                }
            }
            this.current.entry.setCompressedSize(zipLong2.getValue());
            this.current.entry.setSize(zipLong.getValue());
        }
    }

    private void pushback(byte[] bArr, int i, int i2) throws IOException {
        ((PushbackInputStream) this.f38875in).unread(bArr, i, i2);
        pushedBackBytes((long) i2);
    }

    private void readDataDescriptor() throws IOException {
        long j;
        ZipArchiveEntry zipArchiveEntry;
        readFully(this.WORD_BUF);
        ZipLong zipLong = new ZipLong(this.WORD_BUF);
        if (ZipLong.DD_SIG.equals(zipLong)) {
            readFully(this.WORD_BUF);
            zipLong = new ZipLong(this.WORD_BUF);
        }
        this.current.entry.setCrc(zipLong.getValue());
        readFully(this.TWO_DWORD_BUF);
        ZipLong zipLong2 = new ZipLong(this.TWO_DWORD_BUF, 8);
        if (zipLong2.equals(ZipLong.CFH_SIG) || zipLong2.equals(ZipLong.LFH_SIG)) {
            pushback(this.TWO_DWORD_BUF, 8, 8);
            this.current.entry.setCompressedSize(ZipLong.getValue(this.TWO_DWORD_BUF));
            zipArchiveEntry = this.current.entry;
            j = ZipLong.getValue(this.TWO_DWORD_BUF, 4);
        } else {
            this.current.entry.setCompressedSize(ZipEightByteInteger.getLongValue(this.TWO_DWORD_BUF));
            zipArchiveEntry = this.current.entry;
            j = ZipEightByteInteger.getLongValue(this.TWO_DWORD_BUF, 8);
        }
        zipArchiveEntry.setSize(j);
    }

    private int readDeflated(byte[] bArr, int i, int i2) throws IOException {
        int readFromInflater = readFromInflater(bArr, i, i2);
        if (readFromInflater <= 0) {
            if (this.inf.finished()) {
                return -1;
            }
            if (this.inf.needsDictionary()) {
                throw new ZipException("This archive needs a preset dictionary which is not supported by Commons Compress.");
            } else if (readFromInflater == -1) {
                throw new IOException("Truncated ZIP file");
            }
        }
        return readFromInflater;
    }

    private void readFirstLocalFileHeader(byte[] bArr) throws IOException {
        readFully(bArr);
        ZipLong zipLong = new ZipLong(bArr);
        if (zipLong.equals(ZipLong.DD_SIG)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.SPLITTING);
        } else if (zipLong.equals(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER)) {
            byte[] bArr2 = new byte[4];
            readFully(bArr2);
            System.arraycopy(bArr, 4, bArr, 0, 26);
            System.arraycopy(bArr2, 0, bArr, 26, 4);
        }
    }

    private int readFromInflater(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (true) {
            if (this.inf.needsInput()) {
                int fill = fill();
                if (fill > 0) {
                    CurrentEntry.access$714(this.current, (long) this.buf.limit());
                } else if (fill == -1) {
                    return -1;
                }
            }
            try {
                i3 = this.inf.inflate(bArr, i, i2);
                if (i3 == 0) {
                    if (!this.inf.needsInput()) {
                        break;
                    }
                } else {
                    break;
                }
            } catch (DataFormatException e) {
                throw ((IOException) new ZipException(e.getMessage()).initCause(e));
            }
        }
        return i3;
    }

    private void readFully(byte[] bArr) throws IOException {
        int readFully = IOUtils.readFully(this.f38875in, bArr);
        count(readFully);
        if (readFully < bArr.length) {
            throw new EOFException();
        }
    }

    private int readOneByte() throws IOException {
        int read = this.f38875in.read();
        if (read != -1) {
            count(1);
        }
        return read;
    }

    private int readStored(byte[] bArr, int i, int i2) throws IOException {
        if (this.current.hasDataDescriptor) {
            if (this.lastStoredEntry == null) {
                readStoredEntry();
            }
            return this.lastStoredEntry.read(bArr, i, i2);
        }
        long size = this.current.entry.getSize();
        if (this.current.bytesRead >= size) {
            return -1;
        }
        if (this.buf.position() >= this.buf.limit()) {
            this.buf.position(0);
            int read = this.f38875in.read(this.buf.array());
            if (read == -1) {
                return -1;
            }
            this.buf.limit(read);
            count(read);
            CurrentEntry.access$714(this.current, (long) read);
        }
        int min = Math.min(this.buf.remaining(), i2);
        if (size - this.current.bytesRead < ((long) min)) {
            min = (int) (size - this.current.bytesRead);
        }
        this.buf.get(bArr, i, min);
        CurrentEntry.access$614(this.current, (long) min);
        return min;
    }

    private void readStoredEntry() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.current.usesZip64 ? 20 : 12;
        boolean z = false;
        int i2 = 0;
        while (!z) {
            int read = this.f38875in.read(this.buf.array(), i2, 512 - i2);
            if (read > 0) {
                int i3 = read + i2;
                if (i3 < 4) {
                    i2 = i3;
                } else {
                    z = bufferContainsSignature(byteArrayOutputStream, i2, read, i);
                    if (!z) {
                        i2 = cacheBytesRead(byteArrayOutputStream, i2, read, i);
                    }
                }
            } else {
                throw new IOException("Truncated ZIP file");
            }
        }
        this.lastStoredEntry = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    private void realSkip(long j) throws IOException {
        long j2 = 0;
        if (j >= 0) {
            while (j2 < j) {
                long j3 = j - j2;
                InputStream inputStream = this.f38875in;
                byte[] bArr = this.SKIP_BUF;
                if (((long) bArr.length) <= j3) {
                    j3 = (long) bArr.length;
                }
                int read = inputStream.read(bArr, 0, (int) j3);
                if (read != -1) {
                    count(read);
                    j2 += (long) read;
                } else {
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private void skipRemainderOfArchive() throws IOException {
        realSkip((long) ((this.entriesRead * 46) - 30));
        findEocdRecord();
        realSkip(16);
        readFully(this.SHORT_BUF);
        realSkip((long) ZipShort.getValue(this.SHORT_BUF));
    }

    private boolean supportsDataDescriptorFor(ZipArchiveEntry zipArchiveEntry) {
        return !zipArchiveEntry.getGeneralPurposeBit().usesDataDescriptor() || (this.allowStoredEntriesWithDataDescriptor && zipArchiveEntry.getMethod() == 0) || zipArchiveEntry.getMethod() == 8;
    }

    public boolean canReadEntryData(ArchiveEntry archiveEntry) {
        if (!(archiveEntry instanceof ZipArchiveEntry)) {
            return false;
        }
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) archiveEntry;
        return ZipUtil.canHandleEntryData(zipArchiveEntry) && supportsDataDescriptorFor(zipArchiveEntry);
    }

    public void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.f38875in.close();
            this.inf.end();
        }
    }

    public ArchiveEntry getNextEntry() throws IOException {
        return getNextZipEntry();
    }

    public ZipArchiveEntry getNextZipEntry() throws IOException {
        boolean z;
        ZipLong zipLong;
        ZipLong zipLong2;
        CurrentEntry currentEntry;
        InputStream explodingInputStream;
        if (!this.closed && !this.hitCentralDirectory) {
            if (this.current != null) {
                closeEntry();
                z = false;
            } else {
                z = true;
            }
            if (z) {
                try {
                    readFirstLocalFileHeader(this.LFH_BUF);
                } catch (EOFException unused) {
                }
            } else {
                readFully(this.LFH_BUF);
            }
            ZipLong zipLong3 = new ZipLong(this.LFH_BUF);
            if (zipLong3.equals(ZipLong.CFH_SIG) || zipLong3.equals(ZipLong.AED_SIG)) {
                this.hitCentralDirectory = true;
                skipRemainderOfArchive();
            }
            if (!zipLong3.equals(ZipLong.LFH_SIG)) {
                return null;
            }
            this.current = new CurrentEntry();
            this.current.entry.setPlatform((ZipShort.getValue(this.LFH_BUF, 4) >> 8) & 15);
            GeneralPurposeBit parse = GeneralPurposeBit.parse(this.LFH_BUF, 6);
            boolean usesUTF8ForNames = parse.usesUTF8ForNames();
            ZipEncoding zipEncoding2 = usesUTF8ForNames ? ZipEncodingHelper.UTF8_ZIP_ENCODING : this.zipEncoding;
            boolean unused2 = this.current.hasDataDescriptor = parse.usesDataDescriptor();
            this.current.entry.setGeneralPurposeBit(parse);
            this.current.entry.setMethod(ZipShort.getValue(this.LFH_BUF, 8));
            this.current.entry.setTime(ZipUtil.dosToJavaTime(ZipLong.getValue(this.LFH_BUF, 10)));
            if (!this.current.hasDataDescriptor) {
                this.current.entry.setCrc(ZipLong.getValue(this.LFH_BUF, 14));
                zipLong2 = new ZipLong(this.LFH_BUF, 18);
                zipLong = new ZipLong(this.LFH_BUF, 22);
            } else {
                zipLong2 = null;
                zipLong = null;
            }
            int value = ZipShort.getValue(this.LFH_BUF, 26);
            int value2 = ZipShort.getValue(this.LFH_BUF, 28);
            byte[] bArr = new byte[value];
            readFully(bArr);
            this.current.entry.setName(zipEncoding2.decode(bArr), bArr);
            byte[] bArr2 = new byte[value2];
            readFully(bArr2);
            this.current.entry.setExtra(bArr2);
            if (!usesUTF8ForNames && this.useUnicodeExtraFields) {
                ZipUtil.setNameAndCommentFromExtraFields(this.current.entry, bArr, (byte[]) null);
            }
            processZip64Extra(zipLong, zipLong2);
            if (this.current.entry.getCompressedSize() != -1) {
                if (this.current.entry.getMethod() == ZipMethod.UNSHRINKING.getCode()) {
                    currentEntry = this.current;
                    explodingInputStream = new UnshrinkingInputStream(new BoundedInputStream(this.f38875in, currentEntry.entry.getCompressedSize()));
                } else if (this.current.entry.getMethod() == ZipMethod.IMPLODING.getCode()) {
                    currentEntry = this.current;
                    explodingInputStream = new ExplodingInputStream(currentEntry.entry.getGeneralPurposeBit().getSlidingDictionarySize(), this.current.entry.getGeneralPurposeBit().getNumberOfShannonFanoTrees(), new BoundedInputStream(this.f38875in, this.current.entry.getCompressedSize()));
                }
                InputStream unused3 = currentEntry.f38877in = explodingInputStream;
            }
            this.entriesRead++;
            return this.current.entry;
        }
        return null;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (!this.closed) {
            CurrentEntry currentEntry = this.current;
            if (currentEntry == null) {
                return -1;
            }
            if (i > bArr.length || i2 < 0 || i < 0 || bArr.length - i < i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            ZipUtil.checkRequestedFeatures(currentEntry.entry);
            if (supportsDataDescriptorFor(this.current.entry)) {
                if (this.current.entry.getMethod() == 0) {
                    i3 = readStored(bArr, i, i2);
                } else if (this.current.entry.getMethod() == 8) {
                    i3 = readDeflated(bArr, i, i2);
                } else if (this.current.entry.getMethod() == ZipMethod.UNSHRINKING.getCode() || this.current.entry.getMethod() == ZipMethod.IMPLODING.getCode()) {
                    i3 = this.current.f38877in.read(bArr, i, i2);
                } else {
                    throw new UnsupportedZipFeatureException(ZipMethod.getMethodByCode(this.current.entry.getMethod()), this.current.entry);
                }
                if (i3 >= 0) {
                    this.current.crc.update(bArr, i, i3);
                }
                return i3;
            }
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR, this.current.entry);
        }
        throw new IOException("The stream is closed");
    }

    public long skip(long j) throws IOException {
        long j2 = 0;
        if (j >= 0) {
            while (j2 < j) {
                long j3 = j - j2;
                byte[] bArr = this.SKIP_BUF;
                if (((long) bArr.length) <= j3) {
                    j3 = (long) bArr.length;
                }
                int read = read(bArr, 0, (int) j3);
                if (read == -1) {
                    return j2;
                }
                j2 += (long) read;
            }
            return j2;
        }
        throw new IllegalArgumentException();
    }
}

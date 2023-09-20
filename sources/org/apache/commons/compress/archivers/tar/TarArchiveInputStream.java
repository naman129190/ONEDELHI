package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.IOUtils;

public class TarArchiveInputStream extends ArchiveInputStream {
    private static final int SMALL_BUFFER_SIZE = 256;
    private final byte[] SMALL_BUF;
    private final int blockSize;
    private TarArchiveEntry currEntry;
    public final String encoding;
    private long entryOffset;
    private long entrySize;
    private boolean hasHitEOF;

    /* renamed from: is */
    private final InputStream f38868is;
    private final int recordSize;
    private final ZipEncoding zipEncoding;

    public TarArchiveInputStream(InputStream inputStream) {
        this(inputStream, (int) TarConstants.DEFAULT_BLKSIZE, 512);
    }

    public TarArchiveInputStream(InputStream inputStream, int i) {
        this(inputStream, i, 512);
    }

    public TarArchiveInputStream(InputStream inputStream, int i, int i2) {
        this(inputStream, i, i2, (String) null);
    }

    public TarArchiveInputStream(InputStream inputStream, int i, int i2, String str) {
        this.SMALL_BUF = new byte[256];
        this.f38868is = inputStream;
        this.hasHitEOF = false;
        this.encoding = str;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str);
        this.recordSize = i2;
        this.blockSize = i;
    }

    public TarArchiveInputStream(InputStream inputStream, int i, String str) {
        this(inputStream, i, 512, str);
    }

    public TarArchiveInputStream(InputStream inputStream, String str) {
        this(inputStream, TarConstants.DEFAULT_BLKSIZE, 512, str);
    }

    private void applyPaxHeadersToCurrentEntry(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if ("path".equals(str)) {
                this.currEntry.setName(str2);
            } else if ("linkpath".equals(str)) {
                this.currEntry.setLinkName(str2);
            } else if ("gid".equals(str)) {
                this.currEntry.setGroupId(Long.parseLong(str2));
            } else if ("gname".equals(str)) {
                this.currEntry.setGroupName(str2);
            } else if ("uid".equals(str)) {
                this.currEntry.setUserId(Long.parseLong(str2));
            } else if ("uname".equals(str)) {
                this.currEntry.setUserName(str2);
            } else if ("size".equals(str)) {
                this.currEntry.setSize(Long.parseLong(str2));
            } else if ("mtime".equals(str)) {
                this.currEntry.setModTime((long) (Double.parseDouble(str2) * 1000.0d));
            } else if ("SCHILY.devminor".equals(str)) {
                this.currEntry.setDevMinor(Integer.parseInt(str2));
            } else if ("SCHILY.devmajor".equals(str)) {
                this.currEntry.setDevMajor(Integer.parseInt(str2));
            }
        }
    }

    private void consumeRemainderOfLastBlock() throws IOException {
        long bytesRead = getBytesRead();
        int i = this.blockSize;
        long j = bytesRead % ((long) i);
        if (j > 0) {
            count(IOUtils.skip(this.f38868is, ((long) i) - j));
        }
    }

    private byte[] getRecord() throws IOException {
        byte[] readRecord = readRecord();
        boolean isEOFRecord = isEOFRecord(readRecord);
        this.hasHitEOF = isEOFRecord;
        if (!isEOFRecord || readRecord == null) {
            return readRecord;
        }
        tryToConsumeSecondEOFRecord();
        consumeRemainderOfLastBlock();
        return null;
    }

    public static boolean matches(byte[] bArr, int i) {
        if (i < 265) {
            return false;
        }
        if (ArchiveUtils.matchAsciiBuffer("ustar\u0000", bArr, 257, 6) && ArchiveUtils.matchAsciiBuffer("00", bArr, TarConstants.VERSION_OFFSET, 2)) {
            return true;
        }
        if (!ArchiveUtils.matchAsciiBuffer(TarConstants.MAGIC_GNU, bArr, 257, 6) || (!ArchiveUtils.matchAsciiBuffer(TarConstants.VERSION_GNU_SPACE, bArr, TarConstants.VERSION_OFFSET, 2) && !ArchiveUtils.matchAsciiBuffer(TarConstants.VERSION_GNU_ZERO, bArr, TarConstants.VERSION_OFFSET, 2))) {
            return ArchiveUtils.matchAsciiBuffer("ustar\u0000", bArr, 257, 6) && ArchiveUtils.matchAsciiBuffer(TarConstants.VERSION_ANT, bArr, TarConstants.VERSION_OFFSET, 2);
        }
        return true;
    }

    private void paxHeaders() throws IOException {
        Map<String, String> parsePaxHeaders = parsePaxHeaders(this);
        getNextEntry();
        applyPaxHeadersToCurrentEntry(parsePaxHeaders);
    }

    private void readGNUSparse() throws IOException {
        byte[] record;
        if (this.currEntry.isExtended()) {
            do {
                record = getRecord();
                if (record == null) {
                    this.currEntry = null;
                    return;
                }
            } while (new TarArchiveSparseEntry(record).isExtended());
        }
    }

    private void skipRecordPadding() throws IOException {
        long j = this.entrySize;
        if (j > 0) {
            int i = this.recordSize;
            if (j % ((long) i) != 0) {
                count(IOUtils.skip(this.f38868is, (((j / ((long) i)) + 1) * ((long) i)) - j));
            }
        }
    }

    private void tryToConsumeSecondEOFRecord() throws IOException {
        boolean markSupported = this.f38868is.markSupported();
        if (markSupported) {
            this.f38868is.mark(this.recordSize);
        }
        try {
            if ((!isEOFRecord(readRecord())) && markSupported) {
            }
        } finally {
            if (markSupported) {
                pushedBackBytes((long) this.recordSize);
                this.f38868is.reset();
            }
        }
    }

    public int available() throws IOException {
        long j = this.entrySize;
        long j2 = this.entryOffset;
        if (j - j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) (j - j2);
    }

    public boolean canReadEntryData(ArchiveEntry archiveEntry) {
        if (archiveEntry instanceof TarArchiveEntry) {
            return !((TarArchiveEntry) archiveEntry).isGNUSparse();
        }
        return false;
    }

    public void close() throws IOException {
        this.f38868is.close();
    }

    public TarArchiveEntry getCurrentEntry() {
        return this.currEntry;
    }

    public byte[] getLongNameData() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = read(this.SMALL_BUF);
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(this.SMALL_BUF, 0, read);
        }
        getNextEntry();
        if (this.currEntry == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        if (length == byteArray.length) {
            return byteArray;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 0, bArr, 0, length);
        return bArr;
    }

    public ArchiveEntry getNextEntry() throws IOException {
        return getNextTarEntry();
    }

    public TarArchiveEntry getNextTarEntry() throws IOException {
        if (this.hasHitEOF) {
            return null;
        }
        if (this.currEntry != null) {
            IOUtils.skip(this, Long.MAX_VALUE);
            skipRecordPadding();
        }
        byte[] record = getRecord();
        if (record == null) {
            this.currEntry = null;
            return null;
        }
        try {
            TarArchiveEntry tarArchiveEntry = new TarArchiveEntry(record, this.zipEncoding);
            this.currEntry = tarArchiveEntry;
            this.entryOffset = 0;
            this.entrySize = tarArchiveEntry.getSize();
            if (this.currEntry.isGNULongLinkEntry()) {
                byte[] longNameData = getLongNameData();
                if (longNameData == null) {
                    return null;
                }
                this.currEntry.setLinkName(this.zipEncoding.decode(longNameData));
            }
            if (this.currEntry.isGNULongNameEntry()) {
                byte[] longNameData2 = getLongNameData();
                if (longNameData2 == null) {
                    return null;
                }
                this.currEntry.setName(this.zipEncoding.decode(longNameData2));
            }
            if (this.currEntry.isPaxHeader()) {
                paxHeaders();
            }
            if (this.currEntry.isGNUSparse()) {
                readGNUSparse();
            }
            this.entrySize = this.currEntry.getSize();
            return this.currEntry;
        } catch (IllegalArgumentException e) {
            IOException iOException = new IOException("Error detected parsing the header");
            iOException.initCause(e);
            throw iOException;
        }
    }

    public int getRecordSize() {
        return this.recordSize;
    }

    public final boolean isAtEOF() {
        return this.hasHitEOF;
    }

    public boolean isEOFRecord(byte[] bArr) {
        return bArr == null || ArchiveUtils.isArrayZero(bArr, this.recordSize);
    }

    public void mark(int i) {
    }

    public boolean markSupported() {
        return false;
    }

    public Map<String, String> parsePaxHeaders(InputStream inputStream) throws IOException {
        int read;
        int read2;
        HashMap hashMap = new HashMap();
        do {
            int i = 0;
            int i2 = 0;
            while (true) {
                read = inputStream.read();
                if (read == -1) {
                    break;
                }
                i++;
                if (read == 32) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        read2 = inputStream.read();
                        if (read2 == -1) {
                            break;
                        }
                        i++;
                        if (read2 == 61) {
                            String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                            int i3 = i2 - i;
                            byte[] bArr = new byte[i3];
                            int readFully = IOUtils.readFully(inputStream, bArr);
                            if (readFully == i3) {
                                hashMap.put(byteArrayOutputStream2, new String(bArr, 0, i3 - 1, "UTF-8"));
                            } else {
                                throw new IOException("Failed to read Paxheader. Expected " + i3 + " bytes, read " + readFully);
                            }
                        } else {
                            byteArrayOutputStream.write((byte) read2);
                        }
                    }
                    read = read2;
                    continue;
                } else {
                    i2 = (i2 * 10) + (read - 48);
                }
            }
        } while (read != -1);
        return hashMap;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.hasHitEOF || this.entryOffset >= this.entrySize) {
            return -1;
        }
        if (this.currEntry != null) {
            int min = Math.min(i2, available());
            int read = this.f38868is.read(bArr, i, min);
            if (read != -1) {
                count(read);
                this.entryOffset += (long) read;
            } else if (min <= 0) {
                this.hasHitEOF = true;
            } else {
                throw new IOException("Truncated TAR archive");
            }
            return read;
        }
        throw new IllegalStateException("No current tar entry");
    }

    public byte[] readRecord() throws IOException {
        byte[] bArr = new byte[this.recordSize];
        int readFully = IOUtils.readFully(this.f38868is, bArr);
        count(readFully);
        if (readFully != this.recordSize) {
            return null;
        }
        return bArr;
    }

    public synchronized void reset() {
    }

    public final void setAtEOF(boolean z) {
        this.hasHitEOF = z;
    }

    public final void setCurrentEntry(TarArchiveEntry tarArchiveEntry) {
        this.currEntry = tarArchiveEntry;
    }

    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        long skip = this.f38868is.skip(Math.min(j, this.entrySize - this.entryOffset));
        count(skip);
        this.entryOffset += skip;
        return skip;
    }
}

package org.apache.commons.compress.archivers.sevenz;

import com.onedelhi.secure.m10;
import com.onedelhi.secure.pl2;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.BoundedInputStream;
import org.apache.commons.compress.utils.CRC32VerifyingInputStream;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.compress.utils.IOUtils;

public class SevenZFile implements Closeable {
    public static final int SIGNATURE_HEADER_SIZE = 32;
    public static final byte[] sevenZSignature = {TarConstants.LF_CONTIG, 122, -68, -81, 39, m10.C2800f.f15783a};
    private final Archive archive;
    private int currentEntryIndex;
    private InputStream currentEntryInputStream;
    private int currentFolderIndex;
    private InputStream currentFolderInputStream;
    private RandomAccessFile file;
    private final String fileName;
    private byte[] password;

    public SevenZFile(File file2) throws IOException {
        this(file2, (byte[]) null);
    }

    public SevenZFile(File file2, byte[] bArr) throws IOException {
        this.currentEntryIndex = -1;
        this.currentFolderIndex = -1;
        this.currentFolderInputStream = null;
        this.currentEntryInputStream = null;
        this.file = new RandomAccessFile(file2, "r");
        this.fileName = file2.getAbsolutePath();
        try {
            this.archive = readHeaders(bArr);
            if (bArr != null) {
                byte[] bArr2 = new byte[bArr.length];
                this.password = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                return;
            }
            this.password = null;
        } catch (Throwable th) {
            this.file.close();
            throw th;
        }
    }

    private InputStream buildDecoderStack(Folder folder, long j, int i, SevenZArchiveEntry sevenZArchiveEntry) throws IOException {
        this.file.seek(j);
        BoundedRandomAccessFileInputStream boundedRandomAccessFileInputStream = new BoundedRandomAccessFileInputStream(this.file, this.archive.packSizes[i]);
        LinkedList linkedList = new LinkedList();
        InputStream inputStream = boundedRandomAccessFileInputStream;
        for (Coder next : folder.getOrderedCoders()) {
            if (next.numInStreams == 1 && next.numOutStreams == 1) {
                SevenZMethod byId = SevenZMethod.byId(next.decompressionMethodId);
                inputStream = Coders.addDecoder(this.fileName, inputStream, folder.getUnpackSizeForCoder(next), next, this.password);
                linkedList.addFirst(new SevenZMethodConfiguration(byId, Coders.findByMethod(byId).getOptionsFromCoder(next, inputStream)));
            } else {
                throw new IOException("Multi input/output stream coders are not yet supported");
            }
        }
        sevenZArchiveEntry.setContentMethods(linkedList);
        return folder.hasCrc ? new CRC32VerifyingInputStream(inputStream, folder.getUnpackSize(), folder.crc) : inputStream;
    }

    private void buildDecodingStream() throws IOException {
        Archive archive2 = this.archive;
        int[] iArr = archive2.streamMap.fileFolderIndex;
        int i = this.currentEntryIndex;
        int i2 = iArr[i];
        if (i2 < 0) {
            this.currentEntryInputStream = new BoundedInputStream(new ByteArrayInputStream(new byte[0]), 0);
            return;
        }
        SevenZArchiveEntry sevenZArchiveEntry = archive2.files[i];
        if (this.currentFolderIndex == i2) {
            drainPreviousEntry();
            sevenZArchiveEntry.setContentMethods(this.archive.files[this.currentEntryIndex - 1].getContentMethods());
        } else {
            this.currentFolderIndex = i2;
            InputStream inputStream = this.currentFolderInputStream;
            if (inputStream != null) {
                inputStream.close();
                this.currentFolderInputStream = null;
            }
            Archive archive3 = this.archive;
            Folder folder = archive3.folders[i2];
            StreamMap streamMap = archive3.streamMap;
            int i3 = streamMap.folderFirstPackStreamIndex[i2];
            long j = streamMap.packStreamOffsets[i3];
            this.currentFolderInputStream = buildDecoderStack(folder, j + archive3.packPos + 32, i3, sevenZArchiveEntry);
        }
        BoundedInputStream boundedInputStream = new BoundedInputStream(this.currentFolderInputStream, sevenZArchiveEntry.getSize());
        if (sevenZArchiveEntry.getHasCrc()) {
            this.currentEntryInputStream = new CRC32VerifyingInputStream((InputStream) boundedInputStream, sevenZArchiveEntry.getSize(), sevenZArchiveEntry.getCrcValue());
        } else {
            this.currentEntryInputStream = boundedInputStream;
        }
    }

    private void calculateStreamMap(Archive archive2) throws IOException {
        Folder[] folderArr;
        StreamMap streamMap = new StreamMap();
        Folder[] folderArr2 = archive2.folders;
        int length = folderArr2 != null ? folderArr2.length : 0;
        streamMap.folderFirstPackStreamIndex = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            streamMap.folderFirstPackStreamIndex[i2] = i;
            i += archive2.folders[i2].packedStreams.length;
        }
        long j = 0;
        long[] jArr = archive2.packSizes;
        int length2 = jArr != null ? jArr.length : 0;
        streamMap.packStreamOffsets = new long[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            streamMap.packStreamOffsets[i3] = j;
            j += archive2.packSizes[i3];
        }
        streamMap.folderFirstFileIndex = new int[length];
        streamMap.fileFolderIndex = new int[archive2.files.length];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            SevenZArchiveEntry[] sevenZArchiveEntryArr = archive2.files;
            if (i4 < sevenZArchiveEntryArr.length) {
                if (sevenZArchiveEntryArr[i4].hasStream() || i5 != 0) {
                    if (i5 == 0) {
                        while (true) {
                            folderArr = archive2.folders;
                            if (i6 >= folderArr.length) {
                                break;
                            }
                            streamMap.folderFirstFileIndex[i6] = i4;
                            if (folderArr[i6].numUnpackSubStreams > 0) {
                                break;
                            }
                            i6++;
                        }
                        if (i6 >= folderArr.length) {
                            throw new IOException("Too few folders in archive");
                        }
                    }
                    streamMap.fileFolderIndex[i4] = i6;
                    if (archive2.files[i4].hasStream() && (i5 = i5 + 1) >= archive2.folders[i6].numUnpackSubStreams) {
                        i6++;
                        i5 = 0;
                    }
                } else {
                    streamMap.fileFolderIndex[i4] = -1;
                }
                i4++;
            } else {
                archive2.streamMap = streamMap;
                return;
            }
        }
    }

    private void drainPreviousEntry() throws IOException {
        InputStream inputStream = this.currentEntryInputStream;
        if (inputStream != null) {
            IOUtils.skip(inputStream, Long.MAX_VALUE);
            this.currentEntryInputStream.close();
            this.currentEntryInputStream = null;
        }
    }

    public static boolean matches(byte[] bArr, int i) {
        if (i < sevenZSignature.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = sevenZSignature;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private BitSet readAllOrBits(DataInput dataInput, int i) throws IOException {
        if (dataInput.readUnsignedByte() == 0) {
            return readBits(dataInput, i);
        }
        BitSet bitSet = new BitSet(i);
        for (int i2 = 0; i2 < i; i2++) {
            bitSet.set(i2, true);
        }
        return bitSet;
    }

    private void readArchiveProperties(DataInput dataInput) throws IOException {
        while (dataInput.readUnsignedByte() != 0) {
            dataInput.readFully(new byte[((int) readUint64(dataInput))]);
        }
    }

    private BitSet readBits(DataInput dataInput, int i) throws IOException {
        BitSet bitSet = new BitSet(i);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 == 0) {
                i2 = 128;
                i3 = dataInput.readUnsignedByte();
            }
            bitSet.set(i4, (i3 & i2) != 0);
            i2 >>>= 1;
        }
        return bitSet;
    }

    /* JADX INFO: finally extract failed */
    private DataInputStream readEncodedHeader(DataInputStream dataInputStream, Archive archive2, byte[] bArr) throws IOException {
        readStreamsInfo(dataInputStream, archive2);
        Folder folder = archive2.folders[0];
        this.file.seek(archive2.packPos + 32 + 0);
        BoundedRandomAccessFileInputStream boundedRandomAccessFileInputStream = new BoundedRandomAccessFileInputStream(this.file, archive2.packSizes[0]);
        CRC32VerifyingInputStream cRC32VerifyingInputStream = boundedRandomAccessFileInputStream;
        for (Coder next : folder.getOrderedCoders()) {
            if (next.numInStreams == 1 && next.numOutStreams == 1) {
                cRC32VerifyingInputStream = Coders.addDecoder(this.fileName, cRC32VerifyingInputStream, folder.getUnpackSizeForCoder(next), next, bArr);
            } else {
                throw new IOException("Multi input/output stream coders are not yet supported");
            }
        }
        if (folder.hasCrc) {
            cRC32VerifyingInputStream = new CRC32VerifyingInputStream(cRC32VerifyingInputStream, folder.getUnpackSize(), folder.crc);
        }
        byte[] bArr2 = new byte[((int) folder.getUnpackSize())];
        DataInputStream dataInputStream2 = new DataInputStream(cRC32VerifyingInputStream);
        try {
            dataInputStream2.readFully(bArr2);
            dataInputStream2.close();
            return new DataInputStream(new ByteArrayInputStream(bArr2));
        } catch (Throwable th) {
            dataInputStream2.close();
            throw th;
        }
    }

    private void readFilesInfo(DataInput dataInput, Archive archive2) throws IOException {
        DataInput dataInput2 = dataInput;
        Archive archive3 = archive2;
        int readUint64 = (int) readUint64(dataInput);
        SevenZArchiveEntry[] sevenZArchiveEntryArr = new SevenZArchiveEntry[readUint64];
        boolean z = false;
        for (int i = 0; i < readUint64; i++) {
            sevenZArchiveEntryArr[i] = new SevenZArchiveEntry();
        }
        BitSet bitSet = null;
        BitSet bitSet2 = null;
        BitSet bitSet3 = null;
        while (true) {
            int readUnsignedByte = dataInput.readUnsignedByte();
            if (readUnsignedByte == 0) {
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < readUint64; i4++) {
                    boolean z2 = true;
                    sevenZArchiveEntryArr[i4].setHasStream(bitSet == null || !bitSet.get(i4));
                    if (sevenZArchiveEntryArr[i4].hasStream()) {
                        sevenZArchiveEntryArr[i4].setDirectory(z);
                        sevenZArchiveEntryArr[i4].setAntiItem(z);
                        sevenZArchiveEntryArr[i4].setHasCrc(archive3.subStreamsInfo.hasCrc.get(i2));
                        sevenZArchiveEntryArr[i4].setCrcValue(archive3.subStreamsInfo.crcs[i2]);
                        sevenZArchiveEntryArr[i4].setSize(archive3.subStreamsInfo.unpackSizes[i2]);
                        i2++;
                    } else {
                        SevenZArchiveEntry sevenZArchiveEntry = sevenZArchiveEntryArr[i4];
                        if (bitSet2 != null && bitSet2.get(i3)) {
                            z2 = false;
                        }
                        sevenZArchiveEntry.setDirectory(z2);
                        sevenZArchiveEntryArr[i4].setAntiItem(bitSet3 == null ? false : bitSet3.get(i3));
                        sevenZArchiveEntryArr[i4].setHasCrc(z);
                        sevenZArchiveEntryArr[i4].setSize(0);
                        i3++;
                    }
                }
                archive3.files = sevenZArchiveEntryArr;
                calculateStreamMap(archive3);
                return;
            }
            long readUint642 = readUint64(dataInput);
            switch (readUnsignedByte) {
                case 14:
                    bitSet = readBits(dataInput2, readUint64);
                    break;
                case 15:
                    if (bitSet != null) {
                        bitSet2 = readBits(dataInput2, bitSet.cardinality());
                        break;
                    } else {
                        throw new IOException("Header format error: kEmptyStream must appear before kEmptyFile");
                    }
                case 16:
                    if (bitSet != null) {
                        bitSet3 = readBits(dataInput2, bitSet.cardinality());
                        break;
                    } else {
                        throw new IOException("Header format error: kEmptyStream must appear before kAnti");
                    }
                case 17:
                    if (dataInput.readUnsignedByte() == 0) {
                        long j = readUint642 - 1;
                        if ((1 & j) == 0) {
                            int i5 = (int) j;
                            byte[] bArr = new byte[i5];
                            dataInput2.readFully(bArr);
                            int i6 = 0;
                            int i7 = 0;
                            int i8 = 0;
                            while (i6 < i5) {
                                if (bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                                    sevenZArchiveEntryArr[i8].setName(new String(bArr, i7, i6 - i7, CharsetNames.UTF_16LE));
                                    i7 = i6 + 2;
                                    i8++;
                                }
                                i6 += 2;
                                Archive archive4 = archive2;
                            }
                            if (i7 != i5 || i8 != readUint64) {
                                break;
                            } else {
                                break;
                            }
                        } else {
                            throw new IOException("File names length invalid");
                        }
                    } else {
                        throw new IOException("Not implemented");
                    }
                    break;
                case 18:
                    BitSet readAllOrBits = readAllOrBits(dataInput2, readUint64);
                    if (dataInput.readUnsignedByte() == 0) {
                        for (int i9 = 0; i9 < readUint64; i9++) {
                            sevenZArchiveEntryArr[i9].setHasCreationDate(readAllOrBits.get(i9));
                            if (sevenZArchiveEntryArr[i9].getHasCreationDate()) {
                                sevenZArchiveEntryArr[i9].setCreationDate(Long.reverseBytes(dataInput.readLong()));
                            }
                        }
                        break;
                    } else {
                        throw new IOException("Unimplemented");
                    }
                case 19:
                    BitSet readAllOrBits2 = readAllOrBits(dataInput2, readUint64);
                    if (dataInput.readUnsignedByte() == 0) {
                        for (int i10 = 0; i10 < readUint64; i10++) {
                            sevenZArchiveEntryArr[i10].setHasAccessDate(readAllOrBits2.get(i10));
                            if (sevenZArchiveEntryArr[i10].getHasAccessDate()) {
                                sevenZArchiveEntryArr[i10].setAccessDate(Long.reverseBytes(dataInput.readLong()));
                            }
                        }
                        break;
                    } else {
                        throw new IOException("Unimplemented");
                    }
                case 20:
                    BitSet readAllOrBits3 = readAllOrBits(dataInput2, readUint64);
                    if (dataInput.readUnsignedByte() == 0) {
                        for (int i11 = 0; i11 < readUint64; i11++) {
                            sevenZArchiveEntryArr[i11].setHasLastModifiedDate(readAllOrBits3.get(i11));
                            if (sevenZArchiveEntryArr[i11].getHasLastModifiedDate()) {
                                sevenZArchiveEntryArr[i11].setLastModifiedDate(Long.reverseBytes(dataInput.readLong()));
                            }
                        }
                        break;
                    } else {
                        throw new IOException("Unimplemented");
                    }
                case 21:
                    BitSet readAllOrBits4 = readAllOrBits(dataInput2, readUint64);
                    if (dataInput.readUnsignedByte() == 0) {
                        for (int i12 = 0; i12 < readUint64; i12++) {
                            sevenZArchiveEntryArr[i12].setHasWindowsAttributes(readAllOrBits4.get(i12));
                            if (sevenZArchiveEntryArr[i12].getHasWindowsAttributes()) {
                                sevenZArchiveEntryArr[i12].setWindowsAttributes(Integer.reverseBytes(dataInput.readInt()));
                            }
                        }
                        break;
                    } else {
                        throw new IOException("Unimplemented");
                    }
                case 24:
                    throw new IOException("kStartPos is unsupported, please report");
                case 25:
                    if (skipBytesFully(dataInput2, readUint642) >= readUint642) {
                        break;
                    } else {
                        throw new IOException("Incomplete kDummy property");
                    }
                default:
                    if (skipBytesFully(dataInput2, readUint642) >= readUint642) {
                        break;
                    } else {
                        throw new IOException("Incomplete property of type " + readUnsignedByte);
                    }
            }
            archive3 = archive2;
            z = false;
        }
        throw new IOException("Error parsing file names");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.apache.commons.compress.archivers.sevenz.Folder readFolder(java.io.DataInput r20) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r20
            org.apache.commons.compress.archivers.sevenz.Folder r1 = new org.apache.commons.compress.archivers.sevenz.Folder
            r1.<init>()
            long r2 = readUint64(r20)
            int r3 = (int) r2
            org.apache.commons.compress.archivers.sevenz.Coder[] r2 = new org.apache.commons.compress.archivers.sevenz.Coder[r3]
            r4 = 0
            r6 = 0
            r8 = r4
            r10 = r8
            r7 = 0
        L_0x0014:
            r12 = 1
            if (r7 >= r3) goto L_0x0093
            org.apache.commons.compress.archivers.sevenz.Coder r14 = new org.apache.commons.compress.archivers.sevenz.Coder
            r14.<init>()
            r2[r7] = r14
            int r14 = r20.readUnsignedByte()
            r15 = r14 & 15
            r16 = r14 & 16
            r17 = 1
            if (r16 != 0) goto L_0x002e
            r16 = 1
            goto L_0x0030
        L_0x002e:
            r16 = 0
        L_0x0030:
            r18 = r14 & 32
            if (r18 == 0) goto L_0x0037
            r18 = 1
            goto L_0x0039
        L_0x0037:
            r18 = 0
        L_0x0039:
            r14 = r14 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r17 = 0
        L_0x0040:
            r14 = r2[r7]
            byte[] r15 = new byte[r15]
            r14.decompressionMethodId = r15
            r14 = r2[r7]
            byte[] r14 = r14.decompressionMethodId
            r0.readFully(r14)
            if (r16 == 0) goto L_0x0058
            r14 = r2[r7]
            r14.numInStreams = r12
            r14 = r2[r7]
            r14.numOutStreams = r12
            goto L_0x0068
        L_0x0058:
            r12 = r2[r7]
            long r13 = readUint64(r20)
            r12.numInStreams = r13
            r12 = r2[r7]
            long r13 = readUint64(r20)
            r12.numOutStreams = r13
        L_0x0068:
            r12 = r2[r7]
            long r12 = r12.numInStreams
            long r8 = r8 + r12
            r12 = r2[r7]
            long r12 = r12.numOutStreams
            long r10 = r10 + r12
            if (r18 == 0) goto L_0x0086
            long r12 = readUint64(r20)
            r14 = r2[r7]
            int r13 = (int) r12
            byte[] r12 = new byte[r13]
            r14.properties = r12
            r12 = r2[r7]
            byte[] r12 = r12.properties
            r0.readFully(r12)
        L_0x0086:
            if (r17 != 0) goto L_0x008b
            int r7 = r7 + 1
            goto L_0x0014
        L_0x008b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Alternative methods are unsupported, please report. The reference implementation doesn't support them either."
            r0.<init>(r1)
            throw r0
        L_0x0093:
            r1.coders = r2
            r1.totalInputStreams = r8
            r1.totalOutputStreams = r10
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00ff
            long r10 = r10 - r12
            int r2 = (int) r10
            org.apache.commons.compress.archivers.sevenz.BindPair[] r3 = new org.apache.commons.compress.archivers.sevenz.BindPair[r2]
            r4 = 0
        L_0x00a2:
            if (r4 >= r2) goto L_0x00be
            org.apache.commons.compress.archivers.sevenz.BindPair r5 = new org.apache.commons.compress.archivers.sevenz.BindPair
            r5.<init>()
            r3[r4] = r5
            r5 = r3[r4]
            long r14 = readUint64(r20)
            r5.inIndex = r14
            r5 = r3[r4]
            long r14 = readUint64(r20)
            r5.outIndex = r14
            int r4 = r4 + 1
            goto L_0x00a2
        L_0x00be:
            r1.bindPairs = r3
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x00f7
            long r2 = r8 - r10
            int r4 = (int) r2
            long[] r5 = new long[r4]
            int r7 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x00e9
            r0 = 0
        L_0x00ce:
            int r2 = (int) r8
            if (r0 >= r2) goto L_0x00db
            int r3 = r1.findBindPairForInStream(r0)
            if (r3 >= 0) goto L_0x00d8
            goto L_0x00db
        L_0x00d8:
            int r0 = r0 + 1
            goto L_0x00ce
        L_0x00db:
            if (r0 == r2) goto L_0x00e1
            long r2 = (long) r0
            r5[r6] = r2
            goto L_0x00f4
        L_0x00e1:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Couldn't find stream's bind pair index"
            r0.<init>(r1)
            throw r0
        L_0x00e9:
            if (r6 >= r4) goto L_0x00f4
            long r2 = readUint64(r20)
            r5[r6] = r2
            int r6 = r6 + 1
            goto L_0x00e9
        L_0x00f4:
            r1.packedStreams = r5
            return r1
        L_0x00f7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Total input streams can't be less than the number of bind pairs"
            r0.<init>(r1)
            throw r0
        L_0x00ff:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Total output streams can't be 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.sevenz.SevenZFile.readFolder(java.io.DataInput):org.apache.commons.compress.archivers.sevenz.Folder");
    }

    private void readHeader(DataInput dataInput, Archive archive2) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 2) {
            readArchiveProperties(dataInput);
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        if (readUnsignedByte != 3) {
            if (readUnsignedByte == 4) {
                readStreamsInfo(dataInput, archive2);
                readUnsignedByte = dataInput.readUnsignedByte();
            }
            if (readUnsignedByte == 5) {
                readFilesInfo(dataInput, archive2);
                readUnsignedByte = dataInput.readUnsignedByte();
            }
            if (readUnsignedByte != 0) {
                throw new IOException("Badly terminated header, found " + readUnsignedByte);
            }
            return;
        }
        throw new IOException("Additional streams unsupported");
    }

    private Archive readHeaders(byte[] bArr) throws IOException {
        byte[] bArr2 = new byte[6];
        this.file.readFully(bArr2);
        if (Arrays.equals(bArr2, sevenZSignature)) {
            byte readByte = this.file.readByte();
            byte readByte2 = this.file.readByte();
            if (readByte == 0) {
                StartHeader readStartHeader = readStartHeader(ZipConstants.ZIP64_MAGIC & ((long) Integer.reverseBytes(this.file.readInt())));
                long j = readStartHeader.nextHeaderSize;
                int i = (int) j;
                if (((long) i) == j) {
                    this.file.seek(readStartHeader.nextHeaderOffset + 32);
                    byte[] bArr3 = new byte[i];
                    this.file.readFully(bArr3);
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr3);
                    if (readStartHeader.nextHeaderCrc == crc32.getValue()) {
                        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr3));
                        Archive archive2 = new Archive();
                        int readUnsignedByte = dataInputStream.readUnsignedByte();
                        if (readUnsignedByte == 23) {
                            dataInputStream = readEncodedHeader(dataInputStream, archive2, bArr);
                            archive2 = new Archive();
                            readUnsignedByte = dataInputStream.readUnsignedByte();
                        }
                        if (readUnsignedByte == 1) {
                            readHeader(dataInputStream, archive2);
                            dataInputStream.close();
                            return archive2;
                        }
                        throw new IOException("Broken or unsupported archive: no Header");
                    }
                    throw new IOException("NextHeader CRC mismatch");
                }
                throw new IOException("cannot handle nextHeaderSize " + readStartHeader.nextHeaderSize);
            }
            throw new IOException(String.format("Unsupported 7z version (%d,%d)", new Object[]{Byte.valueOf(readByte), Byte.valueOf(readByte2)}));
        }
        throw new IOException("Bad 7z signature");
    }

    private void readPackInfo(DataInput dataInput, Archive archive2) throws IOException {
        archive2.packPos = readUint64(dataInput);
        long readUint64 = readUint64(dataInput);
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 9) {
            archive2.packSizes = new long[((int) readUint64)];
            int i = 0;
            while (true) {
                long[] jArr = archive2.packSizes;
                if (i >= jArr.length) {
                    break;
                }
                jArr[i] = readUint64(dataInput);
                i++;
            }
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        if (readUnsignedByte == 10) {
            int i2 = (int) readUint64;
            archive2.packCrcsDefined = readAllOrBits(dataInput, i2);
            archive2.packCrcs = new long[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                if (archive2.packCrcsDefined.get(i3)) {
                    archive2.packCrcs[i3] = ZipConstants.ZIP64_MAGIC & ((long) Integer.reverseBytes(dataInput.readInt()));
                }
            }
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        if (readUnsignedByte != 0) {
            throw new IOException("Badly terminated PackInfo (" + readUnsignedByte + pl2.f33727d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.apache.commons.compress.archivers.sevenz.StartHeader readStartHeader(long r11) throws java.io.IOException {
        /*
            r10 = this;
            org.apache.commons.compress.archivers.sevenz.StartHeader r0 = new org.apache.commons.compress.archivers.sevenz.StartHeader
            r0.<init>()
            r1 = 0
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ all -> 0x0049 }
            org.apache.commons.compress.utils.CRC32VerifyingInputStream r9 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream     // Catch:{ all -> 0x0049 }
            org.apache.commons.compress.archivers.sevenz.BoundedRandomAccessFileInputStream r4 = new org.apache.commons.compress.archivers.sevenz.BoundedRandomAccessFileInputStream     // Catch:{ all -> 0x0049 }
            java.io.RandomAccessFile r3 = r10.file     // Catch:{ all -> 0x0049 }
            r5 = 20
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0049 }
            r5 = 20
            r3 = r9
            r7 = r11
            r3.<init>((java.io.InputStream) r4, (long) r5, (long) r7)     // Catch:{ all -> 0x0049 }
            r2.<init>(r9)     // Catch:{ all -> 0x0049 }
            long r11 = r2.readLong()     // Catch:{ all -> 0x0046 }
            long r11 = java.lang.Long.reverseBytes(r11)     // Catch:{ all -> 0x0046 }
            r0.nextHeaderOffset = r11     // Catch:{ all -> 0x0046 }
            long r11 = r2.readLong()     // Catch:{ all -> 0x0046 }
            long r11 = java.lang.Long.reverseBytes(r11)     // Catch:{ all -> 0x0046 }
            r0.nextHeaderSize = r11     // Catch:{ all -> 0x0046 }
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r1 = r2.readInt()     // Catch:{ all -> 0x0046 }
            int r1 = java.lang.Integer.reverseBytes(r1)     // Catch:{ all -> 0x0046 }
            long r3 = (long) r1     // Catch:{ all -> 0x0046 }
            long r11 = r11 & r3
            r0.nextHeaderCrc = r11     // Catch:{ all -> 0x0046 }
            r2.close()
            return r0
        L_0x0046:
            r11 = move-exception
            r1 = r2
            goto L_0x004a
        L_0x0049:
            r11 = move-exception
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.close()
        L_0x004f:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.sevenz.SevenZFile.readStartHeader(long):org.apache.commons.compress.archivers.sevenz.StartHeader");
    }

    private void readStreamsInfo(DataInput dataInput, Archive archive2) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 6) {
            readPackInfo(dataInput, archive2);
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        if (readUnsignedByte == 7) {
            readUnpackInfo(dataInput, archive2);
            readUnsignedByte = dataInput.readUnsignedByte();
        } else {
            archive2.folders = new Folder[0];
        }
        if (readUnsignedByte == 8) {
            readSubStreamsInfo(dataInput, archive2);
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        if (readUnsignedByte != 0) {
            throw new IOException("Badly terminated StreamsInfo");
        }
    }

    private void readSubStreamsInfo(DataInput dataInput, Archive archive2) throws IOException {
        boolean z;
        Archive archive3 = archive2;
        Folder[] folderArr = archive3.folders;
        int length = folderArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            folderArr[i].numUnpackSubStreams = 1;
            i++;
        }
        int length2 = archive3.folders.length;
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 13) {
            int i2 = 0;
            for (Folder folder : archive3.folders) {
                long readUint64 = readUint64(dataInput);
                folder.numUnpackSubStreams = (int) readUint64;
                i2 = (int) (((long) i2) + readUint64);
            }
            readUnsignedByte = dataInput.readUnsignedByte();
            length2 = i2;
        }
        SubStreamsInfo subStreamsInfo = new SubStreamsInfo();
        subStreamsInfo.unpackSizes = new long[length2];
        subStreamsInfo.hasCrc = new BitSet(length2);
        subStreamsInfo.crcs = new long[length2];
        int i3 = 0;
        for (Folder folder2 : archive3.folders) {
            if (folder2.numUnpackSubStreams != 0) {
                long j = 0;
                if (readUnsignedByte == 9) {
                    int i4 = 0;
                    while (i4 < folder2.numUnpackSubStreams - 1) {
                        long readUint642 = readUint64(dataInput);
                        subStreamsInfo.unpackSizes[i3] = readUint642;
                        j += readUint642;
                        i4++;
                        i3++;
                    }
                }
                subStreamsInfo.unpackSizes[i3] = folder2.getUnpackSize() - j;
                i3++;
            }
        }
        if (readUnsignedByte == 9) {
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        int i5 = 0;
        for (Folder folder3 : archive3.folders) {
            int i6 = folder3.numUnpackSubStreams;
            if (i6 != 1 || !folder3.hasCrc) {
                i5 += i6;
            }
        }
        if (readUnsignedByte == 10) {
            BitSet readAllOrBits = readAllOrBits(dataInput, i5);
            long[] jArr = new long[i5];
            for (int i7 = 0; i7 < i5; i7++) {
                if (readAllOrBits.get(i7)) {
                    jArr[i7] = ZipConstants.ZIP64_MAGIC & ((long) Integer.reverseBytes(dataInput.readInt()));
                }
            }
            Folder[] folderArr2 = archive3.folders;
            int length3 = folderArr2.length;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < length3) {
                Folder folder4 = folderArr2[i8];
                if (folder4.numUnpackSubStreams != z || !folder4.hasCrc) {
                    for (int i11 = 0; i11 < folder4.numUnpackSubStreams; i11++) {
                        subStreamsInfo.hasCrc.set(i9, readAllOrBits.get(i10));
                        subStreamsInfo.crcs[i9] = jArr[i10];
                        i9++;
                        i10++;
                    }
                } else {
                    subStreamsInfo.hasCrc.set(i9, z);
                    subStreamsInfo.crcs[i9] = folder4.crc;
                    i9++;
                }
                i8++;
                DataInput dataInput2 = dataInput;
                z = true;
            }
            readUnsignedByte = dataInput.readUnsignedByte();
        }
        if (readUnsignedByte == 0) {
            archive3.subStreamsInfo = subStreamsInfo;
            return;
        }
        throw new IOException("Badly terminated SubStreamsInfo");
    }

    private static long readUint64(DataInput dataInput) throws IOException {
        long readUnsignedByte = (long) dataInput.readUnsignedByte();
        int i = 128;
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            if ((((long) i) & readUnsignedByte) == 0) {
                return ((readUnsignedByte & ((long) (i - 1))) << (i2 * 8)) | j;
            }
            j |= ((long) dataInput.readUnsignedByte()) << (i2 * 8);
            i >>>= 1;
        }
        return j;
    }

    private void readUnpackInfo(DataInput dataInput, Archive archive2) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 11) {
            int readUint64 = (int) readUint64(dataInput);
            Folder[] folderArr = new Folder[readUint64];
            archive2.folders = folderArr;
            if (dataInput.readUnsignedByte() == 0) {
                for (int i = 0; i < readUint64; i++) {
                    folderArr[i] = readFolder(dataInput);
                }
                int readUnsignedByte2 = dataInput.readUnsignedByte();
                if (readUnsignedByte2 == 12) {
                    for (int i2 = 0; i2 < readUint64; i2++) {
                        Folder folder = folderArr[i2];
                        folder.unpackSizes = new long[((int) folder.totalOutputStreams)];
                        for (int i3 = 0; ((long) i3) < folder.totalOutputStreams; i3++) {
                            folder.unpackSizes[i3] = readUint64(dataInput);
                        }
                    }
                    int readUnsignedByte3 = dataInput.readUnsignedByte();
                    if (readUnsignedByte3 == 10) {
                        BitSet readAllOrBits = readAllOrBits(dataInput, readUint64);
                        for (int i4 = 0; i4 < readUint64; i4++) {
                            if (readAllOrBits.get(i4)) {
                                folderArr[i4].hasCrc = true;
                                folderArr[i4].crc = ZipConstants.ZIP64_MAGIC & ((long) Integer.reverseBytes(dataInput.readInt()));
                            } else {
                                folderArr[i4].hasCrc = false;
                            }
                        }
                        readUnsignedByte3 = dataInput.readUnsignedByte();
                    }
                    if (readUnsignedByte3 != 0) {
                        throw new IOException("Badly terminated UnpackInfo");
                    }
                    return;
                }
                throw new IOException("Expected kCodersUnpackSize, got " + readUnsignedByte2);
            }
            throw new IOException("External unsupported");
        }
        throw new IOException("Expected kFolder, got " + readUnsignedByte);
    }

    private static long skipBytesFully(DataInput dataInput, long j) throws IOException {
        int skipBytes;
        if (j < 1) {
            return 0;
        }
        long j2 = 0;
        while (j > 2147483647L) {
            long skipBytesFully = skipBytesFully(dataInput, 2147483647L);
            if (skipBytesFully == 0) {
                return j2;
            }
            j2 += skipBytesFully;
            j -= skipBytesFully;
        }
        while (j > 0 && (skipBytes = dataInput.skipBytes((int) j)) != 0) {
            long j3 = (long) skipBytes;
            j2 += j3;
            j -= j3;
        }
        return j2;
    }

    public void close() throws IOException {
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } finally {
                this.file = null;
                byte[] bArr = this.password;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                this.password = null;
            }
        }
    }

    public SevenZArchiveEntry getNextEntry() throws IOException {
        int i = this.currentEntryIndex;
        SevenZArchiveEntry[] sevenZArchiveEntryArr = this.archive.files;
        if (i >= sevenZArchiveEntryArr.length - 1) {
            return null;
        }
        int i2 = i + 1;
        this.currentEntryIndex = i2;
        SevenZArchiveEntry sevenZArchiveEntry = sevenZArchiveEntryArr[i2];
        buildDecodingStream();
        return sevenZArchiveEntry;
    }

    public int read() throws IOException {
        InputStream inputStream = this.currentEntryInputStream;
        if (inputStream != null) {
            return inputStream.read();
        }
        throw new IllegalStateException("No current 7z entry");
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream = this.currentEntryInputStream;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        throw new IllegalStateException("No current 7z entry");
    }
}

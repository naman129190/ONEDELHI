package org.apache.commons.compress.compressors.snappy;

import com.onedelhi.secure.pl2;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Arrays;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.utils.BoundedInputStream;
import org.apache.commons.compress.utils.IOUtils;

public class FramedSnappyCompressorInputStream extends CompressorInputStream {
    private static final int COMPRESSED_CHUNK_TYPE = 0;
    public static final long MASK_OFFSET = 2726488792L;
    private static final int MAX_SKIPPABLE_TYPE = 253;
    private static final int MAX_UNSKIPPABLE_TYPE = 127;
    private static final int MIN_UNSKIPPABLE_TYPE = 2;
    private static final int PADDING_CHUNK_TYPE = 254;
    private static final int STREAM_IDENTIFIER_TYPE = 255;
    private static final byte[] SZ_SIGNATURE = {-1, 6, 0, 0, 115, 78, 97, 80, 112, 89};
    private static final int UNCOMPRESSED_CHUNK_TYPE = 1;
    private final PureJavaCrc32C checksum = new PureJavaCrc32C();
    private SnappyCompressorInputStream currentCompressedChunk;
    private boolean endReached;
    private long expectedChecksum = -1;

    /* renamed from: in */
    private final PushbackInputStream f38889in;
    private boolean inUncompressedChunk;
    private final byte[] oneByte = new byte[1];
    private int uncompressedBytesRemaining;

    public FramedSnappyCompressorInputStream(InputStream inputStream) throws IOException {
        this.f38889in = new PushbackInputStream(inputStream, 1);
        readStreamIdentifier();
    }

    public static boolean matches(byte[] bArr, int i) {
        byte[] bArr2 = SZ_SIGNATURE;
        if (i < bArr2.length) {
            return false;
        }
        if (bArr.length > bArr2.length) {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr2.length);
            bArr = bArr3;
        }
        return Arrays.equals(bArr, bArr2);
    }

    private long readCrc() throws IOException {
        byte[] bArr = new byte[4];
        int readFully = IOUtils.readFully(this.f38889in, bArr);
        count(readFully);
        if (readFully == 4) {
            long j = 0;
            for (int i = 0; i < 4; i++) {
                j |= (((long) bArr[i]) & 255) << (i * 8);
            }
            return j;
        }
        throw new IOException("premature end of stream");
    }

    private void readNextBlock() throws IOException {
        verifyLastChecksumAndReset();
        this.inUncompressedChunk = false;
        int readOneByte = readOneByte();
        if (readOneByte == -1) {
            this.endReached = true;
            return;
        }
        if (readOneByte == 255) {
            this.f38889in.unread(readOneByte);
            pushedBackBytes(1);
            readStreamIdentifier();
        } else if (readOneByte == 254 || (readOneByte > 127 && readOneByte <= MAX_SKIPPABLE_TYPE)) {
            skipBlock();
        } else if (readOneByte >= 2 && readOneByte <= 127) {
            throw new IOException("unskippable chunk with type " + readOneByte + " (hex " + Integer.toHexString(readOneByte) + pl2.f33727d + " detected.");
        } else if (readOneByte == 1) {
            this.inUncompressedChunk = true;
            this.uncompressedBytesRemaining = readSize() - 4;
            this.expectedChecksum = unmask(readCrc());
            return;
        } else if (readOneByte == 0) {
            this.expectedChecksum = unmask(readCrc());
            SnappyCompressorInputStream snappyCompressorInputStream = new SnappyCompressorInputStream(new BoundedInputStream(this.f38889in, (long) (readSize() - 4)));
            this.currentCompressedChunk = snappyCompressorInputStream;
            count(snappyCompressorInputStream.getBytesRead());
            return;
        } else {
            throw new IOException("unknown chunk type " + readOneByte + " detected.");
        }
        readNextBlock();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int readOnce(byte[] r5, int r6, int r7) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r4.inUncompressedChunk
            r1 = -1
            if (r0 == 0) goto L_0x001f
            int r0 = r4.uncompressedBytesRemaining
            int r7 = java.lang.Math.min(r0, r7)
            if (r7 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.io.PushbackInputStream r0 = r4.f38889in
            int r7 = r0.read(r5, r6, r7)
            if (r7 == r1) goto L_0x0040
            int r0 = r4.uncompressedBytesRemaining
            int r0 = r0 - r7
            r4.uncompressedBytesRemaining = r0
            r4.count((int) r7)
            goto L_0x0040
        L_0x001f:
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r4.currentCompressedChunk
            if (r0 == 0) goto L_0x0041
            long r2 = r0.getBytesRead()
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r4.currentCompressedChunk
            int r7 = r0.read(r5, r6, r7)
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream r0 = r4.currentCompressedChunk
            if (r7 != r1) goto L_0x0038
            r0.close()
            r0 = 0
            r4.currentCompressedChunk = r0
            goto L_0x0040
        L_0x0038:
            long r0 = r0.getBytesRead()
            long r0 = r0 - r2
            r4.count((long) r0)
        L_0x0040:
            r1 = r7
        L_0x0041:
            if (r1 <= 0) goto L_0x0048
            org.apache.commons.compress.compressors.snappy.PureJavaCrc32C r7 = r4.checksum
            r7.update(r5, r6, r1)
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.readOnce(byte[], int, int):int");
    }

    private int readOneByte() throws IOException {
        int read = this.f38889in.read();
        if (read == -1) {
            return -1;
        }
        count(1);
        return read & 255;
    }

    private int readSize() throws IOException {
        int i = 0;
        int i2 = 0;
        while (i < 3) {
            int readOneByte = readOneByte();
            if (readOneByte != -1) {
                i2 |= readOneByte << (i * 8);
                i++;
            } else {
                throw new IOException("premature end of stream");
            }
        }
        return i2;
    }

    private void readStreamIdentifier() throws IOException {
        byte[] bArr = new byte[10];
        int readFully = IOUtils.readFully(this.f38889in, bArr);
        count(readFully);
        if (10 != readFully || !matches(bArr, 10)) {
            throw new IOException("Not a framed Snappy stream");
        }
    }

    private void skipBlock() throws IOException {
        long readSize = (long) readSize();
        long skip = IOUtils.skip(this.f38889in, readSize);
        count(skip);
        if (skip != readSize) {
            throw new IOException("premature end of stream");
        }
    }

    public static long unmask(long j) {
        long j2 = (j - MASK_OFFSET) & ZipConstants.ZIP64_MAGIC;
        return ((j2 << 15) | (j2 >> 17)) & ZipConstants.ZIP64_MAGIC;
    }

    private void verifyLastChecksumAndReset() throws IOException {
        long j = this.expectedChecksum;
        if (j < 0 || j == this.checksum.getValue()) {
            this.expectedChecksum = -1;
            this.checksum.reset();
            return;
        }
        throw new IOException("Checksum verification failed");
    }

    public int available() throws IOException {
        if (this.inUncompressedChunk) {
            return Math.min(this.uncompressedBytesRemaining, this.f38889in.available());
        }
        SnappyCompressorInputStream snappyCompressorInputStream = this.currentCompressedChunk;
        if (snappyCompressorInputStream != null) {
            return snappyCompressorInputStream.available();
        }
        return 0;
    }

    public void close() throws IOException {
        SnappyCompressorInputStream snappyCompressorInputStream = this.currentCompressedChunk;
        if (snappyCompressorInputStream != null) {
            snappyCompressorInputStream.close();
            this.currentCompressedChunk = null;
        }
        this.f38889in.close();
    }

    public int read() throws IOException {
        if (read(this.oneByte, 0, 1) == -1) {
            return -1;
        }
        return this.oneByte[0] & 255;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int readOnce = readOnce(bArr, i, i2);
        if (readOnce != -1) {
            return readOnce;
        }
        readNextBlock();
        if (this.endReached) {
            return -1;
        }
        return readOnce(bArr, i, i2);
    }
}

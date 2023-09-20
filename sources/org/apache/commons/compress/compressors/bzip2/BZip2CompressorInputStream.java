package org.apache.commons.compress.compressors.bzip2;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import org.apache.commons.compress.compressors.CompressorInputStream;

public class BZip2CompressorInputStream extends CompressorInputStream implements BZip2Constants {
    private static final int EOF = 0;
    private static final int NO_RAND_PART_A_STATE = 5;
    private static final int NO_RAND_PART_B_STATE = 6;
    private static final int NO_RAND_PART_C_STATE = 7;
    private static final int RAND_PART_A_STATE = 2;
    private static final int RAND_PART_B_STATE = 3;
    private static final int RAND_PART_C_STATE = 4;
    private static final int START_BLOCK_STATE = 1;
    private boolean blockRandomised;
    private int blockSize100k;
    private int bsBuff;
    private int bsLive;
    private int computedBlockCRC;
    private int computedCombinedCRC;
    private final CRC crc;
    private int currentState;
    private Data data;
    private final boolean decompressConcatenated;

    /* renamed from: in */
    private InputStream f38882in;
    private int last;
    private int nInUse;
    private int origPtr;
    private int storedBlockCRC;
    private int storedCombinedCRC;
    private int su_ch2;
    private int su_chPrev;
    private int su_count;
    private int su_i2;
    private int su_j2;
    private int su_rNToGo;
    private int su_rTPos;
    private int su_tPos;
    private char su_z;

    public static final class Data {
        public final int[][] base;
        public final int[] cftab;
        public final char[] getAndMoveToFrontDecode_yy;
        public final boolean[] inUse = new boolean[256];
        public final int[][] limit;
        public byte[] ll8;
        public final int[] minLens;
        public final int[][] perm;
        public final byte[] recvDecodingTables_pos;
        public final byte[] selector = new byte[BZip2Constants.MAX_SELECTORS];
        public final byte[] selectorMtf = new byte[BZip2Constants.MAX_SELECTORS];
        public final byte[] seqToUnseq = new byte[256];
        public final char[][] temp_charArray2d;

        /* renamed from: tt */
        public int[] f38883tt;
        public final int[] unzftab = new int[256];

        public Data(int i) {
            Class<int> cls = int.class;
            this.limit = (int[][]) Array.newInstance(cls, new int[]{6, BZip2Constants.MAX_ALPHA_SIZE});
            this.base = (int[][]) Array.newInstance(cls, new int[]{6, BZip2Constants.MAX_ALPHA_SIZE});
            this.perm = (int[][]) Array.newInstance(cls, new int[]{6, BZip2Constants.MAX_ALPHA_SIZE});
            this.minLens = new int[6];
            this.cftab = new int[257];
            this.getAndMoveToFrontDecode_yy = new char[256];
            this.temp_charArray2d = (char[][]) Array.newInstance(char.class, new int[]{6, BZip2Constants.MAX_ALPHA_SIZE});
            this.recvDecodingTables_pos = new byte[6];
            this.ll8 = new byte[(i * BZip2Constants.BASEBLOCKSIZE)];
        }

        public int[] initTT(int i) {
            int[] iArr = this.f38883tt;
            if (iArr != null && iArr.length >= i) {
                return iArr;
            }
            int[] iArr2 = new int[i];
            this.f38883tt = iArr2;
            return iArr2;
        }
    }

    public BZip2CompressorInputStream(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public BZip2CompressorInputStream(InputStream inputStream, boolean z) throws IOException {
        this.crc = new CRC();
        this.currentState = 1;
        this.f38882in = inputStream;
        this.decompressConcatenated = z;
        init(true);
        initBlock();
    }

    private boolean bsGetBit() throws IOException {
        int i = this.bsLive;
        int i2 = this.bsBuff;
        if (i < 1) {
            int read = this.f38882in.read();
            if (read >= 0) {
                i2 = (i2 << 8) | read;
                i += 8;
                this.bsBuff = i2;
            } else {
                throw new IOException("unexpected end of stream");
            }
        }
        int i3 = i - 1;
        this.bsLive = i3;
        return ((i2 >> i3) & 1) != 0;
    }

    private int bsGetInt() throws IOException {
        return bsR(8) | (((((bsR(8) << 8) | bsR(8)) << 8) | bsR(8)) << 8);
    }

    private char bsGetUByte() throws IOException {
        return (char) bsR(8);
    }

    private int bsR(int i) throws IOException {
        int i2 = this.bsLive;
        int i3 = this.bsBuff;
        if (i2 < i) {
            InputStream inputStream = this.f38882in;
            do {
                int read = inputStream.read();
                if (read >= 0) {
                    i3 = (i3 << 8) | read;
                    i2 += 8;
                } else {
                    throw new IOException("unexpected end of stream");
                }
            } while (i2 < i);
            this.bsBuff = i3;
        }
        int i4 = i2 - i;
        this.bsLive = i4;
        return ((1 << i) - 1) & (i3 >> i4);
    }

    private boolean complete() throws IOException {
        int bsGetInt = bsGetInt();
        this.storedCombinedCRC = bsGetInt;
        this.currentState = 0;
        this.data = null;
        if (bsGetInt == this.computedCombinedCRC) {
            return !this.decompressConcatenated || !init(false);
        }
        throw new IOException("BZip2 CRC error");
    }

    private void createHuffmanDecodingTables(int i, int i2) {
        Data data2 = this.data;
        char[][] cArr = data2.temp_charArray2d;
        int[] iArr = data2.minLens;
        int[][] iArr2 = data2.limit;
        int[][] iArr3 = data2.base;
        int[][] iArr4 = data2.perm;
        int i3 = i2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 32;
            char[] cArr2 = cArr[i4];
            int i6 = i;
            char c = 0;
            while (true) {
                i6--;
                if (i6 < 0) {
                    break;
                }
                char c2 = cArr2[i6];
                if (c2 > c) {
                    c = c2;
                }
                if (c2 < i5) {
                    i5 = c2;
                }
            }
            hbCreateDecodeTables(iArr2[i4], iArr3[i4], iArr4[i4], cArr[i4], i5, c, i);
            iArr[i4] = i5;
        }
    }

    private void endBlock() throws IOException {
        int finalCRC = this.crc.getFinalCRC();
        this.computedBlockCRC = finalCRC;
        int i = this.storedBlockCRC;
        if (i == finalCRC) {
            int i2 = this.computedCombinedCRC;
            this.computedCombinedCRC = finalCRC ^ ((i2 >>> 31) | (i2 << 1));
            return;
        }
        int i3 = this.storedCombinedCRC;
        this.computedCombinedCRC = ((i3 >>> 31) | (i3 << 1)) ^ i;
        throw new IOException("BZip2 CRC error");
    }

    private void getAndMoveToFrontDecode() throws IOException {
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        BZip2CompressorInputStream bZip2CompressorInputStream = this;
        bZip2CompressorInputStream.origPtr = bZip2CompressorInputStream.bsR(24);
        recvDecodingTables();
        InputStream inputStream = bZip2CompressorInputStream.f38882in;
        Data data2 = bZip2CompressorInputStream.data;
        byte[] bArr = data2.ll8;
        int[] iArr = data2.unzftab;
        byte[] bArr2 = data2.selector;
        byte[] bArr3 = data2.seqToUnseq;
        char[] cArr = data2.getAndMoveToFrontDecode_yy;
        int[] iArr2 = data2.minLens;
        int[][] iArr3 = data2.limit;
        int[][] iArr4 = data2.base;
        int[][] iArr5 = data2.perm;
        int i5 = bZip2CompressorInputStream.blockSize100k * BZip2Constants.BASEBLOCKSIZE;
        int i6 = 256;
        while (true) {
            i6--;
            if (i6 < 0) {
                break;
            }
            cArr[i6] = (char) i6;
            iArr[i6] = 0;
        }
        int i7 = bZip2CompressorInputStream.nInUse + 1;
        int andMoveToFrontDecode0 = bZip2CompressorInputStream.getAndMoveToFrontDecode0(0);
        int i8 = bZip2CompressorInputStream.bsBuff;
        int i9 = bZip2CompressorInputStream.bsLive;
        int i10 = i8;
        byte b = bArr2[0] & 255;
        int[] iArr6 = iArr4[b];
        int[] iArr7 = iArr3[b];
        int[] iArr8 = iArr5[b];
        int i11 = i9;
        int i12 = andMoveToFrontDecode0;
        int i13 = -1;
        int i14 = 0;
        int i15 = 49;
        int i16 = i10;
        int i17 = iArr2[b];
        int i18 = i16;
        while (i12 != i7) {
            int i19 = i7;
            int i20 = i18;
            if (i12 == 0 || i12 == 1) {
                int i21 = 1;
                int i22 = -1;
                while (true) {
                    if (i12 == 0) {
                        i22 += i21;
                        i = i13;
                    } else {
                        i = i13;
                        if (i12 == 1) {
                            i22 += i21 << 1;
                        } else {
                            int[][] iArr9 = iArr5;
                            byte[] bArr4 = bArr2;
                            byte b2 = bArr3[cArr[0]];
                            byte b3 = b2 & 255;
                            iArr[b3] = iArr[b3] + i22 + 1;
                            i13 = i;
                            while (true) {
                                int i23 = i22 - 1;
                                if (i22 < 0) {
                                    break;
                                }
                                i13++;
                                bArr[i13] = b2;
                                i22 = i23;
                            }
                            if (i13 < i5) {
                                bZip2CompressorInputStream = this;
                                i7 = i19;
                                i18 = i20;
                                iArr5 = iArr9;
                                bArr2 = bArr4;
                            } else {
                                throw new IOException("block overrun");
                            }
                        }
                    }
                    if (i15 == 0) {
                        i14++;
                        byte b4 = bArr2[i14] & 255;
                        iArr6 = iArr4[b4];
                        iArr7 = iArr3[b4];
                        iArr8 = iArr5[b4];
                        i2 = iArr2[b4];
                        i3 = 49;
                    } else {
                        i3 = i15 - 1;
                        i2 = i17;
                    }
                    int i24 = i11;
                    while (i24 < i2) {
                        int read = inputStream.read();
                        if (read >= 0) {
                            i20 = (i20 << 8) | read;
                            i24 += 8;
                        } else {
                            throw new IOException("unexpected end of stream");
                        }
                    }
                    int i25 = i24 - i2;
                    int[][] iArr10 = iArr5;
                    int i26 = i25;
                    int i27 = (i20 >> i25) & ((1 << i2) - 1);
                    int i28 = i2;
                    while (i27 > iArr7[i28]) {
                        int i29 = i28 + 1;
                        byte[] bArr5 = bArr2;
                        int i30 = i11;
                        while (i30 < 1) {
                            int read2 = inputStream.read();
                            if (read2 >= 0) {
                                i20 = (i20 << 8) | read2;
                                i30 += 8;
                            } else {
                                throw new IOException("unexpected end of stream");
                            }
                        }
                        i26 = i30 - 1;
                        i27 = (i27 << 1) | ((i20 >> i26) & 1);
                        i28 = i29;
                        bArr2 = bArr5;
                    }
                    byte[] bArr6 = bArr2;
                    int i31 = iArr8[i27 - iArr6[i28]];
                    i21 <<= 1;
                    i17 = i2;
                    i13 = i;
                    i12 = i31;
                    iArr5 = iArr10;
                }
            } else {
                i13++;
                if (i13 < i5) {
                    int i32 = i12 - 1;
                    char c2 = cArr[i32];
                    byte b5 = bArr3[c2] & 255;
                    iArr[b5] = iArr[b5] + 1;
                    bArr[i13] = bArr3[c2];
                    if (i12 <= 16) {
                        while (i32 > 0) {
                            int i33 = i32 - 1;
                            cArr[i32] = cArr[i33];
                            i32 = i33;
                        }
                        c = 0;
                    } else {
                        c = 0;
                        System.arraycopy(cArr, 0, cArr, 1, i32);
                    }
                    cArr[c] = c2;
                    if (i15 == 0) {
                        i14++;
                        byte b6 = bArr2[i14] & 255;
                        int[] iArr11 = iArr4[b6];
                        int[] iArr12 = iArr3[b6];
                        int[] iArr13 = iArr5[b6];
                        i4 = iArr2[b6];
                        iArr6 = iArr11;
                        iArr7 = iArr12;
                        iArr8 = iArr13;
                        i15 = 49;
                    } else {
                        i15--;
                        i4 = i17;
                    }
                    int i34 = i11;
                    while (i34 < i4) {
                        int read3 = inputStream.read();
                        if (read3 >= 0) {
                            i20 = (i20 << 8) | read3;
                            i34 += 8;
                        } else {
                            throw new IOException("unexpected end of stream");
                        }
                    }
                    int i35 = i34 - i4;
                    int i36 = (i20 >> i35) & ((1 << i4) - 1);
                    i11 = i35;
                    int i37 = i4;
                    while (i36 > iArr7[i37]) {
                        i37++;
                        int i38 = i4;
                        int i39 = i11;
                        while (i39 < 1) {
                            int read4 = inputStream.read();
                            if (read4 >= 0) {
                                i20 = (i20 << 8) | read4;
                                i39 += 8;
                            } else {
                                throw new IOException("unexpected end of stream");
                            }
                        }
                        i11 = i39 - 1;
                        i36 = (i36 << 1) | ((i20 >> i11) & 1);
                        i4 = i38;
                    }
                    int i40 = i4;
                    i12 = iArr8[i36 - iArr6[i37]];
                    bZip2CompressorInputStream = this;
                    i7 = i19;
                    i18 = i20;
                    i17 = i40;
                } else {
                    throw new IOException("block overrun");
                }
            }
        }
        bZip2CompressorInputStream.last = i13;
        bZip2CompressorInputStream.bsLive = i11;
        bZip2CompressorInputStream.bsBuff = i18;
    }

    private int getAndMoveToFrontDecode0(int i) throws IOException {
        InputStream inputStream = this.f38882in;
        Data data2 = this.data;
        byte b = data2.selector[i] & 255;
        int[] iArr = data2.limit[b];
        int i2 = data2.minLens[b];
        int bsR = bsR(i2);
        int i3 = this.bsLive;
        int i4 = this.bsBuff;
        while (bsR > iArr[i2]) {
            i2++;
            while (i3 < 1) {
                int read = inputStream.read();
                if (read >= 0) {
                    i4 = (i4 << 8) | read;
                    i3 += 8;
                } else {
                    throw new IOException("unexpected end of stream");
                }
            }
            i3--;
            bsR = (bsR << 1) | (1 & (i4 >> i3));
        }
        this.bsLive = i3;
        this.bsBuff = i4;
        return data2.perm[b][bsR - data2.base[b][i2]];
    }

    private static void hbCreateDecodeTables(int[] iArr, int[] iArr2, int[] iArr3, char[] cArr, int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 <= i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                if (cArr[i7] == i6) {
                    iArr3[i5] = i7;
                    i5++;
                }
            }
        }
        int i8 = 23;
        while (true) {
            i8--;
            if (i8 <= 0) {
                break;
            }
            iArr2[i8] = 0;
            iArr[i8] = 0;
        }
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = cArr[i9] + 1;
            iArr2[i10] = iArr2[i10] + 1;
        }
        int i11 = iArr2[0];
        for (int i12 = 1; i12 < 23; i12++) {
            i11 += iArr2[i12];
            iArr2[i12] = i11;
        }
        int i13 = iArr2[i];
        int i14 = i;
        while (i14 <= i2) {
            int i15 = i14 + 1;
            int i16 = iArr2[i15];
            int i17 = i4 + (i16 - i13);
            iArr[i14] = i17 - 1;
            i4 = i17 << 1;
            i14 = i15;
            i13 = i16;
        }
        for (int i18 = i + 1; i18 <= i2; i18++) {
            iArr2[i18] = ((iArr[i18 - 1] + 1) << 1) - iArr2[i18];
        }
    }

    private boolean init(boolean z) throws IOException {
        InputStream inputStream = this.f38882in;
        if (inputStream != null) {
            int read = inputStream.read();
            if (read == -1 && !z) {
                return false;
            }
            int read2 = this.f38882in.read();
            int read3 = this.f38882in.read();
            if (read == 66 && read2 == 90 && read3 == 104) {
                int read4 = this.f38882in.read();
                if (read4 < 49 || read4 > 57) {
                    throw new IOException("BZip2 block size is invalid");
                }
                this.blockSize100k = read4 - 48;
                this.bsLive = 0;
                this.computedCombinedCRC = 0;
                return true;
            }
            throw new IOException(z ? "Stream is not in the BZip2 format" : "Garbage after a valid BZip2 stream");
        }
        throw new IOException("No InputStream");
    }

    private void initBlock() throws IOException {
        do {
            char bsGetUByte = bsGetUByte();
            char bsGetUByte2 = bsGetUByte();
            char bsGetUByte3 = bsGetUByte();
            char bsGetUByte4 = bsGetUByte();
            char bsGetUByte5 = bsGetUByte();
            char bsGetUByte6 = bsGetUByte();
            if (bsGetUByte != 23 || bsGetUByte2 != 'r' || bsGetUByte3 != 'E' || bsGetUByte4 != '8' || bsGetUByte5 != 'P' || bsGetUByte6 != 144) {
                boolean z = false;
                if (bsGetUByte == '1' && bsGetUByte2 == 'A' && bsGetUByte3 == 'Y' && bsGetUByte4 == '&' && bsGetUByte5 == 'S' && bsGetUByte6 == 'Y') {
                    this.storedBlockCRC = bsGetInt();
                    if (bsR(1) == 1) {
                        z = true;
                    }
                    this.blockRandomised = z;
                    if (this.data == null) {
                        this.data = new Data(this.blockSize100k);
                    }
                    getAndMoveToFrontDecode();
                    this.crc.initialiseCRC();
                    this.currentState = 1;
                    return;
                }
                this.currentState = 0;
                throw new IOException("bad block header");
            }
        } while (!complete());
    }

    private void makeMaps() {
        Data data2 = this.data;
        boolean[] zArr = data2.inUse;
        byte[] bArr = data2.seqToUnseq;
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (zArr[i2]) {
                bArr[i] = (byte) i2;
                i++;
            }
        }
        this.nInUse = i;
    }

    public static boolean matches(byte[] bArr, int i) {
        return i >= 3 && bArr[0] == 66 && bArr[1] == 90 && bArr[2] == 104;
    }

    private int read0() throws IOException {
        switch (this.currentState) {
            case 0:
                return -1;
            case 1:
                return setupBlock();
            case 2:
                throw new IllegalStateException();
            case 3:
                return setupRandPartB();
            case 4:
                return setupRandPartC();
            case 5:
                throw new IllegalStateException();
            case 6:
                return setupNoRandPartB();
            case 7:
                return setupNoRandPartC();
            default:
                throw new IllegalStateException();
        }
    }

    private void recvDecodingTables() throws IOException {
        Data data2 = this.data;
        boolean[] zArr = data2.inUse;
        byte[] bArr = data2.recvDecodingTables_pos;
        byte[] bArr2 = data2.selector;
        byte[] bArr3 = data2.selectorMtf;
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            if (bsGetBit()) {
                i |= 1 << i2;
            }
        }
        int i3 = 256;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            zArr[i3] = false;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            if (((1 << i4) & i) != 0) {
                int i5 = i4 << 4;
                for (int i6 = 0; i6 < 16; i6++) {
                    if (bsGetBit()) {
                        zArr[i5 + i6] = true;
                    }
                }
            }
        }
        makeMaps();
        int i7 = this.nInUse + 2;
        int bsR = bsR(3);
        int bsR2 = bsR(15);
        for (int i8 = 0; i8 < bsR2; i8++) {
            int i9 = 0;
            while (bsGetBit()) {
                i9++;
            }
            bArr3[i8] = (byte) i9;
        }
        int i10 = bsR;
        while (true) {
            i10--;
            if (i10 < 0) {
                break;
            }
            bArr[i10] = (byte) i10;
        }
        for (int i11 = 0; i11 < bsR2; i11++) {
            int i12 = bArr3[i11] & 255;
            byte b = bArr[i12];
            while (i12 > 0) {
                bArr[i12] = bArr[i12 - 1];
                i12--;
            }
            bArr[0] = b;
            bArr2[i11] = b;
        }
        char[][] cArr = data2.temp_charArray2d;
        for (int i13 = 0; i13 < bsR; i13++) {
            int bsR3 = bsR(5);
            char[] cArr2 = cArr[i13];
            for (int i14 = 0; i14 < i7; i14++) {
                while (bsGetBit()) {
                    bsR3 += bsGetBit() ? -1 : 1;
                }
                cArr2[i14] = (char) bsR3;
            }
        }
        createHuffmanDecodingTables(i7, bsR);
    }

    private int setupBlock() throws IOException {
        Data data2;
        if (this.currentState == 0 || (data2 = this.data) == null) {
            return -1;
        }
        int[] iArr = data2.cftab;
        int[] initTT = data2.initTT(this.last + 1);
        Data data3 = this.data;
        byte[] bArr = data3.ll8;
        iArr[0] = 0;
        System.arraycopy(data3.unzftab, 0, iArr, 1, 256);
        int i = iArr[0];
        for (int i2 = 1; i2 <= 256; i2++) {
            i += iArr[i2];
            iArr[i2] = i;
        }
        int i3 = this.last;
        for (int i4 = 0; i4 <= i3; i4++) {
            byte b = bArr[i4] & 255;
            int i5 = iArr[b];
            iArr[b] = i5 + 1;
            initTT[i5] = i4;
        }
        int i6 = this.origPtr;
        if (i6 < 0 || i6 >= initTT.length) {
            throw new IOException("stream corrupted");
        }
        this.su_tPos = initTT[i6];
        this.su_count = 0;
        this.su_i2 = 0;
        this.su_ch2 = 256;
        if (!this.blockRandomised) {
            return setupNoRandPartA();
        }
        this.su_rNToGo = 0;
        this.su_rTPos = 0;
        return setupRandPartA();
    }

    private int setupNoRandPartA() throws IOException {
        int i = this.su_i2;
        if (i <= this.last) {
            this.su_chPrev = this.su_ch2;
            Data data2 = this.data;
            byte[] bArr = data2.ll8;
            int i2 = this.su_tPos;
            byte b = bArr[i2] & 255;
            this.su_ch2 = b;
            this.su_tPos = data2.f38883tt[i2];
            this.su_i2 = i + 1;
            this.currentState = 6;
            this.crc.updateCRC(b);
            return b;
        }
        this.currentState = 5;
        endBlock();
        initBlock();
        return setupBlock();
    }

    private int setupNoRandPartB() throws IOException {
        if (this.su_ch2 != this.su_chPrev) {
            this.su_count = 1;
            return setupNoRandPartA();
        }
        int i = this.su_count + 1;
        this.su_count = i;
        if (i < 4) {
            return setupNoRandPartA();
        }
        Data data2 = this.data;
        byte[] bArr = data2.ll8;
        int i2 = this.su_tPos;
        this.su_z = (char) (bArr[i2] & 255);
        this.su_tPos = data2.f38883tt[i2];
        this.su_j2 = 0;
        return setupNoRandPartC();
    }

    private int setupNoRandPartC() throws IOException {
        if (this.su_j2 < this.su_z) {
            int i = this.su_ch2;
            this.crc.updateCRC(i);
            this.su_j2++;
            this.currentState = 7;
            return i;
        }
        this.su_i2++;
        this.su_count = 0;
        return setupNoRandPartA();
    }

    private int setupRandPartA() throws IOException {
        if (this.su_i2 <= this.last) {
            this.su_chPrev = this.su_ch2;
            Data data2 = this.data;
            byte[] bArr = data2.ll8;
            int i = this.su_tPos;
            byte b = bArr[i] & 255;
            this.su_tPos = data2.f38883tt[i];
            int i2 = this.su_rNToGo;
            byte b2 = 0;
            if (i2 == 0) {
                this.su_rNToGo = Rand.rNums(this.su_rTPos) - 1;
                int i3 = this.su_rTPos + 1;
                this.su_rTPos = i3;
                if (i3 == 512) {
                    this.su_rTPos = 0;
                }
            } else {
                this.su_rNToGo = i2 - 1;
            }
            if (this.su_rNToGo == 1) {
                b2 = 1;
            }
            byte b3 = b ^ b2;
            this.su_ch2 = b3;
            this.su_i2++;
            this.currentState = 3;
            this.crc.updateCRC(b3);
            return b3;
        }
        endBlock();
        initBlock();
        return setupBlock();
    }

    private int setupRandPartB() throws IOException {
        if (this.su_ch2 != this.su_chPrev) {
            this.currentState = 2;
            this.su_count = 1;
        } else {
            int i = this.su_count + 1;
            this.su_count = i;
            if (i >= 4) {
                Data data2 = this.data;
                byte[] bArr = data2.ll8;
                int i2 = this.su_tPos;
                this.su_z = (char) (bArr[i2] & 255);
                this.su_tPos = data2.f38883tt[i2];
                int i3 = this.su_rNToGo;
                if (i3 == 0) {
                    this.su_rNToGo = Rand.rNums(this.su_rTPos) - 1;
                    int i4 = this.su_rTPos + 1;
                    this.su_rTPos = i4;
                    if (i4 == 512) {
                        this.su_rTPos = 0;
                    }
                } else {
                    this.su_rNToGo = i3 - 1;
                }
                this.su_j2 = 0;
                this.currentState = 4;
                if (this.su_rNToGo == 1) {
                    this.su_z = (char) (this.su_z ^ 1);
                }
                return setupRandPartC();
            }
            this.currentState = 2;
        }
        return setupRandPartA();
    }

    private int setupRandPartC() throws IOException {
        if (this.su_j2 < this.su_z) {
            this.crc.updateCRC(this.su_ch2);
            this.su_j2++;
            return this.su_ch2;
        }
        this.currentState = 2;
        this.su_i2++;
        this.su_count = 0;
        return setupRandPartA();
    }

    public void close() throws IOException {
        InputStream inputStream = this.f38882in;
        if (inputStream != null) {
            try {
                if (inputStream != System.in) {
                    inputStream.close();
                }
            } finally {
                this.data = null;
                this.f38882in = null;
            }
        }
    }

    public int read() throws IOException {
        if (this.f38882in != null) {
            int read0 = read0();
            count(read0 < 0 ? -1 : 1);
            return read0;
        }
        throw new IOException("stream closed");
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IndexOutOfBoundsException("offs(" + i + ") < 0.");
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                throw new IndexOutOfBoundsException("offs(" + i + ") + len(" + i2 + ") > dest.length(" + bArr.length + ").");
            } else if (this.f38882in == null) {
                throw new IOException("stream closed");
            } else if (i2 == 0) {
                return 0;
            } else {
                int i4 = i;
                while (i4 < i3) {
                    int read0 = read0();
                    if (read0 < 0) {
                        break;
                    }
                    bArr[i4] = (byte) read0;
                    count(1);
                    i4++;
                }
                if (i4 == i) {
                    return -1;
                }
                return i4 - i;
            }
        } else {
            throw new IndexOutOfBoundsException("len(" + i2 + ") < 0.");
        }
    }
}

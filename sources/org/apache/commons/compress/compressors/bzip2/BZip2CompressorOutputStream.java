package org.apache.commons.compress.compressors.bzip2;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import org.apache.commons.compress.compressors.CompressorOutputStream;

public class BZip2CompressorOutputStream extends CompressorOutputStream implements BZip2Constants {
    private static final int GREATER_ICOST = 15;
    private static final int LESSER_ICOST = 0;
    public static final int MAX_BLOCKSIZE = 9;
    public static final int MIN_BLOCKSIZE = 1;
    private final int allowableBlockSize;
    private int blockCRC;
    private final int blockSize100k;
    private BlockSort blockSorter;
    private int bsBuff;
    private int bsLive;
    private int combinedCRC;
    private final CRC crc;
    private int currentChar;
    private Data data;
    private int last;
    private int nInUse;
    private int nMTF;
    private OutputStream out;
    private int runLength;

    public static final class Data {
        public final byte[] block;
        public final int[] fmap;
        public final byte[] generateMTFValues_yy = new byte[256];
        public final int[] heap;
        public final boolean[] inUse = new boolean[256];
        public final int[] mtfFreq = new int[BZip2Constants.MAX_ALPHA_SIZE];
        public int origPtr;
        public final int[] parent;
        public final byte[] selector = new byte[BZip2Constants.MAX_SELECTORS];
        public final byte[] selectorMtf = new byte[BZip2Constants.MAX_SELECTORS];
        public final byte[] sendMTFValues2_pos;
        public final int[][] sendMTFValues_code;
        public final short[] sendMTFValues_cost;
        public final int[] sendMTFValues_fave;
        public final byte[][] sendMTFValues_len = ((byte[][]) Array.newInstance(byte.class, new int[]{6, BZip2Constants.MAX_ALPHA_SIZE}));
        public final int[][] sendMTFValues_rfreq;
        public final boolean[] sentMTFValues4_inUse16;
        public final char[] sfmap;
        public final byte[] unseqToSeq = new byte[256];
        public final int[] weight;

        public Data(int i) {
            Class<int> cls = int.class;
            this.sendMTFValues_rfreq = (int[][]) Array.newInstance(cls, new int[]{6, BZip2Constants.MAX_ALPHA_SIZE});
            this.sendMTFValues_fave = new int[6];
            this.sendMTFValues_cost = new short[6];
            this.sendMTFValues_code = (int[][]) Array.newInstance(cls, new int[]{6, BZip2Constants.MAX_ALPHA_SIZE});
            this.sendMTFValues2_pos = new byte[6];
            this.sentMTFValues4_inUse16 = new boolean[16];
            this.heap = new int[260];
            this.weight = new int[516];
            this.parent = new int[516];
            int i2 = i * BZip2Constants.BASEBLOCKSIZE;
            this.block = new byte[(i2 + 1 + 20)];
            this.fmap = new int[i2];
            this.sfmap = new char[(i2 * 2)];
        }
    }

    public BZip2CompressorOutputStream(OutputStream outputStream) throws IOException {
        this(outputStream, 9);
    }

    public BZip2CompressorOutputStream(OutputStream outputStream, int i) throws IOException {
        this.crc = new CRC();
        this.currentChar = -1;
        this.runLength = 0;
        if (i < 1) {
            throw new IllegalArgumentException("blockSize(" + i + ") < 1");
        } else if (i <= 9) {
            this.blockSize100k = i;
            this.out = outputStream;
            this.allowableBlockSize = (i * BZip2Constants.BASEBLOCKSIZE) - 20;
            init();
        } else {
            throw new IllegalArgumentException("blockSize(" + i + ") > 9");
        }
    }

    private void blockSort() {
        this.blockSorter.blockSort(this.data, this.last);
    }

    private void bsFinishedWithStream() throws IOException {
        while (this.bsLive > 0) {
            this.out.write(this.bsBuff >> 24);
            this.bsBuff <<= 8;
            this.bsLive -= 8;
        }
    }

    private void bsPutInt(int i) throws IOException {
        bsW(8, (i >> 24) & 255);
        bsW(8, (i >> 16) & 255);
        bsW(8, (i >> 8) & 255);
        bsW(8, i & 255);
    }

    private void bsPutUByte(int i) throws IOException {
        bsW(8, i);
    }

    private void bsW(int i, int i2) throws IOException {
        OutputStream outputStream = this.out;
        int i3 = this.bsLive;
        int i4 = this.bsBuff;
        while (i3 >= 8) {
            outputStream.write(i4 >> 24);
            i4 <<= 8;
            i3 -= 8;
        }
        this.bsBuff = (i2 << ((32 - i3) - i)) | i4;
        this.bsLive = i3 + i;
    }

    public static int chooseBlockSize(long j) {
        if (j > 0) {
            return (int) Math.min((j / 132000) + 1, 9);
        }
        return 9;
    }

    private void endBlock() throws IOException {
        int finalCRC = this.crc.getFinalCRC();
        this.blockCRC = finalCRC;
        int i = this.combinedCRC;
        this.combinedCRC = finalCRC ^ ((i >>> 31) | (i << 1));
        if (this.last != -1) {
            blockSort();
            bsPutUByte(49);
            bsPutUByte(65);
            bsPutUByte(89);
            bsPutUByte(38);
            bsPutUByte(83);
            bsPutUByte(89);
            bsPutInt(this.blockCRC);
            bsW(1, 0);
            moveToFrontCodeAndSend();
        }
    }

    private void endCompression() throws IOException {
        bsPutUByte(23);
        bsPutUByte(114);
        bsPutUByte(69);
        bsPutUByte(56);
        bsPutUByte(80);
        bsPutUByte(144);
        bsPutInt(this.combinedCRC);
        bsFinishedWithStream();
    }

    private void generateMTFValues() {
        int i;
        int i2 = this.last;
        Data data2 = this.data;
        boolean[] zArr = data2.inUse;
        byte[] bArr = data2.block;
        int[] iArr = data2.fmap;
        char[] cArr = data2.sfmap;
        int[] iArr2 = data2.mtfFreq;
        byte[] bArr2 = data2.unseqToSeq;
        byte[] bArr3 = data2.generateMTFValues_yy;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            if (zArr[i4]) {
                bArr2[i4] = (byte) i3;
                i3++;
            }
        }
        this.nInUse = i3;
        int i5 = i3 + 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            iArr2[i6] = 0;
        }
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            bArr3[i3] = (byte) i3;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 <= i2; i9++) {
            byte b = bArr2[bArr[iArr[i9]] & 255];
            byte b2 = bArr3[0];
            int i10 = 0;
            while (b != b2) {
                i10++;
                byte b3 = bArr3[i10];
                bArr3[i10] = b2;
                b2 = b3;
            }
            bArr3[0] = b2;
            if (i10 == 0) {
                i7++;
            } else {
                if (i7 > 0) {
                    int i11 = i7 - 1;
                    while (true) {
                        if ((i11 & 1) == 0) {
                            cArr[i8] = 0;
                            i8++;
                            iArr2[0] = iArr2[0] + 1;
                        } else {
                            cArr[i8] = 1;
                            i8++;
                            iArr2[1] = iArr2[1] + 1;
                        }
                        if (i11 < 2) {
                            break;
                        }
                        i11 = (i11 - 2) >> 1;
                    }
                    i7 = 0;
                }
                int i12 = i10 + 1;
                cArr[i8] = (char) i12;
                i8++;
                iArr2[i12] = iArr2[i12] + 1;
            }
        }
        if (i7 > 0) {
            int i13 = i7 - 1;
            while (true) {
                if ((i13 & 1) == 0) {
                    cArr[i8] = 0;
                    i = i8 + 1;
                    iArr2[0] = iArr2[0] + 1;
                } else {
                    cArr[i8] = 1;
                    i = i8 + 1;
                    iArr2[1] = iArr2[1] + 1;
                }
                if (i13 < 2) {
                    break;
                }
                i13 = (i13 - 2) >> 1;
            }
        }
        cArr[i8] = (char) i5;
        iArr2[i5] = iArr2[i5] + 1;
        this.nMTF = i8 + 1;
    }

    private static void hbAssignCodes(int[] iArr, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i <= i2) {
            for (int i5 = 0; i5 < i3; i5++) {
                if ((bArr[i5] & 255) == i) {
                    iArr[i5] = i4;
                    i4++;
                }
            }
            i4 <<= 1;
            i++;
        }
    }

    private static void hbMakeCodeLengths(byte[] bArr, int[] iArr, Data data2, int i, int i2) {
        Data data3 = data2;
        int i3 = i;
        int[] iArr2 = data3.heap;
        int[] iArr3 = data3.weight;
        int[] iArr4 = data3.parent;
        int i4 = i3;
        while (true) {
            i4--;
            int i5 = 1;
            if (i4 < 0) {
                break;
            }
            int i6 = i4 + 1;
            if (iArr[i4] != 0) {
                i5 = iArr[i4];
            }
            iArr3[i6] = i5 << 8;
        }
        boolean z = true;
        while (z) {
            iArr2[0] = 0;
            iArr3[0] = 0;
            iArr4[0] = -2;
            int i7 = 0;
            for (int i8 = 1; i8 <= i3; i8++) {
                iArr4[i8] = -1;
                i7++;
                iArr2[i7] = i8;
                int i9 = iArr2[i7];
                int i10 = i7;
                while (true) {
                    int i11 = i10 >> 1;
                    if (iArr3[i9] >= iArr3[iArr2[i11]]) {
                        break;
                    }
                    iArr2[i10] = iArr2[i11];
                    i10 = i11;
                }
                iArr2[i10] = i9;
            }
            int i12 = i3;
            while (i7 > 1) {
                int i13 = iArr2[1];
                iArr2[1] = iArr2[i7];
                int i14 = i7 - 1;
                int i15 = iArr2[1];
                int i16 = 1;
                while (true) {
                    int i17 = i16 << 1;
                    if (i17 > i14) {
                        break;
                    }
                    if (i17 < i14) {
                        int i18 = i17 + 1;
                        if (iArr3[iArr2[i18]] < iArr3[iArr2[i17]]) {
                            i17 = i18;
                        }
                    }
                    if (iArr3[i15] < iArr3[iArr2[i17]]) {
                        break;
                    }
                    iArr2[i16] = iArr2[i17];
                    i16 = i17;
                }
                iArr2[i16] = i15;
                int i19 = iArr2[1];
                iArr2[1] = iArr2[i14];
                int i20 = i14 - 1;
                int i21 = iArr2[1];
                int i22 = 1;
                while (true) {
                    int i23 = i22 << 1;
                    if (i23 > i20) {
                        break;
                    }
                    if (i23 < i20) {
                        int i24 = i23 + 1;
                        if (iArr3[iArr2[i24]] < iArr3[iArr2[i23]]) {
                            i23 = i24;
                        }
                    }
                    if (iArr3[i21] < iArr3[iArr2[i23]]) {
                        break;
                    }
                    iArr2[i22] = iArr2[i23];
                    i22 = i23;
                }
                iArr2[i22] = i21;
                i12++;
                iArr4[i19] = i12;
                iArr4[i13] = i12;
                int i25 = iArr3[i13];
                int i26 = iArr3[i19];
                int i27 = (i25 & -256) + (i26 & -256);
                int i28 = i25 & 255;
                int i29 = i26 & 255;
                if (i28 <= i29) {
                    i28 = i29;
                }
                iArr3[i12] = (i28 + 1) | i27;
                iArr4[i12] = -1;
                i7 = i20 + 1;
                iArr2[i7] = i12;
                int i30 = iArr2[i7];
                int i31 = iArr3[i30];
                int i32 = i7;
                while (true) {
                    int i33 = i32 >> 1;
                    if (i31 >= iArr3[iArr2[i33]]) {
                        break;
                    }
                    iArr2[i32] = iArr2[i33];
                    i32 = i33;
                }
                iArr2[i32] = i30;
            }
            z = false;
            for (int i34 = 1; i34 <= i3; i34++) {
                int i35 = i34;
                int i36 = 0;
                while (true) {
                    i35 = iArr4[i35];
                    if (i35 < 0) {
                        break;
                    }
                    i36++;
                }
                bArr[i34 - 1] = (byte) i36;
                if (i36 > i2) {
                    z = true;
                }
            }
            int i37 = i2;
            if (z) {
                for (int i38 = 1; i38 < i3; i38++) {
                    iArr3[i38] = (((iArr3[i38] >> 8) >> 1) + 1) << 8;
                }
            }
        }
    }

    private void init() throws IOException {
        bsPutUByte(66);
        bsPutUByte(90);
        this.data = new Data(this.blockSize100k);
        this.blockSorter = new BlockSort(this.data);
        bsPutUByte(104);
        bsPutUByte(this.blockSize100k + 48);
        this.combinedCRC = 0;
        initBlock();
    }

    private void initBlock() {
        this.crc.initialiseCRC();
        this.last = -1;
        boolean[] zArr = this.data.inUse;
        int i = 256;
        while (true) {
            i--;
            if (i >= 0) {
                zArr[i] = false;
            } else {
                return;
            }
        }
    }

    private void moveToFrontCodeAndSend() throws IOException {
        bsW(24, this.data.origPtr);
        generateMTFValues();
        sendMTFValues();
    }

    private void sendMTFValues() throws IOException {
        byte[][] bArr = this.data.sendMTFValues_len;
        int i = 2;
        int i2 = this.nInUse + 2;
        int i3 = 6;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            byte[] bArr2 = bArr[i3];
            int i4 = i2;
            while (true) {
                i4--;
                if (i4 >= 0) {
                    bArr2[i4] = 15;
                }
            }
        }
        int i5 = this.nMTF;
        if (i5 >= 200) {
            i = i5 < 600 ? 3 : i5 < 1200 ? 4 : i5 < 2400 ? 5 : 6;
        }
        sendMTFValues0(i, i2);
        int sendMTFValues1 = sendMTFValues1(i, i2);
        sendMTFValues2(i, sendMTFValues1);
        sendMTFValues3(i, i2);
        sendMTFValues4();
        sendMTFValues5(i, sendMTFValues1);
        sendMTFValues6(i, i2);
        sendMTFValues7();
    }

    private void sendMTFValues0(int i, int i2) {
        Data data2 = this.data;
        byte[][] bArr = data2.sendMTFValues_len;
        int[] iArr = data2.mtfFreq;
        int i3 = this.nMTF;
        int i4 = 0;
        for (int i5 = i; i5 > 0; i5--) {
            int i6 = i3 / i5;
            int i7 = i4 - 1;
            int i8 = i2 - 1;
            int i9 = 0;
            while (i9 < i6 && i7 < i8) {
                i7++;
                i9 += iArr[i7];
            }
            if (!(i7 <= i4 || i5 == i || i5 == 1 || (1 & (i - i5)) == 0)) {
                i9 -= iArr[i7];
                i7--;
            }
            byte[] bArr2 = bArr[i5 - 1];
            int i10 = i2;
            while (true) {
                i10--;
                if (i10 < 0) {
                    break;
                } else if (i10 < i4 || i10 > i7) {
                    bArr2[i10] = 15;
                } else {
                    bArr2[i10] = 0;
                }
            }
            i4 = i7 + 1;
            i3 -= i9;
        }
    }

    private int sendMTFValues1(int i, int i2) {
        byte[] bArr;
        int i3;
        byte[] bArr2;
        BZip2CompressorOutputStream bZip2CompressorOutputStream = this;
        int i4 = i;
        Data data2 = bZip2CompressorOutputStream.data;
        int[][] iArr = data2.sendMTFValues_rfreq;
        int[] iArr2 = data2.sendMTFValues_fave;
        short[] sArr = data2.sendMTFValues_cost;
        char[] cArr = data2.sfmap;
        byte[] bArr3 = data2.selector;
        byte[][] bArr4 = data2.sendMTFValues_len;
        int i5 = 0;
        byte[] bArr5 = bArr4[0];
        byte[] bArr6 = bArr4[1];
        byte[] bArr7 = bArr4[2];
        byte[] bArr8 = bArr4[3];
        int i6 = 4;
        byte[] bArr9 = bArr4[4];
        byte[] bArr10 = bArr4[5];
        int i7 = bZip2CompressorOutputStream.nMTF;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            int i10 = i4;
            while (true) {
                i10--;
                if (i10 < 0) {
                    break;
                }
                iArr2[i10] = i5;
                int[] iArr3 = iArr[i10];
                int i11 = i2;
                while (true) {
                    i11--;
                    if (i11 >= 0) {
                        iArr3[i11] = i5;
                    }
                }
            }
            int i12 = 0;
            i9 = 0;
            while (i12 < bZip2CompressorOutputStream.nMTF) {
                int i13 = i12;
                int min = Math.min((i12 + 50) - 1, i7 - 1);
                if (i4 == 6) {
                    int i14 = i13;
                    short s = 0;
                    short s2 = 0;
                    short s3 = 0;
                    short s4 = 0;
                    short s5 = 0;
                    short s6 = 0;
                    while (i14 <= min) {
                        char c = cArr[i14];
                        short s7 = (short) (s2 + (bArr6[c] & 255));
                        short s8 = (short) (s3 + (bArr7[c] & 255));
                        short s9 = (short) (s4 + (bArr8[c] & 255));
                        short s10 = (short) (s5 + (bArr9[c] & 255));
                        i14++;
                        s6 = (short) (s6 + (bArr10[c] & 255));
                        s5 = s10;
                        bArr5 = bArr5;
                        s4 = s9;
                        s3 = s8;
                        s2 = s7;
                        s = (short) (s + (bArr5[c] & 255));
                        i7 = i7;
                    }
                    bArr = bArr5;
                    i3 = i7;
                    sArr[0] = s;
                    sArr[1] = s2;
                    sArr[2] = s3;
                    sArr[3] = s4;
                    sArr[4] = s5;
                    sArr[5] = s6;
                } else {
                    bArr = bArr5;
                    i3 = i7;
                    int i15 = i4;
                    while (true) {
                        i15--;
                        if (i15 < 0) {
                            break;
                        }
                        sArr[i15] = 0;
                    }
                    for (int i16 = i13; i16 <= min; i16++) {
                        char c2 = cArr[i16];
                        int i17 = i4;
                        while (true) {
                            i17--;
                            if (i17 < 0) {
                                break;
                            }
                            sArr[i17] = (short) (sArr[i17] + (bArr4[i17][c2] & 255));
                        }
                    }
                }
                short s11 = 999999999;
                int i18 = i4;
                int i19 = -1;
                while (true) {
                    i18--;
                    bArr2 = bArr6;
                    if (i18 < 0) {
                        break;
                    }
                    short s12 = sArr[i18];
                    if (s12 < s11) {
                        s11 = s12;
                        i19 = i18;
                    }
                    bArr6 = bArr2;
                }
                iArr2[i19] = iArr2[i19] + 1;
                bArr3[i9] = (byte) i19;
                i9++;
                int[] iArr4 = iArr[i19];
                for (int i20 = i13; i20 <= min; i20++) {
                    char c3 = cArr[i20];
                    iArr4[c3] = iArr4[c3] + 1;
                }
                i12 = min + 1;
                bArr6 = bArr2;
                i7 = i3;
                bArr5 = bArr;
            }
            byte[] bArr11 = bArr5;
            byte[] bArr12 = bArr6;
            int i21 = i7;
            int i22 = 0;
            while (i22 < i4) {
                hbMakeCodeLengths(bArr4[i22], iArr[i22], bZip2CompressorOutputStream.data, i2, 20);
                i22++;
                bZip2CompressorOutputStream = this;
            }
            int i23 = i2;
            i8++;
            bArr6 = bArr12;
            i7 = i21;
            bArr5 = bArr11;
            i5 = 0;
            i6 = 4;
            bZip2CompressorOutputStream = this;
        }
        return i9;
    }

    private void sendMTFValues2(int i, int i2) {
        Data data2 = this.data;
        byte[] bArr = data2.sendMTFValues2_pos;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            bArr[i] = (byte) i;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = data2.selector[i3];
            byte b2 = bArr[0];
            int i4 = 0;
            while (b != b2) {
                i4++;
                byte b3 = bArr[i4];
                bArr[i4] = b2;
                b2 = b3;
            }
            bArr[0] = b2;
            data2.selectorMtf[i3] = (byte) i4;
        }
    }

    private void sendMTFValues3(int i, int i2) {
        Data data2 = this.data;
        int[][] iArr = data2.sendMTFValues_code;
        byte[][] bArr = data2.sendMTFValues_len;
        for (int i3 = 0; i3 < i; i3++) {
            byte b = 32;
            byte[] bArr2 = bArr[i3];
            int i4 = i2;
            byte b2 = 0;
            while (true) {
                i4--;
                if (i4 < 0) {
                    break;
                }
                byte b3 = bArr2[i4] & 255;
                if (b3 > b2) {
                    b2 = b3;
                }
                if (b3 < b) {
                    b = b3;
                }
            }
            hbAssignCodes(iArr[i3], bArr[i3], b, b2, i2);
        }
    }

    private void sendMTFValues4() throws IOException {
        Data data2 = this.data;
        boolean[] zArr = data2.inUse;
        boolean[] zArr2 = data2.sentMTFValues4_inUse16;
        int i = 16;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            zArr2[i] = false;
            int i2 = i * 16;
            int i3 = 16;
            while (true) {
                i3--;
                if (i3 >= 0) {
                    if (zArr[i2 + i3]) {
                        zArr2[i] = true;
                    }
                }
            }
        }
        for (int i4 = 0; i4 < 16; i4++) {
            bsW(1, zArr2[i4] ? 1 : 0);
        }
        OutputStream outputStream = this.out;
        int i5 = this.bsLive;
        int i6 = this.bsBuff;
        for (int i7 = 0; i7 < 16; i7++) {
            if (zArr2[i7]) {
                int i8 = i7 * 16;
                for (int i9 = 0; i9 < 16; i9++) {
                    while (i5 >= 8) {
                        outputStream.write(i6 >> 24);
                        i6 <<= 8;
                        i5 -= 8;
                    }
                    if (zArr[i8 + i9]) {
                        i6 |= 1 << ((32 - i5) - 1);
                    }
                    i5++;
                }
            }
        }
        this.bsBuff = i6;
        this.bsLive = i5;
    }

    private void sendMTFValues5(int i, int i2) throws IOException {
        bsW(3, i);
        bsW(15, i2);
        OutputStream outputStream = this.out;
        byte[] bArr = this.data.selectorMtf;
        int i3 = this.bsLive;
        int i4 = this.bsBuff;
        for (int i5 = 0; i5 < i2; i5++) {
            byte b = bArr[i5] & 255;
            for (int i6 = 0; i6 < b; i6++) {
                while (i3 >= 8) {
                    outputStream.write(i4 >> 24);
                    i4 <<= 8;
                    i3 -= 8;
                }
                i4 |= 1 << ((32 - i3) - 1);
                i3++;
            }
            while (i3 >= 8) {
                outputStream.write(i4 >> 24);
                i4 <<= 8;
                i3 -= 8;
            }
            i3++;
        }
        this.bsBuff = i4;
        this.bsLive = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void sendMTFValues6(int r18, int r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data r1 = r0.data
            byte[][] r1 = r1.sendMTFValues_len
            java.io.OutputStream r2 = r0.out
            int r3 = r0.bsLive
            int r4 = r0.bsBuff
            r5 = 0
            r6 = r18
            r7 = 0
        L_0x0010:
            if (r7 >= r6) goto L_0x0080
            r8 = r1[r7]
            byte r9 = r8[r5]
            r9 = r9 & 255(0xff, float:3.57E-43)
        L_0x0018:
            r10 = 8
            if (r3 < r10) goto L_0x0026
            int r10 = r4 >> 24
            r2.write(r10)
            int r4 = r4 << 8
            int r3 = r3 + -8
            goto L_0x0018
        L_0x0026:
            int r11 = 32 - r3
            int r11 = r11 + -5
            int r11 = r9 << r11
            r4 = r4 | r11
            int r3 = r3 + 5
            r11 = r19
            r12 = 0
        L_0x0032:
            if (r12 >= r11) goto L_0x007d
            byte r13 = r8[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
        L_0x0038:
            r14 = 2
            if (r9 >= r13) goto L_0x0051
        L_0x003b:
            if (r3 < r10) goto L_0x0047
            int r15 = r4 >> 24
            r2.write(r15)
            int r4 = r4 << 8
            int r3 = r3 + -8
            goto L_0x003b
        L_0x0047:
            int r15 = 32 - r3
            int r15 = r15 - r14
            int r14 = r14 << r15
            r4 = r4 | r14
            int r3 = r3 + 2
            int r9 = r9 + 1
            goto L_0x0038
        L_0x0051:
            if (r9 <= r13) goto L_0x006c
        L_0x0053:
            if (r3 < r10) goto L_0x005f
            int r15 = r4 >> 24
            r2.write(r15)
            int r4 = r4 << 8
            int r3 = r3 + -8
            goto L_0x0053
        L_0x005f:
            r15 = 3
            int r16 = 32 - r3
            int r16 = r16 + -2
            int r15 = r15 << r16
            r4 = r4 | r15
            int r3 = r3 + 2
            int r9 = r9 + -1
            goto L_0x0051
        L_0x006c:
            if (r3 < r10) goto L_0x0078
            int r13 = r4 >> 24
            r2.write(r13)
            int r4 = r4 << 8
            int r3 = r3 + -8
            goto L_0x006c
        L_0x0078:
            int r3 = r3 + 1
            int r12 = r12 + 1
            goto L_0x0032
        L_0x007d:
            int r7 = r7 + 1
            goto L_0x0010
        L_0x0080:
            r0.bsBuff = r4
            r0.bsLive = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues6(int, int):void");
    }

    private void sendMTFValues7() throws IOException {
        Data data2 = this.data;
        byte[][] bArr = data2.sendMTFValues_len;
        int[][] iArr = data2.sendMTFValues_code;
        OutputStream outputStream = this.out;
        byte[] bArr2 = data2.selector;
        char[] cArr = data2.sfmap;
        int i = this.nMTF;
        int i2 = this.bsLive;
        int i3 = this.bsBuff;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int min = Math.min((i4 + 50) - 1, i - 1);
            byte b = bArr2[i5] & 255;
            int[] iArr2 = iArr[b];
            byte[] bArr3 = bArr[b];
            while (i4 <= min) {
                char c = cArr[i4];
                while (i2 >= 8) {
                    outputStream.write(i3 >> 24);
                    i3 <<= 8;
                    i2 -= 8;
                }
                byte b2 = bArr3[c] & 255;
                i3 |= iArr2[c] << ((32 - i2) - b2);
                i2 += b2;
                i4++;
            }
            i4 = min + 1;
            i5++;
        }
        this.bsBuff = i3;
        this.bsLive = i2;
    }

    private void write0(int i) throws IOException {
        int i2;
        int i3 = this.currentChar;
        int i4 = i & 255;
        if (i3 == -1) {
            this.currentChar = i4;
            i2 = this.runLength + 1;
        } else if (i3 == i4) {
            int i5 = this.runLength + 1;
            this.runLength = i5;
            if (i5 > 254) {
                writeRun();
                this.currentChar = -1;
                i2 = 0;
            } else {
                return;
            }
        } else {
            writeRun();
            this.runLength = 1;
            this.currentChar = i4;
            return;
        }
        this.runLength = i2;
    }

    private void writeRun() throws IOException {
        int i;
        int i2 = this.last;
        if (i2 < this.allowableBlockSize) {
            int i3 = this.currentChar;
            Data data2 = this.data;
            data2.inUse[i3] = true;
            byte b = (byte) i3;
            int i4 = this.runLength;
            this.crc.updateCRC(i3, i4);
            if (i4 == 1) {
                data2.block[i2 + 2] = b;
                this.last = i2 + 1;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    int i5 = i4 - 4;
                    data2.inUse[i5] = true;
                    byte[] bArr = data2.block;
                    bArr[i2 + 2] = b;
                    bArr[i2 + 3] = b;
                    bArr[i2 + 4] = b;
                    i = i2 + 5;
                    bArr[i] = b;
                    bArr[i2 + 6] = (byte) i5;
                } else {
                    byte[] bArr2 = data2.block;
                    bArr2[i2 + 2] = b;
                    i = i2 + 3;
                    bArr2[i] = b;
                    bArr2[i2 + 4] = b;
                }
                this.last = i;
            } else {
                byte[] bArr3 = data2.block;
                int i6 = i2 + 2;
                bArr3[i6] = b;
                bArr3[i2 + 3] = b;
                this.last = i6;
            }
        } else {
            endBlock();
            initBlock();
            writeRun();
        }
    }

    public void close() throws IOException {
        OutputStream outputStream = this.out;
        if (outputStream != null) {
            finish();
            outputStream.close();
        }
    }

    public void finalize() throws Throwable {
        finish();
        super.finalize();
    }

    public void finish() throws IOException {
        if (this.out != null) {
            try {
                if (this.runLength > 0) {
                    writeRun();
                }
                this.currentChar = -1;
                endBlock();
                endCompression();
            } finally {
                this.out = null;
                this.data = null;
                this.blockSorter = null;
            }
        }
    }

    public void flush() throws IOException {
        OutputStream outputStream = this.out;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    public final int getBlockSize() {
        return this.blockSize100k;
    }

    public void write(int i) throws IOException {
        if (this.out != null) {
            write0(i);
            return;
        }
        throw new IOException("closed");
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IndexOutOfBoundsException("offs(" + i + ") < 0.");
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                throw new IndexOutOfBoundsException("offs(" + i + ") + len(" + i2 + ") > buf.length(" + bArr.length + ").");
            } else if (this.out != null) {
                while (i < i3) {
                    write0(bArr[i]);
                    i++;
                }
            } else {
                throw new IOException("stream closed");
            }
        } else {
            throw new IndexOutOfBoundsException("len(" + i2 + ") < 0.");
        }
    }
}

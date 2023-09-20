package com.onedelhi.secure;

import java.io.IOException;

public abstract class ve3 extends qe3 {

    /* renamed from: a */
    public static final /* synthetic */ boolean f36503a = false;

    /* renamed from: a */
    public static final int[] f36504a = new int[128];

    /* renamed from: g */
    public static final int f36505g = 4;

    /* renamed from: h */
    public static final int f36506h = 4;

    /* renamed from: a */
    public byte f36507a;

    /* renamed from: a */
    public long f36508a;

    /* renamed from: b */
    public long f36509b;

    /* renamed from: f */
    public int f36510f;

    static {
        for (int i = 8; i < 2048; i += 16) {
            int i2 = i;
            int i3 = 0;
            for (int i4 = 0; i4 < 4; i4++) {
                i2 *= i2;
                i3 <<= 1;
                while ((-65536 & i2) != 0) {
                    i2 >>>= 1;
                    i3++;
                }
            }
            f36504a[i >> 4] = 161 - i3;
        }
    }

    /* renamed from: g */
    public static int m67977g(int i, int i2) {
        return f36504a[(i ^ ((-i2) & 2047)) >>> 4];
    }

    /* renamed from: h */
    public static int m67978h(short[] sArr, int i) {
        int length = i | sArr.length;
        int i2 = 0;
        do {
            int i3 = length & 1;
            length >>>= 1;
            i2 += m67977g(sArr[length], i3);
        } while (length != 1);
        return i2;
    }

    /* renamed from: i */
    public static int m67979i(int i) {
        return i << 4;
    }

    /* renamed from: k */
    public static int m67980k(short[] sArr, int i) {
        int length = i | sArr.length;
        int i2 = 0;
        int i3 = 1;
        do {
            int i4 = length & 1;
            length >>>= 1;
            i2 += m67977g(sArr[i3], i4);
            i3 = (i3 << 1) | i4;
        } while (length != 1);
        return i2;
    }

    /* renamed from: b */
    public void mo46128b(short[] sArr, int i, int i2) throws IOException {
        short s = sArr[i];
        int i3 = this.f36510f;
        int i4 = (i3 >>> 11) * s;
        if (i2 == 0) {
            this.f36510f = i4;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
        } else {
            this.f36508a += ((long) i4) & ZipConstants.ZIP64_MAGIC;
            this.f36510f = i3 - i4;
            sArr[i] = (short) (s - (s >>> 5));
        }
        int i5 = this.f36510f;
        if ((-16777216 & i5) == 0) {
            this.f36510f = i5 << 8;
            mo46135m();
        }
    }

    /* renamed from: c */
    public void mo46129c(short[] sArr, int i) throws IOException {
        int length = sArr.length;
        int i2 = 1;
        do {
            length >>>= 1;
            int i3 = i & length;
            mo46128b(sArr, i2, i3);
            i2 <<= 1;
            if (i3 != 0) {
                i2 |= 1;
                continue;
            }
        } while (length != 1);
    }

    /* renamed from: d */
    public void mo46130d(int i, int i2) throws IOException {
        do {
            int i3 = this.f36510f >>> 1;
            this.f36510f = i3;
            i2--;
            this.f36508a += (long) ((0 - ((i >>> i2) & 1)) & i3);
            if ((-16777216 & i3) == 0) {
                this.f36510f = i3 << 8;
                mo46135m();
                continue;
            }
        } while (i2 != 0);
    }

    /* renamed from: e */
    public void mo46131e(short[] sArr, int i) throws IOException {
        int length = i | sArr.length;
        int i2 = 1;
        do {
            int i3 = length & 1;
            length >>>= 1;
            mo46128b(sArr, i2, i3);
            i2 = (i2 << 1) | i3;
        } while (length != 1);
    }

    /* renamed from: f */
    public int mo46132f() throws IOException {
        for (int i = 0; i < 5; i++) {
            mo46135m();
        }
        return -1;
    }

    /* renamed from: j */
    public int mo46133j() {
        throw new Error();
    }

    /* renamed from: l */
    public void mo46134l() {
        this.f36508a = 0;
        this.f36510f = -1;
        this.f36507a = 0;
        this.f36509b = 1;
    }

    /* renamed from: m */
    public final void mo46135m() throws IOException {
        long j;
        long j2 = this.f36508a;
        int i = (int) (j2 >>> 32);
        if (i != 0 || j2 < 4278190080L) {
            byte b = this.f36507a;
            do {
                mo46136n(b + i);
                b = 255;
                j = this.f36509b - 1;
                this.f36509b = j;
            } while (j != 0);
            this.f36507a = (byte) ((int) (this.f36508a >>> 24));
        }
        this.f36509b++;
        this.f36508a = (this.f36508a & 16777215) << 8;
    }

    /* renamed from: n */
    public abstract void mo46136n(int i) throws IOException;
}

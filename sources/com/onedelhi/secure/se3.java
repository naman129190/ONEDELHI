package com.onedelhi.secure;

import java.io.IOException;

public abstract class se3 extends qe3 {

    /* renamed from: f */
    public int f35009f = 0;

    /* renamed from: g */
    public int f35010g = 0;

    /* renamed from: b */
    public int mo44302b(short[] sArr, int i) throws IOException {
        mo44306f();
        short s = sArr[i];
        int i2 = this.f35009f;
        int i3 = (i2 >>> 11) * s;
        int i4 = this.f35010g;
        if ((i4 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i3)) {
            this.f35009f = i3;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.f35009f = i2 - i3;
        this.f35010g = i4 - i3;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    /* renamed from: c */
    public int mo44303c(short[] sArr) throws IOException {
        int i = 1;
        do {
            i = mo44302b(sArr, i) | (i << 1);
        } while (i < sArr.length);
        return i - sArr.length;
    }

    /* renamed from: d */
    public int mo44304d(int i) throws IOException {
        int i2 = 0;
        do {
            mo44306f();
            int i3 = this.f35009f >>> 1;
            this.f35009f = i3;
            int i4 = this.f35010g;
            int i5 = (i4 - i3) >>> 31;
            this.f35010g = i4 - (i3 & (i5 - 1));
            i2 = (i2 << 1) | (1 - i5);
            i--;
        } while (i != 0);
        return i2;
    }

    /* renamed from: e */
    public int mo44305e(short[] sArr) throws IOException {
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int b = mo44302b(sArr, i3);
            i3 = (i3 << 1) | b;
            int i4 = i2 + 1;
            i |= b << i2;
            if (i3 >= sArr.length) {
                return i;
            }
            i2 = i4;
        }
    }

    /* renamed from: f */
    public abstract void mo44306f() throws IOException;
}

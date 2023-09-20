package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.rl */
public final class C6705rl {

    /* renamed from: a */
    public int f34665a;

    /* renamed from: a */
    public final byte[] f34666a;

    /* renamed from: b */
    public int f34667b;

    public C6705rl(byte[] bArr) {
        this.f34666a = bArr;
    }

    /* renamed from: a */
    public int mo43935a() {
        return ((this.f34666a.length - this.f34665a) * 8) - this.f34667b;
    }

    /* renamed from: b */
    public int mo43936b() {
        return this.f34667b;
    }

    /* renamed from: c */
    public int mo43937c() {
        return this.f34665a;
    }

    /* renamed from: d */
    public int mo43938d(int i) {
        if (i <= 0 || i > 32 || i > mo43935a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f34667b;
        byte b = 0;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int min = Math.min(i, i3);
            int i4 = i3 - min;
            byte[] bArr = this.f34666a;
            int i5 = this.f34665a;
            int i6 = (((255 >> (8 - min)) << i4) & bArr[i5]) >> i4;
            i -= min;
            int i7 = this.f34667b + min;
            this.f34667b = i7;
            if (i7 == 8) {
                this.f34667b = 0;
                this.f34665a = i5 + 1;
            }
            b = i6;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            int i8 = b << 8;
            byte[] bArr2 = this.f34666a;
            int i9 = this.f34665a;
            b = (bArr2[i9] & 255) | i8;
            this.f34665a = i9 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i10 = 8 - i;
        int i11 = (b << i) | ((((255 >> i10) << i10) & this.f34666a[this.f34665a]) >> i10);
        this.f34667b += i;
        return i11;
    }
}

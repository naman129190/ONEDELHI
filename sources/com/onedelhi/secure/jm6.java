package com.onedelhi.secure;

public final class jm6 extends pm6 {

    /* renamed from: o */
    public final int f14273o;

    public jm6(byte[] bArr, int i, int i2) {
        super(bArr);
        on6.m23918n(0, i2, bArr.length);
        this.f14273o = i2;
    }

    /* renamed from: b */
    public final byte mo18484b(int i) {
        int i2 = this.f14273o;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f18618a[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: e */
    public final byte mo18485e(int i) {
        return this.f18618a[i];
    }

    /* renamed from: f */
    public final int mo18486f() {
        return this.f14273o;
    }

    /* renamed from: t */
    public final int mo18487t() {
        return 0;
    }
}

package com.onedelhi.secure;

public final class r16 extends z26 {

    /* renamed from: o */
    public final int f19540o;

    public r16(byte[] bArr, int i, int i2) {
        super(bArr);
        i36.m17165l(0, i2, bArr.length);
        this.f19540o = i2;
    }

    /* renamed from: b */
    public final byte mo17547b(int i) {
        int i2 = this.f19540o;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f23431a[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: e */
    public final byte mo17548e(int i) {
        return this.f23431a[i];
    }

    /* renamed from: f */
    public final int mo17550f() {
        return this.f19540o;
    }

    /* renamed from: t */
    public final int mo23513t() {
        return 0;
    }
}

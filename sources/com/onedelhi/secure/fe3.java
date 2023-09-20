package com.onedelhi.secure;

import com.onedelhi.secure.ak4;

public final class fe3 extends qb2 {

    /* renamed from: a */
    public final byte[] f28274a;

    /* renamed from: c */
    public final int f28275c;

    /* renamed from: d */
    public final int f28276d;

    /* renamed from: e */
    public final int f28277e;

    /* renamed from: f */
    public final int f28278f;

    public fe3(int i, int i2, int[] iArr) {
        super(i, i2);
        this.f28275c = i;
        this.f28276d = i2;
        this.f28277e = 0;
        this.f28278f = 0;
        int i3 = i * i2;
        this.f28274a = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            this.f28274a[i4] = (byte) (((((i5 >> 16) & 255) + ((i5 >> 7) & ak4.C1714g.f9294j)) + (i5 & 255)) / 4);
        }
    }

    public fe3(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 > i || i6 + i4 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f28274a = bArr;
        this.f28275c = i;
        this.f28276d = i2;
        this.f28277e = i3;
        this.f28278f = i4;
    }

    /* renamed from: a */
    public qb2 mo35854a(int i, int i2, int i3, int i4) {
        return new fe3(this.f28274a, this.f28275c, this.f28276d, this.f28277e + i, this.f28278f + i2, i3, i4);
    }

    /* renamed from: c */
    public byte[] mo35855c() {
        int e = mo43292e();
        int b = mo43291b();
        int i = this.f28275c;
        if (e == i && b == this.f28276d) {
            return this.f28274a;
        }
        int i2 = e * b;
        byte[] bArr = new byte[i2];
        int i3 = (this.f28278f * i) + this.f28277e;
        if (e == i) {
            System.arraycopy(this.f28274a, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < b; i4++) {
            System.arraycopy(this.f28274a, i3, bArr, i4 * e, e);
            i3 += this.f28275c;
        }
        return bArr;
    }

    /* renamed from: d */
    public byte[] mo35856d(int i, byte[] bArr) {
        if (i < 0 || i >= mo43291b()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int e = mo43292e();
        if (bArr == null || bArr.length < e) {
            bArr = new byte[e];
        }
        System.arraycopy(this.f28274a, ((i + this.f28278f) * this.f28275c) + this.f28277e, bArr, 0, e);
        return bArr;
    }

    /* renamed from: g */
    public boolean mo35857g() {
        return true;
    }
}

package com.onedelhi.secure;

public final class j23 extends qb2 {

    /* renamed from: g */
    public static final int f30556g = 2;

    /* renamed from: a */
    public final byte[] f30557a;

    /* renamed from: c */
    public final int f30558c;

    /* renamed from: d */
    public final int f30559d;

    /* renamed from: e */
    public final int f30560e;

    /* renamed from: f */
    public final int f30561f;

    public j23(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f30557a = bArr;
        this.f30558c = i;
        this.f30559d = i2;
        this.f30560e = i3;
        this.f30561f = i4;
        if (z) {
            mo38387n(i5, i6);
        }
    }

    /* renamed from: a */
    public qb2 mo35854a(int i, int i2, int i3, int i4) {
        return new j23(this.f30557a, this.f30558c, this.f30559d, this.f30560e + i, this.f30561f + i2, i3, i4, false);
    }

    /* renamed from: c */
    public byte[] mo35855c() {
        int e = mo43292e();
        int b = mo43291b();
        int i = this.f30558c;
        if (e == i && b == this.f30559d) {
            return this.f30557a;
        }
        int i2 = e * b;
        byte[] bArr = new byte[i2];
        int i3 = (this.f30561f * i) + this.f30560e;
        if (e == i) {
            System.arraycopy(this.f30557a, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < b; i4++) {
            System.arraycopy(this.f30557a, i3, bArr, i4 * e, e);
            i3 += this.f30558c;
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
        System.arraycopy(this.f30557a, ((i + this.f30561f) * this.f30558c) + this.f30560e, bArr, 0, e);
        return bArr;
    }

    /* renamed from: g */
    public boolean mo35857g() {
        return true;
    }

    /* renamed from: k */
    public int mo38384k() {
        return mo43291b() / 2;
    }

    /* renamed from: l */
    public int mo38385l() {
        return mo43292e() / 2;
    }

    /* renamed from: m */
    public int[] mo38386m() {
        int e = mo43292e() / 2;
        int b = mo43291b() / 2;
        int[] iArr = new int[(e * b)];
        byte[] bArr = this.f30557a;
        int i = (this.f30561f * this.f30558c) + this.f30560e;
        for (int i2 = 0; i2 < b; i2++) {
            int i3 = i2 * e;
            for (int i4 = 0; i4 < e; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 << 1) + i] & 255) * 65793) | -16777216;
            }
            i += this.f30558c << 1;
        }
        return iArr;
    }

    /* renamed from: n */
    public final void mo38387n(int i, int i2) {
        byte[] bArr = this.f30557a;
        int i3 = (this.f30561f * this.f30558c) + this.f30560e;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f30558c;
        }
    }
}

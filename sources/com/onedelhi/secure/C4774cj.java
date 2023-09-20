package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.cj */
public final class C4774cj {

    /* renamed from: a */
    public int f26774a = 0;

    /* renamed from: a */
    public final byte[] f26775a;

    public C4774cj(int i) {
        this.f26775a = new byte[i];
    }

    /* renamed from: a */
    public void mo32396a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f26774a;
            this.f26774a = i3 + 1;
            mo32399d(i3, z);
        }
    }

    /* renamed from: b */
    public byte[] mo32397b(int i) {
        int length = this.f26775a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f26775a[i2 / i];
        }
        return bArr;
    }

    /* renamed from: c */
    public void mo32398c(int i, byte b) {
        this.f26775a[i] = b;
    }

    /* renamed from: d */
    public final void mo32399d(int i, boolean z) {
        this.f26775a[i] = z ? (byte) 1 : 0;
    }
}

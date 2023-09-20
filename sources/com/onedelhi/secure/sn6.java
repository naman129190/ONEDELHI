package com.onedelhi.secure;

public final class sn6 extends wn6 {

    /* renamed from: a */
    public final byte[] f20471a;

    /* renamed from: c */
    public int f20472c;

    /* renamed from: d */
    public int f20473d;

    /* renamed from: e */
    public int f20474e = Integer.MAX_VALUE;

    public /* synthetic */ sn6(byte[] bArr, int i, int i2, boolean z, qn6 qn6) {
        super((un6) null);
        this.f20471a = bArr;
        this.f20472c = 0;
    }

    /* renamed from: c */
    public final int mo24504c(int i) throws dr6 {
        int i2 = this.f20474e;
        this.f20474e = 0;
        int i3 = this.f20472c + this.f20473d;
        this.f20472c = i3;
        if (i3 > 0) {
            this.f20473d = i3;
            this.f20472c = i3 - i3;
        } else {
            this.f20473d = 0;
        }
        return i2;
    }
}

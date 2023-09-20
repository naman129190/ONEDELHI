package com.onedelhi.secure;

public final class xt1 extends qb2 {

    /* renamed from: a */
    public final qb2 f37596a;

    public xt1(qb2 qb2) {
        super(qb2.mo43292e(), qb2.mo43291b());
        this.f37596a = qb2;
    }

    /* renamed from: a */
    public qb2 mo35854a(int i, int i2, int i3, int i4) {
        return new xt1(this.f37596a.mo35854a(i, i2, i3, i4));
    }

    /* renamed from: c */
    public byte[] mo35855c() {
        byte[] c = this.f37596a.mo35855c();
        int e = mo43292e() * mo43291b();
        byte[] bArr = new byte[e];
        for (int i = 0; i < e; i++) {
            bArr[i] = (byte) (255 - (c[i] & 255));
        }
        return bArr;
    }

    /* renamed from: d */
    public byte[] mo35856d(int i, byte[] bArr) {
        byte[] d = this.f37596a.mo35856d(i, bArr);
        int e = mo43292e();
        for (int i2 = 0; i2 < e; i2++) {
            d[i2] = (byte) (255 - (d[i2] & 255));
        }
        return d;
    }

    /* renamed from: f */
    public qb2 mo43293f() {
        return this.f37596a;
    }

    /* renamed from: g */
    public boolean mo35857g() {
        return this.f37596a.mo35857g();
    }

    /* renamed from: h */
    public boolean mo43294h() {
        return this.f37596a.mo43294h();
    }

    /* renamed from: i */
    public qb2 mo43295i() {
        return new xt1(this.f37596a.mo43295i());
    }

    /* renamed from: j */
    public qb2 mo43296j() {
        return new xt1(this.f37596a.mo43296j());
    }
}

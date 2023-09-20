package com.onedelhi.secure;

public abstract class qb2 {

    /* renamed from: a */
    public final int f34057a;

    /* renamed from: b */
    public final int f34058b;

    public qb2(int i, int i2) {
        this.f34057a = i;
        this.f34058b = i2;
    }

    /* renamed from: a */
    public qb2 mo35854a(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    /* renamed from: b */
    public final int mo43291b() {
        return this.f34058b;
    }

    /* renamed from: c */
    public abstract byte[] mo35855c();

    /* renamed from: d */
    public abstract byte[] mo35856d(int i, byte[] bArr);

    /* renamed from: e */
    public final int mo43292e() {
        return this.f34057a;
    }

    /* renamed from: f */
    public qb2 mo43293f() {
        return new xt1(this);
    }

    /* renamed from: g */
    public boolean mo35857g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo43294h() {
        return false;
    }

    /* renamed from: i */
    public qb2 mo43295i() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    /* renamed from: j */
    public qb2 mo43296j() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        int i = this.f34057a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f34058b * (i + 1));
        for (int i2 = 0; i2 < this.f34058b; i2++) {
            bArr = mo35856d(i2, bArr);
            for (int i3 = 0; i3 < this.f34057a; i3++) {
                byte b = bArr[i3] & 255;
                sb.append(b < 64 ? '#' : b < 128 ? '+' : b < 192 ? '.' : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}

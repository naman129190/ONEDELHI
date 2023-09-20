package com.onedelhi.secure;

public final class lk1 extends C4694bs {

    /* renamed from: g */
    public static final int f31711g = 1024;

    /* renamed from: h */
    public static final int f31712h = 1023;

    /* renamed from: i */
    public static final int f31713i = 65536;

    /* renamed from: j */
    public static final int f31714j = 65535;

    /* renamed from: b */
    public final int f31715b;

    /* renamed from: b */
    public final int[] f31716b;

    /* renamed from: c */
    public final int f31717c;

    /* renamed from: c */
    public final int[] f31718c;

    /* renamed from: d */
    public int f31719d = 0;

    /* renamed from: d */
    public final int[] f31720d;

    /* renamed from: e */
    public int f31721e = 0;

    /* renamed from: f */
    public int f31722f = 0;

    public lk1(int i, C4477aa aaVar) {
        this.f31716b = aaVar.mo30488d(1024, true);
        this.f31718c = aaVar.mo30488d(65536, true);
        int e = m55720e(i);
        this.f31717c = e;
        this.f31720d = aaVar.mo30488d(e, true);
        this.f31715b = e - 1;
    }

    /* renamed from: e */
    public static int m55720e(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = ((i5 | (i5 >>> 8)) >>> 1) | 65535;
        if (i6 > 16777216) {
            i6 >>>= 1;
        }
        return i6 + 1;
    }

    /* renamed from: f */
    public static int m55721f(int i) {
        return ((m55720e(i) + 66560) / 256) + 4;
    }

    /* renamed from: a */
    public void mo39892a(byte[] bArr, int i) {
        int[] iArr = C4694bs.f26522a;
        byte b = iArr[bArr[i] & 255] ^ (bArr[i + 1] & 255);
        this.f31719d = b & 1023;
        byte b2 = b ^ ((bArr[i + 2] & 255) << 8);
        this.f31721e = 65535 & b2;
        this.f31722f = ((iArr[bArr[i + 3] & 255] << 5) ^ b2) & this.f31715b;
    }

    /* renamed from: b */
    public int mo39893b() {
        return this.f31716b[this.f31719d];
    }

    /* renamed from: c */
    public int mo39894c() {
        return this.f31718c[this.f31721e];
    }

    /* renamed from: d */
    public int mo39895d() {
        return this.f31720d[this.f31722f];
    }

    /* renamed from: g */
    public void mo39896g(int i) {
        k02.m53927q(this.f31716b, 1024, i);
        k02.m53927q(this.f31718c, 65536, i);
        k02.m53927q(this.f31720d, this.f31717c, i);
    }

    /* renamed from: h */
    public void mo39897h(C4477aa aaVar) {
        aaVar.mo30490f(this.f31720d);
        aaVar.mo30490f(this.f31718c);
        aaVar.mo30490f(this.f31716b);
    }

    /* renamed from: i */
    public void mo39898i(int i) {
        this.f31716b[this.f31719d] = i;
        this.f31718c[this.f31721e] = i;
        this.f31720d[this.f31722f] = i;
    }
}

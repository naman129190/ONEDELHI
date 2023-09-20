package com.onedelhi.secure;

public class hh1 extends C6888tk {

    /* renamed from: a */
    public static final int f29617a = 5;

    /* renamed from: b */
    public static final int f29618b = 3;

    /* renamed from: b */
    public static final byte[] f29619b = new byte[0];

    /* renamed from: c */
    public static final int f29620c = 32;

    /* renamed from: a */
    public byte[] f29621a = f29619b;

    /* renamed from: a */
    public final int[] f29622a = new int[32];

    public hh1(qb2 qb2) {
        super(qb2);
    }

    /* renamed from: g */
    public static int m50520g(int[] iArr) throws tr2 {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 > length / 16) {
            int i11 = i3 - 1;
            int i12 = i11;
            int i13 = -1;
            while (i11 > i5) {
                int i14 = i11 - i5;
                int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
                if (i15 > i13) {
                    i12 = i11;
                    i13 = i15;
                }
                i11--;
            }
            return i12 << 3;
        }
        throw tr2.m66179a();
    }

    /* renamed from: a */
    public C6888tk mo36792a(qb2 qb2) {
        return new hh1(qb2);
    }

    /* renamed from: b */
    public C6190nl mo36793b() throws tr2 {
        qb2 e = mo45169e();
        int e2 = e.mo43292e();
        int b = e.mo43291b();
        C6190nl nlVar = new C6190nl(e2, b);
        mo37327h(e2);
        int[] iArr = this.f29622a;
        for (int i = 1; i < 5; i++) {
            byte[] d = e.mo35856d((b * i) / 5, this.f29621a);
            int i2 = (e2 << 2) / 5;
            for (int i3 = e2 / 5; i3 < i2; i3++) {
                int i4 = (d[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int g = m50520g(iArr);
        byte[] c = e.mo35855c();
        for (int i5 = 0; i5 < b; i5++) {
            int i6 = i5 * e2;
            for (int i7 = 0; i7 < e2; i7++) {
                if ((c[i6 + i7] & 255) < g) {
                    nlVar.mo41096p(i7, i5);
                }
            }
        }
        return nlVar;
    }

    /* renamed from: c */
    public C6014ll mo37326c(int i, C6014ll llVar) throws tr2 {
        qb2 e = mo45169e();
        int e2 = e.mo43292e();
        if (llVar == null || llVar.mo39935l() < e2) {
            llVar = new C6014ll(e2);
        } else {
            llVar.mo39925d();
        }
        mo37327h(e2);
        byte[] d = e.mo35856d(i, this.f29621a);
        int[] iArr = this.f29622a;
        for (int i2 = 0; i2 < e2; i2++) {
            int i3 = (d[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int g = m50520g(iArr);
        if (e2 < 3) {
            for (int i4 = 0; i4 < e2; i4++) {
                if ((d[i4] & 255) < g) {
                    llVar.mo39939q(i4);
                }
            }
        } else {
            int i5 = 1;
            byte b = d[1] & 255;
            byte b2 = d[0] & 255;
            byte b3 = b;
            while (i5 < e2 - 1) {
                int i6 = i5 + 1;
                byte b4 = d[i6] & 255;
                if ((((b3 << 2) - b2) - b4) / 2 < g) {
                    llVar.mo39939q(i5);
                }
                b2 = b3;
                i5 = i6;
                b3 = b4;
            }
        }
        return llVar;
    }

    /* renamed from: h */
    public final void mo37327h(int i) {
        if (this.f29621a.length < i) {
            this.f29621a = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f29622a[i2] = 0;
        }
    }
}

package com.onedelhi.secure;

import java.lang.reflect.Array;

public final class gn1 extends hh1 {

    /* renamed from: d */
    public static final int f29231d = 3;

    /* renamed from: e */
    public static final int f29232e = 8;

    /* renamed from: f */
    public static final int f29233f = 7;

    /* renamed from: g */
    public static final int f29234g = 40;

    /* renamed from: h */
    public static final int f29235h = 24;

    /* renamed from: a */
    public C6190nl f29236a;

    public gn1(qb2 qb2) {
        super(qb2);
    }

    /* renamed from: i */
    public static int[][] m49577i(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int i7 = 8;
        int i8 = i4 - 8;
        int i9 = i3 - 8;
        int[] iArr = new int[2];
        iArr[1] = i5;
        iArr[0] = i6;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i10 = 0;
        while (i10 < i6) {
            int i11 = i10 << 3;
            if (i11 > i8) {
                i11 = i8;
            }
            int i12 = 0;
            while (i12 < i5) {
                int i13 = i12 << 3;
                if (i13 > i9) {
                    i13 = i9;
                }
                int i14 = (i11 * i3) + i13;
                byte b = 255;
                int i15 = 0;
                int i16 = 0;
                byte b2 = 0;
                while (i15 < i7) {
                    byte b3 = b2;
                    int i17 = 0;
                    while (i17 < i7) {
                        byte b4 = bArr[i14 + i17] & 255;
                        i16 += b4;
                        if (b4 < b) {
                            b = b4;
                        }
                        if (b4 > b3) {
                            b3 = b4;
                        }
                        i17++;
                        i7 = 8;
                    }
                    if (b3 - b <= 24) {
                        i15++;
                        i14 += i3;
                        b2 = b3;
                        i7 = 8;
                    }
                    while (true) {
                        i15++;
                        i14 += i3;
                        if (i15 >= 8) {
                            break;
                        }
                        int i18 = 0;
                        for (int i19 = 8; i18 < i19; i19 = 8) {
                            i16 += bArr[i14 + i18] & 255;
                            i18++;
                        }
                    }
                    i15++;
                    i14 += i3;
                    b2 = b3;
                    i7 = 8;
                }
                int i20 = i16 >> 6;
                if (b2 - b <= 24) {
                    i20 = b / 2;
                    if (i10 > 0 && i12 > 0) {
                        int i21 = i10 - 1;
                        int i22 = i12 - 1;
                        int i23 = ((iArr2[i21][i12] + (iArr2[i10][i22] * 2)) + iArr2[i21][i22]) / 4;
                        if (b < i23) {
                            i20 = i23;
                        }
                        iArr2[i10][i12] = i20;
                        i12++;
                        i7 = 8;
                    }
                }
                iArr2[i10][i12] = i20;
                i12++;
                i7 = 8;
            }
            i10++;
            i7 = 8;
        }
        return iArr2;
    }

    /* renamed from: j */
    public static void m49578j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C6190nl nlVar) {
        int i5 = i;
        int i6 = i2;
        int i7 = i4 - 8;
        int i8 = i3 - 8;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = i9 << 3;
            int i11 = i10 > i7 ? i7 : i10;
            int k = m49579k(i9, i6 - 3);
            for (int i12 = 0; i12 < i5; i12++) {
                int i13 = i12 << 3;
                int i14 = i13 > i8 ? i8 : i13;
                int k2 = m49579k(i12, i5 - 3);
                int i15 = 0;
                for (int i16 = -2; i16 <= 2; i16++) {
                    int[] iArr2 = iArr[k + i16];
                    i15 += iArr2[k2 - 2] + iArr2[k2 - 1] + iArr2[k2] + iArr2[k2 + 1] + iArr2[2 + k2];
                }
                m49580l(bArr, i14, i11, i15 / 25, i3, nlVar);
            }
        }
    }

    /* renamed from: k */
    public static int m49579k(int i, int i2) {
        if (i < 2) {
            return 2;
        }
        return Math.min(i, i2);
    }

    /* renamed from: l */
    public static void m49580l(byte[] bArr, int i, int i2, int i3, int i4, C6190nl nlVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    nlVar.mo41096p(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    public C6888tk mo36792a(qb2 qb2) {
        return new gn1(qb2);
    }

    /* renamed from: b */
    public C6190nl mo36793b() throws tr2 {
        C6190nl nlVar;
        C6190nl nlVar2 = this.f29236a;
        if (nlVar2 != null) {
            return nlVar2;
        }
        qb2 e = mo45169e();
        int e2 = e.mo43292e();
        int b = e.mo43291b();
        if (e2 < 40 || b < 40) {
            nlVar = super.mo36793b();
        } else {
            byte[] c = e.mo35855c();
            int i = e2 >> 3;
            if ((e2 & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = b >> 3;
            if ((b & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] i5 = m49577i(c, i2, i4, e2, b);
            nlVar = new C6190nl(e2, b);
            m49578j(c, i2, i4, e2, b, i5, nlVar);
        }
        this.f29236a = nlVar;
        return this.f29236a;
    }
}

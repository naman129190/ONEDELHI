package com.onedelhi.secure;

public final class zt0 {

    /* renamed from: a */
    public static final int f38422a = 33;

    /* renamed from: a */
    public static final int[] f38423a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: b */
    public static final int f38424b = 0;

    /* renamed from: c */
    public static final int f38425c = 32;

    /* renamed from: d */
    public static final int f38426d = 4;

    /* renamed from: a */
    public static int[] m74286a(C6014ll llVar, int i, int i2) {
        int[] iArr = new int[i2];
        int l = llVar.mo39935l() / i;
        for (int i3 = 0; i3 < l; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= llVar.mo39930h((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    /* renamed from: b */
    public static void m74287b(C6190nl nlVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                nlVar.mo41096p(i5, i4);
                nlVar.mo41096p(i5, i6);
                nlVar.mo41096p(i4, i5);
                nlVar.mo41096p(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        nlVar.mo41096p(i7, i7);
        int i8 = i7 + 1;
        nlVar.mo41096p(i8, i7);
        nlVar.mo41096p(i7, i8);
        int i9 = i + i2;
        nlVar.mo41096p(i9, i7);
        nlVar.mo41096p(i9, i8);
        nlVar.mo41096p(i9, i9 - 1);
    }

    /* renamed from: c */
    public static void m74288c(C6190nl nlVar, boolean z, int i, C6014ll llVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (llVar.mo39930h(i3)) {
                    nlVar.mo41096p(i4, i2 - 5);
                }
                if (llVar.mo39930h(i3 + 7)) {
                    nlVar.mo41096p(i2 + 5, i4);
                }
                if (llVar.mo39930h(20 - i3)) {
                    nlVar.mo41096p(i4, i2 + 5);
                }
                if (llVar.mo39930h(27 - i3)) {
                    nlVar.mo41096p(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (llVar.mo39930h(i3)) {
                nlVar.mo41096p(i5, i2 - 7);
            }
            if (llVar.mo39930h(i3 + 10)) {
                nlVar.mo41096p(i2 + 7, i5);
            }
            if (llVar.mo39930h(29 - i3)) {
                nlVar.mo41096p(i5, i2 + 7);
            }
            if (llVar.mo39930h(39 - i3)) {
                nlVar.mo41096p(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* renamed from: d */
    public static C6966uh m74289d(byte[] bArr) {
        return m74290e(bArr, 33, 0);
    }

    /* renamed from: e */
    public static C6966uh m74290e(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        C6014ll llVar;
        int i6;
        C6014ll a = new pl1(bArr).mo42811a();
        int i7 = 11;
        int l = ((a.mo39935l() * i) / 100) + 11;
        int l2 = a.mo39935l() + l;
        int i8 = 32;
        int i9 = 0;
        int i10 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            i4 = Math.abs(i2);
            if (z) {
                i8 = 4;
            }
            if (i4 <= i8) {
                i5 = m74295j(i4, z);
                i3 = f38423a[i4];
                int i11 = i5 - (i5 % i3);
                llVar = m74294i(a, i3);
                if (llVar.mo39935l() + l > i11) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z && llVar.mo39935l() > (i3 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)}));
            }
        } else {
            C6014ll llVar2 = null;
            int i12 = 0;
            int i13 = 0;
            while (i12 <= 32) {
                boolean z2 = i12 <= 3;
                int i14 = z2 ? i12 + 1 : i12;
                int j = m74295j(i14, z2);
                if (l2 <= j) {
                    if (llVar2 == null || i13 != f38423a[i14]) {
                        int i15 = f38423a[i14];
                        i13 = i15;
                        llVar2 = m74294i(a, i15);
                    }
                    int i16 = j - (j % i13);
                    if ((!z2 || llVar2.mo39935l() <= (i13 << 6)) && llVar2.mo39935l() + l <= i16) {
                        llVar = llVar2;
                        i3 = i13;
                        z = z2;
                        i4 = i14;
                        i5 = j;
                    }
                }
                i12++;
                i9 = 0;
                i10 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C6014ll f = m74291f(llVar, i5, i3);
        int l3 = llVar.mo39935l() / i3;
        C6014ll g = m74292g(z, i4, l3);
        if (!z) {
            i7 = 14;
        }
        int i17 = i7 + (i4 << 2);
        int[] iArr = new int[i17];
        int i18 = 2;
        if (z) {
            for (int i19 = 0; i19 < i17; i19++) {
                iArr[i19] = i19;
            }
            i6 = i17;
        } else {
            int i20 = i17 / 2;
            i6 = i17 + 1 + (((i20 - 1) / 15) * 2);
            int i21 = i6 / 2;
            for (int i22 = 0; i22 < i20; i22++) {
                int i23 = (i22 / 15) + i22;
                iArr[(i20 - i22) - i10] = (i21 - i23) - 1;
                iArr[i20 + i22] = i23 + i21 + i10;
            }
        }
        C6190nl nlVar = new C6190nl(i6);
        int i24 = 0;
        int i25 = 0;
        while (i24 < i4) {
            int i26 = ((i4 - i24) << i18) + (z ? 9 : 12);
            int i27 = 0;
            while (i27 < i26) {
                int i28 = i27 << 1;
                while (i9 < i18) {
                    if (f.mo39930h(i25 + i28 + i9)) {
                        int i29 = i24 << 1;
                        nlVar.mo41096p(iArr[i29 + i9], iArr[i29 + i27]);
                    }
                    if (f.mo39930h((i26 << 1) + i25 + i28 + i9)) {
                        int i30 = i24 << 1;
                        nlVar.mo41096p(iArr[i30 + i27], iArr[((i17 - 1) - i30) - i9]);
                    }
                    if (f.mo39930h((i26 << 2) + i25 + i28 + i9)) {
                        int i31 = (i17 - 1) - (i24 << 1);
                        nlVar.mo41096p(iArr[i31 - i9], iArr[i31 - i27]);
                    }
                    if (f.mo39930h((i26 * 6) + i25 + i28 + i9)) {
                        int i32 = i24 << 1;
                        nlVar.mo41096p(iArr[((i17 - 1) - i32) - i27], iArr[i32 + i9]);
                    }
                    i9++;
                    i18 = 2;
                }
                i27++;
                i9 = 0;
                i18 = 2;
            }
            i25 += i26 << 3;
            i24++;
            i9 = 0;
            i18 = 2;
        }
        m74288c(nlVar, z, i6, g);
        int i33 = i6 / 2;
        if (z) {
            m74287b(nlVar, i33, 5);
        } else {
            m74287b(nlVar, i33, 7);
            int i34 = 0;
            int i35 = 0;
            while (i35 < (i17 / 2) - 1) {
                for (int i36 = i33 & 1; i36 < i6; i36 += 2) {
                    int i37 = i33 - i34;
                    nlVar.mo41096p(i37, i36);
                    int i38 = i33 + i34;
                    nlVar.mo41096p(i38, i36);
                    nlVar.mo41096p(i36, i37);
                    nlVar.mo41096p(i36, i38);
                }
                i35 += 15;
                i34 += 16;
            }
        }
        C6966uh uhVar = new C6966uh();
        uhVar.mo45592g(z);
        uhVar.mo45595j(i6);
        uhVar.mo45593h(i4);
        uhVar.mo45591f(l3);
        uhVar.mo45594i(nlVar);
        return uhVar;
    }

    /* renamed from: f */
    public static C6014ll m74291f(C6014ll llVar, int i, int i2) {
        wg3 wg3 = new wg3(m74293h(i2));
        int i3 = i / i2;
        int[] a = m74286a(llVar, i2, i3);
        wg3.mo46728b(a, i3 - (llVar.mo39935l() / i2));
        C6014ll llVar2 = new C6014ll();
        llVar2.mo39923c(0, i % i2);
        for (int c : a) {
            llVar2.mo39923c(c, i2);
        }
        return llVar2;
    }

    /* renamed from: g */
    public static C6014ll m74292g(boolean z, int i, int i2) {
        int i3;
        C6014ll llVar = new C6014ll();
        int i4 = i - 1;
        if (z) {
            llVar.mo39923c(i4, 2);
            llVar.mo39923c(i2 - 1, 6);
            i3 = 28;
        } else {
            llVar.mo39923c(i4, 5);
            llVar.mo39923c(i2 - 1, 11);
            i3 = 40;
        }
        return m74291f(llVar, i3, 4);
    }

    /* renamed from: h */
    public static te1 m74293h(int i) {
        if (i == 4) {
            return te1.f35528d;
        }
        if (i == 6) {
            return te1.f35527c;
        }
        if (i == 8) {
            return te1.f35531g;
        }
        if (i == 10) {
            return te1.f35526b;
        }
        if (i == 12) {
            return te1.f35525a;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    /* renamed from: i */
    public static C6014ll m74294i(C6014ll llVar, int i) {
        C6014ll llVar2 = new C6014ll();
        int l = llVar.mo39935l();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < l) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= l || llVar.mo39930h(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 != i2) {
                if (i7 == 0) {
                    i7 = i4 | 1;
                } else {
                    llVar2.mo39923c(i4, i);
                    i3 += i;
                }
            }
            llVar2.mo39923c(i7, i);
            i3--;
            i3 += i;
        }
        return llVar2;
    }

    /* renamed from: j */
    public static int m74295j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}

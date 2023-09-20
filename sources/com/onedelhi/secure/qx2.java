package com.onedelhi.secure;

import java.lang.reflect.Array;
import java.util.ArrayList;

public final class qx2 {

    /* renamed from: a */
    public static final int f34395a = 2;

    /* renamed from: a */
    public static final iv0 f34396a = new iv0();

    /* renamed from: b */
    public static final int f34397b = 3;

    /* renamed from: c */
    public static final int f34398c = 512;

    /* renamed from: a */
    public static C7173wn m63244a(ik0 ik0) throws tr2 {
        int[] j;
        if (ik0 == null || (j = ik0.mo38124j()) == null) {
            return null;
        }
        int p = m63259p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        k00[] d = ik0.mo37373d();
        int i4 = 0;
        while (i2 > 0 && d[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            i += p - j[length];
            if (j[length] > 0) {
                break;
            }
        }
        int length2 = d.length - 1;
        while (i > 0 && d[length2] == null) {
            i--;
            length2--;
        }
        return ik0.mo37370a().mo46801a(i2, i, ik0.mo38125k());
    }

    /* renamed from: b */
    public static void m63245b(gk0 gk0, C5031dj[][] djVarArr) throws tr2 {
        C5031dj djVar = djVarArr[0][1];
        int[] b = djVar.mo34473b();
        int j = (gk0.mo36760j() * gk0.mo36762l()) - m63261r(gk0.mo36761k());
        if (b.length == 0) {
            if (j <= 0 || j > 928) {
                throw tr2.m66179a();
            }
            djVar.mo34474c(j);
        } else if (b[0] != j && j > 0 && j <= 928) {
            djVar.mo34474c(j);
        }
    }

    /* renamed from: c */
    public static int m63246c(C6190nl nlVar, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        continue;
                        break;
                    }
                } else if (i6 < i) {
                    continue;
                    break;
                }
                if (z != nlVar.mo41085e(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    /* renamed from: d */
    public static boolean m63247d(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    public static int m63248e(int[] iArr, int[] iArr2, int i) throws C6619qx {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f34396a.mo38253a(iArr, i, iArr2);
        }
        throw C6619qx.m63242a();
    }

    /* renamed from: f */
    public static C5031dj[][] m63249f(gk0 gk0) {
        int c;
        int l = gk0.mo36762l();
        int[] iArr = new int[2];
        iArr[1] = gk0.mo36760j() + 2;
        iArr[0] = l;
        C5031dj[][] djVarArr = (C5031dj[][]) Array.newInstance(C5031dj.class, iArr);
        for (int i = 0; i < djVarArr.length; i++) {
            for (int i2 = 0; i2 < djVarArr[i].length; i2++) {
                djVarArr[i][i2] = new C5031dj();
            }
        }
        int i3 = 0;
        for (hk0 hk0 : gk0.mo36765o()) {
            if (hk0 != null) {
                for (k00 k00 : hk0.mo37373d()) {
                    if (k00 != null && (c = k00.mo38957c()) >= 0 && c < djVarArr.length) {
                        djVarArr[c][i3].mo34474c(k00.mo38959e());
                    }
                }
            }
            i3++;
        }
        return djVarArr;
    }

    /* renamed from: g */
    public static gg0 m63250g(gk0 gk0) throws ha1, C6619qx, tr2 {
        C5031dj[][] f = m63249f(gk0);
        m63245b(gk0, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(gk0.mo36762l() * gk0.mo36760j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < gk0.mo36762l(); i++) {
            int i2 = 0;
            while (i2 < gk0.mo36760j()) {
                int i3 = i2 + 1;
                int[] b = f[i][i3].mo34473b();
                int j = (gk0.mo36760j() * i) + i2;
                if (b.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (b.length == 1) {
                    iArr[j] = b[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(b);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m63251h(gk0.mo36761k(), iArr, kx2.m55126c(arrayList), kx2.m55126c(arrayList3), iArr2);
    }

    /* renamed from: h */
    public static gg0 m63251h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws ha1, C6619qx {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m63253j(iArr, i, iArr2);
                } catch (C6619qx unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            } else if (iArr5[i5] < iArr4[i5].length - 1) {
                                iArr5[i5] = iArr5[i5] + 1;
                                break;
                            } else {
                                iArr5[i5] = 0;
                                if (i5 != length - 1) {
                                    i5++;
                                } else {
                                    throw C6619qx.m63242a();
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        throw C6619qx.m63242a();
                    }
                }
            } else {
                throw C6619qx.m63242a();
            }
        }
    }

    /* renamed from: i */
    public static gg0 m63252i(C6190nl nlVar, sl3 sl3, sl3 sl32, sl3 sl33, sl3 sl34, int i, int i2) throws tr2, ha1, C6619qx {
        gk0 v;
        hk0 hk0;
        int i3;
        int i4;
        int i5;
        ik0 ik0 = null;
        ik0 ik02 = null;
        C7173wn wnVar = new C7173wn(nlVar, sl3, sl32, sl33, sl34);
        boolean z = true;
        while (true) {
            if (sl3 != null) {
                ik0 = m63262s(nlVar, wnVar, sl3, true, i, i2);
            }
            if (sl33 != null) {
                ik02 = m63262s(nlVar, wnVar, sl33, false, i, i2);
            }
            v = m63265v(ik0, ik02);
            if (v != null) {
                C7173wn m = v.mo36763m();
                if (!z || m == null || (m.mo46807g() >= wnVar.mo46807g() && m.mo46805e() <= wnVar.mo46805e())) {
                    v.mo36766p(wnVar);
                    int j = v.mo36760j() + 1;
                    v.mo36767q(0, ik0);
                    v.mo36767q(j, ik02);
                } else {
                    wnVar = m;
                    z = false;
                }
            } else {
                throw tr2.m66179a();
            }
        }
        v.mo36766p(wnVar);
        int j2 = v.mo36760j() + 1;
        v.mo36767q(0, ik0);
        v.mo36767q(j2, ik02);
        boolean z2 = ik0 != null;
        int i6 = i;
        int i7 = i2;
        for (int i8 = 1; i8 <= j2; i8++) {
            int i9 = z2 ? i8 : j2 - i8;
            if (v.mo36764n(i9) == null) {
                if (i9 == 0 || i9 == j2) {
                    hk0 = new ik0(wnVar, i9 == 0);
                } else {
                    hk0 = new hk0(wnVar);
                }
                v.mo36767q(i9, hk0);
                int i10 = -1;
                int g = wnVar.mo46807g();
                int i11 = -1;
                while (g <= wnVar.mo46805e()) {
                    int t = m63263t(v, i9, g, z2);
                    if (t >= 0 && t <= wnVar.mo46804d()) {
                        i5 = t;
                    } else if (i11 != i10) {
                        i5 = i11;
                    } else {
                        i4 = i11;
                        i3 = g;
                        i11 = i4;
                        g = i3 + 1;
                        i10 = -1;
                    }
                    i4 = i11;
                    int i12 = g;
                    k00 k = m63254k(nlVar, wnVar.mo46806f(), wnVar.mo46804d(), z2, i5, i12, i6, i7);
                    i3 = i12;
                    if (k != null) {
                        hk0.mo37375f(i3, k);
                        i6 = Math.min(i6, k.mo38960f());
                        i7 = Math.max(i7, k.mo38960f());
                        i11 = i5;
                        g = i3 + 1;
                        i10 = -1;
                    }
                    i11 = i4;
                    g = i3 + 1;
                    i10 = -1;
                }
            }
        }
        return m63250g(v);
    }

    /* renamed from: j */
    public static gg0 m63253j(int[] iArr, int i, int[] iArr2) throws ha1, C6619qx {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = m63248e(iArr, iArr2, i2);
            m63267x(iArr, i2);
            gg0 b = uf0.m66982b(iArr, String.valueOf(i));
            b.mo36729m(Integer.valueOf(e));
            b.mo36728l(Integer.valueOf(iArr2.length));
            return b;
        }
        throw ha1.m50341a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = com.onedelhi.secure.jx2.m53883d(r7);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.k00 m63254k(com.onedelhi.secure.C6190nl r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = m63246c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = m63260q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = com.onedelhi.secure.qf2.m62734d(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = m63247d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = com.onedelhi.secure.jx2.m53883d(r7)
            int r9 = com.onedelhi.secure.kx2.m55125b(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            com.onedelhi.secure.k00 r8 = new com.onedelhi.secure.k00
            int r7 = m63257n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qx2.m63254k(com.onedelhi.secure.nl, int, int, boolean, int, int, int, int):com.onedelhi.secure.k00");
    }

    /* renamed from: l */
    public static C4559aj m63255l(ik0 ik0, ik0 ik02) {
        C4559aj i;
        C4559aj i2;
        if (ik0 == null || (i = ik0.mo38123i()) == null) {
            if (ik02 == null) {
                return null;
            }
            return ik02.mo38123i();
        } else if (ik02 == null || (i2 = ik02.mo38123i()) == null || i.mo30934a() == i2.mo30934a() || i.mo30935b() == i2.mo30935b() || i.mo30936c() == i2.mo30936c()) {
            return i;
        } else {
            return null;
        }
    }

    /* renamed from: m */
    public static int[] m63256m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    public static int m63257n(int i) {
        return m63258o(m63256m(i));
    }

    /* renamed from: o */
    public static int m63258o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    public static int m63259p(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: q */
    public static int[] m63260q(C6190nl nlVar, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (nlVar.mo41085e(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    /* renamed from: r */
    public static int m63261r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    public static ik0 m63262s(C6190nl nlVar, C7173wn wnVar, sl3 sl3, boolean z, int i, int i2) {
        boolean z2 = z;
        ik0 ik0 = new ik0(wnVar, z2);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int c = (int) sl3.mo44403c();
            int d = (int) sl3.mo44404d();
            while (d <= wnVar.mo46805e() && d >= wnVar.mo46807g()) {
                k00 k = m63254k(nlVar, 0, nlVar.mo41094l(), z, c, d, i, i2);
                if (k != null) {
                    ik0.mo37375f(d, k);
                    c = z2 ? k.mo38958d() : k.mo38956b();
                }
                d += i4;
            }
            i3++;
        }
        return ik0;
    }

    /* renamed from: t */
    public static int m63263t(gk0 gk0, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        k00 k00 = null;
        int i4 = i - i3;
        if (m63264u(gk0, i4)) {
            k00 = gk0.mo36764n(i4).mo37371b(i2);
        }
        if (k00 != null) {
            return z ? k00.mo38956b() : k00.mo38958d();
        }
        k00 c = gk0.mo36764n(i).mo37372c(i2);
        if (c != null) {
            return z ? c.mo38958d() : c.mo38956b();
        }
        if (m63264u(gk0, i4)) {
            c = gk0.mo36764n(i4).mo37372c(i2);
        }
        if (c != null) {
            return z ? c.mo38956b() : c.mo38958d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m63264u(gk0, i)) {
                for (k00 k002 : gk0.mo36764n(i).mo37373d()) {
                    if (k002 != null) {
                        return (z ? k002.mo38956b() : k002.mo38958d()) + (i3 * i5 * (k002.mo38956b() - k002.mo38958d()));
                    }
                }
                i5++;
            } else {
                C7173wn m = gk0.mo36763m();
                return z ? m.mo46806f() : m.mo46804d();
            }
        }
    }

    /* renamed from: u */
    public static boolean m63264u(gk0 gk0, int i) {
        return i >= 0 && i <= gk0.mo36760j() + 1;
    }

    /* renamed from: v */
    public static gk0 m63265v(ik0 ik0, ik0 ik02) throws tr2 {
        C4559aj l;
        if ((ik0 == null && ik02 == null) || (l = m63255l(ik0, ik02)) == null) {
            return null;
        }
        return new gk0(l, C7173wn.m69495j(m63244a(ik0), m63244a(ik02)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        r9.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        throw r1;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m63266w(com.onedelhi.secure.C5031dj[][] r9) {
        /*
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r1 = 0
            r2 = 0
        L_0x0007:
            int r3 = r9.length     // Catch:{ all -> 0x0065 }
            if (r2 >= r3) goto L_0x005d
            java.lang.String r3 = "Row %2d: "
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0065 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0065 }
            r5[r1] = r6     // Catch:{ all -> 0x0065 }
            r0.format(r3, r5)     // Catch:{ all -> 0x0065 }
            r3 = 0
        L_0x0019:
            r5 = r9[r2]     // Catch:{ all -> 0x0065 }
            int r5 = r5.length     // Catch:{ all -> 0x0065 }
            if (r3 >= r5) goto L_0x0053
            r5 = r9[r2]     // Catch:{ all -> 0x0065 }
            r5 = r5[r3]     // Catch:{ all -> 0x0065 }
            int[] r6 = r5.mo34473b()     // Catch:{ all -> 0x0065 }
            int r6 = r6.length     // Catch:{ all -> 0x0065 }
            if (r6 != 0) goto L_0x0030
            java.lang.String r5 = "        "
            r6 = 0
            r0.format(r5, r6)     // Catch:{ all -> 0x0065 }
            goto L_0x0050
        L_0x0030:
            java.lang.String r6 = "%4d(%2d)"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0065 }
            int[] r8 = r5.mo34473b()     // Catch:{ all -> 0x0065 }
            r8 = r8[r1]     // Catch:{ all -> 0x0065 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0065 }
            r7[r1] = r8     // Catch:{ all -> 0x0065 }
            int[] r8 = r5.mo34473b()     // Catch:{ all -> 0x0065 }
            r8 = r8[r1]     // Catch:{ all -> 0x0065 }
            java.lang.Integer r5 = r5.mo34472a(r8)     // Catch:{ all -> 0x0065 }
            r7[r4] = r5     // Catch:{ all -> 0x0065 }
            r0.format(r6, r7)     // Catch:{ all -> 0x0065 }
        L_0x0050:
            int r3 = r3 + 1
            goto L_0x0019
        L_0x0053:
            java.lang.String r3 = "%n"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0065 }
            r0.format(r3, r4)     // Catch:{ all -> 0x0065 }
            int r2 = r2 + 1
            goto L_0x0007
        L_0x005d:
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0065 }
            r0.close()
            return r9
        L_0x0065:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x006c:
            r0 = move-exception
            r9.addSuppressed(r0)
        L_0x0070:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qx2.m63266w(com.onedelhi.secure.dj[][]):java.lang.String");
    }

    /* renamed from: x */
    public static void m63267x(int[] iArr, int i) throws ha1 {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw ha1.m50341a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw ha1.m50341a();
            }
        } else {
            throw ha1.m50341a();
        }
    }
}

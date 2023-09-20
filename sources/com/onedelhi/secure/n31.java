package com.onedelhi.secure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class n31 {

    /* renamed from: a */
    public static final int f32350a = 2;

    /* renamed from: a */
    public static final C6167b f32351a = new C6167b();

    /* renamed from: b */
    public static final int f32352b = 3;

    /* renamed from: c */
    public static final int f32353c = 97;

    /* renamed from: a */
    public final C6190nl f32354a;

    /* renamed from: a */
    public final tl3 f32355a;

    /* renamed from: a */
    public final List<l31> f32356a;

    /* renamed from: a */
    public boolean f32357a;

    /* renamed from: a */
    public final int[] f32358a;

    /* renamed from: com.onedelhi.secure.n31$b */
    public static final class C6167b implements Serializable, Comparator<l31> {
        public C6167b() {
        }

        /* renamed from: a */
        public int compare(l31 l31, l31 l312) {
            return Float.compare(l31.mo39636i(), l312.mo39636i());
        }
    }

    public n31(C6190nl nlVar) {
        this(nlVar, (tl3) null);
    }

    public n31(C6190nl nlVar, tl3 tl3) {
        this.f32354a = nlVar;
        this.f32356a = new ArrayList();
        this.f32358a = new int[5];
        this.f32355a = tl3;
    }

    /* renamed from: a */
    public static float m57816a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* renamed from: f */
    public static void m57817f(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    /* renamed from: g */
    public static void m57818g(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    /* renamed from: j */
    public static boolean m57819j(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* renamed from: k */
    public static boolean m57820k(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 1.333f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* renamed from: t */
    public static double m57821t(l31 l31, l31 l312) {
        double c = (double) (l31.mo44403c() - l312.mo44403c());
        double d = (double) (l31.mo44404d() - l312.mo44404d());
        return (c * c) + (d * d);
    }

    @Deprecated
    /* renamed from: b */
    public final void mo40903b(int[] iArr) {
        m57817f(iArr);
    }

    /* renamed from: c */
    public final boolean mo40904c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] l = mo40909l();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f32354a.mo41085e(i2 - i6, i - i6)) {
            l[2] = l[2] + 1;
            i6++;
        }
        if (l[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f32354a.mo41085e(i2 - i6, i - i6)) {
            l[1] = l[1] + 1;
            i6++;
        }
        if (l[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f32354a.mo41085e(i2 - i6, i - i6)) {
            l[0] = l[0] + 1;
            i6++;
        }
        if (l[0] == 0) {
            return false;
        }
        int h = this.f32354a.mo41089h();
        int l2 = this.f32354a.mo41094l();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 < h && (i5 = i2 + i7) < l2 && this.f32354a.mo41085e(i5, i8)) {
                l[2] = l[2] + 1;
                i7++;
            }
        }
        while (true) {
            int i9 = i + i7;
            if (i9 < h && (i4 = i2 + i7) < l2 && !this.f32354a.mo41085e(i4, i9)) {
                l[3] = l[3] + 1;
                i7++;
            }
        }
        if (l[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 < h && (i3 = i2 + i7) < l2 && this.f32354a.mo41085e(i3, i10)) {
                l[4] = l[4] + 1;
                i7++;
            }
        }
        if (l[4] == 0) {
            return false;
        }
        return m57820k(l);
    }

    /* renamed from: d */
    public final float mo40905d(int i, int i2, int i3, int i4) {
        C6190nl nlVar = this.f32354a;
        int l = nlVar.mo41094l();
        int[] l2 = mo40909l();
        int i5 = i;
        while (i5 >= 0 && nlVar.mo41085e(i5, i2)) {
            l2[2] = l2[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !nlVar.mo41085e(i5, i2) && l2[1] <= i3) {
            l2[1] = l2[1] + 1;
            i5--;
        }
        if (i5 >= 0 && l2[1] <= i3) {
            while (i5 >= 0 && nlVar.mo41085e(i5, i2) && l2[0] <= i3) {
                l2[0] = l2[0] + 1;
                i5--;
            }
            if (l2[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < l && nlVar.mo41085e(i6, i2)) {
                l2[2] = l2[2] + 1;
                i6++;
            }
            if (i6 == l) {
                return Float.NaN;
            }
            while (i6 < l && !nlVar.mo41085e(i6, i2) && l2[3] < i3) {
                l2[3] = l2[3] + 1;
                i6++;
            }
            if (i6 != l && l2[3] < i3) {
                while (i6 < l && nlVar.mo41085e(i6, i2) && l2[4] < i3) {
                    l2[4] = l2[4] + 1;
                    i6++;
                }
                if (l2[4] < i3 && Math.abs(((((l2[0] + l2[1]) + l2[2]) + l2[3]) + l2[4]) - i4) * 5 < i4 && m57819j(l2)) {
                    return m57816a(l2, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: e */
    public final float mo40906e(int i, int i2, int i3, int i4) {
        C6190nl nlVar = this.f32354a;
        int h = nlVar.mo41089h();
        int[] l = mo40909l();
        int i5 = i;
        while (i5 >= 0 && nlVar.mo41085e(i2, i5)) {
            l[2] = l[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !nlVar.mo41085e(i2, i5) && l[1] <= i3) {
            l[1] = l[1] + 1;
            i5--;
        }
        if (i5 >= 0 && l[1] <= i3) {
            while (i5 >= 0 && nlVar.mo41085e(i2, i5) && l[0] <= i3) {
                l[0] = l[0] + 1;
                i5--;
            }
            if (l[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < h && nlVar.mo41085e(i2, i6)) {
                l[2] = l[2] + 1;
                i6++;
            }
            if (i6 == h) {
                return Float.NaN;
            }
            while (i6 < h && !nlVar.mo41085e(i2, i6) && l[3] < i3) {
                l[3] = l[3] + 1;
                i6++;
            }
            if (i6 != h && l[3] < i3) {
                while (i6 < h && nlVar.mo41085e(i2, i6) && l[4] < i3) {
                    l[4] = l[4] + 1;
                    i6++;
                }
                if (l[4] < i3 && Math.abs(((((l[0] + l[1]) + l[2]) + l[3]) + l[4]) - i4) * 5 < i4 * 2 && m57819j(l)) {
                    return m57816a(l, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: h */
    public final o31 mo40907h(Map<pf0, ?> map) throws tr2 {
        boolean z = map != null && map.containsKey(pf0.TRY_HARDER);
        int h = this.f32354a.mo41089h();
        int l = this.f32354a.mo41094l();
        int i = (h * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < h && !z2) {
            m57817f(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < l) {
                if (this.f32354a.mo41085e(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 != 4) {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                } else if (!m57819j(iArr) || !mo40912o(iArr, i2, i3)) {
                    m57818g(iArr);
                    i4 = 3;
                } else {
                    if (this.f32357a) {
                        z2 = mo40914q();
                    } else {
                        int i5 = mo40908i();
                        if (i5 > iArr[2]) {
                            i2 += (i5 - iArr[2]) - 2;
                            i3 = l - 1;
                        }
                    }
                    m57817f(iArr);
                    i = 2;
                    i4 = 0;
                }
                i3++;
            }
            if (m57819j(iArr) && mo40912o(iArr, i2, l)) {
                i = iArr[0];
                if (this.f32357a) {
                    z2 = mo40914q();
                }
            }
            i2 += i;
        }
        l31[] r = mo40915r();
        sl3.m64701e(r);
        return new o31(r);
    }

    /* renamed from: i */
    public final int mo40908i() {
        if (this.f32356a.size() <= 1) {
            return 0;
        }
        l31 l31 = null;
        for (l31 next : this.f32356a) {
            if (next.mo39635h() >= 2) {
                if (l31 == null) {
                    l31 = next;
                } else {
                    this.f32357a = true;
                    return ((int) (Math.abs(l31.mo44403c() - next.mo44403c()) - Math.abs(l31.mo44404d() - next.mo44404d()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: l */
    public final int[] mo40909l() {
        m57817f(this.f32358a);
        return this.f32358a;
    }

    /* renamed from: m */
    public final C6190nl mo40910m() {
        return this.f32354a;
    }

    /* renamed from: n */
    public final List<l31> mo40911n() {
        return this.f32356a;
    }

    /* renamed from: o */
    public final boolean mo40912o(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m57816a(iArr, i2);
        float e = mo40906e(i, a, iArr[2], i3);
        if (!Float.isNaN(e)) {
            int i4 = (int) e;
            float d = mo40905d(a, i4, iArr[2], i3);
            if (!Float.isNaN(d) && mo40904c(i4, (int) d)) {
                float f = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f32356a.size()) {
                        break;
                    }
                    l31 l31 = this.f32356a.get(i5);
                    if (l31.mo39633f(f, e, d)) {
                        this.f32356a.set(i5, l31.mo39634g(e, d, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    l31 l312 = new l31(d, e, f);
                    this.f32356a.add(l312);
                    tl3 tl3 = this.f32355a;
                    if (tl3 != null) {
                        tl3.mo35233a(l312);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: p */
    public final boolean mo40913p(int[] iArr, int i, int i2, boolean z) {
        return mo40912o(iArr, i, i2);
    }

    /* renamed from: q */
    public final boolean mo40914q() {
        int size = this.f32356a.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (l31 next : this.f32356a) {
            if (next.mo39635h() >= 2) {
                i++;
                f2 += next.mo39636i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (l31 i2 : this.f32356a) {
            f += Math.abs(i2.mo39636i() - f3);
        }
        return f <= f2 * 0.05f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c5 A[SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.l31[] mo40915r() throws com.onedelhi.secure.tr2 {
        /*
            r26 = this;
            r0 = r26
            java.util.List<com.onedelhi.secure.l31> r1 = r0.f32356a
            int r1 = r1.size()
            r2 = 3
            if (r1 < r2) goto L_0x00d7
            java.util.List<com.onedelhi.secure.l31> r1 = r0.f32356a
            com.onedelhi.secure.n31$b r3 = f32351a
            r1.sort(r3)
            com.onedelhi.secure.l31[] r1 = new com.onedelhi.secure.l31[r2]
            r2 = 0
            r5 = 0
            r6 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x001b:
            java.util.List<com.onedelhi.secure.l31> r8 = r0.f32356a
            int r8 = r8.size()
            r9 = 2
            int r8 = r8 - r9
            if (r5 >= r8) goto L_0x00c8
            java.util.List<com.onedelhi.secure.l31> r8 = r0.f32356a
            java.lang.Object r8 = r8.get(r5)
            com.onedelhi.secure.l31 r8 = (com.onedelhi.secure.l31) r8
            float r10 = r8.mo39636i()
            int r5 = r5 + 1
            r11 = r5
        L_0x0034:
            java.util.List<com.onedelhi.secure.l31> r12 = r0.f32356a
            int r12 = r12.size()
            r13 = 1
            int r12 = r12 - r13
            if (r11 >= r12) goto L_0x001b
            java.util.List<com.onedelhi.secure.l31> r12 = r0.f32356a
            java.lang.Object r12 = r12.get(r11)
            com.onedelhi.secure.l31 r12 = (com.onedelhi.secure.l31) r12
            double r14 = m57821t(r8, r12)
            int r11 = r11 + 1
            r3 = r11
        L_0x004d:
            java.util.List<com.onedelhi.secure.l31> r4 = r0.f32356a
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x0034
            java.util.List<com.onedelhi.secure.l31> r4 = r0.f32356a
            java.lang.Object r4 = r4.get(r3)
            com.onedelhi.secure.l31 r4 = (com.onedelhi.secure.l31) r4
            float r16 = r4.mo39636i()
            r17 = 1068708659(0x3fb33333, float:1.4)
            float r17 = r17 * r10
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 > 0) goto L_0x00c5
            double r16 = m57821t(r12, r4)
            double r18 = m57821t(r8, r4)
            int r20 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r20 >= 0) goto L_0x008d
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 <= 0) goto L_0x0084
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x0081
            r20 = r14
            goto L_0x00a5
        L_0x0081:
            r20 = r18
            goto L_0x0099
        L_0x0084:
            r20 = r14
            r24 = r16
            r16 = r18
            r18 = r24
            goto L_0x00a5
        L_0x008d:
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x009f
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x009c
            r20 = r16
            r16 = r18
        L_0x0099:
            r18 = r14
            goto L_0x00a5
        L_0x009c:
            r20 = r16
            goto L_0x00a3
        L_0x009f:
            r20 = r18
            r18 = r16
        L_0x00a3:
            r16 = r14
        L_0x00a5:
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r18 * r22
            double r18 = r16 - r18
            double r18 = java.lang.Math.abs(r18)
            double r20 = r20 * r22
            double r16 = r16 - r20
            double r16 = java.lang.Math.abs(r16)
            double r18 = r18 + r16
            int r16 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x00c5
            r1[r2] = r8
            r1[r13] = r12
            r1[r9] = r4
            r6 = r18
        L_0x00c5:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x00c8:
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00d2
            return r1
        L_0x00d2:
            com.onedelhi.secure.tr2 r1 = com.onedelhi.secure.tr2.m66179a()
            throw r1
        L_0x00d7:
            com.onedelhi.secure.tr2 r1 = com.onedelhi.secure.tr2.m66179a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.n31.mo40915r():com.onedelhi.secure.l31[]");
    }

    @Deprecated
    /* renamed from: s */
    public final void mo40916s(int[] iArr) {
        m57818g(iArr);
    }
}

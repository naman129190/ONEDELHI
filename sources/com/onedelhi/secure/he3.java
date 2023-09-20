package com.onedelhi.secure;

import easypay.appinvoke.manager.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class he3 extends C5470h1 {

    /* renamed from: a */
    public static final int[][] f29580a = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: e */
    public static final int[] f29581e = {1, 10, 34, 70, 126};

    /* renamed from: f */
    public static final int[] f29582f = {4, 20, 48, 81};

    /* renamed from: g */
    public static final int[] f29583g = {0, Constants.ACTION_NB_WV_LOGIN_CLICKED, 961, 2015, 2715};

    /* renamed from: h */
    public static final int[] f29584h = {0, 336, 1036, 1516};

    /* renamed from: i */
    public static final int[] f29585i = {8, 6, 4, 3, 1};

    /* renamed from: j */
    public static final int[] f29586j = {2, 4, 6, 8};

    /* renamed from: a */
    public final List<dy2> f29587a = new ArrayList();

    /* renamed from: b */
    public final List<dy2> f29588b = new ArrayList();

    /* renamed from: s */
    public static void m50472s(Collection<dy2> collection, dy2 dy2) {
        if (dy2 != null) {
            boolean z = false;
            Iterator<dy2> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dy2 next = it.next();
                if (next.mo39212b() == dy2.mo39212b()) {
                    next.mo34719e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dy2);
            }
        }
    }

    /* renamed from: u */
    public static boolean m50473u(dy2 dy2, dy2 dy22) {
        int a = (dy2.mo39211a() + (dy22.mo39211a() * 16)) % 79;
        int c = (dy2.mo34718d().mo40461c() * 9) + dy22.mo34718d().mo40461c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return a == c;
    }

    /* renamed from: v */
    public static ol3 m50474v(dy2 dy2, dy2 dy22) {
        String valueOf = String.valueOf((((long) dy2.mo39212b()) * 4537077) + ((long) dy22.mo39212b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        sl3[] a = dy2.mo34718d().mo40459a();
        sl3[] a2 = dy22.mo34718d().mo40459a();
        return new ol3(sb.toString(), (byte[]) null, new sl3[]{a[0], a[1], a2[0], a2[1]}, C7363yi.RSS_14);
    }

    /* renamed from: c */
    public ol3 mo31296c(int i, C6014ll llVar, Map<pf0, ?> map) throws tr2 {
        m50472s(this.f29587a, mo37280x(llVar, false, i, map));
        llVar.mo39938p();
        m50472s(this.f29588b, mo37280x(llVar, true, i, map));
        llVar.mo39938p();
        for (dy2 next : this.f29587a) {
            if (next.mo34717c() > 1) {
                for (dy2 next2 : this.f29588b) {
                    if (next2.mo34717c() > 1 && m50473u(next, next2)) {
                        return m50474v(next, next2);
                    }
                }
                continue;
            }
        }
        throw tr2.m66179a();
    }

    public void reset() {
        this.f29587a.clear();
        this.f29588b.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r5 = false;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37278t(boolean r10, int r11) throws com.onedelhi.secure.tr2 {
        /*
            r9 = this;
            int[] r0 = r9.mo37114n()
            int r0 = com.onedelhi.secure.qf2.m62734d(r0)
            int[] r1 = r9.mo37112l()
            int r1 = com.onedelhi.secure.qf2.m62734d(r1)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0028
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r6 = 0
            r7 = 1
            goto L_0x0022
        L_0x001c:
            if (r0 >= r2) goto L_0x0020
            r6 = 1
            goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r1 <= r5) goto L_0x0025
            goto L_0x003a
        L_0x0025:
            if (r1 >= r2) goto L_0x0041
            goto L_0x003f
        L_0x0028:
            r5 = 11
            if (r0 <= r5) goto L_0x002f
            r6 = 0
            r7 = 1
            goto L_0x0036
        L_0x002f:
            r5 = 5
            if (r0 >= r5) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            r7 = 0
        L_0x0036:
            r5 = 10
            if (r1 <= r5) goto L_0x003d
        L_0x003a:
            r2 = 0
            r5 = 1
            goto L_0x0043
        L_0x003d:
            if (r1 >= r2) goto L_0x0041
        L_0x003f:
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            r5 = 0
        L_0x0043:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x004c
            r10 = 1
            goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            r11 = r1 & 1
            if (r11 != r4) goto L_0x0052
            r3 = 1
        L_0x0052:
            r11 = -1
            if (r8 == r11) goto L_0x008c
            if (r8 == 0) goto L_0x0074
            if (r8 != r4) goto L_0x006f
            if (r10 == 0) goto L_0x0065
            if (r3 != 0) goto L_0x0060
            r4 = r6
        L_0x005e:
            r7 = 1
            goto L_0x009a
        L_0x0060:
            com.onedelhi.secure.tr2 r10 = com.onedelhi.secure.tr2.m66179a()
            throw r10
        L_0x0065:
            if (r3 == 0) goto L_0x006a
            r4 = r6
        L_0x0068:
            r5 = 1
            goto L_0x009a
        L_0x006a:
            com.onedelhi.secure.tr2 r10 = com.onedelhi.secure.tr2.m66179a()
            throw r10
        L_0x006f:
            com.onedelhi.secure.tr2 r10 = com.onedelhi.secure.tr2.m66179a()
            throw r10
        L_0x0074:
            if (r10 == 0) goto L_0x0083
            if (r3 == 0) goto L_0x007e
            if (r0 >= r1) goto L_0x007b
            goto L_0x0068
        L_0x007b:
            r4 = r6
            r2 = 1
            goto L_0x005e
        L_0x007e:
            com.onedelhi.secure.tr2 r10 = com.onedelhi.secure.tr2.m66179a()
            throw r10
        L_0x0083:
            if (r3 != 0) goto L_0x0087
            r4 = r6
            goto L_0x009a
        L_0x0087:
            com.onedelhi.secure.tr2 r10 = com.onedelhi.secure.tr2.m66179a()
            throw r10
        L_0x008c:
            if (r10 == 0) goto L_0x0096
            if (r3 != 0) goto L_0x0091
            goto L_0x009a
        L_0x0091:
            com.onedelhi.secure.tr2 r10 = com.onedelhi.secure.tr2.m66179a()
            throw r10
        L_0x0096:
            if (r3 == 0) goto L_0x00df
            r4 = r6
            r2 = 1
        L_0x009a:
            if (r4 == 0) goto L_0x00af
            if (r7 != 0) goto L_0x00aa
            int[] r10 = r9.mo37114n()
            float[] r11 = r9.mo37115o()
            com.onedelhi.secure.C5470h1.m50095p(r10, r11)
            goto L_0x00af
        L_0x00aa:
            com.onedelhi.secure.tr2 r10 = com.onedelhi.secure.tr2.m66179a()
            throw r10
        L_0x00af:
            if (r7 == 0) goto L_0x00bc
            int[] r10 = r9.mo37114n()
            float[] r11 = r9.mo37115o()
            com.onedelhi.secure.C5470h1.m50094i(r10, r11)
        L_0x00bc:
            if (r2 == 0) goto L_0x00d1
            if (r5 != 0) goto L_0x00cc
            int[] r10 = r9.mo37112l()
            float[] r11 = r9.mo37115o()
            com.onedelhi.secure.C5470h1.m50095p(r10, r11)
            goto L_0x00d1
        L_0x00cc:
            com.onedelhi.secure.tr2 r10 = com.onedelhi.secure.tr2.m66179a()
            throw r10
        L_0x00d1:
            if (r5 == 0) goto L_0x00de
            int[] r10 = r9.mo37112l()
            float[] r11 = r9.mo37113m()
            com.onedelhi.secure.C5470h1.m50094i(r10, r11)
        L_0x00de:
            return
        L_0x00df:
            com.onedelhi.secure.tr2 r10 = com.onedelhi.secure.tr2.m66179a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.he3.mo37278t(boolean, int):void");
    }

    /* renamed from: w */
    public final kd0 mo37279w(C6014ll llVar, m31 m31, boolean z) throws tr2 {
        int[] j = mo37110j();
        Arrays.fill(j, 0);
        int[] b = m31.mo40460b();
        if (z) {
            rv2.m63924g(llVar, b[0], j);
        } else {
            rv2.m63923f(llVar, b[1], j);
            int i = 0;
            for (int length = j.length - 1; i < length; length--) {
                int i2 = j[i];
                j[i] = j[length];
                j[length] = i2;
                i++;
            }
        }
        int i3 = z ? 16 : 15;
        float d = ((float) qf2.m62734d(j)) / ((float) i3);
        int[] n = mo37114n();
        int[] l = mo37112l();
        float[] o = mo37115o();
        float[] m = mo37113m();
        for (int i4 = 0; i4 < j.length; i4++) {
            float f = ((float) j[i4]) / d;
            int i5 = (int) (0.5f + f);
            if (i5 <= 0) {
                i5 = 1;
            } else if (i5 > 8) {
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                n[i6] = i5;
                o[i6] = f - ((float) i5);
            } else {
                l[i6] = i5;
                m[i6] = f - ((float) i5);
            }
        }
        mo37278t(z, i3);
        int i7 = 0;
        int i8 = 0;
        for (int length2 = n.length - 1; length2 >= 0; length2--) {
            i7 = (i7 * 9) + n[length2];
            i8 += n[length2];
        }
        int i9 = 0;
        int i10 = 0;
        for (int length3 = l.length - 1; length3 >= 0; length3--) {
            i9 = (i9 * 9) + l[length3];
            i10 += l[length3];
        }
        int i11 = i7 + (i9 * 3);
        if (z) {
            if ((i8 & 1) != 0 || i8 > 12 || i8 < 4) {
                throw tr2.m66179a();
            }
            int i12 = (12 - i8) / 2;
            int i13 = f29585i[i12];
            return new kd0((je3.m53283b(n, i13, false) * f29581e[i12]) + je3.m53283b(l, 9 - i13, true) + f29583g[i12], i11);
        } else if ((i10 & 1) != 0 || i10 > 10 || i10 < 4) {
            throw tr2.m66179a();
        } else {
            int i14 = (10 - i10) / 2;
            int i15 = f29586j[i14];
            return new kd0((je3.m53283b(l, 9 - i15, false) * f29582f[i14]) + je3.m53283b(n, i15, true) + f29584h[i14], i11);
        }
    }

    /* renamed from: x */
    public final dy2 mo37280x(C6014ll llVar, boolean z, int i, Map<pf0, ?> map) {
        try {
            m31 z2 = mo37282z(llVar, i, z, mo37281y(llVar, z));
            tl3 tl3 = map == null ? null : (tl3) map.get(pf0.NEED_RESULT_POINT_CALLBACK);
            if (tl3 != null) {
                int[] b = z2.mo40460b();
                float f = ((float) ((b[0] + b[1]) - 1)) / 2.0f;
                if (z) {
                    f = ((float) (llVar.mo39935l() - 1)) - f;
                }
                tl3.mo35233a(new sl3(f, (float) i));
            }
            kd0 w = mo37279w(llVar, z2, true);
            kd0 w2 = mo37279w(llVar, z2, false);
            return new dy2((w.mo39212b() * 1597) + w2.mo39212b(), w.mo39211a() + (w2.mo39211a() * 4), z2);
        } catch (tr2 unused) {
            return null;
        }
    }

    /* renamed from: y */
    public final int[] mo37281y(C6014ll llVar, boolean z) throws tr2 {
        int[] k = mo37111k();
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        int l = llVar.mo39935l();
        int i = 0;
        boolean z2 = false;
        while (i < l) {
            z2 = !llVar.mo39930h(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = i;
        int i3 = 0;
        while (i < l) {
            if (llVar.mo39930h(i) != z2) {
                k[i3] = k[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else if (C5470h1.m50096q(k)) {
                    return new int[]{i2, i};
                } else {
                    i2 += k[0] + k[1];
                    k[0] = k[2];
                    k[1] = k[3];
                    k[2] = 0;
                    k[3] = 0;
                    i3--;
                }
                k[i3] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw tr2.m66179a();
    }

    /* renamed from: z */
    public final m31 mo37282z(C6014ll llVar, int i, boolean z, int[] iArr) throws tr2 {
        int i2;
        int i3;
        boolean h = llVar.mo39930h(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && h != llVar.mo39930h(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] k = mo37111k();
        System.arraycopy(k, 0, k, 1, k.length - 1);
        k[0] = iArr[0] - i5;
        int r = C5470h1.m50097r(k, f29580a);
        int i6 = iArr[1];
        if (z) {
            i2 = (llVar.mo39935l() - 1) - i6;
            i3 = (llVar.mo39935l() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new m31(r, new int[]{i5, iArr[1]}, i3, i2, i);
    }
}

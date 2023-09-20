package com.onedelhi.secure;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import easypay.appinvoke.manager.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ie3 extends C5470h1 {

    /* renamed from: a */
    public static final int f30279a = 0;

    /* renamed from: a */
    public static final int[][] f30280a = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: b */
    public static final int f30281b = 1;

    /* renamed from: b */
    public static final int[][] f30282b = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{ci1.f10300r, Constants.ACTION_SAVE_CUST_ID, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, Constants.ACTION_INCORRECT_OTP, 52, Constants.ACTION_DELAY_PASSWORD_FOUND}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, Constants.ACTION_REMOVE_NB_LAYOUT, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, Constants.ACTION_NB_REMOVE_LOADER}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, Constants.ACTION_PASSWORD_VIEWER, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, Constants.ACTION_PASSWORD_FOUND, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, HideBottomViewOnScrollBehavior.f7732e}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{Constants.ACTION_NB_WV_LOGIN_CLICKED, 61, 183, 127, 170, 88, 53, Constants.ACTION_NB_NEXT_BTN_CLICKED}, new int[]{55, Constants.ACTION_WEB_OPTIMIZATION_EXECUTED, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: c */
    public static final int f30283c = 2;

    /* renamed from: c */
    public static final int[][] f30284c = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: d */
    public static final int f30285d = 3;

    /* renamed from: e */
    public static final int f30286e = 4;

    /* renamed from: f */
    public static final int f30287f = 5;

    /* renamed from: f */
    public static final int[] f30288f = {7, 5, 4, 3, 1};

    /* renamed from: g */
    public static final int f30289g = 11;

    /* renamed from: g */
    public static final int[] f30290g = {4, 20, 52, 104, 204};

    /* renamed from: h */
    public static final int[] f30291h = {0, 348, 1388, 2948, 3988};

    /* renamed from: a */
    public final List<ux0> f30292a = new ArrayList(11);

    /* renamed from: a */
    public boolean f30293a;

    /* renamed from: b */
    public final List<xx0> f30294b = new ArrayList();

    /* renamed from: e */
    public final int[] f30295e = new int[2];

    /* renamed from: A */
    public static int m52161A(C6014ll llVar, int i) {
        return llVar.mo39930h(i) ? llVar.mo39933j(llVar.mo39934k(i)) : llVar.mo39934k(llVar.mo39933j(i));
    }

    /* renamed from: C */
    public static boolean m52162C(m31 m31, boolean z, boolean z2) {
        return m31.mo40461c() != 0 || !z || !z2;
    }

    /* renamed from: D */
    public static boolean m52163D(Iterable<ux0> iterable, Iterable<xx0> iterable2) {
        boolean z;
        boolean z2;
        Iterator<xx0> it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                xx0 next = it.next();
                Iterator<ux0> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    ux0 next2 = it2.next();
                    Iterator<ux0> it3 = next.mo47430a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: E */
    public static boolean m52164E(List<ux0> list) {
        boolean z;
        for (int[] iArr : f30284c) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).mo45858a().mo40461c() != iArr[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: G */
    public static void m52165G(Collection<ux0> collection, Collection<xx0> collection2) {
        Iterator<xx0> it = collection2.iterator();
        while (it.hasNext()) {
            xx0 next = it.next();
            if (next.mo47430a().size() != collection.size()) {
                boolean z = true;
                Iterator<ux0> it2 = next.mo47430a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!collection.contains(it2.next())) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: I */
    public static void m52166I(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: w */
    public static ol3 m52167w(List<ux0> list) throws tr2, ha1 {
        String d = C6491q0.m61792a(C6125ml.m57414a(list)).mo41503d();
        sl3[] a = list.get(0).mo45858a().mo40459a();
        sl3[] a2 = list.get(list.size() - 1).mo45858a().mo40459a();
        return new ol3(d, (byte[]) null, new sl3[]{a[0], a[1], a2[0], a2[1]}, C7363yi.RSS_EXPANDED);
    }

    /* renamed from: B */
    public List<xx0> mo38029B() {
        return this.f30294b;
    }

    /* renamed from: F */
    public final m31 mo38030F(C6014ll llVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f30295e[0] - 1;
            while (i5 >= 0 && !llVar.mo39930h(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f30295e;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f30295e;
            int i7 = iArr2[0];
            int k = llVar.mo39934k(iArr2[1] + 1);
            i2 = k;
            i3 = i7;
            i4 = k - this.f30295e[1];
        }
        int[] k2 = mo37111k();
        System.arraycopy(k2, 0, k2, 1, k2.length - 1);
        k2[0] = i4;
        try {
            return new m31(C5470h1.m50097r(k2, f30280a), new int[]{i3, i2}, i3, i2, i);
        } catch (tr2 unused) {
            return null;
        }
    }

    /* renamed from: H */
    public ux0 mo38031H(C6014ll llVar, List<ux0> list, int i) throws tr2 {
        m31 F;
        kd0 kd0;
        boolean z = list.size() % 2 == 0;
        if (this.f30293a) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            mo38039z(llVar, list, i2);
            F = mo38030F(llVar, i, z);
            if (F == null) {
                i2 = m52161A(llVar, this.f30295e[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        kd0 x = mo38037x(llVar, F, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).mo45861d()) {
            try {
                kd0 = mo38037x(llVar, F, z, false);
            } catch (tr2 unused) {
                kd0 = null;
            }
            return new ux0(x, kd0, F);
        }
        throw tr2.m66179a();
    }

    /* renamed from: J */
    public final void mo38032J(int i) {
        boolean z;
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            if (i2 >= this.f30294b.size()) {
                z = false;
                break;
            }
            xx0 xx0 = this.f30294b.get(i2);
            if (xx0.mo47431b() > i) {
                z = xx0.mo47432c(this.f30292a);
                break;
            } else {
                z2 = xx0.mo47432c(this.f30292a);
                i2++;
            }
        }
        if (!z && !z2 && !m52163D(this.f30292a, this.f30294b)) {
            this.f30294b.add(i2, new xx0(this.f30292a, i, false));
            m52165G(this.f30292a, this.f30294b);
        }
    }

    /* renamed from: c */
    public ol3 mo31296c(int i, C6014ll llVar, Map<pf0, ?> map) throws tr2, ha1 {
        this.f30292a.clear();
        this.f30293a = false;
        try {
            return m52167w(mo38038y(i, llVar));
        } catch (tr2 unused) {
            this.f30292a.clear();
            this.f30293a = true;
            return m52167w(mo38038y(i, llVar));
        }
    }

    public void reset() {
        this.f30292a.clear();
        this.f30294b.clear();
    }

    /* renamed from: s */
    public final void mo38033s(int i) throws tr2 {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int d = qf2.m62734d(mo37114n());
        int d2 = qf2.m62734d(mo37112l());
        boolean z5 = false;
        boolean z6 = true;
        if (d > 13) {
            z2 = false;
            z = true;
        } else {
            z2 = d < 4;
            z = false;
        }
        if (d2 > 13) {
            z4 = false;
            z3 = true;
        } else {
            z4 = d2 < 4;
            z3 = false;
        }
        int i2 = (d + d2) - i;
        boolean z7 = (d & 1) == 1;
        if ((d2 & 1) == 0) {
            z5 = true;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw tr2.m66179a();
                } else if (z7) {
                    if (!z5) {
                        z6 = z2;
                    } else {
                        throw tr2.m66179a();
                    }
                } else if (z5) {
                    z6 = z2;
                    z3 = true;
                } else {
                    throw tr2.m66179a();
                }
            } else if (z7) {
                if (z5) {
                    if (d >= d2) {
                        z6 = z2;
                        z4 = true;
                    }
                    z3 = true;
                } else {
                    throw tr2.m66179a();
                }
            } else if (!z5) {
                z6 = z2;
            } else {
                throw tr2.m66179a();
            }
            z = true;
        } else if (z7) {
            if (z5) {
                throw tr2.m66179a();
            }
        } else if (z5) {
            z6 = z2;
            z4 = true;
        } else {
            throw tr2.m66179a();
        }
        if (z6) {
            if (!z) {
                C5470h1.m50095p(mo37114n(), mo37115o());
            } else {
                throw tr2.m66179a();
            }
        }
        if (z) {
            C5470h1.m50094i(mo37114n(), mo37115o());
        }
        if (z4) {
            if (!z3) {
                C5470h1.m50095p(mo37112l(), mo37115o());
            } else {
                throw tr2.m66179a();
            }
        }
        if (z3) {
            C5470h1.m50094i(mo37112l(), mo37113m());
        }
    }

    /* renamed from: t */
    public final boolean mo38034t() {
        ux0 ux0 = this.f30292a.get(0);
        kd0 b = ux0.mo45859b();
        kd0 c = ux0.mo45860c();
        if (c == null) {
            return false;
        }
        int a = c.mo39211a();
        int i = 2;
        for (int i2 = 1; i2 < this.f30292a.size(); i2++) {
            ux0 ux02 = this.f30292a.get(i2);
            a += ux02.mo45859b().mo39211a();
            i++;
            kd0 c2 = ux02.mo45860c();
            if (c2 != null) {
                a += c2.mo39211a();
                i++;
            }
        }
        return ((i + -4) * 211) + (a % 211) == b.mo39212b();
    }

    /* renamed from: u */
    public final List<ux0> mo38035u(List<xx0> list, int i) throws tr2 {
        while (i < this.f30294b.size()) {
            xx0 xx0 = this.f30294b.get(i);
            this.f30292a.clear();
            for (xx0 a : list) {
                this.f30292a.addAll(a.mo47430a());
            }
            this.f30292a.addAll(xx0.mo47430a());
            if (!m52164E(this.f30292a)) {
                i++;
            } else if (mo38034t()) {
                return this.f30292a;
            } else {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(xx0);
                try {
                    return mo38035u(arrayList, i + 1);
                } catch (tr2 unused) {
                }
            }
        }
        throw tr2.m66179a();
    }

    /* renamed from: v */
    public final List<ux0> mo38036v(boolean z) {
        List<ux0> list = null;
        if (this.f30294b.size() > 25) {
            this.f30294b.clear();
            return null;
        }
        this.f30292a.clear();
        if (z) {
            Collections.reverse(this.f30294b);
        }
        try {
            list = mo38035u(new ArrayList(), 0);
        } catch (tr2 unused) {
        }
        if (z) {
            Collections.reverse(this.f30294b);
        }
        return list;
    }

    /* renamed from: x */
    public kd0 mo38037x(C6014ll llVar, m31 m31, boolean z, boolean z2) throws tr2 {
        C6014ll llVar2 = llVar;
        int[] j = mo37110j();
        Arrays.fill(j, 0);
        int[] b = m31.mo40460b();
        if (z2) {
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
        float d = ((float) qf2.m62734d(j)) / 17.0f;
        float f = ((float) (m31.mo40460b()[1] - m31.mo40460b()[0])) / 15.0f;
        if (Math.abs(d - f) / f <= 0.3f) {
            int[] n = mo37114n();
            int[] l = mo37112l();
            float[] o = mo37115o();
            float[] m = mo37113m();
            for (int i3 = 0; i3 < j.length; i3++) {
                float f2 = (((float) j[i3]) * 1.0f) / d;
                int i4 = (int) (0.5f + f2);
                if (i4 <= 0) {
                    if (f2 >= 0.3f) {
                        i4 = 1;
                    } else {
                        throw tr2.m66179a();
                    }
                } else if (i4 > 8) {
                    if (f2 <= 8.7f) {
                        i4 = 8;
                    } else {
                        throw tr2.m66179a();
                    }
                }
                int i5 = i3 / 2;
                if ((i3 & 1) == 0) {
                    n[i5] = i4;
                    o[i5] = f2 - ((float) i4);
                } else {
                    l[i5] = i4;
                    m[i5] = f2 - ((float) i4);
                }
            }
            mo38033s(17);
            int c = (((m31.mo40461c() * 4) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i6 = 0;
            int i7 = 0;
            for (int length2 = n.length - 1; length2 >= 0; length2--) {
                if (m52162C(m31, z, z2)) {
                    i6 += n[length2] * f30282b[c][length2 * 2];
                }
                i7 += n[length2];
            }
            int i8 = 0;
            for (int length3 = l.length - 1; length3 >= 0; length3--) {
                if (m52162C(m31, z, z2)) {
                    i8 += l[length3] * f30282b[c][(length3 * 2) + 1];
                }
            }
            int i9 = i6 + i8;
            if ((i7 & 1) != 0 || i7 > 13 || i7 < 4) {
                throw tr2.m66179a();
            }
            int i10 = (13 - i7) / 2;
            int i11 = f30288f[i10];
            return new kd0((je3.m53283b(n, i11, true) * f30290g[i10]) + je3.m53283b(l, 9 - i11, false) + f30291h[i10], i9);
        }
        throw tr2.m66179a();
    }

    /* renamed from: y */
    public List<ux0> mo38038y(int i, C6014ll llVar) throws tr2 {
        boolean z = false;
        while (!z) {
            try {
                List<ux0> list = this.f30292a;
                list.add(mo38031H(llVar, list, i));
            } catch (tr2 e) {
                if (!this.f30292a.isEmpty()) {
                    z = true;
                } else {
                    throw e;
                }
            }
        }
        if (mo38034t()) {
            return this.f30292a;
        }
        boolean z2 = !this.f30294b.isEmpty();
        mo38032J(i);
        if (z2) {
            List<ux0> v = mo38036v(false);
            if (v != null) {
                return v;
            }
            List<ux0> v2 = mo38036v(true);
            if (v2 != null) {
                return v2;
            }
        }
        throw tr2.m66179a();
    }

    /* renamed from: z */
    public final void mo38039z(C6014ll llVar, List<ux0> list, int i) throws tr2 {
        int[] k = mo37111k();
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        int l = llVar.mo39935l();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).mo45858a().mo40460b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.f30293a) {
            z = !z;
        }
        boolean z2 = false;
        while (i < l) {
            z2 = !llVar.mo39930h(i);
            if (!z2) {
                break;
            }
            i++;
        }
        boolean z3 = z2;
        int i2 = 0;
        int i3 = i;
        while (i < l) {
            if (llVar.mo39930h(i) != z3) {
                k[i2] = k[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m52166I(k);
                    }
                    if (C5470h1.m50096q(k)) {
                        int[] iArr = this.f30295e;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m52166I(k);
                    }
                    i3 += k[0] + k[1];
                    k[0] = k[2];
                    k[1] = k[3];
                    k[2] = 0;
                    k[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                k[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw tr2.m66179a();
    }
}

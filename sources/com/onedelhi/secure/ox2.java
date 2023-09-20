package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Map;

public final class ox2 implements uf3, gm2 {

    /* renamed from: a */
    public static final ol3[] f33380a = new ol3[0];

    /* renamed from: e */
    public static ol3[] m60295e(C6969uk ukVar, Map<pf0, ?> map, boolean z) throws tr2, ha1, C6619qx {
        ArrayList arrayList = new ArrayList();
        lx2 b = lk0.m55714b(ukVar, map, z);
        for (sl3[] next : b.mo40307b()) {
            gg0 i = qx2.m63252i(b.mo40306a(), next[4], next[5], next[6], next[7], m60298h(next), m60296f(next));
            ol3 ol3 = new ol3(i.mo36726j(), i.mo36723g(), next, C7363yi.PDF_417);
            ol3.mo41832j(ql3.ERROR_CORRECTION_LEVEL, i.mo36718b());
            px2 px2 = (px2) i.mo36722f();
            if (px2 != null) {
                ol3.mo41832j(ql3.PDF417_EXTRA_METADATA, px2);
            }
            arrayList.add(ol3);
        }
        return (ol3[]) arrayList.toArray(f33380a);
    }

    /* renamed from: f */
    public static int m60296f(sl3[] sl3Arr) {
        return Math.max(Math.max(m60297g(sl3Arr[0], sl3Arr[4]), (m60297g(sl3Arr[6], sl3Arr[2]) * 17) / 18), Math.max(m60297g(sl3Arr[1], sl3Arr[5]), (m60297g(sl3Arr[7], sl3Arr[3]) * 17) / 18));
    }

    /* renamed from: g */
    public static int m60297g(sl3 sl3, sl3 sl32) {
        if (sl3 == null || sl32 == null) {
            return 0;
        }
        return (int) Math.abs(sl3.mo44403c() - sl32.mo44403c());
    }

    /* renamed from: h */
    public static int m60298h(sl3[] sl3Arr) {
        return Math.min(Math.min(m60299i(sl3Arr[0], sl3Arr[4]), (m60299i(sl3Arr[6], sl3Arr[2]) * 17) / 18), Math.min(m60299i(sl3Arr[1], sl3Arr[5]), (m60299i(sl3Arr[7], sl3Arr[3]) * 17) / 18));
    }

    /* renamed from: i */
    public static int m60299i(sl3 sl3, sl3 sl32) {
        if (sl3 == null || sl32 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(sl3.mo44403c() - sl32.mo44403c());
    }

    /* renamed from: a */
    public ol3 mo34501a(C6969uk ukVar) throws tr2, ha1, C6619qx {
        return mo34502b(ukVar, (Map<pf0, ?>) null);
    }

    /* renamed from: b */
    public ol3 mo34502b(C6969uk ukVar, Map<pf0, ?> map) throws tr2, ha1, C6619qx {
        ol3[] e = m60295e(ukVar, map, false);
        if (e.length != 0 && e[0] != null) {
            return e[0];
        }
        throw tr2.m66179a();
    }

    /* renamed from: c */
    public ol3[] mo36787c(C6969uk ukVar) throws tr2 {
        return mo36788d(ukVar, (Map<pf0, ?>) null);
    }

    /* renamed from: d */
    public ol3[] mo36788d(C6969uk ukVar, Map<pf0, ?> map) throws tr2 {
        try {
            return m60295e(ukVar, map, true);
        } catch (ha1 | C6619qx unused) {
            throw tr2.m66179a();
        }
    }

    public void reset() {
    }
}

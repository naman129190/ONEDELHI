package com.onedelhi.secure;

import java.util.Map;

public final class xf2 implements uf3 {

    /* renamed from: a */
    public static final int f37433a = 30;

    /* renamed from: a */
    public static final sl3[] f37434a = new sl3[0];

    /* renamed from: b */
    public static final int f37435b = 33;

    /* renamed from: a */
    public final cg0 f37436a = new cg0();

    /* renamed from: c */
    public static C6190nl m70212c(C6190nl nlVar) throws tr2 {
        int[] g = nlVar.mo41088g();
        if (g != null) {
            int i = g[0];
            int i2 = g[1];
            int i3 = g[2];
            int i4 = g[3];
            C6190nl nlVar2 = new C6190nl(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (nlVar.mo41085e(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        nlVar2.mo41096p(i7, i5);
                    }
                }
            }
            return nlVar2;
        }
        throw tr2.m66179a();
    }

    /* renamed from: a */
    public ol3 mo34501a(C6969uk ukVar) throws tr2, C6619qx, ha1 {
        return mo34502b(ukVar, (Map<pf0, ?>) null);
    }

    /* renamed from: b */
    public ol3 mo34502b(C6969uk ukVar, Map<pf0, ?> map) throws tr2, C6619qx, ha1 {
        gg0 c = this.f37436a.mo32365c(m70212c(ukVar.mo45634b()), map);
        ol3 ol3 = new ol3(c.mo36726j(), c.mo36723g(), f37434a, C7363yi.MAXICODE);
        String b = c.mo36718b();
        if (b != null) {
            ol3.mo41832j(ql3.ERROR_CORRECTION_LEVEL, b);
        }
        return ol3;
    }

    public void reset() {
    }
}

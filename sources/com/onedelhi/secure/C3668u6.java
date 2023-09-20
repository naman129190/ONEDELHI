package com.onedelhi.secure;

import com.onedelhi.secure.wv1;
import java.io.IOException;

/* renamed from: com.onedelhi.secure.u6 */
public class C3668u6 {

    /* renamed from: a */
    public static wv1.C3876a f21221a = wv1.C3876a.m31144a("a");

    /* renamed from: b */
    public static wv1.C3876a f21222b = wv1.C3876a.m31144a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static C3566t6 m29084a(wv1 wv1, la2 la2) throws IOException {
        wv1.mo17965c();
        C3566t6 t6Var = null;
        while (wv1.mo17970h()) {
            if (wv1.mo17956M(f21221a) != 0) {
                wv1.mo17962X();
                wv1.mo17963Y();
            } else {
                t6Var = m29085b(wv1, la2);
            }
        }
        wv1.mo17969g();
        return t6Var == null ? new C3566t6((C2398i6) null, (C2398i6) null, (C2475j6) null, (C2475j6) null) : t6Var;
    }

    /* renamed from: b */
    public static C3566t6 m29085b(wv1 wv1, la2 la2) throws IOException {
        wv1.mo17965c();
        C2398i6 i6Var = null;
        C2398i6 i6Var2 = null;
        C2475j6 j6Var = null;
        C2475j6 j6Var2 = null;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f21222b);
            if (M == 0) {
                i6Var = C3976y6.m31966c(wv1, la2);
            } else if (M == 1) {
                i6Var2 = C3976y6.m31966c(wv1, la2);
            } else if (M == 2) {
                j6Var = C3976y6.m31968e(wv1, la2);
            } else if (M != 3) {
                wv1.mo17962X();
                wv1.mo17963Y();
            } else {
                j6Var2 = C3976y6.m31968e(wv1, la2);
            }
        }
        wv1.mo17969g();
        return new C3566t6(i6Var, i6Var2, j6Var, j6Var2);
    }
}

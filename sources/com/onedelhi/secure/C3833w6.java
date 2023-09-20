package com.onedelhi.secure;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.onedelhi.secure.wv1;
import java.io.IOException;

/* renamed from: com.onedelhi.secure.w6 */
public class C3833w6 {

    /* renamed from: a */
    public static wv1.C3876a f22050a = wv1.C3876a.m31144a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    public static wv1.C3876a f22051b = wv1.C3876a.m31144a("k");

    /* renamed from: a */
    public static boolean m30686a(C2833m6 m6Var) {
        return m6Var == null || (m6Var.mo17292b() && ((PointF) m6Var.mo17293c().get(0).f11775a).equals(0.0f, 0.0f));
    }

    /* renamed from: b */
    public static boolean m30687b(C3900x6<PointF, PointF> x6Var) {
        return x6Var == null || (!(x6Var instanceof C3367r6) && x6Var.mo17292b() && ((PointF) x6Var.mo17293c().get(0).f11775a).equals(0.0f, 0.0f));
    }

    /* renamed from: c */
    public static boolean m30688c(C2475j6 j6Var) {
        return j6Var == null || (j6Var.mo17292b() && ((Float) ((ez1) j6Var.mo17293c().get(0)).f11775a).floatValue() == 0.0f);
    }

    /* renamed from: d */
    public static boolean m30689d(C3127p6 p6Var) {
        return p6Var == null || (p6Var.mo17292b() && ((jr3) ((ez1) p6Var.mo17293c().get(0)).f11775a).mo18552a(1.0f, 1.0f));
    }

    /* renamed from: e */
    public static boolean m30690e(C2475j6 j6Var) {
        return j6Var == null || (j6Var.mo17292b() && ((Float) ((ez1) j6Var.mo17293c().get(0)).f11775a).floatValue() == 0.0f);
    }

    /* renamed from: f */
    public static boolean m30691f(C2475j6 j6Var) {
        return j6Var == null || (j6Var.mo17292b() && ((Float) ((ez1) j6Var.mo17293c().get(0)).f11775a).floatValue() == 0.0f);
    }

    /* renamed from: g */
    public static C3766v6 m30692g(wv1 wv1, la2 la2) throws IOException {
        wv1 wv12 = wv1;
        la2 la22 = la2;
        boolean z = false;
        boolean z2 = wv1.mo17955H() == wv1.C3877b.BEGIN_OBJECT;
        if (z2) {
            wv1.mo17965c();
        }
        C2475j6 j6Var = null;
        C2833m6 m6Var = null;
        C3900x6<PointF, PointF> x6Var = null;
        C3127p6 p6Var = null;
        C2475j6 j6Var2 = null;
        C2475j6 j6Var3 = null;
        C2695l6 l6Var = null;
        C2475j6 j6Var4 = null;
        C2475j6 j6Var5 = null;
        while (wv1.mo17970h()) {
            switch (wv12.mo17956M(f22050a)) {
                case 0:
                    wv1.mo17965c();
                    while (wv1.mo17970h()) {
                        if (wv12.mo17956M(f22051b) != 0) {
                            wv1.mo17962X();
                            wv1.mo17963Y();
                        } else {
                            m6Var = C2926n6.m22354a(wv1, la2);
                        }
                    }
                    wv1.mo17969g();
                    break;
                case 1:
                    x6Var = C2926n6.m22355b(wv1, la2);
                    break;
                case 2:
                    p6Var = C3976y6.m31973j(wv1, la2);
                    break;
                case 3:
                    la22.mo19372a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    l6Var = C3976y6.m31971h(wv1, la2);
                    continue;
                case 6:
                    j6Var4 = C3976y6.m31969f(wv12, la22, z);
                    continue;
                case 7:
                    j6Var5 = C3976y6.m31969f(wv12, la22, z);
                    continue;
                case 8:
                    j6Var2 = C3976y6.m31969f(wv12, la22, z);
                    continue;
                case 9:
                    j6Var3 = C3976y6.m31969f(wv12, la22, z);
                    continue;
                default:
                    wv1.mo17962X();
                    wv1.mo17963Y();
                    break;
            }
            C2475j6 f = C3976y6.m31969f(wv12, la22, z);
            if (f.mo17293c().isEmpty()) {
                ez1 ez1 = r1;
                ez1 ez12 = new ez1(la2, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(la2.mo19377f()));
                f.mo17293c().add(ez1);
            } else if (((ez1) f.mo17293c().get(0)).f11775a == null) {
                f.mo17293c().set(0, new ez1(la2, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(la2.mo19377f())));
                j6Var = f;
                z = false;
            }
            j6Var = f;
            z = false;
        }
        if (z2) {
            wv1.mo17969g();
        }
        C2833m6 m6Var2 = m30686a(m6Var) ? null : m6Var;
        C3900x6<PointF, PointF> x6Var2 = m30687b(x6Var) ? null : x6Var;
        C2475j6 j6Var6 = m30688c(j6Var) ? null : j6Var;
        if (m30689d(p6Var)) {
            p6Var = null;
        }
        return new C3766v6(m6Var2, x6Var2, p6Var, j6Var6, l6Var, j6Var4, j6Var5, m30691f(j6Var2) ? null : j6Var2, m30690e(j6Var3) ? null : j6Var3);
    }
}

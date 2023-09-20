package com.onedelhi.secure;

import android.graphics.PointF;
import com.onedelhi.secure.wv1;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.onedelhi.secure.n6 */
public class C2926n6 {

    /* renamed from: a */
    public static wv1.C3876a f17114a = wv1.C3876a.m31144a("k", "x", "y");

    /* renamed from: a */
    public static C2833m6 m22354a(wv1 wv1, la2 la2) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (wv1.mo17955H() == wv1.C3877b.BEGIN_ARRAY) {
            wv1.mo17964b();
            while (wv1.mo17970h()) {
                arrayList.add(vz2.m30561a(wv1, la2));
            }
            wv1.mo17967d();
            hz1.m17063b(arrayList);
        } else {
            arrayList.add(new ez1(jw1.m19225e(wv1, yq4.m32602e())));
        }
        return new C2833m6(arrayList);
    }

    /* renamed from: b */
    public static C3900x6<PointF, PointF> m22355b(wv1 wv1, la2 la2) throws IOException {
        wv1.mo17965c();
        C2833m6 m6Var = null;
        C2475j6 j6Var = null;
        C2475j6 j6Var2 = null;
        boolean z = false;
        while (wv1.mo17955H() != wv1.C3877b.END_OBJECT) {
            int M = wv1.mo17956M(f17114a);
            if (M != 0) {
                if (M != 1) {
                    if (M != 2) {
                        wv1.mo17962X();
                        wv1.mo17963Y();
                    } else if (wv1.mo17955H() != wv1.C3877b.STRING) {
                        j6Var2 = C3976y6.m31968e(wv1, la2);
                    }
                } else if (wv1.mo17955H() != wv1.C3877b.STRING) {
                    j6Var = C3976y6.m31968e(wv1, la2);
                }
                wv1.mo17963Y();
                z = true;
            } else {
                m6Var = m22354a(wv1, la2);
            }
        }
        wv1.mo17969g();
        if (z) {
            la2.mo19372a("Lottie doesn't support expressions.");
        }
        return m6Var != null ? m6Var : new C3367r6(j6Var, j6Var2);
    }
}

package com.onedelhi.secure;

import android.graphics.PointF;
import androidx.appcompat.widget.SearchView;
import com.onedelhi.secure.wv1;
import java.io.IOException;

public class tg3 {

    /* renamed from: a */
    public static wv1.C3876a f20823a = wv1.C3876a.m31144a(SearchView.f1546d, "p", "s", "r", "hd");

    /* renamed from: a */
    public static sg3 m28429a(wv1 wv1, la2 la2) throws IOException {
        String str = null;
        C3900x6<PointF, PointF> x6Var = null;
        C3030o6 o6Var = null;
        C2475j6 j6Var = null;
        boolean z = false;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f20823a);
            if (M == 0) {
                str = wv1.mo17951A();
            } else if (M == 1) {
                x6Var = C2926n6.m22355b(wv1, la2);
            } else if (M == 2) {
                o6Var = C3976y6.m31972i(wv1, la2);
            } else if (M == 3) {
                j6Var = C3976y6.m31968e(wv1, la2);
            } else if (M != 4) {
                wv1.mo17963Y();
            } else {
                z = wv1.mo17972l();
            }
        }
        return new sg3(str, x6Var, o6Var, j6Var, z);
    }
}

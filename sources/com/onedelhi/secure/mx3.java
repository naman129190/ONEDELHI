package com.onedelhi.secure;

import androidx.appcompat.widget.SearchView;
import com.onedelhi.secure.lx3;
import com.onedelhi.secure.wv1;
import java.io.IOException;

public class mx3 {

    /* renamed from: a */
    public static wv1.C3876a f16902a = wv1.C3876a.m31144a("s", "e", "o", SearchView.f1546d, by2.f10023b, "hd");

    /* renamed from: a */
    public static lx3 m22171a(wv1 wv1, la2 la2) throws IOException {
        String str = null;
        lx3.C2789a aVar = null;
        C2475j6 j6Var = null;
        C2475j6 j6Var2 = null;
        C2475j6 j6Var3 = null;
        boolean z = false;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f16902a);
            if (M == 0) {
                j6Var = C3976y6.m31969f(wv1, la2, false);
            } else if (M == 1) {
                j6Var2 = C3976y6.m31969f(wv1, la2, false);
            } else if (M == 2) {
                j6Var3 = C3976y6.m31969f(wv1, la2, false);
            } else if (M == 3) {
                str = wv1.mo17951A();
            } else if (M == 4) {
                aVar = lx3.C2789a.m21043a(wv1.mo17976p());
            } else if (M != 5) {
                wv1.mo17963Y();
            } else {
                z = wv1.mo17972l();
            }
        }
        return new lx3(str, aVar, j6Var, j6Var2, j6Var3, z);
    }
}

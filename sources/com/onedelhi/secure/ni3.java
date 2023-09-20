package com.onedelhi.secure;

import androidx.appcompat.widget.SearchView;
import com.onedelhi.secure.wv1;
import java.io.IOException;

public class ni3 {

    /* renamed from: a */
    public static wv1.C3876a f17441a = wv1.C3876a.m31144a(SearchView.f1546d, "c", "o", "tr", "hd");

    /* renamed from: a */
    public static li3 m22858a(wv1 wv1, la2 la2) throws IOException {
        String str = null;
        C2475j6 j6Var = null;
        C2475j6 j6Var2 = null;
        C3766v6 v6Var = null;
        boolean z = false;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f17441a);
            if (M == 0) {
                str = wv1.mo17951A();
            } else if (M == 1) {
                j6Var = C3976y6.m31969f(wv1, la2, false);
            } else if (M == 2) {
                j6Var2 = C3976y6.m31969f(wv1, la2, false);
            } else if (M == 3) {
                v6Var = C3833w6.m30692g(wv1, la2);
            } else if (M != 4) {
                wv1.mo17963Y();
            } else {
                z = wv1.mo17972l();
            }
        }
        return new li3(str, j6Var, j6Var2, v6Var, z);
    }
}

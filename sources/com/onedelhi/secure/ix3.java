package com.onedelhi.secure;

import androidx.appcompat.widget.SearchView;
import com.onedelhi.secure.wv1;
import java.io.IOException;

public class ix3 {

    /* renamed from: a */
    public static wv1.C3876a f13899a = wv1.C3876a.m31144a(SearchView.f1546d, "ind", "ks", "hd");

    /* renamed from: a */
    public static gx3 m17959a(wv1 wv1, la2 la2) throws IOException {
        int i = 0;
        String str = null;
        C3230q6 q6Var = null;
        boolean z = false;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f13899a);
            if (M == 0) {
                str = wv1.mo17951A();
            } else if (M == 1) {
                i = wv1.mo17976p();
            } else if (M == 2) {
                q6Var = C3976y6.m31974k(wv1, la2);
            } else if (M != 3) {
                wv1.mo17963Y();
            } else {
                z = wv1.mo17972l();
            }
        }
        return new gx3(str, i, q6Var, z);
    }
}

package com.onedelhi.secure;

import android.graphics.Path;
import androidx.appcompat.widget.SearchView;
import com.onedelhi.secure.wv1;
import java.io.IOException;

public class ax3 {

    /* renamed from: a */
    public static final wv1.C3876a f9565a = wv1.C3876a.m31144a(SearchView.f1546d, "c", "o", "fillEnabled", "r", "hd");

    /* renamed from: a */
    public static zw3 m11459a(wv1 wv1, la2 la2) throws IOException {
        String str = null;
        C2398i6 i6Var = null;
        C2695l6 l6Var = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f9565a);
            if (M == 0) {
                str = wv1.mo17951A();
            } else if (M == 1) {
                i6Var = C3976y6.m31966c(wv1, la2);
            } else if (M == 2) {
                l6Var = C3976y6.m31971h(wv1, la2);
            } else if (M == 3) {
                z = wv1.mo17972l();
            } else if (M == 4) {
                i = wv1.mo17976p();
            } else if (M != 5) {
                wv1.mo17962X();
                wv1.mo17963Y();
            } else {
                z2 = wv1.mo17972l();
            }
        }
        return new zw3(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, i6Var, l6Var, z2);
    }
}

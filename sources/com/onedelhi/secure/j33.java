package com.onedelhi.secure;

import android.graphics.PointF;
import androidx.appcompat.widget.SearchView;
import com.onedelhi.secure.i33;
import com.onedelhi.secure.wv1;
import java.io.IOException;

public class j33 {

    /* renamed from: a */
    public static final wv1.C3876a f13994a = wv1.C3876a.m31144a(SearchView.f1546d, "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* renamed from: a */
    public static i33 m18097a(wv1 wv1, la2 la2) throws IOException {
        String str = null;
        i33.C2396a aVar = null;
        C2475j6 j6Var = null;
        C3900x6<PointF, PointF> x6Var = null;
        C2475j6 j6Var2 = null;
        C2475j6 j6Var3 = null;
        C2475j6 j6Var4 = null;
        C2475j6 j6Var5 = null;
        C2475j6 j6Var6 = null;
        boolean z = false;
        while (wv1.mo17970h()) {
            switch (wv1.mo17956M(f13994a)) {
                case 0:
                    str = wv1.mo17951A();
                    break;
                case 1:
                    aVar = i33.C2396a.m17146a(wv1.mo17976p());
                    break;
                case 2:
                    j6Var = C3976y6.m31969f(wv1, la2, false);
                    break;
                case 3:
                    x6Var = C2926n6.m22355b(wv1, la2);
                    break;
                case 4:
                    j6Var2 = C3976y6.m31969f(wv1, la2, false);
                    break;
                case 5:
                    j6Var4 = C3976y6.m31968e(wv1, la2);
                    break;
                case 6:
                    j6Var6 = C3976y6.m31969f(wv1, la2, false);
                    break;
                case 7:
                    j6Var3 = C3976y6.m31968e(wv1, la2);
                    break;
                case 8:
                    j6Var5 = C3976y6.m31969f(wv1, la2, false);
                    break;
                case 9:
                    z = wv1.mo17972l();
                    break;
                default:
                    wv1.mo17962X();
                    wv1.mo17963Y();
                    break;
            }
        }
        return new i33(str, aVar, j6Var, x6Var, j6Var2, j6Var3, j6Var4, j6Var5, j6Var6, z);
    }
}

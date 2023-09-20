package com.onedelhi.secure;

import android.graphics.Path;
import androidx.appcompat.widget.SearchView;
import com.onedelhi.secure.wv1;
import java.io.IOException;

public class ki1 {

    /* renamed from: a */
    public static final wv1.C3876a f14898a = wv1.C3876a.m31144a(SearchView.f1546d, "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    public static final wv1.C3876a f14899b = wv1.C3876a.m31144a("p", "k");

    /* renamed from: a */
    public static ii1 m19812a(wv1 wv1, la2 la2) throws IOException {
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        oi1 oi1 = null;
        C2602k6 k6Var = null;
        C2695l6 l6Var = null;
        C3030o6 o6Var = null;
        C3030o6 o6Var2 = null;
        boolean z = false;
        while (wv1.mo17970h()) {
            switch (wv1.mo17956M(f14898a)) {
                case 0:
                    str = wv1.mo17951A();
                    break;
                case 1:
                    int i = -1;
                    wv1.mo17965c();
                    while (wv1.mo17970h()) {
                        int M = wv1.mo17956M(f14899b);
                        if (M == 0) {
                            i = wv1.mo17976p();
                        } else if (M != 1) {
                            wv1.mo17962X();
                            wv1.mo17963Y();
                        } else {
                            k6Var = C3976y6.m31970g(wv1, la2, i);
                        }
                    }
                    wv1.mo17969g();
                    break;
                case 2:
                    l6Var = C3976y6.m31971h(wv1, la2);
                    break;
                case 3:
                    oi1 = wv1.mo17976p() == 1 ? oi1.LINEAR : oi1.RADIAL;
                    break;
                case 4:
                    o6Var = C3976y6.m31972i(wv1, la2);
                    break;
                case 5:
                    o6Var2 = C3976y6.m31972i(wv1, la2);
                    break;
                case 6:
                    fillType = wv1.mo17976p() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = wv1.mo17972l();
                    break;
                default:
                    wv1.mo17962X();
                    wv1.mo17963Y();
                    break;
            }
        }
        return new ii1(str, oi1, fillType, k6Var, l6Var, o6Var, o6Var2, (C2475j6) null, (C2475j6) null, z);
    }
}

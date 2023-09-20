package com.onedelhi.secure;

import androidx.appcompat.widget.SearchView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.onedelhi.secure.jx3;
import com.onedelhi.secure.wv1;
import java.io.IOException;
import java.util.ArrayList;

public class ni1 {

    /* renamed from: a */
    public static wv1.C3876a f17438a = wv1.C3876a.m31144a(SearchView.f1546d, "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG);

    /* renamed from: b */
    public static final wv1.C3876a f17439b = wv1.C3876a.m31144a("p", "k");

    /* renamed from: c */
    public static final wv1.C3876a f17440c = wv1.C3876a.m31144a(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "v");

    /* renamed from: a */
    public static li1 m22829a(wv1 wv1, la2 la2) throws IOException {
        wv1 wv12 = wv1;
        la2 la22 = la2;
        ArrayList arrayList = new ArrayList();
        String str = null;
        oi1 oi1 = null;
        C2602k6 k6Var = null;
        C2695l6 l6Var = null;
        C3030o6 o6Var = null;
        C3030o6 o6Var2 = null;
        C2475j6 j6Var = null;
        jx3.C2580b bVar = null;
        jx3.C2581c cVar = null;
        float f = 0.0f;
        C2475j6 j6Var2 = null;
        boolean z = false;
        while (wv1.mo17970h()) {
            switch (wv12.mo17956M(f17438a)) {
                case 0:
                    str = wv1.mo17951A();
                    break;
                case 1:
                    int i = -1;
                    wv1.mo17965c();
                    while (wv1.mo17970h()) {
                        int M = wv12.mo17956M(f17439b);
                        C2602k6 k6Var2 = k6Var;
                        if (M == 0) {
                            i = wv1.mo17976p();
                        } else if (M != 1) {
                            wv1.mo17962X();
                            wv1.mo17963Y();
                        } else {
                            k6Var = C3976y6.m31970g(wv12, la22, i);
                        }
                        k6Var = k6Var2;
                    }
                    C2602k6 k6Var3 = k6Var;
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
                    j6Var = C3976y6.m31968e(wv1, la2);
                    break;
                case 7:
                    bVar = jx3.C2580b.values()[wv1.mo17976p() - 1];
                    break;
                case 8:
                    cVar = jx3.C2581c.values()[wv1.mo17976p() - 1];
                    break;
                case 9:
                    f = (float) wv1.mo17974m();
                    break;
                case 10:
                    z = wv1.mo17972l();
                    break;
                case 11:
                    wv1.mo17964b();
                    while (wv1.mo17970h()) {
                        wv1.mo17965c();
                        String str2 = null;
                        C2475j6 j6Var3 = null;
                        while (wv1.mo17970h()) {
                            int M2 = wv12.mo17956M(f17440c);
                            C2475j6 j6Var4 = j6Var2;
                            if (M2 != 0) {
                                if (M2 != 1) {
                                    wv1.mo17962X();
                                    wv1.mo17963Y();
                                } else {
                                    j6Var3 = C3976y6.m31968e(wv1, la2);
                                }
                                j6Var2 = j6Var4;
                            } else {
                                str2 = wv1.mo17951A();
                            }
                        }
                        C2475j6 j6Var5 = j6Var2;
                        wv1.mo17969g();
                        if (str2.equals("o")) {
                            j6Var2 = j6Var3;
                        } else {
                            if (str2.equals(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG) || str2.equals("g")) {
                                la22.mo19395w(true);
                                arrayList.add(j6Var3);
                            }
                            j6Var2 = j6Var5;
                        }
                    }
                    C2475j6 j6Var6 = j6Var2;
                    wv1.mo17967d();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    j6Var2 = j6Var6;
                    break;
                default:
                    wv1.mo17962X();
                    wv1.mo17963Y();
                    break;
            }
        }
        return new li1(str, oi1, k6Var, l6Var, o6Var, o6Var2, j6Var, bVar, cVar, f, arrayList, j6Var2, z);
    }
}

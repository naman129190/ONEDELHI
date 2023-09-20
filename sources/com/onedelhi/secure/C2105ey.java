package com.onedelhi.secure;

import android.graphics.PointF;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.onedelhi.secure.wv1;
import java.io.IOException;

/* renamed from: com.onedelhi.secure.ey */
public class C2105ey {

    /* renamed from: a */
    public static wv1.C3876a f11762a = wv1.C3876a.m31144a(SearchView.f1546d, "p", "s", "hd", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG);

    /* renamed from: a */
    public static C2012dy m14454a(wv1 wv1, la2 la2, int i) throws IOException {
        boolean z = i == 3;
        String str = null;
        C3900x6<PointF, PointF> x6Var = null;
        C3030o6 o6Var = null;
        boolean z2 = false;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f11762a);
            if (M == 0) {
                str = wv1.mo17951A();
            } else if (M == 1) {
                x6Var = C2926n6.m22355b(wv1, la2);
            } else if (M == 2) {
                o6Var = C3976y6.m31972i(wv1, la2);
            } else if (M == 3) {
                z2 = wv1.mo17972l();
            } else if (M != 4) {
                wv1.mo17962X();
                wv1.mo17963Y();
            } else {
                z = wv1.mo17976p() == 3;
            }
        }
        return new C2012dy(str, x6Var, o6Var, z, z2);
    }
}

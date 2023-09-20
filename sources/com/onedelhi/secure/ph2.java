package com.onedelhi.secure;

import androidx.appcompat.widget.SearchView;
import com.onedelhi.secure.nh2;
import com.onedelhi.secure.wv1;
import java.io.IOException;

public class ph2 {

    /* renamed from: a */
    public static final wv1.C3876a f18533a = wv1.C3876a.m31144a(SearchView.f1546d, "mm", "hd");

    /* renamed from: a */
    public static nh2 m24721a(wv1 wv1) throws IOException {
        String str = null;
        nh2.C2980a aVar = null;
        boolean z = false;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f18533a);
            if (M == 0) {
                str = wv1.mo17951A();
            } else if (M == 1) {
                aVar = nh2.C2980a.m22818a(wv1.mo17976p());
            } else if (M != 2) {
                wv1.mo17962X();
                wv1.mo17963Y();
            } else {
                z = wv1.mo17972l();
            }
        }
        return new nh2(str, aVar, z);
    }
}

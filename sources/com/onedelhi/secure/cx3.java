package com.onedelhi.secure;

import androidx.appcompat.widget.SearchView;
import com.onedelhi.secure.wv1;
import java.io.IOException;
import java.util.ArrayList;

public class cx3 {

    /* renamed from: a */
    public static wv1.C3876a f10512a = wv1.C3876a.m31144a(SearchView.f1546d, "hd", "it");

    /* renamed from: a */
    public static bx3 m12787a(wv1 wv1, la2 la2) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f10512a);
            if (M == 0) {
                str = wv1.mo17951A();
            } else if (M == 1) {
                z = wv1.mo17972l();
            } else if (M != 2) {
                wv1.mo17963Y();
            } else {
                wv1.mo17964b();
                while (wv1.mo17970h()) {
                    h70 a = i70.m17253a(wv1, la2);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                wv1.mo17967d();
            }
        }
        return new bx3(str, arrayList, z);
    }
}

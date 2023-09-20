package com.onedelhi.secure;

import com.google.firebase.messaging.C4311b;
import com.onedelhi.secure.wv1;
import java.io.IOException;
import java.util.ArrayList;

public class q91 {

    /* renamed from: a */
    public static final wv1.C3876a f18970a = wv1.C3876a.m31144a("ch", "size", "w", "style", "fFamily", C4311b.C4317f.C4318a.f25149a);

    /* renamed from: b */
    public static final wv1.C3876a f18971b = wv1.C3876a.m31144a("shapes");

    /* renamed from: a */
    public static p91 m25471a(wv1 wv1, la2 la2) throws IOException {
        ArrayList arrayList = new ArrayList();
        wv1.mo17965c();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f18970a);
            if (M == 0) {
                c = wv1.mo17951A().charAt(0);
            } else if (M == 1) {
                d = wv1.mo17974m();
            } else if (M == 2) {
                d2 = wv1.mo17974m();
            } else if (M == 3) {
                str = wv1.mo17951A();
            } else if (M == 4) {
                str2 = wv1.mo17951A();
            } else if (M != 5) {
                wv1.mo17962X();
                wv1.mo17963Y();
            } else {
                wv1.mo17965c();
                while (wv1.mo17970h()) {
                    if (wv1.mo17956M(f18971b) != 0) {
                        wv1.mo17962X();
                        wv1.mo17963Y();
                    } else {
                        wv1.mo17964b();
                        while (wv1.mo17970h()) {
                            arrayList.add((bx3) i70.m17253a(wv1, la2));
                        }
                        wv1.mo17967d();
                    }
                }
                wv1.mo17969g();
            }
        }
        wv1.mo17969g();
        return new p91(arrayList, c, d, d2, str, str2);
    }
}

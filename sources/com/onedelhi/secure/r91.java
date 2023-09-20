package com.onedelhi.secure;

import com.onedelhi.secure.wv1;
import java.io.IOException;

public class r91 {

    /* renamed from: a */
    public static final wv1.C3876a f19719a = wv1.C3876a.m31144a("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    public static m91 m26526a(wv1 wv1) throws IOException {
        wv1.mo17965c();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f19719a);
            if (M == 0) {
                str = wv1.mo17951A();
            } else if (M == 1) {
                str2 = wv1.mo17951A();
            } else if (M == 2) {
                str3 = wv1.mo17951A();
            } else if (M != 3) {
                wv1.mo17962X();
                wv1.mo17963Y();
            } else {
                f = (float) wv1.mo17974m();
            }
        }
        wv1.mo17969g();
        return new m91(str, str2, str3, f);
    }
}

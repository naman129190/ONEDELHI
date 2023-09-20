package com.onedelhi.secure;

import com.onedelhi.secure.sn0;
import com.onedelhi.secure.wv1;
import java.io.IOException;

public class tn0 implements is4<sn0> {

    /* renamed from: a */
    public static final tn0 f20964a = new tn0();

    /* renamed from: a */
    public static final wv1.C3876a f20965a = wv1.C3876a.m31144a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    /* renamed from: b */
    public sn0 mo13530a(wv1 wv1, float f) throws IOException {
        sn0.C3528a aVar = sn0.C3528a.CENTER;
        wv1.mo17965c();
        sn0.C3528a aVar2 = aVar;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (wv1.mo17970h()) {
            switch (wv1.mo17956M(f20965a)) {
                case 0:
                    str = wv1.mo17951A();
                    break;
                case 1:
                    str2 = wv1.mo17951A();
                    break;
                case 2:
                    f2 = (float) wv1.mo17974m();
                    break;
                case 3:
                    int p = wv1.mo17976p();
                    aVar2 = sn0.C3528a.CENTER;
                    if (p <= aVar2.ordinal() && p >= 0) {
                        aVar2 = sn0.C3528a.values()[p];
                        break;
                    }
                case 4:
                    i = wv1.mo17976p();
                    break;
                case 5:
                    f3 = (float) wv1.mo17974m();
                    break;
                case 6:
                    f4 = (float) wv1.mo17974m();
                    break;
                case 7:
                    i2 = jw1.m19224d(wv1);
                    break;
                case 8:
                    i3 = jw1.m19224d(wv1);
                    break;
                case 9:
                    f5 = (float) wv1.mo17974m();
                    break;
                case 10:
                    z = wv1.mo17972l();
                    break;
                default:
                    wv1.mo17962X();
                    wv1.mo17963Y();
                    break;
            }
        }
        wv1 wv12 = wv1;
        wv1.mo17969g();
        return new sn0(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z);
    }
}

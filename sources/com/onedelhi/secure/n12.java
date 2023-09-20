package com.onedelhi.secure;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.C0426d;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.onedelhi.secure.m12;
import com.onedelhi.secure.wv1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class n12 {

    /* renamed from: a */
    public static final wv1.C3876a f16981a = wv1.C3876a.m31144a(SearchView.f1546d, "ind", "refId", "ty", C0426d.f2835g, "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", C6792st.f35188a, "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    public static final wv1.C3876a f16982b = wv1.C3876a.m31144a(GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "a");

    /* renamed from: c */
    public static final wv1.C3876a f16983c = wv1.C3876a.m31144a(SearchView.f1546d);

    /* renamed from: a */
    public static m12 m22270a(wv1 wv1, la2 la2) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        wv1 wv12 = wv1;
        la2 la22 = la2;
        m12.C2807b bVar = m12.C2807b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        wv1.mo17965c();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        m12.C2807b bVar2 = bVar;
        m12.C2806a aVar = null;
        String str = null;
        C3766v6 v6Var = null;
        C3472s6 s6Var = null;
        C3566t6 t6Var = null;
        C2475j6 j6Var = null;
        long j = -1;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        long j2 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (wv1.mo17970h()) {
            switch (wv12.mo17956M(f16981a)) {
                case 0:
                    str3 = wv1.mo17951A();
                    continue;
                case 1:
                    j2 = (long) wv1.mo17976p();
                    continue;
                case 2:
                    str = wv1.mo17951A();
                    continue;
                case 3:
                    int p = wv1.mo17976p();
                    aVar = m12.C2806a.UNKNOWN;
                    if (p < aVar.ordinal()) {
                        aVar = m12.C2806a.values()[p];
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    j = (long) wv1.mo17976p();
                    continue;
                case 5:
                    i = (int) (((float) wv1.mo17976p()) * yq4.m32602e());
                    continue;
                case 6:
                    i2 = (int) (((float) wv1.mo17976p()) * yq4.m32602e());
                    continue;
                case 7:
                    i3 = Color.parseColor(wv1.mo17951A());
                    continue;
                case 8:
                    v6Var = C3833w6.m30692g(wv1, la2);
                    continue;
                case 9:
                    bVar2 = m12.C2807b.values()[wv1.mo17976p()];
                    la22.mo19391t(1);
                    continue;
                case 10:
                    wv1.mo17964b();
                    while (wv1.mo17970h()) {
                        arrayList3.add(xd2.m31402a(wv1, la2));
                    }
                    la22.mo19391t(arrayList3.size());
                    break;
                case 11:
                    wv1.mo17964b();
                    while (wv1.mo17970h()) {
                        h70 a = i70.m17253a(wv1, la2);
                        if (a != null) {
                            arrayList4.add(a);
                        }
                    }
                    break;
                case 12:
                    wv1.mo17965c();
                    while (wv1.mo17970h()) {
                        int M = wv12.mo17956M(f16982b);
                        if (M == 0) {
                            s6Var = C3976y6.m31967d(wv1, la2);
                        } else if (M != 1) {
                            wv1.mo17962X();
                            wv1.mo17963Y();
                        } else {
                            wv1.mo17964b();
                            if (wv1.mo17970h()) {
                                t6Var = C3668u6.m29084a(wv1, la2);
                            }
                            while (wv1.mo17970h()) {
                                wv1.mo17963Y();
                            }
                            wv1.mo17967d();
                        }
                    }
                    wv1.mo17969g();
                    continue;
                case 13:
                    wv1.mo17964b();
                    ArrayList arrayList5 = new ArrayList();
                    while (wv1.mo17970h()) {
                        wv1.mo17965c();
                        while (wv1.mo17970h()) {
                            if (wv12.mo17956M(f16983c) != 0) {
                                wv1.mo17962X();
                                wv1.mo17963Y();
                            } else {
                                arrayList5.add(wv1.mo17951A());
                            }
                        }
                        wv1.mo17969g();
                    }
                    wv1.mo17967d();
                    la22.mo19372a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    continue;
                case 14:
                    f3 = (float) wv1.mo17974m();
                    continue;
                case 15:
                    f4 = (float) wv1.mo17974m();
                    continue;
                case 16:
                    i4 = (int) (((float) wv1.mo17976p()) * yq4.m32602e());
                    continue;
                case 17:
                    i5 = (int) (((float) wv1.mo17976p()) * yq4.m32602e());
                    continue;
                case 18:
                    f = (float) wv1.mo17974m();
                    continue;
                case 19:
                    f2 = (float) wv1.mo17974m();
                    continue;
                case 20:
                    j6Var = C3976y6.m31969f(wv12, la22, false);
                    continue;
                case 21:
                    str2 = wv1.mo17951A();
                    continue;
                case 22:
                    z = wv1.mo17972l();
                    continue;
                default:
                    wv1.mo17962X();
                    wv1.mo17963Y();
                    continue;
            }
            wv1.mo17967d();
        }
        wv1.mo17969g();
        float f5 = f / f3;
        float f6 = f2 / f3;
        ArrayList arrayList6 = new ArrayList();
        if (f5 > 0.0f) {
            ez1 ez1 = r0;
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            ez1 ez12 = new ez1(la2, valueOf2, valueOf2, (Interpolator) null, 0.0f, Float.valueOf(f5));
            arrayList2.add(ez1);
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f6 <= 0.0f) {
            f6 = la2.mo19377f();
        }
        la2 la23 = la2;
        arrayList2.add(new ez1(la23, valueOf, valueOf, (Interpolator) null, f5, Float.valueOf(f6)));
        arrayList2.add(new ez1(la23, valueOf2, valueOf2, (Interpolator) null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            la22.mo19372a("Convert your Illustrator layers to shape layers.");
        }
        return new m12(arrayList4, la2, str3, j2, aVar, j, str, arrayList, v6Var, i, i2, i3, f3, f4, i4, i5, s6Var, t6Var, arrayList2, bVar2, j6Var, z);
    }

    /* renamed from: b */
    public static m12 m22271b(la2 la2) {
        Rect b = la2.mo19373b();
        List emptyList = Collections.emptyList();
        m12.C2806a aVar = m12.C2806a.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        C3766v6 v6Var = r4;
        C3766v6 v6Var2 = new C3766v6();
        return new m12(emptyList, la2, "__container", -1, aVar, -1, (String) null, emptyList2, v6Var, 0, 0, 0, 0.0f, 0.0f, b.width(), b.height(), (C3472s6) null, (C3566t6) null, Collections.emptyList(), m12.C2807b.NONE, (C2475j6) null, false);
    }
}

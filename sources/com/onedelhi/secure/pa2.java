package com.onedelhi.secure;

import android.graphics.Rect;
import com.onedelhi.secure.m12;
import com.onedelhi.secure.wv1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class pa2 {

    /* renamed from: a */
    public static wv1.C3876a f18422a = wv1.C3876a.m31144a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: a */
    public static la2 m24554a(wv1 wv1) throws IOException {
        ArrayList arrayList;
        HashMap hashMap;
        wv1 wv12 = wv1;
        float e = yq4.m32602e();
        ga2 ga2 = new ga2();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        k14 k14 = new k14();
        la2 la2 = new la2();
        wv1.mo17965c();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (wv1.mo17970h()) {
            switch (wv12.mo17956M(f18422a)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i = wv1.mo17976p();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i2 = wv1.mo17976p();
                    continue;
                case 2:
                    HashMap hashMap7 = hashMap4;
                    ArrayList arrayList6 = arrayList3;
                    f = (float) wv1.mo17974m();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) wv1.mo17974m()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) wv1.mo17974m();
                    break;
                case 5:
                    String[] split = wv1.mo17951A().split("\\.");
                    if (!yq4.m32607j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        la2.mo19372a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    m24555b(wv12, la2, arrayList2, ga2);
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            wv1.mo17963Y();
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            wv12 = wv1;
        }
        ArrayList arrayList7 = arrayList3;
        la2.mo19393u(new Rect(0, 0, (int) (((float) i) * e), (int) (((float) i2) * e)), f, f2, f3, arrayList2, ga2, hashMap2, hashMap3, k14, hashMap4, arrayList3);
        return la2;
    }

    /* renamed from: b */
    public static void m24555b(wv1 wv1, la2 la2, List<m12> list, ga2<m12> ga2) throws IOException {
        wv1.mo17964b();
        int i = 0;
        while (wv1.mo17970h()) {
            m12 a = n12.m22270a(wv1, la2);
            if (a.mo20016d() == m12.C2806a.IMAGE) {
                i++;
            }
            list.add(a);
            ga2.mo16423n(a.mo20014b(), a);
            if (i > 4) {
                p92.m24544e("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        wv1.mo17967d();
    }
}

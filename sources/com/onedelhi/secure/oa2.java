package com.onedelhi.secure;

import android.graphics.Rect;
import com.onedelhi.secure.m12;
import com.onedelhi.secure.wv1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class oa2 {

    /* renamed from: a */
    public static final wv1.C3876a f17888a = wv1.C3876a.m31144a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    public static wv1.C3876a f17889b = wv1.C3876a.m31144a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    public static final wv1.C3876a f17890c = wv1.C3876a.m31144a("list");

    /* renamed from: d */
    public static final wv1.C3876a f17891d = wv1.C3876a.m31144a("cm", "tm", "dr");

    /* renamed from: a */
    public static la2 m23633a(wv1 wv1) throws IOException {
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
            switch (wv12.mo17956M(f17888a)) {
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
                        break;
                    }
                    break;
                case 6:
                    m23637e(wv12, la2, arrayList2, ga2);
                    break;
                case 7:
                    m23634b(wv12, la2, hashMap2, hashMap3);
                    break;
                case 8:
                    m23636d(wv12, hashMap4);
                    break;
                case 9:
                    m23635c(wv12, la2, k14);
                    break;
                case 10:
                    m23638f(wv12, la2, arrayList3);
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    wv1.mo17962X();
                    wv1.mo17963Y();
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            wv12 = wv1;
        }
        ArrayList arrayList7 = arrayList3;
        la2.mo19393u(new Rect(0, 0, (int) (((float) i) * e), (int) (((float) i2) * e)), f, f2, f3, arrayList2, ga2, hashMap2, hashMap3, k14, hashMap4, arrayList3);
        return la2;
    }

    /* renamed from: b */
    public static void m23634b(wv1 wv1, la2 la2, Map<String, List<m12>> map, Map<String, sa2> map2) throws IOException {
        wv1.mo17964b();
        while (wv1.mo17970h()) {
            ArrayList arrayList = new ArrayList();
            ga2 ga2 = new ga2();
            wv1.mo17965c();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (wv1.mo17970h()) {
                int M = wv1.mo17956M(f17889b);
                if (M == 0) {
                    str = wv1.mo17951A();
                } else if (M == 1) {
                    wv1.mo17964b();
                    while (wv1.mo17970h()) {
                        m12 a = n12.m22270a(wv1, la2);
                        ga2.mo16423n(a.mo20014b(), a);
                        arrayList.add(a);
                    }
                    wv1.mo17967d();
                } else if (M == 2) {
                    i = wv1.mo17976p();
                } else if (M == 3) {
                    i2 = wv1.mo17976p();
                } else if (M == 4) {
                    str2 = wv1.mo17951A();
                } else if (M != 5) {
                    wv1.mo17962X();
                    wv1.mo17963Y();
                } else {
                    str3 = wv1.mo17951A();
                }
            }
            wv1.mo17969g();
            if (str2 != null) {
                sa2 sa2 = new sa2(i, i2, str, str2, str3);
                map2.put(sa2.mo24277e(), sa2);
            } else {
                map.put(str, arrayList);
            }
        }
        wv1.mo17967d();
    }

    /* renamed from: c */
    public static void m23635c(wv1 wv1, la2 la2, k14<p91> k14) throws IOException {
        wv1.mo17964b();
        while (wv1.mo17970h()) {
            p91 a = q91.m25471a(wv1, la2);
            k14.mo18855n(a.hashCode(), a);
        }
        wv1.mo17967d();
    }

    /* renamed from: d */
    public static void m23636d(wv1 wv1, Map<String, m91> map) throws IOException {
        wv1.mo17965c();
        while (wv1.mo17970h()) {
            if (wv1.mo17956M(f17890c) != 0) {
                wv1.mo17962X();
                wv1.mo17963Y();
            } else {
                wv1.mo17964b();
                while (wv1.mo17970h()) {
                    m91 a = r91.m26526a(wv1);
                    map.put(a.mo20187c(), a);
                }
                wv1.mo17967d();
            }
        }
        wv1.mo17969g();
    }

    /* renamed from: e */
    public static void m23637e(wv1 wv1, la2 la2, List<m12> list, ga2<m12> ga2) throws IOException {
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

    /* renamed from: f */
    public static void m23638f(wv1 wv1, la2 la2, List<pd2> list) throws IOException {
        wv1.mo17964b();
        while (wv1.mo17970h()) {
            String str = null;
            wv1.mo17965c();
            float f = 0.0f;
            float f2 = 0.0f;
            while (wv1.mo17970h()) {
                int M = wv1.mo17956M(f17891d);
                if (M == 0) {
                    str = wv1.mo17951A();
                } else if (M == 1) {
                    f = (float) wv1.mo17974m();
                } else if (M != 2) {
                    wv1.mo17962X();
                    wv1.mo17963Y();
                } else {
                    f2 = (float) wv1.mo17974m();
                }
            }
            wv1.mo17969g();
            list.add(new pd2(str, f, f2));
        }
        wv1.mo17967d();
    }
}

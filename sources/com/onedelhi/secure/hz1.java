package com.onedelhi.secure;

import com.onedelhi.secure.wv1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class hz1 {

    /* renamed from: a */
    public static wv1.C3876a f13381a = wv1.C3876a.m31144a("k");

    /* renamed from: a */
    public static <T> List<ez1<T>> m17062a(wv1 wv1, la2 la2, float f, is4<T> is4) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (wv1.mo17955H() == wv1.C3877b.STRING) {
            la2.mo19372a("Lottie doesn't support expressions.");
            return arrayList;
        }
        wv1.mo17965c();
        while (wv1.mo17970h()) {
            if (wv1.mo17956M(f13381a) != 0) {
                wv1.mo17963Y();
            } else if (wv1.mo17955H() == wv1.C3877b.BEGIN_ARRAY) {
                wv1.mo17964b();
                if (wv1.mo17955H() == wv1.C3877b.NUMBER) {
                    arrayList.add(gz1.m16408b(wv1, la2, f, is4, false));
                } else {
                    while (wv1.mo17970h()) {
                        arrayList.add(gz1.m16408b(wv1, la2, f, is4, true));
                    }
                }
                wv1.mo17967d();
            } else {
                arrayList.add(gz1.m16408b(wv1, la2, f, is4, false));
            }
        }
        wv1.mo17969g();
        m17063b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static <T> void m17063b(List<? extends ez1<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            ez1 ez1 = (ez1) list.get(i2);
            i2++;
            ez1 ez12 = (ez1) list.get(i2);
            ez1.f11774a = Float.valueOf(ez12.f11769a);
            if (ez1.f11779b == null && (t = ez12.f11775a) != null) {
                ez1.f11779b = t;
                if (ez1 instanceof tz2) {
                    ((tz2) ez1).mo25361i();
                }
            }
        }
        ez1 ez13 = (ez1) list.get(i);
        if ((ez13.f11775a == null || ez13.f11779b == null) && list.size() > 1) {
            list.remove(ez13);
        }
    }
}

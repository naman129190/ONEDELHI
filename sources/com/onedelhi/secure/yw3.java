package com.onedelhi.secure;

import android.graphics.PointF;
import com.onedelhi.secure.wv1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class yw3 implements is4<xw3> {

    /* renamed from: a */
    public static final wv1.C3876a f23354a = wv1.C3876a.m31144a("c", "v", "i", "o");

    /* renamed from: a */
    public static final yw3 f23355a = new yw3();

    /* renamed from: b */
    public xw3 mo13530a(wv1 wv1, float f) throws IOException {
        if (wv1.mo17955H() == wv1.C3877b.BEGIN_ARRAY) {
            wv1.mo17964b();
        }
        wv1.mo17965c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (wv1.mo17970h()) {
            int M = wv1.mo17956M(f23354a);
            if (M == 0) {
                z = wv1.mo17972l();
            } else if (M == 1) {
                list = jw1.m19226f(wv1, f);
            } else if (M == 2) {
                list2 = jw1.m19226f(wv1, f);
            } else if (M != 3) {
                wv1.mo17962X();
                wv1.mo17963Y();
            } else {
                list3 = jw1.m19226f(wv1, f);
            }
        }
        wv1.mo17969g();
        if (wv1.mo17955H() == wv1.C3877b.END_ARRAY) {
            wv1.mo17967d();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new xw3(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new tb0(hj2.m16786a(list.get(i2), list3.get(i2)), hj2.m16786a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new tb0(hj2.m16786a(list.get(i3), list3.get(i3)), hj2.m16786a(pointF3, list2.get(0)), pointF3));
            }
            return new xw3(pointF, z, arrayList);
        }
    }
}

package com.onedelhi.secure;

import java.util.List;

public class e10 extends fz1<Integer> {
    public e10(List<ez1<Integer>> list) {
        super(list);
    }

    /* renamed from: o */
    public int mo14974o() {
        return mo14975p(mo19639b(), mo19640d());
    }

    /* renamed from: p */
    public int mo14975p(ez1<Integer> ez1, float f) {
        T t = ez1.f11775a;
        if (t == null || ez1.f11779b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t).intValue();
        int intValue2 = ((Integer) ez1.f11779b).intValue();
        hb2<A> hb2 = this.f15424a;
        if (hb2 != null) {
            Integer num = (Integer) hb2.mo17180b(ez1.f11769a, ez1.f11774a.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo19641e(), mo19642f());
            if (num != null) {
                return num.intValue();
            }
        }
        return od1.m23678c(hj2.m16787b(f, 0.0f, 1.0f), intValue, intValue2);
    }

    /* renamed from: q */
    public Integer mo14089i(ez1<Integer> ez1, float f) {
        return Integer.valueOf(mo14975p(ez1, f));
    }
}

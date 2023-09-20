package com.onedelhi.secure;

import java.util.List;

public class ns1 extends fz1<Integer> {
    public ns1(List<ez1<Integer>> list) {
        super(list);
    }

    /* renamed from: o */
    public int mo21450o() {
        return mo21451p(mo19639b(), mo19640d());
    }

    /* renamed from: p */
    public int mo21451p(ez1<Integer> ez1, float f) {
        if (ez1.f11775a == null || ez1.f11779b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        hb2<A> hb2 = this.f15424a;
        if (hb2 != null) {
            Integer num = (Integer) hb2.mo17180b(ez1.f11769a, ez1.f11774a.floatValue(), ez1.f11775a, ez1.f11779b, f, mo19641e(), mo19642f());
            if (num != null) {
                return num.intValue();
            }
        }
        return hj2.m16796k(ez1.mo15664g(), ez1.mo15661d(), f);
    }

    /* renamed from: q */
    public Integer mo14089i(ez1<Integer> ez1, float f) {
        return Integer.valueOf(mo21451p(ez1, f));
    }
}

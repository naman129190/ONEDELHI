package com.onedelhi.secure;

import java.util.List;

public class z71 extends fz1<Float> {
    public z71(List<ez1<Float>> list) {
        super(list);
    }

    /* renamed from: o */
    public float mo27830o() {
        return mo27831p(mo19639b(), mo19640d());
    }

    /* renamed from: p */
    public float mo27831p(ez1<Float> ez1, float f) {
        if (ez1.f11775a == null || ez1.f11779b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        hb2<A> hb2 = this.f15424a;
        if (hb2 != null) {
            Float f2 = (Float) hb2.mo17180b(ez1.f11769a, ez1.f11774a.floatValue(), ez1.f11775a, ez1.f11779b, f, mo19641e(), mo19642f());
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        return hj2.m16795j(ez1.mo15663f(), ez1.mo15660c(), f);
    }

    /* renamed from: q */
    public Float mo14089i(ez1<Float> ez1, float f) {
        return Float.valueOf(mo27831p(ez1, f));
    }
}

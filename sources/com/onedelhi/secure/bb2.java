package com.onedelhi.secure;

public class bb2 extends hb2<Float> {
    public bb2() {
    }

    public bb2(@mr2 Float f) {
        super(f);
    }

    /* renamed from: e */
    public Float mo13613e(ra2<Float> ra2) {
        T t = this.f13026a;
        if (t != null) {
            return (Float) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    /* renamed from: f */
    public Float mo7444a(ra2<Float> ra2) {
        return Float.valueOf(hj2.m16795j(ra2.mo23772g().floatValue(), ra2.mo23767b().floatValue(), ra2.mo23768c()) + mo13613e(ra2).floatValue());
    }
}

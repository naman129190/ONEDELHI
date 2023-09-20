package com.onedelhi.secure;

public class cb2 extends hb2<Integer> {
    /* renamed from: e */
    public Integer mo14087e(ra2<Integer> ra2) {
        T t = this.f13026a;
        if (t != null) {
            return (Integer) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    /* renamed from: f */
    public Integer mo7444a(ra2<Integer> ra2) {
        return Integer.valueOf(hj2.m16796k(ra2.mo23772g().intValue(), ra2.mo23767b().intValue(), ra2.mo23768c()) + mo14087e(ra2).intValue());
    }
}

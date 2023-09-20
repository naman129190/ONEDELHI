package com.onedelhi.secure;

import java.util.List;

public class gr3 extends fz1<jr3> {

    /* renamed from: a */
    public final jr3 f12726a = new jr3();

    public gr3(List<ez1<jr3>> list) {
        super(list);
    }

    /* renamed from: o */
    public jr3 mo14089i(ez1<jr3> ez1, float f) {
        T t;
        T t2 = ez1.f11775a;
        if (t2 == null || (t = ez1.f11779b) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        jr3 jr3 = (jr3) t2;
        jr3 jr32 = (jr3) t;
        hb2<A> hb2 = this.f15424a;
        if (hb2 != null) {
            jr3 jr33 = (jr3) hb2.mo17180b(ez1.f11769a, ez1.f11774a.floatValue(), jr3, jr32, f, mo19641e(), mo19642f());
            if (jr33 != null) {
                return jr33;
            }
        }
        this.f12726a.mo18555d(hj2.m16795j(jr3.mo18553b(), jr32.mo18553b(), f), hj2.m16795j(jr3.mo18554c(), jr32.mo18554c(), f));
        return this.f12726a;
    }
}

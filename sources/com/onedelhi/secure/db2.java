package com.onedelhi.secure;

import android.graphics.PointF;

public class db2 extends hb2<PointF> {

    /* renamed from: a */
    public final PointF f10667a = new PointF();

    public db2() {
    }

    public db2(@mr2 PointF pointF) {
        super(pointF);
    }

    /* renamed from: e */
    public PointF mo14575e(ra2<PointF> ra2) {
        T t = this.f13026a;
        if (t != null) {
            return (PointF) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    /* renamed from: f */
    public final PointF mo7444a(ra2<PointF> ra2) {
        this.f10667a.set(hj2.m16795j(ra2.mo23772g().x, ra2.mo23767b().x, ra2.mo23768c()), hj2.m16795j(ra2.mo23772g().y, ra2.mo23767b().y, ra2.mo23768c()));
        PointF e = mo14575e(ra2);
        this.f10667a.offset(e.x, e.y);
        return this.f10667a;
    }
}

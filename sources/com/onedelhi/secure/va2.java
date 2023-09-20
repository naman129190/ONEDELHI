package com.onedelhi.secure;

import android.graphics.PointF;
import android.view.animation.Interpolator;

public class va2 extends wa2<PointF> {

    /* renamed from: a */
    public final PointF f21717a = new PointF();

    public va2(PointF pointF, PointF pointF2) {
        super(pointF, pointF2);
    }

    public va2(PointF pointF, PointF pointF2, Interpolator interpolator) {
        super(pointF, pointF2, interpolator);
    }

    /* renamed from: f */
    public PointF mo24817e(PointF pointF, PointF pointF2, float f) {
        this.f21717a.set(hj2.m16795j(pointF.x, pointF2.x, f), hj2.m16795j(pointF.y, pointF2.y, f));
        return this.f21717a;
    }
}

package com.onedelhi.secure;

import android.graphics.PointF;
import java.util.List;

public class x23 extends fz1<PointF> {

    /* renamed from: a */
    public final PointF f22395a = new PointF();

    public x23(List<ez1<PointF>> list) {
        super(list);
    }

    /* renamed from: o */
    public PointF mo14089i(ez1<PointF> ez1, float f) {
        T t;
        T t2 = ez1.f11775a;
        if (t2 == null || (t = ez1.f11779b) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t2;
        PointF pointF2 = (PointF) t;
        hb2<A> hb2 = this.f15424a;
        if (hb2 != null) {
            PointF pointF3 = (PointF) hb2.mo17180b(ez1.f11769a, ez1.f11774a.floatValue(), pointF, pointF2, f, mo19641e(), mo19642f());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f22395a;
        float f2 = pointF.x;
        float f3 = pointF.y;
        pointF4.set(f2 + ((pointF2.x - f2) * f), f3 + (f * (pointF2.y - f3)));
        return this.f22395a;
    }
}

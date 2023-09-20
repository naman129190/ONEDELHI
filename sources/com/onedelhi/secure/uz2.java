package com.onedelhi.secure;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

public class uz2 extends fz1<PointF> {

    /* renamed from: a */
    public PathMeasure f21580a = new PathMeasure();

    /* renamed from: a */
    public final PointF f21581a = new PointF();

    /* renamed from: a */
    public tz2 f21582a;

    /* renamed from: a */
    public final float[] f21583a = new float[2];

    public uz2(List<? extends ez1<PointF>> list) {
        super(list);
    }

    /* renamed from: o */
    public PointF mo14089i(ez1<PointF> ez1, float f) {
        tz2 tz2 = (tz2) ez1;
        Path j = tz2.mo25362j();
        if (j == null) {
            return (PointF) ez1.f11775a;
        }
        hb2<A> hb2 = this.f15424a;
        if (hb2 != null) {
            PointF pointF = (PointF) hb2.mo17180b(tz2.f11769a, tz2.f11774a.floatValue(), tz2.f11775a, tz2.f11779b, mo19641e(), f, mo19642f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f21582a != tz2) {
            this.f21580a.setPath(j, false);
            this.f21582a = tz2;
        }
        PathMeasure pathMeasure = this.f21580a;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f21583a, (float[]) null);
        PointF pointF2 = this.f21581a;
        float[] fArr = this.f21583a;
        pointF2.set(fArr[0], fArr[1]);
        return this.f21581a;
    }
}

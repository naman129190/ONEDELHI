package com.onedelhi.secure;

import android.graphics.PointF;
import java.util.Collections;

public class y14 extends C2760lj<PointF, PointF> {

    /* renamed from: a */
    public final PointF f22858a = new PointF();

    /* renamed from: a */
    public final C2760lj<Float, Float> f22859a;

    /* renamed from: b */
    public final C2760lj<Float, Float> f22860b;

    public y14(C2760lj<Float, Float> ljVar, C2760lj<Float, Float> ljVar2) {
        super(Collections.emptyList());
        this.f22859a = ljVar;
        this.f22860b = ljVar2;
        mo15567l(mo19642f());
    }

    /* renamed from: l */
    public void mo15567l(float f) {
        this.f22859a.mo15567l(f);
        this.f22860b.mo15567l(f);
        this.f22858a.set(this.f22859a.mo15565h().floatValue(), this.f22860b.mo15565h().floatValue());
        for (int i = 0; i < this.f15427a.size(); i++) {
            this.f15427a.get(i).mo14992c();
        }
    }

    /* renamed from: o */
    public PointF mo15565h() {
        return mo14089i((ez1<PointF>) null, 0.0f);
    }

    /* renamed from: p */
    public PointF mo14089i(ez1<PointF> ez1, float f) {
        return this.f22858a;
    }
}

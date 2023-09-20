package com.onedelhi.secure;

public class sc0 extends a90 {

    /* renamed from: a */
    public float f34970a;

    public sc0() {
        this.f34970a = -1.0f;
    }

    @Deprecated
    public sc0(float f) {
        this.f34970a = f;
    }

    /* renamed from: b */
    public void mo30484b(@mr2 fx3 fx3, float f, float f2, float f3) {
        fx3.mo36352r(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = (double) f3;
        double d2 = (double) f2;
        fx3.mo36348n((float) (Math.sin(Math.toRadians((double) f)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f))) * d * d2));
    }
}

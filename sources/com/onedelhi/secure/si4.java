package com.onedelhi.secure;

public class si4 extends bs0 {

    /* renamed from: a */
    public final float f35097a;

    /* renamed from: a */
    public final boolean f35098a;

    public si4(float f, boolean z) {
        this.f35097a = f;
        this.f35098a = z;
    }

    /* renamed from: b */
    public void mo24485b(float f, float f2, float f3, @mr2 fx3 fx3) {
        if (this.f35098a) {
            fx3.mo36348n(f2 - (this.f35097a * f3), 0.0f);
            float f4 = this.f35097a;
            fx3.mo36349o(f2, f4 * f3, (f4 * f3) + f2, 0.0f);
            fx3.mo36348n(f, 0.0f);
            return;
        }
        float f5 = this.f35097a;
        fx3.mo36349o(f2 - (f5 * f3), 0.0f, f2, (-f5) * f3);
        fx3.mo36349o(f2 + (this.f35097a * f3), 0.0f, f, 0.0f);
    }
}

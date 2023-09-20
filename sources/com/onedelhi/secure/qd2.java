package com.onedelhi.secure;

public final class qd2 extends bs0 {

    /* renamed from: a */
    public final float f34063a;

    public qd2(float f) {
        this.f34063a = f - 0.001f;
    }

    /* renamed from: a */
    public boolean mo32020a() {
        return true;
    }

    /* renamed from: b */
    public void mo24485b(float f, float f2, float f3, @mr2 fx3 fx3) {
        float sqrt = (float) ((((double) this.f34063a) * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.f34063a, 2.0d) - Math.pow((double) sqrt, 2.0d));
        fx3.mo36351q(f2 - sqrt, ((float) (-((((double) this.f34063a) * Math.sqrt(2.0d)) - ((double) this.f34063a)))) + sqrt2);
        fx3.mo36348n(f2, (float) (-((((double) this.f34063a) * Math.sqrt(2.0d)) - ((double) this.f34063a))));
        fx3.mo36348n(f2 + sqrt, ((float) (-((((double) this.f34063a) * Math.sqrt(2.0d)) - ((double) this.f34063a)))) + sqrt2);
    }
}

package com.onedelhi.secure;

import android.view.Choreographer;

public class gb2 extends C2982nj implements Choreographer.FrameCallback {

    /* renamed from: a */
    public float f12505a = 1.0f;
    @ts2

    /* renamed from: a */
    public la2 f12506a;

    /* renamed from: b */
    public float f12507b = 0.0f;

    /* renamed from: b */
    public long f12508b = 0;

    /* renamed from: b */
    public boolean f12509b = false;

    /* renamed from: c */
    public float f12510c = -2.14748365E9f;
    @hw4

    /* renamed from: c */
    public boolean f12511c = false;

    /* renamed from: d */
    public float f12512d = 2.14748365E9f;

    /* renamed from: n */
    public int f12513n = 0;

    /* renamed from: A */
    public void mo16473A(float f) {
        this.f12505a = f;
    }

    /* renamed from: B */
    public final void mo16474B() {
        if (this.f12506a != null) {
            float f = this.f12507b;
            if (f < this.f12510c || f > this.f12512d) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f12510c), Float.valueOf(this.f12512d), Float.valueOf(this.f12507b)}));
            }
        }
    }

    @bc2
    public void cancel() {
        mo21301a();
        mo16493r();
    }

    public void doFrame(long j) {
        mo16492q();
        if (this.f12506a != null && isRunning()) {
            h02.m16420a("LottieValueAnimator#doFrame");
            long j2 = this.f12508b;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float j4 = ((float) j3) / mo16485j();
            float f = this.f12507b;
            if (mo16489n()) {
                j4 = -j4;
            }
            float f2 = f + j4;
            this.f12507b = f2;
            boolean z = !hj2.m16789d(f2, mo16487l(), mo16486k());
            this.f12507b = hj2.m16787b(this.f12507b, mo16487l(), mo16486k());
            this.f12508b = j;
            mo21307e();
            if (z) {
                if (getRepeatCount() == -1 || this.f12513n < getRepeatCount()) {
                    mo21305c();
                    this.f12513n++;
                    if (getRepeatMode() == 2) {
                        this.f12509b = !this.f12509b;
                        mo16497u();
                    } else {
                        this.f12507b = mo16489n() ? mo16486k() : mo16487l();
                    }
                    this.f12508b = j;
                } else {
                    this.f12507b = this.f12505a < 0.0f ? mo16487l() : mo16486k();
                    mo16493r();
                    mo21304b(mo16489n());
                }
            }
            mo16474B();
            h02.m16421b("LottieValueAnimator#doFrame");
        }
    }

    /* renamed from: f */
    public void mo16477f() {
        this.f12506a = null;
        this.f12510c = -2.14748365E9f;
        this.f12512d = 2.14748365E9f;
    }

    @bc2
    /* renamed from: g */
    public void mo16478g() {
        mo16493r();
        mo21304b(mo16489n());
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    public float getAnimatedFraction() {
        float f;
        float l;
        if (this.f12506a == null) {
            return 0.0f;
        }
        if (mo16489n()) {
            f = mo16486k();
            l = this.f12507b;
        } else {
            f = this.f12507b;
            l = mo16487l();
        }
        return (f - l) / (mo16486k() - mo16487l());
    }

    public Object getAnimatedValue() {
        return Float.valueOf(mo16482h());
    }

    public long getDuration() {
        la2 la2 = this.f12506a;
        if (la2 == null) {
            return 0;
        }
        return (long) la2.mo19375d();
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    /* renamed from: h */
    public float mo16482h() {
        la2 la2 = this.f12506a;
        if (la2 == null) {
            return 0.0f;
        }
        return (this.f12507b - la2.mo19387p()) / (this.f12506a.mo19377f() - this.f12506a.mo19387p());
    }

    /* renamed from: i */
    public float mo16483i() {
        return this.f12507b;
    }

    public boolean isRunning() {
        return this.f12511c;
    }

    /* renamed from: j */
    public final float mo16485j() {
        la2 la2 = this.f12506a;
        if (la2 == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / la2.mo19379h()) / Math.abs(this.f12505a);
    }

    /* renamed from: k */
    public float mo16486k() {
        la2 la2 = this.f12506a;
        if (la2 == null) {
            return 0.0f;
        }
        float f = this.f12512d;
        return f == 2.14748365E9f ? la2.mo19377f() : f;
    }

    /* renamed from: l */
    public float mo16487l() {
        la2 la2 = this.f12506a;
        if (la2 == null) {
            return 0.0f;
        }
        float f = this.f12510c;
        return f == -2.14748365E9f ? la2.mo19387p() : f;
    }

    /* renamed from: m */
    public float mo16488m() {
        return this.f12505a;
    }

    /* renamed from: n */
    public final boolean mo16489n() {
        return mo16488m() < 0.0f;
    }

    @bc2
    /* renamed from: o */
    public void mo16490o() {
        mo16493r();
    }

    @bc2
    /* renamed from: p */
    public void mo16491p() {
        this.f12511c = true;
        mo21306d(mo16489n());
        mo16499w((float) ((int) (mo16489n() ? mo16486k() : mo16487l())));
        this.f12508b = 0;
        this.f12513n = 0;
        mo16492q();
    }

    /* renamed from: q */
    public void mo16492q() {
        if (isRunning()) {
            mo16494s(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @bc2
    /* renamed from: r */
    public void mo16493r() {
        mo16494s(true);
    }

    @bc2
    /* renamed from: s */
    public void mo16494s(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f12511c = false;
        }
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f12509b) {
            this.f12509b = false;
            mo16497u();
        }
    }

    @bc2
    /* renamed from: t */
    public void mo16496t() {
        float l;
        this.f12511c = true;
        mo16492q();
        this.f12508b = 0;
        if (mo16489n() && mo16483i() == mo16487l()) {
            l = mo16486k();
        } else if (!mo16489n() && mo16483i() == mo16486k()) {
            l = mo16487l();
        } else {
            return;
        }
        this.f12507b = l;
    }

    /* renamed from: u */
    public void mo16497u() {
        mo16473A(-mo16488m());
    }

    /* renamed from: v */
    public void mo16498v(la2 la2) {
        float f;
        float f2;
        boolean z = this.f12506a == null;
        this.f12506a = la2;
        if (z) {
            f2 = (float) ((int) Math.max(this.f12510c, la2.mo19387p()));
            f = Math.min(this.f12512d, la2.mo19377f());
        } else {
            f2 = (float) ((int) la2.mo19387p());
            f = la2.mo19377f();
        }
        mo16501y(f2, (float) ((int) f));
        float f3 = this.f12507b;
        this.f12507b = 0.0f;
        mo16499w((float) ((int) f3));
        mo21307e();
    }

    /* renamed from: w */
    public void mo16499w(float f) {
        if (this.f12507b != f) {
            this.f12507b = hj2.m16787b(f, mo16487l(), mo16486k());
            this.f12508b = 0;
            mo21307e();
        }
    }

    /* renamed from: x */
    public void mo16500x(float f) {
        mo16501y(this.f12510c, f);
    }

    /* renamed from: y */
    public void mo16501y(float f, float f2) {
        if (f <= f2) {
            la2 la2 = this.f12506a;
            float p = la2 == null ? -3.4028235E38f : la2.mo19387p();
            la2 la22 = this.f12506a;
            float f3 = la22 == null ? Float.MAX_VALUE : la22.mo19377f();
            this.f12510c = hj2.m16787b(f, p, f3);
            this.f12512d = hj2.m16787b(f2, p, f3);
            mo16499w((float) ((int) hj2.m16787b(this.f12507b, f, f2)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: z */
    public void mo16502z(int i) {
        mo16501y((float) i, (float) ((int) this.f12512d));
    }
}

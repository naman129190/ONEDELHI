package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import com.onedelhi.secure.pq0;

public final class b24 implements ca1 {

    /* renamed from: a */
    public static final float f9608a = 10000.0f;

    /* renamed from: b */
    public static final float f9609b = 1500.0f;

    /* renamed from: c */
    public static final float f9610c = 200.0f;

    /* renamed from: d */
    public static final float f9611d = 50.0f;

    /* renamed from: e */
    public static final float f9612e = 0.2f;

    /* renamed from: f */
    public static final float f9613f = 0.5f;

    /* renamed from: g */
    public static final float f9614g = 0.75f;

    /* renamed from: h */
    public static final float f9615h = 1.0f;

    /* renamed from: i */
    public static final double f9616i = 62.5d;

    /* renamed from: j */
    public static final double f9617j = Double.MAX_VALUE;

    /* renamed from: a */
    public double f9618a = Math.sqrt(1500.0d);

    /* renamed from: a */
    public final pq0.C3177p f9619a = new pq0.C3177p();

    /* renamed from: a */
    public boolean f9620a = false;

    /* renamed from: b */
    public double f9621b = 0.5d;

    /* renamed from: c */
    public double f9622c;

    /* renamed from: d */
    public double f9623d;

    /* renamed from: e */
    public double f9624e;

    /* renamed from: f */
    public double f9625f;

    /* renamed from: g */
    public double f9626g;

    /* renamed from: h */
    public double f9627h = Double.MAX_VALUE;

    public b24() {
    }

    public b24(float f) {
        this.f9627h = (double) f;
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: a */
    public float mo13383a(float f, float f2) {
        float d = f - mo13386d();
        double d2 = this.f9618a;
        return (float) (((-(d2 * d2)) * ((double) d)) - (((d2 * 2.0d) * this.f9621b) * ((double) f2)));
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: b */
    public boolean mo13384b(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f9623d && ((double) Math.abs(f - mo13386d())) < this.f9622c;
    }

    /* renamed from: c */
    public float mo13385c() {
        return (float) this.f9621b;
    }

    /* renamed from: d */
    public float mo13386d() {
        return (float) this.f9627h;
    }

    /* renamed from: e */
    public float mo13387e() {
        double d = this.f9618a;
        return (float) (d * d);
    }

    /* renamed from: f */
    public final void mo13388f() {
        if (!this.f9620a) {
            if (this.f9627h != Double.MAX_VALUE) {
                double d = this.f9621b;
                if (d > 1.0d) {
                    double d2 = this.f9618a;
                    this.f9624e = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                    double d3 = this.f9621b;
                    double d4 = this.f9618a;
                    this.f9625f = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
                } else if (d >= 0.0d && d < 1.0d) {
                    this.f9626g = this.f9618a * Math.sqrt(1.0d - (d * d));
                }
                this.f9620a = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* renamed from: g */
    public b24 mo13389g(@d81(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.f9621b = (double) f;
            this.f9620a = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: h */
    public b24 mo13390h(float f) {
        this.f9627h = (double) f;
        return this;
    }

    /* renamed from: i */
    public b24 mo13391i(@d81(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f9618a = Math.sqrt((double) f);
            this.f9620a = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: j */
    public void mo13392j(double d) {
        double abs = Math.abs(d);
        this.f9622c = abs;
        this.f9623d = abs * 62.5d;
    }

    /* renamed from: k */
    public pq0.C3177p mo13393k(double d, double d2, long j) {
        double d3;
        double d4;
        mo13388f();
        double d5 = ((double) j) / 1000.0d;
        double d6 = d - this.f9627h;
        double d7 = this.f9621b;
        if (d7 > 1.0d) {
            double d8 = this.f9625f;
            double d9 = this.f9624e;
            double d10 = d6 - (((d8 * d6) - d2) / (d8 - d9));
            double d11 = ((d6 * d8) - d2) / (d8 - d9);
            d4 = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.f9624e * d5) * d11);
            double d12 = this.f9625f;
            double pow = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.f9624e;
            d3 = pow + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.f9618a;
            double d15 = d2 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            d4 = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double pow2 = d16 * Math.pow(2.718281828459045d, (-this.f9618a) * d5);
            double d17 = this.f9618a;
            d3 = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (pow2 * (-d17));
        } else {
            double d18 = 1.0d / this.f9626g;
            double d19 = this.f9618a;
            double d20 = d18 * ((d7 * d19 * d6) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d7) * d19 * d5) * ((Math.cos(this.f9626g * d5) * d6) + (Math.sin(this.f9626g * d5) * d20));
            double d21 = this.f9618a;
            double d22 = this.f9621b;
            double d23 = (-d21) * pow3 * d22;
            double pow4 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d24 = this.f9626g;
            double d25 = pow3;
            double sin = (-d24) * d6 * Math.sin(d24 * d5);
            double d26 = this.f9626g;
            d3 = d23 + (pow4 * (sin + (d20 * d26 * Math.cos(d26 * d5))));
            d4 = d25;
        }
        pq0.C3177p pVar = this.f9619a;
        pVar.f18677a = (float) (d4 + this.f9627h);
        pVar.f18678b = (float) d3;
        return pVar;
    }
}

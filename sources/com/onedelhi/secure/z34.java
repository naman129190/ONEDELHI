package com.onedelhi.secure;

public class z34 implements v34 {

    /* renamed from: l */
    public static final float f23432l = 1.0E-5f;

    /* renamed from: a */
    public float f23433a;

    /* renamed from: a */
    public int f23434a;

    /* renamed from: a */
    public String f23435a;

    /* renamed from: a */
    public boolean f23436a = false;

    /* renamed from: b */
    public float f23437b;

    /* renamed from: b */
    public boolean f23438b = false;

    /* renamed from: c */
    public float f23439c;

    /* renamed from: d */
    public float f23440d;

    /* renamed from: e */
    public float f23441e;

    /* renamed from: f */
    public float f23442f;

    /* renamed from: g */
    public float f23443g;

    /* renamed from: h */
    public float f23444h;

    /* renamed from: i */
    public float f23445i;

    /* renamed from: j */
    public float f23446j;

    /* renamed from: k */
    public float f23447k;

    /* renamed from: a */
    public float mo13952a() {
        return this.f23436a ? -mo13953b(this.f23447k) : mo13953b(this.f23447k);
    }

    /* renamed from: b */
    public float mo13953b(float f) {
        float f2 = this.f23440d;
        if (f <= f2) {
            float f3 = this.f23433a;
            return f3 + (((this.f23437b - f3) * f) / f2);
        }
        int i = this.f23434a;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f23441e;
        if (f4 < f5) {
            float f6 = this.f23437b;
            return f6 + (((this.f23439c - f6) * f4) / f5);
        } else if (i == 2) {
            return this.f23444h;
        } else {
            float f7 = f4 - f5;
            float f8 = this.f23442f;
            if (f7 >= f8) {
                return this.f23445i;
            }
            float f9 = this.f23439c;
            return f9 - ((f7 * f9) / f8);
        }
    }

    /* renamed from: c */
    public boolean mo13954c() {
        return mo13952a() < 1.0E-5f && Math.abs(this.f23445i - this.f23447k) < 1.0E-5f;
    }

    /* renamed from: d */
    public String mo13955d(String str, float f) {
        StringBuilder sb;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str + " ===== " + this.f23435a + "\n");
        sb2.append(str);
        sb2.append(this.f23436a ? "backwards" : "forward ");
        sb2.append(" time = ");
        sb2.append(f);
        sb2.append("  stages ");
        sb2.append(this.f23434a);
        sb2.append("\n");
        String str3 = sb2.toString() + str + " dur " + this.f23440d + " vel " + this.f23433a + " pos " + this.f23443g + "\n";
        if (this.f23434a > 1) {
            str3 = str3 + str + " dur " + this.f23441e + " vel " + this.f23437b + " pos " + this.f23444h + "\n";
        }
        if (this.f23434a > 2) {
            str3 = str3 + str + " dur " + this.f23442f + " vel " + this.f23439c + " pos " + this.f23445i + "\n";
        }
        float f2 = this.f23440d;
        if (f <= f2) {
            sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            str2 = "stage 0\n";
        } else {
            int i = this.f23434a;
            if (i == 1) {
                sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                str2 = "end stage 0\n";
            } else {
                float f3 = f - f2;
                float f4 = this.f23441e;
                if (f3 < f4) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(str);
                    str2 = " stage 1\n";
                } else if (i == 2) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(str);
                    str2 = "end stage 1\n";
                } else if (f3 - f4 < this.f23442f) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(str);
                    str2 = " stage 2\n";
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(str);
                    str2 = " end stage 2\n";
                }
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: e */
    public final float mo27788e(float f) {
        this.f23438b = false;
        float f2 = this.f23440d;
        if (f <= f2) {
            float f3 = this.f23433a;
            return (f3 * f) + ((((this.f23437b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f23434a;
        if (i == 1) {
            return this.f23443g;
        }
        float f4 = f - f2;
        float f5 = this.f23441e;
        if (f4 < f5) {
            float f6 = this.f23443g;
            float f7 = this.f23437b;
            return f6 + (f7 * f4) + ((((this.f23439c - f7) * f4) * f4) / (f5 * 2.0f));
        } else if (i == 2) {
            return this.f23444h;
        } else {
            float f8 = f4 - f5;
            float f9 = this.f23442f;
            if (f8 <= f9) {
                float f10 = this.f23444h;
                float f11 = this.f23439c;
                return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
            }
            this.f23438b = true;
            return this.f23445i;
        }
    }

    /* renamed from: f */
    public void mo27789f(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8;
        z34 z34;
        boolean z = false;
        this.f23438b = false;
        this.f23446j = f;
        if (f > f2) {
            z = true;
        }
        this.f23436a = z;
        if (z) {
            f8 = -f3;
            f7 = f - f2;
            z34 = this;
        } else {
            f7 = f2 - f;
            z34 = this;
            f8 = f3;
        }
        z34.mo27790g(f8, f7, f5, f6, f4);
    }

    /* renamed from: g */
    public final void mo27790g(float f, float f2, float f3, float f4, float f5) {
        this.f23438b = false;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f23433a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f2 - ((((-f) / f3) * f) / 2.0f)) * f3));
            if (sqrt < f4) {
                this.f23435a = "backward accelerate, decelerate";
                this.f23434a = 2;
                this.f23433a = f;
                this.f23437b = sqrt;
                this.f23439c = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.f23440d = f8;
                this.f23441e = sqrt / f3;
                this.f23443g = ((f + sqrt) * f8) / 2.0f;
                this.f23444h = f2;
                this.f23445i = f2;
                return;
            }
            this.f23435a = "backward accelerate cruse decelerate";
            this.f23434a = 3;
            this.f23433a = f;
            this.f23437b = f4;
            this.f23439c = f4;
            float f9 = (f4 - f) / f3;
            this.f23440d = f9;
            float f10 = f4 / f3;
            this.f23442f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f23441e = ((f2 - f11) - f12) / f4;
            this.f23443g = f11;
            this.f23444h = f2 - f12;
            this.f23445i = f2;
        } else if (f7 >= f2) {
            this.f23435a = "hard stop";
            this.f23434a = 1;
            this.f23433a = f;
            this.f23437b = 0.0f;
            this.f23443g = f2;
            this.f23440d = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.f23435a = "cruse decelerate";
                this.f23434a = 2;
                this.f23433a = f;
                this.f23437b = f;
                this.f23439c = 0.0f;
                this.f23443g = f13;
                this.f23444h = f2;
                this.f23440d = f14;
                this.f23441e = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f3 * f2) + ((f * f) / 2.0f)));
            float f15 = (sqrt2 - f) / f3;
            this.f23440d = f15;
            float f16 = sqrt2 / f3;
            this.f23441e = f16;
            if (sqrt2 < f4) {
                this.f23435a = "accelerate decelerate";
                this.f23434a = 2;
                this.f23433a = f;
                this.f23437b = sqrt2;
                this.f23439c = 0.0f;
                this.f23440d = f15;
                this.f23441e = f16;
                this.f23443g = ((f + sqrt2) * f15) / 2.0f;
                this.f23444h = f2;
                return;
            }
            this.f23435a = "accelerate cruse decelerate";
            this.f23434a = 3;
            this.f23433a = f;
            this.f23437b = f4;
            this.f23439c = f4;
            float f17 = (f4 - f) / f3;
            this.f23440d = f17;
            float f18 = f4 / f3;
            this.f23442f = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.f23441e = ((f2 - f19) - f20) / f4;
            this.f23443g = f19;
            this.f23444h = f2 - f20;
            this.f23445i = f2;
        }
    }

    public float getInterpolation(float f) {
        float e = mo27788e(f);
        this.f23447k = f;
        return this.f23436a ? this.f23446j - e : this.f23446j + e;
    }
}

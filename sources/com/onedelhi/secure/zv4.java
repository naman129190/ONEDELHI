package com.onedelhi.secure;

public final class zv4 {

    /* renamed from: a */
    public static final zv4 f23908a = m33480k(C2198ft.f12314a, (float) ((((double) C2198ft.m15290h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    public final float f23909a;

    /* renamed from: a */
    public final float[] f23910a;

    /* renamed from: b */
    public final float f23911b;

    /* renamed from: c */
    public final float f23912c;

    /* renamed from: d */
    public final float f23913d;

    /* renamed from: e */
    public final float f23914e;

    /* renamed from: f */
    public final float f23915f;

    /* renamed from: g */
    public final float f23916g;

    /* renamed from: h */
    public final float f23917h;

    /* renamed from: i */
    public final float f23918i;

    public zv4(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f23915f = f;
        this.f23909a = f2;
        this.f23911b = f3;
        this.f23912c = f4;
        this.f23913d = f5;
        this.f23914e = f6;
        this.f23910a = fArr;
        this.f23916g = f7;
        this.f23917h = f8;
        this.f23918i = f9;
    }

    @mr2
    /* renamed from: k */
    public static zv4 m33480k(@mr2 float[] fArr, float f, float f2, float f3, boolean z) {
        float f4 = f;
        float[][] fArr2 = C2198ft.f12315a;
        float f5 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f6 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f7 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f8 = (f3 / 10.0f) + 0.8f;
        float d = ((double) f8) >= 0.9d ? C2198ft.m15286d(0.59f, 0.69f, (f8 - 0.9f) * 10.0f) : C2198ft.m15286d(0.525f, 0.59f, (f8 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp((double) (((-f4) - 42.0f) / 92.0f))) * 0.2777778f)) * f8;
        double d2 = (double) exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * f4) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (f10 * f4) + (0.1f * f11 * f11 * ((float) Math.cbrt(((double) f4) * 5.0d)));
        float h = C2198ft.m15290h(f2) / fArr[1];
        double d3 = (double) h;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f5)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f7)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new zv4(h, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, d, f8, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* renamed from: a */
    public float mo28137a() {
        return this.f23909a;
    }

    /* renamed from: b */
    public float mo28138b() {
        return this.f23913d;
    }

    /* renamed from: c */
    public float mo28139c() {
        return this.f23916g;
    }

    /* renamed from: d */
    public float mo28140d() {
        return this.f23917h;
    }

    /* renamed from: e */
    public float mo28141e() {
        return this.f23915f;
    }

    /* renamed from: f */
    public float mo28142f() {
        return this.f23911b;
    }

    /* renamed from: g */
    public float mo28143g() {
        return this.f23914e;
    }

    /* renamed from: h */
    public float mo28144h() {
        return this.f23912c;
    }

    @mr2
    /* renamed from: i */
    public float[] mo28145i() {
        return this.f23910a;
    }

    /* renamed from: j */
    public float mo28146j() {
        return this.f23918i;
    }
}

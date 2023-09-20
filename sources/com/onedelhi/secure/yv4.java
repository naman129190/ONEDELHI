package com.onedelhi.secure;

public final class yv4 {

    /* renamed from: a */
    public static final yv4 f23342a = m32697k(q10.m25248n(), (float) ((((double) q10.m25250p(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    public final float f23343a;

    /* renamed from: a */
    public final float[] f23344a;

    /* renamed from: b */
    public final float f23345b;

    /* renamed from: c */
    public final float f23346c;

    /* renamed from: d */
    public final float f23347d;

    /* renamed from: e */
    public final float f23348e;

    /* renamed from: f */
    public final float f23349f;

    /* renamed from: g */
    public final float f23350g;

    /* renamed from: h */
    public final float f23351h;

    /* renamed from: i */
    public final float f23352i;

    public yv4(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f23349f = f;
        this.f23343a = f2;
        this.f23345b = f3;
        this.f23346c = f4;
        this.f23347d = f5;
        this.f23348e = f6;
        this.f23344a = fArr;
        this.f23350g = f7;
        this.f23351h = f8;
        this.f23352i = f9;
    }

    /* renamed from: k */
    public static yv4 m32697k(float[] fArr, float f, float f2, float f3, boolean z) {
        float f4 = f;
        float[][] fArr2 = C1992dt.f10899a;
        float f5 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f6 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f7 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f8 = (f3 / 10.0f) + 0.8f;
        float c = ((double) f8) >= 0.9d ? of2.m23737c(0.59f, 0.69f, (f8 - 0.9f) * 10.0f) : of2.m23737c(0.525f, 0.59f, (f8 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp((double) (((-f4) - 42.0f) / 92.0f))) * 0.2777778f)) * f8;
        double d = (double) exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * f4) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (f10 * f4) + (0.1f * f11 * f11 * ((float) Math.cbrt(((double) f4) * 5.0d)));
        float p = q10.m25250p(f2) / fArr[1];
        double d2 = (double) p;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f5)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f7)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new yv4(p, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, c, f8, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* renamed from: a */
    public float mo27718a() {
        return this.f23343a;
    }

    /* renamed from: b */
    public float mo27719b() {
        return this.f23347d;
    }

    /* renamed from: c */
    public float mo27720c() {
        return this.f23350g;
    }

    /* renamed from: d */
    public float mo27721d() {
        return this.f23351h;
    }

    /* renamed from: e */
    public float mo27722e() {
        return this.f23349f;
    }

    /* renamed from: f */
    public float mo27723f() {
        return this.f23345b;
    }

    /* renamed from: g */
    public float mo27724g() {
        return this.f23348e;
    }

    /* renamed from: h */
    public float mo27725h() {
        return this.f23346c;
    }

    /* renamed from: i */
    public float[] mo27726i() {
        return this.f23344a;
    }

    /* renamed from: j */
    public float mo27727j() {
        return this.f23352i;
    }
}

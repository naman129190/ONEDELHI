package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.dt */
public final class C1992dt {

    /* renamed from: a */
    public static final float[][] f10899a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    public static final float[][] f10900b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: a */
    public final float f10901a;

    /* renamed from: b */
    public final float f10902b;

    /* renamed from: c */
    public final float f10903c;

    /* renamed from: d */
    public final float f10904d;

    /* renamed from: e */
    public final float f10905e;

    /* renamed from: f */
    public final float f10906f;

    /* renamed from: g */
    public final float f10907g;

    /* renamed from: h */
    public final float f10908h;

    /* renamed from: i */
    public final float f10909i;

    public C1992dt(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f10901a = f;
        this.f10902b = f2;
        this.f10903c = f3;
        this.f10904d = f4;
        this.f10905e = f5;
        this.f10906f = f6;
        this.f10907g = f7;
        this.f10908h = f8;
        this.f10909i = f9;
    }

    /* renamed from: b */
    public static C1992dt m13291b(int i) {
        return m13292c(i, yv4.f23342a);
    }

    /* renamed from: c */
    public static C1992dt m13292c(int i, yv4 yv4) {
        int i2 = i;
        float k = q10.m25245k(((float) ((16711680 & i2) >> 16)) / 255.0f) * 100.0f;
        float k2 = q10.m25245k(((float) ((65280 & i2) >> 8)) / 255.0f) * 100.0f;
        float k3 = q10.m25245k(((float) (i2 & 255)) / 255.0f) * 100.0f;
        float f = (0.41233894f * k) + (0.35762063f * k2) + (0.18051042f * k3);
        float f2 = (0.2126f * k) + (0.7152f * k2) + (0.0722f * k3);
        float f3 = (k * 0.01932141f) + (k2 * 0.11916382f) + (k3 * 0.9503448f);
        float[][] fArr = f10899a;
        float f4 = (fArr[0][0] * f) + (fArr[0][1] * f2) + (fArr[0][2] * f3);
        float f5 = (fArr[1][0] * f) + (fArr[1][1] * f2) + (fArr[1][2] * f3);
        float f6 = (f * fArr[2][0]) + (f2 * fArr[2][1]) + (f3 * fArr[2][2]);
        float f7 = yv4.mo27726i()[0] * f4;
        float f8 = yv4.mo27726i()[1] * f5;
        float f9 = yv4.mo27726i()[2] * f6;
        float pow = (float) Math.pow(((double) (yv4.mo27720c() * Math.abs(f7))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (yv4.mo27720c() * Math.abs(f8))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (yv4.mo27720c() * Math.abs(f9))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f7) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f8) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f9) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (((double) signum) * 11.0d) + (((double) signum2) * -12.0d);
        double d2 = (double) signum3;
        float f10 = signum2 * 20.0f;
        float f11 = (((signum * 20.0f) + f10) + (21.0f * signum3)) / 20.0f;
        float f12 = (((signum * 40.0f) + f10) + signum3) / 20.0f;
        double d3 = (double) (((float) (((double) (signum + signum2)) - (d2 * 2.0d))) / 9.0f);
        double d4 = (double) (((float) (d + d2)) / 11.0f);
        float atan2 = (((float) Math.atan2(d3, d4)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f13 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f12 * yv4.mo27723f()) / yv4.mo27718a()), (double) (yv4.mo27719b() * yv4.mo27727j()))) * 100.0f;
        float b = (4.0f / yv4.mo27719b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (yv4.mo27718a() + 4.0f) * yv4.mo27721d();
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) yv4.mo27722e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(Math.toRadians((double) (((double) atan2) < 20.14d ? 360.0f + atan2 : atan2)) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * yv4.mo27724g()) * yv4.mo27725h()) * ((float) Math.hypot(d4, d3))) / (f11 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float d5 = sqrt * yv4.mo27721d();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * yv4.mo27719b()) / (yv4.mo27718a() + 4.0f)))) * 50.0f;
        float f14 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log1p = ((float) Math.log1p((double) (0.0228f * d5))) * 43.85965f;
        double d6 = (double) f13;
        return new C1992dt(atan2, sqrt, pow4, b, d5, sqrt2, f14, log1p * ((float) Math.cos(d6)), log1p * ((float) Math.sin(d6)));
    }

    /* renamed from: d */
    public static C1992dt m13293d(float f, float f2, float f3) {
        return m13294e(f, f2, f3, yv4.f23342a);
    }

    /* renamed from: e */
    public static C1992dt m13294e(float f, float f2, float f3, yv4 yv4) {
        float f4 = f;
        double d = ((double) f4) / 100.0d;
        float b = (4.0f / yv4.mo27719b()) * ((float) Math.sqrt(d)) * (yv4.mo27718a() + 4.0f) * yv4.mo27721d();
        float d2 = f2 * yv4.mo27721d();
        float sqrt = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * yv4.mo27719b()) / (yv4.mo27718a() + 4.0f)))) * 50.0f;
        float f5 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log1p = ((float) Math.log1p(((double) d2) * 0.0228d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f3) / 180.0f);
        return new C1992dt(f3, f2, f4, b, d2, sqrt, f5, log1p * ((float) Math.cos(d3)), log1p * ((float) Math.sin(d3)));
    }

    /* renamed from: f */
    public static C1992dt m13295f(float f, float f2, float f3) {
        return m13296g(f, f2, f3, yv4.f23342a);
    }

    /* renamed from: g */
    public static C1992dt m13296g(float f, float f2, float f3, yv4 yv4) {
        double d = (double) f2;
        double d2 = (double) f3;
        double expm1 = (Math.expm1(Math.hypot(d, d2) * 0.02280000038444996d) / 0.02280000038444996d) / ((double) yv4.mo27721d());
        double atan2 = Math.atan2(d2, d) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return m13294e(f / (1.0f - ((f - 100.0f) * 0.007f)), (float) expm1, (float) atan2, yv4);
    }

    /* renamed from: a */
    public float mo14831a(C1992dt dtVar) {
        float n = mo14838n() - dtVar.mo14838n();
        float h = mo14832h() - dtVar.mo14832h();
        float i = mo14833i() - dtVar.mo14833i();
        return (float) (Math.pow(Math.sqrt((double) ((n * n) + (h * h) + (i * i))), 0.63d) * 1.41d);
    }

    /* renamed from: h */
    public float mo14832h() {
        return this.f10908h;
    }

    /* renamed from: i */
    public float mo14833i() {
        return this.f10909i;
    }

    /* renamed from: j */
    public float mo14834j() {
        return this.f10902b;
    }

    /* renamed from: k */
    public float mo14835k() {
        return this.f10901a;
    }

    /* renamed from: l */
    public int mo14836l() {
        return mo14842r(yv4.f23342a);
    }

    /* renamed from: m */
    public float mo14837m() {
        return this.f10903c;
    }

    /* renamed from: n */
    public float mo14838n() {
        return this.f10907g;
    }

    /* renamed from: o */
    public float mo14839o() {
        return this.f10905e;
    }

    /* renamed from: p */
    public float mo14840p() {
        return this.f10904d;
    }

    /* renamed from: q */
    public float mo14841q() {
        return this.f10906f;
    }

    /* renamed from: r */
    public int mo14842r(yv4 yv4) {
        float pow = (float) Math.pow(((double) ((((double) mo14834j()) == 0.0d || ((double) mo14837m()) == 0.0d) ? 0.0f : mo14834j() / ((float) Math.sqrt(((double) mo14837m()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, (double) yv4.mo27722e()), 0.73d), 1.1111111111111112d);
        double k = (double) ((mo14835k() * 3.1415927f) / 180.0f);
        float a = yv4.mo27718a() * ((float) Math.pow(((double) mo14837m()) / 100.0d, (1.0d / ((double) yv4.mo27719b())) / ((double) yv4.mo27727j())));
        float cos = ((float) (Math.cos(2.0d + k) + 3.8d)) * 0.25f * 3846.1538f * yv4.mo27724g() * yv4.mo27725h();
        float f = a / yv4.mo27723f();
        float sin = (float) Math.sin(k);
        float cos2 = (float) Math.cos(k);
        float f2 = (((0.305f + f) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = f * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f6) * (100.0f / yv4.mo27720c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6))))), 2.380952380952381d));
        float signum2 = Math.signum(f7) * (100.0f / yv4.mo27720c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7))))), 2.380952380952381d));
        float signum3 = Math.signum(f8) * (100.0f / yv4.mo27720c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8))))), 2.380952380952381d));
        float f9 = signum / yv4.mo27726i()[0];
        float f10 = signum2 / yv4.mo27726i()[1];
        float f11 = signum3 / yv4.mo27726i()[2];
        float[][] fArr = f10900b;
        return q10.m25243i((fArr[0][0] * f9) + (fArr[0][1] * f10) + (fArr[0][2] * f11), (fArr[1][0] * f9) + (fArr[1][1] * f10) + (fArr[1][2] * f11), (f9 * fArr[2][0]) + (f10 * fArr[2][1]) + (f11 * fArr[2][2]));
    }
}

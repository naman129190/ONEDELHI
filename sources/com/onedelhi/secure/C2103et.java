package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.et */
public class C2103et {

    /* renamed from: j */
    public static final float f11702j = 0.2f;

    /* renamed from: k */
    public static final float f11703k = 1.0f;

    /* renamed from: l */
    public static final float f11704l = 0.4f;

    /* renamed from: m */
    public static final float f11705m = 0.01f;

    /* renamed from: a */
    public final float f11706a;

    /* renamed from: b */
    public final float f11707b;

    /* renamed from: c */
    public final float f11708c;

    /* renamed from: d */
    public final float f11709d;

    /* renamed from: e */
    public final float f11710e;

    /* renamed from: f */
    public final float f11711f;

    /* renamed from: g */
    public final float f11712g;

    /* renamed from: h */
    public final float f11713h;

    /* renamed from: i */
    public final float f11714i;

    public C2103et(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f11706a = f;
        this.f11707b = f2;
        this.f11708c = f3;
        this.f11709d = f4;
        this.f11710e = f5;
        this.f11711f = f6;
        this.f11712g = f7;
        this.f11713h = f8;
        this.f11714i = f9;
    }

    @ts2
    /* renamed from: b */
    public static C2103et m14345b(@d81(from = 0.0d, mo14561to = 360.0d) float f, @d81(from = 0.0d, mo14561to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @d81(from = 0.0d, mo14561to = 100.0d) float f3) {
        float f4 = 1000.0f;
        C2103et etVar = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f6) > 0.01f) {
            float f8 = ((f6 - f7) / 2.0f) + f7;
            int s = m14348e(f8, f2, f).mo15589s();
            float b = C2198ft.m15284b(s);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                C2103et c = m14346c(s);
                float a = c.mo15578a(m14348e(c.mo15583k(), c.mo15581i(), f));
                if (a <= 1.0f) {
                    etVar = c;
                    f4 = abs;
                    f5 = a;
                }
            }
            if (f4 == 0.0f && f5 == 0.0f) {
                break;
            } else if (b < f3) {
                f7 = f8;
            } else {
                f6 = f8;
            }
        }
        return etVar;
    }

    @mr2
    /* renamed from: c */
    public static C2103et m14346c(@d10 int i) {
        return m14347d(i, zv4.f23908a);
    }

    @mr2
    /* renamed from: d */
    public static C2103et m14347d(@d10 int i, @mr2 zv4 zv4) {
        float[] f = C2198ft.m15288f(i);
        float[][] fArr = C2198ft.f12315a;
        float f2 = (f[0] * fArr[0][0]) + (f[1] * fArr[0][1]) + (f[2] * fArr[0][2]);
        float f3 = (f[0] * fArr[1][0]) + (f[1] * fArr[1][1]) + (f[2] * fArr[1][2]);
        float f4 = (f[0] * fArr[2][0]) + (f[1] * fArr[2][1]) + (f[2] * fArr[2][2]);
        float f5 = zv4.mo28145i()[0] * f2;
        float f6 = zv4.mo28145i()[1] * f3;
        float f7 = zv4.mo28145i()[2] * f4;
        float pow = (float) Math.pow(((double) (zv4.mo28139c() * Math.abs(f5))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (zv4.mo28139c() * Math.abs(f6))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (zv4.mo28139c() * Math.abs(f7))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f5) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f6) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f7) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f8 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d)) / 11.0f;
        float f9 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f10 = signum2 * 20.0f;
        float f11 = (((signum * 20.0f) + f10) + (21.0f * signum3)) / 20.0f;
        float f12 = (((signum * 40.0f) + f10) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f9, (double) f8)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f13 = atan2;
        float f14 = (3.1415927f * f13) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f12 * zv4.mo28142f()) / zv4.mo28137a()), (double) (zv4.mo28138b() * zv4.mo28146j()))) * 100.0f;
        float d2 = zv4.mo28140d() * (4.0f / zv4.mo28138b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (zv4.mo28137a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) zv4.mo28141e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f13) < 20.14d ? 360.0f + f13 : f13)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * zv4.mo28143g()) * zv4.mo28144h()) * ((float) Math.sqrt((double) ((f8 * f8) + (f9 * f9))))) / (f11 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float d3 = sqrt * zv4.mo28140d();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * zv4.mo28138b()) / (zv4.mo28137a() + 4.0f)))) * 50.0f;
        float f15 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d3) + 1.0f))) * 43.85965f;
        double d4 = (double) f14;
        return new C2103et(f13, sqrt, pow4, d2, d3, sqrt2, f15, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    @mr2
    /* renamed from: e */
    public static C2103et m14348e(@d81(from = 0.0d, mo14561to = 100.0d) float f, @d81(from = 0.0d, mo14561to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @d81(from = 0.0d, mo14561to = 360.0d) float f3) {
        return m14349f(f, f2, f3, zv4.f23908a);
    }

    @mr2
    /* renamed from: f */
    public static C2103et m14349f(@d81(from = 0.0d, mo14561to = 100.0d) float f, @d81(from = 0.0d, mo14561to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @d81(from = 0.0d, mo14561to = 360.0d) float f3, zv4 zv4) {
        float f4 = f;
        double d = ((double) f4) / 100.0d;
        float b = (4.0f / zv4.mo28138b()) * ((float) Math.sqrt(d)) * (zv4.mo28137a() + 4.0f) * zv4.mo28140d();
        float d2 = f2 * zv4.mo28140d();
        float sqrt = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * zv4.mo28138b()) / (zv4.mo28137a() + 4.0f)))) * 50.0f;
        float f5 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((((double) d2) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f3) / 180.0f);
        return new C2103et(f3, f2, f4, b, d2, sqrt, f5, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    /* renamed from: p */
    public static int m14350p(@d81(from = 0.0d, mo14561to = 360.0d) float f, @d81(from = 0.0d, mo14561to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @d81(from = 0.0d, mo14561to = 100.0d) float f3) {
        return m14351q(f, f2, f3, zv4.f23908a);
    }

    @d10
    /* renamed from: q */
    public static int m14351q(@d81(from = 0.0d, mo14561to = 360.0d) float f, @d81(from = 0.0d, mo14561to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @d81(from = 0.0d, mo14561to = 100.0d) float f3, @mr2 zv4 zv4) {
        if (((double) f2) < 1.0d || ((double) Math.round(f3)) <= 0.0d || ((double) Math.round(f3)) >= 100.0d) {
            return C2198ft.m15283a(f3);
        }
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f4 = f2;
        C2103et etVar = null;
        float f5 = 0.0f;
        boolean z = true;
        while (Math.abs(f5 - f2) >= 0.4f) {
            C2103et b = m14345b(min, f4, f3);
            if (z) {
                if (b != null) {
                    return b.mo15588r(zv4);
                }
                z = false;
            } else if (b == null) {
                f2 = f4;
            } else {
                f5 = f4;
                etVar = b;
            }
            f4 = ((f2 - f5) / 2.0f) + f5;
        }
        return etVar == null ? C2198ft.m15283a(f3) : etVar.mo15588r(zv4);
    }

    /* renamed from: a */
    public float mo15578a(@mr2 C2103et etVar) {
        float l = mo15584l() - etVar.mo15584l();
        float g = mo15579g() - etVar.mo15579g();
        float h = mo15580h() - etVar.mo15580h();
        return (float) (Math.pow(Math.sqrt((double) ((l * l) + (g * g) + (h * h))), 0.63d) * 1.41d);
    }

    @d81(from = Double.NEGATIVE_INFINITY, fromInclusive = false, mo14561to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* renamed from: g */
    public float mo15579g() {
        return this.f11713h;
    }

    @d81(from = Double.NEGATIVE_INFINITY, fromInclusive = false, mo14561to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* renamed from: h */
    public float mo15580h() {
        return this.f11714i;
    }

    @d81(from = 0.0d, mo14561to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* renamed from: i */
    public float mo15581i() {
        return this.f11707b;
    }

    @d81(from = 0.0d, mo14561to = 360.0d, toInclusive = false)
    /* renamed from: j */
    public float mo15582j() {
        return this.f11706a;
    }

    @d81(from = 0.0d, mo14561to = 100.0d)
    /* renamed from: k */
    public float mo15583k() {
        return this.f11708c;
    }

    @d81(from = 0.0d, mo14561to = 100.0d)
    /* renamed from: l */
    public float mo15584l() {
        return this.f11712g;
    }

    @d81(from = 0.0d, mo14561to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* renamed from: m */
    public float mo15585m() {
        return this.f11710e;
    }

    @d81(from = 0.0d, mo14561to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* renamed from: n */
    public float mo15586n() {
        return this.f11709d;
    }

    @d81(from = 0.0d, mo14561to = Double.POSITIVE_INFINITY, toInclusive = false)
    /* renamed from: o */
    public float mo15587o() {
        return this.f11711f;
    }

    @d10
    /* renamed from: r */
    public int mo15588r(@mr2 zv4 zv4) {
        float pow = (float) Math.pow(((double) ((((double) mo15581i()) == 0.0d || ((double) mo15583k()) == 0.0d) ? 0.0f : mo15581i() / ((float) Math.sqrt(((double) mo15583k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, (double) zv4.mo28141e()), 0.73d), 1.1111111111111112d);
        double j = (double) ((mo15582j() * 3.1415927f) / 180.0f);
        float a = zv4.mo28137a() * ((float) Math.pow(((double) mo15583k()) / 100.0d, (1.0d / ((double) zv4.mo28138b())) / ((double) zv4.mo28146j())));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * zv4.mo28143g() * zv4.mo28144h();
        float f = a / zv4.mo28142f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f2 = (((0.305f + f) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = f * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f6) * (100.0f / zv4.mo28139c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6))))), 2.380952380952381d));
        float signum2 = Math.signum(f7) * (100.0f / zv4.mo28139c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7))))), 2.380952380952381d));
        float signum3 = Math.signum(f8) * (100.0f / zv4.mo28139c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8))))), 2.380952380952381d));
        float f9 = signum / zv4.mo28145i()[0];
        float f10 = signum2 / zv4.mo28145i()[1];
        float f11 = signum3 / zv4.mo28145i()[2];
        float[][] fArr = C2198ft.f12316b;
        return p10.m24306g((double) ((fArr[0][0] * f9) + (fArr[0][1] * f10) + (fArr[0][2] * f11)), (double) ((fArr[1][0] * f9) + (fArr[1][1] * f10) + (fArr[1][2] * f11)), (double) ((f9 * fArr[2][0]) + (f10 * fArr[2][1]) + (f11 * fArr[2][2])));
    }

    @d10
    /* renamed from: s */
    public int mo15589s() {
        return mo15588r(zv4.f23908a);
    }
}

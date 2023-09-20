package com.onedelhi.secure;

public class zi4 {

    /* renamed from: a */
    public static final float f23719a = 0.017453292f;

    /* renamed from: a */
    public static zi4 f23720a = null;

    /* renamed from: b */
    public static final float f23721b = 9.0E-4f;

    /* renamed from: b */
    public static final int f23722b = 0;

    /* renamed from: c */
    public static final float f23723c = -0.10471976f;

    /* renamed from: c */
    public static final int f23724c = 1;

    /* renamed from: c */
    public static final long f23725c = 946728000000L;

    /* renamed from: d */
    public static final float f23726d = 0.0334196f;

    /* renamed from: e */
    public static final float f23727e = 3.49066E-4f;

    /* renamed from: f */
    public static final float f23728f = 5.236E-6f;

    /* renamed from: g */
    public static final float f23729g = 0.4092797f;

    /* renamed from: a */
    public int f23730a;

    /* renamed from: a */
    public long f23731a;

    /* renamed from: b */
    public long f23732b;

    /* renamed from: b */
    public static zi4 m33168b() {
        if (f23720a == null) {
            f23720a = new zi4();
        }
        return f23720a;
    }

    /* renamed from: a */
    public void mo28003a(long j, double d, double d2) {
        float f = ((float) (j - f23725c)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double round = ((double) (((float) Math.round(((double) (f - 9.0E-4f)) - d4)) + 9.0E-4f)) + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * sin) * -0.0069d);
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(asin))) / (Math.cos(d5) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f23730a = 1;
        } else if (sin2 <= -1.0d) {
            this.f23730a = 0;
        } else {
            double acos = (double) ((float) (Math.acos(sin2) / 6.283185307179586d));
            this.f23731a = Math.round((round + acos) * 8.64E7d) + f23725c;
            long round2 = Math.round((round - acos) * 8.64E7d) + f23725c;
            this.f23732b = round2;
            if (round2 >= j || this.f23731a <= j) {
                this.f23730a = 1;
                return;
            } else {
                this.f23730a = 0;
                return;
            }
        }
        this.f23731a = -1;
        this.f23732b = -1;
    }
}

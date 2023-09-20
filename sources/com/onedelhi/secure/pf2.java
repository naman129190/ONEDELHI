package com.onedelhi.secure;

public final class pf2 {

    /* renamed from: a */
    public static final float f33644a = 1.0E-4f;

    /* renamed from: a */
    public static float m60987a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    public static float m60988b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m60993g(m60987a(f, f2, f3, f4), m60987a(f, f2, f5, f4), m60987a(f, f2, f5, f6), m60987a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static float m60989c(float f, int i) {
        float f2 = (float) i;
        int i2 = (int) (f / f2);
        if (Math.signum(f) * f2 < 0.0f && ((float) (i2 * i)) != f) {
            i2--;
        }
        return f - ((float) (i2 * i));
    }

    /* renamed from: d */
    public static int m60990d(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    /* renamed from: e */
    public static boolean m60991e(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    /* renamed from: f */
    public static float m60992f(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: g */
    public static float m60993g(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}

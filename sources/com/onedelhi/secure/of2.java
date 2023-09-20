package com.onedelhi.secure;

public final class of2 {
    /* renamed from: a */
    public static float m23735a(float f, float f2, float f3) {
        return Math.min(Math.max(f3, f), f2);
    }

    /* renamed from: b */
    public static float m23736b(float f, float f2) {
        return 180.0f - Math.abs(Math.abs(f - f2) - 180.0f);
    }

    /* renamed from: c */
    public static float m23737c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    public static float m23738d(float f) {
        return f < 0.0f ? (f % 360.0f) + 360.0f : f >= 360.0f ? f % 360.0f : f;
    }

    /* renamed from: e */
    public static int m23739e(int i) {
        return i < 0 ? (i % 360) + 360 : i >= 360 ? i % 360 : i;
    }

    /* renamed from: f */
    public static float m23740f(float f) {
        return (f * 180.0f) / 3.1415927f;
    }

    /* renamed from: g */
    public static float m23741g(float f) {
        return (f / 180.0f) * 3.1415927f;
    }
}

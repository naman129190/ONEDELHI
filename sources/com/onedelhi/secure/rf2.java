package com.onedelhi.secure;

public class rf2 {
    /* renamed from: a */
    public static int m26695a(int i, int i2) {
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) >= 0) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* renamed from: b */
    public static long m26696b(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) >= 0) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }

    /* renamed from: c */
    public static double m26697c(double d, double d2, double d3) {
        return d < d2 ? d2 : d > d3 ? d3 : d;
    }

    /* renamed from: d */
    public static float m26698d(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: e */
    public static int m26699e(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: f */
    public static long m26700f(long j, long j2, long j3) {
        return j < j2 ? j2 : j > j3 ? j3 : j;
    }

    /* renamed from: g */
    public static int m26701g(int i) {
        if (i != Integer.MIN_VALUE) {
            return i - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* renamed from: h */
    public static long m26702h(long j) {
        if (j != Long.MIN_VALUE) {
            return j - 1;
        }
        throw new ArithmeticException("long overflow");
    }

    /* renamed from: i */
    public static int m26703i(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* renamed from: j */
    public static long m26704j(long j) {
        if (j != Long.MAX_VALUE) {
            return j + 1;
        }
        throw new ArithmeticException("long overflow");
    }

    /* renamed from: k */
    public static int m26705k(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        int i3 = (int) j;
        if (((long) i3) == j) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* renamed from: l */
    public static long m26706l(long j, long j2) {
        long j3 = j * j2;
        if (((Math.abs(j) | Math.abs(j2)) >>> 31) == 0 || ((j2 == 0 || j3 / j2 == j) && (j != Long.MIN_VALUE || j2 != -1))) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }

    /* renamed from: m */
    public static int m26707m(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* renamed from: n */
    public static long m26708n(long j) {
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        throw new ArithmeticException("long overflow");
    }

    /* renamed from: o */
    public static int m26709o(int i, int i2) {
        int i3 = i - i2;
        if (((i ^ i3) & (i2 ^ i)) >= 0) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }

    /* renamed from: p */
    public static long m26710p(long j, long j2) {
        long j3 = j - j2;
        if (((j ^ j3) & (j2 ^ j)) >= 0) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }

    /* renamed from: q */
    public static int m26711q(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        throw new ArithmeticException("integer overflow");
    }
}

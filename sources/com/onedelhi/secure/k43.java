package com.onedelhi.secure;

import android.text.TextUtils;
import com.onedelhi.secure.hl3;
import java.util.Locale;
import java.util.Objects;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public final class k43 {
    /* renamed from: a */
    public static void m19444a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m19445b(boolean z, @mr2 Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m19446c(boolean z, @mr2 String str, @mr2 Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static float m19447d(float f, @mr2 String str) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        } else if (!Float.isInfinite(f)) {
            return f;
        } else {
            throw new IllegalArgumentException(str + " must not be infinite");
        }
    }

    /* renamed from: e */
    public static double m19448e(double d, double d2, double d3, @mr2 String str) {
        if (d < d2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", new Object[]{str, Double.valueOf(d2), Double.valueOf(d3)}));
        } else if (d <= d3) {
            return d;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", new Object[]{str, Double.valueOf(d2), Double.valueOf(d3)}));
        }
    }

    /* renamed from: f */
    public static float m19449f(float f, float f2, float f3, @mr2 String str) {
        if (f < f2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", new Object[]{str, Float.valueOf(f2), Float.valueOf(f3)}));
        } else if (f <= f3) {
            return f;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", new Object[]{str, Float.valueOf(f2), Float.valueOf(f3)}));
        }
    }

    /* renamed from: g */
    public static int m19450g(int i, int i2, int i3, @mr2 String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        } else if (i <= i3) {
            return i;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    /* renamed from: h */
    public static long m19451h(long j, long j2, long j3, @mr2 String str) {
        if (j < j2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)}));
        } else if (j <= j3) {
            return j;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    @js1(from = 0)
    /* renamed from: i */
    public static int m19452i(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    @js1(from = 0)
    /* renamed from: j */
    public static int m19453j(int i, @ts2 String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: k */
    public static int m19454k(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i2) + " are allowed");
    }

    @mr2
    /* renamed from: l */
    public static <T> T m19455l(@ts2 T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @mr2
    /* renamed from: m */
    public static <T> T m19456m(@ts2 T t, @mr2 Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: n */
    public static void m19457n(boolean z) {
        m19458o(z, (String) null);
    }

    /* renamed from: o */
    public static void m19458o(boolean z, @ts2 String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @mr2
    /* renamed from: p */
    public static <T extends CharSequence> T m19459p(@ts2 T t) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException();
    }

    @mr2
    /* renamed from: q */
    public static <T extends CharSequence> T m19460q(@ts2 T t, @mr2 Object obj) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @mr2
    /* renamed from: r */
    public static <T extends CharSequence> T m19461r(@ts2 T t, @mr2 String str, @mr2 Object... objArr) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }
}

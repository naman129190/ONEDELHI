package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;

public final class pg5 {
    /* renamed from: a */
    public static int m24693a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = yg5.m32373a("%s (%s) must not be negative", FirebaseAnalytics.C4305d.f24955X, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            str2 = yg5.m32373a("%s (%s) must be less than size (%s)", FirebaseAnalytics.C4305d.f24955X, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    /* renamed from: b */
    public static int m24694b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m24698f(i, i2, FirebaseAnalytics.C4305d.f24955X));
    }

    /* renamed from: c */
    public static void m24695c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static void m24696d(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(yg5.m32373a(str, Character.valueOf(c)));
        }
    }

    /* renamed from: e */
    public static void m24697e(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m24698f(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m24698f(i2, i3, "end index");
            } else {
                str = yg5.m32373a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: f */
    public static String m24698f(int i, int i2, String str) {
        if (i < 0) {
            return yg5.m32373a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return yg5.m32373a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }
}

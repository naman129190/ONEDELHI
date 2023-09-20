package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;

public final class tz5 {
    /* renamed from: a */
    public static int m29033a(int i, int i2, String str) {
        String str2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str2 = xz5.m31806a("%s (%s) must not be negative", FirebaseAnalytics.C4305d.f24955X, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            str2 = xz5.m31806a("%s (%s) must be less than size (%s)", FirebaseAnalytics.C4305d.f24955X, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    /* renamed from: b */
    public static int m29034b(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m29036d(i, i2, FirebaseAnalytics.C4305d.f24955X));
    }

    /* renamed from: c */
    public static void m29035c(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m29036d(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m29036d(i2, i3, "end index");
            } else {
                str = xz5.m31806a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: d */
    public static String m29036d(int i, int i2, String str) {
        if (i < 0) {
            return xz5.m31806a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return xz5.m31806a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }
}

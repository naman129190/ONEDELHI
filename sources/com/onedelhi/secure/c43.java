package com.onedelhi.secure;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class c43 {
    /* renamed from: a */
    public static String m40727a(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, y";
        }
        if (i == 1) {
            return "MMMM d, y";
        }
        if (i == 2) {
            return "MMM d, y";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    /* renamed from: b */
    public static String m40728b(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    /* renamed from: c */
    public static String m40729c(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    /* renamed from: d */
    public static DateFormat m40730d(int i) {
        return new SimpleDateFormat(m40727a(i), Locale.US);
    }

    /* renamed from: e */
    public static DateFormat m40731e(int i, int i2) {
        return new SimpleDateFormat(m40728b(i) + " " + m40729c(i2), Locale.US);
    }
}

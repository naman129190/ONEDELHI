package com.onedelhi.secure;

import java.util.Locale;

/* renamed from: com.onedelhi.secure.ak */
public final class C4564ak implements a12 {

    /* renamed from: a */
    public static final long f25870a = 1000000000000L;

    /* renamed from: e */
    public static final int f25871e = 1000000000;

    /* renamed from: f */
    public static final int f25872f = 1000000;

    /* renamed from: g */
    public static final int f25873g = 1000;

    @mr2
    /* renamed from: a */
    public String mo30411a(float f) {
        if (f >= 1.0E12f) {
            return String.format(Locale.US, "%.1fT", new Object[]{Float.valueOf(f / 1.0E12f)});
        } else if (f >= 1.0E9f) {
            return String.format(Locale.US, "%.1fB", new Object[]{Float.valueOf(f / 1.0E9f)});
        } else if (f >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", new Object[]{Float.valueOf(f / 1000000.0f)});
        } else if (f >= 1000.0f) {
            return String.format(Locale.US, "%.1fK", new Object[]{Float.valueOf(f / 1000.0f)});
        } else {
            return String.format(Locale.US, "%.0f", new Object[]{Float.valueOf(f)});
        }
    }
}

package com.onedelhi.secure;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Objects;

public final class g43 {
    /* renamed from: a */
    public static void m15506a(boolean z, @mr2 String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @mr2
    /* renamed from: b */
    public static String m15507b(@ts2 String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @mr2
    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m15508c(@mr2 T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @mr2
    /* renamed from: d */
    public static <T> T m15509d(@ts2 T t) {
        return m15510e(t, "Argument must not be null");
    }

    @mr2
    /* renamed from: e */
    public static <T> T m15510e(@ts2 T t, @mr2 String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}

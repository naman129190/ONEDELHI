package com.onedelhi.secure;

import java.util.Objects;

public final class i43 {
    /* renamed from: a */
    public static void m51837a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @C7277xt
    /* renamed from: b */
    public static <T> T m51838b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @C7277xt
    /* renamed from: c */
    public static <T> T m51839c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: d */
    public static void m51840d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}

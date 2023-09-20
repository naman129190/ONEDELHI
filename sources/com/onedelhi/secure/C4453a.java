package com.onedelhi.secure;

import java.util.Objects;

/* renamed from: com.onedelhi.secure.a */
public final class C4453a {
    public C4453a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static void m35636a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static <T> T m35637b(T t) {
        Objects.requireNonNull(t);
        return t;
    }
}

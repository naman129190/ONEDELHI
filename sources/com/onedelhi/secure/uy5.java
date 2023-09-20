package com.onedelhi.secure;

import javax.annotation.CheckForNull;

public final class uy5 extends cz5 {

    /* renamed from: a */
    public static final uy5 f21553a = new uy5();

    /* renamed from: a */
    public final Object mo14443a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: b */
    public final boolean mo14444b() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}

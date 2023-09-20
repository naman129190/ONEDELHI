package com.onedelhi.secure;

import javax.annotation.CheckForNull;

public final class ki6 extends si6 {

    /* renamed from: a */
    public static final ki6 f14907a = new ki6();

    /* renamed from: a */
    public final Object mo19080a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: b */
    public final boolean mo19081b() {
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

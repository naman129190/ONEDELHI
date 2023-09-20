package com.onedelhi.secure;

import javax.annotation.CheckForNull;

public final class gz5 extends cz5 {

    /* renamed from: a */
    public final Object f12848a;

    public gz5(Object obj) {
        this.f12848a = obj;
    }

    /* renamed from: a */
    public final Object mo14443a() {
        return this.f12848a;
    }

    /* renamed from: b */
    public final boolean mo14444b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof gz5) {
            return this.f12848a.equals(((gz5) obj).f12848a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12848a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f12848a + pl2.f33727d;
    }
}

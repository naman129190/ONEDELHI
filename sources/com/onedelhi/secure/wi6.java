package com.onedelhi.secure;

import javax.annotation.CheckForNull;

public final class wi6 extends si6 {

    /* renamed from: a */
    public final Object f22136a;

    public wi6(Object obj) {
        this.f22136a = obj;
    }

    /* renamed from: a */
    public final Object mo19080a() {
        return this.f22136a;
    }

    /* renamed from: b */
    public final boolean mo19081b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof wi6) {
            return this.f22136a.equals(((wi6) obj).f22136a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22136a.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f22136a.toString();
        return "Optional.of(" + obj + pl2.f33727d;
    }
}

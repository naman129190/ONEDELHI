package com.onedelhi.secure;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

public final class ij6 implements Serializable, aj6 {

    /* renamed from: a */
    public final Object f13722a;

    public ij6(Object obj) {
        this.f13722a = obj;
    }

    /* renamed from: a */
    public final Object mo12477a() {
        return this.f13722a;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof ij6) {
            return qi6.m25771a(this.f13722a, ((ij6) obj).f13722a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13722a});
    }

    public final String toString() {
        String obj = this.f13722a.toString();
        return "Suppliers.ofInstance(" + obj + pl2.f33727d;
    }
}

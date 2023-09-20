package com.onedelhi.secure;

import java.util.Iterator;
import java.util.List;

public final class xd5 implements qh5 {

    /* renamed from: b */
    public final boolean f22528b;

    public xd5(Boolean bool) {
        this.f22528b = bool == null ? false : bool.booleanValue();
    }

    /* renamed from: b */
    public final String mo13084b() {
        return Boolean.toString(this.f22528b);
    }

    /* renamed from: e */
    public final Double mo13085e() {
        return Double.valueOf(true != this.f22528b ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xd5) && this.f22528b == ((xd5) obj).f22528b;
    }

    /* renamed from: f */
    public final Boolean mo13087f() {
        return Boolean.valueOf(this.f22528b);
    }

    /* renamed from: g */
    public final qh5 mo13088g(String str, w96 w96, List list) {
        if ("toString".equals(str)) {
            return new wi5(Boolean.toString(this.f22528b));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f22528b), str}));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f22528b).hashCode();
    }

    /* renamed from: k */
    public final qh5 mo13090k() {
        return new xd5(Boolean.valueOf(this.f22528b));
    }

    /* renamed from: l */
    public final Iterator mo13091l() {
        return null;
    }

    public final String toString() {
        return String.valueOf(this.f22528b);
    }
}

package com.onedelhi.secure;

public final class mo6 {

    /* renamed from: a */
    public final int f16264a;

    /* renamed from: a */
    public final Object f16265a;

    public mo6(Object obj, int i) {
        this.f16265a = obj;
        this.f16264a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mo6)) {
            return false;
        }
        mo6 mo6 = (mo6) obj;
        return this.f16265a == mo6.f16265a && this.f16264a == mo6.f16264a;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f16265a) * 65535) + this.f16264a;
    }
}

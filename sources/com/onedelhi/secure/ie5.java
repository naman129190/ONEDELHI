package com.onedelhi.secure;

import java.util.Iterator;
import java.util.List;

public final class ie5 implements qh5 {

    /* renamed from: b */
    public final String f13661b;

    /* renamed from: i */
    public final qh5 f13662i;

    public ie5() {
        throw null;
    }

    public ie5(String str) {
        this.f13662i = qh5.f19182a;
        this.f13661b = str;
    }

    public ie5(String str, qh5 qh5) {
        this.f13662i = qh5;
        this.f13661b = str;
    }

    /* renamed from: a */
    public final qh5 mo17737a() {
        return this.f13662i;
    }

    /* renamed from: b */
    public final String mo13084b() {
        throw new IllegalStateException("Control is not a String");
    }

    /* renamed from: c */
    public final String mo17738c() {
        return this.f13661b;
    }

    /* renamed from: e */
    public final Double mo13085e() {
        throw new IllegalStateException("Control is not a double");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ie5)) {
            return false;
        }
        ie5 ie5 = (ie5) obj;
        return this.f13661b.equals(ie5.f13661b) && this.f13662i.equals(ie5.f13662i);
    }

    /* renamed from: f */
    public final Boolean mo13087f() {
        throw new IllegalStateException("Control is not a boolean");
    }

    /* renamed from: g */
    public final qh5 mo13088g(String str, w96 w96, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final int hashCode() {
        return (this.f13661b.hashCode() * 31) + this.f13662i.hashCode();
    }

    /* renamed from: k */
    public final qh5 mo13090k() {
        return new ie5(this.f13661b, this.f13662i.mo13090k());
    }

    /* renamed from: l */
    public final Iterator mo13091l() {
        return null;
    }
}

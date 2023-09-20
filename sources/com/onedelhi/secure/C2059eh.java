package com.onedelhi.secure;

import java.util.Objects;

/* renamed from: com.onedelhi.secure.eh */
public final class C2059eh extends p13 {

    /* renamed from: a */
    public final long f11220a;

    /* renamed from: a */
    public final uv0 f11221a;

    /* renamed from: a */
    public final xh4 f11222a;

    public C2059eh(long j, xh4 xh4, uv0 uv0) {
        this.f11220a = j;
        Objects.requireNonNull(xh4, "Null transportContext");
        this.f11222a = xh4;
        Objects.requireNonNull(uv0, "Null event");
        this.f11221a = uv0;
    }

    /* renamed from: b */
    public uv0 mo15177b() {
        return this.f11221a;
    }

    /* renamed from: c */
    public long mo15178c() {
        return this.f11220a;
    }

    /* renamed from: d */
    public xh4 mo15179d() {
        return this.f11222a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p13)) {
            return false;
        }
        p13 p13 = (p13) obj;
        return this.f11220a == p13.mo15178c() && this.f11222a.equals(p13.mo15179d()) && this.f11221a.equals(p13.mo15177b());
    }

    public int hashCode() {
        long j = this.f11220a;
        return this.f11221a.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f11222a.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f11220a + ", transportContext=" + this.f11222a + ", event=" + this.f11221a + "}";
    }
}

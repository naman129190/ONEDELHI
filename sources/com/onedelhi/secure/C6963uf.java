package com.onedelhi.secure;

import java.util.Objects;
import java.util.Set;

/* renamed from: com.onedelhi.secure.uf */
public final class C6963uf extends i50 {

    /* renamed from: a */
    public final Set<String> f36050a;

    public C6963uf(Set<String> set) {
        Objects.requireNonNull(set, "Null updatedKeys");
        this.f36050a = set;
    }

    @mr2
    /* renamed from: b */
    public Set<String> mo37855b() {
        return this.f36050a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i50) {
            return this.f36050a.equals(((i50) obj).mo37855b());
        }
        return false;
    }

    public int hashCode() {
        return this.f36050a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f36050a + "}";
    }
}

package com.onedelhi.secure;

import java.util.Objects;

public final class hu0 {

    /* renamed from: a */
    public final String f13257a;

    public hu0(@mr2 String str) {
        Objects.requireNonNull(str, "name is null");
        this.f13257a = str;
    }

    /* renamed from: b */
    public static hu0 m16939b(@mr2 String str) {
        return new hu0(str);
    }

    /* renamed from: a */
    public String mo17410a() {
        return this.f13257a;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu0)) {
            return false;
        }
        return this.f13257a.equals(((hu0) obj).f13257a);
    }

    public int hashCode() {
        return this.f13257a.hashCode() ^ 1000003;
    }

    @mr2
    public String toString() {
        return "Encoding{name=\"" + this.f13257a + "\"}";
    }
}

package com.onedelhi.secure;

import java.util.Objects;
import javax.annotation.Nonnull;

/* renamed from: com.onedelhi.secure.zg */
public final class C7490zg extends s22 {

    /* renamed from: a */
    public final String f38331a;

    /* renamed from: b */
    public final String f38332b;

    public C7490zg(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f38331a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f38332b = str2;
    }

    @Nonnull
    /* renamed from: b */
    public String mo44156b() {
        return this.f38331a;
    }

    @Nonnull
    /* renamed from: c */
    public String mo44157c() {
        return this.f38332b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s22)) {
            return false;
        }
        s22 s22 = (s22) obj;
        return this.f38331a.equals(s22.mo44156b()) && this.f38332b.equals(s22.mo44157c());
    }

    public int hashCode() {
        return ((this.f38331a.hashCode() ^ 1000003) * 1000003) ^ this.f38332b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f38331a + ", version=" + this.f38332b + "}";
    }
}

package com.onedelhi.secure;

import com.onedelhi.secure.tt0;
import java.util.List;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.sf */
public final class C3511sf extends C1982dk {

    /* renamed from: a */
    public final List<e92> f20325a;

    public C3511sf(List<e92> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f20325a = list;
    }

    @tt0.C6898a(name = "logRequest")
    @mr2
    /* renamed from: c */
    public List<e92> mo14708c() {
        return this.f20325a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1982dk) {
            return this.f20325a.equals(((C1982dk) obj).mo14708c());
        }
        return false;
    }

    public int hashCode() {
        return this.f20325a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f20325a + "}";
    }
}

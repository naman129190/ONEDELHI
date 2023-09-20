package com.onedelhi.secure;

import com.onedelhi.secure.C2758li;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.rf */
public final class C3413rf extends C2758li {

    /* renamed from: a */
    public final long f19812a;

    /* renamed from: a */
    public final C2758li.C2759a f19813a;

    public C3413rf(C2758li.C2759a aVar, long j) {
        Objects.requireNonNull(aVar, "Null status");
        this.f19813a = aVar;
        this.f19812a = j;
    }

    /* renamed from: b */
    public long mo19616b() {
        return this.f19812a;
    }

    /* renamed from: c */
    public C2758li.C2759a mo19617c() {
        return this.f19813a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2758li)) {
            return false;
        }
        C2758li liVar = (C2758li) obj;
        return this.f19813a.equals(liVar.mo19617c()) && this.f19812a == liVar.mo19616b();
    }

    public int hashCode() {
        long j = this.f19812a;
        return ((this.f19813a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f19813a + ", nextRequestWaitMillis=" + this.f19812a + "}";
    }
}

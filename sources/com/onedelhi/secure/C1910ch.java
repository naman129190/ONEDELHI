package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.ch */
public final class C1910ch extends f92 {

    /* renamed from: a */
    public final long f10290a;

    public C1910ch(long j) {
        this.f10290a = j;
    }

    /* renamed from: c */
    public long mo14141c() {
        return this.f10290a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof f92) && this.f10290a == ((f92) obj).mo14141c();
    }

    public int hashCode() {
        long j = this.f10290a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f10290a + "}";
    }
}

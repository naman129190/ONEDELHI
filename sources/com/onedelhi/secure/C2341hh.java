package com.onedelhi.secure;

import com.onedelhi.secure.pr3;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.onedelhi.secure.hh */
public final class C2341hh extends pr3.C3184b {

    /* renamed from: a */
    public final long f13075a;

    /* renamed from: a */
    public final Set<pr3.C3186c> f13076a;

    /* renamed from: b */
    public final long f13077b;

    /* renamed from: com.onedelhi.secure.hh$b */
    public static final class C2343b extends pr3.C3184b.C3185a {

        /* renamed from: a */
        public Long f13078a;

        /* renamed from: a */
        public Set<pr3.C3186c> f13079a;

        /* renamed from: b */
        public Long f13080b;

        /* renamed from: a */
        public pr3.C3184b mo17263a() {
            String str = "";
            if (this.f13078a == null) {
                str = str + " delta";
            }
            if (this.f13080b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f13079a == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C2341hh(this.f13078a.longValue(), this.f13080b.longValue(), this.f13079a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pr3.C3184b.C3185a mo17264b(long j) {
            this.f13078a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public pr3.C3184b.C3185a mo17265c(Set<pr3.C3186c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f13079a = set;
            return this;
        }

        /* renamed from: d */
        public pr3.C3184b.C3185a mo17266d(long j) {
            this.f13080b = Long.valueOf(j);
            return this;
        }
    }

    public C2341hh(long j, long j2, Set<pr3.C3186c> set) {
        this.f13075a = j;
        this.f13077b = j2;
        this.f13076a = set;
    }

    /* renamed from: b */
    public long mo17257b() {
        return this.f13075a;
    }

    /* renamed from: c */
    public Set<pr3.C3186c> mo17258c() {
        return this.f13076a;
    }

    /* renamed from: d */
    public long mo17259d() {
        return this.f13077b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pr3.C3184b)) {
            return false;
        }
        pr3.C3184b bVar = (pr3.C3184b) obj;
        return this.f13075a == bVar.mo17257b() && this.f13077b == bVar.mo17259d() && this.f13076a.equals(bVar.mo17258c());
    }

    public int hashCode() {
        long j = this.f13075a;
        long j2 = this.f13077b;
        return this.f13076a.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f13075a + ", maxAllowedDelay=" + this.f13077b + ", flags=" + this.f13076a + "}";
    }
}

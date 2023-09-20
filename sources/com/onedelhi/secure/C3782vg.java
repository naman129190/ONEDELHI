package com.onedelhi.secure;

import com.onedelhi.secure.bw0;

/* renamed from: com.onedelhi.secure.vg */
public final class C3782vg extends bw0 {

    /* renamed from: c */
    public final long f21746c;

    /* renamed from: d */
    public final int f21747d;

    /* renamed from: d */
    public final long f21748d;

    /* renamed from: e */
    public final int f21749e;

    /* renamed from: f */
    public final int f21750f;

    /* renamed from: com.onedelhi.secure.vg$b */
    public static final class C3784b extends bw0.C1821a {

        /* renamed from: a */
        public Integer f21751a;

        /* renamed from: a */
        public Long f21752a;

        /* renamed from: b */
        public Integer f21753b;

        /* renamed from: b */
        public Long f21754b;

        /* renamed from: c */
        public Integer f21755c;

        /* renamed from: a */
        public bw0 mo13842a() {
            String str = "";
            if (this.f21752a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f21751a == null) {
                str = str + " loadBatchSize";
            }
            if (this.f21753b == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f21754b == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f21755c == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C3782vg(this.f21752a.longValue(), this.f21751a.intValue(), this.f21753b.intValue(), this.f21754b.longValue(), this.f21755c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public bw0.C1821a mo13843b(int i) {
            this.f21753b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public bw0.C1821a mo13844c(long j) {
            this.f21754b = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public bw0.C1821a mo13845d(int i) {
            this.f21751a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public bw0.C1821a mo13846e(int i) {
            this.f21755c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public bw0.C1821a mo13847f(long j) {
            this.f21752a = Long.valueOf(j);
            return this;
        }
    }

    public C3782vg(long j, int i, int i2, long j2, int i3) {
        this.f21746c = j;
        this.f21747d = i;
        this.f21749e = i2;
        this.f21748d = j2;
        this.f21750f = i3;
    }

    /* renamed from: b */
    public int mo13836b() {
        return this.f21749e;
    }

    /* renamed from: c */
    public long mo13837c() {
        return this.f21748d;
    }

    /* renamed from: d */
    public int mo13838d() {
        return this.f21747d;
    }

    /* renamed from: e */
    public int mo13839e() {
        return this.f21750f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bw0)) {
            return false;
        }
        bw0 bw0 = (bw0) obj;
        return this.f21746c == bw0.mo13840f() && this.f21747d == bw0.mo13838d() && this.f21749e == bw0.mo13836b() && this.f21748d == bw0.mo13837c() && this.f21750f == bw0.mo13839e();
    }

    /* renamed from: f */
    public long mo13840f() {
        return this.f21746c;
    }

    public int hashCode() {
        long j = this.f21746c;
        long j2 = this.f21748d;
        return this.f21750f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f21747d) * 1000003) ^ this.f21749e) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f21746c + ", loadBatchSize=" + this.f21747d + ", criticalSectionEnterTimeoutMs=" + this.f21749e + ", eventCleanUpAge=" + this.f21748d + ", maxBlobByteSizePerRow=" + this.f21750f + "}";
    }
}

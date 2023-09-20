package com.onedelhi.secure;

import com.onedelhi.secure.pa0;

/* renamed from: com.onedelhi.secure.og */
public final class C6273og extends pa0.C6383f.C6391d.C6407c {

    /* renamed from: a */
    public final int f33017a;

    /* renamed from: a */
    public final long f33018a;

    /* renamed from: a */
    public final Double f33019a;

    /* renamed from: a */
    public final boolean f33020a;

    /* renamed from: b */
    public final int f33021b;

    /* renamed from: b */
    public final long f33022b;

    /* renamed from: com.onedelhi.secure.og$b */
    public static final class C6275b extends pa0.C6383f.C6391d.C6407c.C6408a {

        /* renamed from: a */
        public Boolean f33023a;

        /* renamed from: a */
        public Double f33024a;

        /* renamed from: a */
        public Integer f33025a;

        /* renamed from: a */
        public Long f33026a;

        /* renamed from: b */
        public Integer f33027b;

        /* renamed from: b */
        public Long f33028b;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6407c mo41769a() {
            String str = "";
            if (this.f33025a == null) {
                str = str + " batteryVelocity";
            }
            if (this.f33023a == null) {
                str = str + " proximityOn";
            }
            if (this.f33027b == null) {
                str = str + " orientation";
            }
            if (this.f33026a == null) {
                str = str + " ramUsed";
            }
            if (this.f33028b == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C6273og(this.f33024a, this.f33025a.intValue(), this.f33023a.booleanValue(), this.f33027b.intValue(), this.f33026a.longValue(), this.f33028b.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6391d.C6407c.C6408a mo41770b(Double d) {
            this.f33024a = d;
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6391d.C6407c.C6408a mo41771c(int i) {
            this.f33025a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6391d.C6407c.C6408a mo41772d(long j) {
            this.f33028b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public pa0.C6383f.C6391d.C6407c.C6408a mo41773e(int i) {
            this.f33027b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public pa0.C6383f.C6391d.C6407c.C6408a mo41774f(boolean z) {
            this.f33023a = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: g */
        public pa0.C6383f.C6391d.C6407c.C6408a mo41775g(long j) {
            this.f33026a = Long.valueOf(j);
            return this;
        }
    }

    public C6273og(@ts2 Double d, int i, boolean z, int i2, long j, long j2) {
        this.f33019a = d;
        this.f33017a = i;
        this.f33020a = z;
        this.f33021b = i2;
        this.f33018a = j;
        this.f33022b = j2;
    }

    @ts2
    /* renamed from: b */
    public Double mo41760b() {
        return this.f33019a;
    }

    /* renamed from: c */
    public int mo41761c() {
        return this.f33017a;
    }

    /* renamed from: d */
    public long mo41762d() {
        return this.f33022b;
    }

    /* renamed from: e */
    public int mo41763e() {
        return this.f33021b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6383f.C6391d.C6407c)) {
            return false;
        }
        pa0.C6383f.C6391d.C6407c cVar = (pa0.C6383f.C6391d.C6407c) obj;
        Double d = this.f33019a;
        if (d != null ? d.equals(cVar.mo41760b()) : cVar.mo41760b() == null) {
            return this.f33017a == cVar.mo41761c() && this.f33020a == cVar.mo41766g() && this.f33021b == cVar.mo41763e() && this.f33018a == cVar.mo41765f() && this.f33022b == cVar.mo41762d();
        }
    }

    /* renamed from: f */
    public long mo41765f() {
        return this.f33018a;
    }

    /* renamed from: g */
    public boolean mo41766g() {
        return this.f33020a;
    }

    public int hashCode() {
        Double d = this.f33019a;
        int hashCode = ((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f33017a) * 1000003;
        int i = this.f33020a ? 1231 : 1237;
        long j = this.f33018a;
        long j2 = this.f33022b;
        return ((((((hashCode ^ i) * 1000003) ^ this.f33021b) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f33019a + ", batteryVelocity=" + this.f33017a + ", proximityOn=" + this.f33020a + ", orientation=" + this.f33021b + ", ramUsed=" + this.f33018a + ", diskUsed=" + this.f33022b + "}";
    }
}

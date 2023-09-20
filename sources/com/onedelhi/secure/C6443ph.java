package com.onedelhi.secure;

import com.onedelhi.secure.kf4;

/* renamed from: com.onedelhi.secure.ph */
public final class C6443ph extends kf4 {

    /* renamed from: a */
    public final long f33677a;

    /* renamed from: a */
    public final kf4.C5899b f33678a;

    /* renamed from: a */
    public final String f33679a;

    /* renamed from: com.onedelhi.secure.ph$b */
    public static final class C6445b extends kf4.C5898a {

        /* renamed from: a */
        public kf4.C5899b f33680a;

        /* renamed from: a */
        public Long f33681a;

        /* renamed from: a */
        public String f33682a;

        public C6445b() {
        }

        public C6445b(kf4 kf4) {
            this.f33682a = kf4.mo39235c();
            this.f33681a = Long.valueOf(kf4.mo39236d());
            this.f33680a = kf4.mo39234b();
        }

        /* renamed from: a */
        public kf4 mo39238a() {
            String str = "";
            if (this.f33681a == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C6443ph(this.f33682a, this.f33681a.longValue(), this.f33680a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public kf4.C5898a mo39239b(kf4.C5899b bVar) {
            this.f33680a = bVar;
            return this;
        }

        /* renamed from: c */
        public kf4.C5898a mo39240c(String str) {
            this.f33682a = str;
            return this;
        }

        /* renamed from: d */
        public kf4.C5898a mo39241d(long j) {
            this.f33681a = Long.valueOf(j);
            return this;
        }
    }

    public C6443ph(@ts2 String str, long j, @ts2 kf4.C5899b bVar) {
        this.f33679a = str;
        this.f33677a = j;
        this.f33678a = bVar;
    }

    @ts2
    /* renamed from: b */
    public kf4.C5899b mo39234b() {
        return this.f33678a;
    }

    @ts2
    /* renamed from: c */
    public String mo39235c() {
        return this.f33679a;
    }

    @mr2
    /* renamed from: d */
    public long mo39236d() {
        return this.f33677a;
    }

    /* renamed from: e */
    public kf4.C5898a mo39237e() {
        return new C6445b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kf4)) {
            return false;
        }
        kf4 kf4 = (kf4) obj;
        String str = this.f33679a;
        if (str != null ? str.equals(kf4.mo39235c()) : kf4.mo39235c() == null) {
            if (this.f33677a == kf4.mo39236d()) {
                kf4.C5899b bVar = this.f33678a;
                kf4.C5899b b = kf4.mo39234b();
                if (bVar == null) {
                    if (b == null) {
                        return true;
                    }
                } else if (bVar.equals(b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f33679a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f33677a;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        kf4.C5899b bVar = this.f33678a;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f33679a + ", tokenExpirationTimestamp=" + this.f33677a + ", responseCode=" + this.f33678a + "}";
    }
}

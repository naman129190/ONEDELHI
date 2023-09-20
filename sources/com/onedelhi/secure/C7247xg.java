package com.onedelhi.secure;

import com.onedelhi.secure.jr1;

/* renamed from: com.onedelhi.secure.xg */
public final class C7247xg extends jr1 {

    /* renamed from: a */
    public final jr1.C5843b f37452a;

    /* renamed from: a */
    public final kf4 f37453a;

    /* renamed from: a */
    public final String f37454a;

    /* renamed from: b */
    public final String f37455b;

    /* renamed from: c */
    public final String f37456c;

    /* renamed from: com.onedelhi.secure.xg$b */
    public static final class C7249b extends jr1.C5842a {

        /* renamed from: a */
        public jr1.C5843b f37457a;

        /* renamed from: a */
        public kf4 f37458a;

        /* renamed from: a */
        public String f37459a;

        /* renamed from: b */
        public String f37460b;

        /* renamed from: c */
        public String f37461c;

        public C7249b() {
        }

        public C7249b(jr1 jr1) {
            this.f37459a = jr1.mo38817f();
            this.f37460b = jr1.mo38814c();
            this.f37461c = jr1.mo38815d();
            this.f37458a = jr1.mo38813b();
            this.f37457a = jr1.mo38816e();
        }

        /* renamed from: a */
        public jr1 mo38819a() {
            return new C7247xg(this.f37459a, this.f37460b, this.f37461c, this.f37458a, this.f37457a);
        }

        /* renamed from: b */
        public jr1.C5842a mo38820b(kf4 kf4) {
            this.f37458a = kf4;
            return this;
        }

        /* renamed from: c */
        public jr1.C5842a mo38821c(String str) {
            this.f37460b = str;
            return this;
        }

        /* renamed from: d */
        public jr1.C5842a mo38822d(String str) {
            this.f37461c = str;
            return this;
        }

        /* renamed from: e */
        public jr1.C5842a mo38823e(jr1.C5843b bVar) {
            this.f37457a = bVar;
            return this;
        }

        /* renamed from: f */
        public jr1.C5842a mo38824f(String str) {
            this.f37459a = str;
            return this;
        }
    }

    public C7247xg(@ts2 String str, @ts2 String str2, @ts2 String str3, @ts2 kf4 kf4, @ts2 jr1.C5843b bVar) {
        this.f37454a = str;
        this.f37455b = str2;
        this.f37456c = str3;
        this.f37453a = kf4;
        this.f37452a = bVar;
    }

    @ts2
    /* renamed from: b */
    public kf4 mo38813b() {
        return this.f37453a;
    }

    @ts2
    /* renamed from: c */
    public String mo38814c() {
        return this.f37455b;
    }

    @ts2
    /* renamed from: d */
    public String mo38815d() {
        return this.f37456c;
    }

    @ts2
    /* renamed from: e */
    public jr1.C5843b mo38816e() {
        return this.f37452a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jr1)) {
            return false;
        }
        jr1 jr1 = (jr1) obj;
        String str = this.f37454a;
        if (str != null ? str.equals(jr1.mo38817f()) : jr1.mo38817f() == null) {
            String str2 = this.f37455b;
            if (str2 != null ? str2.equals(jr1.mo38814c()) : jr1.mo38814c() == null) {
                String str3 = this.f37456c;
                if (str3 != null ? str3.equals(jr1.mo38815d()) : jr1.mo38815d() == null) {
                    kf4 kf4 = this.f37453a;
                    if (kf4 != null ? kf4.equals(jr1.mo38813b()) : jr1.mo38813b() == null) {
                        jr1.C5843b bVar = this.f37452a;
                        jr1.C5843b e = jr1.mo38816e();
                        if (bVar == null) {
                            if (e == null) {
                                return true;
                            }
                        } else if (bVar.equals(e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @ts2
    /* renamed from: f */
    public String mo38817f() {
        return this.f37454a;
    }

    /* renamed from: g */
    public jr1.C5842a mo38818g() {
        return new C7249b(this);
    }

    public int hashCode() {
        String str = this.f37454a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f37455b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f37456c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        kf4 kf4 = this.f37453a;
        int hashCode4 = (hashCode3 ^ (kf4 == null ? 0 : kf4.hashCode())) * 1000003;
        jr1.C5843b bVar = this.f37452a;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f37454a + ", fid=" + this.f37455b + ", refreshToken=" + this.f37456c + ", authToken=" + this.f37453a + ", responseCode=" + this.f37452a + "}";
    }
}

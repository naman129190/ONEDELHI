package com.onedelhi.secure;

import com.onedelhi.secure.q13;
import com.onedelhi.secure.r13;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.fh */
public final class C5267fh extends r13 {

    /* renamed from: a */
    public final long f28445a;

    /* renamed from: a */
    public final q13.C6501a f28446a;

    /* renamed from: a */
    public final String f28447a;

    /* renamed from: b */
    public final long f28448b;

    /* renamed from: b */
    public final String f28449b;

    /* renamed from: c */
    public final String f28450c;

    /* renamed from: d */
    public final String f28451d;

    /* renamed from: com.onedelhi.secure.fh$b */
    public static final class C5269b extends r13.C6634a {

        /* renamed from: a */
        public q13.C6501a f28452a;

        /* renamed from: a */
        public Long f28453a;

        /* renamed from: a */
        public String f28454a;

        /* renamed from: b */
        public Long f28455b;

        /* renamed from: b */
        public String f28456b;

        /* renamed from: c */
        public String f28457c;

        /* renamed from: d */
        public String f28458d;

        public C5269b() {
        }

        public C5269b(r13 r13) {
            this.f28454a = r13.mo35943d();
            this.f28452a = r13.mo35947g();
            this.f28456b = r13.mo35941b();
            this.f28457c = r13.mo35946f();
            this.f28453a = Long.valueOf(r13.mo35942c());
            this.f28455b = Long.valueOf(r13.mo35948h());
            this.f28458d = r13.mo35944e();
        }

        /* renamed from: a */
        public r13 mo35952a() {
            String str = "";
            if (this.f28452a == null) {
                str = str + " registrationStatus";
            }
            if (this.f28453a == null) {
                str = str + " expiresInSecs";
            }
            if (this.f28455b == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C5267fh(this.f28454a, this.f28452a, this.f28456b, this.f28457c, this.f28453a.longValue(), this.f28455b.longValue(), this.f28458d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public r13.C6634a mo35953b(@ts2 String str) {
            this.f28456b = str;
            return this;
        }

        /* renamed from: c */
        public r13.C6634a mo35954c(long j) {
            this.f28453a = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public r13.C6634a mo35955d(String str) {
            this.f28454a = str;
            return this;
        }

        /* renamed from: e */
        public r13.C6634a mo35956e(@ts2 String str) {
            this.f28458d = str;
            return this;
        }

        /* renamed from: f */
        public r13.C6634a mo35957f(@ts2 String str) {
            this.f28457c = str;
            return this;
        }

        /* renamed from: g */
        public r13.C6634a mo35958g(q13.C6501a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f28452a = aVar;
            return this;
        }

        /* renamed from: h */
        public r13.C6634a mo35959h(long j) {
            this.f28455b = Long.valueOf(j);
            return this;
        }
    }

    public C5267fh(@ts2 String str, q13.C6501a aVar, @ts2 String str2, @ts2 String str3, long j, long j2, @ts2 String str4) {
        this.f28447a = str;
        this.f28446a = aVar;
        this.f28449b = str2;
        this.f28450c = str3;
        this.f28445a = j;
        this.f28448b = j2;
        this.f28451d = str4;
    }

    @ts2
    /* renamed from: b */
    public String mo35941b() {
        return this.f28449b;
    }

    /* renamed from: c */
    public long mo35942c() {
        return this.f28445a;
    }

    @ts2
    /* renamed from: d */
    public String mo35943d() {
        return this.f28447a;
    }

    @ts2
    /* renamed from: e */
    public String mo35944e() {
        return this.f28451d;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r13)) {
            return false;
        }
        r13 r13 = (r13) obj;
        String str3 = this.f28447a;
        if (str3 != null ? str3.equals(r13.mo35943d()) : r13.mo35943d() == null) {
            if (this.f28446a.equals(r13.mo35947g()) && ((str = this.f28449b) != null ? str.equals(r13.mo35941b()) : r13.mo35941b() == null) && ((str2 = this.f28450c) != null ? str2.equals(r13.mo35946f()) : r13.mo35946f() == null) && this.f28445a == r13.mo35942c() && this.f28448b == r13.mo35948h()) {
                String str4 = this.f28451d;
                String e = r13.mo35944e();
                if (str4 == null) {
                    if (e == null) {
                        return true;
                    }
                } else if (str4.equals(e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @ts2
    /* renamed from: f */
    public String mo35946f() {
        return this.f28450c;
    }

    @mr2
    /* renamed from: g */
    public q13.C6501a mo35947g() {
        return this.f28446a;
    }

    /* renamed from: h */
    public long mo35948h() {
        return this.f28448b;
    }

    public int hashCode() {
        String str = this.f28447a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f28446a.hashCode()) * 1000003;
        String str2 = this.f28449b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f28450c;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f28445a;
        long j2 = this.f28448b;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f28451d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: n */
    public r13.C6634a mo35950n() {
        return new C5269b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f28447a + ", registrationStatus=" + this.f28446a + ", authToken=" + this.f28449b + ", refreshToken=" + this.f28450c + ", expiresInSecs=" + this.f28445a + ", tokenCreationEpochInSecs=" + this.f28448b + ", fisError=" + this.f28451d + "}";
    }
}

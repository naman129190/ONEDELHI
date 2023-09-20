package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.xf */
public final class C7244xf extends pa0.C6371a {

    /* renamed from: a */
    public final int f37412a;

    /* renamed from: a */
    public final long f37413a;

    /* renamed from: a */
    public final lp1<pa0.C6371a.C6372a> f37414a;

    /* renamed from: a */
    public final String f37415a;

    /* renamed from: b */
    public final int f37416b;

    /* renamed from: b */
    public final long f37417b;

    /* renamed from: b */
    public final String f37418b;

    /* renamed from: c */
    public final int f37419c;

    /* renamed from: c */
    public final long f37420c;

    /* renamed from: com.onedelhi.secure.xf$b */
    public static final class C7246b extends pa0.C6371a.C6374b {

        /* renamed from: a */
        public lp1<pa0.C6371a.C6372a> f37421a;

        /* renamed from: a */
        public Integer f37422a;

        /* renamed from: a */
        public Long f37423a;

        /* renamed from: a */
        public String f37424a;

        /* renamed from: b */
        public Integer f37425b;

        /* renamed from: b */
        public Long f37426b;

        /* renamed from: b */
        public String f37427b;

        /* renamed from: c */
        public Integer f37428c;

        /* renamed from: c */
        public Long f37429c;

        /* renamed from: a */
        public pa0.C6371a mo42436a() {
            String str = "";
            if (this.f37422a == null) {
                str = str + " pid";
            }
            if (this.f37424a == null) {
                str = str + " processName";
            }
            if (this.f37425b == null) {
                str = str + " reasonCode";
            }
            if (this.f37428c == null) {
                str = str + " importance";
            }
            if (this.f37423a == null) {
                str = str + " pss";
            }
            if (this.f37426b == null) {
                str = str + " rss";
            }
            if (this.f37429c == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C7244xf(this.f37422a.intValue(), this.f37424a, this.f37425b.intValue(), this.f37428c.intValue(), this.f37423a.longValue(), this.f37426b.longValue(), this.f37429c.longValue(), this.f37427b, this.f37421a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6371a.C6374b mo42437b(@ts2 lp1<pa0.C6371a.C6372a> lp1) {
            this.f37421a = lp1;
            return this;
        }

        /* renamed from: c */
        public pa0.C6371a.C6374b mo42438c(int i) {
            this.f37428c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public pa0.C6371a.C6374b mo42439d(int i) {
            this.f37422a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public pa0.C6371a.C6374b mo42440e(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f37424a = str;
            return this;
        }

        /* renamed from: f */
        public pa0.C6371a.C6374b mo42441f(long j) {
            this.f37423a = Long.valueOf(j);
            return this;
        }

        /* renamed from: g */
        public pa0.C6371a.C6374b mo42442g(int i) {
            this.f37425b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public pa0.C6371a.C6374b mo42443h(long j) {
            this.f37426b = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public pa0.C6371a.C6374b mo42444i(long j) {
            this.f37429c = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public pa0.C6371a.C6374b mo42445j(@ts2 String str) {
            this.f37427b = str;
            return this;
        }
    }

    public C7244xf(int i, String str, int i2, int i3, long j, long j2, long j3, @ts2 String str2, @ts2 lp1<pa0.C6371a.C6372a> lp1) {
        this.f37412a = i;
        this.f37415a = str;
        this.f37416b = i2;
        this.f37419c = i3;
        this.f37413a = j;
        this.f37417b = j2;
        this.f37420c = j3;
        this.f37418b = str2;
        this.f37414a = lp1;
    }

    @ts2
    /* renamed from: b */
    public lp1<pa0.C6371a.C6372a> mo42420b() {
        return this.f37414a;
    }

    @mr2
    /* renamed from: c */
    public int mo42421c() {
        return this.f37419c;
    }

    @mr2
    /* renamed from: d */
    public int mo42422d() {
        return this.f37412a;
    }

    @mr2
    /* renamed from: e */
    public String mo42423e() {
        return this.f37415a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6371a)) {
            return false;
        }
        pa0.C6371a aVar = (pa0.C6371a) obj;
        if (this.f37412a == aVar.mo42422d() && this.f37415a.equals(aVar.mo42423e()) && this.f37416b == aVar.mo42425g() && this.f37419c == aVar.mo42421c() && this.f37413a == aVar.mo42424f() && this.f37417b == aVar.mo42426h() && this.f37420c == aVar.mo42427i() && ((str = this.f37418b) != null ? str.equals(aVar.mo42428j()) : aVar.mo42428j() == null)) {
            lp1<pa0.C6371a.C6372a> lp1 = this.f37414a;
            lp1<pa0.C6371a.C6372a> b = aVar.mo42420b();
            if (lp1 == null) {
                if (b == null) {
                    return true;
                }
            } else if (lp1.equals(b)) {
                return true;
            }
        }
        return false;
    }

    @mr2
    /* renamed from: f */
    public long mo42424f() {
        return this.f37413a;
    }

    @mr2
    /* renamed from: g */
    public int mo42425g() {
        return this.f37416b;
    }

    @mr2
    /* renamed from: h */
    public long mo42426h() {
        return this.f37417b;
    }

    public int hashCode() {
        long j = this.f37413a;
        long j2 = this.f37417b;
        long j3 = this.f37420c;
        int hashCode = (((((((((((((this.f37412a ^ 1000003) * 1000003) ^ this.f37415a.hashCode()) * 1000003) ^ this.f37416b) * 1000003) ^ this.f37419c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f37418b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        lp1<pa0.C6371a.C6372a> lp1 = this.f37414a;
        if (lp1 != null) {
            i = lp1.hashCode();
        }
        return hashCode2 ^ i;
    }

    @mr2
    /* renamed from: i */
    public long mo42427i() {
        return this.f37420c;
    }

    @ts2
    /* renamed from: j */
    public String mo42428j() {
        return this.f37418b;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f37412a + ", processName=" + this.f37415a + ", reasonCode=" + this.f37416b + ", importance=" + this.f37419c + ", pss=" + this.f37413a + ", rss=" + this.f37417b + ", timestamp=" + this.f37420c + ", traceFile=" + this.f37418b + ", buildIdMappingForArch=" + this.f37414a + "}";
    }
}

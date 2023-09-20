package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.vf */
public final class C7045vf extends pa0 {

    /* renamed from: a */
    public final int f36511a;

    /* renamed from: a */
    public final pa0.C6371a f36512a;

    /* renamed from: a */
    public final pa0.C6379e f36513a;

    /* renamed from: a */
    public final pa0.C6383f f36514a;

    /* renamed from: a */
    public final String f36515a;

    /* renamed from: b */
    public final String f36516b;

    /* renamed from: c */
    public final String f36517c;

    /* renamed from: d */
    public final String f36518d;

    /* renamed from: e */
    public final String f36519e;

    /* renamed from: com.onedelhi.secure.vf$b */
    public static final class C7047b extends pa0.C6376c {

        /* renamed from: a */
        public pa0.C6371a f36520a;

        /* renamed from: a */
        public pa0.C6379e f36521a;

        /* renamed from: a */
        public pa0.C6383f f36522a;

        /* renamed from: a */
        public Integer f36523a;

        /* renamed from: a */
        public String f36524a;

        /* renamed from: b */
        public String f36525b;

        /* renamed from: c */
        public String f36526c;

        /* renamed from: d */
        public String f36527d;

        /* renamed from: e */
        public String f36528e;

        public C7047b() {
        }

        public C7047b(pa0 pa0) {
            this.f36524a = pa0.mo42411j();
            this.f36525b = pa0.mo42407f();
            this.f36523a = Integer.valueOf(pa0.mo42410i());
            this.f36526c = pa0.mo42408g();
            this.f36527d = pa0.mo42405d();
            this.f36528e = pa0.mo42406e();
            this.f36522a = pa0.mo42412k();
            this.f36521a = pa0.mo42409h();
            this.f36520a = pa0.mo42404c();
        }

        /* renamed from: a */
        public pa0 mo42446a() {
            String str = "";
            if (this.f36524a == null) {
                str = str + " sdkVersion";
            }
            if (this.f36525b == null) {
                str = str + " gmpAppId";
            }
            if (this.f36523a == null) {
                str = str + " platform";
            }
            if (this.f36526c == null) {
                str = str + " installationUuid";
            }
            if (this.f36527d == null) {
                str = str + " buildVersion";
            }
            if (this.f36528e == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C7045vf(this.f36524a, this.f36525b, this.f36523a.intValue(), this.f36526c, this.f36527d, this.f36528e, this.f36522a, this.f36521a, this.f36520a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6376c mo42447b(pa0.C6371a aVar) {
            this.f36520a = aVar;
            return this;
        }

        /* renamed from: c */
        public pa0.C6376c mo42448c(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f36527d = str;
            return this;
        }

        /* renamed from: d */
        public pa0.C6376c mo42449d(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f36528e = str;
            return this;
        }

        /* renamed from: e */
        public pa0.C6376c mo42450e(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f36525b = str;
            return this;
        }

        /* renamed from: f */
        public pa0.C6376c mo42451f(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f36526c = str;
            return this;
        }

        /* renamed from: g */
        public pa0.C6376c mo42452g(pa0.C6379e eVar) {
            this.f36521a = eVar;
            return this;
        }

        /* renamed from: h */
        public pa0.C6376c mo42453h(int i) {
            this.f36523a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: i */
        public pa0.C6376c mo42454i(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.f36524a = str;
            return this;
        }

        /* renamed from: j */
        public pa0.C6376c mo42455j(pa0.C6383f fVar) {
            this.f36522a = fVar;
            return this;
        }
    }

    public C7045vf(String str, String str2, int i, String str3, String str4, String str5, @ts2 pa0.C6383f fVar, @ts2 pa0.C6379e eVar, @ts2 pa0.C6371a aVar) {
        this.f36515a = str;
        this.f36516b = str2;
        this.f36511a = i;
        this.f36517c = str3;
        this.f36518d = str4;
        this.f36519e = str5;
        this.f36514a = fVar;
        this.f36513a = eVar;
        this.f36512a = aVar;
    }

    @ts2
    /* renamed from: c */
    public pa0.C6371a mo42404c() {
        return this.f36512a;
    }

    @mr2
    /* renamed from: d */
    public String mo42405d() {
        return this.f36518d;
    }

    @mr2
    /* renamed from: e */
    public String mo42406e() {
        return this.f36519e;
    }

    public boolean equals(Object obj) {
        pa0.C6383f fVar;
        pa0.C6379e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0)) {
            return false;
        }
        pa0 pa0 = (pa0) obj;
        if (this.f36515a.equals(pa0.mo42411j()) && this.f36516b.equals(pa0.mo42407f()) && this.f36511a == pa0.mo42410i() && this.f36517c.equals(pa0.mo42408g()) && this.f36518d.equals(pa0.mo42405d()) && this.f36519e.equals(pa0.mo42406e()) && ((fVar = this.f36514a) != null ? fVar.equals(pa0.mo42412k()) : pa0.mo42412k() == null) && ((eVar = this.f36513a) != null ? eVar.equals(pa0.mo42409h()) : pa0.mo42409h() == null)) {
            pa0.C6371a aVar = this.f36512a;
            pa0.C6371a c = pa0.mo42404c();
            if (aVar == null) {
                if (c == null) {
                    return true;
                }
            } else if (aVar.equals(c)) {
                return true;
            }
        }
        return false;
    }

    @mr2
    /* renamed from: f */
    public String mo42407f() {
        return this.f36516b;
    }

    @mr2
    /* renamed from: g */
    public String mo42408g() {
        return this.f36517c;
    }

    @ts2
    /* renamed from: h */
    public pa0.C6379e mo42409h() {
        return this.f36513a;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f36515a.hashCode() ^ 1000003) * 1000003) ^ this.f36516b.hashCode()) * 1000003) ^ this.f36511a) * 1000003) ^ this.f36517c.hashCode()) * 1000003) ^ this.f36518d.hashCode()) * 1000003) ^ this.f36519e.hashCode()) * 1000003;
        pa0.C6383f fVar = this.f36514a;
        int i = 0;
        int hashCode2 = (hashCode ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        pa0.C6379e eVar = this.f36513a;
        int hashCode3 = (hashCode2 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        pa0.C6371a aVar = this.f36512a;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 ^ i;
    }

    /* renamed from: i */
    public int mo42410i() {
        return this.f36511a;
    }

    @mr2
    /* renamed from: j */
    public String mo42411j() {
        return this.f36515a;
    }

    @ts2
    /* renamed from: k */
    public pa0.C6383f mo42412k() {
        return this.f36514a;
    }

    /* renamed from: m */
    public pa0.C6376c mo42414m() {
        return new C7047b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f36515a + ", gmpAppId=" + this.f36516b + ", platform=" + this.f36511a + ", installationUuid=" + this.f36517c + ", buildVersion=" + this.f36518d + ", displayVersion=" + this.f36519e + ", session=" + this.f36514a + ", ndkPayload=" + this.f36513a + ", appExitInfo=" + this.f36512a + "}";
    }
}

package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.dg */
public final class C5022dg extends pa0.C6383f.C6384a {

    /* renamed from: a */
    public final pa0.C6383f.C6384a.C6386b f27412a;

    /* renamed from: a */
    public final String f27413a;

    /* renamed from: b */
    public final String f27414b;

    /* renamed from: c */
    public final String f27415c;

    /* renamed from: d */
    public final String f27416d;

    /* renamed from: e */
    public final String f27417e;

    /* renamed from: f */
    public final String f27418f;

    /* renamed from: com.onedelhi.secure.dg$b */
    public static final class C5024b extends pa0.C6383f.C6384a.C6385a {

        /* renamed from: a */
        public pa0.C6383f.C6384a.C6386b f27419a;

        /* renamed from: a */
        public String f27420a;

        /* renamed from: b */
        public String f27421b;

        /* renamed from: c */
        public String f27422c;

        /* renamed from: d */
        public String f27423d;

        /* renamed from: e */
        public String f27424e;

        /* renamed from: f */
        public String f27425f;

        public C5024b() {
        }

        public C5024b(pa0.C6383f.C6384a aVar) {
            this.f27420a = aVar.mo34394e();
            this.f27421b = aVar.mo34398h();
            this.f27422c = aVar.mo34393d();
            this.f27419a = aVar.mo34397g();
            this.f27423d = aVar.mo34396f();
            this.f27424e = aVar.mo34391b();
            this.f27425f = aVar.mo34392c();
        }

        /* renamed from: a */
        public pa0.C6383f.C6384a mo34402a() {
            String str = "";
            if (this.f27420a == null) {
                str = str + " identifier";
            }
            if (this.f27421b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C5022dg(this.f27420a, this.f27421b, this.f27422c, this.f27419a, this.f27423d, this.f27424e, this.f27425f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6384a.C6385a mo34403b(@ts2 String str) {
            this.f27424e = str;
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6384a.C6385a mo34404c(@ts2 String str) {
            this.f27425f = str;
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6384a.C6385a mo34405d(String str) {
            this.f27422c = str;
            return this;
        }

        /* renamed from: e */
        public pa0.C6383f.C6384a.C6385a mo34406e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f27420a = str;
            return this;
        }

        /* renamed from: f */
        public pa0.C6383f.C6384a.C6385a mo34407f(String str) {
            this.f27423d = str;
            return this;
        }

        /* renamed from: g */
        public pa0.C6383f.C6384a.C6385a mo34408g(pa0.C6383f.C6384a.C6386b bVar) {
            this.f27419a = bVar;
            return this;
        }

        /* renamed from: h */
        public pa0.C6383f.C6384a.C6385a mo34409h(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f27421b = str;
            return this;
        }
    }

    public C5022dg(String str, String str2, @ts2 String str3, @ts2 pa0.C6383f.C6384a.C6386b bVar, @ts2 String str4, @ts2 String str5, @ts2 String str6) {
        this.f27413a = str;
        this.f27414b = str2;
        this.f27415c = str3;
        this.f27412a = bVar;
        this.f27416d = str4;
        this.f27417e = str5;
        this.f27418f = str6;
    }

    @ts2
    /* renamed from: b */
    public String mo34391b() {
        return this.f27417e;
    }

    @ts2
    /* renamed from: c */
    public String mo34392c() {
        return this.f27418f;
    }

    @ts2
    /* renamed from: d */
    public String mo34393d() {
        return this.f27415c;
    }

    @mr2
    /* renamed from: e */
    public String mo34394e() {
        return this.f27413a;
    }

    public boolean equals(Object obj) {
        String str;
        pa0.C6383f.C6384a.C6386b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6383f.C6384a)) {
            return false;
        }
        pa0.C6383f.C6384a aVar = (pa0.C6383f.C6384a) obj;
        if (this.f27413a.equals(aVar.mo34394e()) && this.f27414b.equals(aVar.mo34398h()) && ((str = this.f27415c) != null ? str.equals(aVar.mo34393d()) : aVar.mo34393d() == null) && ((bVar = this.f27412a) != null ? bVar.equals(aVar.mo34397g()) : aVar.mo34397g() == null) && ((str2 = this.f27416d) != null ? str2.equals(aVar.mo34396f()) : aVar.mo34396f() == null) && ((str3 = this.f27417e) != null ? str3.equals(aVar.mo34391b()) : aVar.mo34391b() == null)) {
            String str4 = this.f27418f;
            String c = aVar.mo34392c();
            if (str4 == null) {
                if (c == null) {
                    return true;
                }
            } else if (str4.equals(c)) {
                return true;
            }
        }
        return false;
    }

    @ts2
    /* renamed from: f */
    public String mo34396f() {
        return this.f27416d;
    }

    @ts2
    /* renamed from: g */
    public pa0.C6383f.C6384a.C6386b mo34397g() {
        return this.f27412a;
    }

    @mr2
    /* renamed from: h */
    public String mo34398h() {
        return this.f27414b;
    }

    public int hashCode() {
        int hashCode = (((this.f27413a.hashCode() ^ 1000003) * 1000003) ^ this.f27414b.hashCode()) * 1000003;
        String str = this.f27415c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        pa0.C6383f.C6384a.C6386b bVar = this.f27412a;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f27416d;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f27417e;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f27418f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 ^ i;
    }

    /* renamed from: i */
    public pa0.C6383f.C6384a.C6385a mo34400i() {
        return new C5024b(this);
    }

    public String toString() {
        return "Application{identifier=" + this.f27413a + ", version=" + this.f27414b + ", displayVersion=" + this.f27415c + ", organization=" + this.f27412a + ", installationUuid=" + this.f27416d + ", developmentPlatform=" + this.f27417e + ", developmentPlatformVersion=" + this.f27418f + "}";
    }
}

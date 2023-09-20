package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.ig */
public final class C5720ig extends pa0.C6383f.C6391d.C6392a.C6394b {

    /* renamed from: a */
    public final lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e> f30304a;

    /* renamed from: a */
    public final pa0.C6371a f30305a;

    /* renamed from: a */
    public final pa0.C6383f.C6391d.C6392a.C6394b.C6398c f30306a;

    /* renamed from: a */
    public final pa0.C6383f.C6391d.C6392a.C6394b.C6400d f30307a;

    /* renamed from: b */
    public final lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6395a> f30308b;

    /* renamed from: com.onedelhi.secure.ig$b */
    public static final class C5722b extends pa0.C6383f.C6391d.C6392a.C6394b.C6397b {

        /* renamed from: a */
        public lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e> f30309a;

        /* renamed from: a */
        public pa0.C6371a f30310a;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6398c f30311a;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6400d f30312a;

        /* renamed from: b */
        public lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6395a> f30313b;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6392a.C6394b mo38072a() {
            String str = "";
            if (this.f30312a == null) {
                str = str + " signal";
            }
            if (this.f30313b == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C5720ig(this.f30309a, this.f30311a, this.f30310a, this.f30312a, this.f30313b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6397b mo38073b(pa0.C6371a aVar) {
            this.f30310a = aVar;
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6397b mo38074c(lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6395a> lp1) {
            Objects.requireNonNull(lp1, "Null binaries");
            this.f30313b = lp1;
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6397b mo38075d(pa0.C6383f.C6391d.C6392a.C6394b.C6398c cVar) {
            this.f30311a = cVar;
            return this;
        }

        /* renamed from: e */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6397b mo38076e(pa0.C6383f.C6391d.C6392a.C6394b.C6400d dVar) {
            Objects.requireNonNull(dVar, "Null signal");
            this.f30312a = dVar;
            return this;
        }

        /* renamed from: f */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6397b mo38077f(lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e> lp1) {
            this.f30309a = lp1;
            return this;
        }
    }

    public C5720ig(@ts2 lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e> lp1, @ts2 pa0.C6383f.C6391d.C6392a.C6394b.C6398c cVar, @ts2 pa0.C6371a aVar, pa0.C6383f.C6391d.C6392a.C6394b.C6400d dVar, lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6395a> lp12) {
        this.f30304a = lp1;
        this.f30306a = cVar;
        this.f30305a = aVar;
        this.f30307a = dVar;
        this.f30308b = lp12;
    }

    @ts2
    /* renamed from: b */
    public pa0.C6371a mo38064b() {
        return this.f30305a;
    }

    @mr2
    /* renamed from: c */
    public lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6395a> mo38065c() {
        return this.f30308b;
    }

    @ts2
    /* renamed from: d */
    public pa0.C6383f.C6391d.C6392a.C6394b.C6398c mo38066d() {
        return this.f30306a;
    }

    @mr2
    /* renamed from: e */
    public pa0.C6383f.C6391d.C6392a.C6394b.C6400d mo38067e() {
        return this.f30307a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6383f.C6391d.C6392a.C6394b)) {
            return false;
        }
        pa0.C6383f.C6391d.C6392a.C6394b bVar = (pa0.C6383f.C6391d.C6392a.C6394b) obj;
        lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e> lp1 = this.f30304a;
        if (lp1 != null ? lp1.equals(bVar.mo38069f()) : bVar.mo38069f() == null) {
            pa0.C6383f.C6391d.C6392a.C6394b.C6398c cVar = this.f30306a;
            if (cVar != null ? cVar.equals(bVar.mo38066d()) : bVar.mo38066d() == null) {
                pa0.C6371a aVar = this.f30305a;
                if (aVar != null ? aVar.equals(bVar.mo38064b()) : bVar.mo38064b() == null) {
                    return this.f30307a.equals(bVar.mo38067e()) && this.f30308b.equals(bVar.mo38065c());
                }
            }
        }
    }

    @ts2
    /* renamed from: f */
    public lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e> mo38069f() {
        return this.f30304a;
    }

    public int hashCode() {
        lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e> lp1 = this.f30304a;
        int i = 0;
        int hashCode = ((lp1 == null ? 0 : lp1.hashCode()) ^ 1000003) * 1000003;
        pa0.C6383f.C6391d.C6392a.C6394b.C6398c cVar = this.f30306a;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        pa0.C6371a aVar = this.f30305a;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ this.f30307a.hashCode()) * 1000003) ^ this.f30308b.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f30304a + ", exception=" + this.f30306a + ", appExitInfo=" + this.f30305a + ", signal=" + this.f30307a + ", binaries=" + this.f30308b + "}";
    }
}

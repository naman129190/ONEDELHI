package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.gg */
public final class C5428gg extends pa0.C6383f.C6391d {

    /* renamed from: a */
    public final long f29166a;

    /* renamed from: a */
    public final pa0.C6383f.C6391d.C6392a f29167a;

    /* renamed from: a */
    public final pa0.C6383f.C6391d.C6407c f29168a;

    /* renamed from: a */
    public final pa0.C6383f.C6391d.C6409d f29169a;

    /* renamed from: a */
    public final String f29170a;

    /* renamed from: com.onedelhi.secure.gg$b */
    public static final class C5430b extends pa0.C6383f.C6391d.C6406b {

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6392a f29171a;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6407c f29172a;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6409d f29173a;

        /* renamed from: a */
        public Long f29174a;

        /* renamed from: a */
        public String f29175a;

        public C5430b() {
        }

        public C5430b(pa0.C6383f.C6391d dVar) {
            this.f29174a = Long.valueOf(dVar.mo36705e());
            this.f29175a = dVar.mo36707f();
            this.f29171a = dVar.mo36702b();
            this.f29172a = dVar.mo36703c();
            this.f29173a = dVar.mo36704d();
        }

        /* renamed from: a */
        public pa0.C6383f.C6391d mo36711a() {
            String str = "";
            if (this.f29174a == null) {
                str = str + " timestamp";
            }
            if (this.f29175a == null) {
                str = str + " type";
            }
            if (this.f29171a == null) {
                str = str + " app";
            }
            if (this.f29172a == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C5428gg(this.f29174a.longValue(), this.f29175a, this.f29171a, this.f29172a, this.f29173a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6391d.C6406b mo36712b(pa0.C6383f.C6391d.C6392a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f29171a = aVar;
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6391d.C6406b mo36713c(pa0.C6383f.C6391d.C6407c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.f29172a = cVar;
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6391d.C6406b mo36714d(pa0.C6383f.C6391d.C6409d dVar) {
            this.f29173a = dVar;
            return this;
        }

        /* renamed from: e */
        public pa0.C6383f.C6391d.C6406b mo36715e(long j) {
            this.f29174a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public pa0.C6383f.C6391d.C6406b mo36716f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f29175a = str;
            return this;
        }
    }

    public C5428gg(long j, String str, pa0.C6383f.C6391d.C6392a aVar, pa0.C6383f.C6391d.C6407c cVar, @ts2 pa0.C6383f.C6391d.C6409d dVar) {
        this.f29166a = j;
        this.f29170a = str;
        this.f29167a = aVar;
        this.f29168a = cVar;
        this.f29169a = dVar;
    }

    @mr2
    /* renamed from: b */
    public pa0.C6383f.C6391d.C6392a mo36702b() {
        return this.f29167a;
    }

    @mr2
    /* renamed from: c */
    public pa0.C6383f.C6391d.C6407c mo36703c() {
        return this.f29168a;
    }

    @ts2
    /* renamed from: d */
    public pa0.C6383f.C6391d.C6409d mo36704d() {
        return this.f29169a;
    }

    /* renamed from: e */
    public long mo36705e() {
        return this.f29166a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6383f.C6391d)) {
            return false;
        }
        pa0.C6383f.C6391d dVar = (pa0.C6383f.C6391d) obj;
        if (this.f29166a == dVar.mo36705e() && this.f29170a.equals(dVar.mo36707f()) && this.f29167a.equals(dVar.mo36702b()) && this.f29168a.equals(dVar.mo36703c())) {
            pa0.C6383f.C6391d.C6409d dVar2 = this.f29169a;
            pa0.C6383f.C6391d.C6409d d = dVar.mo36704d();
            if (dVar2 == null) {
                if (d == null) {
                    return true;
                }
            } else if (dVar2.equals(d)) {
                return true;
            }
        }
        return false;
    }

    @mr2
    /* renamed from: f */
    public String mo36707f() {
        return this.f29170a;
    }

    /* renamed from: g */
    public pa0.C6383f.C6391d.C6406b mo36708g() {
        return new C5430b(this);
    }

    public int hashCode() {
        long j = this.f29166a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f29170a.hashCode()) * 1000003) ^ this.f29167a.hashCode()) * 1000003) ^ this.f29168a.hashCode()) * 1000003;
        pa0.C6383f.C6391d.C6409d dVar = this.f29169a;
        return (dVar == null ? 0 : dVar.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.f29166a + ", type=" + this.f29170a + ", app=" + this.f29167a + ", device=" + this.f29168a + ", log=" + this.f29169a + "}";
    }
}

package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.lg */
public final class C6003lg extends pa0.C6383f.C6391d.C6392a.C6394b.C6400d {

    /* renamed from: a */
    public final long f31647a;

    /* renamed from: a */
    public final String f31648a;

    /* renamed from: b */
    public final String f31649b;

    /* renamed from: com.onedelhi.secure.lg$b */
    public static final class C6005b extends pa0.C6383f.C6391d.C6392a.C6394b.C6400d.C6401a {

        /* renamed from: a */
        public Long f31650a;

        /* renamed from: a */
        public String f31651a;

        /* renamed from: b */
        public String f31652b;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6400d mo39840a() {
            String str = "";
            if (this.f31651a == null) {
                str = str + " name";
            }
            if (this.f31652b == null) {
                str = str + " code";
            }
            if (this.f31650a == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C6003lg(this.f31651a, this.f31652b, this.f31650a.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6400d.C6401a mo39841b(long j) {
            this.f31650a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6400d.C6401a mo39842c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f31652b = str;
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6400d.C6401a mo39843d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f31651a = str;
            return this;
        }
    }

    public C6003lg(String str, String str2, long j) {
        this.f31648a = str;
        this.f31649b = str2;
        this.f31647a = j;
    }

    @mr2
    /* renamed from: b */
    public long mo39834b() {
        return this.f31647a;
    }

    @mr2
    /* renamed from: c */
    public String mo39835c() {
        return this.f31649b;
    }

    @mr2
    /* renamed from: d */
    public String mo39836d() {
        return this.f31648a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6383f.C6391d.C6392a.C6394b.C6400d)) {
            return false;
        }
        pa0.C6383f.C6391d.C6392a.C6394b.C6400d dVar = (pa0.C6383f.C6391d.C6392a.C6394b.C6400d) obj;
        return this.f31648a.equals(dVar.mo39836d()) && this.f31649b.equals(dVar.mo39835c()) && this.f31647a == dVar.mo39834b();
    }

    public int hashCode() {
        long j = this.f31647a;
        return ((((this.f31648a.hashCode() ^ 1000003) * 1000003) ^ this.f31649b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f31648a + ", code=" + this.f31649b + ", address=" + this.f31647a + "}";
    }
}

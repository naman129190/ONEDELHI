package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import com.onedelhi.secure.tt0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.jg */
public final class C5812jg extends pa0.C6383f.C6391d.C6392a.C6394b.C6395a {

    /* renamed from: a */
    public final long f30758a;

    /* renamed from: a */
    public final String f30759a;

    /* renamed from: b */
    public final long f30760b;

    /* renamed from: b */
    public final String f30761b;

    /* renamed from: com.onedelhi.secure.jg$b */
    public static final class C5814b extends pa0.C6383f.C6391d.C6392a.C6394b.C6395a.C6396a {

        /* renamed from: a */
        public Long f30762a;

        /* renamed from: a */
        public String f30763a;

        /* renamed from: b */
        public Long f30764b;

        /* renamed from: b */
        public String f30765b;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6395a mo38628a() {
            String str = "";
            if (this.f30762a == null) {
                str = str + " baseAddress";
            }
            if (this.f30764b == null) {
                str = str + " size";
            }
            if (this.f30763a == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C5812jg(this.f30762a.longValue(), this.f30764b.longValue(), this.f30763a, this.f30765b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6395a.C6396a mo38629b(long j) {
            this.f30762a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6395a.C6396a mo38630c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f30763a = str;
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6395a.C6396a mo38631d(long j) {
            this.f30764b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6395a.C6396a mo38632e(@ts2 String str) {
            this.f30765b = str;
            return this;
        }
    }

    public C5812jg(long j, long j2, String str, @ts2 String str2) {
        this.f30758a = j;
        this.f30760b = j2;
        this.f30759a = str;
        this.f30761b = str2;
    }

    @mr2
    /* renamed from: b */
    public long mo38621b() {
        return this.f30758a;
    }

    @mr2
    /* renamed from: c */
    public String mo38622c() {
        return this.f30759a;
    }

    /* renamed from: d */
    public long mo38623d() {
        return this.f30760b;
    }

    @ts2
    @tt0.C6899b
    /* renamed from: e */
    public String mo38624e() {
        return this.f30761b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6383f.C6391d.C6392a.C6394b.C6395a)) {
            return false;
        }
        pa0.C6383f.C6391d.C6392a.C6394b.C6395a aVar = (pa0.C6383f.C6391d.C6392a.C6394b.C6395a) obj;
        if (this.f30758a == aVar.mo38621b() && this.f30760b == aVar.mo38623d() && this.f30759a.equals(aVar.mo38622c())) {
            String str = this.f30761b;
            String e = aVar.mo38624e();
            if (str == null) {
                if (e == null) {
                    return true;
                }
            } else if (str.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f30758a;
        long j2 = this.f30760b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f30759a.hashCode()) * 1000003;
        String str = this.f30761b;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f30758a + ", size=" + this.f30760b + ", name=" + this.f30759a + ", uuid=" + this.f30761b + "}";
    }
}

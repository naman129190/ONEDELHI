package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.pg */
public final class C6437pg extends pa0.C6383f.C6391d.C6409d {

    /* renamed from: a */
    public final String f33646a;

    /* renamed from: com.onedelhi.secure.pg$b */
    public static final class C6439b extends pa0.C6383f.C6391d.C6409d.C6410a {

        /* renamed from: a */
        public String f33647a;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6409d mo42470a() {
            String str = "";
            if (this.f33647a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new C6437pg(this.f33647a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6391d.C6409d.C6410a mo42471b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.f33647a = str;
            return this;
        }
    }

    public C6437pg(String str) {
        this.f33646a = str;
    }

    @mr2
    /* renamed from: b */
    public String mo42469b() {
        return this.f33646a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pa0.C6383f.C6391d.C6409d) {
            return this.f33646a.equals(((pa0.C6383f.C6391d.C6409d) obj).mo42469b());
        }
        return false;
    }

    public int hashCode() {
        return this.f33646a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f33646a + "}";
    }
}

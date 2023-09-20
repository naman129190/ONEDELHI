package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.eg */
public final class C5135eg extends pa0.C6383f.C6384a.C6386b {

    /* renamed from: a */
    public final String f27892a;

    /* renamed from: com.onedelhi.secure.eg$b */
    public static final class C5137b extends pa0.C6383f.C6384a.C6386b.C6387a {

        /* renamed from: a */
        public String f27893a;

        public C5137b() {
        }

        public C5137b(pa0.C6383f.C6384a.C6386b bVar) {
            this.f27893a = bVar.mo35226b();
        }

        /* renamed from: a */
        public pa0.C6383f.C6384a.C6386b mo35231a() {
            String str = "";
            if (this.f27893a == null) {
                str = str + " clsId";
            }
            if (str.isEmpty()) {
                return new C5135eg(this.f27893a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6384a.C6386b.C6387a mo35232b(String str) {
            Objects.requireNonNull(str, "Null clsId");
            this.f27893a = str;
            return this;
        }
    }

    public C5135eg(String str) {
        this.f27892a = str;
    }

    @mr2
    /* renamed from: b */
    public String mo35226b() {
        return this.f27892a;
    }

    /* renamed from: c */
    public pa0.C6383f.C6384a.C6386b.C6387a mo35227c() {
        return new C5137b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pa0.C6383f.C6384a.C6386b) {
            return this.f27892a.equals(((pa0.C6383f.C6384a.C6386b) obj).mo35226b());
        }
        return false;
    }

    public int hashCode() {
        return this.f27892a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f27892a + "}";
    }
}

package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.ag */
public final class C4553ag extends pa0.C6379e {

    /* renamed from: a */
    public final lp1<pa0.C6379e.C6381b> f25830a;

    /* renamed from: a */
    public final String f25831a;

    /* renamed from: com.onedelhi.secure.ag$b */
    public static final class C4555b extends pa0.C6379e.C6380a {

        /* renamed from: a */
        public lp1<pa0.C6379e.C6381b> f25832a;

        /* renamed from: a */
        public String f25833a;

        public C4555b() {
        }

        public C4555b(pa0.C6379e eVar) {
            this.f25832a = eVar.mo30916b();
            this.f25833a = eVar.mo30917c();
        }

        /* renamed from: a */
        public pa0.C6379e mo30922a() {
            String str = "";
            if (this.f25832a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new C4553ag(this.f25832a, this.f25833a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6379e.C6380a mo30923b(lp1<pa0.C6379e.C6381b> lp1) {
            Objects.requireNonNull(lp1, "Null files");
            this.f25832a = lp1;
            return this;
        }

        /* renamed from: c */
        public pa0.C6379e.C6380a mo30924c(String str) {
            this.f25833a = str;
            return this;
        }
    }

    public C4553ag(lp1<pa0.C6379e.C6381b> lp1, @ts2 String str) {
        this.f25830a = lp1;
        this.f25831a = str;
    }

    @mr2
    /* renamed from: b */
    public lp1<pa0.C6379e.C6381b> mo30916b() {
        return this.f25830a;
    }

    @ts2
    /* renamed from: c */
    public String mo30917c() {
        return this.f25831a;
    }

    /* renamed from: d */
    public pa0.C6379e.C6380a mo30918d() {
        return new C4555b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6379e)) {
            return false;
        }
        pa0.C6379e eVar = (pa0.C6379e) obj;
        if (this.f25830a.equals(eVar.mo30916b())) {
            String str = this.f25831a;
            String c = eVar.mo30917c();
            if (str == null) {
                if (c == null) {
                    return true;
                }
            } else if (str.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f25830a.hashCode() ^ 1000003) * 1000003;
        String str = this.f25831a;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f25830a + ", orgId=" + this.f25831a + "}";
    }
}

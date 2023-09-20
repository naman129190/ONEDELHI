package com.onedelhi.secure;

import com.onedelhi.secure.wt3;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.jh */
public final class C2516jh extends wt3 {

    /* renamed from: a */
    public final hu0 f14143a;

    /* renamed from: a */
    public final qv0<?> f14144a;

    /* renamed from: a */
    public final wg4<?, byte[]> f14145a;

    /* renamed from: a */
    public final xh4 f14146a;

    /* renamed from: a */
    public final String f14147a;

    /* renamed from: com.onedelhi.secure.jh$b */
    public static final class C2518b extends wt3.C3873a {

        /* renamed from: a */
        public hu0 f14148a;

        /* renamed from: a */
        public qv0<?> f14149a;

        /* renamed from: a */
        public wg4<?, byte[]> f14150a;

        /* renamed from: a */
        public xh4 f14151a;

        /* renamed from: a */
        public String f14152a;

        /* renamed from: a */
        public wt3 mo18414a() {
            String str = "";
            if (this.f14151a == null) {
                str = str + " transportContext";
            }
            if (this.f14152a == null) {
                str = str + " transportName";
            }
            if (this.f14149a == null) {
                str = str + " event";
            }
            if (this.f14150a == null) {
                str = str + " transformer";
            }
            if (this.f14148a == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C2516jh(this.f14151a, this.f14152a, this.f14149a, this.f14150a, this.f14148a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public wt3.C3873a mo18415b(hu0 hu0) {
            Objects.requireNonNull(hu0, "Null encoding");
            this.f14148a = hu0;
            return this;
        }

        /* renamed from: c */
        public wt3.C3873a mo18416c(qv0<?> qv0) {
            Objects.requireNonNull(qv0, "Null event");
            this.f14149a = qv0;
            return this;
        }

        /* renamed from: e */
        public wt3.C3873a mo18417e(wg4<?, byte[]> wg4) {
            Objects.requireNonNull(wg4, "Null transformer");
            this.f14150a = wg4;
            return this;
        }

        /* renamed from: f */
        public wt3.C3873a mo18418f(xh4 xh4) {
            Objects.requireNonNull(xh4, "Null transportContext");
            this.f14151a = xh4;
            return this;
        }

        /* renamed from: g */
        public wt3.C3873a mo18419g(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f14152a = str;
            return this;
        }
    }

    public C2516jh(xh4 xh4, String str, qv0<?> qv0, wg4<?, byte[]> wg4, hu0 hu0) {
        this.f14146a = xh4;
        this.f14147a = str;
        this.f14144a = qv0;
        this.f14145a = wg4;
        this.f14143a = hu0;
    }

    /* renamed from: b */
    public hu0 mo18406b() {
        return this.f14143a;
    }

    /* renamed from: c */
    public qv0<?> mo18407c() {
        return this.f14144a;
    }

    /* renamed from: e */
    public wg4<?, byte[]> mo18408e() {
        return this.f14145a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wt3)) {
            return false;
        }
        wt3 wt3 = (wt3) obj;
        return this.f14146a.equals(wt3.mo18410f()) && this.f14147a.equals(wt3.mo18411g()) && this.f14144a.equals(wt3.mo18407c()) && this.f14145a.equals(wt3.mo18408e()) && this.f14143a.equals(wt3.mo18406b());
    }

    /* renamed from: f */
    public xh4 mo18410f() {
        return this.f14146a;
    }

    /* renamed from: g */
    public String mo18411g() {
        return this.f14147a;
    }

    public int hashCode() {
        return ((((((((this.f14146a.hashCode() ^ 1000003) * 1000003) ^ this.f14147a.hashCode()) * 1000003) ^ this.f14144a.hashCode()) * 1000003) ^ this.f14145a.hashCode()) * 1000003) ^ this.f14143a.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f14146a + ", transportName=" + this.f14147a + ", event=" + this.f14144a + ", transformer=" + this.f14145a + ", encoding=" + this.f14143a + "}";
    }
}

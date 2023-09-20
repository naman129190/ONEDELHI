package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.mg */
public final class C6111mg extends pa0.C6383f.C6391d.C6392a.C6394b.C6402e {

    /* renamed from: a */
    public final int f32127a;

    /* renamed from: a */
    public final lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b> f32128a;

    /* renamed from: a */
    public final String f32129a;

    /* renamed from: com.onedelhi.secure.mg$b */
    public static final class C6113b extends pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6403a {

        /* renamed from: a */
        public lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b> f32130a;

        /* renamed from: a */
        public Integer f32131a;

        /* renamed from: a */
        public String f32132a;

        /* renamed from: a */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6402e mo40577a() {
            String str = "";
            if (this.f32132a == null) {
                str = str + " name";
            }
            if (this.f32131a == null) {
                str = str + " importance";
            }
            if (this.f32130a == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C6111mg(this.f32132a, this.f32131a.intValue(), this.f32130a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6403a mo40578b(lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b> lp1) {
            Objects.requireNonNull(lp1, "Null frames");
            this.f32130a = lp1;
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6403a mo40579c(int i) {
            this.f32131a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6403a mo40580d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f32132a = str;
            return this;
        }
    }

    public C6111mg(String str, int i, lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b> lp1) {
        this.f32129a = str;
        this.f32127a = i;
        this.f32128a = lp1;
    }

    @mr2
    /* renamed from: b */
    public lp1<pa0.C6383f.C6391d.C6392a.C6394b.C6402e.C6404b> mo40571b() {
        return this.f32128a;
    }

    /* renamed from: c */
    public int mo40572c() {
        return this.f32127a;
    }

    @mr2
    /* renamed from: d */
    public String mo40573d() {
        return this.f32129a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6383f.C6391d.C6392a.C6394b.C6402e)) {
            return false;
        }
        pa0.C6383f.C6391d.C6392a.C6394b.C6402e eVar = (pa0.C6383f.C6391d.C6392a.C6394b.C6402e) obj;
        return this.f32129a.equals(eVar.mo40573d()) && this.f32127a == eVar.mo40572c() && this.f32128a.equals(eVar.mo40571b());
    }

    public int hashCode() {
        return ((((this.f32129a.hashCode() ^ 1000003) * 1000003) ^ this.f32127a) * 1000003) ^ this.f32128a.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f32129a + ", importance=" + this.f32127a + ", frames=" + this.f32128a + "}";
    }
}

package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.fg */
public final class C5264fg extends pa0.C6383f.C6389c {

    /* renamed from: a */
    public final int f28425a;

    /* renamed from: a */
    public final long f28426a;

    /* renamed from: a */
    public final String f28427a;

    /* renamed from: a */
    public final boolean f28428a;

    /* renamed from: b */
    public final int f28429b;

    /* renamed from: b */
    public final long f28430b;

    /* renamed from: b */
    public final String f28431b;

    /* renamed from: c */
    public final int f28432c;

    /* renamed from: c */
    public final String f28433c;

    /* renamed from: com.onedelhi.secure.fg$b */
    public static final class C5266b extends pa0.C6383f.C6389c.C6390a {

        /* renamed from: a */
        public Boolean f28434a;

        /* renamed from: a */
        public Integer f28435a;

        /* renamed from: a */
        public Long f28436a;

        /* renamed from: a */
        public String f28437a;

        /* renamed from: b */
        public Integer f28438b;

        /* renamed from: b */
        public Long f28439b;

        /* renamed from: b */
        public String f28440b;

        /* renamed from: c */
        public Integer f28441c;

        /* renamed from: c */
        public String f28442c;

        /* renamed from: a */
        public pa0.C6383f.C6389c mo35929a() {
            String str = "";
            if (this.f28435a == null) {
                str = str + " arch";
            }
            if (this.f28437a == null) {
                str = str + " model";
            }
            if (this.f28438b == null) {
                str = str + " cores";
            }
            if (this.f28436a == null) {
                str = str + " ram";
            }
            if (this.f28439b == null) {
                str = str + " diskSpace";
            }
            if (this.f28434a == null) {
                str = str + " simulator";
            }
            if (this.f28441c == null) {
                str = str + " state";
            }
            if (this.f28440b == null) {
                str = str + " manufacturer";
            }
            if (this.f28442c == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C5264fg(this.f28435a.intValue(), this.f28437a, this.f28438b.intValue(), this.f28436a.longValue(), this.f28439b.longValue(), this.f28434a.booleanValue(), this.f28441c.intValue(), this.f28440b, this.f28442c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6389c.C6390a mo35930b(int i) {
            this.f28435a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6389c.C6390a mo35931c(int i) {
            this.f28438b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6389c.C6390a mo35932d(long j) {
            this.f28439b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public pa0.C6383f.C6389c.C6390a mo35933e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f28440b = str;
            return this;
        }

        /* renamed from: f */
        public pa0.C6383f.C6389c.C6390a mo35934f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f28437a = str;
            return this;
        }

        /* renamed from: g */
        public pa0.C6383f.C6389c.C6390a mo35935g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f28442c = str;
            return this;
        }

        /* renamed from: h */
        public pa0.C6383f.C6389c.C6390a mo35936h(long j) {
            this.f28436a = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public pa0.C6383f.C6389c.C6390a mo35937i(boolean z) {
            this.f28434a = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: j */
        public pa0.C6383f.C6389c.C6390a mo35938j(int i) {
            this.f28441c = Integer.valueOf(i);
            return this;
        }
    }

    public C5264fg(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f28425a = i;
        this.f28427a = str;
        this.f28429b = i2;
        this.f28426a = j;
        this.f28430b = j2;
        this.f28428a = z;
        this.f28432c = i3;
        this.f28431b = str2;
        this.f28433c = str3;
    }

    @mr2
    /* renamed from: b */
    public int mo35917b() {
        return this.f28425a;
    }

    /* renamed from: c */
    public int mo35918c() {
        return this.f28429b;
    }

    /* renamed from: d */
    public long mo35919d() {
        return this.f28430b;
    }

    @mr2
    /* renamed from: e */
    public String mo35920e() {
        return this.f28431b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6383f.C6389c)) {
            return false;
        }
        pa0.C6383f.C6389c cVar = (pa0.C6383f.C6389c) obj;
        return this.f28425a == cVar.mo35917b() && this.f28427a.equals(cVar.mo35922f()) && this.f28429b == cVar.mo35918c() && this.f28426a == cVar.mo35924h() && this.f28430b == cVar.mo35919d() && this.f28428a == cVar.mo35927j() && this.f28432c == cVar.mo35926i() && this.f28431b.equals(cVar.mo35920e()) && this.f28433c.equals(cVar.mo35923g());
    }

    @mr2
    /* renamed from: f */
    public String mo35922f() {
        return this.f28427a;
    }

    @mr2
    /* renamed from: g */
    public String mo35923g() {
        return this.f28433c;
    }

    /* renamed from: h */
    public long mo35924h() {
        return this.f28426a;
    }

    public int hashCode() {
        long j = this.f28426a;
        long j2 = this.f28430b;
        return ((((((((((((((((this.f28425a ^ 1000003) * 1000003) ^ this.f28427a.hashCode()) * 1000003) ^ this.f28429b) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f28428a ? 1231 : 1237)) * 1000003) ^ this.f28432c) * 1000003) ^ this.f28431b.hashCode()) * 1000003) ^ this.f28433c.hashCode();
    }

    /* renamed from: i */
    public int mo35926i() {
        return this.f28432c;
    }

    /* renamed from: j */
    public boolean mo35927j() {
        return this.f28428a;
    }

    public String toString() {
        return "Device{arch=" + this.f28425a + ", model=" + this.f28427a + ", cores=" + this.f28429b + ", ram=" + this.f28426a + ", diskSpace=" + this.f28430b + ", simulator=" + this.f28428a + ", state=" + this.f28432c + ", manufacturer=" + this.f28431b + ", modelClass=" + this.f28433c + "}";
    }
}

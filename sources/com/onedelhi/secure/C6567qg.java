package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.qg */
public final class C6567qg extends pa0.C6383f.C6411e {

    /* renamed from: a */
    public final int f34210a;

    /* renamed from: a */
    public final String f34211a;

    /* renamed from: a */
    public final boolean f34212a;

    /* renamed from: b */
    public final String f34213b;

    /* renamed from: com.onedelhi.secure.qg$b */
    public static final class C6569b extends pa0.C6383f.C6411e.C6412a {

        /* renamed from: a */
        public Boolean f34214a;

        /* renamed from: a */
        public Integer f34215a;

        /* renamed from: a */
        public String f34216a;

        /* renamed from: b */
        public String f34217b;

        /* renamed from: a */
        public pa0.C6383f.C6411e mo42476a() {
            String str = "";
            if (this.f34215a == null) {
                str = str + " platform";
            }
            if (this.f34216a == null) {
                str = str + " version";
            }
            if (this.f34217b == null) {
                str = str + " buildVersion";
            }
            if (this.f34214a == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C6567qg(this.f34215a.intValue(), this.f34216a, this.f34217b, this.f34214a.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6411e.C6412a mo42477b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f34217b = str;
            return this;
        }

        /* renamed from: c */
        public pa0.C6383f.C6411e.C6412a mo42478c(boolean z) {
            this.f34214a = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public pa0.C6383f.C6411e.C6412a mo42479d(int i) {
            this.f34215a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public pa0.C6383f.C6411e.C6412a mo42480e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f34216a = str;
            return this;
        }
    }

    public C6567qg(int i, String str, String str2, boolean z) {
        this.f34210a = i;
        this.f34211a = str;
        this.f34213b = str2;
        this.f34212a = z;
    }

    @mr2
    /* renamed from: b */
    public String mo42472b() {
        return this.f34213b;
    }

    /* renamed from: c */
    public int mo42473c() {
        return this.f34210a;
    }

    @mr2
    /* renamed from: d */
    public String mo42474d() {
        return this.f34211a;
    }

    /* renamed from: e */
    public boolean mo42475e() {
        return this.f34212a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6383f.C6411e)) {
            return false;
        }
        pa0.C6383f.C6411e eVar = (pa0.C6383f.C6411e) obj;
        return this.f34210a == eVar.mo42473c() && this.f34211a.equals(eVar.mo42474d()) && this.f34213b.equals(eVar.mo42472b()) && this.f34212a == eVar.mo42475e();
    }

    public int hashCode() {
        return ((((((this.f34210a ^ 1000003) * 1000003) ^ this.f34211a.hashCode()) * 1000003) ^ this.f34213b.hashCode()) * 1000003) ^ (this.f34212a ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f34210a + ", version=" + this.f34211a + ", buildVersion=" + this.f34213b + ", jailbroken=" + this.f34212a + "}";
    }
}

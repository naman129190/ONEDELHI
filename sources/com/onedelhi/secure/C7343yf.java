package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.yf */
public final class C7343yf extends pa0.C6371a.C6372a {

    /* renamed from: a */
    public final String f37874a;

    /* renamed from: b */
    public final String f37875b;

    /* renamed from: c */
    public final String f37876c;

    /* renamed from: com.onedelhi.secure.yf$b */
    public static final class C7345b extends pa0.C6371a.C6372a.C6373a {

        /* renamed from: a */
        public String f37877a;

        /* renamed from: b */
        public String f37878b;

        /* renamed from: c */
        public String f37879c;

        /* renamed from: a */
        public pa0.C6371a.C6372a mo42432a() {
            String str = "";
            if (this.f37877a == null) {
                str = str + " arch";
            }
            if (this.f37878b == null) {
                str = str + " libraryName";
            }
            if (this.f37879c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new C7343yf(this.f37877a, this.f37878b, this.f37879c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6371a.C6372a.C6373a mo42433b(String str) {
            Objects.requireNonNull(str, "Null arch");
            this.f37877a = str;
            return this;
        }

        /* renamed from: c */
        public pa0.C6371a.C6372a.C6373a mo42434c(String str) {
            Objects.requireNonNull(str, "Null buildId");
            this.f37879c = str;
            return this;
        }

        /* renamed from: d */
        public pa0.C6371a.C6372a.C6373a mo42435d(String str) {
            Objects.requireNonNull(str, "Null libraryName");
            this.f37878b = str;
            return this;
        }
    }

    public C7343yf(String str, String str2, String str3) {
        this.f37874a = str;
        this.f37875b = str2;
        this.f37876c = str3;
    }

    @mr2
    /* renamed from: b */
    public String mo42429b() {
        return this.f37874a;
    }

    @mr2
    /* renamed from: c */
    public String mo42430c() {
        return this.f37876c;
    }

    @mr2
    /* renamed from: d */
    public String mo42431d() {
        return this.f37875b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6371a.C6372a)) {
            return false;
        }
        pa0.C6371a.C6372a aVar = (pa0.C6371a.C6372a) obj;
        return this.f37874a.equals(aVar.mo42429b()) && this.f37875b.equals(aVar.mo42431d()) && this.f37876c.equals(aVar.mo42430c());
    }

    public int hashCode() {
        return ((((this.f37874a.hashCode() ^ 1000003) * 1000003) ^ this.f37875b.hashCode()) * 1000003) ^ this.f37876c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f37874a + ", libraryName=" + this.f37875b + ", buildId=" + this.f37876c + "}";
    }
}

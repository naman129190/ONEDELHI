package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.zf */
public final class C7486zf extends pa0.C6377d {

    /* renamed from: a */
    public final String f38320a;

    /* renamed from: b */
    public final String f38321b;

    /* renamed from: com.onedelhi.secure.zf$b */
    public static final class C7488b extends pa0.C6377d.C6378a {

        /* renamed from: a */
        public String f38322a;

        /* renamed from: b */
        public String f38323b;

        /* renamed from: a */
        public pa0.C6377d mo42458a() {
            String str = "";
            if (this.f38322a == null) {
                str = str + " key";
            }
            if (this.f38323b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C7486zf(this.f38322a, this.f38323b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6377d.C6378a mo42459b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.f38322a = str;
            return this;
        }

        /* renamed from: c */
        public pa0.C6377d.C6378a mo42460c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f38323b = str;
            return this;
        }
    }

    public C7486zf(String str, String str2) {
        this.f38320a = str;
        this.f38321b = str2;
    }

    @mr2
    /* renamed from: b */
    public String mo42456b() {
        return this.f38320a;
    }

    @mr2
    /* renamed from: c */
    public String mo42457c() {
        return this.f38321b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0.C6377d)) {
            return false;
        }
        pa0.C6377d dVar = (pa0.C6377d) obj;
        return this.f38320a.equals(dVar.mo42456b()) && this.f38321b.equals(dVar.mo42457c());
    }

    public int hashCode() {
        return ((this.f38320a.hashCode() ^ 1000003) * 1000003) ^ this.f38321b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f38320a + ", value=" + this.f38321b + "}";
    }
}

package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.rg */
public final class C6690rg extends pa0.C6383f.C6413f {

    /* renamed from: a */
    public final String f34612a;

    /* renamed from: com.onedelhi.secure.rg$b */
    public static final class C6692b extends pa0.C6383f.C6413f.C6414a {

        /* renamed from: a */
        public String f34613a;

        /* renamed from: a */
        public pa0.C6383f.C6413f mo42482a() {
            String str = "";
            if (this.f34613a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new C6690rg(this.f34613a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public pa0.C6383f.C6413f.C6414a mo42483b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f34613a = str;
            return this;
        }
    }

    public C6690rg(String str) {
        this.f34612a = str;
    }

    @mr2
    /* renamed from: b */
    public String mo42481b() {
        return this.f34612a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pa0.C6383f.C6413f) {
            return this.f34612a.equals(((pa0.C6383f.C6413f) obj).mo42481b());
        }
        return false;
    }

    public int hashCode() {
        return this.f34612a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f34612a + "}";
    }
}

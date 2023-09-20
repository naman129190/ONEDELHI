package com.onedelhi.secure;

import java.io.Serializable;

@gz3(version = "1.4")
/* renamed from: com.onedelhi.secure.w3 */
public class C7126w3 implements dd1, Serializable {

    /* renamed from: a */
    public final Class f36860a;

    /* renamed from: a */
    public final Object f36861a;

    /* renamed from: b */
    public final String f36862b;

    /* renamed from: b */
    public final boolean f36863b;

    /* renamed from: c */
    public final String f36864c;

    /* renamed from: n */
    public final int f36865n;

    /* renamed from: o */
    public final int f36866o;

    public C7126w3(int i, Class cls, String str, String str2, int i2) {
        this(i, C7077vs.f36654b, cls, str, str2, i2);
    }

    public C7126w3(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.f36861a = obj;
        this.f36860a = cls;
        this.f36862b = str;
        this.f36864c = str2;
        this.f36863b = (i2 & 1) == 1;
        this.f36865n = i;
        this.f36866o = i2 >> 1;
    }

    /* renamed from: a */
    public lx1 mo46506a() {
        Class cls = this.f36860a;
        if (cls == null) {
            return null;
        }
        return this.f36863b ? ah3.m38684g(cls) : ah3.m38681d(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7126w3)) {
            return false;
        }
        C7126w3 w3Var = (C7126w3) obj;
        return this.f36863b == w3Var.f36863b && this.f36865n == w3Var.f36865n && this.f36866o == w3Var.f36866o && jt1.m53768g(this.f36861a, w3Var.f36861a) && jt1.m53768g(this.f36860a, w3Var.f36860a) && this.f36862b.equals(w3Var.f36862b) && this.f36864c.equals(w3Var.f36864c);
    }

    public int getArity() {
        return this.f36865n;
    }

    public int hashCode() {
        Object obj = this.f36861a;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f36860a;
        if (cls != null) {
            i = cls.hashCode();
        }
        return ((((((((((hashCode + i) * 31) + this.f36862b.hashCode()) * 31) + this.f36864c.hashCode()) * 31) + (this.f36863b ? 1231 : 1237)) * 31) + this.f36865n) * 31) + this.f36866o;
    }

    public String toString() {
        return ah3.m38700w(this);
    }
}

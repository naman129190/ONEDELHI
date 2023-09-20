package com.onedelhi.secure;

import android.content.Context;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.sg */
public final class C3515sg extends gb0 {

    /* renamed from: a */
    public final Context f20343a;

    /* renamed from: a */
    public final C2106ez f20344a;

    /* renamed from: b */
    public final C2106ez f20345b;

    /* renamed from: b */
    public final String f20346b;

    public C3515sg(Context context, C2106ez ezVar, C2106ez ezVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f20343a = context;
        Objects.requireNonNull(ezVar, "Null wallClock");
        this.f20344a = ezVar;
        Objects.requireNonNull(ezVar2, "Null monotonicClock");
        this.f20345b = ezVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f20346b = str;
    }

    /* renamed from: c */
    public Context mo16451c() {
        return this.f20343a;
    }

    @mr2
    /* renamed from: d */
    public String mo16452d() {
        return this.f20346b;
    }

    /* renamed from: e */
    public C2106ez mo16453e() {
        return this.f20345b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gb0)) {
            return false;
        }
        gb0 gb0 = (gb0) obj;
        return this.f20343a.equals(gb0.mo16451c()) && this.f20344a.equals(gb0.mo16454f()) && this.f20345b.equals(gb0.mo16453e()) && this.f20346b.equals(gb0.mo16452d());
    }

    /* renamed from: f */
    public C2106ez mo16454f() {
        return this.f20344a;
    }

    public int hashCode() {
        return ((((((this.f20343a.hashCode() ^ 1000003) * 1000003) ^ this.f20344a.hashCode()) * 1000003) ^ this.f20345b.hashCode()) * 1000003) ^ this.f20346b.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f20343a + ", wallClock=" + this.f20344a + ", monotonicClock=" + this.f20345b + ", backendName=" + this.f20346b + "}";
    }
}

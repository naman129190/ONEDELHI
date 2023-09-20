package com.onedelhi.secure;

public final class ur3 implements lz0<pr3> {

    /* renamed from: a */
    public final a73<C2106ez> f21513a;

    public ur3(a73<C2106ez> a73) {
        this.f21513a = a73;
    }

    /* renamed from: a */
    public static pr3 m29544a(C2106ez ezVar) {
        return (pr3) h43.m16476c(tr3.m28927a(ezVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static ur3 m29545b(a73<C2106ez> a73) {
        return new ur3(a73);
    }

    /* renamed from: c */
    public pr3 get() {
        return m29544a(this.f21513a.get());
    }
}

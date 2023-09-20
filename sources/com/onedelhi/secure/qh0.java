package com.onedelhi.secure;

import java.util.concurrent.Executor;

public final class qh0 implements lz0<ph0> {

    /* renamed from: a */
    public final a73<Executor> f19177a;

    /* renamed from: b */
    public final a73<C2448ii> f19178b;

    /* renamed from: c */
    public final a73<ky4> f19179c;

    /* renamed from: d */
    public final a73<aw0> f19180d;

    /* renamed from: e */
    public final a73<q84> f19181e;

    public qh0(a73<Executor> a73, a73<C2448ii> a732, a73<ky4> a733, a73<aw0> a734, a73<q84> a735) {
        this.f19177a = a73;
        this.f19178b = a732;
        this.f19179c = a733;
        this.f19180d = a734;
        this.f19181e = a735;
    }

    /* renamed from: a */
    public static qh0 m25757a(a73<Executor> a73, a73<C2448ii> a732, a73<ky4> a733, a73<aw0> a734, a73<q84> a735) {
        return new qh0(a73, a732, a733, a734, a735);
    }

    /* renamed from: c */
    public static ph0 m25758c(Executor executor, C2448ii iiVar, ky4 ky4, aw0 aw0, q84 q84) {
        return new ph0(executor, iiVar, ky4, aw0, q84);
    }

    /* renamed from: b */
    public ph0 get() {
        return m25758c(this.f19177a.get(), this.f19178b.get(), this.f19179c.get(), this.f19180d.get(), this.f19181e.get());
    }
}

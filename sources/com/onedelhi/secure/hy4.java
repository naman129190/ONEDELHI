package com.onedelhi.secure;

import java.util.concurrent.Executor;

public final class hy4 implements lz0<gy4> {

    /* renamed from: a */
    public final a73<Executor> f13374a;

    /* renamed from: b */
    public final a73<aw0> f13375b;

    /* renamed from: c */
    public final a73<ky4> f13376c;

    /* renamed from: d */
    public final a73<q84> f13377d;

    public hy4(a73<Executor> a73, a73<aw0> a732, a73<ky4> a733, a73<q84> a734) {
        this.f13374a = a73;
        this.f13375b = a732;
        this.f13376c = a733;
        this.f13377d = a734;
    }

    /* renamed from: a */
    public static hy4 m17055a(a73<Executor> a73, a73<aw0> a732, a73<ky4> a733, a73<q84> a734) {
        return new hy4(a73, a732, a733, a734);
    }

    /* renamed from: c */
    public static gy4 m17056c(Executor executor, aw0 aw0, ky4 ky4, q84 q84) {
        return new gy4(executor, aw0, ky4, q84);
    }

    /* renamed from: b */
    public gy4 get() {
        return m17056c(this.f13374a.get(), this.f13375b.get(), this.f13376c.get(), this.f13377d.get());
    }
}

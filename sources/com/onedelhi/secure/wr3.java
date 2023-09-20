package com.onedelhi.secure;

import android.content.Context;

public final class wr3 implements lz0<ky4> {

    /* renamed from: a */
    public final a73<Context> f22260a;

    /* renamed from: b */
    public final a73<aw0> f22261b;

    /* renamed from: c */
    public final a73<pr3> f22262c;

    /* renamed from: d */
    public final a73<C2106ez> f22263d;

    public wr3(a73<Context> a73, a73<aw0> a732, a73<pr3> a733, a73<C2106ez> a734) {
        this.f22260a = a73;
        this.f22261b = a732;
        this.f22262c = a733;
        this.f22263d = a734;
    }

    /* renamed from: a */
    public static wr3 m31035a(a73<Context> a73, a73<aw0> a732, a73<pr3> a733, a73<C2106ez> a734) {
        return new wr3(a73, a732, a733, a734);
    }

    /* renamed from: c */
    public static ky4 m31036c(Context context, aw0 aw0, pr3 pr3, C2106ez ezVar) {
        return (ky4) h43.m16476c(vr3.m30275b(context, aw0, pr3, ezVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public ky4 get() {
        return m31036c(this.f22260a.get(), this.f22261b.get(), this.f22262c.get(), this.f22263d.get());
    }
}

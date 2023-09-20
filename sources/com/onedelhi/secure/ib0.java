package com.onedelhi.secure;

import android.content.Context;

public final class ib0 implements lz0<hb0> {

    /* renamed from: a */
    public final a73<Context> f13557a;

    /* renamed from: b */
    public final a73<C2106ez> f13558b;

    /* renamed from: c */
    public final a73<C2106ez> f13559c;

    public ib0(a73<Context> a73, a73<C2106ez> a732, a73<C2106ez> a733) {
        this.f13557a = a73;
        this.f13558b = a732;
        this.f13559c = a733;
    }

    /* renamed from: a */
    public static ib0 m17369a(a73<Context> a73, a73<C2106ez> a732, a73<C2106ez> a733) {
        return new ib0(a73, a732, a733);
    }

    /* renamed from: c */
    public static hb0 m17370c(Context context, C2106ez ezVar, C2106ez ezVar2) {
        return new hb0(context, ezVar, ezVar2);
    }

    /* renamed from: b */
    public hb0 get() {
        return m17370c(this.f13557a.get(), this.f13558b.get(), this.f13559c.get());
    }
}

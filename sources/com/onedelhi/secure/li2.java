package com.onedelhi.secure;

import android.content.Context;

public final class li2 implements lz0<ki2> {

    /* renamed from: a */
    public final a73<Context> f15414a;

    /* renamed from: b */
    public final a73<hb0> f15415b;

    public li2(a73<Context> a73, a73<hb0> a732) {
        this.f15414a = a73;
        this.f15415b = a732;
    }

    /* renamed from: a */
    public static li2 m20728a(a73<Context> a73, a73<hb0> a732) {
        return new li2(a73, a732);
    }

    /* renamed from: c */
    public static ki2 m20729c(Context context, Object obj) {
        return new ki2(context, (hb0) obj);
    }

    /* renamed from: b */
    public ki2 get() {
        return m20729c(this.f15414a.get(), this.f15415b.get());
    }
}

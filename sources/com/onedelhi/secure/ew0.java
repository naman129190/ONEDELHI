package com.onedelhi.secure;

import android.content.Context;

public final class ew0 implements lz0<String> {

    /* renamed from: a */
    public final a73<Context> f11732a;

    public ew0(a73<Context> a73) {
        this.f11732a = a73;
    }

    /* renamed from: a */
    public static ew0 m14405a(a73<Context> a73) {
        return new ew0(a73);
    }

    /* renamed from: c */
    public static String m14406c(Context context) {
        return (String) h43.m16476c(cw0.m12773d(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return m14406c(this.f11732a.get());
    }
}

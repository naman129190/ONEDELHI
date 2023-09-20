package com.onedelhi.secure;

import android.content.Context;

public final class fs3 implements lz0<es3> {

    /* renamed from: a */
    public final a73<Context> f12310a;

    /* renamed from: b */
    public final a73<String> f12311b;

    /* renamed from: c */
    public final a73<Integer> f12312c;

    public fs3(a73<Context> a73, a73<String> a732, a73<Integer> a733) {
        this.f12310a = a73;
        this.f12311b = a732;
        this.f12312c = a733;
    }

    /* renamed from: a */
    public static fs3 m15280a(a73<Context> a73, a73<String> a732, a73<Integer> a733) {
        return new fs3(a73, a732, a733);
    }

    /* renamed from: c */
    public static es3 m15281c(Context context, String str, int i) {
        return new es3(context, str, i);
    }

    /* renamed from: b */
    public es3 get() {
        return m15281c(this.f12310a.get(), this.f12311b.get(), this.f12312c.get().intValue());
    }
}

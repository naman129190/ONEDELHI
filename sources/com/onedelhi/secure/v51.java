package com.onedelhi.secure;

import com.google.firebase.perf.config.C4336a;

public final class v51 implements kz0<C4336a> {

    /* renamed from: a */
    public final u51 f36435a;

    public v51(u51 u51) {
        this.f36435a = u51;
    }

    /* renamed from: a */
    public static v51 m67733a(u51 u51) {
        return new v51(u51);
    }

    /* renamed from: c */
    public static C4336a m67734c(u51 u51) {
        return (C4336a) j43.m52915c(u51.mo45394a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C4336a get() {
        return m67734c(this.f36435a);
    }
}

package com.onedelhi.secure;

import com.google.firebase.perf.config.RemoteConfigManager;

public final class z51 implements kz0<RemoteConfigManager> {

    /* renamed from: a */
    public final u51 f38220a;

    public z51(u51 u51) {
        this.f38220a = u51;
    }

    /* renamed from: a */
    public static z51 m72550a(u51 u51) {
        return new z51(u51);
    }

    /* renamed from: c */
    public static RemoteConfigManager m72551c(u51 u51) {
        return (RemoteConfigManager) j43.m52915c(u51.mo45398e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public RemoteConfigManager get() {
        return m72551c(this.f38220a);
    }
}

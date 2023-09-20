package com.onedelhi.secure;

import com.google.firebase.perf.session.SessionManager;

public final class a61 implements kz0<SessionManager> {

    /* renamed from: a */
    public final u51 f25765a;

    public a61(u51 u51) {
        this.f25765a = u51;
    }

    /* renamed from: a */
    public static a61 m36080a(u51 u51) {
        return new a61(u51);
    }

    /* renamed from: c */
    public static SessionManager m36081c(u51 u51) {
        return (SessionManager) j43.m52915c(u51.mo45399f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public SessionManager get() {
        return m36081c(this.f25765a);
    }
}

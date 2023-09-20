package com.onedelhi.secure;

import java.util.concurrent.Executor;

public final class ww0 implements lz0<Executor> {

    /* renamed from: com.onedelhi.secure.ww0$a */
    public static final class C3878a {

        /* renamed from: a */
        public static final ww0 f22349a = new ww0();
    }

    /* renamed from: a */
    public static ww0 m31153a() {
        return C3878a.f22349a;
    }

    /* renamed from: b */
    public static Executor m31154b() {
        return (Executor) h43.m16476c(vw0.m30526a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return m31154b();
    }
}

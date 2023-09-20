package com.onedelhi.secure;

public final class jy6 implements iy6 {

    /* renamed from: a */
    public static final ei6 f14663a;

    /* renamed from: b */
    public static final ei6 f14664b;

    /* renamed from: c */
    public static final ei6 f14665c;

    static {
        dh6 a = new dh6(gg6.m15836a("com.google.android.gms.measurement")).mo14667a();
        f14663a = a.mo14670d("measurement.id.lifecycle.app_in_background_parameter", 0);
        f14664b = a.mo14672f("measurement.lifecycle.app_backgrounded_tracking", true);
        f14665c = a.mo14672f("measurement.lifecycle.app_in_background_parameter", false);
    }

    /* renamed from: a */
    public final boolean mo18067a() {
        return ((Boolean) f14665c.mo15196b()).booleanValue();
    }
}

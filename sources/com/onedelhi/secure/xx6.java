package com.onedelhi.secure;

public final class xx6 implements wx6 {

    /* renamed from: a */
    public static final ei6 f22803a;

    /* renamed from: b */
    public static final ei6 f22804b;

    /* renamed from: c */
    public static final ei6 f22805c;

    /* renamed from: d */
    public static final ei6 f22806d;

    static {
        dh6 a = new dh6(gg6.m15836a("com.google.android.gms.measurement")).mo14668b().mo14667a();
        f22803a = a.mo14672f("measurement.client.global_params", true);
        f22804b = a.mo14672f("measurement.service.global_params_in_payload", true);
        f22805c = a.mo14672f("measurement.service.clear_global_params_on_uninstall", true);
        f22806d = a.mo14672f("measurement.service.global_params", true);
    }

    /* renamed from: a */
    public final boolean mo26716a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo26717b() {
        return ((Boolean) f22805c.mo15196b()).booleanValue();
    }
}

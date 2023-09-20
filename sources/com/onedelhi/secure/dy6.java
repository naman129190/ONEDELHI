package com.onedelhi.secure;

public final class dy6 implements cy6 {

    /* renamed from: a */
    public static final ei6 f11004a;

    /* renamed from: b */
    public static final ei6 f11005b;

    static {
        dh6 a = new dh6(gg6.m15836a("com.google.android.gms.measurement")).mo14668b().mo14667a();
        f11004a = a.mo14672f("measurement.item_scoped_custom_parameters.client", true);
        f11005b = a.mo14672f("measurement.item_scoped_custom_parameters.service", false);
    }

    /* renamed from: a */
    public final boolean mo14432a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo14433b() {
        return ((Boolean) f11004a.mo15196b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo14434c() {
        return ((Boolean) f11005b.mo15196b()).booleanValue();
    }
}

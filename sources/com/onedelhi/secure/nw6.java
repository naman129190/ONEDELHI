package com.onedelhi.secure;

public final class nw6 implements mw6 {

    /* renamed from: a */
    public static final ei6 f17614a;

    /* renamed from: b */
    public static final ei6 f17615b;

    /* renamed from: c */
    public static final ei6 f17616c;

    static {
        dh6 a = new dh6(gg6.m15836a("com.google.android.gms.measurement")).mo14668b().mo14667a();
        f17614a = a.mo14672f("measurement.collection.event_safelist", true);
        f17615b = a.mo14672f("measurement.service.store_null_safelist", true);
        f17616c = a.mo14672f("measurement.service.store_safelist", true);
    }

    /* renamed from: a */
    public final boolean mo20686a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo20687b() {
        return ((Boolean) f17615b.mo15196b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo20688c() {
        return ((Boolean) f17616c.mo15196b()).booleanValue();
    }
}

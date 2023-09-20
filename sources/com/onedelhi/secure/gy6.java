package com.onedelhi.secure;

public final class gy6 implements fy6 {

    /* renamed from: a */
    public static final ei6 f12825a;

    /* renamed from: b */
    public static final ei6 f12826b;

    /* renamed from: c */
    public static final ei6 f12827c;

    /* renamed from: d */
    public static final ei6 f12828d;

    static {
        dh6 a = new dh6(gg6.m15836a("com.google.android.gms.measurement")).mo14667a();
        f12825a = a.mo14672f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f12826b = a.mo14672f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f12827c = a.mo14672f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f12828d = a.mo14670d("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    /* renamed from: a */
    public final boolean mo16238a() {
        return ((Boolean) f12827c.mo15196b()).booleanValue();
    }
}

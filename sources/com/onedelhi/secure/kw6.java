package com.onedelhi.secure;

public final class kw6 implements jw6 {

    /* renamed from: a */
    public static final ei6 f15099a;

    /* renamed from: b */
    public static final ei6 f15100b;

    /* renamed from: c */
    public static final ei6 f15101c;

    /* renamed from: d */
    public static final ei6 f15102d;

    static {
        dh6 a = new dh6(gg6.m15836a("com.google.android.gms.measurement")).mo14667a();
        f15099a = a.mo14672f("measurement.client.consent_state_v1", true);
        f15100b = a.mo14672f("measurement.client.3p_consent_state_v1", true);
        f15101c = a.mo14672f("measurement.service.consent_state_v1_W36", true);
        f15102d = a.mo14670d("measurement.service.storage_consent_support_version", 203600);
    }

    /* renamed from: b */
    public final long mo18699b() {
        return ((Long) f15102d.mo15196b()).longValue();
    }
}

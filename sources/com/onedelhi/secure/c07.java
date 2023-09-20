package com.onedelhi.secure;

public final class c07 implements b07 {

    /* renamed from: a */
    public static final ei6 f10060a;

    /* renamed from: b */
    public static final ei6 f10061b;

    /* renamed from: c */
    public static final ei6 f10062c;

    /* renamed from: d */
    public static final ei6 f10063d;

    /* renamed from: e */
    public static final ei6 f10064e;

    static {
        dh6 a = new dh6(gg6.m15836a("com.google.android.gms.measurement")).mo14668b().mo14667a();
        f10060a = a.mo14672f("measurement.client.sessions.background_sessions_enabled", true);
        f10061b = a.mo14672f("measurement.client.sessions.enable_fix_background_engagement", false);
        f10062c = a.mo14672f("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f10063d = a.mo14672f("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f10064e = a.mo14672f("measurement.client.sessions.session_id_enabled", true);
    }

    /* renamed from: a */
    public final boolean mo13370a() {
        return ((Boolean) f10061b.mo15196b()).booleanValue();
    }
}

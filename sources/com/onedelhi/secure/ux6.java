package com.onedelhi.secure;

public final class ux6 implements tx6 {

    /* renamed from: a */
    public static final ei6 f21550a;

    /* renamed from: b */
    public static final ei6 f21551b;

    /* renamed from: c */
    public static final ei6 f21552c;

    static {
        dh6 a = new dh6(gg6.m15836a("com.google.android.gms.measurement")).mo14667a();
        f21550a = a.mo14672f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f21551b = a.mo14672f("measurement.client.sessions.check_on_startup", true);
        f21552c = a.mo14672f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    /* renamed from: a */
    public final boolean mo25337a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo25338b() {
        return ((Boolean) f21550a.mo15196b()).booleanValue();
    }
}

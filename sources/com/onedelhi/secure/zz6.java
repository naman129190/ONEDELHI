package com.onedelhi.secure;

public final class zz6 implements yz6 {

    /* renamed from: a */
    public static final ei6 f24012a;

    /* renamed from: b */
    public static final ei6 f24013b;

    /* renamed from: c */
    public static final ei6 f24014c;

    static {
        dh6 a = new dh6(gg6.m15836a("com.google.android.gms.measurement")).mo14668b().mo14667a();
        f24012a = a.mo14672f("measurement.collection.enable_session_stitching_token.client.dev", true);
        f24013b = a.mo14672f("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f24014c = a.mo14672f("measurement.session_stitching_token_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo27743a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo27744b() {
        return ((Boolean) f24012a.mo15196b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo27745c() {
        return ((Boolean) f24013b.mo15196b()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo27746s() {
        return ((Boolean) f24014c.mo15196b()).booleanValue();
    }
}

package com.onedelhi.secure;

import android.util.Base64;

public final class xg6 implements rg6 {

    /* renamed from: a */
    public static final iy5 f22555a;

    /* renamed from: b */
    public static final iy5 f22556b;

    /* renamed from: c */
    public static final iy5 f22557c;

    /* renamed from: d */
    public static final iy5 f22558d;

    /* renamed from: e */
    public static final iy5 f22559e;

    /* renamed from: f */
    public static final iy5 f22560f;

    /* renamed from: g */
    public static final iy5 f22561g;

    /* renamed from: h */
    public static final iy5 f22562h;

    /* renamed from: i */
    public static final iy5 f22563i;

    /* renamed from: j */
    public static final iy5 f22564j;

    /* renamed from: k */
    public static final iy5 f22565k;

    /* renamed from: l */
    public static final iy5 f22566l;

    /* renamed from: m */
    public static final iy5 f22567m;

    /* renamed from: n */
    public static final iy5 f22568n;

    static {
        tw5 a = new tw5(nv5.m23202a("com.google.android.gms.auth_account")).mo25325b().mo25324a();
        f22555a = a.mo25326c("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        f22556b = a.mo25328e("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        f22557c = a.mo25327d("getTokenRefactor__account_manager_timeout_seconds", 20);
        f22558d = a.mo25327d("getTokenRefactor__android_id_shift", 0);
        f22559e = a.mo25328e("getTokenRefactor__authenticator_logic_improved", false);
        try {
            f22560f = a.mo25329f("getTokenRefactor__blocked_packages", lg6.m20662l(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), ug6.f21375a);
            f22561g = a.mo25328e("getTokenRefactor__chimera_get_token_evolved", true);
            f22562h = a.mo25327d("getTokenRefactor__clear_token_timeout_seconds", 20);
            f22563i = a.mo25327d("getTokenRefactor__default_task_timeout_seconds", 20);
            f22564j = a.mo25328e("getTokenRefactor__gaul_accounts_api_evolved", false);
            f22565k = a.mo25328e("getTokenRefactor__gaul_token_api_evolved", false);
            f22566l = a.mo25327d("getTokenRefactor__get_token_timeout_seconds", 120);
            f22567m = a.mo25328e("getTokenRefactor__gms_account_authenticator_evolved", true);
            f22568n = a.mo25326c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final lg6 mo23866a() {
        return (lg6) f22560f.mo18065b();
    }

    /* renamed from: b */
    public final boolean mo23867b() {
        return ((Boolean) f22564j.mo18065b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo23868c() {
        return ((Boolean) f22565k.mo18065b()).booleanValue();
    }
}

package com.onedelhi.secure;

import com.google.android.gms.common.Feature;

public final class v65 {

    /* renamed from: a */
    public static final Feature f21677a;

    /* renamed from: a */
    public static final Feature[] f21678a;

    /* renamed from: b */
    public static final Feature f21679b;

    /* renamed from: c */
    public static final Feature f21680c;

    /* renamed from: d */
    public static final Feature f21681d;

    /* renamed from: e */
    public static final Feature f21682e;

    /* renamed from: f */
    public static final Feature f21683f;

    /* renamed from: g */
    public static final Feature f21684g;

    /* renamed from: h */
    public static final Feature f21685h;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 8);
        f21677a = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2);
        f21679b = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1);
        f21680c = feature3;
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1);
        f21681d = feature4;
        Feature feature5 = new Feature("auth_api_credentials_save_password", 4);
        f21682e = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 6);
        f21683f = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 3);
        f21684g = feature7;
        Feature feature8 = new Feature("auth_api_credentials_get_phone_number_hint_intent", 3);
        f21685h = feature8;
        f21678a = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}

package com.onedelhi.secure;

import com.google.android.gms.common.Feature;

public final class ic5 {

    /* renamed from: a */
    public static final Feature f13580a;

    /* renamed from: a */
    public static final Feature[] f13581a;

    /* renamed from: b */
    public static final Feature f13582b;

    /* renamed from: c */
    public static final Feature f13583c;

    /* renamed from: d */
    public static final Feature f13584d;

    static {
        Feature feature = new Feature("sms_code_autofill", 2);
        f13580a = feature;
        Feature feature2 = new Feature("sms_code_browser", 2);
        f13582b = feature2;
        Feature feature3 = new Feature("sms_retrieve", 1);
        f13583c = feature3;
        Feature feature4 = new Feature("user_consent", 3);
        f13584d = feature4;
        f13581a = new Feature[]{feature, feature2, feature3, feature4};
    }
}

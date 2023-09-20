package com.onedelhi.secure;

import android.content.Context;

public class xd0 {

    /* renamed from: a */
    public static final ya0 f37381a = new ya0();

    /* renamed from: a */
    public static final String f37382a = m70140e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: b */
    public static final wg4<pa0, byte[]> f37383b = wd0.f36947a;

    /* renamed from: b */
    public static final String f37384b = m70140e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: c */
    public static final String f37385c = "FIREBASE_CRASHLYTICS_REPORT";

    /* renamed from: a */
    public final ri3 f37386a;

    /* renamed from: a */
    public final wg4<pa0, byte[]> f37387a;

    public xd0(ri3 ri3, wg4<pa0, byte[]> wg4) {
        this.f37386a = ri3;
        this.f37387a = wg4;
    }

    /* renamed from: b */
    public static xd0 m70138b(Context context, mw3 mw3, tu2 tu2) {
        ni4.m22861f(context);
        hu0 b = hu0.m16939b("json");
        wg4<pa0, byte[]> wg4 = f37383b;
        return new xd0(new ri3(ni4.m22859c().mo21298g(new C3002nr(f37382a, f37384b)).mo27493a(f37385c, pa0.class, b, wg4), mw3.mo40840a(), tu2), wg4);
    }

    /* renamed from: e */
    public static String m70140e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    @mr2
    /* renamed from: c */
    public w94<eb0> mo47127c(@mr2 eb0 eb0, boolean z) {
        return this.f37386a.mo43906i(eb0, z).mo26835a();
    }
}

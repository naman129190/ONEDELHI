package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;

public class n11 {
    @mr2

    /* renamed from: a */
    public static final Api.ClientKey f16974a;
    @mr2

    /* renamed from: a */
    public static final Api f16975a;

    /* renamed from: a */
    public static final jb5 f16976a = new jb5();
    @mr2

    /* renamed from: a */
    public static final String f16977a = "RESPONSE_EXTRA";
    @mr2
    @Deprecated

    /* renamed from: b */
    public static final String f16978b = "FIDO2_RESPONSE_EXTRA";
    @mr2
    @Deprecated

    /* renamed from: c */
    public static final String f16979c = "FIDO2_ERROR_EXTRA";
    @mr2

    /* renamed from: d */
    public static final String f16980d = "FIDO2_CREDENTIAL_EXTRA";

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f16974a = clientKey;
        f16975a = new Api("Fido.U2F_ZERO_PARTY_API", new wb5(), clientKey);
    }

    @mr2
    /* renamed from: a */
    public static k11 m22264a(@mr2 Activity activity) {
        return new k11(activity);
    }

    @mr2
    /* renamed from: b */
    public static k11 m22265b(@mr2 Context context) {
        return new k11(context);
    }

    @mr2
    /* renamed from: c */
    public static m11 m22266c(@mr2 Activity activity) {
        return new m11(activity);
    }

    @mr2
    /* renamed from: d */
    public static m11 m22267d(@mr2 Context context) {
        return new m11(context);
    }

    @mr2
    /* renamed from: e */
    public static uk4 m22268e(@mr2 Activity activity) {
        return new uk4(activity);
    }

    @mr2
    /* renamed from: f */
    public static uk4 m22269f(@mr2 Context context) {
        return new uk4(context);
    }
}

package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;

public class by4 {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder f10024a;

    /* renamed from: a */
    public static final Api.ClientKey f10025a;
    @mr2

    /* renamed from: a */
    public static final Api<Api.ApiOptions.NoOptions> f10026a;
    @mr2
    @Deprecated

    /* renamed from: a */
    public static final cy4 f10027a = new fg5();

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f10025a = clientKey;
        e66 e66 = new e66();
        f10024a = e66;
        f10026a = new Api<>("WorkAccount.API", e66, clientKey);
    }

    @mr2
    /* renamed from: a */
    public static dy4 m12144a(@mr2 Activity activity) {
        return new dy4(activity);
    }

    @mr2
    /* renamed from: b */
    public static dy4 m12145b(@mr2 Context context) {
        return new dy4(context);
    }
}

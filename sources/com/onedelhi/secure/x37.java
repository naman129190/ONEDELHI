package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;

public final class x37 extends GoogleApi<Api.ApiOptions.NoOptions> implements k04 {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder<m47, Api.ApiOptions.NoOptions> f22407a;

    /* renamed from: a */
    public static final Api.ClientKey<m47> f22408a;

    /* renamed from: a */
    public static final Api<Api.ApiOptions.NoOptions> f22409a;

    static {
        Api.ClientKey<m47> clientKey = new Api.ClientKey<>();
        f22408a = clientKey;
        p27 p27 = new p27();
        f22407a = p27;
        f22409a = new Api<>("SmsCodeBrowser.API", p27, clientKey);
    }

    public x37(Activity activity) {
        super(activity, f22409a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public x37(Context context) {
        super(context, f22409a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* renamed from: a */
    public final w94<Void> mo18835a() {
        return doWrite(TaskApiCall.builder().setFeatures(ic5.f13582b).run(new y17(this)).setMethodKey(1566).build());
    }
}

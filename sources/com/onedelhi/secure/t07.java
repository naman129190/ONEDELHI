package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;

public final class t07 extends GoogleApi<Api.ApiOptions.NoOptions> implements j04 {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder<m47, Api.ApiOptions.NoOptions> f20621a;

    /* renamed from: a */
    public static final Api.ClientKey<m47> f20622a;

    /* renamed from: a */
    public static final Api<Api.ApiOptions.NoOptions> f20623a;

    static {
        Api.ClientKey<m47> clientKey = new Api.ClientKey<>();
        f20622a = clientKey;
        au6 au6 = new au6();
        f20621a = au6;
        f20623a = new Api<>("SmsCodeAutofill.API", au6, clientKey);
    }

    public t07(Activity activity) {
        super(activity, f20623a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public t07(Context context) {
        super(context, f20623a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* renamed from: a */
    public final w94<Void> mo18071a() {
        return doWrite(TaskApiCall.builder().setFeatures(ic5.f13580a).run(new cq6(this)).setMethodKey(1563).build());
    }

    /* renamed from: b */
    public final w94<Integer> mo18072b() {
        return doRead(TaskApiCall.builder().setFeatures(ic5.f13580a).run(new jn6(this)).setMethodKey(1564).build());
    }

    /* renamed from: j */
    public final w94<Boolean> mo18073j(String str) {
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(TaskApiCall.builder().setFeatures(ic5.f13580a).run(new js6(this, str)).setMethodKey(1565).build());
    }
}

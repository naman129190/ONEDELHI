package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

public abstract class o04 extends GoogleApi<Api.ApiOptions.NoOptions> implements n04 {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder<m47, Api.ApiOptions.NoOptions> f17635a;

    /* renamed from: a */
    public static final Api.ClientKey<m47> f17636a;

    /* renamed from: a */
    public static final Api<Api.ApiOptions.NoOptions> f17637a;

    static {
        Api.ClientKey<m47> clientKey = new Api.ClientKey<>();
        f17636a = clientKey;
        ta5 ta5 = new ta5();
        f17635a = ta5;
        f17637a = new Api<>("SmsRetriever.API", ta5, clientKey);
    }

    public o04(@mr2 Activity activity) {
        super(activity, f17637a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public o04(@mr2 Context context) {
        super(context, f17637a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @mr2
    /* renamed from: e */
    public abstract w94<Void> mo20828e(@ts2 String str);

    @mr2
    /* renamed from: u */
    public abstract w94<Void> mo20829u();
}

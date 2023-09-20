package com.onedelhi.secure;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.PendingResultUtil;

public class dy4 extends GoogleApi<Api.ApiOptions.NoOptions> {

    /* renamed from: a */
    public final cy4 f11002a = new fg5();

    public dy4(@mr2 Activity activity) {
        super(activity, by4.f10026a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public dy4(@mr2 Context context) {
        super(context, by4.f10026a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @mr2
    /* renamed from: V */
    public w94<Account> mo14946V(@mr2 String str) {
        return PendingResultUtil.toTask(this.f11002a.mo14430d(asGoogleApiClient(), str), new ca6(this));
    }

    @mr2
    /* renamed from: W */
    public w94<Void> mo14947W(@mr2 Account account) {
        return PendingResultUtil.toVoidTask(this.f11002a.mo14429c(asGoogleApiClient(), account));
    }

    @mr2
    /* renamed from: X */
    public w94<Void> mo14948X(boolean z) {
        return PendingResultUtil.toVoidTask(this.f11002a.mo14427a(asGoogleApiClient(), z));
    }
}

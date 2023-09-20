package com.onedelhi.secure;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;

public final class tb5 extends GoogleApi implements ma6 {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder f20736a;

    /* renamed from: a */
    public static final Api.ClientKey f20737a;

    /* renamed from: a */
    public static final Api f20738a;

    /* renamed from: a */
    public static final Logger f20739a = wx5.m31172a("GoogleAuthServiceClient");

    /* renamed from: a */
    public final Context f20740a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f20737a = clientKey;
        w37 w37 = new w37();
        f20736a = w37;
        f20738a = new Api("GoogleAuthService.API", w37, clientKey);
    }

    public tb5(@mr2 Context context) {
        super(context, f20738a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f20740a = context;
    }

    /* renamed from: V */
    public static /* bridge */ /* synthetic */ void m28308V(Status status, Object obj, x94 x94) {
        if (!TaskUtil.trySetResultOrApiException(status, obj, x94)) {
            f20739a.mo10174w("The task is already complete.", new Object[0]);
        }
    }

    /* renamed from: S */
    public final w94 mo20236S(@mr2 Account account) {
        Preconditions.checkNotNull(account, "account cannot be null.");
        return doWrite(TaskApiCall.builder().setFeatures(t26.f20641i).run(new s07(this, account)).setMethodKey(1517).build());
    }

    /* renamed from: c */
    public final w94 mo20237c(@mr2 Account account, @mr2 String str, Bundle bundle) {
        Preconditions.checkNotNull(account, "Account name cannot be null!");
        Preconditions.checkNotEmpty(str, "Scope cannot be null!");
        return doWrite(TaskApiCall.builder().setFeatures(t26.f20642j).run(new x17(this, account, str, bundle)).setMethodKey(1512).build());
    }

    /* renamed from: f */
    public final w94 mo20238f(zq5 zq5) {
        return doWrite(TaskApiCall.builder().setFeatures(t26.f20642j).run(new o27(this, zq5)).setMethodKey(1513).build());
    }

    /* renamed from: i */
    public final w94 mo20239i(@mr2 String str) {
        Preconditions.checkNotNull(str, "Client package name cannot be null!");
        return doWrite(TaskApiCall.builder().setFeatures(t26.f20641i).run(new az6(this, str)).setMethodKey(1514).build());
    }

    /* renamed from: m */
    public final w94 mo20240m(@mr2 C2393i2 i2Var) {
        Preconditions.checkNotNull(i2Var, "request cannot be null.");
        return doWrite(TaskApiCall.builder().setFeatures(t26.f20641i).run(new f37(this, i2Var)).setMethodKey(1515).build());
    }
}

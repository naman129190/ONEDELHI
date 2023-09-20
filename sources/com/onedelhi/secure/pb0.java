package com.onedelhi.secure;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.credentials.C1403a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.onedelhi.secure.C2326hc;

@Deprecated
public class pb0 extends GoogleApi<C2326hc.C2327a> {
    public pb0(@mr2 Activity activity, @mr2 C2326hc.C2327a aVar) {
        super(activity, C2326hc.f13039b, aVar, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    public pb0(@mr2 Context context, @mr2 C2326hc.C2327a aVar) {
        super(context, C2326hc.f13039b, aVar, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }

    @mr2
    @Deprecated
    /* renamed from: V */
    public w94<Void> mo22366V(@mr2 Credential credential) {
        return PendingResultUtil.toVoidTask(C2326hc.f13035a.mo15899e(asGoogleApiClient(), credential));
    }

    @mr2
    @Deprecated
    /* renamed from: W */
    public w94<Void> mo22367W() {
        return PendingResultUtil.toVoidTask(C2326hc.f13035a.mo15895a(asGoogleApiClient()));
    }

    @mr2
    @Deprecated
    /* renamed from: X */
    public PendingIntent mo22368X(@mr2 HintRequest hintRequest) {
        return l85.m20321a(getApplicationContext(), (C2326hc.C2327a) getApiOptions(), hintRequest, ((C2326hc.C2327a) getApiOptions()).mo17184d());
    }

    @mr2
    @Deprecated
    /* renamed from: Y */
    public w94<kb0> mo22369Y(@mr2 C1403a aVar) {
        return PendingResultUtil.toResponseTask(C2326hc.f13035a.mo15898d(asGoogleApiClient(), aVar), new kb0());
    }

    @mr2
    @Deprecated
    /* renamed from: Z */
    public w94<Void> mo22370Z(@mr2 Credential credential) {
        return PendingResultUtil.toVoidTask(C2326hc.f13035a.mo15896b(asGoogleApiClient(), credential));
    }
}

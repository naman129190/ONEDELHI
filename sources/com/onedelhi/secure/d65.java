package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.onedelhi.secure.sq3;

public final class d65 extends GoogleApi implements mb0 {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder f10643a;

    /* renamed from: a */
    public static final Api.ClientKey f10644a;

    /* renamed from: a */
    public static final Api f10645a;

    /* renamed from: c */
    public final String f10646c = w65.m30705a();

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f10644a = clientKey;
        a65 a65 = new a65();
        f10643a = a65;
        f10645a = new Api("Auth.Api.Identity.CredentialSaving.API", a65, clientKey);
    }

    public d65(@mr2 Activity activity, @mr2 y65 y65) {
        super(activity, f10645a, y65, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public d65(@mr2 Context context, @mr2 y65 y65) {
        super(context, f10645a, y65, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* renamed from: C */
    public final w94<rq3> mo14537C(@mr2 SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Preconditions.checkNotNull(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.C1405a P2 = SaveAccountLinkingTokenRequest.m8775P2(saveAccountLinkingTokenRequest);
        P2.mo9199f(this.f10646c);
        SaveAccountLinkingTokenRequest a = P2.mo9194a();
        return doRead(TaskApiCall.builder().setFeatures(v65.f21684g).run(new y55(this, a)).setAutoResolveMissingFeatures(false).setMethodKey(1535).build());
    }

    /* renamed from: k */
    public final Status mo14538k(@ts2 Intent intent) {
        if (intent == null) {
            return Status.RESULT_INTERNAL_ERROR;
        }
        Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", Status.CREATOR);
        return status == null ? Status.RESULT_INTERNAL_ERROR : status;
    }

    /* renamed from: l */
    public final w94<tq3> mo14539l(@mr2 sq3 sq3) {
        Preconditions.checkNotNull(sq3);
        sq3.C3534a M2 = sq3.m27786M2(sq3);
        M2.mo24512c(this.f10646c);
        sq3 a = M2.mo24510a();
        return doRead(TaskApiCall.builder().setFeatures(v65.f21682e).run(new z55(this, a)).setAutoResolveMissingFeatures(false).setMethodKey(1536).build());
    }
}

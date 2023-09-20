package com.onedelhi.secure;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.onedelhi.secure.C2635kk;
import com.onedelhi.secure.gg1;

public final class n65 extends GoogleApi implements oy3 {

    /* renamed from: a */
    public static final Api.AbstractClientBuilder f17195a;

    /* renamed from: a */
    public static final Api.ClientKey f17196a;

    /* renamed from: a */
    public static final Api f17197a;

    /* renamed from: c */
    public final String f17198c = w65.m30705a();

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f17196a = clientKey;
        i65 i65 = new i65();
        f17195a = i65;
        f17197a = new Api("Auth.Api.Identity.SignIn.API", i65, clientKey);
    }

    public n65(@mr2 Activity activity, @mr2 s85 s85) {
        super(activity, f17197a, s85, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public n65(@mr2 Context context, @mr2 s85 s85) {
        super(context, f17197a, s85, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* renamed from: I */
    public final qy3 mo20967I(@ts2 Intent intent) throws ApiException {
        if (intent != null) {
            Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", Status.CREATOR);
            if (status == null) {
                throw new ApiException(Status.RESULT_CANCELED);
            } else if (status.isSuccess()) {
                qy3 qy3 = (qy3) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "sign_in_credential", qy3.CREATOR);
                if (qy3 != null) {
                    return qy3;
                }
                throw new ApiException(Status.RESULT_INTERNAL_ERROR);
            } else {
                throw new ApiException(status);
            }
        } else {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
    }

    /* renamed from: O */
    public final w94<PendingIntent> mo20968O(@mr2 gg1 gg1) {
        Preconditions.checkNotNull(gg1);
        gg1.C2245a P2 = gg1.m15817P2(gg1);
        P2.mo16566f(this.f17198c);
        gg1 a = P2.mo16561a();
        return doRead(TaskApiCall.builder().setFeatures(v65.f21683f).run(new f65(this, a)).setMethodKey(1555).build());
    }

    /* renamed from: T */
    public final w94<C2767lk> mo20969T(@mr2 C2635kk kkVar) {
        Preconditions.checkNotNull(kkVar);
        C2635kk.C2636a Q2 = C2635kk.m19826Q2(kkVar);
        Q2.mo19103g(this.f17198c);
        C2635kk a = Q2.mo19097a();
        return doRead(TaskApiCall.builder().setFeatures(v65.f21677a).run(new e65(this, a)).setAutoResolveMissingFeatures(false).setMethodKey(1553).build());
    }

    /* renamed from: V */
    public final /* synthetic */ void mo20970V(eg1 eg1, o65 o65, x94 x94) throws RemoteException {
        ((x55) o65.getService()).mo26793m8(new m65(this, x94), eg1, this.f17198c);
    }

    /* renamed from: W */
    public final /* synthetic */ void mo20971W(o65 o65, x94 x94) throws RemoteException {
        ((x55) o65.getService()).mo26795o8(new k65(this, x94), this.f17198c);
    }

    /* renamed from: h */
    public final w94<Void> mo20972h() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        for (GoogleApiClient maybeSignOut : GoogleApiClient.getAllClients()) {
            maybeSignOut.maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
        return doWrite(TaskApiCall.builder().setFeatures(v65.f21679b).run(new g65(this)).setAutoResolveMissingFeatures(false).setMethodKey(1554).build());
    }

    /* renamed from: x */
    public final w94<PendingIntent> mo20973x(@mr2 eg1 eg1) {
        Preconditions.checkNotNull(eg1);
        return doRead(TaskApiCall.builder().setFeatures(v65.f21685h).run(new h65(this, eg1)).setMethodKey(1653).build());
    }

    /* renamed from: y */
    public final String mo20974y(@ts2 Intent intent) throws ApiException {
        if (intent != null) {
            Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", Status.CREATOR);
            if (status == null) {
                throw new ApiException(Status.RESULT_CANCELED);
            } else if (status.isSuccess()) {
                String stringExtra = intent.getStringExtra("phone_number_hint_result");
                if (stringExtra != null) {
                    return stringExtra;
                }
                throw new ApiException(Status.RESULT_INTERNAL_ERROR);
            } else {
                throw new ApiException(status);
            }
        } else {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
    }
}

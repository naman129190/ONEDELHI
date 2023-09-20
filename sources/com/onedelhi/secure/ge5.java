package com.onedelhi.secure;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;

public final class ge5 extends GoogleApi implements C2211g3 {

    /* renamed from: a */
    public static final Api.ClientKey f12544a;

    /* renamed from: a */
    public static final Api f12545a;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f12544a = clientKey;
        f12545a = new Api("ActivityRecognition.API", new xc5(), clientKey);
    }

    public ge5(Activity activity) {
        super(activity, f12545a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public ge5(Context context) {
        super(context, f12545a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* renamed from: o */
    public final w94<Void> mo16282o(long j, PendingIntent pendingIntent) {
        fa5 fa5 = new fa5();
        fa5.mo15908a(j);
        jl5 b = fa5.mo15909b();
        b.mo18472K2(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new j67(b, pendingIntent)).setMethodKey(2401).build());
    }

    /* renamed from: p */
    public final w94<Void> mo16283p(PendingIntent pendingIntent, b04 b04) {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        return doRead(TaskApiCall.builder().run(new lc5(this, pendingIntent, b04)).setFeatures(xr6.f22719b).setMethodKey(2410).build());
    }

    /* renamed from: q */
    public final w94<Void> mo16284q(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new f57(pendingIntent)).setMethodKey(2406).build());
    }

    /* renamed from: s */
    public final w94<Void> mo16285s(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new v57(pendingIntent)).setMethodKey(2402).build());
    }

    /* renamed from: w */
    public final w94<Void> mo16286w(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new xb5(pendingIntent)).setMethodKey(2411).build());
    }

    /* renamed from: z */
    public final w94<Void> mo16287z(C3354r3 r3Var, PendingIntent pendingIntent) {
        r3Var.mo23558L2(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new kb5(r3Var, pendingIntent)).setMethodKey(2405).build());
    }
}

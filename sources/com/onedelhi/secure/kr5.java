package com.onedelhi.secure;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import java.util.List;

public final class kr5 extends GoogleApi implements vf1 {

    /* renamed from: a */
    public static final /* synthetic */ int f15051a = 0;

    public kr5(@mr2 Activity activity) {
        super(activity, mp5.f16269a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public kr5(@mr2 Context context) {
        super(context, mp5.f16269a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* renamed from: D */
    public final w94<Void> mo19178D(List<String> list) {
        return doWrite(TaskApiCall.builder().run(new ar5(list)).setMethodKey(2425).build());
    }

    /* renamed from: J */
    public final w94<Void> mo19179J(xf1 xf1, PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new vq5(xf1.mo26911M2(getContextAttributionTag()), pendingIntent)).setMethodKey(2424).build());
    }

    /* renamed from: L */
    public final w94<Void> mo19180L(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new fr5(pendingIntent)).setMethodKey(2425).build());
    }
}

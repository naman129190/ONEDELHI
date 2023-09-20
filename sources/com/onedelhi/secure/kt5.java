package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;

public final class kt5 extends GoogleApi implements xv3 {

    /* renamed from: a */
    public static final /* synthetic */ int f15075a = 0;

    public kt5(@mr2 Activity activity) {
        super(activity, mp5.f16269a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public kt5(@mr2 Context context) {
        super(context, mp5.f16269a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* renamed from: v */
    public final w94<d82> mo19192v(c82 c82) {
        return doRead(TaskApiCall.builder().run(new gt5(c82)).setMethodKey(2426).build());
    }
}

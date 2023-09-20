package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;

public final class lp5 extends GoogleApi implements i73 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lp5(@mr2 Activity activity, @ts2 C2959nc ncVar) {
        super(activity, C2854mc.f16062a, ncVar == null ? C2959nc.f17298a : ncVar, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lp5(@mr2 Context context, @ts2 C2959nc ncVar) {
        super(context, C2854mc.f16062a, ncVar == null ? C2959nc.f17298a : ncVar, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* renamed from: E */
    public final w94<o73> mo17659E(@mr2 n73 n73) {
        return doWrite(TaskApiCall.builder().run(new wo5(this, n73)).setMethodKey(1518).build());
    }

    /* renamed from: G */
    public final w94<String> mo17660G() {
        return doRead(TaskApiCall.builder().run(new ro5(this)).setMethodKey(C5606hy.f29919j).build());
    }
}

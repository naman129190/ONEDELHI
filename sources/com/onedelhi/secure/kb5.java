package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.Preconditions;

public final /* synthetic */ class kb5 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f14824a;

    /* renamed from: a */
    public final /* synthetic */ C3354r3 f14825a;

    public /* synthetic */ kb5(C3354r3 r3Var, PendingIntent pendingIntent) {
        this.f14825a = r3Var;
        this.f14824a = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        C3354r3 r3Var = this.f14825a;
        PendingIntent pendingIntent = this.f14824a;
        Api api = ge5.f12545a;
        vd5 vd5 = new vd5((x94) obj2);
        Preconditions.checkNotNull(r3Var, "activityTransitionRequest must be specified.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(vd5, "ResultHolder not provided.");
        ((tv6) ((w56) obj).getService()).mo14862B7(r3Var, pendingIntent, new StatusCallback(vd5));
    }
}

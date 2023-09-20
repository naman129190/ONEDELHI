package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.Preconditions;

public final /* synthetic */ class j67 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f14029a;

    /* renamed from: a */
    public final /* synthetic */ jl5 f14030a;

    public /* synthetic */ j67(jl5 jl5, PendingIntent pendingIntent) {
        this.f14030a = jl5;
        this.f14029a = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        jl5 jl5 = this.f14030a;
        PendingIntent pendingIntent = this.f14029a;
        Api api = ge5.f12545a;
        vd5 vd5 = new vd5((x94) obj2);
        Preconditions.checkNotNull(jl5, "ActivityRecognitionRequest can't be null.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(vd5, "ResultHolder not provided.");
        ((tv6) ((w56) obj).getService()).mo14867F1(jl5, pendingIntent, new StatusCallback(vd5));
    }
}

package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.Preconditions;

public final /* synthetic */ class xb5 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f22525a;

    public /* synthetic */ xb5(PendingIntent pendingIntent) {
        this.f22525a = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        PendingIntent pendingIntent = this.f22525a;
        Api api = ge5.f12545a;
        vd5 vd5 = new vd5((x94) obj2);
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(vd5, "ResultHolder not provided.");
        ((tv6) ((w56) obj).getService()).mo14861B6(pendingIntent, new StatusCallback(vd5));
    }
}

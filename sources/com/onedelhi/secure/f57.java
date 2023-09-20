package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.Preconditions;

public final /* synthetic */ class f57 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f11832a;

    public /* synthetic */ f57(PendingIntent pendingIntent) {
        this.f11832a = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        PendingIntent pendingIntent = this.f11832a;
        Api api = ge5.f12545a;
        vd5 vd5 = new vd5((x94) obj2);
        Preconditions.checkNotNull(vd5, "ResultHolder not provided.");
        ((tv6) ((w56) obj).getService()).mo14876e3(pendingIntent, new StatusCallback(vd5));
    }
}

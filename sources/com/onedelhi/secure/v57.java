package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;

public final /* synthetic */ class v57 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f21666a;

    public /* synthetic */ v57(PendingIntent pendingIntent) {
        this.f21666a = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        PendingIntent pendingIntent = this.f21666a;
        Api api = ge5.f12545a;
        ((w56) obj).mo26445d(pendingIntent);
        ((x94) obj2).mo26837c(null);
    }
}

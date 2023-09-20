package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;

public final /* synthetic */ class vq5 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f21912a;

    /* renamed from: a */
    public final /* synthetic */ xf1 f21913a;

    public /* synthetic */ vq5(xf1 xf1, PendingIntent pendingIntent) {
        this.f21913a = xf1;
        this.f21912a = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        ((xx5) obj).mo27130j(this.f21913a, this.f21912a, (x94) obj2);
    }
}

package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.LocationRequest;

public final /* synthetic */ class rk5 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f19920a;

    /* renamed from: a */
    public final /* synthetic */ LocationRequest f19921a;

    public /* synthetic */ rk5(PendingIntent pendingIntent, LocationRequest locationRequest) {
        this.f19920a = pendingIntent;
        this.f19921a = locationRequest;
    }

    public final void accept(Object obj, Object obj2) {
        Api api = mp5.f16269a;
        ((xx5) obj).mo27136p(this.f19920a, this.f19921a, (x94) obj2);
    }
}

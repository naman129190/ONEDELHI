package com.onedelhi.secure;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.LocationRequest;

public final /* synthetic */ class jk5 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ LocationRequest f14224a;

    /* renamed from: a */
    public final /* synthetic */ hp5 f14225a;

    public /* synthetic */ jk5(hp5 hp5, LocationRequest locationRequest) {
        this.f14225a = hp5;
        this.f14224a = locationRequest;
    }

    public final void accept(Object obj, Object obj2) {
        Api api = mp5.f16269a;
        ((xx5) obj).mo27134n(this.f14225a, this.f14224a, (x94) obj2);
    }
}

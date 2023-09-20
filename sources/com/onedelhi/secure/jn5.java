package com.onedelhi.secure;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.location.LocationRequest;

public final /* synthetic */ class jn5 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ LocationRequest f14293a;

    /* renamed from: a */
    public final /* synthetic */ hp5 f14294a;

    public /* synthetic */ jn5(hp5 hp5, LocationRequest locationRequest) {
        this.f14294a = hp5;
        this.f14293a = locationRequest;
    }

    public final void accept(Object obj, Object obj2) {
        Api api = mp5.f16269a;
        ((xx5) obj).mo27135o(this.f14294a, this.f14293a, (x94) obj2);
    }
}

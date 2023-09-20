package com.onedelhi.secure;

import android.location.Location;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;

public final /* synthetic */ class tj5 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ Location f20954a;

    public /* synthetic */ tj5(Location location) {
        this.f20954a = location;
    }

    public final void accept(Object obj, Object obj2) {
        Api api = mp5.f16269a;
        ((xx5) obj).mo27139s(this.f20954a, (x94) obj2);
    }
}

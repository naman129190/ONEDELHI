package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationRequest;

public final class hg5 extends vi5 {

    /* renamed from: a */
    public final /* synthetic */ ListenerHolder f13071a;

    /* renamed from: a */
    public final /* synthetic */ LocationRequest f13072a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hg5(dj5 dj5, GoogleApiClient googleApiClient, ListenerHolder listenerHolder, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f13071a = listenerHolder;
        this.f13072a = locationRequest;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((xx5) anyClient).mo27134n(new ni5(this.f13071a), this.f13072a, dj5.m13154m(this));
    }
}

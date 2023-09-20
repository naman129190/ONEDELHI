package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationRequest;

public final class yf5 extends vi5 {

    /* renamed from: a */
    public final /* synthetic */ ListenerHolder f23064a;

    /* renamed from: a */
    public final /* synthetic */ LocationRequest f23065a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yf5(dj5 dj5, GoogleApiClient googleApiClient, ListenerHolder listenerHolder, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f23064a = listenerHolder;
        this.f23065a = locationRequest;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((xx5) anyClient).mo27135o(new ni5(this.f23064a), this.f23065a, dj5.m13154m(this));
    }
}

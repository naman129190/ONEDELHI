package com.onedelhi.secure;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

public final class fi5 extends vi5 {

    /* renamed from: a */
    public final /* synthetic */ Location f12071a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fi5(dj5 dj5, GoogleApiClient googleApiClient, Location location) {
        super(googleApiClient);
        this.f12071a = location;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((xx5) anyClient).mo27139s(this.f12071a, dj5.m13154m(this));
    }
}

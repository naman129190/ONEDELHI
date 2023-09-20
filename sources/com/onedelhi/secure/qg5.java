package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

public final class qg5 extends vi5 {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f19165a;

    /* renamed from: a */
    public final /* synthetic */ LocationRequest f19166a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qg5(dj5 dj5, GoogleApiClient googleApiClient, PendingIntent pendingIntent, LocationRequest locationRequest) {
        super(googleApiClient);
        this.f19165a = pendingIntent;
        this.f19166a = locationRequest;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((xx5) anyClient).mo27136p(this.f19165a, this.f19166a, dj5.m13154m(this));
    }
}

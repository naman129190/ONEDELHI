package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

public final class hh5 extends vi5 {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f13111a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hh5(dj5 dj5, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f13111a = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((xx5) anyClient).mo27127g(this.f13111a, dj5.m13154m(this), (Object) null);
    }
}

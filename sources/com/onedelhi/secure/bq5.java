package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

public final class bq5 extends lq5 {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f9926a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bq5(qq5 qq5, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f9926a = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((xx5) anyClient).mo27137q(this.f9926a, qq5.m26051e(this));
    }
}

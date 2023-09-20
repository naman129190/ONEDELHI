package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

public final class wp5 extends lq5 {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f22239a;

    /* renamed from: a */
    public final /* synthetic */ xf1 f22240a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wp5(qq5 qq5, GoogleApiClient googleApiClient, xf1 xf1, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f22240a = xf1;
        this.f22239a = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((xx5) anyClient).mo27130j(this.f22240a, this.f22239a, qq5.m26051e(this));
    }
}

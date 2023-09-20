package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

public final class j37 extends a47 {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f14006a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j37(p47 p47, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f14006a = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((w56) anyClient).mo26445d(this.f14006a);
        setResult(Status.RESULT_SUCCESS);
    }
}

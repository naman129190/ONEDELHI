package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

public final class s27 extends a47 {

    /* renamed from: a */
    public final /* synthetic */ long f20189a;

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f20190a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s27(p47 p47, GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f20189a = j;
        this.f20190a = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        w56 w56 = (w56) anyClient;
        long j = this.f20189a;
        PendingIntent pendingIntent = this.f20190a;
        Preconditions.checkNotNull(pendingIntent);
        Preconditions.checkArgument(j >= 0, "detectionIntervalMillis must be >= 0");
        ((tv6) w56.getService()).mo14877g6(j, true, pendingIntent);
        setResult(Status.RESULT_SUCCESS);
    }
}

package com.onedelhi.secure;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

public abstract class fo5 extends BaseImplementation.ApiMethodImpl {
    public fo5(GoogleApiClient googleApiClient) {
        super((Api<?>) C2854mc.f16062a, googleApiClient);
    }

    /* renamed from: a */
    public abstract void mo16128a(Context context, zn5 zn5) throws RemoteException;

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new pq5(status);
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        hn5 hn5 = (hn5) anyClient;
        mo16128a(hn5.getContext(), (zn5) hn5.getService());
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}

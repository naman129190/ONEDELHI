package com.onedelhi.secure;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

public abstract class i85 extends BaseImplementation.ApiMethodImpl {
    public i85(GoogleApiClient googleApiClient) {
        super((Api<?>) C2326hc.f13039b, googleApiClient);
    }

    /* renamed from: a */
    public abstract void mo17683a(Context context, a95 a95) throws DeadObjectException, RemoteException;

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        o85 o85 = (o85) anyClient;
        mo17683a(o85.getContext(), (a95) o85.getService());
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}

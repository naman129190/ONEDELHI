package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

public final class hc5 extends BaseImplementation.ApiMethodImpl {

    /* renamed from: a */
    public final /* synthetic */ boolean f13047a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hc5(fg5 fg5, Api api, GoogleApiClient googleApiClient, boolean z) {
        super((Api<?>) api, googleApiClient);
        this.f13047a = z;
    }

    public final Result createFailedResult(Status status) {
        return new kf5(status);
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f26) ((og5) anyClient).getService()).mo15737L7(this.f13047a);
        setResult(new kf5(Status.RESULT_SUCCESS));
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}

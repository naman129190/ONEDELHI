package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.onedelhi.secure.x94;

final class zacv extends TaskApiCall {
    public final /* synthetic */ TaskApiCall.Builder zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zacv(TaskApiCall.Builder builder, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.zaa = builder;
    }

    public final void doExecute(Api.AnyClient anyClient, x94 x94) throws RemoteException {
        this.zaa.zaa.accept(anyClient, x94);
    }
}

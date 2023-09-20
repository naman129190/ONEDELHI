package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

public final class gq5 extends lq5 {

    /* renamed from: a */
    public final /* synthetic */ List f12719a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gq5(qq5 qq5, GoogleApiClient googleApiClient, List list) {
        super(googleApiClient);
        this.f12719a = list;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((xx5) anyClient).mo27138r(this.f12719a, qq5.m26051e(this));
    }
}

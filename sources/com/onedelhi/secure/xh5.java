package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

public final class xh5 extends vi5 {

    /* renamed from: a */
    public final /* synthetic */ boolean f22571a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xh5(dj5 dj5, GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient);
        this.f22571a = z;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((xx5) anyClient).mo27124d(this.f22571a, dj5.m13154m(this));
    }
}

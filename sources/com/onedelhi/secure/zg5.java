package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;

public final class zg5 extends vi5 {

    /* renamed from: a */
    public final /* synthetic */ c72 f23658a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zg5(dj5 dj5, GoogleApiClient googleApiClient, c72 c72) {
        super(googleApiClient);
        this.f23658a = c72;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((xx5) anyClient).mo27126f(ListenerHolders.createListenerKey(this.f23658a, c72.class.getSimpleName()), true, dj5.m13154m(this));
    }
}

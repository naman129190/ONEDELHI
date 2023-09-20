package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;

public final class ph5 extends vi5 {

    /* renamed from: a */
    public final /* synthetic */ z62 f18534a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ph5(dj5 dj5, GoogleApiClient googleApiClient, z62 z62) {
        super(googleApiClient);
        this.f18534a = z62;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((xx5) anyClient).mo27125e(ListenerHolders.createListenerKey(this.f18534a, z62.class.getSimpleName()), true, dj5.m13154m(this));
    }
}

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.onedelhi.secure.x94;

final class zacl extends UnregisterListenerMethod {
    public final /* synthetic */ RegistrationMethods.Builder zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zacl(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zaa = builder;
    }

    public final void unregisterListener(Api.AnyClient anyClient, x94<Boolean> x94) throws RemoteException {
        this.zaa.zab.accept(anyClient, x94);
    }
}

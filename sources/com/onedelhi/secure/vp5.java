package com.onedelhi.secure;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

public final class vp5 extends fo5 {

    /* renamed from: a */
    public final /* synthetic */ n73 f21908a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vp5(kq5 kq5, GoogleApiClient googleApiClient, n73 n73) {
        super(googleApiClient);
        this.f21908a = n73;
    }

    /* renamed from: a */
    public final void mo16128a(Context context, zn5 zn5) throws RemoteException {
        zn5.mo28049n8(new qp5(this), this.f21908a);
    }
}

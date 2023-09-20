package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;

public abstract class wp6 extends TaskApiCall {

    /* renamed from: a */
    public x94 f22241a;

    public /* synthetic */ wp6(int i, dn6 dn6) {
        super((Feature[]) null, false, i);
    }

    /* renamed from: a */
    public abstract void mo16450a(bj5 bj5) throws RemoteException;

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient, x94 x94) throws RemoteException {
        this.f22241a = x94;
        mo16450a((bj5) ((nh5) anyClient).getService());
    }
}

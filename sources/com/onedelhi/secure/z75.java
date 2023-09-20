package com.onedelhi.secure;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public final class z75 extends i85 {
    public z75(f85 f85, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* renamed from: a */
    public final void mo17683a(Context context, a95 a95) throws RemoteException {
        a95.mo12871o8(new c85(this));
    }

    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}

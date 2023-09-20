package com.onedelhi.secure;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.C1403a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public final class q75 extends i85 {

    /* renamed from: a */
    public final /* synthetic */ C1403a f18938a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q75(f85 f85, GoogleApiClient googleApiClient, C1403a aVar) {
        super(googleApiClient);
        this.f18938a = aVar;
    }

    /* renamed from: a */
    public final void mo17683a(Context context, a95 a95) throws RemoteException {
        a95.mo12869m8(new n75(this), this.f18938a);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new j75(status, (Credential) null);
    }
}

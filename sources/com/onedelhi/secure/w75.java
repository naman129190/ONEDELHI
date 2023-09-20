package com.onedelhi.secure;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public final class w75 extends i85 {

    /* renamed from: a */
    public final /* synthetic */ Credential f22063a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w75(f85 f85, GoogleApiClient googleApiClient, Credential credential) {
        super(googleApiClient);
        this.f22063a = credential;
    }

    /* renamed from: a */
    public final void mo17683a(Context context, a95 a95) throws RemoteException {
        a95.mo12868l8(new c85(this), new r85(this.f22063a));
    }

    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}

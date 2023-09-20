package com.onedelhi.secure;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public final class p75 extends e85 {

    /* renamed from: a */
    public final /* synthetic */ Context f18407a;

    /* renamed from: a */
    public final /* synthetic */ GoogleSignInOptions f18408a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p75(GoogleApiClient googleApiClient, Context context, GoogleSignInOptions googleSignInOptions) {
        super(googleApiClient);
        this.f18407a = context;
        this.f18408a = googleSignInOptions;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zh1((GoogleSignInAccount) null, status);
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((z85) ((i75) anyClient).getService()).mo27842n8(new m75(this), this.f18408a);
    }
}

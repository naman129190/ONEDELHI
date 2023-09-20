package com.onedelhi.secure;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

public final class de5 extends BaseImplementation.ApiMethodImpl {

    /* renamed from: a */
    public final /* synthetic */ Account f10717a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public de5(fg5 fg5, Api api, GoogleApiClient googleApiClient, Account account) {
        super((Api<?>) api, googleApiClient);
        this.f10717a = account;
    }

    public final Result createFailedResult(Status status) {
        return new vf5(status);
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f26) ((og5) anyClient).getService()).mo15736G7(new sd5(this), this.f10717a);
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}

package com.onedelhi.secure;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

public final class gd5 extends BaseImplementation.ApiMethodImpl {

    /* renamed from: a */
    public final /* synthetic */ String f12521a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gd5(fg5 fg5, Api api, GoogleApiClient googleApiClient, String str) {
        super((Api<?>) api, googleApiClient);
        this.f12521a = str;
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new ze5(status, (Account) null);
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((f26) ((og5) anyClient).getService()).mo15738g4(new uc5(this), this.f12521a);
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}

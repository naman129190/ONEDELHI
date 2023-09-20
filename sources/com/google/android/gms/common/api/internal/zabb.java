package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.b44;
import com.onedelhi.secure.mr2;

final class zabb implements ResultCallback {
    public final /* synthetic */ StatusPendingResult zaa;
    public final /* synthetic */ boolean zab;
    public final /* synthetic */ GoogleApiClient zac;
    public final /* synthetic */ zabe zad;

    public zabb(zabe zabe, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.zad = zabe;
        this.zaa = statusPendingResult;
        this.zab = z;
        this.zac = googleApiClient;
    }

    public final /* bridge */ /* synthetic */ void onResult(@mr2 Result result) {
        Status status = (Status) result;
        b44.m11561b(this.zad.zan).mo13416i();
        if (status.isSuccess() && this.zad.isConnected()) {
            zabe zabe = this.zad;
            zabe.disconnect();
            zabe.connect();
        }
        this.zaa.setResult(status);
        if (this.zab) {
            this.zac.disconnect();
        }
    }
}

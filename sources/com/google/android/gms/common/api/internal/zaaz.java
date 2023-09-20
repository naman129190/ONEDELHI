package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.ts2;
import java.util.concurrent.atomic.AtomicReference;

final class zaaz implements GoogleApiClient.ConnectionCallbacks {
    public final /* synthetic */ AtomicReference zaa;
    public final /* synthetic */ StatusPendingResult zab;
    public final /* synthetic */ zabe zac;

    public zaaz(zabe zabe, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.zac = zabe;
        this.zaa = atomicReference;
        this.zab = statusPendingResult;
    }

    public final void onConnected(@ts2 Bundle bundle) {
        this.zac.zam((GoogleApiClient) Preconditions.checkNotNull((GoogleApiClient) this.zaa.get()), this.zab, true);
    }

    public final void onConnectionSuspended(int i) {
    }
}

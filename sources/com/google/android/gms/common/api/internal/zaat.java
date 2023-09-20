package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.f45;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

final class zaat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ zaaw zaa;

    public /* synthetic */ zaat(zaaw zaaw, zaas zaas) {
        this.zaa = zaaw;
    }

    public final void onConnected(@ts2 Bundle bundle) {
        ClientSettings clientSettings = (ClientSettings) Preconditions.checkNotNull(this.zaa.zar);
        ((f45) Preconditions.checkNotNull(this.zaa.zak)).mo15777c(new zaar(this.zaa));
    }

    public final void onConnectionFailed(@mr2 ConnectionResult connectionResult) {
        this.zaa.zab.lock();
        try {
            if (this.zaa.zaI(connectionResult)) {
                this.zaa.zaA();
                this.zaa.zaF();
            } else {
                this.zaa.zaD(connectionResult);
            }
        } finally {
            this.zaa.zab.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

public final class zat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final Api zaa;
    private final boolean zab;
    @ts2
    private zau zac;

    public zat(Api api, boolean z) {
        this.zaa = api;
        this.zab = z;
    }

    private final zau zab() {
        Preconditions.checkNotNull(this.zac, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.zac;
    }

    public final void onConnected(@ts2 Bundle bundle) {
        zab().onConnected(bundle);
    }

    public final void onConnectionFailed(@mr2 ConnectionResult connectionResult) {
        zab().zaa(connectionResult, this.zaa, this.zab);
    }

    public final void onConnectionSuspended(int i) {
        zab().onConnectionSuspended(i);
    }

    public final void zaa(zau zau) {
        this.zac = zau;
    }
}

package com.onedelhi.secure;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.onedelhi.secure.C2326hc;

public final class o55 extends Api.AbstractClientBuilder {
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new o85(context, looper, clientSettings, (C2326hc.C2327a) obj, connectionCallbacks, onConnectionFailedListener);
    }
}

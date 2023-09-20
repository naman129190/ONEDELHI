package com.onedelhi.secure;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

public final class l35 extends Api.AbstractClientBuilder {
    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        ry3 ry3 = (ry3) obj;
        return new py3(context, looper, true, clientSettings, py3.m25208d(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }
}

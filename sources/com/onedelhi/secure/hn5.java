package com.onedelhi.secure;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class hn5 extends GmsClient {

    /* renamed from: a */
    public final Bundle f13204a;

    public hn5(Context context, Looper looper, ClientSettings clientSettings, C2959nc ncVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 16, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f13204a = ncVar == null ? new Bundle() : ncVar.mo21071a();
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof zn5 ? (zn5) queryLocalInterface : new zn5(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f13204a;
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean requiresSignIn() {
        ClientSettings clientSettings = getClientSettings();
        return !TextUtils.isEmpty(clientSettings.getAccountName()) && !clientSettings.getApplicableScopes(C2854mc.f16062a).isEmpty();
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

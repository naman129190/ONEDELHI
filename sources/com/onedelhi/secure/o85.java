package com.onedelhi.secure;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.onedelhi.secure.C2326hc;

public final class o85 extends GmsClient {

    /* renamed from: a */
    public final C2326hc.C2327a f17879a;

    public o85(Context context, Looper looper, ClientSettings clientSettings, C2326hc.C2327a aVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        C2326hc.C2327a.C2328a aVar2 = new C2326hc.C2327a.C2328a(aVar == null ? C2326hc.C2327a.f13041a : aVar);
        aVar2.mo17188b(w65.m30705a());
        this.f17879a = new C2326hc.C2327a(aVar2);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof a95 ? (a95) queryLocalInterface : new a95(iBinder);
    }

    /* renamed from: d */
    public final C2326hc.C2327a mo21833d() {
        return this.f17879a;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f17879a.mo17183a();
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}

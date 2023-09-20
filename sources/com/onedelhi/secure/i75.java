package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class i75 extends GmsClient {

    /* renamed from: a */
    public final GoogleSignInOptions f13533a;

    public i75(Context context, Looper looper, ClientSettings clientSettings, @ts2 GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        GoogleSignInOptions.C1406a aVar;
        if (googleSignInOptions == null) {
            aVar = new GoogleSignInOptions.C1406a();
        }
        aVar.mo9243l(w65.m30705a());
        if (!clientSettings.getAllRequestedScopes().isEmpty()) {
            for (Scope g : clientSettings.getAllRequestedScopes()) {
                aVar.mo9238g(g, new Scope[0]);
            }
        }
        this.f13533a = aVar.mo9233b();
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof z85 ? (z85) queryLocalInterface : new z85(iBinder);
    }

    /* renamed from: d */
    public final GoogleSignInOptions mo17661d() {
        return this.f13533a;
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final Intent getSignInIntent() {
        return h85.m16535c(getContext(), this.f13533a);
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final boolean providesSignIn() {
        return true;
    }
}

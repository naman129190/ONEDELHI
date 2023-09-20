package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zav;
import com.onedelhi.secure.C4101zk;
import com.onedelhi.secure.a45;
import com.onedelhi.secure.f45;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w35;
import com.onedelhi.secure.w45;
import java.util.Set;

public final class zact extends w35 implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static final Api.AbstractClientBuilder zaa = a45.f8734a;
    private final Context zab;
    private final Handler zac;
    private final Api.AbstractClientBuilder zad;
    private final Set zae;
    private final ClientSettings zaf;
    private f45 zag;
    /* access modifiers changed from: private */
    public zacs zah;

    @ly4
    public zact(Context context, Handler handler, @mr2 ClientSettings clientSettings) {
        Api.AbstractClientBuilder abstractClientBuilder = zaa;
        this.zab = context;
        this.zac = handler;
        this.zaf = (ClientSettings) Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.zae = clientSettings.getRequiredScopes();
        this.zad = abstractClientBuilder;
    }

    public static /* bridge */ /* synthetic */ void zad(zact zact, w45 w45) {
        ConnectionResult zaa2 = w45.zaa();
        if (zaa2.isSuccess()) {
            zav zav = (zav) Preconditions.checkNotNull(w45.mo26438K2());
            zaa2 = zav.zaa();
            if (!zaa2.isSuccess()) {
                String valueOf = String.valueOf(zaa2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            } else {
                zact.zah.zaf(zav.zab(), zact.zae);
                zact.zag.disconnect();
            }
        }
        zact.zah.zae(zaa2);
        zact.zag.disconnect();
    }

    @ly4
    public final void onConnected(@ts2 Bundle bundle) {
        this.zag.mo15777c(this);
    }

    @ly4
    public final void onConnectionFailed(@mr2 ConnectionResult connectionResult) {
        this.zah.zae(connectionResult);
    }

    @ly4
    public final void onConnectionSuspended(int i) {
        this.zag.disconnect();
    }

    @C4101zk
    public final void zab(w45 w45) {
        this.zac.post(new zacr(this, w45));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.onedelhi.secure.f45, com.google.android.gms.common.api.Api$Client] */
    @ly4
    public final void zae(zacs zacs) {
        f45 f45 = this.zag;
        if (f45 != null) {
            f45.disconnect();
        }
        this.zaf.zae(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder abstractClientBuilder = this.zad;
        Context context = this.zab;
        Looper looper = this.zac.getLooper();
        ClientSettings clientSettings = this.zaf;
        this.zag = abstractClientBuilder.buildClient(context, looper, clientSettings, clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.zah = zacs;
        Set set = this.zae;
        if (set == null || set.isEmpty()) {
            this.zac.post(new zacq(this));
        } else {
            this.zag.zab();
        }
    }

    public final void zaf() {
        f45 f45 = this.zag;
        if (f45 != null) {
            f45.disconnect();
        }
    }
}

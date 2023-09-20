package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.Set;

final class zabu implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {
    public final /* synthetic */ GoogleApiManager zaa;
    /* access modifiers changed from: private */
    public final Api.Client zab;
    /* access modifiers changed from: private */
    public final ApiKey zac;
    @ts2
    private IAccountAccessor zad = null;
    @ts2
    private Set zae = null;
    /* access modifiers changed from: private */
    public boolean zaf = false;

    public zabu(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        this.zaa = googleApiManager;
        this.zab = client;
        this.zac = apiKey;
    }

    /* access modifiers changed from: private */
    @ly4
    public final void zag() {
        IAccountAccessor iAccountAccessor;
        if (this.zaf && (iAccountAccessor = this.zad) != null) {
            this.zab.getRemoteService(iAccountAccessor, this.zae);
        }
    }

    public final void onReportServiceBinding(@mr2 ConnectionResult connectionResult) {
        this.zaa.zat.post(new zabt(this, connectionResult));
    }

    @ly4
    public final void zae(ConnectionResult connectionResult) {
        zabq zabq = (zabq) this.zaa.zap.get(this.zac);
        if (zabq != null) {
            zabq.zas(connectionResult);
        }
    }

    @ly4
    public final void zaf(@ts2 IAccountAccessor iAccountAccessor, @ts2 Set set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            zae(new ConnectionResult(4));
            return;
        }
        this.zad = iAccountAccessor;
        this.zae = set;
        zag();
    }
}

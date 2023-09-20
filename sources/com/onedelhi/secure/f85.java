package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.C1403a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.C2326hc;

public final class f85 implements ob0 {
    /* renamed from: a */
    public final PendingResult<Status> mo15895a(GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        return googleApiClient.execute(new z75(this, googleApiClient));
    }

    /* renamed from: b */
    public final PendingResult<Status> mo15896b(GoogleApiClient googleApiClient, Credential credential) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credential, "credential must not be null");
        return googleApiClient.execute(new t75(this, googleApiClient, credential));
    }

    /* renamed from: c */
    public final PendingIntent mo15897c(GoogleApiClient googleApiClient, HintRequest hintRequest) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(hintRequest, "request must not be null");
        C2326hc.C2327a d = ((o85) googleApiClient.getClient(C2326hc.f13032a)).mo21833d();
        return l85.m20321a(googleApiClient.getContext(), d, hintRequest, d.mo17184d());
    }

    /* renamed from: d */
    public final PendingResult<lb0> mo15898d(GoogleApiClient googleApiClient, C1403a aVar) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(aVar, "request must not be null");
        return googleApiClient.enqueue(new q75(this, googleApiClient, aVar));
    }

    /* renamed from: e */
    public final PendingResult<Status> mo15899e(GoogleApiClient googleApiClient, Credential credential) {
        Preconditions.checkNotNull(googleApiClient, "client must not be null");
        Preconditions.checkNotNull(credential, "credential must not be null");
        return googleApiClient.execute(new w75(this, googleApiClient, credential));
    }
}

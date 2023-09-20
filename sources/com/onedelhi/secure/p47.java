package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class p47 implements C2115f3 {
    /* renamed from: a */
    public final PendingResult<Status> mo15739a(GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        return googleApiClient.execute(new s27(this, googleApiClient, j, pendingIntent));
    }

    /* renamed from: b */
    public final PendingResult<Status> mo15740b(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new j37(this, googleApiClient, pendingIntent));
    }
}

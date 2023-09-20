package com.onedelhi.secure;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public final class ct5 implements vv3 {
    /* renamed from: a */
    public final PendingResult<e82> mo14383a(GoogleApiClient googleApiClient, c82 c82) {
        return googleApiClient.enqueue(new ss5(this, googleApiClient, c82, (String) null));
    }
}

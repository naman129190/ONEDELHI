package com.onedelhi.secure;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.h73;

public final class kq5 implements h73 {
    /* renamed from: a */
    public final PendingResult<h73.C2315b> mo17127a(GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(googleApiClient);
        return googleApiClient.execute(new fq5(this, googleApiClient));
    }

    /* renamed from: b */
    public final PendingResult<h73.C2314a> mo17128b(GoogleApiClient googleApiClient, n73 n73) {
        Preconditions.checkNotNull(googleApiClient);
        Preconditions.checkNotNull(n73);
        return googleApiClient.execute(new vp5(this, googleApiClient, n73));
    }
}

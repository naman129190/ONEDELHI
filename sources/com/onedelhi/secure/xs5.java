package com.onedelhi.secure;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

public abstract class xs5 extends BaseImplementation.ApiMethodImpl {
    public xs5(GoogleApiClient googleApiClient) {
        super((Api<?>) mp5.f16269a, googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new e82(status, (f82) null);
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}
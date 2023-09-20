package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.mr2;

@KeepForSdk
public class StatusPendingResult extends BasePendingResult<Status> {
    @Deprecated
    public StatusPendingResult(@mr2 Looper looper) {
        super(looper);
    }

    @KeepForSdk
    public StatusPendingResult(@mr2 GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @mr2
    public final /* bridge */ /* synthetic */ Result createFailedResult(@mr2 Status status) {
        return status;
    }
}

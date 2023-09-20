package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.x94;

final class zar extends zaa {
    public final /* synthetic */ x94 zaa;

    public zar(zay zay, x94 x94) {
        this.zaa = x94;
    }

    public final void zae(Status status, @ts2 ModuleAvailabilityResponse moduleAvailabilityResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleAvailabilityResponse, this.zaa);
    }
}

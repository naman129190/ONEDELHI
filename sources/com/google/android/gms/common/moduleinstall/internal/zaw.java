package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.x94;

final class zaw extends zaa {
    public final /* synthetic */ x94 zaa;

    public zaw(zay zay, x94 x94) {
        this.zaa = x94;
    }

    public final void zac(Status status, @ts2 ModuleInstallIntentResponse moduleInstallIntentResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleInstallIntentResponse, this.zaa);
    }
}

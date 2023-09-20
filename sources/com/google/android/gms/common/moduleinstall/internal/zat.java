package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.x94;

final class zat extends zaa {
    public final /* synthetic */ x94 zaa;

    public zat(zay zay, x94 x94) {
        this.zaa = x94;
    }

    public final void zad(Status status, @ts2 ModuleInstallResponse moduleInstallResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleInstallResponse, this.zaa);
    }
}

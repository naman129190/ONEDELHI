package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.onedelhi.secure.x94;

final class zas extends zaa {
    public final /* synthetic */ x94 zaa;

    public zas(zay zay, x94 x94) {
        this.zaa = x94;
    }

    public final void zab(Status status) {
        TaskUtil.trySetResultOrApiException(status, null, this.zaa);
    }
}

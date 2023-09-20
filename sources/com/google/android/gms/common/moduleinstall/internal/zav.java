package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.onedelhi.secure.x94;

final class zav extends IStatusCallback.Stub {
    public final /* synthetic */ x94 zaa;

    public zav(zay zay, x94 x94) {
        this.zaa = x94;
    }

    public final void onResult(Status status) {
        TaskUtil.trySetResultOrApiException(status, Boolean.TRUE, this.zaa);
    }
}

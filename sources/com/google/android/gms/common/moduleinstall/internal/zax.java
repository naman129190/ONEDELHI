package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.onedelhi.secure.x94;

final class zax extends IStatusCallback.Stub {
    public final /* synthetic */ x94 zaa;

    public zax(zay zay, x94 x94) {
        this.zaa = x94;
    }

    public final void onResult(Status status) {
        TaskUtil.trySetResultOrApiException(status, null, this.zaa);
    }
}

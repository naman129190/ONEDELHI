package com.onedelhi.secure;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;

public final class g37 extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ x94 f12413a;

    public g37(x37 x37, x94 x94) {
        this.f12413a = x94;
    }

    public final void onResult(Status status) {
        if (status.getStatusCode() == 6) {
            this.f12413a.mo26838d(ApiExceptionUtil.fromStatus(status));
        } else {
            TaskUtil.setResultOrApiException(status, this.f12413a);
        }
    }
}

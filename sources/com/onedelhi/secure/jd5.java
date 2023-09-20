package com.onedelhi.secure;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class jd5 extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ x94 f14106a;

    public jd5(ge5 ge5, x94 x94) {
        this.f14106a = x94;
    }

    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.f14106a);
    }
}

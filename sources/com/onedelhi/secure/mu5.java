package com.onedelhi.secure;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class mu5 extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ x94 f16351a;

    /* renamed from: a */
    public final /* synthetic */ Object f16352a;

    public mu5(xx5 xx5, Object obj, x94 x94) {
        this.f16352a = obj;
        this.f16351a = x94;
    }

    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.f16352a, this.f16351a);
    }
}

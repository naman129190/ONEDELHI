package com.onedelhi.secure;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

public final class b57 extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ x94 f9669a;

    public b57(tb5 tb5, x94 x94) {
        this.f9669a = x94;
    }

    public final void onResult(Status status) {
        tb5.m28308V(status, (Object) null, this.f9669a);
    }
}

package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class k65 extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ x94 f14767a;

    public k65(n65 n65, x94 x94) {
        this.f14767a = x94;
    }

    public final void onResult(Status status) throws RemoteException {
        TaskUtil.setResultOrApiException(status, this.f14767a);
    }
}

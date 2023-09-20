package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;

public final class b65 extends t55 {

    /* renamed from: a */
    public final /* synthetic */ x94 f9670a;

    public b65(d65 d65, x94 x94) {
        this.f9670a = x94;
    }

    /* renamed from: c5 */
    public final void mo13419c5(Status status, rq3 rq3) throws RemoteException {
        if (status.isSuccess()) {
            this.f9670a.mo26837c(rq3);
        } else {
            this.f9670a.mo26836b(ApiExceptionUtil.fromStatus(status));
        }
    }
}

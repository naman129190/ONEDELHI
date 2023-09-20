package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class j65 extends i95 {

    /* renamed from: a */
    public final /* synthetic */ x94 f14027a;

    public j65(n65 n65, x94 x94) {
        this.f14027a = x94;
    }

    /* renamed from: C7 */
    public final void mo18155C7(Status status, C2767lk lkVar) throws RemoteException {
        TaskUtil.setResultOrApiException(status, lkVar, this.f14027a);
    }
}

package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class c65 extends v55 {

    /* renamed from: a */
    public final /* synthetic */ x94 f10155a;

    public c65(d65 d65, x94 x94) {
        this.f10155a = x94;
    }

    /* renamed from: N3 */
    public final void mo14019N3(Status status, tq3 tq3) throws RemoteException {
        TaskUtil.setResultOrApiException(status, tq3, this.f10155a);
    }
}

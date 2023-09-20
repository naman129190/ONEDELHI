package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class yu5 extends bk6 {

    /* renamed from: a */
    public final /* synthetic */ w27 f23339a;

    /* renamed from: a */
    public final /* synthetic */ x94 f23340a;

    public yu5(x94 x94, w27 w27) {
        this.f23340a = x94;
        this.f23339a = w27;
    }

    /* renamed from: k6 */
    public final void mo14398k6(u96 u96) {
        TaskUtil.setResultOrApiException(u96.getStatus(), this.f23340a);
    }

    /* renamed from: x */
    public final void mo14399x() throws RemoteException {
        this.f23339a.mo21563x();
    }
}

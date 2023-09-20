package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class cv5 extends bk6 {

    /* renamed from: a */
    public final /* synthetic */ i07 f10505a;

    /* renamed from: a */
    public final /* synthetic */ x94 f10506a;

    public cv5(x94 x94, i07 i07) {
        this.f10506a = x94;
        this.f10505a = i07;
    }

    /* renamed from: k6 */
    public final void mo14398k6(u96 u96) {
        TaskUtil.setResultOrApiException(u96.getStatus(), this.f10506a);
    }

    /* renamed from: x */
    public final void mo14399x() throws RemoteException {
        this.f10505a.mo15619f6();
    }
}

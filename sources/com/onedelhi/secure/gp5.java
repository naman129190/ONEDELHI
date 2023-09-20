package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class gp5 extends bn5 {

    /* renamed from: a */
    public final /* synthetic */ x94 f12700a;

    public gp5(lp5 lp5, x94 x94) {
        this.f12700a = x94;
    }

    /* renamed from: R1 */
    public final void mo13237R1(String str) throws RemoteException {
        TaskUtil.setResultOrApiException(str != null ? Status.RESULT_SUCCESS : new Status(C2423ic.f13579g), str, this.f12700a);
    }
}

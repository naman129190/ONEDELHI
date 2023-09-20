package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class bp5 extends bn5 {

    /* renamed from: a */
    public final /* synthetic */ x94 f9925a;

    public bp5(lp5 lp5, x94 x94) {
        this.f9925a = x94;
    }

    /* renamed from: y4 */
    public final void mo13775y4(o73 o73) throws RemoteException {
        TaskUtil.setResultOrApiException(new Status(o73.f17865n), o73, this.f9925a);
    }
}

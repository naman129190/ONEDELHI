package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class l65 extends r55 {

    /* renamed from: a */
    public final /* synthetic */ x94 f15171a;

    public l65(n65 n65, x94 x94) {
        this.f15171a = x94;
    }

    /* renamed from: y0 */
    public final void mo19285y0(Status status, PendingIntent pendingIntent) throws RemoteException {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.f15171a);
    }
}

package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class k66 extends dz6 {

    /* renamed from: a */
    public final /* synthetic */ x94 f14768a;

    public k66(k11 k11, x94 x94) {
        this.f14768a = x94;
    }

    /* renamed from: I */
    public final void mo14134I(Status status, PendingIntent pendingIntent) throws RemoteException {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.f14768a);
    }
}

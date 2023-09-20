package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class th6 extends dz6 {

    /* renamed from: a */
    public final /* synthetic */ x94 f20851a;

    public th6(k11 k11, x94 x94) {
        this.f20851a = x94;
    }

    /* renamed from: I */
    public final void mo14134I(Status status, PendingIntent pendingIntent) throws RemoteException {
        TaskUtil.setResultOrApiException(status, new gh6(pendingIntent), this.f20851a);
    }
}

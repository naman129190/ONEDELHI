package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class ia6 extends dz6 {

    /* renamed from: a */
    public final /* synthetic */ x94 f13556a;

    public ia6(k11 k11, x94 x94) {
        this.f13556a = x94;
    }

    /* renamed from: I */
    public final void mo14134I(Status status, PendingIntent pendingIntent) throws RemoteException {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.f13556a);
    }
}

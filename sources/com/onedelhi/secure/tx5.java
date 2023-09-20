package com.onedelhi.secure;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class tx5 extends i37 {

    /* renamed from: a */
    public final /* synthetic */ x94 f21167a;

    public tx5(uk4 uk4, x94 x94) {
        this.f21167a = x94;
    }

    /* renamed from: I */
    public final void mo22062I(Status status, PendingIntent pendingIntent) throws RemoteException {
        TaskUtil.setResultOrApiException(status, new r27(pendingIntent), this.f21167a);
    }
}

package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class v17 extends eq6 {

    /* renamed from: a */
    public final /* synthetic */ x94 f21635a;

    public v17(m11 m11, x94 x94) {
        this.f21635a = x94;
    }

    /* renamed from: I */
    public final void mo19882I(Status status, @ts2 PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(status, new gh6(pendingIntent), this.f21635a);
    }
}

package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class yy6 extends eq6 {

    /* renamed from: a */
    public final /* synthetic */ x94 f23363a;

    public yy6(m11 m11, x94 x94) {
        this.f23363a = x94;
    }

    /* renamed from: I */
    public final void mo19882I(Status status, @ts2 PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.f23363a);
    }
}

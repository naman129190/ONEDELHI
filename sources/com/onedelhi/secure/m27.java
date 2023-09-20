package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class m27 extends eq6 {

    /* renamed from: a */
    public final /* synthetic */ x94 f15883a;

    public m27(m11 m11, x94 x94) {
        this.f15883a = x94;
    }

    /* renamed from: I */
    public final void mo19882I(Status status, @ts2 PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(status, new gh6(pendingIntent), this.f15883a);
    }
}

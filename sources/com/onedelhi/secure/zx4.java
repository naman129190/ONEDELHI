package com.onedelhi.secure;

import java.util.concurrent.ScheduledFuture;

public final /* synthetic */ class zx4 implements nu2 {

    /* renamed from: a */
    public final /* synthetic */ ScheduledFuture f38493a;

    public /* synthetic */ zx4(ScheduledFuture scheduledFuture) {
        this.f38493a = scheduledFuture;
    }

    public final void onComplete(w94 w94) {
        this.f38493a.cancel(false);
    }
}

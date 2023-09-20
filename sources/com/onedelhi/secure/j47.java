package com.onedelhi.secure;

import java.util.concurrent.ScheduledFuture;

public final /* synthetic */ class j47 implements nu2 {

    /* renamed from: a */
    public final /* synthetic */ ho3 f14015a;

    /* renamed from: a */
    public final /* synthetic */ String f14016a;

    /* renamed from: a */
    public final /* synthetic */ ScheduledFuture f14017a;

    public /* synthetic */ j47(ho3 ho3, String str, ScheduledFuture scheduledFuture) {
        this.f14015a = ho3;
        this.f14016a = str;
        this.f14017a = scheduledFuture;
    }

    public final void onComplete(w94 w94) {
        this.f14015a.mo17364e(this.f14016a, this.f14017a, w94);
    }
}

package com.onedelhi.secure;

import com.onedelhi.secure.xi0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class oi0 implements xi0.C7259c {

    /* renamed from: a */
    public final /* synthetic */ long f33035a;

    /* renamed from: a */
    public final /* synthetic */ wi0 f33036a;

    /* renamed from: a */
    public final /* synthetic */ Runnable f33037a;

    /* renamed from: a */
    public final /* synthetic */ TimeUnit f33038a;

    public /* synthetic */ oi0(wi0 wi0, Runnable runnable, long j, TimeUnit timeUnit) {
        this.f33036a = wi0;
        this.f33037a = runnable;
        this.f33035a = j;
        this.f33038a = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo39264a(xi0.C7258b bVar) {
        return this.f33036a.m69374o(this.f33037a, this.f33035a, this.f33038a, bVar);
    }
}

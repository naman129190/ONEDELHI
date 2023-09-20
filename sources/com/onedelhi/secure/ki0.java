package com.onedelhi.secure;

import com.onedelhi.secure.xi0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class ki0 implements xi0.C7259c {

    /* renamed from: a */
    public final /* synthetic */ long f31226a;

    /* renamed from: a */
    public final /* synthetic */ wi0 f31227a;

    /* renamed from: a */
    public final /* synthetic */ Runnable f31228a;

    /* renamed from: a */
    public final /* synthetic */ TimeUnit f31229a;

    /* renamed from: b */
    public final /* synthetic */ long f31230b;

    public /* synthetic */ ki0(wi0 wi0, Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        this.f31227a = wi0;
        this.f31228a = runnable;
        this.f31226a = j;
        this.f31230b = j2;
        this.f31229a = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo39264a(xi0.C7258b bVar) {
        return this.f31227a.m69380u(this.f31228a, this.f31226a, this.f31230b, this.f31229a, bVar);
    }
}

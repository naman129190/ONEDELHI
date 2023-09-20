package com.onedelhi.secure;

import com.onedelhi.secure.xi0;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class pi0 implements xi0.C7259c {

    /* renamed from: a */
    public final /* synthetic */ long f33684a;

    /* renamed from: a */
    public final /* synthetic */ wi0 f33685a;

    /* renamed from: a */
    public final /* synthetic */ Callable f33686a;

    /* renamed from: a */
    public final /* synthetic */ TimeUnit f33687a;

    public /* synthetic */ pi0(wi0 wi0, Callable callable, long j, TimeUnit timeUnit) {
        this.f33685a = wi0;
        this.f33686a = callable;
        this.f33684a = j;
        this.f33687a = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo39264a(xi0.C7258b bVar) {
        return this.f33685a.m69377r(this.f33686a, this.f33684a, this.f33687a, bVar);
    }
}

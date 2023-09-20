package com.onedelhi.secure;

import com.onedelhi.secure.xi0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class ni0 implements xi0.C7259c {

    /* renamed from: a */
    public final /* synthetic */ long f32560a;

    /* renamed from: a */
    public final /* synthetic */ wi0 f32561a;

    /* renamed from: a */
    public final /* synthetic */ Runnable f32562a;

    /* renamed from: a */
    public final /* synthetic */ TimeUnit f32563a;

    /* renamed from: b */
    public final /* synthetic */ long f32564b;

    public /* synthetic */ ni0(wi0 wi0, Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        this.f32561a = wi0;
        this.f32562a = runnable;
        this.f32560a = j;
        this.f32564b = j2;
        this.f32563a = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo39264a(xi0.C7258b bVar) {
        return this.f32561a.m69382w(this.f32562a, this.f32560a, this.f32564b, this.f32563a, bVar);
    }
}

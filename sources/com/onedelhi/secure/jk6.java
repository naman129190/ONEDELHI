package com.onedelhi.secure;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class jk6 implements vy6 {
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: a */
    public nu2 f14226a;

    /* renamed from: a */
    public final Object f14227a = new Object();

    /* renamed from: a */
    public final Executor f14228a;

    public jk6(@mr2 Executor executor, @mr2 nu2 nu2) {
        this.f14228a = executor;
        this.f14226a = nu2;
    }

    /* renamed from: F */
    public final void mo13015F() {
        synchronized (this.f14227a) {
            this.f14226a = null;
        }
    }

    /* renamed from: d */
    public final void mo13016d(@mr2 w94 w94) {
        synchronized (this.f14227a) {
            if (this.f14226a != null) {
                this.f14228a.execute(new rh6(this, w94));
            }
        }
    }
}

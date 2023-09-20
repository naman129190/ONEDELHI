package com.onedelhi.secure;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class ut6 implements vy6 {
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: a */
    public gv2 f21523a;

    /* renamed from: a */
    public final Object f21524a = new Object();

    /* renamed from: a */
    public final Executor f21525a;

    public ut6(@mr2 Executor executor, @mr2 gv2 gv2) {
        this.f21525a = executor;
        this.f21523a = gv2;
    }

    /* renamed from: F */
    public final void mo13015F() {
        synchronized (this.f21524a) {
            this.f21523a = null;
        }
    }

    /* renamed from: d */
    public final void mo13016d(@mr2 w94 w94) {
        if (w94.mo17590v()) {
            synchronized (this.f21524a) {
                if (this.f21523a != null) {
                    this.f21525a.execute(new cs6(this, w94));
                }
            }
        }
    }
}

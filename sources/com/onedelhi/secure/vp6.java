package com.onedelhi.secure;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class vp6 implements vy6 {
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: a */
    public vu2 f21909a;

    /* renamed from: a */
    public final Object f21910a = new Object();

    /* renamed from: a */
    public final Executor f21911a;

    public vp6(@mr2 Executor executor, @mr2 vu2 vu2) {
        this.f21911a = executor;
        this.f21909a = vu2;
    }

    /* renamed from: F */
    public final void mo13015F() {
        synchronized (this.f21910a) {
            this.f21909a = null;
        }
    }

    /* renamed from: d */
    public final void mo13016d(@mr2 w94 w94) {
        if (!w94.mo17590v() && !w94.mo17588t()) {
            synchronized (this.f21910a) {
                if (this.f21909a != null) {
                    this.f21911a.execute(new cn6(this, w94));
                }
            }
        }
    }
}

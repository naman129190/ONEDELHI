package com.onedelhi.secure;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class ae6 implements vy6 {
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: a */
    public mu2 f9034a;

    /* renamed from: a */
    public final Object f9035a = new Object();

    /* renamed from: a */
    public final Executor f9036a;

    public ae6(@mr2 Executor executor, @mr2 mu2 mu2) {
        this.f9036a = executor;
        this.f9034a = mu2;
    }

    /* renamed from: F */
    public final void mo13015F() {
        synchronized (this.f9035a) {
            this.f9034a = null;
        }
    }

    /* renamed from: d */
    public final void mo13016d(@mr2 w94 w94) {
        if (w94.mo17588t()) {
            synchronized (this.f9035a) {
                if (this.f9034a != null) {
                    this.f9036a.execute(new ea6(this));
                }
            }
        }
    }
}

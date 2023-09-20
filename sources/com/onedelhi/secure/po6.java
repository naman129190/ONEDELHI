package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

public final class po6 {

    /* renamed from: a */
    public long f18631a;

    /* renamed from: a */
    public final Clock f18632a;

    public po6(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.f18632a = clock;
    }

    /* renamed from: a */
    public final void mo22528a() {
        this.f18631a = 0;
    }

    /* renamed from: b */
    public final void mo22529b() {
        this.f18631a = this.f18632a.elapsedRealtime();
    }

    /* renamed from: c */
    public final boolean mo22530c(long j) {
        return this.f18631a == 0 || this.f18632a.elapsedRealtime() - this.f18631a >= 3600000;
    }
}

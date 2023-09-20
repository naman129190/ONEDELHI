package com.onedelhi.secure;

import java.util.concurrent.Executor;

public final class lx5 implements vy6 {

    /* renamed from: a */
    public final c80 f15661a;

    /* renamed from: a */
    public final i47 f15662a;

    /* renamed from: a */
    public final Executor f15663a;

    public lx5(@mr2 Executor executor, @mr2 c80 c80, @mr2 i47 i47) {
        this.f15663a = executor;
        this.f15661a = c80;
        this.f15662a = i47;
    }

    /* renamed from: F */
    public final void mo13015F() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo13016d(@mr2 w94 w94) {
        this.f15663a.execute(new gs5(this, w94));
    }
}

package com.onedelhi.secure;

import java.util.concurrent.Executor;

public final class g66<TResult, TContinuationResult> implements gv2<TContinuationResult>, vu2, mu2, vy6 {

    /* renamed from: a */
    public final c80 f12452a;

    /* renamed from: a */
    public final i47 f12453a;

    /* renamed from: a */
    public final Executor f12454a;

    public g66(@mr2 Executor executor, @mr2 c80 c80, @mr2 i47 i47) {
        this.f12454a = executor;
        this.f12452a = c80;
        this.f12453a = i47;
    }

    /* renamed from: F */
    public final void mo13015F() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo7740a(TContinuationResult tcontinuationresult) {
        this.f12453a.mo17594z(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo14940b() {
        this.f12453a.mo17562A();
    }

    /* renamed from: c */
    public final void mo7919c(@mr2 Exception exc) {
        this.f12453a.mo17593y(exc);
    }

    /* renamed from: d */
    public final void mo13016d(@mr2 w94 w94) {
        this.f12454a.execute(new j26(this, w94));
    }
}

package com.onedelhi.secure;

import java.util.concurrent.Executor;

public final class dx6<TResult, TContinuationResult> implements gv2<TContinuationResult>, vu2, mu2, vy6 {

    /* renamed from: a */
    public final i47 f10994a;

    /* renamed from: a */
    public final r64 f10995a;

    /* renamed from: a */
    public final Executor f10996a;

    public dx6(@mr2 Executor executor, @mr2 r64 r64, @mr2 i47 i47) {
        this.f10996a = executor;
        this.f10995a = r64;
        this.f10994a = i47;
    }

    /* renamed from: F */
    public final void mo13015F() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo7740a(TContinuationResult tcontinuationresult) {
        this.f10994a.mo17594z(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo14940b() {
        this.f10994a.mo17562A();
    }

    /* renamed from: c */
    public final void mo7919c(@mr2 Exception exc) {
        this.f10994a.mo17593y(exc);
    }

    /* renamed from: d */
    public final void mo13016d(@mr2 w94 w94) {
        this.f10996a.execute(new lv6(this, w94));
    }
}

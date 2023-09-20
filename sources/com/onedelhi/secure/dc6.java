package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;

public final class dc6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ bd6 f10713a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f10714a;

    public dc6(bd6 bd6, uy6 uy6) {
        this.f10713a = bd6;
        this.f10714a = uy6;
    }

    public final void run() {
        this.f10713a.f9796a.mo23375b();
        qq6 m8 = this.f10713a.f9796a;
        uy6 uy6 = this.f10714a;
        m8.mo15135d().mo15139h();
        m8.mo23379g();
        Preconditions.checkNotEmpty(uy6.f21557b);
        ye5 b = ye5.m32305b(uy6.f21576j);
        ye5 V = m8.mo23369V(uy6.f21557b);
        m8.mo15136e().mo12730v().mo25381c("Setting consent, package, consent", uy6.f21557b, b);
        m8.mo23352A(uy6.f21557b, b);
        if (b.mo27439k(V)) {
            m8.mo23399v(uy6);
        }
    }
}

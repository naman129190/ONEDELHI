package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;

public final class ac6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ bd6 f8993a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f8994a;

    public ac6(bd6 bd6, uy6 uy6) {
        this.f8993a = bd6;
        this.f8994a = uy6;
    }

    public final void run() {
        this.f8993a.f9796a.mo23375b();
        qq6 m8 = this.f8993a.f9796a;
        uy6 uy6 = this.f8994a;
        m8.mo15135d().mo15139h();
        m8.mo23379g();
        Preconditions.checkNotEmpty(uy6.f21557b);
        m8.mo23366S(uy6);
    }
}

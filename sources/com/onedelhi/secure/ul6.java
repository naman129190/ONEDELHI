package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;

public final class ul6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ fc5 f21436a;

    /* renamed from: a */
    public final /* synthetic */ om6 f21437a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f21438a;

    /* renamed from: b */
    public final /* synthetic */ fc5 f21439b;

    /* renamed from: b */
    public final /* synthetic */ boolean f21440b;

    public ul6(om6 om6, boolean z, uy6 uy6, boolean z2, fc5 fc5, fc5 fc52) {
        this.f21437a = om6;
        this.f21438a = uy6;
        this.f21440b = z2;
        this.f21436a = fc5;
        this.f21439b = fc52;
    }

    public final void run() {
        om6 om6 = this.f21437a;
        w36 H = om6.f18023a;
        if (H == null) {
            om6.f11205a.mo15136e().mo12726r().mo25379a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.f21438a);
        this.f21437a.mo22013r(H, this.f21440b ? null : this.f21436a, this.f21438a);
        this.f21437a.mo21996E();
    }
}

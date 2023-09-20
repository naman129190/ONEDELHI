package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;

public final class sl6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f20427a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f20428a;

    /* renamed from: a */
    public final /* synthetic */ xj5 f20429a;

    /* renamed from: b */
    public final /* synthetic */ String f20430b;

    /* renamed from: b */
    public final /* synthetic */ boolean f20431b;

    public sl6(om6 om6, boolean z, uy6 uy6, boolean z2, xj5 xj5, String str) {
        this.f20427a = om6;
        this.f20428a = uy6;
        this.f20431b = z2;
        this.f20429a = xj5;
        this.f20430b = str;
    }

    public final void run() {
        om6 om6 = this.f20427a;
        w36 H = om6.f18023a;
        if (H == null) {
            om6.f11205a.mo15136e().mo12726r().mo25379a("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.f20428a);
        this.f20427a.mo22013r(H, this.f20431b ? null : this.f20429a, this.f20428a);
        this.f20427a.mo21996E();
    }
}

package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;

public final class uk6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f21420a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f21421a;

    /* renamed from: a */
    public final /* synthetic */ wq6 f21422a;

    /* renamed from: b */
    public final /* synthetic */ boolean f21423b;

    public uk6(om6 om6, uy6 uy6, boolean z, wq6 wq6) {
        this.f21420a = om6;
        this.f21421a = uy6;
        this.f21423b = z;
        this.f21422a = wq6;
    }

    public final void run() {
        om6 om6 = this.f21420a;
        w36 H = om6.f18023a;
        if (H == null) {
            om6.f11205a.mo15136e().mo12726r().mo25379a("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.f21421a);
        this.f21420a.mo22013r(H, this.f21423b ? null : this.f21422a, this.f21421a);
        this.f21420a.mo21996E();
    }
}

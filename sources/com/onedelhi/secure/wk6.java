package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class wk6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f22197a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f22198a;

    public wk6(om6 om6, uy6 uy6) {
        this.f22197a = om6;
        this.f22198a = uy6;
    }

    public final void run() {
        om6 om6 = this.f22197a;
        w36 H = om6.f18023a;
        if (H == null) {
            om6.f11205a.mo15136e().mo12726r().mo25379a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f22198a);
            H.mo13651V4(this.f22198a);
        } catch (RemoteException e) {
            this.f22197a.f11205a.mo15136e().mo12726r().mo25380b("Failed to reset data on the service: remote exception", e);
        }
        this.f22197a.mo21996E();
    }
}

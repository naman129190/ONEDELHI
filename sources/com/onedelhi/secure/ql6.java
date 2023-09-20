package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class ql6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f19253a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f19254a;

    public ql6(om6 om6, uy6 uy6) {
        this.f19253a = om6;
        this.f19254a = uy6;
    }

    public final void run() {
        om6 om6 = this.f19253a;
        w36 H = om6.f18023a;
        if (H == null) {
            om6.f11205a.mo15136e().mo12726r().mo25379a("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f19254a);
            H.mo13659o3(this.f19254a);
            this.f19253a.mo21996E();
        } catch (RemoteException e) {
            this.f19253a.f11205a.mo15136e().mo12726r().mo25380b("Failed to send consent settings to the service", e);
        }
    }
}

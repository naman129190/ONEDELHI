package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class ol6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f18012a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f18013a;

    public ol6(om6 om6, uy6 uy6) {
        this.f18012a = om6;
        this.f18013a = uy6;
    }

    public final void run() {
        om6 om6 = this.f18012a;
        w36 H = om6.f18023a;
        if (H == null) {
            om6.f11205a.mo15136e().mo12726r().mo25379a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f18013a);
            H.mo13646I2(this.f18013a);
            this.f18012a.mo21996E();
        } catch (RemoteException e) {
            this.f18012a.f11205a.mo15136e().mo12726r().mo25380b("Failed to send measurementEnabled to the service", e);
        }
    }
}

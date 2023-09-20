package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class gl6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f12663a;

    /* renamed from: a */
    public final /* synthetic */ om6 f12664a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f12665a;

    public gl6(om6 om6, uy6 uy6, Bundle bundle) {
        this.f12664a = om6;
        this.f12665a = uy6;
        this.f12663a = bundle;
    }

    public final void run() {
        om6 om6 = this.f12664a;
        w36 H = om6.f18023a;
        if (H == null) {
            om6.f11205a.mo15136e().mo12726r().mo25379a("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f12665a);
            H.mo13650T3(this.f12663a, this.f12665a);
        } catch (RemoteException e) {
            this.f12664a.f11205a.mo15136e().mo12726r().mo25380b("Failed to send default event parameters to service", e);
        }
    }
}

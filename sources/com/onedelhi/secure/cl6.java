package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class cl6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f10392a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f10393a;

    public cl6(om6 om6, uy6 uy6) {
        this.f10392a = om6;
        this.f10393a = uy6;
    }

    public final void run() {
        om6 om6 = this.f10392a;
        w36 H = om6.f18023a;
        if (H == null) {
            om6.f11205a.mo15136e().mo12726r().mo25379a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f10393a);
            H.mo13657m2(this.f10393a);
            this.f10392a.f11205a.mo27861C().mo15785t();
            this.f10392a.mo22013r(H, (AbstractSafeParcelable) null, this.f10393a);
            this.f10392a.mo21996E();
        } catch (RemoteException e) {
            this.f10392a.f11205a.mo15136e().mo12726r().mo25380b("Failed to send app launch to the service", e);
        }
    }
}

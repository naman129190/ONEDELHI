package com.onedelhi.secure;

import android.os.RemoteException;

public final class el6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ fj6 f11285a;

    /* renamed from: a */
    public final /* synthetic */ om6 f11286a;

    public el6(om6 om6, fj6 fj6) {
        this.f11286a = om6;
        this.f11285a = fj6;
    }

    public final void run() {
        om6 om6 = this.f11286a;
        w36 H = om6.f18023a;
        if (H == null) {
            om6.f11205a.mo15136e().mo12726r().mo25379a("Failed to send current screen to service");
            return;
        }
        try {
            fj6 fj6 = this.f11285a;
            if (fj6 == null) {
                H.mo13666y3(0, (String) null, (String) null, om6.f11205a.mo15137f().getPackageName());
            } else {
                H.mo13666y3(fj6.f12097a, fj6.f12098a, fj6.f12101b, om6.f11205a.mo15137f().getPackageName());
            }
            this.f11286a.mo21996E();
        } catch (RemoteException e) {
            this.f11286a.f11205a.mo15136e().mo12726r().mo25380b("Failed to send current screen to the service", e);
        }
    }
}

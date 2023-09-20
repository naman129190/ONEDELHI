package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class al6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f9402a;

    /* renamed from: a */
    public final /* synthetic */ pt5 f9403a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f9404a;

    public al6(om6 om6, uy6 uy6, pt5 pt5) {
        this.f9402a = om6;
        this.f9404a = uy6;
        this.f9403a = pt5;
    }

    public final void run() {
        String str = null;
        try {
            if (!this.f9402a.f11205a.mo27864F().mo22926q().mo27438i(ne5.ANALYTICS_STORAGE)) {
                this.f9402a.f11205a.mo15136e().mo12732x().mo25379a("Analytics storage consent denied; will not get app instance id");
                this.f9402a.f11205a.mo27866I().mo23877C((String) null);
                this.f9402a.f11205a.mo27864F().f18945a.mo20990b((String) null);
            } else {
                om6 om6 = this.f9402a;
                w36 H = om6.f18023a;
                if (H == null) {
                    om6.f11205a.mo15136e().mo12726r().mo25379a("Failed to get app instance id");
                } else {
                    Preconditions.checkNotNull(this.f9404a);
                    str = H.mo13648R0(this.f9404a);
                    if (str != null) {
                        this.f9402a.f11205a.mo27866I().mo23877C(str);
                        this.f9402a.f11205a.mo27864F().f18945a.mo20990b(str);
                    }
                    this.f9402a.mo21996E();
                }
            }
        } catch (RemoteException e) {
            this.f9402a.f11205a.mo15136e().mo12726r().mo25380b("Failed to get app instance id", e);
        } catch (Throwable th) {
            this.f9402a.f11205a.mo27871N().mo16860K(this.f9403a, (String) null);
            throw th;
        }
        this.f9402a.f11205a.mo27871N().mo16860K(this.f9403a, str);
    }
}

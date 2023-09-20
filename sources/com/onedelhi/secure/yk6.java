package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

public final class yk6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f23205a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f23206a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f23207a;

    public yk6(om6 om6, AtomicReference atomicReference, uy6 uy6) {
        this.f23205a = om6;
        this.f23207a = atomicReference;
        this.f23206a = uy6;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f23207a) {
            try {
                if (!this.f23205a.f11205a.mo27864F().mo22926q().mo27438i(ne5.ANALYTICS_STORAGE)) {
                    this.f23205a.f11205a.mo15136e().mo12732x().mo25379a("Analytics storage consent denied; will not get app instance id");
                    this.f23205a.f11205a.mo27866I().mo23877C((String) null);
                    this.f23205a.f11205a.mo27864F().f18945a.mo20990b((String) null);
                    this.f23207a.set((Object) null);
                    this.f23207a.notify();
                    return;
                }
                om6 om6 = this.f23205a;
                w36 H = om6.f18023a;
                if (H == null) {
                    om6.f11205a.mo15136e().mo12726r().mo25379a("Failed to get app instance id");
                    this.f23207a.notify();
                    return;
                }
                Preconditions.checkNotNull(this.f23206a);
                this.f23207a.set(H.mo13648R0(this.f23206a));
                String str = (String) this.f23207a.get();
                if (str != null) {
                    this.f23205a.f11205a.mo27866I().mo23877C(str);
                    this.f23205a.f11205a.mo27864F().f18945a.mo20990b(str);
                }
                this.f23205a.mo21996E();
                atomicReference = this.f23207a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f23205a.f11205a.mo15136e().mo12726r().mo25380b("Failed to get app instance id", e);
                    atomicReference = this.f23207a;
                } catch (Throwable th) {
                    this.f23207a.notify();
                    throw th;
                }
            }
        }
    }
}

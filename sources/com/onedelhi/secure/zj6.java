package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

public final class zj6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f23743a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f23744a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f23745a;

    /* renamed from: b */
    public final /* synthetic */ boolean f23746b;

    public zj6(om6 om6, AtomicReference atomicReference, uy6 uy6, boolean z) {
        this.f23743a = om6;
        this.f23745a = atomicReference;
        this.f23744a = uy6;
        this.f23746b = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f23745a) {
            try {
                om6 om6 = this.f23743a;
                w36 H = om6.f18023a;
                if (H == null) {
                    om6.f11205a.mo15136e().mo12726r().mo25379a("Failed to get all user properties; not connected to service");
                    this.f23745a.notify();
                    return;
                }
                Preconditions.checkNotNull(this.f23744a);
                this.f23745a.set(H.mo13645E1(this.f23744a, this.f23746b));
                this.f23743a.mo21996E();
                atomicReference = this.f23745a;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f23743a.f11205a.mo15136e().mo12726r().mo25380b("Failed to get all user properties; remote exception", e);
                    atomicReference = this.f23745a;
                } catch (Throwable th) {
                    this.f23745a.notify();
                    throw th;
                }
            }
        }
    }
}

package com.onedelhi.secure;

import android.os.RemoteException;

public final class kl6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ om6 f15011a;

    /* renamed from: a */
    public final /* synthetic */ pt5 f15012a;

    /* renamed from: a */
    public final /* synthetic */ xj5 f15013a;

    /* renamed from: b */
    public final /* synthetic */ String f15014b;

    public kl6(om6 om6, xj5 xj5, String str, pt5 pt5) {
        this.f15011a = om6;
        this.f15013a = xj5;
        this.f15014b = str;
        this.f15012a = pt5;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            om6 om6 = this.f15011a;
            w36 H = om6.f18023a;
            if (H == null) {
                om6.f11205a.mo15136e().mo12726r().mo25379a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = H.mo13665w4(this.f15013a, this.f15014b);
                this.f15011a.mo21996E();
            }
        } catch (RemoteException e) {
            this.f15011a.f11205a.mo15136e().mo12726r().mo25380b("Failed to send event to the service to bundle", e);
        } catch (Throwable th) {
            this.f15011a.f11205a.mo27871N().mo16857H(this.f15012a, bArr);
            throw th;
        }
        this.f15011a.f11205a.mo27871N().mo16857H(this.f15012a, bArr);
    }
}

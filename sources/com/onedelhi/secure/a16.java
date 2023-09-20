package com.onedelhi.secure;

import android.os.RemoteException;

public abstract class a16 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ j36 f8558a;

    /* renamed from: b */
    public final long f8559b;

    /* renamed from: b */
    public final boolean f8560b;

    /* renamed from: c */
    public final long f8561c;

    public a16(j36 j36, boolean z) {
        this.f8558a = j36;
        this.f8559b = j36.f13998a.currentTimeMillis();
        this.f8561c = j36.f13998a.elapsedRealtime();
        this.f8560b = z;
    }

    /* renamed from: a */
    public abstract void mo12479a() throws RemoteException;

    /* renamed from: b */
    public void mo12480b() {
    }

    public final void run() {
        if (this.f8558a.f14004a) {
            mo12480b();
            return;
        }
        try {
            mo12479a();
        } catch (Exception e) {
            this.f8558a.mo18130t(e, false, this.f8560b);
            mo12480b();
        }
    }
}

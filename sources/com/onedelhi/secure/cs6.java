package com.onedelhi.secure;

public final class cs6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ut6 f10493a;

    /* renamed from: a */
    public final /* synthetic */ w94 f10494a;

    public cs6(ut6 ut6, w94 w94) {
        this.f10493a = ut6;
        this.f10494a = w94;
    }

    public final void run() {
        synchronized (this.f10493a.f21524a) {
            ut6 ut6 = this.f10493a;
            if (ut6.f21523a != null) {
                ut6.f21523a.mo7740a(this.f10494a.mo17586r());
            }
        }
    }
}

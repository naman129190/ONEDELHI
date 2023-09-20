package com.onedelhi.secure;

public final class lh5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ kd6 f15394a;

    /* renamed from: a */
    public final /* synthetic */ th5 f15395a;

    public lh5(th5 th5, kd6 kd6) {
        this.f15395a = th5;
        this.f15394a = kd6;
    }

    public final void run() {
        this.f15394a.mo15134c();
        if (rb5.m26621a()) {
            this.f15394a.mo15135d().mo23065z(this);
            return;
        }
        boolean e = this.f15395a.mo25027e();
        this.f15395a.f20848a = 0;
        if (e) {
            this.f15395a.mo17367c();
        }
    }
}

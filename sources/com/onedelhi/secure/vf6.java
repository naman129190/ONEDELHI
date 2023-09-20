package com.onedelhi.secure;

public final class vf6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri6 f21744a;

    /* renamed from: b */
    public final /* synthetic */ long f21745b;

    public vf6(ri6 ri6, long j) {
        this.f21744a = ri6;
        this.f21745b = j;
    }

    public final void run() {
        this.f21744a.f11205a.mo27864F().f18952c.mo15076b(this.f21745b);
        this.f21744a.f11205a.mo15136e().mo12725q().mo25380b("Session timeout duration set", Long.valueOf(this.f21745b));
    }
}

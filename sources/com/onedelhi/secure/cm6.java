package com.onedelhi.secure;

public final class cm6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ mm6 f10407a;

    /* renamed from: a */
    public final /* synthetic */ w36 f10408a;

    public cm6(mm6 mm6, w36 w36) {
        this.f10407a = mm6;
        this.f10408a = w36;
    }

    public final void run() {
        synchronized (this.f10407a) {
            this.f10407a.f16258b = false;
            if (!this.f10407a.f16257a.mo22021z()) {
                this.f10407a.f16257a.f11205a.mo15136e().mo12730v().mo25379a("Connected to service");
                this.f10407a.f16257a.mo22019x(this.f10408a);
            }
        }
    }
}

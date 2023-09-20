package com.onedelhi.secure;

public final class gm6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ mm6 f12668a;

    /* renamed from: a */
    public final /* synthetic */ w36 f12669a;

    public gm6(mm6 mm6, w36 w36) {
        this.f12668a = mm6;
        this.f12669a = w36;
    }

    public final void run() {
        synchronized (this.f12668a) {
            this.f12668a.f16258b = false;
            if (!this.f12668a.f16257a.mo22021z()) {
                this.f12668a.f16257a.f11205a.mo15136e().mo12725q().mo25379a("Connected to remote service");
                this.f12668a.f16257a.mo22019x(this.f12669a);
            }
        }
    }
}

package com.onedelhi.secure;

public final class pc6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ bd6 f18433a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f18434a;

    /* renamed from: a */
    public final /* synthetic */ wq6 f18435a;

    public pc6(bd6 bd6, wq6 wq6, uy6 uy6) {
        this.f18433a = bd6;
        this.f18435a = wq6;
        this.f18434a = uy6;
    }

    public final void run() {
        this.f18433a.f9796a.mo23375b();
        if (this.f18435a.mo26660K2() == null) {
            this.f18433a.f9796a.mo23398u(this.f18435a.f22256b, this.f18434a);
        } else {
            this.f18433a.f9796a.mo23353B(this.f18435a, this.f18434a);
        }
    }
}

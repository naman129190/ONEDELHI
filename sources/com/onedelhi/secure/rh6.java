package com.onedelhi.secure;

public final class rh6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ jk6 f19866a;

    /* renamed from: a */
    public final /* synthetic */ w94 f19867a;

    public rh6(jk6 jk6, w94 w94) {
        this.f19866a = jk6;
        this.f19867a = w94;
    }

    public final void run() {
        synchronized (this.f19866a.f14227a) {
            jk6 jk6 = this.f19866a;
            if (jk6.f14226a != null) {
                jk6.f14226a.onComplete(this.f19867a);
            }
        }
    }
}

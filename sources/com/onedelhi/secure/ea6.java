package com.onedelhi.secure;

public final class ea6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ae6 f11156a;

    public ea6(ae6 ae6) {
        this.f11156a = ae6;
    }

    public final void run() {
        synchronized (this.f11156a.f9035a) {
            ae6 ae6 = this.f11156a;
            if (ae6.f9034a != null) {
                ae6.f9034a.mo14940b();
            }
        }
    }
}

package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicReference;

public final class ch6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri6 f10291a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f10292a;

    public ch6(ri6 ri6, AtomicReference atomicReference) {
        this.f10291a = ri6;
        this.f10292a = atomicReference;
    }

    public final void run() {
        synchronized (this.f10292a) {
            try {
                this.f10292a.set(this.f10291a.f11205a.mo27891z().mo14131x(this.f10291a.f11205a.mo27860B().mo27795s(), n36.f17028L));
                this.f10292a.notify();
            } catch (Throwable th) {
                this.f10292a.notify();
                throw th;
            }
        }
    }
}

package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicReference;

public final class bi6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri6 f9842a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f9843a;

    public bi6(ri6 ri6, AtomicReference atomicReference) {
        this.f9842a = ri6;
        this.f9843a = atomicReference;
    }

    public final void run() {
        synchronized (this.f9843a) {
            try {
                this.f9843a.set(Integer.valueOf(this.f9842a.f11205a.mo27891z().mo14122o(this.f9842a.f11205a.mo27860B().mo27795s(), n36.f17030N)));
                this.f9843a.notify();
            } catch (Throwable th) {
                this.f9843a.notify();
                throw th;
            }
        }
    }
}

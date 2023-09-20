package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicReference;

public final class eh6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri6 f11232a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f11233a;

    public eh6(ri6 ri6, AtomicReference atomicReference) {
        this.f11232a = ri6;
        this.f11233a = atomicReference;
    }

    public final void run() {
        synchronized (this.f11233a) {
            try {
                this.f11233a.set(Long.valueOf(this.f11232a.f11205a.mo27891z().mo14125r(this.f11232a.f11205a.mo27860B().mo27795s(), n36.f17029M)));
                this.f11233a.notify();
            } catch (Throwable th) {
                this.f11233a.notify();
                throw th;
            }
        }
    }
}

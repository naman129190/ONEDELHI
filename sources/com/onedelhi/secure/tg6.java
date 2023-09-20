package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicReference;

public final class tg6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri6 f20825a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f20826a;

    public tg6(ri6 ri6, AtomicReference atomicReference) {
        this.f20825a = ri6;
        this.f20826a = atomicReference;
    }

    public final void run() {
        synchronized (this.f20826a) {
            try {
                this.f20826a.set(Boolean.valueOf(this.f20825a.f11205a.mo27891z().mo14110B(this.f20825a.f11205a.mo27860B().mo27795s(), n36.f17027K)));
                this.f20826a.notify();
            } catch (Throwable th) {
                this.f20826a.notify();
                throw th;
            }
        }
    }
}

package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicReference;

public final class di6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri6 f10786a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f10787a;

    public di6(ri6 ri6, AtomicReference atomicReference) {
        this.f10786a = ri6;
        this.f10787a = atomicReference;
    }

    public final void run() {
        synchronized (this.f10787a) {
            try {
                this.f10787a.set(Double.valueOf(this.f10786a.f11205a.mo27891z().mo14118k(this.f10786a.f11205a.mo27860B().mo27795s(), n36.f17031O)));
                this.f10787a.notify();
            } catch (Throwable th) {
                this.f10787a.notify();
                throw th;
            }
        }
    }
}

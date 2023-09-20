package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicReference;

public final class eg6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri6 f11217a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f11218a;

    /* renamed from: b */
    public final /* synthetic */ boolean f11219b;

    public eg6(ri6 ri6, AtomicReference atomicReference, boolean z) {
        this.f11217a = ri6;
        this.f11218a = atomicReference;
        this.f11219b = z;
    }

    public final void run() {
        this.f11217a.f11205a.mo27869L().mo22007V(this.f11218a, this.f11219b);
    }
}

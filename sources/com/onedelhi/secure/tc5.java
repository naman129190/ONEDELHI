package com.onedelhi.secure;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class tc5<T> implements fd5<T> {

    /* renamed from: a */
    public final CountDownLatch f20747a = new CountDownLatch(1);

    public tc5() {
    }

    public /* synthetic */ tc5(gc5 gc5) {
    }

    /* renamed from: a */
    public final void mo7740a(T t) {
        this.f20747a.countDown();
    }

    /* renamed from: b */
    public final void mo14940b() {
        this.f20747a.countDown();
    }

    /* renamed from: c */
    public final void mo7919c(@mr2 Exception exc) {
        this.f20747a.countDown();
    }

    /* renamed from: d */
    public final void mo24863d() throws InterruptedException {
        this.f20747a.await();
    }

    /* renamed from: e */
    public final boolean mo24864e(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f20747a.await(j, timeUnit);
    }
}

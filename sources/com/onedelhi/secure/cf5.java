package com.onedelhi.secure;

import android.location.Location;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class cf5 implements nu2 {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f10234a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f10235a;

    public /* synthetic */ cf5(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f10235a = atomicReference;
        this.f10234a = countDownLatch;
    }

    public final void onComplete(w94 w94) {
        AtomicReference atomicReference = this.f10235a;
        CountDownLatch countDownLatch = this.f10234a;
        if (w94.mo17590v()) {
            atomicReference.set((Location) w94.mo17586r());
        }
        countDownLatch.countDown();
    }
}

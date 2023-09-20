package com.onedelhi.secure;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.onedelhi.secure.th */
public final class C6876th implements nu2<Void> {

    /* renamed from: a */
    public final CountDownLatch f35624a = new CountDownLatch(1);

    /* renamed from: a */
    public boolean mo45029a(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f35624a.await(j, timeUnit);
    }

    /* renamed from: b */
    public void mo45030b() {
        this.f35624a.countDown();
    }

    public void onComplete(@mr2 w94<Void> w94) {
        this.f35624a.countDown();
    }
}

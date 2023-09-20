package com.onedelhi.secure;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class vq4 implements c80 {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f36648a;

    public /* synthetic */ vq4(CountDownLatch countDownLatch) {
        this.f36648a = countDownLatch;
    }

    public final Object then(w94 w94) {
        return this.f36648a.countDown();
    }
}

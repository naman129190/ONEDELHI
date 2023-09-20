package com.onedelhi.secure;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class qi3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri3 f34256a;

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f34257a;

    public /* synthetic */ qi3(ri3 ri3, CountDownLatch countDownLatch) {
        this.f34256a = ri3;
        this.f34257a = countDownLatch;
    }

    public final void run() {
        this.f34256a.m63659m(this.f34257a);
    }
}

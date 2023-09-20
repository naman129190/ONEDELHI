package com.onedelhi.secure;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final /* synthetic */ class wq4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ x94 f37090a;

    /* renamed from: a */
    public final /* synthetic */ Callable f37091a;

    /* renamed from: a */
    public final /* synthetic */ Executor f37092a;

    public /* synthetic */ wq4(Callable callable, Executor executor, x94 x94) {
        this.f37091a = callable;
        this.f37092a = executor;
        this.f37090a = x94;
    }

    public final void run() {
        zq4.m74247k(this.f37091a, this.f37092a, this.f37090a);
    }
}

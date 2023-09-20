package com.onedelhi.secure;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class f55 implements d55 {
    public f55() {
    }

    public /* synthetic */ f55(e55 e55) {
    }

    /* renamed from: a */
    public final ExecutorService mo14528a(ThreadFactory threadFactory, int i) {
        return mo14529b(1, threadFactory, 1);
    }

    /* renamed from: b */
    public final ExecutorService mo14529b(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: c */
    public final ExecutorService mo14530c(int i, int i2) {
        return mo14529b(4, Executors.defaultThreadFactory(), 2);
    }
}

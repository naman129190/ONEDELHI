package com.onedelhi.secure;

import android.annotation.SuppressLint;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class l33 {

    /* renamed from: a */
    public static final ax0 f31538a;

    /* renamed from: b */
    public static volatile ax0 f31539b;

    /* renamed from: com.onedelhi.secure.l33$b */
    public static class C5959b implements ax0 {

        /* renamed from: a */
        public static final long f31540a = 60;

        public C5959b() {
        }

        @mr2
        @SuppressLint({"ThreadPoolCreation"})
        /* renamed from: a */
        public void mo31242a(@e20 String str, @e20 String str2, bc4 bc4, Runnable runnable) {
            new Thread(runnable, str2).start();
        }

        @mr2
        /* renamed from: b */
        public ExecutorService mo31243b(bc4 bc4) {
            return mo31250i(1, bc4);
        }

        @mr2
        @SuppressLint({"ThreadPoolCreation"})
        /* renamed from: c */
        public ExecutorService mo31244c(ThreadFactory threadFactory, bc4 bc4) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory));
        }

        @mr2
        @SuppressLint({"ThreadPoolCreation"})
        /* renamed from: d */
        public ExecutorService mo31245d(bc4 bc4) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        }

        @mr2
        @SuppressLint({"ThreadPoolCreation"})
        /* renamed from: e */
        public Future<?> mo31246e(@e20 String str, @e20 String str2, bc4 bc4, Runnable runnable) {
            FutureTask futureTask = new FutureTask(runnable, (Object) null);
            new Thread(futureTask, str2).start();
            return futureTask;
        }

        @mr2
        @SuppressLint({"ThreadPoolCreation"})
        /* renamed from: f */
        public ExecutorService mo31247f(int i, ThreadFactory threadFactory, bc4 bc4) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }

        @mr2
        @SuppressLint({"ThreadPoolCreation"})
        /* renamed from: g */
        public ScheduledExecutorService mo31248g(int i, bc4 bc4) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i));
        }

        @mr2
        @SuppressLint({"ThreadPoolCreation"})
        /* renamed from: h */
        public ScheduledExecutorService mo31249h(int i, ThreadFactory threadFactory, bc4 bc4) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i, threadFactory));
        }

        @mr2
        /* renamed from: i */
        public ExecutorService mo31250i(int i, bc4 bc4) {
            return mo31247f(i, Executors.defaultThreadFactory(), bc4);
        }

        @mr2
        /* renamed from: j */
        public ExecutorService mo31251j(ThreadFactory threadFactory, bc4 bc4) {
            return mo31247f(1, threadFactory, bc4);
        }
    }

    static {
        C5959b bVar = new C5959b();
        f31538a = bVar;
        f31539b = bVar;
    }

    /* renamed from: a */
    public static ax0 m55254a() {
        return f31539b;
    }

    /* renamed from: b */
    public static void m55255b(ax0 ax0) {
        if (f31539b == f31538a) {
            f31539b = ax0;
            return;
        }
        throw new IllegalStateException("Trying to install an ExecutorFactory twice!");
    }
}

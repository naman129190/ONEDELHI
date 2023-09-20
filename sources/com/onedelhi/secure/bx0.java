package com.onedelhi.secure;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class bx0 {

    /* renamed from: a */
    public static final long f26558a = 2;

    /* renamed from: com.onedelhi.secure.bx0$a */
    public class C4709a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f26559a;

        /* renamed from: a */
        public final /* synthetic */ AtomicLong f26560a;

        /* renamed from: com.onedelhi.secure.bx0$a$a */
        public class C4710a extends C6446pi {

            /* renamed from: a */
            public final /* synthetic */ Runnable f26562a;

            public C4710a(Runnable runnable) {
                this.f26562a = runnable;
            }

            /* renamed from: a */
            public void mo32183a() {
                this.f26562a.run();
            }
        }

        public C4709a(String str, AtomicLong atomicLong) {
            this.f26559a = str;
            this.f26560a = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C4710a(runnable));
            newThread.setName(this.f26559a + this.f26560a.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: com.onedelhi.secure.bx0$b */
    public class C4711b extends C6446pi {

        /* renamed from: a */
        public final /* synthetic */ ExecutorService f26563a;

        /* renamed from: a */
        public final /* synthetic */ TimeUnit f26564a;

        /* renamed from: b */
        public final /* synthetic */ long f26565b;

        /* renamed from: b */
        public final /* synthetic */ String f26566b;

        public C4711b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f26566b = str;
            this.f26563a = executorService;
            this.f26565b = j;
            this.f26564a = timeUnit;
        }

        /* renamed from: a */
        public void mo32183a() {
            try {
                o92 f = o92.m59120f();
                f.mo41613b("Executing shutdown hook for " + this.f26566b);
                this.f26563a.shutdown();
                if (!this.f26563a.awaitTermination(this.f26565b, this.f26564a)) {
                    o92 f2 = o92.m59120f();
                    f2.mo41613b(this.f26566b + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f26563a.shutdownNow();
                }
            } catch (InterruptedException unused) {
                o92.m59120f().mo41613b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f26566b}));
                this.f26563a.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    public static void m40607a(String str, ExecutorService executorService) {
        m40608b(str, executorService, 2, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: b */
    public static void m40608b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C4711b bVar = new C4711b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m40609c(String str) {
        ExecutorService f = m40612f(m40611e(str), new ThreadPoolExecutor.DiscardPolicy());
        m40607a(str, f);
        return f;
    }

    /* renamed from: d */
    public static ScheduledExecutorService m40610d(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(m40611e(str));
        m40607a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    /* renamed from: e */
    public static ThreadFactory m40611e(String str) {
        return new C4709a(str, new AtomicLong(1));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: f */
    public static ExecutorService m40612f(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}

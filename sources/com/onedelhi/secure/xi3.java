package com.onedelhi.secure;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class xi3 {

    /* renamed from: com.onedelhi.secure.xi3$a */
    public static class C3923a implements ThreadFactory {

        /* renamed from: a */
        public int f22585a;

        /* renamed from: a */
        public String f22586a;

        /* renamed from: com.onedelhi.secure.xi3$a$a */
        public static class C3924a extends Thread {

            /* renamed from: n */
            public final int f22587n;

            public C3924a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f22587n = i;
            }

            public void run() {
                Process.setThreadPriority(this.f22587n);
                super.run();
            }
        }

        public C3923a(@mr2 String str, int i) {
            this.f22586a = str;
            this.f22585a = i;
        }

        public Thread newThread(Runnable runnable) {
            return new C3924a(runnable, this.f22586a, this.f22585a);
        }
    }

    /* renamed from: com.onedelhi.secure.xi3$b */
    public static class C3925b implements Executor {

        /* renamed from: a */
        public final Handler f22588a;

        public C3925b(@mr2 Handler handler) {
            this.f22588a = (Handler) k43.m19455l(handler);
        }

        public void execute(@mr2 Runnable runnable) {
            if (!this.f22588a.post((Runnable) k43.m19455l(runnable))) {
                throw new RejectedExecutionException(this.f22588a + " is shutting down");
            }
        }
    }

    /* renamed from: com.onedelhi.secure.xi3$c */
    public static class C3926c<T> implements Runnable {
        @mr2

        /* renamed from: a */
        public Handler f22589a;
        @mr2

        /* renamed from: a */
        public s60<T> f22590a;
        @mr2

        /* renamed from: a */
        public Callable<T> f22591a;

        /* renamed from: com.onedelhi.secure.xi3$c$a */
        public class C3927a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ s60 f22592a;

            /* renamed from: a */
            public final /* synthetic */ Object f22594a;

            public C3927a(s60 s60, Object obj) {
                this.f22592a = s60;
                this.f22594a = obj;
            }

            public void run() {
                this.f22592a.accept(this.f22594a);
            }
        }

        public C3926c(@mr2 Handler handler, @mr2 Callable<T> callable, @mr2 s60<T> s60) {
            this.f22591a = callable;
            this.f22590a = s60;
            this.f22589a = handler;
        }

        public void run() {
            T t;
            try {
                t = this.f22591a.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f22589a.post(new C3927a(this.f22590a, t));
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m31476a(@mr2 String str, int i, @js1(from = 0) int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C3923a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static Executor m31477b(@mr2 Handler handler) {
        return new C3925b(handler);
    }

    /* renamed from: c */
    public static <T> void m31478c(@mr2 Executor executor, @mr2 Callable<T> callable, @mr2 s60<T> s60) {
        executor.execute(new C3926c(C1804bt.m12056a(), callable, s60));
    }

    /* renamed from: d */
    public static <T> T m31479d(@mr2 ExecutorService executorService, @mr2 Callable<T> callable, @js1(from = 0) int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}

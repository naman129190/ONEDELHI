package com.onedelhi.secure;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class cx0 {

    /* renamed from: a */
    public static final Executor f10510a = new C1925a();

    /* renamed from: b */
    public static final Executor f10511b = new C1926b();

    /* renamed from: com.onedelhi.secure.cx0$a */
    public class C1925a implements Executor {
        public void execute(@mr2 Runnable runnable) {
            oq4.m24036x(runnable);
        }
    }

    /* renamed from: com.onedelhi.secure.cx0$b */
    public class C1926b implements Executor {
        public void execute(@mr2 Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m12784a() {
        return f10511b;
    }

    /* renamed from: b */
    public static Executor m12785b() {
        return f10510a;
    }

    @hw4
    /* renamed from: c */
    public static void m12786c(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5, timeUnit)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(5, timeUnit)) {
                    throw new RuntimeException("Failed to shutdown");
                }
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}

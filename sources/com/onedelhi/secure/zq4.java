package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zq4 {

    /* renamed from: a */
    public static final int f38410a = 4;

    /* renamed from: a */
    public static final ExecutorService f38411a = bx0.m40609c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: f */
    public static <T> T m74242f(w94<T> w94) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        w94.mo17582n(f38411a, new vq4(countDownLatch));
        countDownLatch.await(Looper.getMainLooper() == Looper.myLooper() ? 3 : 4, TimeUnit.SECONDS);
        if (w94.mo17590v()) {
            return w94.mo17586r();
        }
        if (w94.mo17588t()) {
            throw new CancellationException("Task is already canceled");
        } else if (w94.mo17589u()) {
            throw new IllegalStateException(w94.mo17585q());
        } else {
            throw new TimeoutException();
        }
    }

    /* renamed from: g */
    public static boolean m74243g(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        long nanos;
        boolean await;
        boolean z = false;
        try {
            nanos = timeUnit.toNanos(j);
            while (true) {
                await = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return await;
        } catch (InterruptedException unused) {
            z = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    /* renamed from: h */
    public static <T> w94<T> m74244h(Executor executor, Callable<w94<T>> callable) {
        x94 x94 = new x94();
        executor.execute(new wq4(callable, executor, x94));
        return x94.mo26835a();
    }

    /* renamed from: j */
    public static /* synthetic */ Object m74246j(x94 x94, w94 w94) throws Exception {
        if (w94.mo17590v()) {
            x94.mo26837c(w94.mo17586r());
            return null;
        } else if (w94.mo17585q() == null) {
            return null;
        } else {
            x94.mo26836b(w94.mo17585q());
            return null;
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m74247k(Callable callable, Executor executor, x94 x94) {
        try {
            ((w94) callable.call()).mo17582n(executor, new uq4(x94));
        } catch (Exception e) {
            x94.mo26836b(e);
        }
    }

    /* renamed from: l */
    public static /* synthetic */ Void m74248l(x94 x94, w94 w94) throws Exception {
        if (w94.mo17590v()) {
            x94.mo26839e(w94.mo17586r());
            return null;
        } else if (w94.mo17585q() == null) {
            return null;
        } else {
            x94.mo26838d(w94.mo17585q());
            return null;
        }
    }

    /* renamed from: m */
    public static /* synthetic */ Void m74249m(x94 x94, w94 w94) throws Exception {
        if (w94.mo17590v()) {
            x94.mo26839e(w94.mo17586r());
            return null;
        } else if (w94.mo17585q() == null) {
            return null;
        } else {
            x94.mo26838d(w94.mo17585q());
            return null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: n */
    public static <T> w94<T> m74250n(w94<T> w94, w94<T> w942) {
        x94 x94 = new x94();
        tq4 tq4 = new tq4(x94);
        w94.mo17581m(tq4);
        w942.mo17581m(tq4);
        return x94.mo26835a();
    }

    /* renamed from: o */
    public static <T> w94<T> m74251o(Executor executor, w94<T> w94, w94<T> w942) {
        x94 x94 = new x94();
        sq4 sq4 = new sq4(x94);
        w94.mo17582n(executor, sq4);
        w942.mo17582n(executor, sq4);
        return x94.mo26835a();
    }
}

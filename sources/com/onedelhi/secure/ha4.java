package com.onedelhi.secure;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ha4 {
    /* renamed from: a */
    public static <TResult> TResult m16566a(@mr2 w94<TResult> w94) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(w94, "Task must not be null");
        if (w94.mo17589u()) {
            return m16580o(w94);
        }
        tc5 tc5 = new tc5((gc5) null);
        m16581p(w94, tc5);
        tc5.mo24863d();
        return m16580o(w94);
    }

    /* renamed from: b */
    public static <TResult> TResult m16567b(@mr2 w94<TResult> w94, long j, @mr2 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(w94, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (w94.mo17589u()) {
            return m16580o(w94);
        }
        tc5 tc5 = new tc5((gc5) null);
        m16581p(w94, tc5);
        if (tc5.mo24864e(j, timeUnit)) {
            return m16580o(w94);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @mr2
    @Deprecated
    /* renamed from: c */
    public static <TResult> w94<TResult> m16568c(@mr2 Callable<TResult> callable) {
        return m16569d(ba4.f9784a, callable);
    }

    @mr2
    @Deprecated
    /* renamed from: d */
    public static <TResult> w94<TResult> m16569d(@mr2 Executor executor, @mr2 Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        i47 i47 = new i47();
        executor.execute(new d67(i47, callable));
        return i47;
    }

    @mr2
    /* renamed from: e */
    public static <TResult> w94<TResult> m16570e() {
        i47 i47 = new i47();
        i47.mo17562A();
        return i47;
    }

    @mr2
    /* renamed from: f */
    public static <TResult> w94<TResult> m16571f(@mr2 Exception exc) {
        i47 i47 = new i47();
        i47.mo17593y(exc);
        return i47;
    }

    @mr2
    /* renamed from: g */
    public static <TResult> w94<TResult> m16572g(TResult tresult) {
        i47 i47 = new i47();
        i47.mo17594z(tresult);
        return i47;
    }

    @mr2
    /* renamed from: h */
    public static w94<Void> m16573h(@ts2 Collection<? extends w94<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m16572g((Object) null);
        }
        for (w94 requireNonNull : collection) {
            Objects.requireNonNull(requireNonNull, "null tasks are not accepted");
        }
        i47 i47 = new i47();
        rd5 rd5 = new rd5(collection.size(), i47);
        for (w94 p : collection) {
            m16581p(p, rd5);
        }
        return i47;
    }

    @mr2
    /* renamed from: i */
    public static w94<Void> m16574i(@ts2 w94<?>... w94Arr) {
        return (w94Arr == null || w94Arr.length == 0) ? m16572g((Object) null) : m16573h(Arrays.asList(w94Arr));
    }

    @mr2
    /* renamed from: j */
    public static w94<List<w94<?>>> m16575j(@ts2 Collection<? extends w94<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m16572g(Collections.emptyList());
        }
        return m16573h(collection).mo17584p(ba4.f9784a, new sb5(collection));
    }

    @mr2
    /* renamed from: k */
    public static w94<List<w94<?>>> m16576k(@ts2 w94<?>... w94Arr) {
        return (w94Arr == null || w94Arr.length == 0) ? m16572g(Collections.emptyList()) : m16575j(Arrays.asList(w94Arr));
    }

    @mr2
    /* renamed from: l */
    public static <TResult> w94<List<TResult>> m16577l(@ts2 Collection<? extends w94> collection) {
        if (collection == null || collection.isEmpty()) {
            return m16572g(Collections.emptyList());
        }
        return m16573h(collection).mo17582n(ba4.f9784a, new eb5(collection));
    }

    @mr2
    /* renamed from: m */
    public static <TResult> w94<List<TResult>> m16578m(@ts2 w94... w94Arr) {
        return (w94Arr == null || w94Arr.length == 0) ? m16572g(Collections.emptyList()) : m16577l(Arrays.asList(w94Arr));
    }

    @mr2
    /* renamed from: n */
    public static <T> w94<T> m16579n(@mr2 w94<T> w94, long j, @mr2 TimeUnit timeUnit) {
        Preconditions.checkNotNull(w94, "Task must not be null");
        Preconditions.checkArgument(j > 0, "Timeout must be positive");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        ql5 ql5 = new ql5();
        x94 x94 = new x94(ql5);
        ea5 ea5 = new ea5(Looper.getMainLooper());
        ea5.postDelayed(new y47(x94), timeUnit.toMillis(j));
        w94.mo17573e(new o57(ea5, x94, ql5));
        return x94.mo26835a();
    }

    /* renamed from: o */
    public static Object m16580o(@mr2 w94 w94) throws ExecutionException {
        if (w94.mo17590v()) {
            return w94.mo17586r();
        }
        if (w94.mo17588t()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(w94.mo17585q());
    }

    /* renamed from: p */
    public static void m16581p(w94 w94, fd5 fd5) {
        Executor executor = ba4.f9785b;
        w94.mo17580l(executor, fd5);
        w94.mo17577i(executor, fd5);
        w94.mo17571c(executor, fd5);
    }
}

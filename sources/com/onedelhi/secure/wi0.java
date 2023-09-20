package com.onedelhi.secure;

import com.onedelhi.secure.xi0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class wi0 implements ScheduledExecutorService {

    /* renamed from: a */
    public final ExecutorService f36999a;

    /* renamed from: a */
    public final ScheduledExecutorService f37000a;

    public wi0(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f36999a = executorService;
        this.f37000a = scheduledExecutorService;
    }

    /* renamed from: m */
    public static /* synthetic */ void m69372m(Runnable runnable, xi0.C7258b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e) {
            bVar.mo47193a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m69373n(Runnable runnable, xi0.C7258b bVar) {
        this.f36999a.execute(new ti0(runnable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ ScheduledFuture m69374o(Runnable runnable, long j, TimeUnit timeUnit, xi0.C7258b bVar) {
        return this.f37000a.schedule(new qi0(this, runnable, bVar), j, timeUnit);
    }

    /* renamed from: p */
    public static /* synthetic */ void m69375p(Callable callable, xi0.C7258b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e) {
            bVar.mo47193a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Future m69376q(Callable callable, xi0.C7258b bVar) throws Exception {
        return this.f36999a.submit(new li0(callable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ ScheduledFuture m69377r(Callable callable, long j, TimeUnit timeUnit, xi0.C7258b bVar) {
        return this.f37000a.schedule(new mi0(this, callable, bVar), j, timeUnit);
    }

    /* renamed from: s */
    public static /* synthetic */ void m69378s(Runnable runnable, xi0.C7258b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.mo47193a(e);
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m69379t(Runnable runnable, xi0.C7258b bVar) {
        this.f36999a.execute(new ui0(runnable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ ScheduledFuture m69380u(Runnable runnable, long j, long j2, TimeUnit timeUnit, xi0.C7258b bVar) {
        return this.f37000a.scheduleAtFixedRate(new ri0(this, runnable, bVar), j, j2, timeUnit);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m69381v(Runnable runnable, xi0.C7258b bVar) {
        this.f36999a.execute(new vi0(runnable, bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ ScheduledFuture m69382w(Runnable runnable, long j, long j2, TimeUnit timeUnit, xi0.C7258b bVar) {
        return this.f37000a.scheduleWithFixedDelay(new si0(this, runnable, bVar), j, j2, timeUnit);
    }

    /* renamed from: x */
    public static /* synthetic */ void m69383x(Runnable runnable, xi0.C7258b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.mo47193a(e);
        }
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f36999a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f36999a.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f36999a.invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f36999a.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return this.f36999a.invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f36999a.invokeAny(collection, j, timeUnit);
    }

    public boolean isShutdown() {
        return this.f36999a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f36999a.isTerminated();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return new xi0(new oi0(this, runnable, j, timeUnit));
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return new xi0(new pi0(this, callable, j, timeUnit));
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new xi0(new ki0(this, runnable, j, j2, timeUnit));
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return new xi0(new ni0(this, runnable, j, j2, timeUnit));
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public Future<?> submit(Runnable runnable) {
        return this.f36999a.submit(runnable);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f36999a.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f36999a.submit(callable);
    }
}

package com.onedelhi.secure;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class ca0 {

    /* renamed from: a */
    public w94<Void> f26699a = ha4.m16572g(null);

    /* renamed from: a */
    public final Object f26700a = new Object();

    /* renamed from: a */
    public final ThreadLocal<Boolean> f26701a = new ThreadLocal<>();

    /* renamed from: a */
    public final Executor f26702a;

    /* renamed from: com.onedelhi.secure.ca0$a */
    public class C4744a implements Runnable {
        public C4744a() {
        }

        public void run() {
            ca0.this.f26701a.set(Boolean.TRUE);
        }
    }

    /* renamed from: com.onedelhi.secure.ca0$b */
    public class C4745b implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ Runnable f26705a;

        public C4745b(Runnable runnable) {
            this.f26705a = runnable;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            this.f26705a.run();
            return null;
        }
    }

    /* renamed from: com.onedelhi.secure.ca0$c */
    public class C4746c implements c80<Void, T> {

        /* renamed from: a */
        public final /* synthetic */ Callable f26707a;

        public C4746c(Callable callable) {
            this.f26707a = callable;
        }

        public T then(@mr2 w94<Void> w94) throws Exception {
            return this.f26707a.call();
        }
    }

    /* renamed from: com.onedelhi.secure.ca0$d */
    public class C4747d implements c80<T, Void> {
        public C4747d() {
        }

        /* renamed from: a */
        public Void then(@mr2 w94<T> w94) throws Exception {
            return null;
        }
    }

    public ca0(Executor executor) {
        this.f26702a = executor;
        executor.execute(new C4744a());
    }

    /* renamed from: b */
    public void mo32268b() {
        if (!mo32271e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor mo32269c() {
        return this.f26702a;
    }

    /* renamed from: d */
    public final <T> w94<Void> mo32270d(w94<T> w94) {
        return w94.mo17582n(this.f26702a, new C4747d());
    }

    /* renamed from: e */
    public final boolean mo32271e() {
        return Boolean.TRUE.equals(this.f26701a.get());
    }

    /* renamed from: f */
    public final <T> c80<Void, T> mo32272f(Callable<T> callable) {
        return new C4746c(callable);
    }

    /* renamed from: g */
    public w94<Void> mo32273g(Runnable runnable) {
        return mo32274h(new C4745b(runnable));
    }

    /* renamed from: h */
    public <T> w94<T> mo32274h(Callable<T> callable) {
        w94<TContinuationResult> n;
        synchronized (this.f26700a) {
            n = this.f26699a.mo17582n(this.f26702a, mo32272f(callable));
            this.f26699a = mo32270d(n);
        }
        return n;
    }

    /* renamed from: i */
    public <T> w94<T> mo32275i(Callable<w94<T>> callable) {
        w94<TContinuationResult> p;
        synchronized (this.f26700a) {
            p = this.f26699a.mo17584p(this.f26702a, mo32272f(callable));
            this.f26699a = mo32270d(p);
        }
        return p;
    }
}

package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zi3<R> implements ld1<R>, ej3<R> {

    /* renamed from: b */
    public static final C4097a f23708b = new C4097a();
    @mj1("this")
    @ts2

    /* renamed from: a */
    public si3 f23709a;
    @mj1("this")
    @ts2

    /* renamed from: a */
    public yg1 f23710a;

    /* renamed from: a */
    public final C4097a f23711a;
    @mj1("this")
    @ts2

    /* renamed from: a */
    public R f23712a;

    /* renamed from: b */
    public final boolean f23713b;
    @mj1("this")

    /* renamed from: c */
    public boolean f23714c;
    @mj1("this")

    /* renamed from: d */
    public boolean f23715d;
    @mj1("this")

    /* renamed from: e */
    public boolean f23716e;

    /* renamed from: n */
    public final int f23717n;

    /* renamed from: o */
    public final int f23718o;

    @hw4
    /* renamed from: com.onedelhi.secure.zi3$a */
    public static class C4097a {
        /* renamed from: a */
        public void mo28001a(Object obj) {
            obj.notifyAll();
        }

        /* renamed from: b */
        public void mo28002b(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    public zi3(int i, int i2) {
        this(i, i2, true, f23708b);
    }

    public zi3(int i, int i2, boolean z, C4097a aVar) {
        this.f23717n = i;
        this.f23718o = i2;
        this.f23713b = z;
        this.f23711a = aVar;
    }

    /* renamed from: a */
    public synchronized void mo16333a(@ts2 si3 si3) {
        this.f23709a = si3;
    }

    /* renamed from: b */
    public synchronized void mo16019b(@ts2 Drawable drawable) {
    }

    /* renamed from: c */
    public void mo15993c() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            return r3
        L_0x000a:
            r0 = 1
            r2.f23714c = r0     // Catch:{ all -> 0x0021 }
            com.onedelhi.secure.zi3$a r1 = r2.f23711a     // Catch:{ all -> 0x0021 }
            r1.mo28001a(r2)     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r3 == 0) goto L_0x001a
            com.onedelhi.secure.si3 r3 = r2.f23709a     // Catch:{ all -> 0x0021 }
            r2.f23709a = r1     // Catch:{ all -> 0x0021 }
            r1 = r3
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0020
            r1.clear()
        L_0x0020:
            return r0
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zi3.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public void mo15995d() {
    }

    /* renamed from: e */
    public void mo14955e(@mr2 uz3 uz3) {
        uz3.mo19958e(this.f23717n, this.f23718o);
    }

    /* renamed from: f */
    public synchronized boolean mo15213f(@ts2 yg1 yg1, Object obj, s94<R> s94, boolean z) {
        this.f23716e = true;
        this.f23710a = yg1;
        this.f23711a.mo28001a(this);
        return false;
    }

    /* renamed from: g */
    public void mo15999g() {
    }

    public R get() throws InterruptedException, ExecutionException {
        try {
            return mo28000j((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public R get(long j, @mr2 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo28000j(Long.valueOf(timeUnit.toMillis(j)));
    }

    /* renamed from: h */
    public void mo16334h(@ts2 Drawable drawable) {
    }

    /* renamed from: i */
    public synchronized boolean mo15214i(R r, Object obj, s94<R> s94, vd0 vd0, boolean z) {
        this.f23715d = true;
        this.f23712a = r;
        this.f23711a.mo28001a(this);
        return false;
    }

    public synchronized boolean isCancelled() {
        return this.f23714c;
    }

    public synchronized boolean isDone() {
        return this.f23714c || this.f23715d || this.f23716e;
    }

    /* renamed from: j */
    public final synchronized R mo28000j(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f23713b && !isDone()) {
            oq4.m24013a();
        }
        if (this.f23714c) {
            throw new CancellationException();
        } else if (this.f23716e) {
            throw new ExecutionException(this.f23710a);
        } else if (this.f23715d) {
            return this.f23712a;
        } else {
            if (l == null) {
                this.f23711a.mo28002b(this, 0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f23711a.mo28002b(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f23716e) {
                throw new ExecutionException(this.f23710a);
            } else if (this.f23714c) {
                throw new CancellationException();
            } else if (this.f23715d) {
                return this.f23712a;
            } else {
                throw new TimeoutException();
            }
        }
    }

    @ts2
    /* renamed from: m */
    public synchronized si3 mo16335m() {
        return this.f23709a;
    }

    /* renamed from: p */
    public void mo16336p(@ts2 Drawable drawable) {
    }

    /* renamed from: r */
    public void mo14956r(@mr2 uz3 uz3) {
    }

    /* renamed from: s */
    public synchronized void mo16021s(@mr2 R r, @ts2 jh4<? super R> jh4) {
    }
}

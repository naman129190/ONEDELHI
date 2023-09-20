package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class qa6 extends hd6 {

    /* renamed from: a */
    public static final AtomicLong f19043a = new AtomicLong(Long.MIN_VALUE);
    @ts2

    /* renamed from: a */
    public q96 f19044a;

    /* renamed from: a */
    public final Object f19045a = new Object();

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f19046a = new k96(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: a */
    public final BlockingQueue f19047a = new LinkedBlockingQueue();

    /* renamed from: a */
    public final PriorityBlockingQueue f19048a = new PriorityBlockingQueue();

    /* renamed from: a */
    public final Semaphore f19049a = new Semaphore(2);
    @ts2

    /* renamed from: b */
    public q96 f19050b;

    /* renamed from: b */
    public final Thread.UncaughtExceptionHandler f19051b = new k96(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: b */
    public volatile boolean f19052b;

    public qa6(za6 za6) {
        super(za6);
    }

    /* renamed from: A */
    public final void mo23058A(Runnable runnable) throws IllegalStateException {
        mo17201k();
        Preconditions.checkNotNull(runnable);
        mo23060D(new n96(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean mo23059C() {
        return Thread.currentThread() == this.f19044a;
    }

    /* renamed from: D */
    public final void mo23060D(n96 n96) {
        synchronized (this.f19045a) {
            this.f19048a.add(n96);
            q96 q96 = this.f19044a;
            if (q96 == null) {
                q96 q962 = new q96(this, "Measurement Worker", this.f19048a);
                this.f19044a = q962;
                q962.setUncaughtExceptionHandler(this.f19046a);
                this.f19044a.start();
            } else {
                q96.mo22959a();
            }
        }
    }

    /* renamed from: g */
    public final void mo15138g() {
        if (Thread.currentThread() != this.f19050b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: h */
    public final void mo15139h() {
        if (Thread.currentThread() != this.f19044a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: j */
    public final boolean mo12724j() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r1.f11205a.mo15136e().mo12731w();
        r3.mo25379a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r1.f11205a.mo15136e().mo12731w().mo25379a("Timed out waiting for ".concat(r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
    @com.onedelhi.secure.ts2
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo23061r(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.onedelhi.secure.za6 r0 = r1.f11205a     // Catch:{ all -> 0x0049 }
            com.onedelhi.secure.qa6 r0 = r0.mo15135d()     // Catch:{ all -> 0x0049 }
            r0.mo23065z(r6)     // Catch:{ all -> 0x0049 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0027
            com.onedelhi.secure.za6 r3 = r1.f11205a
            com.onedelhi.secure.a56 r3 = r3.mo15136e()
            com.onedelhi.secure.u46 r3 = r3.mo12731w()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r4 = r4.concat(r5)
            r3.mo25379a(r4)
        L_0x0027:
            return r2
        L_0x0028:
            com.onedelhi.secure.za6 r3 = r1.f11205a     // Catch:{ all -> 0x0049 }
            com.onedelhi.secure.a56 r3 = r3.mo15136e()     // Catch:{ all -> 0x0049 }
            com.onedelhi.secure.u46 r3 = r3.mo12731w()     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r6 = "Interrupted waiting for "
            r4.append(r6)     // Catch:{ all -> 0x0049 }
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0049 }
            r3.mo25379a(r4)     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            r2 = 0
            return r2
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qa6.mo23061r(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: s */
    public final Future mo23062s(Callable callable) throws IllegalStateException {
        mo17201k();
        Preconditions.checkNotNull(callable);
        n96 n96 = new n96(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f19044a) {
            if (!this.f19048a.isEmpty()) {
                this.f11205a.mo15136e().mo12731w().mo25379a("Callable skipped the worker queue.");
            }
            n96.run();
        } else {
            mo23060D(n96);
        }
        return n96;
    }

    /* renamed from: t */
    public final Future mo23063t(Callable callable) throws IllegalStateException {
        mo17201k();
        Preconditions.checkNotNull(callable);
        n96 n96 = new n96(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f19044a) {
            n96.run();
        } else {
            mo23060D(n96);
        }
        return n96;
    }

    /* renamed from: y */
    public final void mo23064y(Runnable runnable) throws IllegalStateException {
        mo17201k();
        Preconditions.checkNotNull(runnable);
        n96 n96 = new n96(this, runnable, false, "Task exception on network thread");
        synchronized (this.f19045a) {
            this.f19047a.add(n96);
            q96 q96 = this.f19050b;
            if (q96 == null) {
                q96 q962 = new q96(this, "Measurement Network", this.f19047a);
                this.f19050b = q962;
                q962.setUncaughtExceptionHandler(this.f19051b);
                this.f19050b.start();
            } else {
                q96.mo22959a();
            }
        }
    }

    /* renamed from: z */
    public final void mo23065z(Runnable runnable) throws IllegalStateException {
        mo17201k();
        Preconditions.checkNotNull(runnable);
        mo23060D(new n96(this, runnable, false, "Task exception on worker thread"));
    }
}

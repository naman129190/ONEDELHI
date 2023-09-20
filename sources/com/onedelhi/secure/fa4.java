package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u000bB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\t\u001a\u00020\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nJ\u0006\u0010\f\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/onedelhi/secure/fa4;", "", "Lcom/onedelhi/secure/ea4;", "taskQueue", "Lcom/onedelhi/secure/un4;", "i", "(Lcom/onedelhi/secure/ea4;)V", "Lcom/onedelhi/secure/v94;", "e", "j", "", "c", "g", "task", "f", "k", "", "delayNanos", "d", "Lcom/onedelhi/secure/fa4$a;", "backend", "Lcom/onedelhi/secure/fa4$a;", "h", "()Lcom/onedelhi/secure/fa4$a;", "<init>", "(Lcom/onedelhi/secure/fa4$a;)V", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class fa4 {

    /* renamed from: a */
    public static final C5232b f28226a = new C5232b((wg0) null);
    @rw1
    @vr2

    /* renamed from: a */
    public static final fa4 f28227a = new fa4(new C5233c(nq4.m58684V(nq4.f32729a + " TaskRunner", true)));
    @vr2

    /* renamed from: a */
    public static final Logger f28228a;

    /* renamed from: a */
    public int f28229a = 10000;

    /* renamed from: a */
    public long f28230a;
    @vr2

    /* renamed from: a */
    public final C5231a f28231a;

    /* renamed from: a */
    public final Runnable f28232a = new C5234d(this);

    /* renamed from: a */
    public final List<ea4> f28233a = new ArrayList();

    /* renamed from: a */
    public boolean f28234a;

    /* renamed from: b */
    public final List<ea4> f28235b = new ArrayList();

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/fa4$a;", "", "Lcom/onedelhi/secure/fa4;", "taskRunner", "Lcom/onedelhi/secure/un4;", "a", "", "nanoTime", "c", "nanos", "b", "Ljava/lang/Runnable;", "runnable", "execute", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.fa4$a */
    public interface C5231a {
        /* renamed from: a */
        void mo35814a(@vr2 fa4 fa4);

        /* renamed from: b */
        void mo35815b(@vr2 fa4 fa4, long j);

        /* renamed from: c */
        void mo35816c(@vr2 fa4 fa4);

        void execute(@vr2 Runnable runnable);

        long nanoTime();
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/fa4$b;", "", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "Lcom/onedelhi/secure/fa4;", "INSTANCE", "Lcom/onedelhi/secure/fa4;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.fa4$b */
    public static final class C5232b {
        public C5232b() {
        }

        public /* synthetic */ C5232b(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final Logger mo35819a() {
            return fa4.f28228a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/fa4$c;", "Lcom/onedelhi/secure/fa4$a;", "Lcom/onedelhi/secure/fa4;", "taskRunner", "Lcom/onedelhi/secure/un4;", "a", "", "nanoTime", "c", "nanos", "b", "Ljava/lang/Runnable;", "runnable", "execute", "d", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.fa4$c */
    public static final class C5233c implements C5231a {

        /* renamed from: a */
        public final ThreadPoolExecutor f28236a;

        public C5233c(@vr2 ThreadFactory threadFactory) {
            jt1.m53777p(threadFactory, "threadFactory");
            this.f28236a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        /* renamed from: a */
        public void mo35814a(@vr2 fa4 fa4) {
            jt1.m53777p(fa4, "taskRunner");
        }

        /* renamed from: b */
        public void mo35815b(@vr2 fa4 fa4, long j) throws InterruptedException {
            jt1.m53777p(fa4, "taskRunner");
            long j2 = j / zv0.f38454a;
            long j3 = j - (zv0.f38454a * j2);
            if (j2 > 0 || j > 0) {
                fa4.wait(j2, (int) j3);
            }
        }

        /* renamed from: c */
        public void mo35816c(@vr2 fa4 fa4) {
            jt1.m53777p(fa4, "taskRunner");
            fa4.notify();
        }

        /* renamed from: d */
        public final void mo35820d() {
            this.f28236a.shutdown();
        }

        public void execute(@vr2 Runnable runnable) {
            jt1.m53777p(runnable, "runnable");
            this.f28236a.execute(runnable);
        }

        public long nanoTime() {
            return System.nanoTime();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/fa4$d", "Ljava/lang/Runnable;", "Lcom/onedelhi/secure/un4;", "run", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.fa4$d */
    public static final class C5234d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ fa4 f28237a;

        public C5234d(fa4 fa4) {
            this.f28237a = fa4;
        }

        public void run() {
            v94 e;
            while (true) {
                synchronized (this.f28237a) {
                    e = this.f28237a.mo35807e();
                }
                if (e != null) {
                    ea4 d = e.mo46055d();
                    jt1.m53774m(d);
                    long j = -1;
                    boolean isLoggable = fa4.f28226a.mo35819a().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = d.mo34996k().mo35810h().nanoTime();
                        da4.m44954c(e, d, "starting");
                    }
                    try {
                        this.f28237a.mo35813k(e);
                        un4 un4 = un4.f36206a;
                        if (isLoggable) {
                            long nanoTime = d.mo34996k().mo35810h().nanoTime() - j;
                            da4.m44954c(e, d, "finished run in " + da4.m44953b(nanoTime));
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            long nanoTime2 = d.mo34996k().mo35810h().nanoTime() - j;
                            da4.m44954c(e, d, "failed a run in " + da4.m44953b(nanoTime2));
                        }
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(fa4.class.getName());
        jt1.m53776o(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f28228a = logger;
    }

    public fa4(@vr2 C5231a aVar) {
        jt1.m53777p(aVar, "backend");
        this.f28231a = aVar;
    }

    @vr2
    /* renamed from: c */
    public final List<ea4> mo35805c() {
        List<ea4> z4;
        synchronized (this) {
            z4 = a10.m35935z4(this.f28233a, this.f28235b);
        }
        return z4;
    }

    /* renamed from: d */
    public final void mo35806d(v94 v94, long j) {
        if (!nq4.f32734a || Thread.holdsLock(this)) {
            ea4 d = v94.mo46055d();
            jt1.m53774m(d);
            if (d.mo34990e() == v94) {
                boolean f = d.mo34991f();
                d.mo35002s(false);
                d.mo35001r((v94) null);
                this.f28233a.remove(d);
                if (j != -1 && !f && !d.mo34995j()) {
                    d.mo35000q(v94, j, true);
                }
                if (!d.mo34992g().isEmpty()) {
                    this.f28235b.add(d);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:34|35|36|39|40|47|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r15.f28234a = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c3 */
    @com.onedelhi.secure.ss2
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.v94 mo35807e() {
        /*
            r15 = this;
            boolean r0 = com.onedelhi.secure.nq4.f32734a
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r15)
            if (r0 == 0) goto L_0x000b
            goto L_0x0037
        L_0x000b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r3 = "Thread.currentThread()"
            com.onedelhi.secure.jt1.m53776o(r2, r3)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0037:
            java.util.List<com.onedelhi.secure.ea4> r0 = r15.f28235b
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0041
            return r1
        L_0x0041:
            com.onedelhi.secure.fa4$a r0 = r15.f28231a
            long r2 = r0.nanoTime()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<com.onedelhi.secure.ea4> r0 = r15.f28235b
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L_0x0053:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0085
            java.lang.Object r7 = r0.next()
            com.onedelhi.secure.ea4 r7 = (com.onedelhi.secure.ea4) r7
            java.util.List r7 = r7.mo34992g()
            java.lang.Object r7 = r7.get(r9)
            com.onedelhi.secure.v94 r7 = (com.onedelhi.secure.v94) r7
            long r10 = r7.mo46054c()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x007f
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x0053
        L_0x007f:
            if (r6 == 0) goto L_0x0083
            r0 = 1
            goto L_0x0086
        L_0x0083:
            r6 = r7
            goto L_0x0053
        L_0x0085:
            r0 = 0
        L_0x0086:
            if (r6 == 0) goto L_0x00a2
            r15.mo35808f(r6)
            if (r0 != 0) goto L_0x009a
            boolean r0 = r15.f28234a
            if (r0 != 0) goto L_0x00a1
            java.util.List<com.onedelhi.secure.ea4> r0 = r15.f28235b
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x00a1
        L_0x009a:
            com.onedelhi.secure.fa4$a r0 = r15.f28231a
            java.lang.Runnable r1 = r15.f28232a
            r0.execute(r1)
        L_0x00a1:
            return r6
        L_0x00a2:
            boolean r0 = r15.f28234a
            if (r0 == 0) goto L_0x00b3
            long r6 = r15.f28230a
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b2
            com.onedelhi.secure.fa4$a r0 = r15.f28231a
            r0.mo35816c(r15)
        L_0x00b2:
            return r1
        L_0x00b3:
            r15.f28234a = r8
            long r2 = r2 + r4
            r15.f28230a = r2
            com.onedelhi.secure.fa4$a r0 = r15.f28231a     // Catch:{ InterruptedException -> 0x00c3 }
            r0.mo35815b(r15, r4)     // Catch:{ InterruptedException -> 0x00c3 }
        L_0x00bd:
            r15.f28234a = r9
            goto L_0x0037
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c7
        L_0x00c3:
            r15.mo35809g()     // Catch:{ all -> 0x00c1 }
            goto L_0x00bd
        L_0x00c7:
            r15.f28234a = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.fa4.mo35807e():com.onedelhi.secure.v94");
    }

    /* renamed from: f */
    public final void mo35808f(v94 v94) {
        if (!nq4.f32734a || Thread.holdsLock(this)) {
            v94.mo46057g(-1);
            ea4 d = v94.mo46055d();
            jt1.m53774m(d);
            d.mo34992g().remove(v94);
            this.f28235b.remove(d);
            d.mo35001r(v94);
            this.f28233a.add(d);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: g */
    public final void mo35809g() {
        for (int size = this.f28233a.size() - 1; size >= 0; size--) {
            this.f28233a.get(size).mo34988b();
        }
        for (int size2 = this.f28235b.size() - 1; size2 >= 0; size2--) {
            ea4 ea4 = this.f28235b.get(size2);
            ea4.mo34988b();
            if (ea4.mo34992g().isEmpty()) {
                this.f28235b.remove(size2);
            }
        }
    }

    @vr2
    /* renamed from: h */
    public final C5231a mo35810h() {
        return this.f28231a;
    }

    /* renamed from: i */
    public final void mo35811i(@vr2 ea4 ea4) {
        jt1.m53777p(ea4, "taskQueue");
        if (!nq4.f32734a || Thread.holdsLock(this)) {
            if (ea4.mo34990e() == null) {
                if (!ea4.mo34992g().isEmpty()) {
                    nq4.m58689a(this.f28235b, ea4);
                } else {
                    this.f28235b.remove(ea4);
                }
            }
            if (this.f28234a) {
                this.f28231a.mo35816c(this);
            } else {
                this.f28231a.execute(this.f28232a);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            jt1.m53776o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    @vr2
    /* renamed from: j */
    public final ea4 mo35812j() {
        int i;
        synchronized (this) {
            i = this.f28229a;
            this.f28229a = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new ea4(this, sb.toString());
    }

    /* renamed from: k */
    public final void mo35813k(v94 v94) {
        if (!nq4.f32734a || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            jt1.m53776o(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(v94.mo46053b());
            try {
                long f = v94.mo33844f();
                synchronized (this) {
                    mo35806d(v94, f);
                    un4 un4 = un4.f36206a;
                }
                currentThread.setName(name);
            } catch (Throwable th) {
                synchronized (this) {
                    mo35806d(v94, -1);
                    un4 un42 = un4.f36206a;
                    currentThread.setName(name);
                    throw th;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread2 = Thread.currentThread();
            jt1.m53776o(currentThread2, "Thread.currentThread()");
            sb.append(currentThread2.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }
}

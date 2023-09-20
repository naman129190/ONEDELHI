package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
/* renamed from: com.onedelhi.secure.i1 */
public abstract class C2382i1<V> implements m42<V> {

    /* renamed from: a */
    public static final C2384b f13420a;

    /* renamed from: a */
    public static final Logger f13421a = Logger.getLogger(C2382i1.class.getName());

    /* renamed from: b */
    public static final long f13422b = 1000;

    /* renamed from: b */
    public static final Object f13423b = new Object();

    /* renamed from: b */
    public static final boolean f13424b = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", h60.f29488G));
    @ts2

    /* renamed from: a */
    public volatile C2388e f13425a;
    @ts2

    /* renamed from: a */
    public volatile C2392i f13426a;
    @ts2

    /* renamed from: a */
    public volatile Object f13427a;

    /* renamed from: com.onedelhi.secure.i1$b */
    public static abstract class C2384b {
        public C2384b() {
        }

        /* renamed from: a */
        public abstract boolean mo17494a(C2382i1<?> i1Var, C2388e eVar, C2388e eVar2);

        /* renamed from: b */
        public abstract boolean mo17495b(C2382i1<?> i1Var, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo17496c(C2382i1<?> i1Var, C2392i iVar, C2392i iVar2);

        /* renamed from: d */
        public abstract void mo17497d(C2392i iVar, C2392i iVar2);

        /* renamed from: e */
        public abstract void mo17498e(C2392i iVar, Thread thread);
    }

    /* renamed from: com.onedelhi.secure.i1$c */
    public static final class C2385c {

        /* renamed from: a */
        public static final C2385c f13428a;

        /* renamed from: b */
        public static final C2385c f13429b;
        @ts2

        /* renamed from: a */
        public final Throwable f13430a;

        /* renamed from: a */
        public final boolean f13431a;

        static {
            if (C2382i1.f13424b) {
                f13429b = null;
                f13428a = null;
                return;
            }
            f13429b = new C2385c(false, (Throwable) null);
            f13428a = new C2385c(true, (Throwable) null);
        }

        public C2385c(boolean z, @ts2 Throwable th) {
            this.f13431a = z;
            this.f13430a = th;
        }
    }

    /* renamed from: com.onedelhi.secure.i1$d */
    public static final class C2386d {

        /* renamed from: a */
        public static final C2386d f13432a = new C2386d(new C2387a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f13433a;

        /* renamed from: com.onedelhi.secure.i1$d$a */
        public class C2387a extends Throwable {
            public C2387a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C2386d(Throwable th) {
            this.f13433a = (Throwable) C2382i1.m17077g(th);
        }
    }

    /* renamed from: com.onedelhi.secure.i1$e */
    public static final class C2388e {

        /* renamed from: b */
        public static final C2388e f13434b = new C2388e((Runnable) null, (Executor) null);
        @ts2

        /* renamed from: a */
        public C2388e f13435a;

        /* renamed from: a */
        public final Runnable f13436a;

        /* renamed from: a */
        public final Executor f13437a;

        public C2388e(Runnable runnable, Executor executor) {
            this.f13436a = runnable;
            this.f13437a = executor;
        }
    }

    /* renamed from: com.onedelhi.secure.i1$f */
    public static final class C2389f extends C2384b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<C2392i, Thread> f13438a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<C2392i, C2392i> f13439b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<C2382i1, C2392i> f13440c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<C2382i1, C2388e> f13441d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<C2382i1, Object> f13442e;

        public C2389f(AtomicReferenceFieldUpdater<C2392i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C2392i, C2392i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C2382i1, C2392i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C2382i1, C2388e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C2382i1, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f13438a = atomicReferenceFieldUpdater;
            this.f13439b = atomicReferenceFieldUpdater2;
            this.f13440c = atomicReferenceFieldUpdater3;
            this.f13441d = atomicReferenceFieldUpdater4;
            this.f13442e = atomicReferenceFieldUpdater5;
        }

        /* renamed from: a */
        public boolean mo17494a(C2382i1<?> i1Var, C2388e eVar, C2388e eVar2) {
            return C5759j1.m52871a(this.f13441d, i1Var, eVar, eVar2);
        }

        /* renamed from: b */
        public boolean mo17495b(C2382i1<?> i1Var, Object obj, Object obj2) {
            return C5759j1.m52871a(this.f13442e, i1Var, obj, obj2);
        }

        /* renamed from: c */
        public boolean mo17496c(C2382i1<?> i1Var, C2392i iVar, C2392i iVar2) {
            return C5759j1.m52871a(this.f13440c, i1Var, iVar, iVar2);
        }

        /* renamed from: d */
        public void mo17497d(C2392i iVar, C2392i iVar2) {
            this.f13439b.lazySet(iVar, iVar2);
        }

        /* renamed from: e */
        public void mo17498e(C2392i iVar, Thread thread) {
            this.f13438a.lazySet(iVar, thread);
        }
    }

    /* renamed from: com.onedelhi.secure.i1$g */
    public static final class C2390g<V> implements Runnable {

        /* renamed from: a */
        public final C2382i1<V> f13443a;

        /* renamed from: a */
        public final m42<? extends V> f13444a;

        public C2390g(C2382i1<V> i1Var, m42<? extends V> m42) {
            this.f13443a = i1Var;
            this.f13444a = m42;
        }

        public void run() {
            if (this.f13443a.f13427a == this) {
                if (C2382i1.f13420a.mo17495b(this.f13443a, this, C2382i1.m17080u(this.f13444a))) {
                    C2382i1.m17078r(this.f13443a);
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.i1$h */
    public static final class C2391h extends C2384b {
        public C2391h() {
            super();
        }

        /* renamed from: a */
        public boolean mo17494a(C2382i1<?> i1Var, C2388e eVar, C2388e eVar2) {
            synchronized (i1Var) {
                if (i1Var.f13425a != eVar) {
                    return false;
                }
                i1Var.f13425a = eVar2;
                return true;
            }
        }

        /* renamed from: b */
        public boolean mo17495b(C2382i1<?> i1Var, Object obj, Object obj2) {
            synchronized (i1Var) {
                if (i1Var.f13427a != obj) {
                    return false;
                }
                i1Var.f13427a = obj2;
                return true;
            }
        }

        /* renamed from: c */
        public boolean mo17496c(C2382i1<?> i1Var, C2392i iVar, C2392i iVar2) {
            synchronized (i1Var) {
                if (i1Var.f13426a != iVar) {
                    return false;
                }
                i1Var.f13426a = iVar2;
                return true;
            }
        }

        /* renamed from: d */
        public void mo17497d(C2392i iVar, C2392i iVar2) {
            iVar.f13446a = iVar2;
        }

        /* renamed from: e */
        public void mo17498e(C2392i iVar, Thread thread) {
            iVar.f13447a = thread;
        }
    }

    /* renamed from: com.onedelhi.secure.i1$i */
    public static final class C2392i {

        /* renamed from: b */
        public static final C2392i f13445b = new C2392i(false);
        @ts2

        /* renamed from: a */
        public volatile C2392i f13446a;
        @ts2

        /* renamed from: a */
        public volatile Thread f13447a;

        public C2392i() {
            C2382i1.f13420a.mo17498e(this, Thread.currentThread());
        }

        public C2392i(boolean z) {
        }

        /* renamed from: a */
        public void mo17501a(C2392i iVar) {
            C2382i1.f13420a.mo17497d(this, iVar);
        }

        /* renamed from: b */
        public void mo17502b() {
            Thread thread = this.f13447a;
            if (thread != null) {
                this.f13447a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.onedelhi.secure.i1$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.onedelhi.secure.i1$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.onedelhi.secure.i1$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.onedelhi.secure.i1$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<com.onedelhi.secure.i1$i> r0 = com.onedelhi.secure.C2382i1.C2392i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f13424b = r1
            java.lang.Class<com.onedelhi.secure.i1> r1 = com.onedelhi.secure.C2382i1.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f13421a = r1
            com.onedelhi.secure.i1$f r1 = new com.onedelhi.secure.i1$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<com.onedelhi.secure.i1> r2 = com.onedelhi.secure.C2382i1.class
            java.lang.String r5 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<com.onedelhi.secure.i1> r0 = com.onedelhi.secure.C2382i1.class
            java.lang.Class<com.onedelhi.secure.i1$e> r2 = com.onedelhi.secure.C2382i1.C2388e.class
            java.lang.String r6 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<com.onedelhi.secure.i1> r0 = com.onedelhi.secure.C2382i1.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            com.onedelhi.secure.i1$h r1 = new com.onedelhi.secure.i1$h
            r1.<init>()
        L_0x0054:
            f13420a = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f13421a
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f13423b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C2382i1.<clinit>():void");
    }

    /* renamed from: e */
    public static CancellationException m17076e(@ts2 String str, @ts2 Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @mr2
    /* renamed from: g */
    public static <T> T m17077g(@ts2 T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: r */
    public static void m17078r(C2382i1<?> i1Var) {
        C2388e eVar = null;
        C2382i1<V> i1Var2 = i1Var;
        while (true) {
            i1Var2.mo17493z();
            i1Var2.mo17480b();
            C2388e q = i1Var2.mo17487q(eVar);
            while (true) {
                if (q != null) {
                    eVar = q.f13435a;
                    Runnable runnable = q.f13436a;
                    if (runnable instanceof C2390g) {
                        C2390g gVar = (C2390g) runnable;
                        C2382i1<V> i1Var3 = gVar.f13443a;
                        if (i1Var3.f13427a == gVar) {
                            if (f13420a.mo17495b(i1Var3, gVar, m17080u(gVar.f13444a))) {
                                i1Var2 = i1Var3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m17079s(runnable, q.f13437a);
                    }
                    q = eVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: s */
    public static void m17079s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f13421a;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: u */
    public static Object m17080u(m42<?> m42) {
        if (m42 instanceof C2382i1) {
            Object obj = ((C2382i1) m42).f13427a;
            if (!(obj instanceof C2385c)) {
                return obj;
            }
            C2385c cVar = (C2385c) obj;
            return cVar.f13431a ? cVar.f13430a != null ? new C2385c(false, cVar.f13430a) : C2385c.f13429b : obj;
        }
        boolean isCancelled = m42.isCancelled();
        if ((!f13424b) && isCancelled) {
            return C2385c.f13429b;
        }
        try {
            Object v = m17081v(m42);
            return v == null ? f13423b : v;
        } catch (ExecutionException e) {
            return new C2386d(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C2385c(false, e2);
            }
            return new C2386d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + m42, e2));
        } catch (Throwable th) {
            return new C2386d(th);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: v */
    public static <V> V m17081v(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: A */
    public final void mo17476A(C2392i iVar) {
        iVar.f13447a = null;
        while (true) {
            C2392i iVar2 = this.f13426a;
            if (iVar2 != C2392i.f13445b) {
                C2392i iVar3 = null;
                while (iVar2 != null) {
                    C2392i iVar4 = iVar2.f13446a;
                    if (iVar2.f13447a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f13446a = iVar4;
                        if (iVar3.f13447a == null) {
                        }
                    } else if (!f13420a.mo17496c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: B */
    public boolean mo13747B(@ts2 V v) {
        if (v == null) {
            v = f13423b;
        }
        if (!f13420a.mo17495b(this, (Object) null, v)) {
            return false;
        }
        m17078r(this);
        return true;
    }

    /* renamed from: C */
    public boolean mo13748C(Throwable th) {
        if (!f13420a.mo17495b(this, (Object) null, new C2386d((Throwable) m17077g(th)))) {
            return false;
        }
        m17078r(this);
        return true;
    }

    /* renamed from: D */
    public boolean mo13749D(m42<? extends V> m42) {
        C2390g gVar;
        C2386d dVar;
        m17077g(m42);
        Object obj = this.f13427a;
        if (obj == null) {
            if (m42.isDone()) {
                if (!f13420a.mo17495b(this, (Object) null, m17080u(m42))) {
                    return false;
                }
                m17078r(this);
                return true;
            }
            gVar = new C2390g(this, m42);
            if (f13420a.mo17495b(this, (Object) null, gVar)) {
                try {
                    m42.mo17486l(gVar, fl0.INSTANCE);
                } catch (Throwable unused) {
                    dVar = C2386d.f13432a;
                }
                return true;
            }
            obj = this.f13427a;
        }
        if (obj instanceof C2385c) {
            m42.cancel(((C2385c) obj).f13431a);
        }
        return false;
        f13420a.mo17495b(this, gVar, dVar);
        return true;
    }

    /* renamed from: E */
    public final String mo17477E(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* renamed from: F */
    public final boolean mo17478F() {
        Object obj = this.f13427a;
        return (obj instanceof C2385c) && ((C2385c) obj).f13431a;
    }

    /* renamed from: a */
    public final void mo17479a(StringBuilder sb) {
        String str = "]";
        try {
            Object v = m17081v(this);
            sb.append("SUCCESS, result=[");
            sb.append(mo17477E(v));
            sb.append(str);
            return;
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
        } catch (CancellationException unused) {
            str = "CANCELLED";
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            str = " thrown from get()]";
        }
        sb.append(str);
    }

    /* renamed from: b */
    public void mo17480b() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.onedelhi.secure.m42<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f13427a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.onedelhi.secure.C2382i1.C2390g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f13424b
            if (r3 == 0) goto L_0x001f
            com.onedelhi.secure.i1$c r3 = new com.onedelhi.secure.i1$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.onedelhi.secure.i1$c r3 = com.onedelhi.secure.C2382i1.C2385c.f13428a
            goto L_0x0026
        L_0x0024:
            com.onedelhi.secure.i1$c r3 = com.onedelhi.secure.C2382i1.C2385c.f13429b
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            com.onedelhi.secure.i1$b r6 = f13420a
            boolean r6 = r6.mo17495b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo17490w()
        L_0x0035:
            m17078r(r4)
            boolean r4 = r0 instanceof com.onedelhi.secure.C2382i1.C2390g
            if (r4 == 0) goto L_0x0062
            com.onedelhi.secure.i1$g r0 = (com.onedelhi.secure.C2382i1.C2390g) r0
            com.onedelhi.secure.m42<? extends V> r0 = r0.f13444a
            boolean r4 = r0 instanceof com.onedelhi.secure.C2382i1
            if (r4 == 0) goto L_0x0055
            r4 = r0
            com.onedelhi.secure.i1 r4 = (com.onedelhi.secure.C2382i1) r4
            java.lang.Object r0 = r4.f13427a
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof com.onedelhi.secure.C2382i1.C2390g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f13427a
            boolean r6 = r0 instanceof com.onedelhi.secure.C2382i1.C2390g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C2382i1.cancel(boolean):boolean");
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f13427a;
            if ((obj2 != null) && (!(obj2 instanceof C2390g))) {
                return mo17488t(obj2);
            }
            C2392i iVar = this.f13426a;
            if (iVar != C2392i.f13445b) {
                C2392i iVar2 = new C2392i();
                do {
                    iVar2.mo17501a(iVar);
                    if (f13420a.mo17496c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f13427a;
                            } else {
                                mo17476A(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C2390g))));
                        return mo17488t(obj);
                    }
                    iVar = this.f13426a;
                } while (iVar != C2392i.f13445b);
            }
            return mo17488t(this.f13427a);
        }
        throw new InterruptedException();
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f13427a;
            if ((obj != null) && (!(obj instanceof C2390g))) {
                return mo17488t(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C2392i iVar = this.f13426a;
                if (iVar != C2392i.f13445b) {
                    C2392i iVar2 = new C2392i();
                    do {
                        iVar2.mo17501a(iVar);
                        if (f13420a.mo17496c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f13427a;
                                    if ((obj2 != null) && (!(obj2 instanceof C2390g))) {
                                        return mo17488t(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    mo17476A(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            mo17476A(iVar2);
                        } else {
                            iVar = this.f13426a;
                        }
                    } while (iVar != C2392i.f13445b);
                }
                return mo17488t(this.f13427a);
            }
            while (nanos > 0) {
                Object obj3 = this.f13427a;
                if ((obj3 != null) && (!(obj3 instanceof C2390g))) {
                    return mo17488t(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String i1Var = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + vf4.f36537c;
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + i1Var);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f13427a instanceof C2385c;
    }

    public final boolean isDone() {
        Object obj = this.f13427a;
        return (!(obj instanceof C2390g)) & (obj != null);
    }

    /* renamed from: l */
    public final void mo17486l(Runnable runnable, Executor executor) {
        m17077g(runnable);
        m17077g(executor);
        C2388e eVar = this.f13425a;
        if (eVar != C2388e.f13434b) {
            C2388e eVar2 = new C2388e(runnable, executor);
            do {
                eVar2.f13435a = eVar;
                if (!f13420a.mo17494a(this, eVar, eVar2)) {
                    eVar = this.f13425a;
                } else {
                    return;
                }
            } while (eVar != C2388e.f13434b);
        }
        m17079s(runnable, executor);
    }

    /* renamed from: q */
    public final C2388e mo17487q(C2388e eVar) {
        C2388e eVar2;
        do {
            eVar2 = this.f13425a;
        } while (!f13420a.mo17494a(this, eVar2, C2388e.f13434b));
        C2388e eVar3 = eVar2;
        C2388e eVar4 = eVar;
        C2388e eVar5 = eVar3;
        while (eVar5 != null) {
            C2388e eVar6 = eVar5.f13435a;
            eVar5.f13435a = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* renamed from: t */
    public final V mo17488t(Object obj) throws ExecutionException {
        if (obj instanceof C2385c) {
            throw m17076e("Task was cancelled.", ((C2385c) obj).f13430a);
        } else if (obj instanceof C2386d) {
            throw new ExecutionException(((C2386d) obj).f13433a);
        } else if (obj == f13423b) {
            return null;
        } else {
            return obj;
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str = mo17492y();
                } catch (RuntimeException e) {
                    str = "Exception thrown from implementation: " + e.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str2 = "PENDING";
                }
            }
            mo17479a(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: w */
    public void mo17490w() {
    }

    /* renamed from: x */
    public final void mo17491x(@ts2 Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(mo17478F());
        }
    }

    @ts2
    /* renamed from: y */
    public String mo17492y() {
        Object obj = this.f13427a;
        if (obj instanceof C2390g) {
            return "setFuture=[" + mo17477E(((C2390g) obj).f13444a) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* renamed from: z */
    public final void mo17493z() {
        C2392i iVar;
        do {
            iVar = this.f13426a;
        } while (!f13420a.mo17496c(this, iVar, C2392i.f13445b));
        while (iVar != null) {
            iVar.mo17502b();
            iVar = iVar.f13446a;
        }
    }
}

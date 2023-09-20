package com.onedelhi.secure;

import com.onedelhi.secure.mz0;
import com.onedelhi.secure.n33;
import com.onedelhi.secure.qf0;
import com.onedelhi.secure.su0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class ou0<R> implements qf0.C3295b<R>, mz0.C2908f {

    /* renamed from: b */
    public static final C3093c f18098b = new C3093c();

    /* renamed from: a */
    public ck3<?> f18099a;

    /* renamed from: a */
    public final k34 f18100a;

    /* renamed from: a */
    public ky1 f18101a;

    /* renamed from: a */
    public final n33.C2922a<ou0<?>> f18102a;

    /* renamed from: a */
    public final C3093c f18103a;

    /* renamed from: a */
    public final C3095e f18104a;

    /* renamed from: a */
    public final pu0 f18105a;

    /* renamed from: a */
    public qf0<R> f18106a;

    /* renamed from: a */
    public final su0.C3544a f18107a;

    /* renamed from: a */
    public su0<?> f18108a;

    /* renamed from: a */
    public vd0 f18109a;

    /* renamed from: a */
    public yg1 f18110a;

    /* renamed from: a */
    public final zg1 f18111a;

    /* renamed from: a */
    public final AtomicInteger f18112a;

    /* renamed from: b */
    public final zg1 f18113b;

    /* renamed from: b */
    public boolean f18114b;

    /* renamed from: c */
    public final zg1 f18115c;

    /* renamed from: c */
    public boolean f18116c;

    /* renamed from: d */
    public final zg1 f18117d;

    /* renamed from: d */
    public boolean f18118d;

    /* renamed from: e */
    public boolean f18119e;

    /* renamed from: f */
    public boolean f18120f;

    /* renamed from: g */
    public boolean f18121g;

    /* renamed from: h */
    public volatile boolean f18122h;

    /* renamed from: i */
    public boolean f18123i;

    /* renamed from: com.onedelhi.secure.ou0$a */
    public class C3091a implements Runnable {

        /* renamed from: a */
        public final gk3 f18124a;

        public C3091a(gk3 gk3) {
            this.f18124a = gk3;
        }

        public void run() {
            synchronized (this.f18124a.mo16695g()) {
                synchronized (ou0.this) {
                    if (ou0.this.f18104a.mo22090e(this.f18124a)) {
                        ou0.this.mo22068f(this.f18124a);
                    }
                    ou0.this.mo22071i();
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ou0$b */
    public class C3092b implements Runnable {

        /* renamed from: a */
        public final gk3 f18126a;

        public C3092b(gk3 gk3) {
            this.f18126a = gk3;
        }

        public void run() {
            synchronized (this.f18126a.mo16695g()) {
                synchronized (ou0.this) {
                    if (ou0.this.f18104a.mo22090e(this.f18126a)) {
                        ou0.this.f18108a.mo24547b();
                        ou0.this.mo22069g(this.f18126a);
                        ou0.this.mo22081s(this.f18126a);
                    }
                    ou0.this.mo22071i();
                }
            }
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.ou0$c */
    public static class C3093c {
        /* renamed from: a */
        public <R> su0<R> mo22085a(ck3<R> ck3, boolean z, ky1 ky1, su0.C3544a aVar) {
            return new su0(ck3, z, true, ky1, aVar);
        }
    }

    /* renamed from: com.onedelhi.secure.ou0$d */
    public static final class C3094d {

        /* renamed from: a */
        public final gk3 f18128a;

        /* renamed from: a */
        public final Executor f18129a;

        public C3094d(gk3 gk3, Executor executor) {
            this.f18128a = gk3;
            this.f18129a = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C3094d) {
                return this.f18128a.equals(((C3094d) obj).f18128a);
            }
            return false;
        }

        public int hashCode() {
            return this.f18128a.hashCode();
        }
    }

    /* renamed from: com.onedelhi.secure.ou0$e */
    public static final class C3095e implements Iterable<C3094d> {

        /* renamed from: a */
        public final List<C3094d> f18130a;

        public C3095e() {
            this(new ArrayList(2));
        }

        public C3095e(List<C3094d> list) {
            this.f18130a = list;
        }

        /* renamed from: g */
        public static C3094d m24099g(gk3 gk3) {
            return new C3094d(gk3, cx0.m12784a());
        }

        /* renamed from: b */
        public void mo22088b(gk3 gk3, Executor executor) {
            this.f18130a.add(new C3094d(gk3, executor));
        }

        public void clear() {
            this.f18130a.clear();
        }

        /* renamed from: e */
        public boolean mo22090e(gk3 gk3) {
            return this.f18130a.contains(m24099g(gk3));
        }

        /* renamed from: f */
        public C3095e mo22091f() {
            return new C3095e(new ArrayList(this.f18130a));
        }

        /* renamed from: i */
        public void mo22092i(gk3 gk3) {
            this.f18130a.remove(m24099g(gk3));
        }

        public boolean isEmpty() {
            return this.f18130a.isEmpty();
        }

        @mr2
        public Iterator<C3094d> iterator() {
            return this.f18130a.iterator();
        }

        public int size() {
            return this.f18130a.size();
        }
    }

    public ou0(zg1 zg1, zg1 zg12, zg1 zg13, zg1 zg14, pu0 pu0, su0.C3544a aVar, n33.C2922a<ou0<?>> aVar2) {
        this(zg1, zg12, zg13, zg14, pu0, aVar, aVar2, f18098b);
    }

    @hw4
    public ou0(zg1 zg1, zg1 zg12, zg1 zg13, zg1 zg14, pu0 pu0, su0.C3544a aVar, n33.C2922a<ou0<?>> aVar2, C3093c cVar) {
        this.f18104a = new C3095e();
        this.f18100a = k34.m19424a();
        this.f18112a = new AtomicInteger();
        this.f18111a = zg1;
        this.f18113b = zg12;
        this.f18115c = zg13;
        this.f18117d = zg14;
        this.f18105a = pu0;
        this.f18107a = aVar;
        this.f18102a = aVar2;
        this.f18103a = cVar;
    }

    /* renamed from: a */
    public void mo22064a(yg1 yg1) {
        synchronized (this) {
            this.f18110a = yg1;
        }
        mo22077o();
    }

    @mr2
    /* renamed from: b */
    public k34 mo20819b() {
        return this.f18100a;
    }

    /* renamed from: c */
    public void mo22065c(ck3<R> ck3, vd0 vd0, boolean z) {
        synchronized (this) {
            this.f18099a = ck3;
            this.f18109a = vd0;
            this.f18123i = z;
        }
        mo22078p();
    }

    /* renamed from: d */
    public void mo22066d(qf0<?> qf0) {
        mo22072j().execute(qf0);
    }

    /* renamed from: e */
    public synchronized void mo22067e(gk3 gk3, Executor executor) {
        Runnable aVar;
        this.f18100a.mo18881c();
        this.f18104a.mo22088b(gk3, executor);
        boolean z = true;
        if (this.f18120f) {
            mo22073k(1);
            aVar = new C3092b(gk3);
        } else if (this.f18121g) {
            mo22073k(1);
            aVar = new C3091a(gk3);
        } else {
            if (this.f18122h) {
                z = false;
            }
            g43.m15506a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    @mj1("this")
    /* renamed from: f */
    public void mo22068f(gk3 gk3) {
        try {
            gk3.mo16693a(this.f18110a);
        } catch (Throwable th) {
            throw new C3947xs(th);
        }
    }

    @mj1("this")
    /* renamed from: g */
    public void mo22069g(gk3 gk3) {
        try {
            gk3.mo16694c(this.f18108a, this.f18109a, this.f18123i);
        } catch (Throwable th) {
            throw new C3947xs(th);
        }
    }

    /* renamed from: h */
    public void mo22070h() {
        if (!mo22076n()) {
            this.f18122h = true;
            this.f18106a.mo23127a();
            this.f18105a.mo21474b(this, this.f18101a);
        }
    }

    /* renamed from: i */
    public void mo22071i() {
        su0<?> su0;
        synchronized (this) {
            this.f18100a.mo18881c();
            g43.m15506a(mo22076n(), "Not yet complete!");
            int decrementAndGet = this.f18112a.decrementAndGet();
            g43.m15506a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                su0 = this.f18108a;
                mo22080r();
            } else {
                su0 = null;
            }
        }
        if (su0 != null) {
            su0.mo24550g();
        }
    }

    /* renamed from: j */
    public final zg1 mo22072j() {
        return this.f18116c ? this.f18115c : this.f18118d ? this.f18117d : this.f18113b;
    }

    /* renamed from: k */
    public synchronized void mo22073k(int i) {
        su0<?> su0;
        g43.m15506a(mo22076n(), "Not yet complete!");
        if (this.f18112a.getAndAdd(i) == 0 && (su0 = this.f18108a) != null) {
            su0.mo24547b();
        }
    }

    @hw4
    /* renamed from: l */
    public synchronized ou0<R> mo22074l(ky1 ky1, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f18101a = ky1;
        this.f18114b = z;
        this.f18116c = z2;
        this.f18118d = z3;
        this.f18119e = z4;
        return this;
    }

    /* renamed from: m */
    public synchronized boolean mo22075m() {
        return this.f18122h;
    }

    /* renamed from: n */
    public final boolean mo22076n() {
        return this.f18121g || this.f18120f || this.f18122h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f18105a.mo21475c(r4, r1, (com.onedelhi.secure.su0<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f18129a.execute(new com.onedelhi.secure.ou0.C3091a(r4, r1.f18128a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo22071i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22077o() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.onedelhi.secure.k34 r0 = r4.f18100a     // Catch:{ all -> 0x0066 }
            r0.mo18881c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f18122h     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.mo22080r()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.onedelhi.secure.ou0$e r0 = r4.f18104a     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f18121g     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f18121g = r0     // Catch:{ all -> 0x0066 }
            com.onedelhi.secure.ky1 r1 = r4.f18101a     // Catch:{ all -> 0x0066 }
            com.onedelhi.secure.ou0$e r2 = r4.f18104a     // Catch:{ all -> 0x0066 }
            com.onedelhi.secure.ou0$e r2 = r2.mo22091f()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo22073k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.onedelhi.secure.pu0 r0 = r4.f18105a
            r3 = 0
            r0.mo21475c(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.onedelhi.secure.ou0$d r1 = (com.onedelhi.secure.ou0.C3094d) r1
            java.util.concurrent.Executor r2 = r1.f18129a
            com.onedelhi.secure.ou0$a r3 = new com.onedelhi.secure.ou0$a
            com.onedelhi.secure.gk3 r1 = r1.f18128a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo22071i()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ou0.mo22077o():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f18105a.mo21475c(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.f18129a.execute(new com.onedelhi.secure.ou0.C3092b(r5, r1.f18128a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo22071i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22078p() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.onedelhi.secure.k34 r0 = r5.f18100a     // Catch:{ all -> 0x007c }
            r0.mo18881c()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.f18122h     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            com.onedelhi.secure.ck3<?> r0 = r5.f18099a     // Catch:{ all -> 0x007c }
            r0.mo13177a()     // Catch:{ all -> 0x007c }
            r5.mo22080r()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            com.onedelhi.secure.ou0$e r0 = r5.f18104a     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f18120f     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            com.onedelhi.secure.ou0$c r0 = r5.f18103a     // Catch:{ all -> 0x007c }
            com.onedelhi.secure.ck3<?> r1 = r5.f18099a     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f18114b     // Catch:{ all -> 0x007c }
            com.onedelhi.secure.ky1 r3 = r5.f18101a     // Catch:{ all -> 0x007c }
            com.onedelhi.secure.su0$a r4 = r5.f18107a     // Catch:{ all -> 0x007c }
            com.onedelhi.secure.su0 r0 = r0.mo22085a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.f18108a = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f18120f = r0     // Catch:{ all -> 0x007c }
            com.onedelhi.secure.ou0$e r1 = r5.f18104a     // Catch:{ all -> 0x007c }
            com.onedelhi.secure.ou0$e r1 = r1.mo22091f()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.mo22073k(r2)     // Catch:{ all -> 0x007c }
            com.onedelhi.secure.ky1 r0 = r5.f18101a     // Catch:{ all -> 0x007c }
            com.onedelhi.secure.su0<?> r2 = r5.f18108a     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            com.onedelhi.secure.pu0 r3 = r5.f18105a
            r3.mo21475c(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.onedelhi.secure.ou0$d r1 = (com.onedelhi.secure.ou0.C3094d) r1
            java.util.concurrent.Executor r2 = r1.f18129a
            com.onedelhi.secure.ou0$b r3 = new com.onedelhi.secure.ou0$b
            com.onedelhi.secure.gk3 r1 = r1.f18128a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.mo22071i()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ou0.mo22078p():void");
    }

    /* renamed from: q */
    public boolean mo22079q() {
        return this.f18119e;
    }

    /* renamed from: r */
    public final synchronized void mo22080r() {
        if (this.f18101a != null) {
            this.f18104a.clear();
            this.f18101a = null;
            this.f18108a = null;
            this.f18099a = null;
            this.f18121g = false;
            this.f18122h = false;
            this.f18120f = false;
            this.f18123i = false;
            this.f18106a.mo23120H(false);
            this.f18106a = null;
            this.f18110a = null;
            this.f18109a = null;
            this.f18102a.mo20817a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: s */
    public synchronized void mo22081s(gk3 gk3) {
        boolean z;
        this.f18100a.mo18881c();
        this.f18104a.mo22092i(gk3);
        if (this.f18104a.isEmpty()) {
            mo22070h();
            if (!this.f18120f) {
                if (!this.f18121g) {
                    z = false;
                    if (z && this.f18112a.get() == 0) {
                        mo22080r();
                    }
                }
            }
            z = true;
            mo22080r();
        }
    }

    /* renamed from: t */
    public synchronized void mo22082t(qf0<R> qf0) {
        this.f18106a = qf0;
        (qf0.mo23126N() ? this.f18111a : mo22072j()).execute(qf0);
    }
}

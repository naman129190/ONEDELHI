package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\b\u0000\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b8\u00109J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J.\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\bø\u0001\u0000J8\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\bø\u0001\u0000J\u0006\u0010\u0011\u001a\u00020\u0010J'\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u000f\u0010\u0017\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\bH\u0016R\"\u0010\u001a\u001a\u00020\r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\"\u0010*\u001a\u00020\r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001eR\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010)R\u001a\u00101\u001a\u0002008\u0000X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u00107\u0002\u0007\n\u0005\b20\u0001¨\u0006:"}, d2 = {"Lcom/onedelhi/secure/ea4;", "", "Lcom/onedelhi/secure/v94;", "task", "", "delayNanos", "Lcom/onedelhi/secure/un4;", "m", "", "name", "Lkotlin/Function0;", "block", "n", "", "cancelable", "c", "Ljava/util/concurrent/CountDownLatch;", "l", "recurrence", "q", "(Lcom/onedelhi/secure/v94;JZ)Z", "a", "u", "b", "()Z", "toString", "shutdown", "Z", "j", "t", "(Z)V", "activeTask", "Lcom/onedelhi/secure/v94;", "e", "()Lcom/onedelhi/secure/v94;", "r", "(Lcom/onedelhi/secure/v94;)V", "", "futureTasks", "Ljava/util/List;", "g", "()Ljava/util/List;", "cancelActiveTask", "f", "s", "", "i", "scheduledTasks", "Lcom/onedelhi/secure/fa4;", "taskRunner", "Lcom/onedelhi/secure/fa4;", "k", "()Lcom/onedelhi/secure/fa4;", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "<init>", "(Lcom/onedelhi/secure/fa4;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class ea4 {
    @vr2

    /* renamed from: a */
    public final fa4 f27829a;
    @ss2

    /* renamed from: a */
    public v94 f27830a;
    @vr2

    /* renamed from: a */
    public final String f27831a;
    @vr2

    /* renamed from: a */
    public final List<v94> f27832a = new ArrayList();

    /* renamed from: a */
    public boolean f27833a;

    /* renamed from: b */
    public boolean f27834b;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/ea4$a;", "Lcom/onedelhi/secure/v94;", "", "f", "Ljava/util/concurrent/CountDownLatch;", "latch", "Ljava/util/concurrent/CountDownLatch;", "i", "()Ljava/util/concurrent/CountDownLatch;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.ea4$a */
    public static final class C5114a extends v94 {
        @vr2

        /* renamed from: a */
        public final CountDownLatch f27835a = new CountDownLatch(1);

        public C5114a() {
            super(nq4.f32729a + " awaitIdle", false);
        }

        /* renamed from: f */
        public long mo33844f() {
            this.f27835a.countDown();
            return -1;
        }

        @vr2
        /* renamed from: i */
        public final CountDownLatch mo35006i() {
            return this.f27835a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/ea4$b", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.ea4$b */
    public static final class C5115b extends v94 {

        /* renamed from: a */
        public final /* synthetic */ cc1 f27836a;

        /* renamed from: b */
        public final /* synthetic */ String f27837b;

        /* renamed from: b */
        public final /* synthetic */ boolean f27838b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5115b(cc1 cc1, String str, boolean z, String str2, boolean z2) {
            super(str2, z2);
            this.f27836a = cc1;
            this.f27837b = str;
            this.f27838b = z;
        }

        /* renamed from: f */
        public long mo33844f() {
            this.f27836a.invoke();
            return -1;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/ea4$c", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.ea4$c */
    public static final class C5116c extends v94 {

        /* renamed from: a */
        public final /* synthetic */ cc1 f27839a;

        /* renamed from: b */
        public final /* synthetic */ String f27840b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5116c(cc1 cc1, String str, String str2) {
            super(str2, false, 2, (wg0) null);
            this.f27839a = cc1;
            this.f27840b = str;
        }

        /* renamed from: f */
        public long mo33844f() {
            return ((Number) this.f27839a.invoke()).longValue();
        }
    }

    public ea4(@vr2 fa4 fa4, @vr2 String str) {
        jt1.m53777p(fa4, "taskRunner");
        jt1.m53777p(str, "name");
        this.f27829a = fa4;
        this.f27831a = str;
    }

    /* renamed from: d */
    public static /* synthetic */ void m46226d(ea4 ea4, String str, long j, boolean z, cc1 cc1, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z2 = (i & 4) != 0 ? true : z;
        jt1.m53777p(str, "name");
        jt1.m53777p(cc1, "block");
        ea4.mo34998m(new C5115b(cc1, str, z2, str, z2), j);
    }

    /* renamed from: o */
    public static /* synthetic */ void m46227o(ea4 ea4, v94 v94, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ea4.mo34998m(v94, j);
    }

    /* renamed from: p */
    public static /* synthetic */ void m46228p(ea4 ea4, String str, long j, cc1 cc1, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        jt1.m53777p(str, "name");
        jt1.m53777p(cc1, "block");
        ea4.mo34998m(new C5116c(cc1, str, str), j);
    }

    /* renamed from: a */
    public final void mo34987a() {
        if (!nq4.f32734a || !Thread.holdsLock(this)) {
            synchronized (this.f27829a) {
                if (mo34988b()) {
                    this.f27829a.mo35811i(this);
                }
                un4 un4 = un4.f36206a;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: b */
    public final boolean mo34988b() {
        v94 v94 = this.f27830a;
        if (v94 != null) {
            jt1.m53774m(v94);
            if (v94.mo46052a()) {
                this.f27834b = true;
            }
        }
        boolean z = false;
        for (int size = this.f27832a.size() - 1; size >= 0; size--) {
            if (this.f27832a.get(size).mo46052a()) {
                v94 v942 = this.f27832a.get(size);
                if (fa4.f28226a.mo35819a().isLoggable(Level.FINE)) {
                    da4.m44954c(v942, this, "canceled");
                }
                this.f27832a.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final void mo34989c(@vr2 String str, long j, boolean z, @vr2 cc1<un4> cc1) {
        jt1.m53777p(str, "name");
        jt1.m53777p(cc1, "block");
        mo34998m(new C5115b(cc1, str, z, str, z), j);
    }

    @ss2
    /* renamed from: e */
    public final v94 mo34990e() {
        return this.f27830a;
    }

    /* renamed from: f */
    public final boolean mo34991f() {
        return this.f27834b;
    }

    @vr2
    /* renamed from: g */
    public final List<v94> mo34992g() {
        return this.f27832a;
    }

    @vr2
    /* renamed from: h */
    public final String mo34993h() {
        return this.f27831a;
    }

    @vr2
    /* renamed from: i */
    public final List<v94> mo34994i() {
        List<v94> Q5;
        synchronized (this.f27829a) {
            Q5 = a10.m35769Q5(this.f27832a);
        }
        return Q5;
    }

    /* renamed from: j */
    public final boolean mo34995j() {
        return this.f27833a;
    }

    @vr2
    /* renamed from: k */
    public final fa4 mo34996k() {
        return this.f27829a;
    }

    @vr2
    /* renamed from: l */
    public final CountDownLatch mo34997l() {
        synchronized (this.f27829a) {
            if (this.f27830a != null || !this.f27832a.isEmpty()) {
                v94 v94 = this.f27830a;
                if (v94 instanceof C5114a) {
                    CountDownLatch i = ((C5114a) v94).mo35006i();
                    return i;
                }
                for (v94 next : this.f27832a) {
                    if (next instanceof C5114a) {
                        CountDownLatch i2 = ((C5114a) next).mo35006i();
                        return i2;
                    }
                }
                C5114a aVar = new C5114a();
                if (mo35000q(aVar, 0, false)) {
                    this.f27829a.mo35811i(this);
                }
                CountDownLatch i3 = aVar.mo35006i();
                return i3;
            }
            CountDownLatch countDownLatch = new CountDownLatch(0);
            return countDownLatch;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34998m(@com.onedelhi.secure.vr2 com.onedelhi.secure.v94 r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            com.onedelhi.secure.jt1.m53777p(r3, r0)
            com.onedelhi.secure.fa4 r0 = r2.f27829a
            monitor-enter(r0)
            boolean r1 = r2.f27833a     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0040
            boolean r4 = r3.mo46052a()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0027
            com.onedelhi.secure.fa4$b r4 = com.onedelhi.secure.fa4.f28226a     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = r4.mo35819a()     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            com.onedelhi.secure.da4.m44954c(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x0025:
            monitor-exit(r0)
            return
        L_0x0027:
            com.onedelhi.secure.fa4$b r4 = com.onedelhi.secure.fa4.f28226a     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = r4.mo35819a()     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            com.onedelhi.secure.da4.m44954c(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0050 }
            r3.<init>()     // Catch:{ all -> 0x0050 }
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0040:
            r1 = 0
            boolean r3 = r2.mo35000q(r3, r4, r1)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x004c
            com.onedelhi.secure.fa4 r3 = r2.f27829a     // Catch:{ all -> 0x0050 }
            r3.mo35811i(r2)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)
            return
        L_0x0050:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ea4.mo34998m(com.onedelhi.secure.v94, long):void");
    }

    /* renamed from: n */
    public final void mo34999n(@vr2 String str, long j, @vr2 cc1<Long> cc1) {
        jt1.m53777p(str, "name");
        jt1.m53777p(cc1, "block");
        mo34998m(new C5116c(cc1, str, str), j);
    }

    /* renamed from: q */
    public final boolean mo35000q(@vr2 v94 v94, long j, boolean z) {
        StringBuilder sb;
        String str;
        jt1.m53777p(v94, "task");
        v94.mo46056e(this);
        long nanoTime = this.f27829a.mo35810h().nanoTime();
        long j2 = nanoTime + j;
        int indexOf = this.f27832a.indexOf(v94);
        if (indexOf != -1) {
            if (v94.mo46054c() <= j2) {
                if (fa4.f28226a.mo35819a().isLoggable(Level.FINE)) {
                    da4.m44954c(v94, this, "already scheduled");
                }
                return false;
            }
            this.f27832a.remove(indexOf);
        }
        v94.mo46057g(j2);
        if (fa4.f28226a.mo35819a().isLoggable(Level.FINE)) {
            if (z) {
                sb = new StringBuilder();
                str = "run again after ";
            } else {
                sb = new StringBuilder();
                str = "scheduled after ";
            }
            sb.append(str);
            sb.append(da4.m44953b(j2 - nanoTime));
            da4.m44954c(v94, this, sb.toString());
        }
        Iterator<v94> it = this.f27832a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().mo46054c() - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f27832a.size();
        }
        this.f27832a.add(i, v94);
        return i == 0;
    }

    /* renamed from: r */
    public final void mo35001r(@ss2 v94 v94) {
        this.f27830a = v94;
    }

    /* renamed from: s */
    public final void mo35002s(boolean z) {
        this.f27834b = z;
    }

    /* renamed from: t */
    public final void mo35003t(boolean z) {
        this.f27833a = z;
    }

    @vr2
    public String toString() {
        return this.f27831a;
    }

    /* renamed from: u */
    public final void mo35005u() {
        if (!nq4.f32734a || !Thread.holdsLock(this)) {
            synchronized (this.f27829a) {
                this.f27833a = true;
                if (mo34988b()) {
                    this.f27829a.mo35811i(this);
                }
                un4 un4 = un4.f36206a;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }
}

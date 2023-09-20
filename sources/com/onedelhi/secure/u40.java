package com.onedelhi.secure;

import com.google.firebase.remoteconfig.internal.C4367b;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C3568t7
public class u40 {

    /* renamed from: a */
    public static final long f35961a = 5;
    @mj1("ConfigCacheClient.class")

    /* renamed from: a */
    public static final Map<String, u40> f35962a = new HashMap();

    /* renamed from: b */
    public static final Executor f35963b = t40.f35420a;

    /* renamed from: a */
    public final h50 f35964a;
    @mj1("this")
    @ts2

    /* renamed from: a */
    public w94<C4367b> f35965a = null;

    /* renamed from: a */
    public final Executor f35966a;

    /* renamed from: com.onedelhi.secure.u40$b */
    public static class C6927b<TResult> implements gv2<TResult>, vu2, mu2 {

        /* renamed from: a */
        public final CountDownLatch f35967a;

        public C6927b() {
            this.f35967a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public void mo7740a(TResult tresult) {
            this.f35967a.countDown();
        }

        /* renamed from: b */
        public void mo14940b() {
            this.f35967a.countDown();
        }

        /* renamed from: c */
        public void mo7919c(@mr2 Exception exc) {
            this.f35967a.countDown();
        }

        /* renamed from: d */
        public void mo45391d() throws InterruptedException {
            this.f35967a.await();
        }

        /* renamed from: e */
        public boolean mo45392e(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f35967a.await(j, timeUnit);
        }
    }

    public u40(Executor executor, h50 h50) {
        this.f35966a = executor;
        this.f35964a = h50;
    }

    /* renamed from: c */
    public static <TResult> TResult m66452c(w94<TResult> w94, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C6927b bVar = new C6927b();
        Executor executor = f35963b;
        w94.mo17580l(executor, bVar);
        w94.mo17577i(executor, bVar);
        w94.mo17571c(executor, bVar);
        if (!bVar.mo45392e(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (w94.mo17590v()) {
            return w94.mo17586r();
        } else {
            throw new ExecutionException(w94.mo17585q());
        }
    }

    @hw4
    /* renamed from: e */
    public static synchronized void m66453e() {
        synchronized (u40.class) {
            f35962a.clear();
        }
    }

    /* renamed from: j */
    public static synchronized u40 m66454j(Executor executor, h50 h50) {
        u40 u40;
        synchronized (u40.class) {
            String c = h50.mo37186c();
            Map<String, u40> map = f35962a;
            if (!map.containsKey(c)) {
                map.put(c, new u40(executor, h50));
            }
            u40 = map.get(c);
        }
        return u40;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Void m66455k(C4367b bVar) throws Exception {
        return this.f35964a.mo37188f(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ w94 m66456l(boolean z, C4367b bVar, Void voidR) throws Exception {
        if (z) {
            mo45390o(bVar);
        }
        return ha4.m16572g(bVar);
    }

    /* renamed from: d */
    public void mo45383d() {
        synchronized (this) {
            this.f35965a = ha4.m16572g(null);
        }
        this.f35964a.mo37185a();
    }

    /* renamed from: f */
    public synchronized w94<C4367b> mo45384f() {
        w94<C4367b> w94 = this.f35965a;
        if (w94 == null || (w94.mo17589u() && !this.f35965a.mo17590v())) {
            Executor executor = this.f35966a;
            h50 h50 = this.f35964a;
            Objects.requireNonNull(h50);
            this.f35965a = ha4.m16569d(executor, new s40(h50));
        }
        return this.f35965a;
    }

    @ts2
    /* renamed from: g */
    public C4367b mo45385g() {
        return mo45386h(5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return (com.google.firebase.remoteconfig.internal.C4367b) m66452c(mo45384f(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        android.util.Log.d(com.onedelhi.secure.n61.f32430b, "Reading from storage file failed.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        return null;
     */
    @com.onedelhi.secure.hw4
    @com.onedelhi.secure.ts2
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.C4367b mo45386h(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.onedelhi.secure.w94<com.google.firebase.remoteconfig.internal.b> r0 = r2.f35965a     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.mo17590v()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0015
            com.onedelhi.secure.w94<com.google.firebase.remoteconfig.internal.b> r3 = r2.f35965a     // Catch:{ all -> 0x0031 }
            java.lang.Object r3 = r3.mo17586r()     // Catch:{ all -> 0x0031 }
            com.google.firebase.remoteconfig.internal.b r3 = (com.google.firebase.remoteconfig.internal.C4367b) r3     // Catch:{ all -> 0x0031 }
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            return r3
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            com.onedelhi.secure.w94 r0 = r2.mo45384f()     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            java.lang.Object r3 = m66452c(r0, r3, r1)     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            com.google.firebase.remoteconfig.internal.b r3 = (com.google.firebase.remoteconfig.internal.C4367b) r3     // Catch:{ InterruptedException -> 0x0027, ExecutionException -> 0x0025, TimeoutException -> 0x0023 }
            return r3
        L_0x0023:
            r3 = move-exception
            goto L_0x0028
        L_0x0025:
            r3 = move-exception
            goto L_0x0028
        L_0x0027:
            r3 = move-exception
        L_0x0028:
            java.lang.String r4 = "FirebaseRemoteConfig"
            java.lang.String r0 = "Reading from storage file failed."
            android.util.Log.d(r4, r0, r3)
            r3 = 0
            return r3
        L_0x0031:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.u40.mo45386h(long):com.google.firebase.remoteconfig.internal.b");
    }

    @hw4
    @ts2
    /* renamed from: i */
    public synchronized w94<C4367b> mo45387i() {
        return this.f35965a;
    }

    /* renamed from: m */
    public w94<C4367b> mo45388m(C4367b bVar) {
        return mo45389n(bVar, true);
    }

    /* renamed from: n */
    public w94<C4367b> mo45389n(C4367b bVar, boolean z) {
        return ha4.m16569d(this.f35966a, new r40(this, bVar)).mo17592x(this.f35966a, new q40(this, z, bVar));
    }

    /* renamed from: o */
    public final synchronized void mo45390o(C4367b bVar) {
        this.f35965a = ha4.m16572g(bVar);
    }
}

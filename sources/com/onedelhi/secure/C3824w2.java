package com.onedelhi.secure;

import android.os.Process;
import com.onedelhi.secure.su0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.onedelhi.secure.w2 */
public final class C3824w2 {

    /* renamed from: a */
    public su0.C3544a f22029a;
    @ts2

    /* renamed from: a */
    public volatile C3828c f22030a;

    /* renamed from: a */
    public final ReferenceQueue<su0<?>> f22031a;
    @hw4

    /* renamed from: a */
    public final Map<ky1, C3829d> f22032a;

    /* renamed from: a */
    public final Executor f22033a;

    /* renamed from: a */
    public final boolean f22034a;

    /* renamed from: b */
    public volatile boolean f22035b;

    /* renamed from: com.onedelhi.secure.w2$a */
    public class C3825a implements ThreadFactory {

        /* renamed from: com.onedelhi.secure.w2$a$a */
        public class C3826a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f22037a;

            public C3826a(Runnable runnable) {
                this.f22037a = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f22037a.run();
            }
        }

        public Thread newThread(@mr2 Runnable runnable) {
            return new Thread(new C3826a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.onedelhi.secure.w2$b */
    public class C3827b implements Runnable {
        public C3827b() {
        }

        public void run() {
            C3824w2.this.mo26424b();
        }
    }

    @hw4
    /* renamed from: com.onedelhi.secure.w2$c */
    public interface C3828c {
        /* renamed from: a */
        void mo26434a();
    }

    @hw4
    /* renamed from: com.onedelhi.secure.w2$d */
    public static final class C3829d extends WeakReference<su0<?>> {
        @ts2

        /* renamed from: a */
        public ck3<?> f22039a;

        /* renamed from: a */
        public final ky1 f22040a;

        /* renamed from: a */
        public final boolean f22041a;

        public C3829d(@mr2 ky1 ky1, @mr2 su0<?> su0, @mr2 ReferenceQueue<? super su0<?>> referenceQueue, boolean z) {
            super(su0, referenceQueue);
            this.f22040a = (ky1) g43.m15509d(ky1);
            this.f22039a = (!su0.mo24549f() || !z) ? null : (ck3) g43.m15509d(su0.mo24548e());
            this.f22041a = su0.mo24549f();
        }

        /* renamed from: a */
        public void mo26435a() {
            this.f22039a = null;
            clear();
        }
    }

    public C3824w2(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C3825a()));
    }

    @hw4
    public C3824w2(boolean z, Executor executor) {
        this.f22032a = new HashMap();
        this.f22031a = new ReferenceQueue<>();
        this.f22034a = z;
        this.f22033a = executor;
        executor.execute(new C3827b());
    }

    /* renamed from: a */
    public synchronized void mo26423a(ky1 ky1, su0<?> su0) {
        C3829d put = this.f22032a.put(ky1, new C3829d(ky1, su0, this.f22031a, this.f22034a));
        if (put != null) {
            put.mo26435a();
        }
    }

    /* renamed from: b */
    public void mo26424b() {
        while (!this.f22035b) {
            try {
                mo26425c((C3829d) this.f22031a.remove());
                C3828c cVar = this.f22030a;
                if (cVar != null) {
                    cVar.mo26434a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void mo26425c(@mr2 C3829d dVar) {
        synchronized (this) {
            this.f22032a.remove(dVar.f22040a);
            if (dVar.f22041a) {
                ck3<?> ck3 = dVar.f22039a;
                if (ck3 != null) {
                    this.f22029a.mo21473a(dVar.f22040a, new su0(ck3, true, false, dVar.f22040a, this.f22029a));
                }
            }
        }
    }

    /* renamed from: d */
    public synchronized void mo26426d(ky1 ky1) {
        C3829d remove = this.f22032a.remove(ky1);
        if (remove != null) {
            remove.mo26435a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    @com.onedelhi.secure.ts2
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.onedelhi.secure.su0<?> mo26427e(com.onedelhi.secure.ky1 r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.onedelhi.secure.ky1, com.onedelhi.secure.w2$d> r0 = r1.f22032a     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.onedelhi.secure.w2$d r2 = (com.onedelhi.secure.C3824w2.C3829d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.onedelhi.secure.su0 r0 = (com.onedelhi.secure.su0) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo26425c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3824w2.mo26427e(com.onedelhi.secure.ky1):com.onedelhi.secure.su0");
    }

    @hw4
    /* renamed from: f */
    public void mo26428f(C3828c cVar) {
        this.f22030a = cVar;
    }

    /* renamed from: g */
    public void mo26429g(su0.C3544a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f22029a = aVar;
            }
        }
    }

    @hw4
    /* renamed from: h */
    public void mo26430h() {
        this.f22035b = true;
        Executor executor = this.f22033a;
        if (executor instanceof ExecutorService) {
            cx0.m12786c((ExecutorService) executor);
        }
    }
}

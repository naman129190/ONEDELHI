package com.onedelhi.secure;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.onedelhi.secure.kd */
public final class C2625kd {
    @mj1("mLock")

    /* renamed from: a */
    public int f14826a = 0;

    /* renamed from: a */
    public final long f14827a;
    @mr2

    /* renamed from: a */
    public final Handler f14828a = new Handler(Looper.getMainLooper());
    @mj1("mLock")
    @ts2

    /* renamed from: a */
    public n74 f14829a;
    @ts2

    /* renamed from: a */
    public o74 f14830a = null;
    @mr2

    /* renamed from: a */
    public final Object f14831a = new Object();
    @ts2

    /* renamed from: a */
    public Runnable f14832a = null;
    @mr2

    /* renamed from: a */
    public final Executor f14833a;

    /* renamed from: a */
    public boolean f14834a = false;
    @mj1("mLock")

    /* renamed from: b */
    public long f14835b = SystemClock.uptimeMillis();

    /* renamed from: b */
    public final Runnable f14836b = new C2626a();
    @mr2

    /* renamed from: c */
    public final Runnable f14837c = new C2627b();

    /* renamed from: com.onedelhi.secure.kd$a */
    public class C2626a implements Runnable {
        public C2626a() {
        }

        public void run() {
            C2625kd kdVar = C2625kd.this;
            kdVar.f14833a.execute(kdVar.f14837c);
        }
    }

    /* renamed from: com.onedelhi.secure.kd$b */
    public class C2627b implements Runnable {
        public C2627b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                com.onedelhi.secure.kd r0 = com.onedelhi.secure.C2625kd.this
                java.lang.Object r0 = r0.f14831a
                monitor-enter(r0)
                long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x004a }
                com.onedelhi.secure.kd r3 = com.onedelhi.secure.C2625kd.this     // Catch:{ all -> 0x004a }
                long r4 = r3.f14835b     // Catch:{ all -> 0x004a }
                long r1 = r1 - r4
                long r4 = r3.f14827a     // Catch:{ all -> 0x004a }
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 >= 0) goto L_0x0016
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x0016:
                int r1 = r3.f14826a     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x001c
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x001c:
                java.lang.Runnable r1 = r3.f14832a     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0042
                r1.run()     // Catch:{ all -> 0x004a }
                com.onedelhi.secure.kd r1 = com.onedelhi.secure.C2625kd.this     // Catch:{ all -> 0x004a }
                com.onedelhi.secure.n74 r1 = r1.f14829a     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0040
                boolean r1 = r1.isOpen()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0040
                com.onedelhi.secure.kd r1 = com.onedelhi.secure.C2625kd.this     // Catch:{ IOException -> 0x0037 }
                com.onedelhi.secure.n74 r1 = r1.f14829a     // Catch:{ IOException -> 0x0037 }
                r1.close()     // Catch:{ IOException -> 0x0037 }
                goto L_0x003b
            L_0x0037:
                r1 = move-exception
                com.onedelhi.secure.r04.m26249a(r1)     // Catch:{ all -> 0x004a }
            L_0x003b:
                com.onedelhi.secure.kd r1 = com.onedelhi.secure.C2625kd.this     // Catch:{ all -> 0x004a }
                r2 = 0
                r1.f14829a = r2     // Catch:{ all -> 0x004a }
            L_0x0040:
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                return
            L_0x0042:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004a }
                java.lang.String r2 = "mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568"
                r1.<init>(r2)     // Catch:{ all -> 0x004a }
                throw r1     // Catch:{ all -> 0x004a }
            L_0x004a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C2625kd.C2627b.run():void");
        }
    }

    public C2625kd(long j, @mr2 TimeUnit timeUnit, @mr2 Executor executor) {
        this.f14827a = timeUnit.toMillis(j);
        this.f14833a = executor;
    }

    /* renamed from: a */
    public void mo19005a() throws IOException {
        synchronized (this.f14831a) {
            this.f14834a = true;
            n74 n74 = this.f14829a;
            if (n74 != null) {
                n74.close();
            }
            this.f14829a = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19006b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f14831a
            monitor-enter(r0)
            int r1 = r5.f14826a     // Catch:{ all -> 0x0026 }
            if (r1 <= 0) goto L_0x001e
            int r1 = r1 + -1
            r5.f14826a = r1     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x001c
            com.onedelhi.secure.n74 r1 = r5.f14829a     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0013:
            android.os.Handler r1 = r5.f14828a     // Catch:{ all -> 0x0026 }
            java.lang.Runnable r2 = r5.f14836b     // Catch:{ all -> 0x0026 }
            long r3 = r5.f14827a     // Catch:{ all -> 0x0026 }
            r1.postDelayed(r2, r3)     // Catch:{ all -> 0x0026 }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "ref count is 0 or lower but we're supposed to decrement"
            r1.<init>(r2)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C2625kd.mo19006b():void");
    }

    @ts2
    /* renamed from: c */
    public <V> V mo19007c(@mr2 bd1<n74, V> bd1) {
        try {
            return bd1.mo4430a(mo19010f());
        } finally {
            mo19006b();
        }
    }

    @ts2
    /* renamed from: d */
    public n74 mo19008d() {
        n74 n74;
        synchronized (this.f14831a) {
            n74 = this.f14829a;
        }
        return n74;
    }

    @hw4
    /* renamed from: e */
    public int mo19009e() {
        int i;
        synchronized (this.f14831a) {
            i = this.f14826a;
        }
        return i;
    }

    @mr2
    /* renamed from: f */
    public n74 mo19010f() {
        synchronized (this.f14831a) {
            this.f14828a.removeCallbacks(this.f14836b);
            this.f14826a++;
            if (!this.f14834a) {
                n74 n74 = this.f14829a;
                if (n74 == null || !n74.isOpen()) {
                    o74 o74 = this.f14830a;
                    if (o74 != null) {
                        n74 x = o74.mo13235x();
                        this.f14829a = x;
                        return x;
                    }
                    throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                n74 n742 = this.f14829a;
                return n742;
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    /* renamed from: g */
    public void mo19011g(@mr2 o74 o74) {
        if (this.f14830a != null) {
            Log.e(vm3.f21887a, "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.f14830a = o74;
        }
    }

    /* renamed from: h */
    public boolean mo19012h() {
        return !this.f14834a;
    }

    /* renamed from: i */
    public void mo19013i(Runnable runnable) {
        this.f14832a = runnable;
    }
}

package com.onedelhi.secure;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: com.onedelhi.secure.c7 */
public class C1853c7 {

    /* renamed from: a */
    public static final ThreadLocal<C1853c7> f10158a = new ThreadLocal<>();

    /* renamed from: b */
    public static final long f10159b = 10;

    /* renamed from: a */
    public long f10160a = 0;

    /* renamed from: a */
    public final C1854a f10161a = new C1854a();

    /* renamed from: a */
    public C1856c f10162a;

    /* renamed from: a */
    public final ty3<C1855b, Long> f10163a = new ty3<>();

    /* renamed from: a */
    public final ArrayList<C1855b> f10164a = new ArrayList<>();

    /* renamed from: a */
    public boolean f10165a = false;

    /* renamed from: com.onedelhi.secure.c7$a */
    public class C1854a {
        public C1854a() {
        }

        /* renamed from: a */
        public void mo14040a() {
            C1853c7.this.f10160a = SystemClock.uptimeMillis();
            C1853c7 c7Var = C1853c7.this;
            c7Var.mo14035c(c7Var.f10160a);
            if (C1853c7.this.f10164a.size() > 0) {
                C1853c7.this.mo14036f().mo14042a();
            }
        }
    }

    /* renamed from: com.onedelhi.secure.c7$b */
    public interface C1855b {
        /* renamed from: a */
        boolean mo14041a(long j);
    }

    /* renamed from: com.onedelhi.secure.c7$c */
    public static abstract class C1856c {

        /* renamed from: a */
        public final C1854a f10167a;

        public C1856c(C1854a aVar) {
            this.f10167a = aVar;
        }

        /* renamed from: a */
        public abstract void mo14042a();
    }

    /* renamed from: com.onedelhi.secure.c7$d */
    public static class C1857d extends C1856c {

        /* renamed from: a */
        public long f10168a = -1;

        /* renamed from: a */
        public final Handler f10169a = new Handler(Looper.myLooper());

        /* renamed from: a */
        public final Runnable f10170a = new C1858a();

        /* renamed from: com.onedelhi.secure.c7$d$a */
        public class C1858a implements Runnable {
            public C1858a() {
            }

            public void run() {
                C1857d.this.f10168a = SystemClock.uptimeMillis();
                C1857d.this.f10167a.mo14040a();
            }
        }

        public C1857d(C1854a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void mo14042a() {
            this.f10169a.postDelayed(this.f10170a, Math.max(10 - (SystemClock.uptimeMillis() - this.f10168a), 0));
        }
    }

    @sj3(16)
    /* renamed from: com.onedelhi.secure.c7$e */
    public static class C1859e extends C1856c {

        /* renamed from: a */
        public final Choreographer.FrameCallback f10172a = new C1860a();

        /* renamed from: a */
        public final Choreographer f10173a = Choreographer.getInstance();

        /* renamed from: com.onedelhi.secure.c7$e$a */
        public class C1860a implements Choreographer.FrameCallback {
            public C1860a() {
            }

            public void doFrame(long j) {
                C1859e.this.f10167a.mo14040a();
            }
        }

        public C1859e(C1854a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void mo14042a() {
            this.f10173a.postFrameCallback(this.f10172a);
        }
    }

    /* renamed from: d */
    public static long m12356d() {
        ThreadLocal<C1853c7> threadLocal = f10158a;
        if (threadLocal.get() == null) {
            return 0;
        }
        return threadLocal.get().f10160a;
    }

    /* renamed from: e */
    public static C1853c7 m12357e() {
        ThreadLocal<C1853c7> threadLocal = f10158a;
        if (threadLocal.get() == null) {
            threadLocal.set(new C1853c7());
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public void mo14033a(C1855b bVar, long j) {
        if (this.f10164a.size() == 0) {
            mo14036f().mo14042a();
        }
        if (!this.f10164a.contains(bVar)) {
            this.f10164a.add(bVar);
        }
        if (j > 0) {
            this.f10163a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* renamed from: b */
    public final void mo14034b() {
        if (this.f10165a) {
            for (int size = this.f10164a.size() - 1; size >= 0; size--) {
                if (this.f10164a.get(size) == null) {
                    this.f10164a.remove(size);
                }
            }
            this.f10165a = false;
        }
    }

    /* renamed from: c */
    public void mo14035c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f10164a.size(); i++) {
            C1855b bVar = this.f10164a.get(i);
            if (bVar != null && mo14037g(bVar, uptimeMillis)) {
                bVar.mo14041a(j);
            }
        }
        mo14034b();
    }

    /* renamed from: f */
    public C1856c mo14036f() {
        if (this.f10162a == null) {
            this.f10162a = new C1859e(this.f10161a);
        }
        return this.f10162a;
    }

    /* renamed from: g */
    public final boolean mo14037g(C1855b bVar, long j) {
        Long l = this.f10163a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f10163a.remove(bVar);
        return true;
    }

    /* renamed from: h */
    public void mo14038h(C1855b bVar) {
        this.f10163a.remove(bVar);
        int indexOf = this.f10164a.indexOf(bVar);
        if (indexOf >= 0) {
            this.f10164a.set(indexOf, (Object) null);
            this.f10165a = true;
        }
    }

    /* renamed from: i */
    public void mo14039i(C1856c cVar) {
        this.f10162a = cVar;
    }
}

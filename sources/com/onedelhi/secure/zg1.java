package com.onedelhi.secure;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zg1 implements ExecutorService {

    /* renamed from: b */
    public static final long f23631b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    public static final String f23632b = "source";

    /* renamed from: c */
    public static final String f23633c = "disk-cache";

    /* renamed from: d */
    public static final String f23634d = "GlideExecutor";

    /* renamed from: e */
    public static final String f23635e = "source-unlimited";

    /* renamed from: f */
    public static final String f23636f = "animation";

    /* renamed from: n */
    public static final int f23637n = 1;

    /* renamed from: o */
    public static final int f23638o = 4;

    /* renamed from: p */
    public static volatile int f23639p;

    /* renamed from: a */
    public final ExecutorService f23640a;

    /* renamed from: com.onedelhi.secure.zg1$a */
    public static final class C4087a {

        /* renamed from: b */
        public static final long f23641b = 0;

        /* renamed from: a */
        public int f23642a;

        /* renamed from: a */
        public long f23643a;
        @mr2

        /* renamed from: a */
        public C4090c f23644a = C4090c.f23657d;

        /* renamed from: a */
        public String f23645a;

        /* renamed from: a */
        public final boolean f23646a;

        /* renamed from: b */
        public int f23647b;

        public C4087a(boolean z) {
            this.f23646a = z;
        }

        /* renamed from: a */
        public zg1 mo27979a() {
            if (!TextUtils.isEmpty(this.f23645a)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f23642a, this.f23647b, this.f23643a, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C4088b(this.f23645a, this.f23644a, this.f23646a));
                if (this.f23643a != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new zg1(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f23645a);
        }

        /* renamed from: b */
        public C4087a mo27980b(String str) {
            this.f23645a = str;
            return this;
        }

        /* renamed from: c */
        public C4087a mo27981c(@js1(from = 1) int i) {
            this.f23642a = i;
            this.f23647b = i;
            return this;
        }

        /* renamed from: d */
        public C4087a mo27982d(long j) {
            this.f23643a = j;
            return this;
        }

        /* renamed from: e */
        public C4087a mo27983e(@mr2 C4090c cVar) {
            this.f23644a = cVar;
            return this;
        }
    }

    /* renamed from: com.onedelhi.secure.zg1$b */
    public static final class C4088b implements ThreadFactory {

        /* renamed from: b */
        public static final int f23648b = 9;

        /* renamed from: a */
        public int f23649a;

        /* renamed from: a */
        public final C4090c f23650a;

        /* renamed from: a */
        public final String f23651a;

        /* renamed from: a */
        public final boolean f23652a;

        /* renamed from: com.onedelhi.secure.zg1$b$a */
        public class C4089a extends Thread {
            public C4089a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C4088b.this.f23652a) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C4088b.this.f23650a.mo27986a(th);
                }
            }
        }

        public C4088b(String str, C4090c cVar, boolean z) {
            this.f23651a = str;
            this.f23650a = cVar;
            this.f23652a = z;
        }

        public synchronized Thread newThread(@mr2 Runnable runnable) {
            C4089a aVar;
            aVar = new C4089a(runnable, "glide-" + this.f23651a + "-thread-" + this.f23649a);
            this.f23649a = this.f23649a + 1;
            return aVar;
        }
    }

    /* renamed from: com.onedelhi.secure.zg1$c */
    public interface C4090c {

        /* renamed from: a */
        public static final C4090c f23654a = new C4091a();

        /* renamed from: b */
        public static final C4090c f23655b;

        /* renamed from: c */
        public static final C4090c f23656c = new C4093c();

        /* renamed from: d */
        public static final C4090c f23657d;

        /* renamed from: com.onedelhi.secure.zg1$c$a */
        public class C4091a implements C4090c {
            /* renamed from: a */
            public void mo27986a(Throwable th) {
            }
        }

        /* renamed from: com.onedelhi.secure.zg1$c$b */
        public class C4092b implements C4090c {
            /* renamed from: a */
            public void mo27986a(Throwable th) {
                if (th != null && Log.isLoggable(zg1.f23634d, 6)) {
                    Log.e(zg1.f23634d, "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: com.onedelhi.secure.zg1$c$c */
        public class C4093c implements C4090c {
            /* renamed from: a */
            public void mo27986a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C4092b bVar = new C4092b();
            f23655b = bVar;
            f23657d = bVar;
        }

        /* renamed from: a */
        void mo27986a(Throwable th);
    }

    @hw4
    public zg1(ExecutorService executorService) {
        this.f23640a = executorService;
    }

    /* renamed from: a */
    public static int m33116a() {
        if (f23639p == 0) {
            f23639p = Math.min(4, oo3.m23964a());
        }
        return f23639p;
    }

    /* renamed from: b */
    public static C4087a m33117b() {
        return new C4087a(true).mo27981c(m33116a() >= 4 ? 2 : 1).mo27980b(f23636f);
    }

    /* renamed from: c */
    public static zg1 m33118c() {
        return m33117b().mo27979a();
    }

    @Deprecated
    /* renamed from: d */
    public static zg1 m33119d(int i, C4090c cVar) {
        return m33117b().mo27981c(i).mo27983e(cVar).mo27979a();
    }

    /* renamed from: e */
    public static C4087a m33120e() {
        return new C4087a(true).mo27981c(1).mo27980b(f23633c);
    }

    /* renamed from: f */
    public static zg1 m33121f() {
        return m33120e().mo27979a();
    }

    @Deprecated
    /* renamed from: g */
    public static zg1 m33122g(int i, String str, C4090c cVar) {
        return m33120e().mo27981c(i).mo27980b(str).mo27983e(cVar).mo27979a();
    }

    @Deprecated
    /* renamed from: h */
    public static zg1 m33123h(C4090c cVar) {
        return m33120e().mo27983e(cVar).mo27979a();
    }

    /* renamed from: i */
    public static C4087a m33124i() {
        return new C4087a(false).mo27981c(m33116a()).mo27980b("source");
    }

    /* renamed from: j */
    public static zg1 m33125j() {
        return m33124i().mo27979a();
    }

    @Deprecated
    /* renamed from: k */
    public static zg1 m33126k(int i, String str, C4090c cVar) {
        return m33124i().mo27981c(i).mo27980b(str).mo27983e(cVar).mo27979a();
    }

    @Deprecated
    /* renamed from: l */
    public static zg1 m33127l(C4090c cVar) {
        return m33124i().mo27983e(cVar).mo27979a();
    }

    /* renamed from: m */
    public static zg1 m33128m() {
        return new zg1(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f23631b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C4088b(f23635e, C4090c.f23657d, false)));
    }

    public boolean awaitTermination(long j, @mr2 TimeUnit timeUnit) throws InterruptedException {
        return this.f23640a.awaitTermination(j, timeUnit);
    }

    public void execute(@mr2 Runnable runnable) {
        this.f23640a.execute(runnable);
    }

    @mr2
    public <T> List<Future<T>> invokeAll(@mr2 Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f23640a.invokeAll(collection);
    }

    @mr2
    public <T> List<Future<T>> invokeAll(@mr2 Collection<? extends Callable<T>> collection, long j, @mr2 TimeUnit timeUnit) throws InterruptedException {
        return this.f23640a.invokeAll(collection, j, timeUnit);
    }

    @mr2
    public <T> T invokeAny(@mr2 Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f23640a.invokeAny(collection);
    }

    public <T> T invokeAny(@mr2 Collection<? extends Callable<T>> collection, long j, @mr2 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f23640a.invokeAny(collection, j, timeUnit);
    }

    public boolean isShutdown() {
        return this.f23640a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f23640a.isTerminated();
    }

    public void shutdown() {
        this.f23640a.shutdown();
    }

    @mr2
    public List<Runnable> shutdownNow() {
        return this.f23640a.shutdownNow();
    }

    @mr2
    public Future<?> submit(@mr2 Runnable runnable) {
        return this.f23640a.submit(runnable);
    }

    @mr2
    public <T> Future<T> submit(@mr2 Runnable runnable, T t) {
        return this.f23640a.submit(runnable, t);
    }

    public <T> Future<T> submit(@mr2 Callable<T> callable) {
        return this.f23640a.submit(callable);
    }

    public String toString() {
        return this.f23640a.toString();
    }
}

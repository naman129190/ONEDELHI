package com.onedelhi.secure;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.onedelhi.secure.hl3;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class wj2<Params, Progress, Result> {

    /* renamed from: a */
    public static C3848f f22162a = null;

    /* renamed from: a */
    public static final BlockingQueue<Runnable> f22163a;

    /* renamed from: a */
    public static final Executor f22164a;

    /* renamed from: a */
    public static final ThreadFactory f22165a;

    /* renamed from: b */
    public static final String f22166b = "AsyncTask";

    /* renamed from: b */
    public static volatile Executor f22167b = null;

    /* renamed from: n */
    public static final int f22168n = 5;

    /* renamed from: o */
    public static final int f22169o = 128;

    /* renamed from: p */
    public static final int f22170p = 1;

    /* renamed from: q */
    public static final int f22171q = 1;

    /* renamed from: r */
    public static final int f22172r = 2;

    /* renamed from: a */
    public volatile C3849g f22173a = C3849g.PENDING;

    /* renamed from: a */
    public final C3850h<Params, Result> f22174a;

    /* renamed from: a */
    public final FutureTask<Result> f22175a;

    /* renamed from: a */
    public final AtomicBoolean f22176a = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicBoolean f22177b = new AtomicBoolean();

    /* renamed from: com.onedelhi.secure.wj2$a */
    public static class C3843a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f22178a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f22178a.getAndIncrement());
        }
    }

    /* renamed from: com.onedelhi.secure.wj2$b */
    public class C3844b extends C3850h<Params, Result> {
        public C3844b() {
        }

        public Result call() throws Exception {
            wj2.this.f22177b.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = wj2.this.mo21853b(this.f22188a);
                Binder.flushPendingCommands();
                wj2.this.mo26599q(result);
                return result;
            } catch (Throwable th) {
                wj2.this.mo26599q(result);
                throw th;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.wj2$c */
    public class C3845c extends FutureTask<Result> {
        public C3845c(Callable callable) {
            super(callable);
        }

        public void done() {
            try {
                wj2.this.mo26600r(get());
            } catch (InterruptedException e) {
                Log.w(wj2.f22166b, e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                wj2.this.mo26600r(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.wj2$d */
    public static /* synthetic */ class C3846d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22181a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.onedelhi.secure.wj2$g[] r0 = com.onedelhi.secure.wj2.C3849g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22181a = r0
                com.onedelhi.secure.wj2$g r1 = com.onedelhi.secure.wj2.C3849g.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22181a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.wj2$g r1 = com.onedelhi.secure.wj2.C3849g.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.wj2.C3846d.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.wj2$e */
    public static class C3847e<Data> {

        /* renamed from: a */
        public final wj2 f22182a;

        /* renamed from: a */
        public final Data[] f22183a;

        public C3847e(wj2 wj2, Data... dataArr) {
            this.f22182a = wj2;
            this.f22183a = dataArr;
        }
    }

    /* renamed from: com.onedelhi.secure.wj2$f */
    public static class C3848f extends Handler {
        public C3848f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C3847e eVar = (C3847e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f22182a.mo26591f(eVar.f22183a[0]);
            } else if (i == 2) {
                eVar.f22182a.mo26598p(eVar.f22183a);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.wj2$g */
    public enum C3849g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: com.onedelhi.secure.wj2$h */
    public static abstract class C3850h<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        public Params[] f22188a;
    }

    static {
        C3843a aVar = new C3843a();
        f22165a = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f22163a = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f22164a = threadPoolExecutor;
        f22167b = threadPoolExecutor;
    }

    public wj2() {
        C3844b bVar = new C3844b();
        this.f22174a = bVar;
        this.f22175a = new C3845c(bVar);
    }

    /* renamed from: d */
    public static void m30890d(Runnable runnable) {
        f22167b.execute(runnable);
    }

    /* renamed from: i */
    public static Handler m30891i() {
        C3848f fVar;
        synchronized (wj2.class) {
            if (f22162a == null) {
                f22162a = new C3848f();
            }
            fVar = f22162a;
        }
        return fVar;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: t */
    public static void m30892t(Executor executor) {
        f22167b = executor;
    }

    /* renamed from: a */
    public final boolean mo26588a(boolean z) {
        this.f22176a.set(true);
        return this.f22175a.cancel(z);
    }

    /* renamed from: b */
    public abstract Result mo21853b(Params... paramsArr);

    /* renamed from: c */
    public final wj2<Params, Progress, Result> mo26589c(Params... paramsArr) {
        return mo26590e(f22167b, paramsArr);
    }

    /* renamed from: e */
    public final wj2<Params, Progress, Result> mo26590e(Executor executor, Params... paramsArr) {
        if (this.f22173a != C3849g.PENDING) {
            int i = C3846d.f22181a[this.f22173a.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f22173a = C3849g.RUNNING;
            mo26597o();
            this.f22174a.f22188a = paramsArr;
            executor.execute(this.f22175a);
            return this;
        }
    }

    /* renamed from: f */
    public void mo26591f(Result result) {
        if (mo26595k()) {
            mo21854m(result);
        } else {
            mo21855n(result);
        }
        this.f22173a = C3849g.FINISHED;
    }

    /* renamed from: g */
    public final Result mo26592g() throws InterruptedException, ExecutionException {
        return this.f22175a.get();
    }

    /* renamed from: h */
    public final Result mo26593h(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f22175a.get(j, timeUnit);
    }

    /* renamed from: j */
    public final C3849g mo26594j() {
        return this.f22173a;
    }

    /* renamed from: k */
    public final boolean mo26595k() {
        return this.f22176a.get();
    }

    /* renamed from: l */
    public void mo26596l() {
    }

    /* renamed from: m */
    public void mo21854m(Result result) {
        mo26596l();
    }

    /* renamed from: n */
    public void mo21855n(Result result) {
    }

    /* renamed from: o */
    public void mo26597o() {
    }

    /* renamed from: p */
    public void mo26598p(Progress... progressArr) {
    }

    /* renamed from: q */
    public Result mo26599q(Result result) {
        m30891i().obtainMessage(1, new C3847e(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: r */
    public void mo26600r(Result result) {
        if (!this.f22177b.get()) {
            mo26599q(result);
        }
    }

    /* renamed from: s */
    public final void mo26601s(Progress... progressArr) {
        if (!mo26595k()) {
            m30891i().obtainMessage(2, new C3847e(this, progressArr)).sendToTarget();
        }
    }
}

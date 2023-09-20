package okhttp3;

import com.onedelhi.secure.a10;
import com.onedelhi.secure.ak0;
import com.onedelhi.secure.dg3;
import com.onedelhi.secure.es2;
import com.onedelhi.secure.jt1;
import com.onedelhi.secure.nq4;
import com.onedelhi.secure.oi3;
import com.onedelhi.secure.ss2;
import com.onedelhi.secure.t00;
import com.onedelhi.secure.un4;
import com.onedelhi.secure.uw1;
import com.onedelhi.secure.vr2;
import com.onedelhi.secure.xj0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<B\u0011\b\u0016\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b;\u0010=J\u0016\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0013\u001a\u00020\rJ\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\u000f\u0010\"\u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!R*\u0010#\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001c8F@FX\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010)\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c8F@FX\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R.\u0010.\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8F@FX\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00107\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u00109\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u0005068\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0005068\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0011\u0010\"\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b\"\u0010!¨\u0006>"}, d2 = {"Lokhttp3/Dispatcher;", "", "", "host", "Lcom/onedelhi/secure/dg3$a;", "Lcom/onedelhi/secure/dg3;", "findExistingCallWithHost", "", "promoteAndExecute", "T", "Ljava/util/Deque;", "calls", "call", "Lcom/onedelhi/secure/un4;", "finished", "(Ljava/util/Deque;Ljava/lang/Object;)V", "enqueue$okhttp", "(Lcom/onedelhi/secure/dg3$a;)V", "enqueue", "cancelAll", "executed$okhttp", "(Lcom/onedelhi/secure/dg3;)V", "executed", "finished$okhttp", "", "Lokhttp3/Call;", "queuedCalls", "runningCalls", "", "queuedCallsCount", "runningCallsCount", "Ljava/util/concurrent/ExecutorService;", "-deprecated_executorService", "()Ljava/util/concurrent/ExecutorService;", "executorService", "maxRequests", "I", "getMaxRequests", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "<set-?>", "idleCallback", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "executorServiceOrNull", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "Ljava/util/ArrayDeque;", "runningAsyncCalls", "runningSyncCalls", "<init>", "()V", "(Ljava/util/concurrent/ExecutorService;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    @ss2
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<dg3.C5025a> readyAsyncCalls;
    private final ArrayDeque<dg3.C5025a> runningAsyncCalls;
    private final ArrayDeque<dg3> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Dispatcher(@vr2 ExecutorService executorService) {
        this();
        jt1.m53777p(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }

    private final dg3.C5025a findExistingCallWithHost(String str) {
        Iterator<dg3.C5025a> it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            dg3.C5025a next = it.next();
            if (jt1.m53768g(next.mo34453d(), str)) {
                return next;
            }
        }
        Iterator<dg3.C5025a> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            dg3.C5025a next2 = it2.next();
            if (jt1.m53768g(next2.mo34453d(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.idleCallback;
                un4 un4 = un4.f36206a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!promoteAndExecute() && runnable != null) {
            runnable.run();
        }
    }

    private final boolean promoteAndExecute() {
        int i;
        boolean z;
        if (!nq4.f32734a || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator<dg3.C5025a> it = this.readyAsyncCalls.iterator();
                jt1.m53776o(it, "readyAsyncCalls.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    dg3.C5025a next = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    } else if (next.mo34452c().get() < this.maxRequestsPerHost) {
                        it.remove();
                        next.mo34452c().incrementAndGet();
                        jt1.m53776o(next, "asyncCall");
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                z = runningCallsCount() > 0;
                un4 un4 = un4.f36206a;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                ((dg3.C5025a) arrayList.get(i)).mo34450a(executorService());
            }
            return z;
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

    @uw1(name = "-deprecated_executorService")
    @vr2
    @xj0(level = ak0.ERROR, message = "moved to val", replaceWith = @oi3(expression = "executorService", imports = {}))
    /* renamed from: -deprecated_executorService  reason: not valid java name */
    public final ExecutorService m74786deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        Iterator<dg3.C5025a> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            it.next().mo34451b().cancel();
        }
        Iterator<dg3.C5025a> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().mo34451b().cancel();
        }
        Iterator<dg3> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void enqueue$okhttp(@vr2 dg3.C5025a aVar) {
        dg3.C5025a findExistingCallWithHost;
        jt1.m53777p(aVar, es2.f11366Q);
        synchronized (this) {
            this.readyAsyncCalls.add(aVar);
            if (!aVar.mo34451b().mo34435n() && (findExistingCallWithHost = findExistingCallWithHost(aVar.mo34453d())) != null) {
                aVar.mo34455f(findExistingCallWithHost);
            }
            un4 un4 = un4.f36206a;
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(@vr2 dg3 dg3) {
        jt1.m53777p(dg3, es2.f11366Q);
        this.runningSyncCalls.add(dg3);
    }

    @uw1(name = "executorService")
    @vr2
    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, nq4.m58684V(nq4.f32729a + " Dispatcher", false));
        }
        executorService = this.executorServiceOrNull;
        jt1.m53774m(executorService);
        return executorService;
    }

    public final void finished$okhttp(@vr2 dg3.C5025a aVar) {
        jt1.m53777p(aVar, es2.f11366Q);
        aVar.mo34452c().decrementAndGet();
        finished(this.runningAsyncCalls, aVar);
    }

    public final void finished$okhttp(@vr2 dg3 dg3) {
        jt1.m53777p(dg3, es2.f11366Q);
        finished(this.runningSyncCalls, dg3);
    }

    @ss2
    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    @vr2
    public final synchronized List<Call> queuedCalls() {
        List<Call> unmodifiableList;
        ArrayDeque<dg3.C5025a> arrayDeque = this.readyAsyncCalls;
        ArrayList arrayList = new ArrayList(t00.m65073Z(arrayDeque, 10));
        for (dg3.C5025a b : arrayDeque) {
            arrayList.add(b.mo34451b());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        jt1.m53776o(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    @vr2
    public final synchronized List<Call> runningCalls() {
        List<Call> unmodifiableList;
        ArrayDeque<dg3> arrayDeque = this.runningSyncCalls;
        ArrayDeque<dg3.C5025a> arrayDeque2 = this.runningAsyncCalls;
        ArrayList arrayList = new ArrayList(t00.m65073Z(arrayDeque2, 10));
        for (dg3.C5025a b : arrayDeque2) {
            arrayList.add(b.mo34451b());
        }
        unmodifiableList = Collections.unmodifiableList(a10.m35935z4(arrayDeque, arrayList));
        jt1.m53776o(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(@ss2 Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            synchronized (this) {
                this.maxRequests = i;
                un4 un4 = un4.f36206a;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(("max < 1: " + i).toString());
    }

    public final void setMaxRequestsPerHost(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            synchronized (this) {
                this.maxRequestsPerHost = i;
                un4 un4 = un4.f36206a;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(("max < 1: " + i).toString());
    }
}

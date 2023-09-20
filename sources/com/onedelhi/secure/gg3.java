package com.onedelhi.secure;

import com.onedelhi.secure.dg3;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.Route;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000eB'\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J.\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¨\u0006!"}, d2 = {"Lcom/onedelhi/secure/gg3;", "", "", "f", "d", "Lokhttp3/Address;", "address", "Lcom/onedelhi/secure/dg3;", "call", "", "Lokhttp3/Route;", "routes", "", "requireMultiplexed", "a", "Lcom/onedelhi/secure/eg3;", "connection", "Lcom/onedelhi/secure/un4;", "h", "c", "e", "", "now", "b", "g", "Lcom/onedelhi/secure/fa4;", "taskRunner", "maxIdleConnections", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lcom/onedelhi/secure/fa4;IJLjava/util/concurrent/TimeUnit;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class gg3 {

    /* renamed from: a */
    public static final C5431a f29186a = new C5431a((wg0) null);

    /* renamed from: a */
    public final int f29187a;

    /* renamed from: a */
    public final long f29188a;

    /* renamed from: a */
    public final ea4 f29189a;

    /* renamed from: a */
    public final C5432b f29190a = new C5432b(this, nq4.f32729a + " ConnectionPool");

    /* renamed from: a */
    public final ConcurrentLinkedQueue<eg3> f29191a = new ConcurrentLinkedQueue<>();

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/gg3$a;", "", "Lokhttp3/ConnectionPool;", "connectionPool", "Lcom/onedelhi/secure/gg3;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.gg3$a */
    public static final class C5431a {
        public C5431a() {
        }

        public /* synthetic */ C5431a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final gg3 mo36740a(@vr2 ConnectionPool connectionPool) {
            jt1.m53777p(connectionPool, "connectionPool");
            return connectionPool.getDelegate$okhttp();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/gg3$b", "Lcom/onedelhi/secure/v94;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.gg3$b */
    public static final class C5432b extends v94 {

        /* renamed from: a */
        public final /* synthetic */ gg3 f29192a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5432b(gg3 gg3, String str) {
            super(str, false, 2, (wg0) null);
            this.f29192a = gg3;
        }

        /* renamed from: f */
        public long mo33844f() {
            return this.f29192a.mo36733b(System.nanoTime());
        }
    }

    public gg3(@vr2 fa4 fa4, int i, long j, @vr2 TimeUnit timeUnit) {
        jt1.m53777p(fa4, "taskRunner");
        jt1.m53777p(timeUnit, "timeUnit");
        this.f29187a = i;
        this.f29188a = timeUnit.toNanos(j);
        this.f29189a = fa4.mo35812j();
        if (!(j > 0)) {
            throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
        }
    }

    /* renamed from: a */
    public final boolean mo36732a(@vr2 Address address, @vr2 dg3 dg3, @ss2 List<Route> list, boolean z) {
        jt1.m53777p(address, "address");
        jt1.m53777p(dg3, es2.f11366Q);
        Iterator<eg3> it = this.f29191a.iterator();
        while (it.hasNext()) {
            eg3 next = it.next();
            jt1.m53776o(next, dm1.f27486a);
            synchronized (next) {
                if (z) {
                    if (!next.mo35272y()) {
                        un4 un4 = un4.f36206a;
                    }
                }
                if (next.mo35270w(address, list)) {
                    dg3.mo34418c(next);
                    return true;
                }
                un4 un42 = un4.f36206a;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007d, code lost:
        com.onedelhi.secure.nq4.m58714n(r3.socket());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008a, code lost:
        if (r10.f29191a.isEmpty() == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008c, code lost:
        r10.f29189a.mo34987a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
        return 0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo36733b(long r11) {
        /*
            r10 = this;
            java.util.concurrent.ConcurrentLinkedQueue<com.onedelhi.secure.eg3> r0 = r10.f29191a
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x000d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0040
            java.lang.Object r6 = r0.next()
            com.onedelhi.secure.eg3 r6 = (com.onedelhi.secure.eg3) r6
            java.lang.String r7 = "connection"
            com.onedelhi.secure.jt1.m53776o(r6, r7)
            monitor-enter(r6)
            int r7 = r10.mo36738g(r6, r11)     // Catch:{ all -> 0x003d }
            if (r7 <= 0) goto L_0x0028
            int r2 = r2 + 1
            goto L_0x003b
        L_0x0028:
            int r1 = r1 + 1
            long r7 = r6.mo35264s()     // Catch:{ all -> 0x003d }
            long r7 = r11 - r7
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0039
            com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x003d }
            r3 = r6
            r4 = r7
            goto L_0x003b
        L_0x0039:
            com.onedelhi.secure.un4 r7 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r6)
            goto L_0x000d
        L_0x003d:
            r11 = move-exception
            monitor-exit(r6)
            throw r11
        L_0x0040:
            long r6 = r10.f29188a
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            int r0 = r10.f29187a
            if (r1 <= r0) goto L_0x004b
            goto L_0x0055
        L_0x004b:
            if (r1 <= 0) goto L_0x004f
            long r6 = r6 - r4
            return r6
        L_0x004f:
            if (r2 <= 0) goto L_0x0052
            return r6
        L_0x0052:
            r11 = -1
            return r11
        L_0x0055:
            com.onedelhi.secure.jt1.m53774m(r3)
            monitor-enter(r3)
            java.util.List r0 = r3.mo35261q()     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0092 }
            r1 = 1
            r0 = r0 ^ r1
            r6 = 0
            if (r0 == 0) goto L_0x0069
            monitor-exit(r3)
            return r6
        L_0x0069:
            long r8 = r3.mo35264s()     // Catch:{ all -> 0x0092 }
            long r8 = r8 + r4
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0074
            monitor-exit(r3)
            return r6
        L_0x0074:
            r3.mo35244F(r1)     // Catch:{ all -> 0x0092 }
            java.util.concurrent.ConcurrentLinkedQueue<com.onedelhi.secure.eg3> r11 = r10.f29191a     // Catch:{ all -> 0x0092 }
            r11.remove(r3)     // Catch:{ all -> 0x0092 }
            monitor-exit(r3)
            java.net.Socket r11 = r3.socket()
            com.onedelhi.secure.nq4.m58714n(r11)
            java.util.concurrent.ConcurrentLinkedQueue<com.onedelhi.secure.eg3> r11 = r10.f29191a
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0091
            com.onedelhi.secure.ea4 r11 = r10.f29189a
            r11.mo34987a()
        L_0x0091:
            return r6
        L_0x0092:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gg3.mo36733b(long):long");
    }

    /* renamed from: c */
    public final boolean mo36734c(@vr2 eg3 eg3) {
        jt1.m53777p(eg3, dm1.f27486a);
        if (nq4.f32734a && !Thread.holdsLock(eg3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            jt1.m53776o(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(eg3);
            throw new AssertionError(sb.toString());
        } else if (eg3.mo35266t() || this.f29187a == 0) {
            eg3.mo35244F(true);
            this.f29191a.remove(eg3);
            if (!this.f29191a.isEmpty()) {
                return true;
            }
            this.f29189a.mo34987a();
            return true;
        } else {
            ea4.m46227o(this.f29189a, this.f29190a, 0, 2, (Object) null);
            return false;
        }
    }

    /* renamed from: d */
    public final int mo36735d() {
        return this.f29191a.size();
    }

    /* renamed from: e */
    public final void mo36736e() {
        Socket socket;
        Iterator<eg3> it = this.f29191a.iterator();
        jt1.m53776o(it, "connections.iterator()");
        while (it.hasNext()) {
            eg3 next = it.next();
            jt1.m53776o(next, dm1.f27486a);
            synchronized (next) {
                if (next.mo35261q().isEmpty()) {
                    it.remove();
                    next.mo35244F(true);
                    socket = next.socket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                nq4.m58714n(socket);
            }
        }
        if (this.f29191a.isEmpty()) {
            this.f29189a.mo34987a();
        }
    }

    /* renamed from: f */
    public final int mo36737f() {
        boolean isEmpty;
        ConcurrentLinkedQueue<eg3> concurrentLinkedQueue = this.f29191a;
        int i = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (eg3 eg3 : concurrentLinkedQueue) {
                jt1.m53776o(eg3, "it");
                synchronized (eg3) {
                    isEmpty = eg3.mo35261q().isEmpty();
                }
                if (isEmpty && (i = i + 1) < 0) {
                    s00.m64054W();
                }
            }
        }
        return i;
    }

    /* renamed from: g */
    public final int mo36738g(eg3 eg3, long j) {
        if (!nq4.f32734a || Thread.holdsLock(eg3)) {
            List<Reference<dg3>> q = eg3.mo35261q();
            int i = 0;
            while (i < q.size()) {
                Reference reference = q.get(i);
                if (reference.get() != null) {
                    i++;
                } else {
                    k23.f31087a.mo39034g().mo39027o("A connection to " + eg3.route().address().url() + " was leaked. " + "Did you forget to close a response body?", ((dg3.C5026b) reference).mo34457a());
                    q.remove(i);
                    eg3.mo35244F(true);
                    if (q.isEmpty()) {
                        eg3.mo35243E(j - this.f29188a);
                        return 0;
                    }
                }
            }
            return q.size();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(eg3);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: h */
    public final void mo36739h(@vr2 eg3 eg3) {
        jt1.m53777p(eg3, dm1.f27486a);
        if (!nq4.f32734a || Thread.holdsLock(eg3)) {
            this.f29191a.add(eg3);
            ea4.m46227o(this.f29189a, this.f29190a, 0, 2, (Object) null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        jt1.m53776o(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(eg3);
        throw new AssertionError(sb.toString());
    }
}

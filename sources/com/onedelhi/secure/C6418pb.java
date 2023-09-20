package com.onedelhi.secure;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0002H\u0014J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ'\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0001J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001d"}, d2 = {"Lcom/onedelhi/secure/pb;", "Lcom/onedelhi/secure/me4;", "Lcom/onedelhi/secure/un4;", "v", "", "w", "B", "Lcom/onedelhi/secure/oz3;", "sink", "z", "Lcom/onedelhi/secure/x04;", "source", "A", "T", "Lkotlin/Function0;", "block", "C", "(Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "q", "x", "", "now", "y", "<init>", "()V", "a", "b", "okio"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.pb */
public class C6418pb extends me4 {

    /* renamed from: a */
    public static final int f33505a = 65536;

    /* renamed from: a */
    public static final C6419a f33506a = new C6419a((wg0) null);

    /* renamed from: b */
    public static C6418pb f33507b;

    /* renamed from: d */
    public static final long f33508d;

    /* renamed from: e */
    public static final long f33509e;

    /* renamed from: a */
    public C6418pb f33510a;

    /* renamed from: b */
    public boolean f33511b;

    /* renamed from: c */
    public long f33512c;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/pb$a;", "", "Lcom/onedelhi/secure/pb;", "c", "()Lcom/onedelhi/secure/pb;", "node", "", "timeoutNanos", "", "hasDeadline", "Lcom/onedelhi/secure/un4;", "e", "d", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "head", "Lcom/onedelhi/secure/pb;", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.pb$a */
    public static final class C6419a {
        public C6419a() {
        }

        public /* synthetic */ C6419a(wg0 wg0) {
            this();
        }

        @ss2
        /* renamed from: c */
        public final C6418pb mo42501c() throws InterruptedException {
            Class<C6418pb> cls = C6418pb.class;
            C6418pb l = C6418pb.f33507b;
            jt1.m53774m(l);
            C6418pb o = l.f33510a;
            long nanoTime = System.nanoTime();
            if (o == null) {
                cls.wait(C6418pb.f33508d);
                C6418pb l2 = C6418pb.f33507b;
                jt1.m53774m(l2);
                if (l2.f33510a != null || System.nanoTime() - nanoTime < C6418pb.f33509e) {
                    return null;
                }
                return C6418pb.f33507b;
            }
            long r = o.mo42499y(nanoTime);
            if (r > 0) {
                long j = r / zv0.f38454a;
                cls.wait(j, (int) (r - (zv0.f38454a * j)));
                return null;
            }
            C6418pb l3 = C6418pb.f33507b;
            jt1.m53774m(l3);
            l3.f33510a = o.f33510a;
            o.f33510a = null;
            return o;
        }

        /* renamed from: d */
        public final boolean mo42502d(C6418pb pbVar) {
            boolean z;
            synchronized (C6418pb.class) {
                C6418pb l = C6418pb.f33507b;
                while (true) {
                    if (l == null) {
                        z = true;
                        break;
                    } else if (l.f33510a == pbVar) {
                        l.f33510a = pbVar.f33510a;
                        pbVar.f33510a = null;
                        z = false;
                        break;
                    } else {
                        l = l.f33510a;
                    }
                }
            }
            return z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0065 A[EDGE_INSN: B:35:0x0065->B:22:0x0065 ?: BREAK  , SYNTHETIC] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo42503e(com.onedelhi.secure.C6418pb r7, long r8, boolean r10) {
            /*
                r6 = this;
                java.lang.Class<com.onedelhi.secure.pb> r0 = com.onedelhi.secure.C6418pb.class
                monitor-enter(r0)
                com.onedelhi.secure.pb r1 = com.onedelhi.secure.C6418pb.f33507b     // Catch:{ all -> 0x0082 }
                if (r1 != 0) goto L_0x0019
                com.onedelhi.secure.pb r1 = new com.onedelhi.secure.pb     // Catch:{ all -> 0x0082 }
                r1.<init>()     // Catch:{ all -> 0x0082 }
                com.onedelhi.secure.C6418pb.f33507b = r1     // Catch:{ all -> 0x0082 }
                com.onedelhi.secure.pb$b r1 = new com.onedelhi.secure.pb$b     // Catch:{ all -> 0x0082 }
                r1.<init>()     // Catch:{ all -> 0x0082 }
                r1.start()     // Catch:{ all -> 0x0082 }
            L_0x0019:
                long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0082 }
                r3 = 0
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x0033
                if (r10 == 0) goto L_0x0033
                long r3 = r7.mo40557d()     // Catch:{ all -> 0x0082 }
                long r3 = r3 - r1
                long r8 = java.lang.Math.min(r8, r3)     // Catch:{ all -> 0x0082 }
            L_0x002e:
                long r8 = r8 + r1
                r7.f33512c = r8     // Catch:{ all -> 0x0082 }
                goto L_0x003f
            L_0x0033:
                if (r5 == 0) goto L_0x0036
                goto L_0x002e
            L_0x0036:
                if (r10 == 0) goto L_0x007c
                long r8 = r7.mo40557d()     // Catch:{ all -> 0x0082 }
                r7.f33512c = r8     // Catch:{ all -> 0x0082 }
            L_0x003f:
                long r8 = r7.mo42499y(r1)     // Catch:{ all -> 0x0082 }
                com.onedelhi.secure.pb r10 = com.onedelhi.secure.C6418pb.f33507b     // Catch:{ all -> 0x0082 }
            L_0x0047:
                com.onedelhi.secure.jt1.m53774m(r10)     // Catch:{ all -> 0x0082 }
                com.onedelhi.secure.pb r3 = r10.f33510a     // Catch:{ all -> 0x0082 }
                if (r3 == 0) goto L_0x0065
                com.onedelhi.secure.pb r3 = r10.f33510a     // Catch:{ all -> 0x0082 }
                com.onedelhi.secure.jt1.m53774m(r3)     // Catch:{ all -> 0x0082 }
                long r3 = r3.mo42499y(r1)     // Catch:{ all -> 0x0082 }
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x0060
                goto L_0x0065
            L_0x0060:
                com.onedelhi.secure.pb r10 = r10.f33510a     // Catch:{ all -> 0x0082 }
                goto L_0x0047
            L_0x0065:
                com.onedelhi.secure.pb r8 = r10.f33510a     // Catch:{ all -> 0x0082 }
                r7.f33510a = r8     // Catch:{ all -> 0x0082 }
                r10.f33510a = r7     // Catch:{ all -> 0x0082 }
                com.onedelhi.secure.pb r7 = com.onedelhi.secure.C6418pb.f33507b     // Catch:{ all -> 0x0082 }
                if (r10 != r7) goto L_0x0078
                r0.notify()     // Catch:{ all -> 0x0082 }
            L_0x0078:
                com.onedelhi.secure.un4 r7 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0082 }
                monitor-exit(r0)
                return
            L_0x007c:
                java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x0082 }
                r7.<init>()     // Catch:{ all -> 0x0082 }
                throw r7     // Catch:{ all -> 0x0082 }
            L_0x0082:
                r7 = move-exception
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6418pb.C6419a.mo42503e(com.onedelhi.secure.pb, long, boolean):void");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/pb$b;", "Ljava/lang/Thread;", "Lcom/onedelhi/secure/un4;", "run", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.pb$b */
    public static final class C6420b extends Thread {
        public C6420b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
            r1.mo34458B();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<com.onedelhi.secure.pb> r0 = com.onedelhi.secure.C6418pb.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                com.onedelhi.secure.pb$a r1 = com.onedelhi.secure.C6418pb.f33506a     // Catch:{ all -> 0x001e }
                com.onedelhi.secure.pb r1 = r1.mo42501c()     // Catch:{ all -> 0x001e }
                com.onedelhi.secure.pb r2 = com.onedelhi.secure.C6418pb.f33507b     // Catch:{ all -> 0x001e }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                com.onedelhi.secure.C6418pb.f33507b = r1     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                com.onedelhi.secure.un4 r2 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.mo34458B()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6418pb.C6420b.run():void");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"com/onedelhi/secure/pb$c", "Lcom/onedelhi/secure/oz3;", "Lcom/onedelhi/secure/no;", "source", "", "byteCount", "Lcom/onedelhi/secure/un4;", "write", "flush", "close", "Lcom/onedelhi/secure/pb;", "a", "", "toString", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.pb$c */
    public static final class C6421c implements oz3 {

        /* renamed from: a */
        public final /* synthetic */ oz3 f33513a;

        /* renamed from: a */
        public final /* synthetic */ C6418pb f33514a;

        public C6421c(C6418pb pbVar, oz3 oz3) {
            this.f33514a = pbVar;
            this.f33513a = oz3;
        }

        @vr2
        /* renamed from: a */
        public C6418pb timeout() {
            return this.f33514a;
        }

        public void close() {
            C6418pb pbVar = this.f33514a;
            pbVar.mo42497v();
            try {
                this.f33513a.close();
                un4 un4 = un4.f36206a;
                if (pbVar.mo42498w()) {
                    throw pbVar.mo42496q((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (pbVar.mo42498w()) {
                    e = pbVar.mo42496q(e);
                }
                throw e;
            } finally {
                boolean w = pbVar.mo42498w();
            }
        }

        public void flush() {
            C6418pb pbVar = this.f33514a;
            pbVar.mo42497v();
            try {
                this.f33513a.flush();
                un4 un4 = un4.f36206a;
                if (pbVar.mo42498w()) {
                    throw pbVar.mo42496q((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (pbVar.mo42498w()) {
                    e = pbVar.mo42496q(e);
                }
                throw e;
            } finally {
                boolean w = pbVar.mo42498w();
            }
        }

        @vr2
        public String toString() {
            return "AsyncTimeout.sink(" + this.f33513a + ')';
        }

        public void write(@vr2 C6205no noVar, long j) {
            jt1.m53777p(noVar, "source");
            C5950l.m55169e(noVar.mo41244V0(), 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    ws3 ws3 = noVar.f32655a;
                    while (true) {
                        jt1.m53774m(ws3);
                        if (j2 >= ((long) 65536)) {
                            break;
                        }
                        j2 += (long) (ws3.f37112b - ws3.f37108a);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        ws3 = ws3.f37109a;
                    }
                    C6418pb pbVar = this.f33514a;
                    pbVar.mo42497v();
                    try {
                        this.f33513a.write(noVar, j2);
                        un4 un4 = un4.f36206a;
                        if (!pbVar.mo42498w()) {
                            j -= j2;
                        } else {
                            throw pbVar.mo42496q((IOException) null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (pbVar.mo42498w()) {
                            e = pbVar.mo42496q(e);
                        }
                        throw e;
                    } finally {
                        boolean w = pbVar.mo42498w();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"com/onedelhi/secure/pb$d", "Lcom/onedelhi/secure/x04;", "Lcom/onedelhi/secure/no;", "sink", "", "byteCount", "read", "Lcom/onedelhi/secure/un4;", "close", "Lcom/onedelhi/secure/pb;", "a", "", "toString", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.pb$d */
    public static final class C6422d implements x04 {

        /* renamed from: a */
        public final /* synthetic */ C6418pb f33515a;

        /* renamed from: a */
        public final /* synthetic */ x04 f33516a;

        public C6422d(C6418pb pbVar, x04 x04) {
            this.f33515a = pbVar;
            this.f33516a = x04;
        }

        @vr2
        /* renamed from: a */
        public C6418pb timeout() {
            return this.f33515a;
        }

        public void close() {
            C6418pb pbVar = this.f33515a;
            pbVar.mo42497v();
            try {
                this.f33516a.close();
                un4 un4 = un4.f36206a;
                if (pbVar.mo42498w()) {
                    throw pbVar.mo42496q((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (pbVar.mo42498w()) {
                    e = pbVar.mo42496q(e);
                }
                throw e;
            } finally {
                boolean w = pbVar.mo42498w();
            }
        }

        public long read(@vr2 C6205no noVar, long j) {
            jt1.m53777p(noVar, "sink");
            C6418pb pbVar = this.f33515a;
            pbVar.mo42497v();
            try {
                long read = this.f33516a.read(noVar, j);
                if (!pbVar.mo42498w()) {
                    return read;
                }
                throw pbVar.mo42496q((IOException) null);
            } catch (IOException e) {
                e = e;
                if (pbVar.mo42498w()) {
                    e = pbVar.mo42496q(e);
                }
                throw e;
            } finally {
                boolean w = pbVar.mo42498w();
            }
        }

        @vr2
        public String toString() {
            return "AsyncTimeout.source(" + this.f33516a + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f33508d = millis;
        f33509e = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @vr2
    /* renamed from: A */
    public final x04 mo42494A(@vr2 x04 x04) {
        jt1.m53777p(x04, "source");
        return new C6422d(this, x04);
    }

    /* renamed from: B */
    public void mo34458B() {
    }

    /* renamed from: C */
    public final <T> T mo42495C(@vr2 cc1<? extends T> cc1) {
        jt1.m53777p(cc1, "block");
        mo42497v();
        try {
            T invoke = cc1.invoke();
            uq1.m67403d(1);
            if (!mo42498w()) {
                uq1.m67402c(1);
                return invoke;
            }
            throw mo42496q((IOException) null);
        } catch (IOException e) {
            e = e;
            if (mo42498w()) {
                e = mo42496q(e);
            }
            throw e;
        } catch (Throwable th) {
            uq1.m67403d(1);
            boolean w = mo42498w();
            uq1.m67402c(1);
            throw th;
        }
    }

    @vr2
    @z73
    /* renamed from: q */
    public final IOException mo42496q(@ss2 IOException iOException) {
        return mo36132x(iOException);
    }

    /* renamed from: v */
    public final void mo42497v() {
        if (!this.f33511b) {
            long j = mo40563j();
            boolean f = mo40559f();
            if (j != 0 || f) {
                this.f33511b = true;
                f33506a.mo42503e(this, j, f);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    /* renamed from: w */
    public final boolean mo42498w() {
        if (!this.f33511b) {
            return false;
        }
        this.f33511b = false;
        return f33506a.mo42502d(this);
    }

    @vr2
    /* renamed from: x */
    public IOException mo36132x(@ss2 IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: y */
    public final long mo42499y(long j) {
        return this.f33512c - j;
    }

    @vr2
    /* renamed from: z */
    public final oz3 mo42500z(@vr2 oz3 oz3) {
        jt1.m53777p(oz3, "sink");
        return new C6421c(this, oz3);
    }
}

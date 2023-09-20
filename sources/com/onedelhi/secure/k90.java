package com.onedelhi.secure;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0006\u0013%B+\u0012\u0006\u0010L\u001a\u00020\f\u0012\u0006\u0010M\u001a\u00020\f\u0012\b\b\u0002\u0010N\u001a\u00020\u000f\u0012\b\b\u0002\u0010O\u001a\u00020B¢\u0006\u0004\bP\u0010QJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\b¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\fH\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH\b¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u000fH\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\b¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u0015J+\u0010'\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b)\u0010\nJ)\u0010,\u001a\u00020\u00192\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\b¢\u0006\u0004\b0\u0010\u0012J\u001b\u00104\u001a\u00020\u00192\n\u00103\u001a\u000601j\u0002`2H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0019H\u0016¢\u0006\u0004\b6\u0010\u001bJ\u0015\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109J-\u0010=\u001a\u00020\u00192\n\u0010:\u001a\u000601j\u0002`22\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020\u00032\n\u0010:\u001a\u000601j\u0002`22\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0019¢\u0006\u0004\bA\u0010\u001bJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FR\u0015\u0010H\u001a\u00020\f8Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0015R\u0015\u0010J\u001a\u00020\f8Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0015R\u0011\u0010K\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bK\u0010\u001d¨\u0006R"}, d2 = {"Lcom/onedelhi/secure/k90;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lcom/onedelhi/secure/u94;", "task", "", "a", "(Lcom/onedelhi/secure/u94;)Z", "Lcom/onedelhi/secure/k90$c;", "Y", "()Lcom/onedelhi/secure/k90$c;", "worker", "", "X", "(Lcom/onedelhi/secure/k90$c;)I", "", "state", "h", "(J)I", "c", "M", "()I", "p", "K", "()J", "Lcom/onedelhi/secure/un4;", "m", "()V", "u0", "()Z", "e0", "skipUnpark", "o0", "(Z)V", "C0", "(J)Z", "G0", "d", "tailDispatch", "q0", "(Lcom/onedelhi/secure/k90$c;Lcom/onedelhi/secure/u94;Z)Lcom/onedelhi/secure/u94;", "l", "oldIndex", "newIndex", "c0", "(Lcom/onedelhi/secure/k90$c;II)V", "Z", "(Lcom/onedelhi/secure/k90$c;)Z", "b", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "timeout", "l0", "(J)V", "block", "Lcom/onedelhi/secure/y94;", "taskContext", "q", "(Ljava/lang/Runnable;Lcom/onedelhi/secure/y94;Z)V", "g", "(Ljava/lang/Runnable;Lcom/onedelhi/secure/y94;)Lcom/onedelhi/secure/u94;", "p0", "", "toString", "()Ljava/lang/String;", "j0", "(Lcom/onedelhi/secure/u94;)V", "H", "createdWorkers", "E", "availableCpuPermits", "isTerminated", "corePoolSize", "maxPoolSize", "idleWorkerKeepAliveNs", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class k90 implements Executor, Closeable {
    @vr2

    /* renamed from: a */
    public static final C5876a f31128a = new C5876a((wg0) null);
    @rw1
    @vr2

    /* renamed from: a */
    public static final l84 f31129a = new l84("NOT_IN_STACK");

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31130a = AtomicIntegerFieldUpdater.newUpdater(k90.class, "_isTerminated");

    /* renamed from: a */
    public static final /* synthetic */ AtomicLongFieldUpdater f31131a = AtomicLongFieldUpdater.newUpdater(k90.class, "parkedWorkersStack");

    /* renamed from: b */
    public static final /* synthetic */ AtomicLongFieldUpdater f31132b = AtomicLongFieldUpdater.newUpdater(k90.class, "controlState");

    /* renamed from: c */
    public static final long f31133c = 2097151;

    /* renamed from: d */
    public static final long f31134d = 4398044413952L;

    /* renamed from: e */
    public static final long f31135e = 9223367638808264704L;

    /* renamed from: f */
    public static final long f31136f = 2097151;

    /* renamed from: g */
    public static final long f31137g = -2097152;

    /* renamed from: h */
    public static final long f31138h = 2097152;

    /* renamed from: p */
    public static final int f31139p = -1;

    /* renamed from: q */
    public static final int f31140q = 0;

    /* renamed from: r */
    public static final int f31141r = 1;

    /* renamed from: s */
    public static final int f31142s = 21;

    /* renamed from: t */
    public static final int f31143t = 42;

    /* renamed from: u */
    public static final int f31144u = 1;

    /* renamed from: v */
    public static final int f31145v = 2097150;
    @vr2
    private volatile /* synthetic */ int _isTerminated;
    @rw1
    @vr2

    /* renamed from: a */
    public final ak3<C5878c> f31146a;
    @rw1
    @vr2

    /* renamed from: a */
    public final kh1 f31147a;
    @rw1

    /* renamed from: b */
    public final long f31148b;
    @rw1
    @vr2

    /* renamed from: b */
    public final kh1 f31149b;
    @rw1
    @vr2

    /* renamed from: b */
    public final String f31150b;
    @vr2
    public volatile /* synthetic */ long controlState;
    @rw1

    /* renamed from: n */
    public final int f31151n;
    @rw1

    /* renamed from: o */
    public final int f31152o;
    @vr2
    private volatile /* synthetic */ long parkedWorkersStack;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/k90$a;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lcom/onedelhi/secure/l84;", "NOT_IN_STACK", "Lcom/onedelhi/secure/l84;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.k90$a */
    public static final class C5876a {
        public C5876a() {
        }

        public /* synthetic */ C5876a(wg0 wg0) {
            this();
        }
    }

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.k90$b */
    public /* synthetic */ class C5877b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31153a;

        static {
            int[] iArr = new int[C5879d.values().length];
            iArr[C5879d.PARKING.ordinal()] = 1;
            iArr[C5879d.BLOCKING.ordinal()] = 2;
            iArr[C5879d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[C5879d.DORMANT.ordinal()] = 4;
            iArr[C5879d.TERMINATED.ordinal()] = 5;
            f31153a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\n¢\u0006\u0004\b8\u0010:J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0011J\u0011\u0010#\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0011R*\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001cR\u0012\u00100\u001a\u00020-8Æ\u0002¢\u0006\u0006\u001a\u0004\b.\u0010/R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/onedelhi/secure/k90$c;", "Ljava/lang/Thread;", "Lcom/onedelhi/secure/k90$d;", "newState", "", "t", "(Lcom/onedelhi/secure/k90$d;)Z", "Lcom/onedelhi/secure/un4;", "run", "()V", "", "upperBound", "l", "(I)I", "scanLocalQueue", "Lcom/onedelhi/secure/u94;", "f", "(Z)Lcom/onedelhi/secure/u94;", "r", "()Z", "o", "s", "k", "task", "d", "(Lcom/onedelhi/secure/u94;)V", "taskMode", "c", "(I)V", "b", "m", "v", "mode", "j", "e", "n", "()Lcom/onedelhi/secure/u94;", "blockingOnly", "u", "index", "indexInArray", "I", "g", "()I", "p", "Lcom/onedelhi/secure/k90;", "i", "()Lcom/onedelhi/secure/k90;", "scheduler", "", "nextParkedWorker", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "q", "(Ljava/lang/Object;)V", "<init>", "(Lcom/onedelhi/secure/k90;)V", "(Lcom/onedelhi/secure/k90;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.k90$c */
    public final class C5878c extends Thread {

        /* renamed from: a */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f31154a = AtomicIntegerFieldUpdater.newUpdater(C5878c.class, "workerCtl");
        @rw1
        @vr2

        /* renamed from: a */
        public final iy4 f31155a;
        @rw1
        @vr2

        /* renamed from: a */
        public C5879d f31156a;

        /* renamed from: b */
        public long f31158b;
        @rw1

        /* renamed from: b */
        public boolean f31159b;

        /* renamed from: c */
        public long f31160c;
        private volatile int indexInArray;

        /* renamed from: n */
        public int f31161n;
        @ss2
        private volatile Object nextParkedWorker;
        @vr2
        public volatile /* synthetic */ int workerCtl;

        public C5878c() {
            setDaemon(true);
            this.f31155a = new iy4();
            this.f31156a = C5879d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = k90.f31129a;
            this.f31161n = me3.f32085a.mo35703l();
        }

        public C5878c(int i) {
            this();
            mo39117p(i);
        }

        /* renamed from: b */
        public final void mo39103b(int i) {
            if (i != 0) {
                k90.f31132b.addAndGet(k90.this, k90.f31137g);
                if (this.f31156a != C5879d.TERMINATED) {
                    this.f31156a = C5879d.DORMANT;
                }
            }
        }

        /* renamed from: c */
        public final void mo39104c(int i) {
            if (i != 0 && mo39122t(C5879d.BLOCKING)) {
                k90.this.mo39098p0();
            }
        }

        /* renamed from: d */
        public final void mo39105d(u94 u94) {
            int q0 = u94.f36015a.mo37167q0();
            mo39111j(q0);
            mo39104c(q0);
            k90.this.mo39092j0(u94);
            mo39103b(q0);
        }

        /* renamed from: e */
        public final u94 mo39106e(boolean z) {
            u94 n;
            u94 n2;
            if (z) {
                boolean z2 = mo39113l(k90.this.f31151n * 2) == 0;
                if (z2 && (n2 = mo39115n()) != null) {
                    return n2;
                }
                u94 h = this.f31155a.mo38283h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (n = mo39115n()) != null) {
                    return n;
                }
            } else {
                u94 n3 = mo39115n();
                if (n3 != null) {
                    return n3;
                }
            }
            return mo39123u(false);
        }

        @ss2
        /* renamed from: f */
        public final u94 mo39107f(boolean z) {
            u94 u94;
            if (mo39119r()) {
                return mo39106e(z);
            }
            if (!z || (u94 = this.f31155a.mo38283h()) == null) {
                u94 = (u94) k90.this.f31149b.mo41007g();
            }
            return u94 == null ? mo39123u(true) : u94;
        }

        /* renamed from: g */
        public final int mo39108g() {
            return this.indexInArray;
        }

        @ss2
        /* renamed from: h */
        public final Object mo39109h() {
            return this.nextParkedWorker;
        }

        @vr2
        /* renamed from: i */
        public final k90 mo39110i() {
            return k90.this;
        }

        /* renamed from: j */
        public final void mo39111j(int i) {
            this.f31158b = 0;
            if (this.f31156a == C5879d.PARKING) {
                this.f31156a = C5879d.BLOCKING;
            }
        }

        /* renamed from: k */
        public final boolean mo39112k() {
            return this.nextParkedWorker != k90.f31129a;
        }

        /* renamed from: l */
        public final int mo39113l(int i) {
            int i2 = this.f31161n;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f31161n = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: m */
        public final void mo39114m() {
            if (this.f31158b == 0) {
                this.f31158b = System.nanoTime() + k90.this.f31148b;
            }
            LockSupport.parkNanos(k90.this.f31148b);
            if (System.nanoTime() - this.f31158b >= 0) {
                this.f31158b = 0;
                mo39124v();
            }
        }

        /* renamed from: n */
        public final u94 mo39115n() {
            kh1 kh1;
            if (mo39113l(2) == 0) {
                u94 u94 = (u94) k90.this.f31147a.mo41007g();
                if (u94 != null) {
                    return u94;
                }
                kh1 = k90.this.f31149b;
            } else {
                u94 u942 = (u94) k90.this.f31149b.mo41007g();
                if (u942 != null) {
                    return u942;
                }
                kh1 = k90.this.f31147a;
            }
            return (u94) kh1.mo41007g();
        }

        /* renamed from: o */
        public final void mo39116o() {
            loop0:
            while (true) {
                boolean z = false;
                while (!k90.this.isTerminated() && this.f31156a != C5879d.TERMINATED) {
                    u94 f = mo39107f(this.f31159b);
                    if (f != null) {
                        this.f31160c = 0;
                        mo39105d(f);
                    } else {
                        this.f31159b = false;
                        if (this.f31160c == 0) {
                            mo39121s();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo39122t(C5879d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f31160c);
                            this.f31160c = 0;
                        }
                    }
                }
            }
            mo39122t(C5879d.TERMINATED);
        }

        /* renamed from: p */
        public final void mo39117p(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(k90.this.f31150b);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: q */
        public final void mo39118q(@ss2 Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: r */
        public final boolean mo39119r() {
            boolean z;
            if (this.f31156a != C5879d.CPU_ACQUIRED) {
                k90 k90 = k90.this;
                while (true) {
                    long j = k90.controlState;
                    if (((int) ((k90.f31135e & j) >> 42)) != 0) {
                        if (k90.f31132b.compareAndSet(k90, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f31156a = C5879d.CPU_ACQUIRED;
            }
            return true;
        }

        public void run() {
            mo39116o();
        }

        /* renamed from: s */
        public final void mo39121s() {
            if (!mo39112k()) {
                k90.this.mo39080Z(this);
                return;
            }
            this.workerCtl = -1;
            while (mo39112k() && this.workerCtl == -1 && !k90.this.isTerminated() && this.f31156a != C5879d.TERMINATED) {
                mo39122t(C5879d.PARKING);
                Thread.interrupted();
                mo39114m();
            }
        }

        /* renamed from: t */
        public final boolean mo39122t(@vr2 C5879d dVar) {
            C5879d dVar2 = this.f31156a;
            boolean z = dVar2 == C5879d.CPU_ACQUIRED;
            if (z) {
                k90.f31132b.addAndGet(k90.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f31156a = dVar;
            }
            return z;
        }

        /* renamed from: u */
        public final u94 mo39123u(boolean z) {
            int i = (int) (k90.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int l = mo39113l(i);
            k90 k90 = k90.this;
            int i2 = 0;
            long j = Long.MAX_VALUE;
            while (i2 < i) {
                i2++;
                l++;
                if (l > i) {
                    l = 1;
                }
                C5878c b = k90.f31146a.mo30966b(l);
                if (!(b == null || b == this)) {
                    iy4 iy4 = this.f31155a;
                    iy4 iy42 = b.f31155a;
                    long k = z ? iy4.mo38286k(iy42) : iy4.mo38287l(iy42);
                    if (k == -1) {
                        return this.f31155a.mo38283h();
                    }
                    if (k > 0) {
                        j = Math.min(j, k);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.f31160c = j;
            return null;
        }

        /* renamed from: v */
        public final void mo39124v() {
            k90 k90 = k90.this;
            synchronized (k90.f31146a) {
                if (!k90.isTerminated()) {
                    if (((int) (k90.controlState & 2097151)) > k90.f31151n) {
                        if (f31154a.compareAndSet(this, -1, 1)) {
                            int g = mo39108g();
                            mo39117p(0);
                            k90.mo39084c0(this, g, 0);
                            int andDecrement = (int) (k90.f31132b.getAndDecrement(k90) & 2097151);
                            if (andDecrement != g) {
                                C5878c b = k90.f31146a.mo30966b(andDecrement);
                                jt1.m53774m(b);
                                C5878c cVar = b;
                                k90.f31146a.mo30967c(g, cVar);
                                cVar.mo39117p(g);
                                k90.mo39084c0(cVar, andDecrement, g);
                            }
                            k90.f31146a.mo30967c(andDecrement, null);
                            un4 un4 = un4.f36206a;
                            this.f31156a = C5879d.TERMINATED;
                        }
                    }
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/k90$d;", "", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.k90$d */
    public enum C5879d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public k90(int i, int i2, long j, @vr2 String str) {
        this.f31151n = i;
        this.f31152o = i2;
        this.f31148b = j;
        this.f31150b = str;
        boolean z = true;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j <= 0 ? false : z) {
                        this.f31147a = new kh1();
                        this.f31149b = new kh1();
                        this.parkedWorkersStack = 0;
                        this.f31146a = new ak3<>(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k90(int i, int i2, long j, String str, int i3, wg0 wg0) {
        this(i, i2, (i3 & 4) != 0 ? ia4.f30241b : j, (i3 & 8) != 0 ? ia4.f30239a : str);
    }

    /* renamed from: A */
    public static /* synthetic */ void m54108A(k90 k90, Runnable runnable, y94 y94, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            y94 = ia4.f30238a;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        k90.mo39099q(runnable, y94, z);
    }

    /* renamed from: F0 */
    public static /* synthetic */ boolean m54109F0(k90 k90, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = k90.controlState;
        }
        return k90.mo39072C0(j);
    }

    /* renamed from: C0 */
    public final boolean mo39072C0(long j) {
        if (df3.m45198n(((int) (2097151 & j)) - ((int) ((j & f31134d) >> 21)), 0) < this.f31151n) {
            int d = mo39086d();
            if (d == 1 && this.f31151n > 1) {
                mo39086d();
            }
            if (d > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    public final int mo39073E() {
        return (int) ((this.controlState & f31135e) >> 42);
    }

    /* renamed from: G0 */
    public final boolean mo39074G0() {
        C5878c Y;
        do {
            Y = mo39079Y();
            if (Y == null) {
                return false;
            }
        } while (!C5878c.f31154a.compareAndSet(Y, -1, 0));
        LockSupport.unpark(Y);
        return true;
    }

    /* renamed from: H */
    public final int mo39075H() {
        return (int) (this.controlState & 2097151);
    }

    /* renamed from: K */
    public final long mo39076K() {
        return f31132b.addAndGet(this, 2097152);
    }

    /* renamed from: M */
    public final int mo39077M() {
        return (int) (f31132b.incrementAndGet(this) & 2097151);
    }

    /* renamed from: X */
    public final int mo39078X(C5878c cVar) {
        int g;
        do {
            Object h = cVar.mo39109h();
            if (h == f31129a) {
                return -1;
            }
            if (h == null) {
                return 0;
            }
            cVar = (C5878c) h;
            g = cVar.mo39108g();
        } while (g == 0);
        return g;
    }

    /* renamed from: Y */
    public final C5878c mo39079Y() {
        while (true) {
            long j = this.parkedWorkersStack;
            C5878c b = this.f31146a.mo30966b((int) (2097151 & j));
            if (b == null) {
                return null;
            }
            long j2 = (2097152 + j) & f31137g;
            int X = mo39078X(b);
            if (X >= 0) {
                if (f31131a.compareAndSet(this, j, ((long) X) | j2)) {
                    b.mo39118q(f31129a);
                    return b;
                }
            }
        }
    }

    /* renamed from: Z */
    public final boolean mo39080Z(@vr2 C5878c cVar) {
        long j;
        long j2;
        int g;
        if (cVar.mo39109h() != f31129a) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            j2 = (2097152 + j) & f31137g;
            g = cVar.mo39108g();
            cVar.mo39118q(this.f31146a.mo30966b((int) (2097151 & j)));
        } while (!f31131a.compareAndSet(this, j, j2 | ((long) g)));
        return true;
    }

    /* renamed from: a */
    public final boolean mo39081a(u94 u94) {
        boolean z = true;
        if (u94.f36015a.mo37167q0() != 1) {
            z = false;
        }
        return (z ? this.f31149b : this.f31147a).mo41001a(u94);
    }

    /* renamed from: b */
    public final int mo39082b(long j) {
        return (int) ((j & f31135e) >> 42);
    }

    /* renamed from: c */
    public final int mo39083c(long j) {
        return (int) ((j & f31134d) >> 21);
    }

    /* renamed from: c0 */
    public final void mo39084c0(@vr2 C5878c cVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & f31137g;
            if (i3 == i) {
                i3 = i2 == 0 ? mo39078X(cVar) : i2;
            }
            if (i3 >= 0) {
                if (f31131a.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    public void close() {
        mo39094l0(10000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return r1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo39086d() {
        /*
            r10 = this;
            com.onedelhi.secure.ak3<com.onedelhi.secure.k90$c> r0 = r10.f31146a
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x000c
            r1 = -1
        L_0x000a:
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x007a }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007a }
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch:{ all -> 0x007a }
            int r1 = r6 - r2
            r2 = 0
            int r1 = com.onedelhi.secure.df3.m45198n(r1, r2)     // Catch:{ all -> 0x007a }
            int r5 = r10.f31151n     // Catch:{ all -> 0x007a }
            if (r1 < r5) goto L_0x002b
            monitor-exit(r0)
            return r2
        L_0x002b:
            int r5 = r10.f31152o     // Catch:{ all -> 0x007a }
            if (r6 < r5) goto L_0x0031
            monitor-exit(r0)
            return r2
        L_0x0031:
            long r5 = r10.controlState     // Catch:{ all -> 0x007a }
            long r5 = r5 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007a }
            r5 = 1
            int r6 = r6 + r5
            if (r6 <= 0) goto L_0x0043
            com.onedelhi.secure.ak3<com.onedelhi.secure.k90$c> r7 = r10.f31146a     // Catch:{ all -> 0x007a }
            java.lang.Object r7 = r7.mo30966b(r6)     // Catch:{ all -> 0x007a }
            if (r7 != 0) goto L_0x0043
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x006e
            com.onedelhi.secure.k90$c r7 = new com.onedelhi.secure.k90$c     // Catch:{ all -> 0x007a }
            r7.<init>(r6)     // Catch:{ all -> 0x007a }
            com.onedelhi.secure.ak3<com.onedelhi.secure.k90$c> r8 = r10.f31146a     // Catch:{ all -> 0x007a }
            r8.mo30967c(r6, r7)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f31132b     // Catch:{ all -> 0x007a }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x007a }
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch:{ all -> 0x007a }
            if (r6 != r4) goto L_0x005b
            r2 = 1
        L_0x005b:
            if (r2 == 0) goto L_0x0062
            r7.start()     // Catch:{ all -> 0x007a }
            int r1 = r1 + r5
            goto L_0x000a
        L_0x0062:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x006e:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r1)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.k90.mo39086d():int");
    }

    /* renamed from: e0 */
    public final long mo39087e0() {
        return f31132b.addAndGet(this, 4398046511104L);
    }

    public void execute(@vr2 Runnable runnable) {
        m54108A(this, runnable, (y94) null, false, 6, (Object) null);
    }

    @vr2
    /* renamed from: g */
    public final u94 mo39089g(@vr2 Runnable runnable, @vr2 y94 y94) {
        long a = ia4.f30237a.mo36152a();
        if (!(runnable instanceof u94)) {
            return new ca4(runnable, a, y94);
        }
        u94 u94 = (u94) runnable;
        u94.f36016b = a;
        u94.f36015a = y94;
        return u94;
    }

    /* renamed from: h */
    public final int mo39090h(long j) {
        return (int) (j & 2097151);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: j0 */
    public final void mo39092j0(@vr2 u94 u94) {
        C6357p1 b;
        try {
            u94.run();
            b = C6492q1.m61804b();
            if (b == null) {
                return;
            }
        } catch (Throwable th) {
            C6357p1 b2 = C6492q1.m61804b();
            if (b2 != null) {
                b2.mo42351f();
            }
            throw th;
        }
        b.mo42351f();
    }

    /* renamed from: l */
    public final C5878c mo39093l() {
        Thread currentThread = Thread.currentThread();
        C5878c cVar = currentThread instanceof C5878c ? (C5878c) currentThread : null;
        if (cVar != null && jt1.m53768g(k90.this, this)) {
            return cVar;
        }
        return null;
    }

    /* renamed from: l0 */
    public final void mo39094l0(long j) {
        int i;
        if (f31130a.compareAndSet(this, 0, 1)) {
            C5878c l = mo39093l();
            synchronized (this.f31146a) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    C5878c b = this.f31146a.mo30966b(i2);
                    jt1.m53774m(b);
                    C5878c cVar = b;
                    if (cVar != l) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        cVar.f31155a.mo38282g(this.f31149b);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f31149b.mo41002b();
            this.f31147a.mo41002b();
            while (true) {
                u94 f = l == null ? null : l.mo39107f(true);
                if (f == null && (f = (u94) this.f31147a.mo41007g()) == null && (f = (u94) this.f31149b.mo41007g()) == null) {
                    break;
                }
                mo39092j0(f);
            }
            if (l != null) {
                l.mo39122t(C5879d.TERMINATED);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    /* renamed from: m */
    public final void mo39095m() {
        f31132b.addAndGet(this, f31137g);
    }

    /* renamed from: o0 */
    public final void mo39096o0(boolean z) {
        long addAndGet = f31132b.addAndGet(this, 2097152);
        if (!z && !mo39074G0() && !mo39072C0(addAndGet)) {
            mo39074G0();
        }
    }

    /* renamed from: p */
    public final int mo39097p() {
        return (int) (f31132b.getAndDecrement(this) & 2097151);
    }

    /* renamed from: p0 */
    public final void mo39098p0() {
        if (!mo39074G0() && !m54109F0(this, 0, 1, (Object) null)) {
            mo39074G0();
        }
    }

    /* renamed from: q */
    public final void mo39099q(@vr2 Runnable runnable, @vr2 y94 y94, boolean z) {
        C6357p1 b = C6492q1.m61804b();
        if (b != null) {
            b.mo42350e();
        }
        u94 g = mo39089g(runnable, y94);
        C5878c l = mo39093l();
        u94 q0 = mo39100q0(l, g, z);
        if (q0 == null || mo39081a(q0)) {
            boolean z2 = z && l != null;
            if (g.f36015a.mo37167q0() != 0) {
                mo39096o0(z2);
            } else if (!z2) {
                mo39098p0();
            }
        } else {
            throw new RejectedExecutionException(jt1.m53745C(this.f31150b, " was terminated"));
        }
    }

    /* renamed from: q0 */
    public final u94 mo39100q0(C5878c cVar, u94 u94, boolean z) {
        if (cVar == null || cVar.f31156a == C5879d.TERMINATED) {
            return u94;
        }
        if (u94.f36015a.mo37167q0() == 0 && cVar.f31156a == C5879d.BLOCKING) {
            return u94;
        }
        cVar.f31159b = true;
        return cVar.f31155a.mo38277a(u94, z);
    }

    @vr2
    public String toString() {
        char c;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int a = this.f31146a.mo30965a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < a) {
            int i7 = i6 + 1;
            C5878c b = this.f31146a.mo30966b(i6);
            if (b != null) {
                int f = b.f31155a.mo38281f();
                int i8 = C5877b.f31153a[b.f31156a.ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(f);
                        c = 'b';
                    } else if (i8 == 3) {
                        i++;
                        sb = new StringBuilder();
                        sb.append(f);
                        c = 'c';
                    } else if (i8 == 4) {
                        i4++;
                        if (f > 0) {
                            sb = new StringBuilder();
                            sb.append(f);
                            c = 'd';
                        }
                    } else if (i8 == 5) {
                        i5++;
                    }
                    sb.append(c);
                    arrayList.add(sb.toString());
                } else {
                    i3++;
                }
            }
            i6 = i7;
        }
        long j = this.controlState;
        return this.f31150b + '@' + if0.m52225b(this) + "[Pool Size {core = " + this.f31151n + ", max = " + this.f31152o + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f31147a.mo41003c() + ", global blocking queue size = " + this.f31149b.mo41003c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((f31134d & j) >> 21)) + ", CPUs acquired = " + (this.f31151n - ((int) ((f31135e & j) >> 42))) + "}]";
    }

    /* renamed from: u0 */
    public final boolean mo39102u0() {
        long j;
        do {
            j = this.controlState;
            if (((int) ((f31135e & j) >> 42)) == 0) {
                return false;
            }
        } while (!f31132b.compareAndSet(this, j, j - 4398046511104L));
        return true;
    }
}

package com.onedelhi.secure;

import com.onedelhi.secure.ei0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489:.B\u0007¢\u0006\u0004\b7\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00032\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0004¢\u0006\u0004\b \u0010\u0005J\u001b\u0010\"\u001a\u00020!2\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010'\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010\u0005R$\u00102\u001a\u00020!2\u0006\u0010-\u001a\u00020!8B@BX\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020!8TX\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0013¨\u0006;"}, d2 = {"Lcom/onedelhi/secure/wv0;", "Lcom/onedelhi/secure/xv0;", "Lcom/onedelhi/secure/ei0;", "Lcom/onedelhi/secure/un4;", "shutdown", "()V", "", "timeMillis", "Lcom/onedelhi/secure/iu;", "continuation", "Z", "(JLcom/onedelhi/secure/iu;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lcom/onedelhi/secure/fn0;", "d2", "(JLjava/lang/Runnable;)Lcom/onedelhi/secure/fn0;", "A1", "()J", "Lcom/onedelhi/secure/b90;", "context", "Q0", "(Lcom/onedelhi/secure/b90;Ljava/lang/Runnable;)V", "task", "M1", "(Ljava/lang/Runnable;)V", "now", "Lcom/onedelhi/secure/wv0$c;", "delayedTask", "b2", "(JLcom/onedelhi/secure/wv0$c;)V", "a2", "", "U1", "(Ljava/lang/Runnable;)Z", "L1", "()Ljava/lang/Runnable;", "J1", "i2", "(Lcom/onedelhi/secure/wv0$c;)Z", "", "c2", "(JLcom/onedelhi/secure/wv0$c;)I", "V1", "value", "d", "()Z", "g2", "(Z)V", "isCompleted", "s1", "isEmpty", "j1", "nextTime", "<init>", "a", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class wv0 extends xv0 implements ei0 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37135a;

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37136b;
    @vr2
    private volatile /* synthetic */ Object _delayed = null;
    @vr2
    private volatile /* synthetic */ int _isCompleted = 0;
    @vr2
    private volatile /* synthetic */ Object _queue = null;

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/wv0$a;", "Lcom/onedelhi/secure/wv0$c;", "Lcom/onedelhi/secure/un4;", "run", "", "toString", "", "nanoTime", "Lcom/onedelhi/secure/iu;", "cont", "<init>", "(Lcom/onedelhi/secure/wv0;JLcom/onedelhi/secure/iu;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.wv0$a */
    public final class C7187a extends C7189c {
        @vr2

        /* renamed from: a */
        public final C5744iu<un4> f37137a;

        public C7187a(long j, @vr2 C5744iu<? super un4> iuVar) {
            super(j);
            this.f37137a = iuVar;
        }

        public void run() {
            this.f37137a.mo38231G(wv0.this, un4.f36206a);
        }

        @vr2
        public String toString() {
            return jt1.m53745C(super.toString(), this.f37137a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/wv0$b;", "Lcom/onedelhi/secure/wv0$c;", "Lcom/onedelhi/secure/un4;", "run", "", "toString", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.wv0$b */
    public static final class C7188b extends C7189c {
        @vr2

        /* renamed from: a */
        public final Runnable f37139a;

        public C7188b(long j, @vr2 Runnable runnable) {
            super(j);
            this.f37139a = runnable;
        }

        public void run() {
            this.f37139a.run();
        }

        @vr2
        public String toString() {
            return jt1.m53745C(super.toString(), this.f37139a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010#\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R0\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00168V@VX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/onedelhi/secure/wv0$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lcom/onedelhi/secure/fn0;", "Lcom/onedelhi/secure/dc4;", "other", "", "q", "", "now", "", "s", "Lcom/onedelhi/secure/wv0$d;", "delayed", "Lcom/onedelhi/secure/wv0;", "eventLoop", "r", "Lcom/onedelhi/secure/un4;", "e", "", "toString", "Lcom/onedelhi/secure/cc4;", "value", "g", "()Lcom/onedelhi/secure/cc4;", "b", "(Lcom/onedelhi/secure/cc4;)V", "heap", "index", "I", "a", "()I", "l", "(I)V", "nanoTime", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.wv0$c */
    public static abstract class C7189c implements Runnable, Comparable<C7189c>, fn0, dc4 {
        @ss2

        /* renamed from: a */
        public Object f37140a;
        @rw1

        /* renamed from: b */
        public long f37141b;

        /* renamed from: n */
        public int f37142n = -1;

        public C7189c(long j) {
            this.f37141b = j;
        }

        /* renamed from: a */
        public int mo34300a() {
            return this.f37142n;
        }

        /* renamed from: b */
        public void mo34301b(@ss2 cc4<?> cc4) {
            if (this.f37140a != zv0.f38455a) {
                this.f37140a = cc4;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: e */
        public final synchronized void mo30964e() {
            Object obj = this.f37140a;
            if (obj != zv0.f38455a) {
                C7190d dVar = obj instanceof C7190d ? (C7190d) obj : null;
                if (dVar != null) {
                    dVar.mo32295j(this);
                }
                this.f37140a = zv0.f38455a;
            }
        }

        @ss2
        /* renamed from: g */
        public cc4<?> mo34302g() {
            Object obj = this.f37140a;
            if (obj instanceof cc4) {
                return (cc4) obj;
            }
            return null;
        }

        /* renamed from: l */
        public void mo34303l(int i) {
            this.f37142n = i;
        }

        /* renamed from: q */
        public int compareTo(@vr2 C7189c cVar) {
            int i = ((this.f37141b - cVar.f37141b) > 0 ? 1 : ((this.f37141b - cVar.f37141b) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0046, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0040  */
        /* renamed from: r */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int mo46897r(long r8, @com.onedelhi.secure.vr2 com.onedelhi.secure.wv0.C7190d r10, @com.onedelhi.secure.vr2 com.onedelhi.secure.wv0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7.f37140a     // Catch:{ all -> 0x004b }
                com.onedelhi.secure.l84 r1 = com.onedelhi.secure.zv0.f38455a     // Catch:{ all -> 0x004b }
                if (r0 != r1) goto L_0x000c
                r8 = 2
            L_0x000a:
                monitor-exit(r7)
                return r8
            L_0x000c:
                monitor-enter(r10)     // Catch:{ all -> 0x004b }
                com.onedelhi.secure.dc4 r0 = r10.mo32290e()     // Catch:{ all -> 0x0048 }
                com.onedelhi.secure.wv0$c r0 = (com.onedelhi.secure.wv0.C7189c) r0     // Catch:{ all -> 0x0048 }
                boolean r11 = r11.m69650d()     // Catch:{ all -> 0x0048 }
                if (r11 == 0) goto L_0x001d
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                monitor-exit(r7)
                return r8
            L_0x001d:
                r1 = 0
                if (r0 != 0) goto L_0x0024
            L_0x0021:
                r10.f37143a = r8     // Catch:{ all -> 0x0048 }
                goto L_0x0037
            L_0x0024:
                long r3 = r0.f37141b     // Catch:{ all -> 0x0048 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r8 = r3
            L_0x002e:
                long r3 = r10.f37143a     // Catch:{ all -> 0x0048 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0037
                goto L_0x0021
            L_0x0037:
                long r8 = r7.f37141b     // Catch:{ all -> 0x0048 }
                long r3 = r10.f37143a     // Catch:{ all -> 0x0048 }
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L_0x0042
                r7.f37141b = r3     // Catch:{ all -> 0x0048 }
            L_0x0042:
                r10.mo32286a(r7)     // Catch:{ all -> 0x0048 }
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                r8 = 0
                goto L_0x000a
            L_0x0048:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                throw r8     // Catch:{ all -> 0x004b }
            L_0x004b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.wv0.C7189c.mo46897r(long, com.onedelhi.secure.wv0$d, com.onedelhi.secure.wv0):int");
        }

        /* renamed from: s */
        public final boolean mo46898s(long j) {
            return j - this.f37141b >= 0;
        }

        @vr2
        public String toString() {
            return "Delayed[nanos=" + this.f37141b + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/wv0$d;", "Lcom/onedelhi/secure/cc4;", "Lcom/onedelhi/secure/wv0$c;", "", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.wv0$d */
    public static final class C7190d extends cc4<C7189c> {
        @rw1

        /* renamed from: a */
        public long f37143a;

        public C7190d(long j) {
            this.f37143a = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<wv0> cls2 = wv0.class;
        f37135a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f37136b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m69650d() {
        return this._isCompleted;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0065  */
    /* renamed from: A1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo41645A1() {
        /*
            r9 = this;
            boolean r0 = r9.mo46372B1()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            com.onedelhi.secure.wv0$d r0 = (com.onedelhi.secure.wv0.C7190d) r0
            if (r0 == 0) goto L_0x005b
            boolean r3 = r0.mo32292g()
            if (r3 != 0) goto L_0x005b
            com.onedelhi.secure.p1 r3 = com.onedelhi.secure.C6492q1.m61804b()
            r4 = 0
            if (r3 != 0) goto L_0x001e
            r3 = r4
            goto L_0x0026
        L_0x001e:
            long r5 = r3.mo42347b()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
        L_0x0026:
            if (r3 != 0) goto L_0x002d
            long r5 = java.lang.System.nanoTime()
            goto L_0x0031
        L_0x002d:
            long r5 = r3.longValue()
        L_0x0031:
            monitor-enter(r0)
            com.onedelhi.secure.dc4 r3 = r0.mo32290e()     // Catch:{ all -> 0x0058 }
            if (r3 != 0) goto L_0x003b
            monitor-exit(r0)
            r3 = r4
            goto L_0x0053
        L_0x003b:
            com.onedelhi.secure.wv0$c r3 = (com.onedelhi.secure.wv0.C7189c) r3     // Catch:{ all -> 0x0058 }
            boolean r7 = r3.mo46898s(r5)     // Catch:{ all -> 0x0058 }
            r8 = 0
            if (r7 == 0) goto L_0x0049
            boolean r3 = r9.mo46884U1(r3)     // Catch:{ all -> 0x0058 }
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            if (r3 == 0) goto L_0x0051
            com.onedelhi.secure.dc4 r3 = r0.mo32296k(r8)     // Catch:{ all -> 0x0058 }
            goto L_0x0052
        L_0x0051:
            r3 = r4
        L_0x0052:
            monitor-exit(r0)
        L_0x0053:
            com.onedelhi.secure.wv0$c r3 = (com.onedelhi.secure.wv0.C7189c) r3
            if (r3 != 0) goto L_0x0031
            goto L_0x005b
        L_0x0058:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x005b:
            java.lang.Runnable r0 = r9.mo46882L1()
            if (r0 == 0) goto L_0x0065
            r0.run()
            return r1
        L_0x0065:
            long r0 = r9.mo46377j1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.wv0.mo41645A1():long");
    }

    /* renamed from: J1 */
    public final void mo46881J1() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (C5759j1.m52871a(f37135a, this, (Object) null, zv0.f38458b)) {
                    return;
                }
            } else if (obj instanceof o82) {
                ((o82) obj).mo41589d();
                return;
            } else if (obj != zv0.f38458b) {
                o82 o82 = new o82(8, true);
                o82.mo41586a((Runnable) obj);
                if (C5759j1.m52871a(f37135a, this, obj, o82)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: L1 */
    public final Runnable mo46882L1() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof o82) {
                o82 o82 = (o82) obj;
                Object l = o82.mo41597l();
                if (l != o82.f32899a) {
                    return (Runnable) l;
                }
                C5759j1.m52871a(f37135a, this, obj, o82.mo41596k());
            } else if (obj == zv0.f38458b) {
                return null;
            } else {
                if (C5759j1.m52871a(f37135a, this, obj, (Object) null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    @vr2
    /* renamed from: M0 */
    public fn0 mo31901M0(long j, @vr2 Runnable runnable, @vr2 b90 b90) {
        return ei0.C5156a.m46893b(this, j, runnable, b90);
    }

    /* renamed from: M1 */
    public void mo46883M1(@vr2 Runnable runnable) {
        if (mo46884U1(runnable)) {
            mo47397G1();
        } else {
            zg0.f38333a.mo46883M1(runnable);
        }
    }

    @ss2
    @xj0(level = ak0.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    /* renamed from: P0 */
    public Object mo33767P0(long j, @vr2 b80<? super un4> b80) {
        return ei0.C5156a.m46892a(this, j, b80);
    }

    /* renamed from: Q0 */
    public final void mo31902Q0(@vr2 b90 b90, @vr2 Runnable runnable) {
        mo46883M1(runnable);
    }

    /* renamed from: U1 */
    public final boolean mo46884U1(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m69650d()) {
                return false;
            }
            if (obj == null) {
                if (C5759j1.m52871a(f37135a, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof o82) {
                o82 o82 = (o82) obj;
                int a = o82.mo41586a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    C5759j1.m52871a(f37135a, this, obj, o82.mo41596k());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == zv0.f38458b) {
                return false;
            } else {
                o82 o822 = new o82(8, true);
                o822.mo41586a((Runnable) obj);
                o822.mo41586a(runnable);
                if (C5759j1.m52871a(f37135a, this, obj, o822)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: V1 */
    public final void mo46885V1() {
        C6357p1 b = C6492q1.m61804b();
        Long valueOf = b == null ? null : Long.valueOf(b.mo42347b());
        long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
        while (true) {
            C7190d dVar = (C7190d) this._delayed;
            C7189c cVar = dVar == null ? null : (C7189c) dVar.mo32298m();
            if (cVar != null) {
                mo47396E1(nanoTime, cVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: Z */
    public void mo31904Z(long j, @vr2 C5744iu<? super un4> iuVar) {
        long d = zv0.m74358d(j);
        if (d < 4611686018427387903L) {
            C6357p1 b = C6492q1.m61804b();
            Long valueOf = b == null ? null : Long.valueOf(b.mo42347b());
            long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
            C7187a aVar = new C7187a(d + nanoTime, iuVar);
            C6057lu.m56508a(iuVar, aVar);
            mo46887b2(nanoTime, aVar);
        }
    }

    /* renamed from: a2 */
    public final void mo46886a2() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: b2 */
    public final void mo46887b2(long j, @vr2 C7189c cVar) {
        int c2 = mo46888c2(j, cVar);
        if (c2 != 0) {
            if (c2 == 1) {
                mo47396E1(j, cVar);
            } else if (c2 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (mo46891i2(cVar)) {
            mo47397G1();
        }
    }

    /* renamed from: c2 */
    public final int mo46888c2(long j, C7189c cVar) {
        if (m69650d()) {
            return 1;
        }
        C7190d dVar = (C7190d) this._delayed;
        if (dVar == null) {
            C5759j1.m52871a(f37136b, this, (Object) null, new C7190d(j));
            Object obj = this._delayed;
            jt1.m53774m(obj);
            dVar = (C7190d) obj;
        }
        return cVar.mo46897r(j, dVar, this);
    }

    @vr2
    /* renamed from: d2 */
    public final fn0 mo46889d2(long j, @vr2 Runnable runnable) {
        long d = zv0.m74358d(j);
        if (d >= 4611686018427387903L) {
            return jr2.f30914a;
        }
        C6357p1 b = C6492q1.m61804b();
        Long valueOf = b == null ? null : Long.valueOf(b.mo42347b());
        long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
        C7188b bVar = new C7188b(d + nanoTime, runnable);
        mo46887b2(nanoTime, bVar);
        return bVar;
    }

    /* renamed from: g2 */
    public final void mo46890g2(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: i2 */
    public final boolean mo46891i2(C7189c cVar) {
        C7190d dVar = (C7190d) this._delayed;
        return (dVar == null ? null : (C7189c) dVar.mo32293h()) == cVar;
    }

    /* renamed from: j1 */
    public long mo46377j1() {
        if (super.mo46377j1() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof o82)) {
                return obj == zv0.f38458b ? Long.MAX_VALUE : 0;
            }
            if (!((o82) obj).mo41593h()) {
                return 0;
            }
        }
        C7190d dVar = (C7190d) this._delayed;
        Long l = null;
        C7189c cVar = dVar == null ? null : (C7189c) dVar.mo32293h();
        if (cVar == null) {
            return Long.MAX_VALUE;
        }
        long j = cVar.f37141b;
        C6357p1 b = C6492q1.m61804b();
        if (b != null) {
            l = Long.valueOf(b.mo42347b());
        }
        return df3.m45201o(j - (l == null ? System.nanoTime() : l.longValue()), 0);
    }

    /* renamed from: s1 */
    public boolean mo46379s1() {
        if (!mo46382z1()) {
            return false;
        }
        C7190d dVar = (C7190d) this._delayed;
        if (dVar != null && !dVar.mo32292g()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            return obj instanceof o82 ? ((o82) obj).mo41593h() : obj == zv0.f38458b;
        }
    }

    public void shutdown() {
        wb4.f36943a.mo46669c();
        mo46890g2(true);
        mo46881J1();
        do {
        } while (mo41645A1() <= 0);
        mo46885V1();
    }
}

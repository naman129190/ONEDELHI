package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b \u0010!J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005HAø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\r\u001a\u00020\fH\u0001J\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0001J\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u001c\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u0018\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0017J#\u0010\u001b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\bJ\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0014\u0010\u001e\u001a\u00020\u001c2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/onedelhi/secure/f32;", "Lcom/onedelhi/secure/e90;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lcom/onedelhi/secure/ei0;", "", "time", "Lcom/onedelhi/secure/un4;", "P0", "(JLcom/onedelhi/secure/b80;)Ljava/lang/Object;", "timeMillis", "block", "Lcom/onedelhi/secure/b90;", "context", "Lcom/onedelhi/secure/fn0;", "M0", "Lcom/onedelhi/secure/iu;", "continuation", "Z", "", "parallelism", "V0", "run", "Q0", "R0", "Lkotlin/Function0;", "dispatch", "f1", "", "h1", "c1", "dispatcher", "<init>", "(Lcom/onedelhi/secure/e90;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class f32 extends e90 implements Runnable, ei0 {
    @vr2

    /* renamed from: a */
    public final e90 f28158a;

    /* renamed from: a */
    public final /* synthetic */ ei0 f28159a;
    @vr2

    /* renamed from: a */
    public final n82<Runnable> f28160a;
    @vr2

    /* renamed from: a */
    public final Object f28161a;

    /* renamed from: n */
    public final int f28162n;
    private volatile int runningWorkers;

    public f32(@vr2 e90 e90, int i) {
        this.f28158a = e90;
        this.f28162n = i;
        ei0 ei0 = e90 instanceof ei0 ? (ei0) e90 : null;
        this.f28159a = ei0 == null ? ah0.m38670a() : ei0;
        this.f28160a = new n82<>(false);
        this.f28161a = new Object();
    }

    @vr2
    /* renamed from: M0 */
    public fn0 mo31901M0(long j, @vr2 Runnable runnable, @vr2 b90 b90) {
        return this.f28159a.mo31901M0(j, runnable, b90);
    }

    @ss2
    @xj0(level = ak0.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    /* renamed from: P0 */
    public Object mo33767P0(long j, @vr2 b80<? super un4> b80) {
        return this.f28159a.mo33767P0(j, b80);
    }

    /* renamed from: Q0 */
    public void mo31902Q0(@vr2 b90 b90, @vr2 Runnable runnable) {
        if (!mo35772c1(runnable) && mo35774h1()) {
            this.f28158a.mo31902Q0(this, this);
        }
    }

    @zs1
    /* renamed from: R0 */
    public void mo34605R0(@vr2 b90 b90, @vr2 Runnable runnable) {
        if (!mo35772c1(runnable) && mo35774h1()) {
            this.f28158a.mo34605R0(this, this);
        }
    }

    @fy0
    @vr2
    /* renamed from: V0 */
    public e90 mo34864V0(int i) {
        g32.m49063a(i);
        return i >= this.f28162n ? this : super.mo34864V0(i);
    }

    /* renamed from: Z */
    public void mo31904Z(long j, @vr2 C5744iu<? super un4> iuVar) {
        this.f28159a.mo31904Z(j, iuVar);
    }

    /* renamed from: c1 */
    public final boolean mo35772c1(Runnable runnable) {
        this.f28160a.mo41001a(runnable);
        return this.runningWorkers >= this.f28162n;
    }

    /* renamed from: f1 */
    public final void mo35773f1(Runnable runnable, cc1<un4> cc1) {
        if (!mo35772c1(runnable) && mo35774h1()) {
            cc1.invoke();
        }
    }

    /* renamed from: h1 */
    public final boolean mo35774h1() {
        synchronized (this.f28161a) {
            if (this.runningWorkers >= this.f28162n) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f28161a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f28160a.mo41003c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = com.onedelhi.secure.un4.f36206a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            com.onedelhi.secure.n82<java.lang.Runnable> r2 = r4.f28160a
            java.lang.Object r2 = r2.mo41007g()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            com.onedelhi.secure.gt0 r3 = com.onedelhi.secure.gt0.f29313a
            com.onedelhi.secure.h90.m50304b(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            com.onedelhi.secure.e90 r2 = r4.f28158a
            boolean r2 = r2.mo31903S0(r4)
            if (r2 == 0) goto L_0x0002
            com.onedelhi.secure.e90 r0 = r4.f28158a
            r0.mo31902Q0(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f28161a
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            com.onedelhi.secure.n82<java.lang.Runnable> r2 = r4.f28160a     // Catch:{ all -> 0x0047 }
            int r2 = r2.mo41003c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            com.onedelhi.secure.un4 r2 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.f32.run():void");
    }
}

package com.onedelhi.secure;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\u001a\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b&\u0010'J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ#\u0010\u0018\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/onedelhi/secure/h32;", "Lcom/onedelhi/secure/yw0;", "Lcom/onedelhi/secure/y94;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "Lcom/onedelhi/secure/un4;", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "Lcom/onedelhi/secure/b90;", "context", "block", "Q0", "(Lcom/onedelhi/secure/b90;Ljava/lang/Runnable;)V", "R0", "", "toString", "()Ljava/lang/String;", "N0", "", "tailDispatch", "f1", "(Ljava/lang/Runnable;Z)V", "", "taskMode", "I", "q0", "()I", "c1", "()Ljava/util/concurrent/Executor;", "executor", "Lcom/onedelhi/secure/ey0;", "dispatcher", "parallelism", "name", "<init>", "(Lcom/onedelhi/secure/ey0;ILjava/lang/String;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class h32 extends yw0 implements y94, Executor {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29405a = AtomicIntegerFieldUpdater.newUpdater(h32.class, "inFlightTasks");
    @vr2

    /* renamed from: a */
    public final ey0 f29406a;
    @vr2

    /* renamed from: a */
    public final ConcurrentLinkedQueue<Runnable> f29407a = new ConcurrentLinkedQueue<>();
    @ss2

    /* renamed from: b */
    public final String f29408b;
    @vr2
    private volatile /* synthetic */ int inFlightTasks = 0;

    /* renamed from: n */
    public final int f29409n;

    /* renamed from: o */
    public final int f29410o;

    public h32(@vr2 ey0 ey0, int i, @ss2 String str, int i2) {
        this.f29406a = ey0;
        this.f29409n = i;
        this.f29408b = str;
        this.f29410o = i2;
    }

    /* renamed from: N0 */
    public void mo37164N0() {
        Runnable poll = this.f29407a.poll();
        if (poll != null) {
            this.f29406a.mo35660j1(poll, this, true);
            return;
        }
        f29405a.decrementAndGet(this);
        Runnable poll2 = this.f29407a.poll();
        if (poll2 != null) {
            mo37166f1(poll2, true);
        }
    }

    /* renamed from: Q0 */
    public void mo31902Q0(@vr2 b90 b90, @vr2 Runnable runnable) {
        mo37166f1(runnable, false);
    }

    /* renamed from: R0 */
    public void mo34605R0(@vr2 b90 b90, @vr2 Runnable runnable) {
        mo37166f1(runnable, true);
    }

    @vr2
    /* renamed from: c1 */
    public Executor mo35656c1() {
        return this;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(@vr2 Runnable runnable) {
        mo37166f1(runnable, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Runnable) = (r4v0 java.lang.Runnable), (r4v5 java.lang.Runnable) binds: [B:0:0x0000, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37166f1(java.lang.Runnable r4, boolean r5) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f29405a
            int r1 = r0.incrementAndGet(r3)
            int r2 = r3.f29409n
            if (r1 > r2) goto L_0x0010
            com.onedelhi.secure.ey0 r0 = r3.f29406a
            r0.mo35660j1(r4, r3, r5)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r1 = r3.f29407a
            r1.add(r4)
            int r4 = r0.decrementAndGet(r3)
            int r0 = r3.f29409n
            if (r4 < r0) goto L_0x001e
            return
        L_0x001e:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r4 = r3.f29407a
            java.lang.Object r4 = r4.poll()
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r4 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h32.mo37166f1(java.lang.Runnable, boolean):void");
    }

    /* renamed from: q0 */
    public int mo37167q0() {
        return this.f29410o;
    }

    @vr2
    public String toString() {
        String str = this.f29408b;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f29406a + ']';
    }
}

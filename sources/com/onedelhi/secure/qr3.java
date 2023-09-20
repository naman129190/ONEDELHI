package com.onedelhi.secure;

import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u0012\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J+\u0010\r\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u000f\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0011J\b\u0010\u0018\u001a\u00020\u0017H\u0002R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lcom/onedelhi/secure/qr3;", "Lcom/onedelhi/secure/yw0;", "Lcom/onedelhi/secure/b90;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lcom/onedelhi/secure/un4;", "Q0", "R0", "Lcom/onedelhi/secure/y94;", "", "tailDispatch", "h1", "(Ljava/lang/Runnable;Lcom/onedelhi/secure/y94;Z)V", "close", "l1", "()V", "", "timeout", "j1", "(J)V", "i1", "Lcom/onedelhi/secure/k90;", "f1", "Ljava/util/concurrent/Executor;", "c1", "()Ljava/util/concurrent/Executor;", "executor", "", "corePoolSize", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class qr3 extends yw0 {
    @vr2

    /* renamed from: a */
    public k90 f34338a;

    /* renamed from: b */
    public final long f34339b;
    @vr2

    /* renamed from: b */
    public final String f34340b;

    /* renamed from: n */
    public final int f34341n;

    /* renamed from: o */
    public final int f34342o;

    public qr3() {
        this(0, 0, 0, (String) null, 15, (wg0) null);
    }

    public qr3(int i, int i2, long j, @vr2 String str) {
        this.f34341n = i;
        this.f34342o = i2;
        this.f34339b = j;
        this.f34340b = str;
        this.f34338a = mo43696f1();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ qr3(int r4, int r5, long r6, java.lang.String r8, int r9, com.onedelhi.secure.wg0 r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            int r4 = com.onedelhi.secure.ia4.f30235a
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            int r5 = com.onedelhi.secure.ia4.f30240b
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            long r6 = com.onedelhi.secure.ia4.f30241b
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            java.lang.String r8 = "CoroutineScheduler"
        L_0x001a:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qr3.<init>(int, int, long, java.lang.String, int, com.onedelhi.secure.wg0):void");
    }

    /* renamed from: Q0 */
    public void mo31902Q0(@vr2 b90 b90, @vr2 Runnable runnable) {
        k90.m54108A(this.f34338a, runnable, (y94) null, false, 6, (Object) null);
    }

    /* renamed from: R0 */
    public void mo34605R0(@vr2 b90 b90, @vr2 Runnable runnable) {
        k90.m54108A(this.f34338a, runnable, (y94) null, true, 2, (Object) null);
    }

    @vr2
    /* renamed from: c1 */
    public Executor mo35656c1() {
        return this.f34338a;
    }

    public void close() {
        this.f34338a.close();
    }

    /* renamed from: f1 */
    public final k90 mo43696f1() {
        return new k90(this.f34341n, this.f34342o, this.f34339b, this.f34340b);
    }

    /* renamed from: h1 */
    public final void mo43697h1(@vr2 Runnable runnable, @vr2 y94 y94, boolean z) {
        this.f34338a.mo39099q(runnable, y94, z);
    }

    /* renamed from: i1 */
    public final void mo43698i1() {
        mo43700l1();
    }

    /* renamed from: j1 */
    public final synchronized void mo43699j1(long j) {
        this.f34338a.mo39094l0(j);
    }

    /* renamed from: l1 */
    public final synchronized void mo43700l1() {
        this.f34338a.mo39094l0(1000);
        this.f34338a = mo43696f1();
    }
}

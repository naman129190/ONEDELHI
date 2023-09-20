package com.onedelhi.secure;

import com.onedelhi.secure.ei0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J.\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b*\u00020\u001a2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u001a\u0010!\u001a\u00020 8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/onedelhi/secure/zw0;", "Lcom/onedelhi/secure/yw0;", "Lcom/onedelhi/secure/ei0;", "Lcom/onedelhi/secure/b90;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lcom/onedelhi/secure/un4;", "Q0", "", "timeMillis", "Lcom/onedelhi/secure/iu;", "continuation", "Z", "Lcom/onedelhi/secure/fn0;", "M0", "close", "", "toString", "", "other", "", "equals", "", "hashCode", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "h1", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "f1", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "c1", "()Ljava/util/concurrent/Executor;", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class zw0 extends yw0 implements ei0 {
    @vr2

    /* renamed from: a */
    public final Executor f38472a;

    public zw0(@vr2 Executor executor) {
        this.f38472a = executor;
        i40.m51786c(mo35656c1());
    }

    @vr2
    /* renamed from: M0 */
    public fn0 mo31901M0(long j, @vr2 Runnable runnable, @vr2 b90 b90) {
        Executor c1 = mo35656c1();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = c1 instanceof ScheduledExecutorService ? (ScheduledExecutorService) c1 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = mo48452h1(scheduledExecutorService, runnable, b90, j);
        }
        return scheduledFuture != null ? new en0(scheduledFuture) : zg0.f38333a.mo31901M0(j, runnable, b90);
    }

    @ss2
    @xj0(level = ak0.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    /* renamed from: P0 */
    public Object mo33767P0(long j, @vr2 b80<? super un4> b80) {
        return ei0.C5156a.m46892a(this, j, b80);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1 == null) goto L_0x0011;
     */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31902Q0(@com.onedelhi.secure.vr2 com.onedelhi.secure.b90 r3, @com.onedelhi.secure.vr2 java.lang.Runnable r4) {
        /*
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mo35656c1()     // Catch:{ RejectedExecutionException -> 0x0016 }
            com.onedelhi.secure.p1 r1 = com.onedelhi.secure.C6492q1.m61804b()     // Catch:{ RejectedExecutionException -> 0x0016 }
            if (r1 != 0) goto L_0x000b
            goto L_0x0011
        L_0x000b:
            java.lang.Runnable r1 = r1.mo42354i(r4)     // Catch:{ RejectedExecutionException -> 0x0016 }
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r1 = r4
        L_0x0012:
            r0.execute(r1)     // Catch:{ RejectedExecutionException -> 0x0016 }
            goto L_0x002b
        L_0x0016:
            r0 = move-exception
            com.onedelhi.secure.p1 r1 = com.onedelhi.secure.C6492q1.m61804b()
            if (r1 != 0) goto L_0x001e
            goto L_0x0021
        L_0x001e:
            r1.mo42351f()
        L_0x0021:
            r2.mo48451f1(r3, r0)
            com.onedelhi.secure.e90 r0 = com.onedelhi.secure.wm0.m69460c()
            r0.mo31902Q0(r3, r4)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zw0.mo31902Q0(com.onedelhi.secure.b90, java.lang.Runnable):void");
    }

    /* renamed from: Z */
    public void mo31904Z(long j, @vr2 C5744iu<? super un4> iuVar) {
        Executor c1 = mo35656c1();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = c1 instanceof ScheduledExecutorService ? (ScheduledExecutorService) c1 : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = mo48452h1(scheduledExecutorService, new xl3(this, iuVar), iuVar.mo31187f(), j);
        }
        if (scheduledFuture != null) {
            xu1.m70829w(iuVar, scheduledFuture);
        } else {
            zg0.f38333a.mo31904Z(j, iuVar);
        }
    }

    @vr2
    /* renamed from: c1 */
    public Executor mo35656c1() {
        return this.f38472a;
    }

    public void close() {
        Executor c1 = mo35656c1();
        ExecutorService executorService = c1 instanceof ExecutorService ? (ExecutorService) c1 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(@ss2 Object obj) {
        return (obj instanceof zw0) && ((zw0) obj).mo35656c1() == mo35656c1();
    }

    /* renamed from: f1 */
    public final void mo48451f1(b90 b90, RejectedExecutionException rejectedExecutionException) {
        xu1.m70812f(b90, nw0.m58835a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: h1 */
    public final ScheduledFuture<?> mo48452h1(ScheduledExecutorService scheduledExecutorService, Runnable runnable, b90 b90, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            mo48451f1(b90, e);
            return null;
        }
    }

    public int hashCode() {
        return System.identityHashCode(mo35656c1());
    }

    @vr2
    public String toString() {
        return mo35656c1().toString();
    }
}

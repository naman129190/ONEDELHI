package com.onedelhi.secure;

import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0017J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/ih0;", "Lcom/onedelhi/secure/yw0;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lcom/onedelhi/secure/un4;", "execute", "", "parallelism", "Lcom/onedelhi/secure/e90;", "V0", "Lcom/onedelhi/secure/b90;", "context", "Lkotlinx/coroutines/Runnable;", "block", "Q0", "R0", "close", "", "toString", "c1", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ih0 extends yw0 implements Executor {
    @vr2

    /* renamed from: a */
    public static final e90 f30332a = do4.f27583a.mo34864V0(i94.m51958d(xm0.f37543a, df3.m45198n(64, g94.m49182a()), 0, 0, 12, (Object) null));
    @vr2

    /* renamed from: a */
    public static final ih0 f30333a = new ih0();

    /* renamed from: Q0 */
    public void mo31902Q0(@vr2 b90 b90, @vr2 Runnable runnable) {
        f30332a.mo31902Q0(b90, runnable);
    }

    @zs1
    /* renamed from: R0 */
    public void mo34605R0(@vr2 b90 b90, @vr2 Runnable runnable) {
        f30332a.mo34605R0(b90, runnable);
    }

    @fy0
    @vr2
    /* renamed from: V0 */
    public e90 mo34864V0(int i) {
        return do4.f27583a.mo34864V0(i);
    }

    @vr2
    /* renamed from: c1 */
    public Executor mo35656c1() {
        return this;
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(@vr2 Runnable runnable) {
        mo31902Q0(gt0.f29313a, runnable);
    }

    @vr2
    public String toString() {
        return "Dispatchers.IO";
    }
}

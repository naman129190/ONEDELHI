package com.onedelhi.secure;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0011\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\u0006\u0010\u001e\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#B'\b\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r\u0012\b\b\u0002\u0010\u001e\u001a\u00020\r\u0012\b\b\u0002\u0010!\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010$B\u001d\b\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r\u0012\b\b\u0002\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\"\u0010%J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rJ+\u0010\u0015\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/onedelhi/secure/ey0;", "Lcom/onedelhi/secure/yw0;", "Lcom/onedelhi/secure/b90;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lcom/onedelhi/secure/un4;", "Q0", "R0", "close", "", "toString", "", "parallelism", "Lcom/onedelhi/secure/e90;", "f1", "l1", "Lcom/onedelhi/secure/y94;", "", "tailDispatch", "j1", "(Ljava/lang/Runnable;Lcom/onedelhi/secure/y94;Z)V", "Lcom/onedelhi/secure/k90;", "i1", "Ljava/util/concurrent/Executor;", "c1", "()Ljava/util/concurrent/Executor;", "executor", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "(IILjava/lang/String;)V", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@z73
public class ey0 extends yw0 {
    @vr2

    /* renamed from: a */
    public k90 f28117a;

    /* renamed from: b */
    public final long f28118b;
    @vr2

    /* renamed from: b */
    public final String f28119b;

    /* renamed from: n */
    public final int f28120n;

    /* renamed from: o */
    public final int f28121o;

    @xj0(level = ak0.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ ey0(int i, int i2) {
        this(i, i2, ia4.f30241b, (String) null, 8, (wg0) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey0(int i, int i2, int i3, wg0 wg0) {
        this((i3 & 1) != 0 ? ia4.f30235a : i, (i3 & 2) != 0 ? ia4.f30240b : i2);
    }

    public ey0(int i, int i2, long j, @vr2 String str) {
        this.f28120n = i;
        this.f28121o = i2;
        this.f28118b = j;
        this.f28119b = str;
        this.f28117a = mo35659i1();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey0(int i, int i2, long j, String str, int i3, wg0 wg0) {
        this(i, i2, j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public ey0(int i, int i2, @vr2 String str) {
        this(i, i2, ia4.f30241b, str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey0(int i, int i2, String str, int i3, wg0 wg0) {
        this((i3 & 1) != 0 ? ia4.f30235a : i, (i3 & 2) != 0 ? ia4.f30240b : i2, (i3 & 4) != 0 ? ia4.f30239a : str);
    }

    /* renamed from: h1 */
    public static /* synthetic */ e90 m47327h1(ey0 ey0, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 16;
            }
            return ey0.mo35658f1(i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
    }

    /* renamed from: Q0 */
    public void mo31902Q0(@vr2 b90 b90, @vr2 Runnable runnable) {
        try {
            k90.m54108A(this.f28117a, runnable, (y94) null, false, 6, (Object) null);
        } catch (RejectedExecutionException unused) {
            zg0.f38333a.mo31902Q0(b90, runnable);
        }
    }

    /* renamed from: R0 */
    public void mo34605R0(@vr2 b90 b90, @vr2 Runnable runnable) {
        try {
            k90.m54108A(this.f28117a, runnable, (y94) null, true, 2, (Object) null);
        } catch (RejectedExecutionException unused) {
            zg0.f38333a.mo34605R0(b90, runnable);
        }
    }

    @vr2
    /* renamed from: c1 */
    public Executor mo35656c1() {
        return this.f28117a;
    }

    public void close() {
        this.f28117a.close();
    }

    @vr2
    /* renamed from: f1 */
    public final e90 mo35658f1(int i) {
        if (i > 0) {
            return new h32(this, i, (String) null, 1);
        }
        throw new IllegalArgumentException(jt1.m53745C("Expected positive parallelism level, but have ", Integer.valueOf(i)).toString());
    }

    /* renamed from: i1 */
    public final k90 mo35659i1() {
        return new k90(this.f28120n, this.f28121o, this.f28118b, this.f28119b);
    }

    /* renamed from: j1 */
    public final void mo35660j1(@vr2 Runnable runnable, @vr2 y94 y94, boolean z) {
        try {
            this.f28117a.mo39099q(runnable, y94, z);
        } catch (RejectedExecutionException unused) {
            zg0.f38333a.mo46883M1(this.f28117a.mo39089g(runnable, y94));
        }
    }

    @vr2
    /* renamed from: l1 */
    public final e90 mo35661l1(int i) {
        boolean z = true;
        if (i > 0) {
            if (i > this.f28120n) {
                z = false;
            }
            if (z) {
                return new h32(this, i, (String) null, 0);
            }
            throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.f28120n + "), but have " + i).toString());
        }
        throw new IllegalArgumentException(jt1.m53745C("Expected positive parallelism level, but have ", Integer.valueOf(i)).toString());
    }

    @vr2
    public String toString() {
        return super.toString() + "[scheduler = " + this.f28117a + ']';
    }
}

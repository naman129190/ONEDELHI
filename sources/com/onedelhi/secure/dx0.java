package com.onedelhi.secure;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0005*\u0010\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001B\u0002\b\t¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lcom/onedelhi/secure/yw0;", "d", "(Ljava/util/concurrent/ExecutorService;)Lcom/onedelhi/secure/yw0;", "Ljava/util/concurrent/Executor;", "Lcom/onedelhi/secure/e90;", "c", "(Ljava/util/concurrent/Executor;)Lcom/onedelhi/secure/e90;", "b", "Lcom/onedelhi/secure/fy0;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class dx0 {
    @fy0
    /* renamed from: a */
    public static /* synthetic */ void m45651a() {
    }

    @vr2
    /* renamed from: b */
    public static final Executor m45652b(@vr2 e90 e90) {
        Executor executor = null;
        yw0 yw0 = e90 instanceof yw0 ? (yw0) e90 : null;
        if (yw0 != null) {
            executor = yw0.mo35656c1();
        }
        return executor == null ? new vm0(e90) : executor;
    }

    @uw1(name = "from")
    @vr2
    /* renamed from: c */
    public static final e90 m45653c(@vr2 Executor executor) {
        e90 e90 = null;
        vm0 vm0 = executor instanceof vm0 ? (vm0) executor : null;
        if (vm0 != null) {
            e90 = vm0.f36593a;
        }
        return e90 == null ? new zw0(executor) : e90;
    }

    @uw1(name = "from")
    @vr2
    /* renamed from: d */
    public static final yw0 m45654d(@vr2 ExecutorService executorService) {
        return new zw0(executorService);
    }
}

package com.onedelhi.secure;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¨\u0006\u0007"}, d2 = {"", "name", "Lcom/onedelhi/secure/yw0;", "d", "", "nThreads", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class ac4 {
    @dj0
    @vr2
    /* renamed from: b */
    public static final yw0 m38570b(int i, @vr2 String str) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            return dx0.m45654d(Executors.newScheduledThreadPool(i, new zb4(i, str, new AtomicInteger())));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i + " specified").toString());
    }

    /* renamed from: c */
    public static final Thread m38571c(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    @dj0
    @vr2
    /* renamed from: d */
    public static final yw0 m38572d(@vr2 String str) {
        return m38570b(1, str);
    }
}

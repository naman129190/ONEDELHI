package com.onedelhi.secure;

import com.onedelhi.secure.k90;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¨\u0006\u0005"}, d2 = {"Ljava/lang/Thread;", "thread", "", "a", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class l90 {
    @uw1(name = "isSchedulerWorker")
    /* renamed from: a */
    public static final boolean m55478a(@vr2 Thread thread) {
        return thread instanceof k90.C5878c;
    }

    @uw1(name = "mayNotBlock")
    /* renamed from: b */
    public static final boolean m55479b(@vr2 Thread thread) {
        return (thread instanceof k90.C5878c) && ((k90.C5878c) thread).f31156a == k90.C5879d.CPU_ACQUIRED;
    }
}

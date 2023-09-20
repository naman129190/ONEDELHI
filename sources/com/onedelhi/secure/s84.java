package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\b¢\u0006\u0004\b\u0006\u0010\u0007*\u0010\b\u0007\u0010\t\"\u00020\u00012\u00020\u0001B\u0002\b\b¨\u0006\n"}, d2 = {"T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", "b", "(Ljava/lang/Object;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "Lcom/onedelhi/secure/zs1;", "SynchronizedObject", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class s84 {
    @zs1
    /* renamed from: a */
    public static /* synthetic */ void m64414a() {
    }

    @zs1
    /* renamed from: b */
    public static final <T> T m64415b(@vr2 Object obj, @vr2 cc1<? extends T> cc1) {
        T invoke;
        synchronized (obj) {
            try {
                invoke = cc1.invoke();
                uq1.m67403d(1);
            } catch (Throwable th) {
                uq1.m67403d(1);
                uq1.m67402c(1);
                throw th;
            }
        }
        uq1.m67402c(1);
        return invoke;
    }
}

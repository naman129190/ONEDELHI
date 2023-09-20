package com.onedelhi.secure;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/zt;", "Lcom/onedelhi/secure/av1;", "", "cause", "Lcom/onedelhi/secure/un4;", "a1", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.zt */
public final class C7513zt extends av1 {
    @vr2

    /* renamed from: a */
    public final Future<?> f38421a;

    public C7513zt(@vr2 Future<?> future) {
        this.f38421a = future;
    }

    /* renamed from: X */
    public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
        mo32031a1((Throwable) obj);
        return un4.f36206a;
    }

    /* renamed from: a1 */
    public void mo32031a1(@ss2 Throwable th) {
        if (th != null) {
            this.f38421a.cancel(false);
        }
    }
}

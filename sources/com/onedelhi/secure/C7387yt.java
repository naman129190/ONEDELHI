package com.onedelhi.secure;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/yt;", "Lcom/onedelhi/secure/au;", "", "cause", "Lcom/onedelhi/secure/un4;", "a", "", "toString", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.yt */
public final class C7387yt extends C4592au {
    @vr2

    /* renamed from: a */
    public final Future<?> f38051a;

    public C7387yt(@vr2 Future<?> future) {
        this.f38051a = future;
    }

    /* renamed from: X */
    public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
        mo31185a((Throwable) obj);
        return un4.f36206a;
    }

    /* renamed from: a */
    public void mo31185a(@ss2 Throwable th) {
        if (th != null) {
            this.f38051a.cancel(false);
        }
    }

    @vr2
    public String toString() {
        return "CancelFutureOnCancel[" + this.f38051a + ']';
    }
}

package com.onedelhi.secure;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/en0;", "Lcom/onedelhi/secure/fn0;", "Lcom/onedelhi/secure/un4;", "e", "", "toString", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class en0 implements fn0 {
    @vr2

    /* renamed from: a */
    public final Future<?> f28014a;

    public en0(@vr2 Future<?> future) {
        this.f28014a = future;
    }

    /* renamed from: e */
    public void mo30964e() {
        this.f28014a.cancel(false);
    }

    @vr2
    public String toString() {
        return "DisposableFutureHandle[" + this.f28014a + ']';
    }
}

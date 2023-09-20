package com.onedelhi.secure;

import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/vm0;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lcom/onedelhi/secure/un4;", "execute", "", "toString", "Lcom/onedelhi/secure/e90;", "dispatcher", "<init>", "(Lcom/onedelhi/secure/e90;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class vm0 implements Executor {
    @rw1
    @vr2

    /* renamed from: a */
    public final e90 f36593a;

    public vm0(@vr2 e90 e90) {
        this.f36593a = e90;
    }

    public void execute(@vr2 Runnable runnable) {
        this.f36593a.mo31902Q0(gt0.f29313a, runnable);
    }

    @vr2
    public String toString() {
        return this.f36593a.toString();
    }
}

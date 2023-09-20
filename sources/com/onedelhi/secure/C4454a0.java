package com.onedelhi.secure;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001b\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/a0;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "Lcom/onedelhi/secure/o81;", "owner", "Lcom/onedelhi/secure/o81;", "a", "()Lcom/onedelhi/secure/o81;", "<init>", "(Lcom/onedelhi/secure/o81;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.a0 */
public final class C4454a0 extends CancellationException {
    @vr2

    /* renamed from: a */
    public final o81<?> f25675a;

    public C4454a0(@vr2 o81<?> o81) {
        super("Flow was aborted, no more elements needed");
        this.f25675a = o81;
    }

    @vr2
    /* renamed from: a */
    public final o81<?> mo30372a() {
        return this.f25675a;
    }

    @vr2
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

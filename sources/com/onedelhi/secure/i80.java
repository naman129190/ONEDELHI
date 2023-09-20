package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/i80;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/onedelhi/secure/un4;", "run", "", "toString", "Lcom/onedelhi/secure/b80;", "continuation", "<init>", "(Lcom/onedelhi/secure/b80;)V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
public final class i80 extends AtomicBoolean implements Runnable {
    @vr2

    /* renamed from: a */
    public final b80<un4> f13545a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i80(@vr2 b80<? super un4> b80) {
        super(false);
        jt1.m53777p(b80, "continuation");
        this.f13545a = b80;
    }

    public void run() {
        if (compareAndSet(false, true)) {
            b80<un4> b80 = this.f13545a;
            nl3.C6191a aVar = nl3.f32575a;
            b80.mo31191m0(nl3.m58187b(un4.f36206a));
        }
    }

    @vr2
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}

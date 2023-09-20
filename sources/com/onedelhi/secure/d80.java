package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/d80;", "T", "Ljava/util/function/Consumer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "value", "Lcom/onedelhi/secure/un4;", "accept", "(Ljava/lang/Object;)V", "", "toString", "Lcom/onedelhi/secure/b80;", "continuation", "<init>", "(Lcom/onedelhi/secure/b80;)V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
@sj3(24)
public final class d80<T> extends AtomicBoolean implements Consumer<T> {
    @vr2

    /* renamed from: a */
    public final b80<T> f10660a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d80(@vr2 b80<? super T> b80) {
        super(false);
        jt1.m53777p(b80, "continuation");
        this.f10660a = b80;
    }

    public void accept(T t) {
        if (compareAndSet(false, true)) {
            b80<T> b80 = this.f10660a;
            nl3.C6191a aVar = nl3.f32575a;
            b80.mo31191m0(nl3.m58187b(t));
        }
    }

    @vr2
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}

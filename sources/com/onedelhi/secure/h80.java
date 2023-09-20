package com.onedelhi.secure;

import android.os.OutcomeReceiver;
import com.onedelhi.secure.nl3;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/h80;", "R", "", "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "result", "Lcom/onedelhi/secure/un4;", "onResult", "(Ljava/lang/Object;)V", "error", "onError", "(Ljava/lang/Throwable;)V", "", "toString", "Lcom/onedelhi/secure/b80;", "continuation", "<init>", "(Lcom/onedelhi/secure/b80;)V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
@sj3(31)
public final class h80<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    @vr2

    /* renamed from: a */
    public final b80<R> f12999a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h80(@vr2 b80<? super R> b80) {
        super(false);
        jt1.m53777p(b80, "continuation");
        this.f12999a = b80;
    }

    public void onError(@vr2 E e) {
        jt1.m53777p(e, "error");
        if (compareAndSet(false, true)) {
            b80<R> b80 = this.f12999a;
            nl3.C6191a aVar = nl3.f32575a;
            b80.mo31191m0(nl3.m58187b(pl3.m61423a(e)));
        }
    }

    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            b80<R> b80 = this.f12999a;
            nl3.C6191a aVar = nl3.f32575a;
            b80.mo31191m0(nl3.m58187b(r));
        }
    }

    @vr2
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}

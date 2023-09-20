package com.onedelhi.secure;

import com.onedelhi.secure.xs3;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/xs3;", "S", "Lcom/onedelhi/secure/k40;", "", "r", "()Z", "n", "Lcom/onedelhi/secure/un4;", "q", "()V", "", "id", "J", "o", "()J", "", "p", "()I", "maxSlots", "g", "removed", "prev", "pointers", "<init>", "(JLcom/onedelhi/secure/xs3;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class xs3<S extends xs3<S>> extends k40<S> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f37594a = AtomicIntegerFieldUpdater.newUpdater(xs3.class, "cleanedAndPointers");

    /* renamed from: a */
    public final long f37595a;
    @vr2
    private volatile /* synthetic */ int cleanedAndPointers;

    public xs3(long j, @ss2 S s, int i) {
        super(s);
        this.f37595a = j;
        this.cleanedAndPointers = i << 16;
    }

    /* renamed from: g */
    public boolean mo39045g() {
        return this.cleanedAndPointers == mo43722p() && !mo39047i();
    }

    /* renamed from: n */
    public final boolean mo47390n() {
        return f37594a.addAndGet(this, g74.f12468c) == mo43722p() && !mo39047i();
    }

    /* renamed from: o */
    public final long mo47391o() {
        return this.f37595a;
    }

    /* renamed from: p */
    public abstract int mo43722p();

    /* renamed from: q */
    public final void mo47392q() {
        if (f37594a.incrementAndGet(this) == mo43722p() && !mo39047i()) {
            mo39050l();
        }
    }

    /* renamed from: r */
    public final boolean mo47393r() {
        int i;
        do {
            i = this.cleanedAndPointers;
            if (!(i != mo43722p() || mo39047i())) {
                return false;
            }
        } while (!f37594a.compareAndSet(this, i, 65536 + i));
        return true;
    }
}

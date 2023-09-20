package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/g34;", "Lcom/onedelhi/secure/o1;", "Lcom/onedelhi/secure/e34;", "flow", "", "c", "(Lcom/onedelhi/secure/e34;)Z", "", "Lcom/onedelhi/secure/b80;", "Lcom/onedelhi/secure/un4;", "e", "(Lcom/onedelhi/secure/e34;)[Lcom/onedelhi/secure/b80;", "f", "()V", "g", "()Z", "d", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class g34 extends C6239o1<e34<?>> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28933a = AtomicReferenceFieldUpdater.newUpdater(g34.class, Object.class, "_state");
    @vr2
    public volatile /* synthetic */ Object _state = null;

    /* renamed from: c */
    public boolean mo36555a(@vr2 e34<?> e34) {
        if (this._state != null) {
            return false;
        }
        this._state = f34.f28163a;
        return true;
    }

    @ss2
    /* renamed from: d */
    public final Object mo36558d(@vr2 b80<? super un4> b80) {
        C5847ju juVar = new C5847ju(lt1.m56482d(b80), 1);
        juVar.mo38234T();
        if (!C5759j1.m52871a(f28933a, this, f34.f28163a, juVar)) {
            nl3.C6191a aVar = nl3.f32575a;
            juVar.mo31191m0(nl3.m58187b(un4.f36206a));
        }
        Object A = juVar.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return A == mt1.m57558h() ? A : un4.f36206a;
    }

    @vr2
    /* renamed from: e */
    public b80<un4>[] mo36556b(@vr2 e34<?> e34) {
        this._state = null;
        return C6163n1.f32338a;
    }

    /* renamed from: f */
    public final void mo36560f() {
        while (true) {
            Object obj = this._state;
            if (obj != null && obj != f34.f28164b) {
                if (obj == f34.f28163a) {
                    if (C5759j1.m52871a(f28933a, this, obj, f34.f28164b)) {
                        return;
                    }
                } else if (C5759j1.m52871a(f28933a, this, obj, f34.f28163a)) {
                    nl3.C6191a aVar = nl3.f32575a;
                    ((C5847ju) obj).mo31191m0(nl3.m58187b(un4.f36206a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo36561g() {
        Object andSet = f28933a.getAndSet(this, f34.f28163a);
        jt1.m53774m(andSet);
        return andSet == f34.f28164b;
    }
}

package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/onedelhi/secure/sm0;", "T", "Lcom/onedelhi/secure/js3;", "", "state", "Lcom/onedelhi/secure/un4;", "k0", "(Ljava/lang/Object;)V", "F1", "L1", "()Ljava/lang/Object;", "", "N1", "()Z", "M1", "Lcom/onedelhi/secure/b90;", "context", "Lcom/onedelhi/secure/b80;", "uCont", "<init>", "(Lcom/onedelhi/secure/b90;Lcom/onedelhi/secure/b80;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class sm0<T> extends js3<T> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f35143a = AtomicIntegerFieldUpdater.newUpdater(sm0.class, "_decision");
    @vr2
    private volatile /* synthetic */ int _decision = 0;

    public sm0(@vr2 b90 b90, @vr2 b80<? super T> b80) {
        super(b90, b80);
    }

    /* renamed from: F1 */
    public void mo38840F1(@ss2 Object obj) {
        if (!mo44414M1()) {
            rm0.m63748g(lt1.m56482d(this.f30926a), s20.m64133a(obj, this.f30926a), (ec1) null, 2, (Object) null);
        }
    }

    @ss2
    /* renamed from: L1 */
    public final Object mo44413L1() {
        if (mo44415N1()) {
            return mt1.m57558h();
        }
        Object o = cv1.m44326o(mo32092T0());
        if (!(o instanceof m20)) {
            return o;
        }
        throw ((m20) o).f31975a;
    }

    /* renamed from: M1 */
    public final boolean mo44414M1() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f35143a.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: N1 */
    public final boolean mo44415N1() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f35143a.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: k0 */
    public void mo32121k0(@ss2 Object obj) {
        mo38840F1(obj);
    }
}

package com.onedelhi.secure;

import com.onedelhi.secure.C5860k1;
import com.onedelhi.secure.l82;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010%\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010#j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`$¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0014J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002R\u0014\u0010\u0018\u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017R\u0014\u0010\"\u001a\u00020\u001f8TX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/onedelhi/secure/r50;", "E", "Lcom/onedelhi/secure/i0;", "element", "", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/onedelhi/secure/it3;", "select", "J", "(Ljava/lang/Object;Lcom/onedelhi/secure/it3;)Ljava/lang/Object;", "q0", "r0", "", "wasClosed", "Lcom/onedelhi/secure/un4;", "m0", "Lcom/onedelhi/secure/kg3;", "receive", "g0", "Lcom/onedelhi/secure/mn4;", "w0", "j0", "()Z", "isBufferAlwaysEmpty", "k0", "isBufferEmpty", "D", "isBufferAlwaysFull", "isBufferFull", "isEmpty", "", "m", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lcom/onedelhi/secure/ec1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class r50<E> extends C5632i0<E> {
    @ss2

    /* renamed from: a */
    public Object f34503a = C5757j0.f30526a;
    @vr2

    /* renamed from: a */
    public final ReentrantLock f34504a = new ReentrantLock();

    public r50(@ss2 ec1<? super E, un4> ec1) {
        super(ec1);
    }

    /* renamed from: D */
    public final boolean mo31520D() {
        return false;
    }

    /* renamed from: E */
    public final boolean mo31521E() {
        return false;
    }

    /* JADX INFO: finally extract failed */
    @vr2
    /* renamed from: H */
    public Object mo31522H(E e) {
        mg3 T;
        ReentrantLock reentrantLock = this.f34504a;
        reentrantLock.lock();
        try {
            C5753iz<?> o = mo38994o();
            if (o == null) {
                if (this.f34503a == C5757j0.f30526a) {
                    do {
                        T = mo37694T();
                        if (T != null) {
                            if (T instanceof C5753iz) {
                                reentrantLock.unlock();
                                return T;
                            }
                        }
                    } while (T.mo37725e0(e, (l82.C5974d) null) == null);
                    un4 un4 = un4.f36206a;
                    reentrantLock.unlock();
                    T.mo37722B(e);
                    return T.mo38297s();
                }
                mn4 w0 = mo43818w0(e);
                if (w0 == null) {
                    l84 l84 = C5757j0.f30528b;
                    reentrantLock.unlock();
                    return l84;
                }
                throw w0;
            }
            reentrantLock.unlock();
            return o;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @vr2
    /* renamed from: J */
    public Object mo31523J(E e, @vr2 it3<?> it3) {
        ReentrantLock reentrantLock = this.f34504a;
        reentrantLock.lock();
        try {
            C5753iz<?> o = mo38994o();
            if (o == null) {
                if (this.f34503a == C5757j0.f30526a) {
                    while (true) {
                        C5860k1.C5864d j = mo38992j(e);
                        Object C = it3.mo35593C(j);
                        if (C == null) {
                            Object o2 = j.mo39711o();
                            un4 un4 = un4.f36206a;
                            reentrantLock.unlock();
                            jt1.m53774m(o2);
                            mg3 mg3 = (mg3) o2;
                            mg3.mo37722B(e);
                            return mg3.mo38297s();
                        } else if (C == C5757j0.f30529c) {
                            break;
                        } else if (C != C6944ub.f36019b) {
                            if (C != kt3.m54916d()) {
                                if (!(C instanceof C5753iz)) {
                                    throw new IllegalStateException(jt1.m53745C("performAtomicTrySelect(describeTryOffer) returned ", C).toString());
                                }
                            }
                            return C;
                        }
                    }
                }
                if (!it3.mo35594D()) {
                    Object d = kt3.m54916d();
                    reentrantLock.unlock();
                    return d;
                }
                mn4 w0 = mo43818w0(e);
                if (w0 == null) {
                    l84 l84 = C5757j0.f30528b;
                    reentrantLock.unlock();
                    return l84;
                }
                throw w0;
            }
            reentrantLock.unlock();
            return o;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g0 */
    public boolean mo31524g0(@vr2 kg3<? super E> kg3) {
        ReentrantLock reentrantLock = this.f34504a;
        reentrantLock.lock();
        try {
            return super.mo31524g0(kg3);
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f34504a;
        reentrantLock.lock();
        try {
            return mo37706l0();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: j0 */
    public final boolean mo31526j0() {
        return false;
    }

    /* renamed from: k0 */
    public final boolean mo31527k0() {
        return this.f34503a == C5757j0.f30526a;
    }

    @vr2
    /* renamed from: m */
    public String mo31529m() {
        return "(value=" + this.f34503a + ')';
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m0 */
    public void mo31530m0(boolean z) {
        ReentrantLock reentrantLock = this.f34504a;
        reentrantLock.lock();
        try {
            mn4 w0 = mo43818w0(C5757j0.f30526a);
            un4 un4 = un4.f36206a;
            reentrantLock.unlock();
            super.mo31530m0(z);
            if (w0 != null) {
                throw w0;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @ss2
    /* renamed from: q0 */
    public Object mo31531q0() {
        ReentrantLock reentrantLock = this.f34504a;
        reentrantLock.lock();
        try {
            Object obj = this.f34503a;
            l84 l84 = C5757j0.f30526a;
            if (obj == l84) {
                Object o = mo38994o();
                if (o == null) {
                    o = C5757j0.f30530d;
                }
                return o;
            }
            this.f34503a = l84;
            un4 un4 = un4.f36206a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @ss2
    /* renamed from: r0 */
    public Object mo31532r0(@vr2 it3<?> it3) {
        ReentrantLock reentrantLock = this.f34504a;
        reentrantLock.lock();
        try {
            Object obj = this.f34503a;
            l84 l84 = C5757j0.f30526a;
            if (obj == l84) {
                Object o = mo38994o();
                if (o == null) {
                    o = C5757j0.f30530d;
                }
                return o;
            } else if (!it3.mo35594D()) {
                Object d = kt3.m54916d();
                reentrantLock.unlock();
                return d;
            } else {
                Object obj2 = this.f34503a;
                this.f34503a = l84;
                un4 un4 = un4.f36206a;
                reentrantLock.unlock();
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: w0 */
    public final mn4 mo43818w0(Object obj) {
        ec1<E, un4> ec1;
        Object obj2 = this.f34503a;
        mn4 mn4 = null;
        if (!(obj2 == C5757j0.f30526a || (ec1 = this.f31049a) == null)) {
            mn4 = qv2.m63199d(ec1, obj2, (mn4) null, 2, (Object) null);
        }
        this.f34503a = obj;
        return mn4;
    }
}

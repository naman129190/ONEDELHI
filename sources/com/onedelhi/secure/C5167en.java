package com.onedelhi.secure;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8TX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/onedelhi/secure/en;", "T", "Lcom/onedelhi/secure/l0;", "", "state", "Lcom/onedelhi/secure/un4;", "k0", "K1", "()Ljava/lang/Object;", "", "Z0", "()Z", "isScopedCoroutine", "Lcom/onedelhi/secure/b90;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "Lcom/onedelhi/secure/vv0;", "eventLoop", "<init>", "(Lcom/onedelhi/secure/b90;Ljava/lang/Thread;Lcom/onedelhi/secure/vv0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.en */
public final class C5167en<T> extends C5951l0<T> {
    @ss2

    /* renamed from: a */
    public final vv0 f28012a;
    @vr2

    /* renamed from: a */
    public final Thread f28013a;

    public C5167en(@vr2 b90 b90, @vr2 Thread thread, @ss2 vv0 vv0) {
        super(b90, true, true);
        this.f28013a = thread;
        this.f28012a = vv0;
    }

    /* renamed from: K1 */
    public final T mo35512K1() {
        un4 un4;
        C6357p1 b = C6492q1.m61804b();
        if (b != null) {
            b.mo42349d();
        }
        try {
            vv0 vv0 = this.f28012a;
            m20 m20 = null;
            if (vv0 != null) {
                vv0.m68522p1(vv0, false, 1, (Object) null);
            }
            while (!Thread.interrupted()) {
                vv0 vv02 = this.f28012a;
                long A1 = vv02 == null ? Long.MAX_VALUE : vv02.mo41645A1();
                if (mo32108d()) {
                    vv0 vv03 = this.f28012a;
                    if (vv03 != null) {
                        vv0.m68521f1(vv03, false, 1, (Object) null);
                    }
                    C6357p1 b2 = C6492q1.m61804b();
                    if (b2 != null) {
                        b2.mo42353h();
                    }
                    T o = cv1.m44326o(mo32092T0());
                    if (o instanceof m20) {
                        m20 = (m20) o;
                    }
                    if (m20 == null) {
                        return o;
                    }
                    throw m20.f31975a;
                }
                C6357p1 b3 = C6492q1.m61804b();
                if (b3 == null) {
                    un4 = null;
                } else {
                    b3.mo42348c(this, A1);
                    un4 = un4.f36206a;
                }
                if (un4 == null) {
                    LockSupport.parkNanos(this, A1);
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            mo32133r0(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            C6357p1 b4 = C6492q1.m61804b();
            if (b4 != null) {
                b4.mo42353h();
            }
            throw th;
        }
    }

    /* renamed from: Z0 */
    public boolean mo32100Z0() {
        return true;
    }

    /* renamed from: k0 */
    public void mo32121k0(@ss2 Object obj) {
        un4 un4;
        if (!jt1.m53768g(Thread.currentThread(), this.f28013a)) {
            Thread thread = this.f28013a;
            C6357p1 b = C6492q1.m61804b();
            if (b == null) {
                un4 = null;
            } else {
                b.mo42352g(thread);
                un4 = un4.f36206a;
            }
            if (un4 == null) {
                LockSupport.unpark(thread);
            }
        }
    }
}

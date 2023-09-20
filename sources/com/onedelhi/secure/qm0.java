package com.onedelhi.secure;

import com.onedelhi.secure.nl3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010C\u001a\u00020B\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bD\u0010EJ\u0017\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JH\u0010'\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2%\b\b\u0010&\u001a\u001f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010#H\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0010¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\b¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\bø\u0001\u0000¢\u0006\u0004\b/\u0010\"J\u001f\u00103\u001a\u00020\r2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00028\u0000H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\u0014\u00101\u001a\u0002008\u0016X\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u001c\u0010<\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, d2 = {"Lcom/onedelhi/secure/qm0;", "T", "Lcom/onedelhi/secure/tm0;", "Lcom/onedelhi/secure/p90;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lcom/onedelhi/secure/b80;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "P", "()Ljava/lang/StackTraceElement;", "", "t", "()Z", "Lcom/onedelhi/secure/un4;", "o", "()V", "v", "Lcom/onedelhi/secure/ju;", "p", "()Lcom/onedelhi/secure/ju;", "Lcom/onedelhi/secure/iu;", "continuation", "", "B", "(Lcom/onedelhi/secure/iu;)Ljava/lang/Throwable;", "cause", "u", "(Ljava/lang/Throwable;)Z", "", "m", "()Ljava/lang/Object;", "Lcom/onedelhi/secure/nl3;", "result", "m0", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "onCancellation", "x", "(Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)V", "takenState", "e", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "z", "(Ljava/lang/Object;)Z", "A", "Lcom/onedelhi/secure/b90;", "context", "value", "q", "(Lcom/onedelhi/secure/b90;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "f", "()Lcom/onedelhi/secure/b90;", "i", "()Lcom/onedelhi/secure/p90;", "callerFrame", "g", "()Lcom/onedelhi/secure/b80;", "delegate", "r", "reusableCancellableContinuation", "Lcom/onedelhi/secure/e90;", "dispatcher", "<init>", "(Lcom/onedelhi/secure/e90;Lcom/onedelhi/secure/b80;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class qm0<T> extends tm0<T> implements p90, b80<T> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34309a = AtomicReferenceFieldUpdater.newUpdater(qm0.class, Object.class, "_reusableCancellableContinuation");
    @vr2
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;
    @rw1
    @vr2

    /* renamed from: a */
    public final b80<T> f34310a;
    @rw1
    @vr2

    /* renamed from: a */
    public final e90 f34311a;
    @rw1
    @ss2

    /* renamed from: a */
    public Object f34312a = rm0.f34682a;
    @rw1
    @vr2

    /* renamed from: b */
    public final Object f34313b = ub4.m66924b(mo31187f());

    public qm0(@vr2 e90 e90, @vr2 b80<? super T> b80) {
        super(-1);
        this.f34311a = e90;
        this.f34310a = b80;
    }

    /* renamed from: s */
    public static /* synthetic */ void m63064s() {
    }

    /* renamed from: A */
    public final void mo43668A(@vr2 Object obj) {
        b80<T> b80 = this.f34310a;
        Object obj2 = this.f34313b;
        b90 f = b80.mo31187f();
        Object c = ub4.m66925c(f, obj2);
        on4<?> g = c != ub4.f36021a ? d90.m44811g(b80, f, c) : null;
        try {
            this.f34310a.mo31191m0(obj);
            un4 un4 = un4.f36206a;
        } finally {
            uq1.m67403d(1);
            if (g == null || g.mo41920L1()) {
                ub4.m66923a(f, c);
            }
            uq1.m67402c(1);
        }
    }

    @ss2
    /* renamed from: B */
    public final Throwable mo43669B(@vr2 C5744iu<?> iuVar) {
        l84 l84;
        do {
            Object obj = this._reusableCancellableContinuation;
            l84 = rm0.f34683b;
            if (obj != l84) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(jt1.m53745C("Inconsistent state ", obj).toString());
                } else if (C5759j1.m52871a(f34309a, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!C5759j1.m52871a(f34309a, this, l84, iuVar));
        return null;
    }

    @ss2
    /* renamed from: P */
    public StackTraceElement mo35201P() {
        return null;
    }

    /* renamed from: e */
    public void mo38895e(@ss2 Object obj, @vr2 Throwable th) {
        if (obj instanceof n20) {
            ((n20) obj).f32342a.mo17094X(th);
        }
    }

    @vr2
    /* renamed from: f */
    public b90 mo31187f() {
        return this.f34310a.mo31187f();
    }

    @vr2
    /* renamed from: g */
    public b80<T> mo38896g() {
        return this;
    }

    @ss2
    /* renamed from: i */
    public p90 mo35202i() {
        b80<T> b80 = this.f34310a;
        if (b80 instanceof p90) {
            return (p90) b80;
        }
        return null;
    }

    @ss2
    /* renamed from: m */
    public Object mo38899m() {
        Object obj = this.f34312a;
        this.f34312a = rm0.f34682a;
        return obj;
    }

    /* renamed from: m0 */
    public void mo31191m0(@vr2 Object obj) {
        b90 f;
        Object c;
        b90 f2 = this.f34310a.mo31187f();
        Object d = s20.m64136d(obj, (ec1) null, 1, (Object) null);
        if (this.f34311a.mo31903S0(f2)) {
            this.f34312a = d;
            this.f35730n = 0;
            this.f34311a.mo31902Q0(f2, this);
            return;
        }
        vv0 b = wb4.f36943a.mo46668b();
        if (b.mo46381w1()) {
            this.f34312a = d;
            this.f35730n = 0;
            b.mo46376i1(this);
            return;
        }
        b.mo46378l1(true);
        try {
            f = mo31187f();
            c = ub4.m66925c(f, this.f34313b);
            this.f34310a.mo31191m0(obj);
            un4 un4 = un4.f36206a;
            ub4.m66923a(f, c);
            do {
            } while (b.mo46372B1());
        } catch (Throwable th) {
            try {
                mo45182l(th, (Throwable) null);
            } catch (Throwable th2) {
                b.mo46374c1(true);
                throw th2;
            }
        }
        b.mo46374c1(true);
    }

    /* renamed from: o */
    public final void mo43670o() {
        do {
        } while (this._reusableCancellableContinuation == rm0.f34683b);
    }

    @ss2
    /* renamed from: p */
    public final C5847ju<T> mo43671p() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = rm0.f34683b;
                return null;
            } else if (obj instanceof C5847ju) {
                if (C5759j1.m52871a(f34309a, this, obj, rm0.f34683b)) {
                    return (C5847ju) obj;
                }
            } else if (obj != rm0.f34683b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(jt1.m53745C("Inconsistent state ", obj).toString());
            }
        }
    }

    /* renamed from: q */
    public final void mo43672q(@vr2 b90 b90, T t) {
        this.f34312a = t;
        this.f35730n = 1;
        this.f34311a.mo34605R0(b90, this);
    }

    /* renamed from: r */
    public final C5847ju<?> mo43673r() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C5847ju) {
            return (C5847ju) obj;
        }
        return null;
    }

    /* renamed from: t */
    public final boolean mo43674t() {
        return this._reusableCancellableContinuation != null;
    }

    @vr2
    public String toString() {
        return "DispatchedContinuation[" + this.f34311a + ", " + if0.m52226c(this.f34310a) + ']';
    }

    /* renamed from: u */
    public final boolean mo43676u(@vr2 Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            l84 l84 = rm0.f34683b;
            if (jt1.m53768g(obj, l84)) {
                if (C5759j1.m52871a(f34309a, this, l84, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (C5759j1.m52871a(f34309a, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo43677v() {
        mo43670o();
        C5847ju<?> r = mo43673r();
        if (r != null) {
            r.mo38907u();
        }
    }

    /* renamed from: x */
    public final void mo43678x(@vr2 Object obj, @ss2 ec1<? super Throwable, un4> ec1) {
        boolean z;
        b90 f;
        Object c;
        on4<?> g;
        Object c2 = s20.m64135c(obj, ec1);
        if (this.f34311a.mo31903S0(mo31187f())) {
            this.f34312a = c2;
            this.f35730n = 1;
            this.f34311a.mo31902Q0(mo31187f(), this);
            return;
        }
        vv0 b = wb4.f36943a.mo46668b();
        if (b.mo46381w1()) {
            this.f34312a = c2;
            this.f35730n = 1;
            b.mo46376i1(this);
            return;
        }
        b.mo46378l1(true);
        try {
            ru1 ru1 = (ru1) mo31187f().get(ru1.f34751a);
            if (ru1 == null || ru1.mo32103b()) {
                z = false;
            } else {
                CancellationException h = ru1.mo32113h();
                mo38895e(c2, h);
                nl3.C6191a aVar = nl3.f32575a;
                mo31191m0(nl3.m58187b(pl3.m61423a(h)));
                z = true;
            }
            if (!z) {
                b80<T> b80 = this.f34310a;
                Object obj2 = this.f34313b;
                f = b80.mo31187f();
                c = ub4.m66925c(f, obj2);
                g = c != ub4.f36021a ? d90.m44811g(b80, f, c) : null;
                this.f34310a.mo31191m0(obj);
                un4 un4 = un4.f36206a;
                uq1.m67403d(1);
                if (g == null || g.mo41920L1()) {
                    ub4.m66923a(f, c);
                }
                uq1.m67402c(1);
            }
            do {
            } while (b.mo46372B1());
        } catch (Throwable th) {
            try {
                mo45182l(th, (Throwable) null);
            } catch (Throwable th2) {
                uq1.m67403d(1);
                b.mo46374c1(true);
                uq1.m67402c(1);
                throw th2;
            }
        }
        uq1.m67403d(1);
        b.mo46374c1(true);
        uq1.m67402c(1);
    }

    /* renamed from: z */
    public final boolean mo43679z(@ss2 Object obj) {
        ru1 ru1 = (ru1) mo31187f().get(ru1.f34751a);
        if (ru1 == null || ru1.mo32103b()) {
            return false;
        }
        CancellationException h = ru1.mo32113h();
        mo38895e(obj, h);
        nl3.C6191a aVar = nl3.f32575a;
        mo31191m0(nl3.m58187b(pl3.m61423a(h)));
        return true;
    }
}

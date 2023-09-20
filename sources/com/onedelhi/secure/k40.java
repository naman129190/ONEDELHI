package com.onedelhi.secure;

import com.onedelhi.secure.k40;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\"\u0010#J \u0010\u0006\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0014\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0018\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00018\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0014\u0010!\u001a\u00028\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0013¨\u0006$"}, d2 = {"Lcom/onedelhi/secure/k40;", "N", "", "Lkotlin/Function0;", "", "onClosedAction", "k", "(Lcom/onedelhi/secure/cc1;)Lcom/onedelhi/secure/k40;", "value", "", "m", "(Lcom/onedelhi/secure/k40;)Z", "Lcom/onedelhi/secure/un4;", "b", "()V", "j", "()Z", "l", "d", "()Lcom/onedelhi/secure/k40;", "next", "i", "isTail", "f", "prev", "g", "removed", "e", "()Ljava/lang/Object;", "nextOrClosed", "c", "leftmostAliveNode", "h", "rightmostAliveNode", "<init>", "(Lcom/onedelhi/secure/k40;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class k40<N extends k40<N>> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31098a;

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31099b;
    @vr2
    private volatile /* synthetic */ Object _next = null;
    @vr2
    private volatile /* synthetic */ Object _prev;

    static {
        Class<Object> cls = Object.class;
        Class<k40> cls2 = k40.class;
        f31098a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f31099b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
    }

    public k40(@ss2 N n) {
        this._prev = n;
    }

    /* renamed from: b */
    public final void mo39040b() {
        f31099b.lazySet(this, (Object) null);
    }

    /* renamed from: c */
    public final N mo39041c() {
        N f = mo39044f();
        while (f != null && f.mo39045g()) {
            f = (k40) f._prev;
        }
        return f;
    }

    @ss2
    /* renamed from: d */
    public final N mo39042d() {
        N a = mo39043e();
        if (a == j40.f30571a) {
            return null;
        }
        return (k40) a;
    }

    /* renamed from: e */
    public final Object mo39043e() {
        return this._next;
    }

    @ss2
    /* renamed from: f */
    public final N mo39044f() {
        return (k40) this._prev;
    }

    /* renamed from: g */
    public abstract boolean mo39045g();

    /* renamed from: h */
    public final N mo39046h() {
        N d = mo39042d();
        while (true) {
            jt1.m53774m(d);
            if (!d.mo39045g()) {
                return d;
            }
            d = d.mo39042d();
        }
    }

    /* renamed from: i */
    public final boolean mo39047i() {
        return mo39042d() == null;
    }

    /* renamed from: j */
    public final boolean mo39048j() {
        return C5759j1.m52871a(f31098a, this, (Object) null, j40.f30571a);
    }

    @ss2
    /* renamed from: k */
    public final N mo39049k(@vr2 cc1 cc1) {
        N a = mo39043e();
        if (a != j40.f30571a) {
            return (k40) a;
        }
        cc1.invoke();
        throw new b02();
    }

    /* renamed from: l */
    public final void mo39050l() {
        while (true) {
            k40 c = mo39041c();
            k40 h = mo39046h();
            h._prev = c;
            if (c != null) {
                c._next = h;
            }
            if (!h.mo39045g() && (c == null || !c.mo39045g())) {
                return;
            }
        }
    }

    /* renamed from: m */
    public final boolean mo39051m(@vr2 N n) {
        return C5759j1.m52871a(f31098a, this, (Object) null, n);
    }
}

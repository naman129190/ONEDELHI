package com.onedelhi.secure;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001:\u0005JKLMNB\u0007¢\u0006\u0004\bI\u00102J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0016\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u001a\u0010\fJ)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\f\b\u0000\u0010\u001b*\u00060\u0000j\u0002`\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\b¢\u0006\u0004\b\u001f\u0010 J4\u0010#\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!H\b¢\u0006\u0004\b#\u0010$JD\u0010%\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!2\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\b¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b'\u0010(J/\u0010+\u001a\u00020*2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010)\u001a\u00020\u0015H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0001¢\u0006\u0004\b3\u00102J\u0015\u00104\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b4\u00100J\u0017\u00106\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u000505¢\u0006\u0004\b6\u00107J.\u00108\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001b\u0018\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130!H\b¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0014¢\u0006\u0004\b:\u00100J'\u0010<\u001a\u00020\n2\n\u0010;\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010.R\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0015\u0010F\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bE\u00100R\u0015\u0010H\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bG\u00100¨\u0006O"}, d2 = {"Lcom/onedelhi/secure/l82;", "", "Lcom/onedelhi/secure/ei3;", "X0", "()Lcom/onedelhi/secure/ei3;", "Lkotlinx/coroutines/internal/Node;", "current", "J0", "(Lcom/onedelhi/secure/l82;)Lcom/onedelhi/secure/l82;", "next", "Lcom/onedelhi/secure/un4;", "K0", "(Lcom/onedelhi/secure/l82;)V", "Lcom/onedelhi/secure/wv2;", "op", "G0", "(Lcom/onedelhi/secure/wv2;)Lcom/onedelhi/secure/l82;", "node", "Lkotlin/Function0;", "", "condition", "Lcom/onedelhi/secure/l82$c;", "R0", "(Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/cc1;)Lcom/onedelhi/secure/l82$c;", "F0", "(Lcom/onedelhi/secure/l82;)Z", "A0", "T", "Lcom/onedelhi/secure/l82$b;", "H0", "(Lcom/onedelhi/secure/l82;)Lcom/onedelhi/secure/l82$b;", "B0", "(Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/cc1;)Z", "Lkotlin/Function1;", "predicate", "C0", "(Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/ec1;)Z", "D0", "(Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/ec1;Lcom/onedelhi/secure/cc1;)Z", "E0", "(Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/l82;)Z", "condAdd", "", "Y0", "(Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/l82$c;)I", "T0", "()Z", "W0", "()Lcom/onedelhi/secure/l82;", "O0", "()V", "P0", "V0", "Lcom/onedelhi/secure/l82$e;", "I0", "()Lcom/onedelhi/secure/l82$e;", "U0", "(Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "S0", "prev", "Z0", "(Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/l82;)V", "", "toString", "()Ljava/lang/String;", "Q0", "isRemoved", "L0", "()Ljava/lang/Object;", "M0", "nextNode", "N0", "prevNode", "<init>", "a", "b", "c", "d", "e", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@zs1
public class l82 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31583a;

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31584b;

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31585c;
    @vr2
    public volatile /* synthetic */ Object _next = this;
    @vr2
    public volatile /* synthetic */ Object _prev = this;
    @vr2
    private volatile /* synthetic */ Object _removedRef = null;

    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\bH\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u001c\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lcom/onedelhi/secure/l82$a;", "Lcom/onedelhi/secure/rb;", "Lcom/onedelhi/secure/wv2;", "op", "Lcom/onedelhi/secure/l82;", "Lkotlinx/coroutines/internal/Node;", "m", "affected", "", "e", "next", "", "l", "Lcom/onedelhi/secure/un4;", "f", "n", "Lcom/onedelhi/secure/l82$d;", "prepareOp", "g", "j", "k", "Lcom/onedelhi/secure/vb;", "c", "failure", "a", "h", "()Lcom/onedelhi/secure/l82;", "affectedNode", "i", "originalNext", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l82$a */
    public static abstract class C5971a extends C6656rb {
        /* renamed from: a */
        public final void mo31079a(@vr2 C7022vb<?> vbVar, @ss2 Object obj) {
            l82 i;
            boolean z = obj == null;
            l82 h = mo39704h();
            if (h != null && (i = mo39705i()) != null) {
                if (C5759j1.m52871a(l82.f31583a, h, vbVar, z ? mo39708n(h, i) : i) && z) {
                    mo39702f(h, i);
                }
            }
        }

        @ss2
        /* renamed from: c */
        public final Object mo31080c(@vr2 C7022vb<?> vbVar) {
            while (true) {
                l82 m = mo39707m(vbVar);
                if (m == null) {
                    return C6944ub.f36019b;
                }
                Object obj = m._next;
                if (obj == vbVar || vbVar.mo46063h()) {
                    return null;
                }
                if (obj instanceof wv2) {
                    wv2 wv2 = (wv2) obj;
                    if (vbVar.mo46899b(wv2)) {
                        return C6944ub.f36019b;
                    }
                    wv2.mo31082c(m);
                } else {
                    Object e = mo37728e(m);
                    if (e != null) {
                        return e;
                    }
                    if (mo39706l(m, obj)) {
                        continue;
                    } else {
                        C5974d dVar = new C5974d(m, (l82) obj, this);
                        if (C5759j1.m52871a(l82.f31583a, m, obj, dVar)) {
                            try {
                                if (dVar.mo31082c(m) != m82.f32053a) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                C5759j1.m52871a(l82.f31583a, m, dVar, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @ss2
        /* renamed from: e */
        public Object mo37728e(@vr2 l82 l82) {
            return null;
        }

        /* renamed from: f */
        public abstract void mo39702f(@vr2 l82 l82, @vr2 l82 l822);

        /* renamed from: g */
        public abstract void mo39703g(@vr2 C5974d dVar);

        @ss2
        /* renamed from: h */
        public abstract l82 mo39704h();

        @ss2
        /* renamed from: i */
        public abstract l82 mo39705i();

        @ss2
        /* renamed from: j */
        public Object mo37729j(@vr2 C5974d dVar) {
            mo39703g(dVar);
            return null;
        }

        /* renamed from: k */
        public void mo37730k(@vr2 l82 l82) {
        }

        /* renamed from: l */
        public boolean mo39706l(@vr2 l82 l82, @vr2 Object obj) {
            return false;
        }

        @ss2
        /* renamed from: m */
        public l82 mo39707m(@vr2 wv2 wv2) {
            l82 h = mo39704h();
            jt1.m53774m(h);
            return h;
        }

        @vr2
        /* renamed from: n */
        public abstract Object mo39708n(@vr2 l82 l82, @vr2 l82 l822);
    }

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u001d\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010\u0017J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00112\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00060\u0001j\u0002`\u00028DX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006 "}, d2 = {"Lcom/onedelhi/secure/l82$b;", "Lcom/onedelhi/secure/l82;", "Lkotlinx/coroutines/internal/Node;", "T", "Lcom/onedelhi/secure/l82$a;", "Lcom/onedelhi/secure/wv2;", "op", "m", "(Lcom/onedelhi/secure/wv2;)Lcom/onedelhi/secure/l82;", "affected", "", "next", "", "l", "(Lcom/onedelhi/secure/l82;Ljava/lang/Object;)Z", "Lcom/onedelhi/secure/l82$d;", "prepareOp", "Lcom/onedelhi/secure/un4;", "g", "(Lcom/onedelhi/secure/l82$d;)V", "n", "(Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/l82;)Ljava/lang/Object;", "f", "(Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/l82;)V", "h", "()Lcom/onedelhi/secure/l82;", "affectedNode", "i", "originalNext", "queue", "node", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l82$b */
    public static class C5972b<T extends l82> extends C5971a {

        /* renamed from: a */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f31586a = AtomicReferenceFieldUpdater.newUpdater(C5972b.class, Object.class, "_affectedNode");
        @vr2
        private volatile /* synthetic */ Object _affectedNode = null;
        @rw1
        @vr2

        /* renamed from: a */
        public final l82 f31587a;
        @rw1
        @vr2

        /* renamed from: b */
        public final T f31588b;

        public C5972b(@vr2 l82 l82, @vr2 T t) {
            this.f31587a = l82;
            this.f31588b = t;
        }

        /* renamed from: f */
        public void mo39702f(@vr2 l82 l82, @vr2 l82 l822) {
            this.f31588b.mo39689K0(this.f31587a);
        }

        /* renamed from: g */
        public void mo39703g(@vr2 C5974d dVar) {
            C5759j1.m52871a(f31586a, this, (Object) null, dVar.f31592a);
        }

        @ss2
        /* renamed from: h */
        public final l82 mo39704h() {
            return (l82) this._affectedNode;
        }

        @vr2
        /* renamed from: i */
        public final l82 mo39705i() {
            return this.f31587a;
        }

        /* renamed from: l */
        public boolean mo39706l(@vr2 l82 l82, @vr2 Object obj) {
            return obj != this.f31587a;
        }

        @ss2
        /* renamed from: m */
        public final l82 mo39707m(@vr2 wv2 wv2) {
            return this.f31587a.mo39685G0(wv2);
        }

        @vr2
        /* renamed from: n */
        public Object mo39708n(@vr2 l82 l82, @vr2 l82 l822) {
            T t = this.f31588b;
            C5759j1.m52871a(l82.f31584b, t, t, l82);
            T t2 = this.f31588b;
            C5759j1.m52871a(l82.f31583a, t2, t2, this.f31587a);
            return this.f31588b;
        }
    }

    @z73
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\t\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/l82$c;", "Lcom/onedelhi/secure/vb;", "Lcom/onedelhi/secure/l82;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "Lcom/onedelhi/secure/un4;", "j", "newNode", "<init>", "(Lcom/onedelhi/secure/l82;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l82$c */
    public static abstract class C5973c extends C7022vb<l82> {
        @rw1
        @vr2

        /* renamed from: a */
        public final l82 f31589a;
        @rw1
        @ss2

        /* renamed from: b */
        public l82 f31590b;

        public C5973c(@vr2 l82 l82) {
            this.f31589a = l82;
        }

        /* renamed from: j */
        public void mo31083d(@vr2 l82 l82, @ss2 Object obj) {
            boolean z = obj == null;
            l82 l822 = z ? this.f31589a : this.f31590b;
            if (l822 != null && C5759j1.m52871a(l82.f31583a, l82, this, l822) && z) {
                l82 l823 = this.f31589a;
                l82 l824 = this.f31590b;
                jt1.m53774m(l824);
                l823.mo39689K0(l824);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u00060\rj\u0002`\u000e\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/l82$d;", "Lcom/onedelhi/secure/wv2;", "", "affected", "c", "Lcom/onedelhi/secure/un4;", "d", "", "toString", "Lcom/onedelhi/secure/vb;", "a", "()Lcom/onedelhi/secure/vb;", "atomicOp", "Lcom/onedelhi/secure/l82;", "Lkotlinx/coroutines/internal/Node;", "next", "Lcom/onedelhi/secure/l82$a;", "desc", "<init>", "(Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/l82$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l82$d */
    public static final class C5974d extends wv2 {
        @rw1
        @vr2

        /* renamed from: a */
        public final C5971a f31591a;
        @rw1
        @vr2

        /* renamed from: a */
        public final l82 f31592a;
        @rw1
        @vr2

        /* renamed from: b */
        public final l82 f31593b;

        public C5974d(@vr2 l82 l82, @vr2 l82 l822, @vr2 C5971a aVar) {
            this.f31592a = l82;
            this.f31593b = l822;
            this.f31591a = aVar;
        }

        @vr2
        /* renamed from: a */
        public C7022vb<?> mo31081a() {
            return this.f31591a.mo43833b();
        }

        @ss2
        /* renamed from: c */
        public Object mo31082c(@ss2 Object obj) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            l82 l82 = (l82) obj;
            Object j = this.f31591a.mo37729j(this);
            Object obj2 = m82.f32053a;
            if (j == obj2) {
                l82 l822 = this.f31593b;
                if (C5759j1.m52871a(l82.f31583a, l82, this, l822.mo39699X0())) {
                    this.f31591a.mo37730k(l82);
                    l82 unused = l822.mo39685G0((wv2) null);
                }
                return obj2;
            }
            Object e = j != null ? mo31081a().mo46061e(j) : mo31081a().mo46062f();
            C5759j1.m52871a(l82.f31583a, l82, this, e == C6944ub.f36018a ? mo31081a() : e == null ? this.f31591a.mo39708n(l82, this.f31593b) : this.f31593b);
            return null;
        }

        /* renamed from: d */
        public final void mo39710d() {
            this.f31591a.mo39703g(this);
        }

        @vr2
        public String toString() {
            return "PrepareOp(op=" + mo31081a() + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010$\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\r\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006'"}, d2 = {"Lcom/onedelhi/secure/l82$e;", "T", "Lcom/onedelhi/secure/l82$a;", "Lcom/onedelhi/secure/wv2;", "op", "Lcom/onedelhi/secure/l82;", "Lkotlinx/coroutines/internal/Node;", "m", "(Lcom/onedelhi/secure/wv2;)Lcom/onedelhi/secure/l82;", "affected", "", "e", "(Lcom/onedelhi/secure/l82;)Ljava/lang/Object;", "next", "", "l", "(Lcom/onedelhi/secure/l82;Ljava/lang/Object;)Z", "Lcom/onedelhi/secure/l82$d;", "prepareOp", "Lcom/onedelhi/secure/un4;", "g", "(Lcom/onedelhi/secure/l82$d;)V", "n", "(Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/l82;)Ljava/lang/Object;", "f", "(Lcom/onedelhi/secure/l82;Lcom/onedelhi/secure/l82;)V", "o", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "h", "()Lcom/onedelhi/secure/l82;", "affectedNode", "i", "originalNext", "queue", "<init>", "(Lcom/onedelhi/secure/l82;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l82$e */
    public static class C5975e<T> extends C5971a {

        /* renamed from: a */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f31594a;

        /* renamed from: b */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f31595b;
        @vr2
        private volatile /* synthetic */ Object _affectedNode = null;
        @vr2
        private volatile /* synthetic */ Object _originalNext = null;
        @rw1
        @vr2

        /* renamed from: a */
        public final l82 f31596a;

        static {
            Class<Object> cls = Object.class;
            Class<C5975e> cls2 = C5975e.class;
            f31594a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_affectedNode");
            f31595b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_originalNext");
        }

        public C5975e(@vr2 l82 l82) {
            this.f31596a = l82;
        }

        /* renamed from: p */
        public static /* synthetic */ void m55373p() {
        }

        @ss2
        /* renamed from: e */
        public Object mo37728e(@vr2 l82 l82) {
            if (l82 == this.f31596a) {
                return k82.m54103d();
            }
            return null;
        }

        /* renamed from: f */
        public final void mo39702f(@vr2 l82 l82, @vr2 l82 l822) {
            l82 unused = l822.mo39685G0((wv2) null);
        }

        /* renamed from: g */
        public void mo39703g(@vr2 C5974d dVar) {
            C5759j1.m52871a(f31594a, this, (Object) null, dVar.f31592a);
            C5759j1.m52871a(f31595b, this, (Object) null, dVar.f31593b);
        }

        @ss2
        /* renamed from: h */
        public final l82 mo39704h() {
            return (l82) this._affectedNode;
        }

        @ss2
        /* renamed from: i */
        public final l82 mo39705i() {
            return (l82) this._originalNext;
        }

        /* renamed from: l */
        public final boolean mo39706l(@vr2 l82 l82, @vr2 Object obj) {
            if (!(obj instanceof ei3)) {
                return false;
            }
            ((ei3) obj).f27950a.mo39694P0();
            return true;
        }

        @ss2
        /* renamed from: m */
        public final l82 mo39707m(@vr2 wv2 wv2) {
            l82 l82 = this.f31596a;
            while (true) {
                Object obj = l82._next;
                if (!(obj instanceof wv2)) {
                    return (l82) obj;
                }
                wv2 wv22 = (wv2) obj;
                if (wv2.mo46899b(wv22)) {
                    return null;
                }
                wv22.mo31082c(this.f31596a);
            }
        }

        @vr2
        /* renamed from: n */
        public final Object mo39708n(@vr2 l82 l82, @vr2 l82 l822) {
            return l822.mo39699X0();
        }

        /* renamed from: o */
        public final T mo39711o() {
            T h = mo39704h();
            jt1.m53774m(h);
            return h;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/onedelhi/secure/l82$f", "Lcom/onedelhi/secure/l82$c;", "Lcom/onedelhi/secure/l82;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.l82$f */
    public static final class C5976f extends C5973c {

        /* renamed from: a */
        public final /* synthetic */ cc1<Boolean> f31597a;

        /* renamed from: c */
        public final /* synthetic */ l82 f31598c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5976f(l82 l82, cc1<Boolean> cc1) {
            super(l82);
            this.f31598c = l82;
            this.f31597a = cc1;
        }

        @ss2
        /* renamed from: k */
        public Object mo31084i(@vr2 l82 l82) {
            if (this.f31597a.invoke().booleanValue()) {
                return null;
            }
            return k82.m54100a();
        }
    }

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.l82$g */
    public /* synthetic */ class C5977g extends c63 {
        public C5977g(Object obj) {
            super(obj, if0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        @ss2
        public Object get() {
            return if0.m52224a(this.f36657a);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<l82> cls2 = l82.class;
        f31583a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f31584b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f31585c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: A0 */
    public final void mo39679A0(@vr2 l82 l82) {
        do {
        } while (!mo39692N0().mo39683E0(l82, this));
    }

    /* renamed from: B0 */
    public final boolean mo39680B0(@vr2 l82 l82, @vr2 cc1<Boolean> cc1) {
        int Y0;
        C5976f fVar = new C5976f(l82, cc1);
        do {
            Y0 = mo39692N0().mo39700Y0(l82, this, fVar);
            if (Y0 == 1) {
                return true;
            }
        } while (Y0 != 2);
        return false;
    }

    /* renamed from: C0 */
    public final boolean mo39681C0(@vr2 l82 l82, @vr2 ec1<? super l82, Boolean> ec1) {
        l82 N0;
        do {
            N0 = mo39692N0();
            if (!ec1.mo17094X(N0).booleanValue()) {
                return false;
            }
        } while (!N0.mo39683E0(l82, this));
        return true;
    }

    /* renamed from: D0 */
    public final boolean mo39682D0(@vr2 l82 l82, @vr2 ec1<? super l82, Boolean> ec1, @vr2 cc1<Boolean> cc1) {
        int Y0;
        C5976f fVar = new C5976f(l82, cc1);
        do {
            l82 N0 = mo39692N0();
            if (!ec1.mo17094X(N0).booleanValue()) {
                return false;
            }
            Y0 = N0.mo39700Y0(l82, this, fVar);
            if (Y0 == 1) {
                return true;
            }
        } while (Y0 != 2);
        return false;
    }

    @z73
    /* renamed from: E0 */
    public final boolean mo39683E0(@vr2 l82 l82, @vr2 l82 l822) {
        f31584b.lazySet(l82, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31583a;
        atomicReferenceFieldUpdater.lazySet(l82, l822);
        if (!C5759j1.m52871a(atomicReferenceFieldUpdater, this, l822, l82)) {
            return false;
        }
        l82.mo39689K0(l822);
        return true;
    }

    /* renamed from: F0 */
    public final boolean mo39684F0(@vr2 l82 l82) {
        f31584b.lazySet(l82, this);
        f31583a.lazySet(l82, this);
        while (mo39690L0() == this) {
            if (C5759j1.m52871a(f31583a, this, this, l82)) {
                l82.mo39689K0(this);
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.onedelhi.secure.wv2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.onedelhi.secure.l82} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (com.onedelhi.secure.C5759j1.m52871a(f31583a, r3, r2, ((com.onedelhi.secure.ei3) r4).f27950a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.l82 mo39685G0(com.onedelhi.secure.wv2 r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            com.onedelhi.secure.l82 r0 = (com.onedelhi.secure.l82) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f31584b
            boolean r0 = com.onedelhi.secure.C5759j1.m52871a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.mo38447Q0()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof com.onedelhi.secure.wv2
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            com.onedelhi.secure.wv2 r0 = (com.onedelhi.secure.wv2) r0
            boolean r0 = r8.mo46899b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            com.onedelhi.secure.wv2 r4 = (com.onedelhi.secure.wv2) r4
            r4.mo31082c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof com.onedelhi.secure.ei3
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f31583a
            com.onedelhi.secure.ei3 r4 = (com.onedelhi.secure.ei3) r4
            com.onedelhi.secure.l82 r4 = r4.f27950a
            boolean r2 = com.onedelhi.secure.C5759j1.m52871a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            com.onedelhi.secure.l82 r2 = (com.onedelhi.secure.l82) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            com.onedelhi.secure.l82 r3 = (com.onedelhi.secure.l82) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.l82.mo39685G0(com.onedelhi.secure.wv2):com.onedelhi.secure.l82");
    }

    @vr2
    /* renamed from: H0 */
    public final <T extends l82> C5972b<T> mo39686H0(@vr2 T t) {
        return new C5972b<>(this, t);
    }

    @vr2
    /* renamed from: I0 */
    public final C5975e<l82> mo39687I0() {
        return new C5975e<>(this);
    }

    /* renamed from: J0 */
    public final l82 mo39688J0(l82 l82) {
        while (l82.mo38447Q0()) {
            l82 = (l82) l82._prev;
        }
        return l82;
    }

    /* renamed from: K0 */
    public final void mo39689K0(l82 l82) {
        l82 l822;
        do {
            l822 = (l82) l82._prev;
            if (mo39690L0() != l82) {
                return;
            }
        } while (!C5759j1.m52871a(f31584b, l82, l822, this));
        if (mo38447Q0()) {
            l82.mo39685G0((wv2) null);
        }
    }

    @vr2
    /* renamed from: L0 */
    public final Object mo39690L0() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof wv2)) {
                return obj;
            }
            ((wv2) obj).mo31082c(this);
        }
    }

    @vr2
    /* renamed from: M0 */
    public final l82 mo39691M0() {
        return k82.m54107h(mo39690L0());
    }

    @vr2
    /* renamed from: N0 */
    public final l82 mo39692N0() {
        l82 G0 = mo39685G0((wv2) null);
        return G0 == null ? mo39688J0((l82) this._prev) : G0;
    }

    /* renamed from: O0 */
    public final void mo39693O0() {
        ((ei3) mo39690L0()).f27950a.mo39694P0();
    }

    @z73
    /* renamed from: P0 */
    public final void mo39694P0() {
        l82 l82 = this;
        while (true) {
            Object L0 = l82.mo39690L0();
            if (!(L0 instanceof ei3)) {
                l82.mo39685G0((wv2) null);
                return;
            }
            l82 = ((ei3) L0).f27950a;
        }
    }

    /* renamed from: Q0 */
    public boolean mo38447Q0() {
        return mo39690L0() instanceof ei3;
    }

    @vr2
    @z73
    /* renamed from: R0 */
    public final C5973c mo39695R0(@vr2 l82 l82, @vr2 cc1<Boolean> cc1) {
        return new C5976f(l82, cc1);
    }

    @ss2
    /* renamed from: S0 */
    public l82 mo38448S0() {
        Object L0 = mo39690L0();
        ei3 ei3 = L0 instanceof ei3 ? (ei3) L0 : null;
        if (ei3 == null) {
            return null;
        }
        return ei3.f27950a;
    }

    /* renamed from: T0 */
    public boolean mo38449T0() {
        return mo39698W0() == null;
    }

    /* renamed from: U0 */
    public final /* synthetic */ <T> T mo39696U0(ec1<? super T, Boolean> ec1) {
        l82 W0;
        while (true) {
            T t = (l82) mo39690L0();
            if (t == this) {
                return null;
            }
            jt1.m53786y(3, mx0.f16794s2);
            if (!(t instanceof Object)) {
                return null;
            }
            if ((ec1.mo17094X(t).booleanValue() && !t.mo38447Q0()) || (W0 = t.mo39698W0()) == null) {
                return t;
            }
            W0.mo39694P0();
        }
    }

    @ss2
    /* renamed from: V0 */
    public final l82 mo39697V0() {
        while (true) {
            l82 l82 = (l82) mo39690L0();
            if (l82 == this) {
                return null;
            }
            if (l82.mo38449T0()) {
                return l82;
            }
            l82.mo39693O0();
        }
    }

    @ss2
    @z73
    /* renamed from: W0 */
    public final l82 mo39698W0() {
        Object L0;
        l82 l82;
        do {
            L0 = mo39690L0();
            if (L0 instanceof ei3) {
                return ((ei3) L0).f27950a;
            }
            if (L0 == this) {
                return (l82) L0;
            }
            l82 = (l82) L0;
        } while (!C5759j1.m52871a(f31583a, this, L0, l82.mo39699X0()));
        l82.mo39685G0((wv2) null);
        return null;
    }

    /* renamed from: X0 */
    public final ei3 mo39699X0() {
        ei3 ei3 = (ei3) this._removedRef;
        if (ei3 != null) {
            return ei3;
        }
        ei3 ei32 = new ei3(this);
        f31585c.lazySet(this, ei32);
        return ei32;
    }

    @z73
    /* renamed from: Y0 */
    public final int mo39700Y0(@vr2 l82 l82, @vr2 l82 l822, @vr2 C5973c cVar) {
        f31584b.lazySet(l82, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31583a;
        atomicReferenceFieldUpdater.lazySet(l82, l822);
        cVar.f31590b = l822;
        if (!C5759j1.m52871a(atomicReferenceFieldUpdater, this, l822, cVar)) {
            return 0;
        }
        return cVar.mo31082c(this) == null ? 1 : 2;
    }

    /* renamed from: Z0 */
    public final void mo39701Z0(@vr2 l82 l82, @vr2 l82 l822) {
    }

    @vr2
    public String toString() {
        return new C5977g(this) + '@' + if0.m52225b(this);
    }
}

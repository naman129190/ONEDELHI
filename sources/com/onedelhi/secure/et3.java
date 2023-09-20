package com.onedelhi.secure;

import com.onedelhi.secure.dt3;
import com.onedelhi.secure.l82;
import com.onedelhi.secure.nl3;
import com.onedelhi.secure.ru1;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@z73
@Metadata(bv = {}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004XYZ[B\u0015\u0012\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bV\u0010WJ\u0017\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u0004\u0018\u00010\u00152\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J5\u0010/\u001a\u00020\u000e*\u00020,2\u001c\u0010.\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150-H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100JG\u00104\u001a\u00020\u000e\"\u0004\b\u0001\u00101*\b\u0012\u0004\u0012\u00028\u0001022\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001503H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105J[\u00108\u001a\u00020\u000e\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u00101*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002062\u0006\u00107\u001a\u00028\u00012\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001503H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109J8\u0010<\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020:2\u001c\u0010.\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150-H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=J.\u0010@\u001a\u00020\u000e2\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150>2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0>H\b¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000eH\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000eH\u0002¢\u0006\u0004\bD\u0010CR\u001c\u0010G\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078VX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8VX\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010 R(\u0010T\u001a\u0004\u0018\u00010\u001a2\b\u0010?\u001a\u0004\u0018\u00010\u001a8B@BX\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010\u001d\u0002\u0004\n\u0002\b\u0019¨\u0006\\"}, d2 = {"Lcom/onedelhi/secure/et3;", "R", "Lcom/onedelhi/secure/j82;", "Lcom/onedelhi/secure/dt3;", "Lcom/onedelhi/secure/it3;", "Lcom/onedelhi/secure/b80;", "Lcom/onedelhi/secure/p90;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "P", "()Ljava/lang/StackTraceElement;", "Lcom/onedelhi/secure/nl3;", "result", "Lcom/onedelhi/secure/un4;", "m0", "(Ljava/lang/Object;)V", "", "exception", "q", "(Ljava/lang/Throwable;)V", "", "i1", "()Ljava/lang/Object;", "e", "j1", "Lcom/onedelhi/secure/fn0;", "handle", "F", "(Lcom/onedelhi/secure/fn0;)V", "", "D", "()Z", "Lcom/onedelhi/secure/l82$d;", "otherOp", "d0", "(Lcom/onedelhi/secure/l82$d;)Ljava/lang/Object;", "Lcom/onedelhi/secure/rb;", "desc", "C", "(Lcom/onedelhi/secure/rb;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lcom/onedelhi/secure/ft3;", "Lkotlin/Function1;", "block", "L", "(Lcom/onedelhi/secure/ft3;Lcom/onedelhi/secure/ec1;)V", "Q", "Lcom/onedelhi/secure/gt3;", "Lkotlin/Function2;", "b0", "(Lcom/onedelhi/secure/gt3;Lcom/onedelhi/secure/sc1;)V", "Lcom/onedelhi/secure/ht3;", "param", "z", "(Lcom/onedelhi/secure/ht3;Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)V", "", "timeMillis", "A", "(JLcom/onedelhi/secure/ec1;)V", "Lkotlin/Function0;", "value", "g1", "(Lcom/onedelhi/secure/cc1;Lcom/onedelhi/secure/cc1;)V", "T", "()V", "f1", "i", "()Lcom/onedelhi/secure/p90;", "callerFrame", "Lcom/onedelhi/secure/b90;", "f", "()Lcom/onedelhi/secure/b90;", "context", "k0", "()Lcom/onedelhi/secure/b80;", "completion", "l", "isSelected", "h1", "()Lcom/onedelhi/secure/fn0;", "k1", "parentHandle", "uCont", "<init>", "(Lcom/onedelhi/secure/b80;)V", "a", "b", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class et3<R> extends j82 implements dt3<R>, it3<R>, b80<R>, p90 {

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28078d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28079e;
    @vr2
    private volatile /* synthetic */ Object _parentHandle = null;
    @vr2
    private volatile /* synthetic */ Object _result = kt3.f31427c;
    @vr2
    public volatile /* synthetic */ Object _state = kt3.m54918f();
    @vr2

    /* renamed from: a */
    public final b80<R> f28080a;

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/et3$a;", "Lcom/onedelhi/secure/vb;", "", "affected", "i", "failure", "Lcom/onedelhi/secure/un4;", "d", "", "toString", "k", "l", "j", "", "opSequence", "J", "g", "()J", "Lcom/onedelhi/secure/et3;", "impl", "Lcom/onedelhi/secure/rb;", "desc", "<init>", "(Lcom/onedelhi/secure/et3;Lcom/onedelhi/secure/rb;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.et3$a */
    public static final class C5191a extends C7022vb<Object> {

        /* renamed from: a */
        public final long f28081a = kt3.f31424a.mo47937a();
        @rw1
        @vr2

        /* renamed from: a */
        public final et3<?> f28082a;
        @rw1
        @vr2

        /* renamed from: a */
        public final C6656rb f28083a;

        public C5191a(@vr2 et3<?> et3, @vr2 C6656rb rbVar) {
            this.f28082a = et3;
            this.f28083a = rbVar;
            rbVar.mo43834d(this);
        }

        /* renamed from: d */
        public void mo31083d(@ss2 Object obj, @ss2 Object obj2) {
            mo35608j(obj2);
            this.f28083a.mo31079a(this, obj2);
        }

        /* renamed from: g */
        public long mo35607g() {
            return this.f28081a;
        }

        @ss2
        /* renamed from: i */
        public Object mo31084i(@ss2 Object obj) {
            Object k;
            if (obj == null && (k = mo35609k()) != null) {
                return k;
            }
            try {
                return this.f28083a.mo31080c(this);
            } catch (Throwable th) {
                if (obj == null) {
                    mo35610l();
                }
                throw th;
            }
        }

        /* renamed from: j */
        public final void mo35608j(Object obj) {
            boolean z = obj == null;
            if (C5759j1.m52871a(et3.f28078d, this.f28082a, this, z ? null : kt3.m54918f()) && z) {
                this.f28082a.mo35598f1();
            }
        }

        /* renamed from: k */
        public final Object mo35609k() {
            et3<?> et3 = this.f28082a;
            while (true) {
                Object obj = et3._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof wv2) {
                    ((wv2) obj).mo31082c(this.f28082a);
                } else if (obj != kt3.m54918f()) {
                    return kt3.m54916d();
                } else {
                    if (C5759j1.m52871a(et3.f28078d, this.f28082a, kt3.m54918f(), this)) {
                        return null;
                    }
                }
            }
        }

        /* renamed from: l */
        public final void mo35610l() {
            C5759j1.m52871a(et3.f28078d, this.f28082a, this, kt3.m54918f());
        }

        @vr2
        public String toString() {
            return "AtomicSelectOp(sequence=" + mo35607g() + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/et3$b;", "Lcom/onedelhi/secure/l82;", "Lcom/onedelhi/secure/fn0;", "handle", "<init>", "(Lcom/onedelhi/secure/fn0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.et3$b */
    public static final class C5192b extends l82 {
        @rw1
        @vr2

        /* renamed from: a */
        public final fn0 f28084a;

        public C5192b(@vr2 fn0 fn0) {
            this.f28084a = fn0;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/et3$c;", "Lcom/onedelhi/secure/wv2;", "", "affected", "c", "Lcom/onedelhi/secure/vb;", "a", "()Lcom/onedelhi/secure/vb;", "atomicOp", "Lcom/onedelhi/secure/l82$d;", "otherOp", "<init>", "(Lcom/onedelhi/secure/l82$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.et3$c */
    public static final class C5193c extends wv2 {
        @rw1
        @vr2

        /* renamed from: a */
        public final l82.C5974d f28085a;

        public C5193c(@vr2 l82.C5974d dVar) {
            this.f28085a = dVar;
        }

        @vr2
        /* renamed from: a */
        public C7022vb<?> mo31081a() {
            return this.f28085a.mo31081a();
        }

        @ss2
        /* renamed from: c */
        public Object mo31082c(@ss2 Object obj) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
            et3 et3 = (et3) obj;
            this.f28085a.mo39710d();
            Object e = this.f28085a.mo31081a().mo46061e((Object) null);
            C5759j1.m52871a(et3.f28078d, et3, this, e == null ? this.f28085a.f31591a : kt3.m54918f());
            return e;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/et3$d;", "Lcom/onedelhi/secure/tu1;", "", "cause", "Lcom/onedelhi/secure/un4;", "a1", "<init>", "(Lcom/onedelhi/secure/et3;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.et3$d */
    public final class C5194d extends tu1 {
        public C5194d() {
        }

        /* renamed from: X */
        public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
            mo32031a1((Throwable) obj);
            return un4.f36206a;
        }

        /* renamed from: a1 */
        public void mo32031a1(@ss2 Throwable th) {
            if (et3.this.mo35594D()) {
                et3.this.mo35606q(mo31212b1().mo32113h());
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onedelhi/secure/un4;", "run", "()V", "com/onedelhi/secure/mo3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.et3$e */
    public static final class C5195e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ec1 f28087a;

        /* renamed from: a */
        public final /* synthetic */ et3 f28088a;

        public C5195e(et3 et3, ec1 ec1) {
            this.f28088a = et3;
            this.f28087a = ec1;
        }

        public final void run() {
            if (this.f28088a.mo35594D()) {
                C6303ou.m59636d(this.f28087a, this.f28088a.mo35603k0());
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<et3> cls2 = et3.class;
        f28078d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        f28079e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_result");
    }

    public et3(@vr2 b80<? super R> b80) {
        this.f28080a = b80;
    }

    /* renamed from: A */
    public void mo34627A(long j, @vr2 ec1<? super b80<? super R>, ? extends Object> ec1) {
        if (j > 0) {
            mo35595F(fi0.m47886d(mo31187f()).mo31901M0(j, new C5195e(this, ec1), mo31187f()));
        } else if (mo35594D()) {
            pn4.m61464c(ec1, mo35603k0());
        }
    }

    @ss2
    /* renamed from: C */
    public Object mo35593C(@vr2 C6656rb rbVar) {
        return new C5191a(this, rbVar).mo31082c((Object) null);
    }

    /* renamed from: D */
    public boolean mo35594D() {
        Object d0 = mo35597d0((l82.C5974d) null);
        if (d0 == C5937ku.f31431a) {
            return true;
        }
        if (d0 == null) {
            return false;
        }
        throw new IllegalStateException(jt1.m53745C("Unexpected trySelectIdempotent result ", d0).toString());
    }

    /* renamed from: F */
    public void mo35595F(@vr2 fn0 fn0) {
        C5192b bVar = new C5192b(fn0);
        if (!mo35605l()) {
            mo39679A0(bVar);
            if (!mo35605l()) {
                return;
            }
        }
        fn0.mo30964e();
    }

    /* renamed from: L */
    public void mo34628L(@vr2 ft3 ft3, @vr2 ec1<? super b80<? super R>, ? extends Object> ec1) {
        ft3.mo32135s(this, ec1);
    }

    @ss2
    /* renamed from: P */
    public StackTraceElement mo35201P() {
        return null;
    }

    /* renamed from: T */
    public final void mo35596T() {
        ru1 ru1 = (ru1) mo31187f().get(ru1.f34751a);
        if (ru1 != null) {
            fn0 f = ru1.C6713a.m63860f(ru1, true, false, new C5194d(), 2, (Object) null);
            mo35604k1(f);
            if (mo35605l()) {
                f.mo30964e();
            }
        }
    }

    /* renamed from: b0 */
    public <Q> void mo34629b0(@vr2 gt3<? extends Q> gt3, @vr2 sc1<? super Q, ? super b80<? super R>, ? extends Object> sc1) {
        gt3.mo30932o(this, sc1);
    }

    /* renamed from: c */
    public <P, Q> void mo34630c(@vr2 ht3<? super P, ? extends Q> ht3, @vr2 sc1<? super Q, ? super b80<? super R>, ? extends Object> sc1) {
        dt3.C5056a.m45544a(this, ht3, sc1);
    }

    @ss2
    /* renamed from: d0 */
    public Object mo35597d0(@ss2 l82.C5974d dVar) {
        while (true) {
            Object obj = this._state;
            if (obj == kt3.m54918f()) {
                if (dVar == null) {
                    if (C5759j1.m52871a(f28078d, this, kt3.m54918f(), (Object) null)) {
                        break;
                    }
                } else {
                    C5193c cVar = new C5193c(dVar);
                    if (C5759j1.m52871a(f28078d, this, kt3.m54918f(), cVar)) {
                        Object c = cVar.mo31082c(this);
                        if (c != null) {
                            return c;
                        }
                    }
                }
            } else if (obj instanceof wv2) {
                if (dVar != null) {
                    C7022vb<?> a = dVar.mo31081a();
                    if ((a instanceof C5191a) && ((C5191a) a).f28082a == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    } else if (a.mo46899b((wv2) obj)) {
                        return C6944ub.f36019b;
                    }
                }
                ((wv2) obj).mo31082c(this);
            } else if (dVar != null && obj == dVar.f31591a) {
                return C5937ku.f31431a;
            } else {
                return null;
            }
        }
        mo35598f1();
        return C5937ku.f31431a;
    }

    @vr2
    /* renamed from: f */
    public b90 mo31187f() {
        return this.f28080a.mo31187f();
    }

    /* renamed from: f1 */
    public final void mo35598f1() {
        fn0 h1 = mo35600h1();
        if (h1 != null) {
            h1.mo30964e();
        }
        for (l82 l82 = (l82) mo39690L0(); !jt1.m53768g(l82, this); l82 = l82.mo39691M0()) {
            if (l82 instanceof C5192b) {
                ((C5192b) l82).f28084a.mo30964e();
            }
        }
    }

    /* renamed from: g1 */
    public final void mo35599g1(cc1<? extends Object> cc1, cc1<un4> cc12) {
        while (true) {
            Object obj = this._result;
            if (obj == kt3.f31427c) {
                if (C5759j1.m52871a(f28079e, this, kt3.f31427c, cc1.invoke())) {
                    return;
                }
            } else if (obj != mt1.m57558h()) {
                throw new IllegalStateException("Already resumed");
            } else if (C5759j1.m52871a(f28079e, this, mt1.m57558h(), kt3.f31428d)) {
                cc12.invoke();
                return;
            }
        }
    }

    /* renamed from: h1 */
    public final fn0 mo35600h1() {
        return (fn0) this._parentHandle;
    }

    @ss2
    /* renamed from: i */
    public p90 mo35202i() {
        b80<R> b80 = this.f28080a;
        if (b80 instanceof p90) {
            return (p90) b80;
        }
        return null;
    }

    @ss2
    @z73
    /* renamed from: i1 */
    public final Object mo35601i1() {
        if (!mo35605l()) {
            mo35596T();
        }
        Object obj = this._result;
        if (obj == kt3.f31427c) {
            if (C5759j1.m52871a(f28079e, this, kt3.f31427c, mt1.m57558h())) {
                return mt1.m57558h();
            }
            obj = this._result;
        }
        if (obj == kt3.f31428d) {
            throw new IllegalStateException("Already resumed");
        } else if (!(obj instanceof m20)) {
            return obj;
        } else {
            throw ((m20) obj).f31975a;
        }
    }

    @z73
    /* renamed from: j1 */
    public final void mo35602j1(@vr2 Throwable th) {
        if (mo35594D()) {
            nl3.C6191a aVar = nl3.f32575a;
            mo31191m0(nl3.m58187b(pl3.m61423a(th)));
        } else if (!(th instanceof CancellationException)) {
            Object i1 = mo35601i1();
            if (!(i1 instanceof m20) || ((m20) i1).f31975a != th) {
                h90.m50304b(mo31187f(), th);
            }
        }
    }

    @vr2
    /* renamed from: k0 */
    public b80<R> mo35603k0() {
        return this;
    }

    /* renamed from: k1 */
    public final void mo35604k1(fn0 fn0) {
        this._parentHandle = fn0;
    }

    /* renamed from: l */
    public boolean mo35605l() {
        while (true) {
            Object obj = this._state;
            if (obj == kt3.m54918f()) {
                return false;
            }
            if (!(obj instanceof wv2)) {
                return true;
            }
            ((wv2) obj).mo31082c(this);
        }
    }

    /* renamed from: m0 */
    public void mo31191m0(@vr2 Object obj) {
        b80<R> b80;
        while (true) {
            Object obj2 = this._result;
            if (obj2 == kt3.f31427c) {
                if (C5759j1.m52871a(f28079e, this, kt3.f31427c, s20.m64136d(obj, (ec1) null, 1, (Object) null))) {
                    return;
                }
            } else if (obj2 != mt1.m57558h()) {
                throw new IllegalStateException("Already resumed");
            } else if (C5759j1.m52871a(f28079e, this, mt1.m57558h(), kt3.f31428d)) {
                if (nl3.m58194i(obj)) {
                    b80 = this.f28080a;
                    Throwable e = nl3.m58190e(obj);
                    jt1.m53774m(e);
                    nl3.C6191a aVar = nl3.f32575a;
                    obj = nl3.m58187b(pl3.m61423a(e));
                } else {
                    b80 = this.f28080a;
                }
                b80.mo31191m0(obj);
                return;
            }
        }
    }

    /* renamed from: q */
    public void mo35606q(@vr2 Throwable th) {
        while (true) {
            Object obj = this._result;
            if (obj == kt3.f31427c) {
                if (C5759j1.m52871a(f28079e, this, kt3.f31427c, new m20(th, false, 2, (wg0) null))) {
                    return;
                }
            } else if (obj != mt1.m57558h()) {
                throw new IllegalStateException("Already resumed");
            } else if (C5759j1.m52871a(f28079e, this, mt1.m57558h(), kt3.f31428d)) {
                b80<R> d = lt1.m56482d(this.f28080a);
                nl3.C6191a aVar = nl3.f32575a;
                d.mo31191m0(nl3.m58187b(pl3.m61423a(th)));
                return;
            }
        }
    }

    @vr2
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    /* renamed from: z */
    public <P, Q> void mo34631z(@vr2 ht3<? super P, ? extends Q> ht3, P p, @vr2 sc1<? super Q, ? super b80<? super R>, ? extends Object> sc1) {
        ht3.mo31063D(this, p, sc1);
    }
}

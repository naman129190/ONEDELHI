package com.onedelhi.secure;

import com.onedelhi.secure.C5168eo;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@cu2
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004\u0011D\u0014EB\u0007¢\u0006\u0004\bB\u00107B\u0011\b\u0016\u0012\u0006\u00108\u001a\u00028\u0000¢\u0006\u0004\bB\u0010CJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0014\u001a\u00020\f2\u000e\u0010\u0007\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010\u0016\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0 2\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b\"\u0010#J?\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010 2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b$\u0010#J\u0019\u0010%\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)JX\u00102\u001a\u00020\f\"\u0004\b\u0001\u0010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010+2\u0006\u0010\u0016\u001a\u00028\u00002(\u00101\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010/\u0012\u0006\u0012\u0004\u0018\u0001000-H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103R\u0017\u00108\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R\u0013\u0010:\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b9\u00105R\u0014\u0010=\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R&\u0010A\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.0>8VX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Lcom/onedelhi/secure/q50;", "E", "Lcom/onedelhi/secure/eo;", "Lcom/onedelhi/secure/lg3;", "W", "()Lcom/onedelhi/secure/lg3;", "", "cause", "", "I", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lcom/onedelhi/secure/un4;", "Lkotlinx/coroutines/channels/Handler;", "handler", "a0", "(Lcom/onedelhi/secure/ec1;)V", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "c", "(Ljava/util/concurrent/CancellationException;)V", "element", "F", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/kw;", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/onedelhi/secure/q50$d;", "subscriber", "g", "(Lcom/onedelhi/secure/q50$d;)V", "", "list", "f", "([Lcom/onedelhi/secure/q50$d;Lcom/onedelhi/secure/q50$d;)[Lcom/onedelhi/secure/q50$d;", "n", "k", "(Ljava/lang/Throwable;)V", "Lcom/onedelhi/secure/q50$a;", "l", "(Ljava/lang/Object;)Lcom/onedelhi/secure/q50$a;", "R", "Lcom/onedelhi/secure/it3;", "select", "Lkotlin/Function2;", "Lcom/onedelhi/secure/st3;", "Lcom/onedelhi/secure/b80;", "", "block", "m", "(Lcom/onedelhi/secure/it3;Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)V", "h", "()Ljava/lang/Object;", "getValue$annotations", "()V", "value", "j", "valueOrNull", "Q", "()Z", "isClosedForSend", "Lcom/onedelhi/secure/ht3;", "B", "()Lcom/onedelhi/secure/ht3;", "onSend", "<init>", "(Ljava/lang/Object;)V", "b", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class q50<E> implements C5168eo<E> {
    @Deprecated
    @vr2

    /* renamed from: a */
    public static final l84 f33973a;
    @Deprecated
    @vr2

    /* renamed from: a */
    public static final C6508a f33974a = new C6508a((Throwable) null);
    @vr2

    /* renamed from: a */
    public static final C6509b f33975a = new C6509b((wg0) null);
    @Deprecated
    @vr2

    /* renamed from: a */
    public static final C6510c<Object> f33976a;

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33977a;

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33978a;

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33979b;
    @vr2
    private volatile /* synthetic */ Object _state;
    @vr2
    private volatile /* synthetic */ int _updating;
    @vr2
    private volatile /* synthetic */ Object onCloseHandler;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/q50$a;", "", "", "a", "()Ljava/lang/Throwable;", "sendException", "b", "valueException", "closeCause", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.q50$a */
    public static final class C6508a {
        @rw1
        @ss2

        /* renamed from: a */
        public final Throwable f33980a;

        public C6508a(@ss2 Throwable th) {
            this.f33980a = th;
        }

        @vr2
        /* renamed from: a */
        public final Throwable mo43152a() {
            Throwable th = this.f33980a;
            return th == null ? new C6351oz(C6059lw.f31852a) : th;
        }

        @vr2
        /* renamed from: b */
        public final Throwable mo43153b() {
            Throwable th = this.f33980a;
            return th == null ? new IllegalStateException(C6059lw.f31852a) : th;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/q50$b;", "", "Lcom/onedelhi/secure/q50$a;", "CLOSED", "Lcom/onedelhi/secure/q50$a;", "Lcom/onedelhi/secure/q50$c;", "INITIAL_STATE", "Lcom/onedelhi/secure/q50$c;", "Lcom/onedelhi/secure/l84;", "UNDEFINED", "Lcom/onedelhi/secure/l84;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.q50$b */
    public static final class C6509b {
        public C6509b() {
        }

        public /* synthetic */ C6509b(wg0 wg0) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/q50$c;", "E", "", "value", "", "Lcom/onedelhi/secure/q50$d;", "subscribers", "<init>", "(Ljava/lang/Object;[Lcom/onedelhi/secure/q50$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.q50$c */
    public static final class C6510c<E> {
        @rw1
        @ss2

        /* renamed from: a */
        public final Object f33981a;
        @rw1
        @ss2

        /* renamed from: a */
        public final C6511d<E>[] f33982a;

        public C6510c(@ss2 Object obj, @ss2 C6511d<E>[] dVarArr) {
            this.f33981a = obj;
            this.f33982a = dVarArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/q50$d;", "E", "Lcom/onedelhi/secure/r50;", "Lcom/onedelhi/secure/lg3;", "", "wasClosed", "Lcom/onedelhi/secure/un4;", "m0", "element", "", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/onedelhi/secure/q50;", "broadcastChannel", "<init>", "(Lcom/onedelhi/secure/q50;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.q50$d */
    public static final class C6511d<E> extends r50<E> implements lg3<E> {
        @vr2

        /* renamed from: a */
        public final q50<E> f33983a;

        public C6511d(@vr2 q50<E> q50) {
            super((ec1) null);
            this.f33983a = q50;
        }

        @vr2
        /* renamed from: H */
        public Object mo31522H(E e) {
            return super.mo31522H(e);
        }

        /* renamed from: m0 */
        public void mo31530m0(boolean z) {
            if (z) {
                this.f33983a.mo43145g(this);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"com/onedelhi/secure/q50$e", "Lcom/onedelhi/secure/ht3;", "Lcom/onedelhi/secure/st3;", "R", "Lcom/onedelhi/secure/it3;", "select", "param", "Lkotlin/Function2;", "Lcom/onedelhi/secure/b80;", "", "block", "Lcom/onedelhi/secure/un4;", "D", "(Lcom/onedelhi/secure/it3;Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.q50$e */
    public static final class C6512e implements ht3<E, st3<? super E>> {

        /* renamed from: a */
        public final /* synthetic */ q50<E> f33984a;

        public C6512e(q50<E> q50) {
            this.f33984a = q50;
        }

        /* renamed from: D */
        public <R> void mo31063D(@vr2 it3<? super R> it3, E e, @vr2 sc1<? super st3<? super E>, ? super b80<? super R>, ? extends Object> sc1) {
            this.f33984a.mo43150m(it3, e, sc1);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<q50> cls2 = q50.class;
        l84 l84 = new l84("UNDEFINED");
        f33973a = l84;
        f33976a = new C6510c<>(l84, (C6511d<E>[]) null);
        f33978a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        f33977a = AtomicIntegerFieldUpdater.newUpdater(cls2, "_updating");
        f33979b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "onCloseHandler");
    }

    public q50() {
        this._state = f33976a;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    public q50(E e) {
        this();
        f33978a.lazySet(this, new C6510c(e, (C6511d<E>[]) null));
    }

    /* renamed from: i */
    public static /* synthetic */ void m62098i() {
    }

    @vr2
    /* renamed from: B */
    public ht3<E, st3<E>> mo36800B() {
        return new C6512e(this);
    }

    @ss2
    /* renamed from: F */
    public Object mo36801F(E e, @vr2 b80<? super un4> b80) {
        C6508a l = mo43149l(e);
        if (l != null) {
            throw l.mo43152a();
        } else if (mt1.m57558h() == null) {
            return null;
        } else {
            return un4.f36206a;
        }
    }

    /* renamed from: I */
    public boolean mo35516a(@ss2 Throwable th) {
        Object obj;
        int i;
        do {
            obj = this._state;
            i = 0;
            if (obj instanceof C6508a) {
                return false;
            }
            if (!(obj instanceof C6510c)) {
                throw new IllegalStateException(jt1.m53745C("Invalid state ", obj).toString());
            }
        } while (!C5759j1.m52871a(f33978a, this, obj, th == null ? f33974a : new C6508a(th)));
        C6511d<E>[] dVarArr = ((C6510c) obj).f33982a;
        if (dVarArr != null) {
            int length = dVarArr.length;
            while (i < length) {
                C6511d<E> dVar = dVarArr[i];
                i++;
                dVar.mo36803I(th);
            }
        }
        mo43148k(th);
        return true;
    }

    @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @oi3(expression = "trySend(element).isSuccess", imports = {}))
    /* renamed from: L */
    public boolean mo36806L(E e) {
        return C5168eo.C5169a.m47070c(this, e);
    }

    /* renamed from: Q */
    public boolean mo36808Q() {
        return this._state instanceof C6508a;
    }

    @vr2
    /* renamed from: W */
    public lg3<E> mo30419W() {
        Object obj;
        C6510c cVar;
        C6511d dVar = new C6511d(this);
        do {
            obj = this._state;
            if (obj instanceof C6508a) {
                dVar.mo36803I(((C6508a) obj).f33980a);
                return dVar;
            } else if (obj instanceof C6510c) {
                cVar = (C6510c) obj;
                Object obj2 = cVar.f33981a;
                if (obj2 != f33973a) {
                    dVar.mo31522H(obj2);
                }
            } else {
                throw new IllegalStateException(jt1.m53745C("Invalid state ", obj).toString());
            }
        } while (!C5759j1.m52871a(f33978a, this, obj, new C6510c(cVar.f33981a, mo43144f(cVar.f33982a, dVar))));
        return dVar;
    }

    /* renamed from: a0 */
    public void mo36810a0(@vr2 ec1<? super Throwable, un4> ec1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33979b;
        if (!C5759j1.m52871a(atomicReferenceFieldUpdater, this, (Object) null, ec1)) {
            Object obj = this.onCloseHandler;
            if (obj == C5757j0.f30532f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(jt1.m53745C("Another handler was already registered: ", obj));
        }
        Object obj2 = this._state;
        if ((obj2 instanceof C6508a) && C5759j1.m52871a(atomicReferenceFieldUpdater, this, ec1, C5757j0.f30532f)) {
            ec1.mo17094X(((C6508a) obj2).f33980a);
        }
    }

    /* renamed from: c */
    public void mo35517c(@ss2 CancellationException cancellationException) {
        mo35516a(cancellationException);
    }

    @vr2
    /* renamed from: e */
    public Object mo36811e(E e) {
        C6508a l = mo43149l(e);
        return l == null ? C5945kw.f31471a.mo39550c(un4.f36206a) : C5945kw.f31471a.mo39548a(l.mo43152a());
    }

    /* renamed from: f */
    public final C6511d<E>[] mo43144f(C6511d<E>[] dVarArr, C6511d<E> dVar) {
        if (dVarArr != null) {
            return (C6511d[]) C7458za.m72849X3(dVarArr, dVar);
        }
        C6511d<E>[] dVarArr2 = new C6511d[1];
        for (int i = 0; i < 1; i++) {
            dVarArr2[i] = dVar;
        }
        return dVarArr2;
    }

    /* renamed from: g */
    public final void mo43145g(C6511d<E> dVar) {
        Object obj;
        Object obj2;
        C6511d<E>[] dVarArr;
        do {
            obj = this._state;
            if (!(obj instanceof C6508a)) {
                if (obj instanceof C6510c) {
                    C6510c cVar = (C6510c) obj;
                    obj2 = cVar.f33981a;
                    dVarArr = cVar.f33982a;
                    jt1.m53774m(dVarArr);
                } else {
                    throw new IllegalStateException(jt1.m53745C("Invalid state ", obj).toString());
                }
            } else {
                return;
            }
        } while (!C5759j1.m52871a(f33978a, this, obj, new C6510c(obj2, mo43151n(dVarArr, dVar))));
    }

    /* renamed from: h */
    public final E mo43146h() {
        Object obj = this._state;
        if (obj instanceof C6508a) {
            throw ((C6508a) obj).mo43153b();
        } else if (obj instanceof C6510c) {
            E e = ((C6510c) obj).f33981a;
            if (e != f33973a) {
                return e;
            }
            throw new IllegalStateException("No value");
        } else {
            throw new IllegalStateException(jt1.m53745C("Invalid state ", obj).toString());
        }
    }

    @ss2
    /* renamed from: j */
    public final E mo43147j() {
        Object obj = this._state;
        if (obj instanceof C6508a) {
            return null;
        }
        if (obj instanceof C6510c) {
            E e = f33973a;
            E e2 = ((C6510c) obj).f33981a;
            if (e2 == e) {
                return null;
            }
            return e2;
        }
        throw new IllegalStateException(jt1.m53745C("Invalid state ", obj).toString());
    }

    /* renamed from: k */
    public final void mo43148k(Throwable th) {
        l84 l84;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (l84 = C5757j0.f30532f) && C5759j1.m52871a(f33979b, this, obj, l84)) {
            ((ec1) lj4.m55703q(obj, 1)).mo17094X(th);
        }
    }

    /* renamed from: l */
    public final C6508a mo43149l(E e) {
        Object obj;
        if (!f33977a.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof C6508a) {
                    C6508a aVar = (C6508a) obj;
                    this._updating = 0;
                    return aVar;
                } else if (obj instanceof C6510c) {
                } else {
                    throw new IllegalStateException(jt1.m53745C("Invalid state ", obj).toString());
                }
            } finally {
                this._updating = 0;
            }
        } while (!C5759j1.m52871a(f33978a, this, obj, new C6510c(e, ((C6510c) obj).f33982a)));
        C6511d<E>[] dVarArr = ((C6510c) obj).f33982a;
        if (dVarArr != null) {
            int length = dVarArr.length;
            int i = 0;
            while (i < length) {
                C6511d<E> dVar = dVarArr[i];
                i++;
                dVar.mo31522H(e);
            }
        }
        return null;
    }

    /* renamed from: m */
    public final <R> void mo43150m(it3<? super R> it3, E e, sc1<? super st3<? super E>, ? super b80<? super R>, ? extends Object> sc1) {
        if (it3.mo35594D()) {
            C6508a l = mo43149l(e);
            if (l == null) {
                pn4.m61465d(sc1, this, it3.mo35603k0());
            } else {
                it3.mo35606q(l.mo43152a());
            }
        }
    }

    /* renamed from: n */
    public final C6511d<E>[] mo43151n(C6511d<E>[] dVarArr, C6511d<E> dVar) {
        int length = dVarArr.length;
        int jg = C4478ab.m37248jg(dVarArr, dVar);
        if (length == 1) {
            return null;
        }
        C6511d<E>[] dVarArr2 = new C6511d[(length - 1)];
        C6511d<E>[] dVarArr3 = dVarArr;
        C6511d<E>[] dVarArr4 = dVarArr2;
        C7458za.m72930l1(dVarArr3, dVarArr4, 0, 0, jg, 6, (Object) null);
        C7458za.m72930l1(dVarArr3, dVarArr4, jg, jg + 1, 0, 8, (Object) null);
        return dVarArr2;
    }
}

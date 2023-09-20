package com.onedelhi.secure;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0006\u0013\u001a\t\u0014\u001f\u0006B\u000f\u0012\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJT\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0007J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\"\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/onedelhi/secure/an2;", "Lcom/onedelhi/secure/zm2;", "Lcom/onedelhi/secure/ht3;", "", "owner", "", "f", "(Ljava/lang/Object;)Z", "Lcom/onedelhi/secure/un4;", "c", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "R", "Lcom/onedelhi/secure/it3;", "select", "Lkotlin/Function2;", "Lcom/onedelhi/secure/b80;", "block", "D", "(Lcom/onedelhi/secure/it3;Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)V", "a", "d", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "i", "b", "()Z", "isLocked", "h", "isLockedEmptyQueueState", "e", "()Lcom/onedelhi/secure/ht3;", "onLock", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class an2 implements zm2, ht3<Object, zm2> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25942a = AtomicReferenceFieldUpdater.newUpdater(an2.class, Object.class, "_state");
    @vr2
    public volatile /* synthetic */ Object _state;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/an2$a;", "Lcom/onedelhi/secure/an2$c;", "Lcom/onedelhi/secure/an2;", "", "c1", "Lcom/onedelhi/secure/un4;", "a1", "", "toString", "", "owner", "Lcom/onedelhi/secure/iu;", "cont", "<init>", "(Lcom/onedelhi/secure/an2;Ljava/lang/Object;Lcom/onedelhi/secure/iu;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.an2$a */
    public final class C4576a extends C4580c {
        @vr2

        /* renamed from: a */
        public final C5744iu<un4> f25943a;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.onedelhi.secure.an2$a$a */
        public static final class C4577a extends d12 implements ec1<Throwable, un4> {

            /* renamed from: a */
            public final /* synthetic */ C4576a f25945a;

            /* renamed from: a */
            public final /* synthetic */ an2 f25946a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4577a(an2 an2, C4576a aVar) {
                super(1);
                this.f25946a = an2;
                this.f25945a = aVar;
            }

            /* renamed from: X */
            public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
                mo31076a((Throwable) obj);
                return un4.f36206a;
            }

            /* renamed from: a */
            public final void mo31076a(@vr2 Throwable th) {
                this.f25946a.mo31067d(this.f25945a.f25954a);
            }
        }

        public C4576a(@ss2 Object obj, @vr2 C5744iu<? super un4> iuVar) {
            super(obj);
            this.f25943a = iuVar;
        }

        /* renamed from: a1 */
        public void mo31073a1() {
            this.f25943a.mo38233N(C5937ku.f31431a);
        }

        /* renamed from: c1 */
        public boolean mo31074c1() {
            return mo31078b1() && this.f25943a.mo38235Z(un4.f36206a, (Object) null, new C4577a(an2.this, this)) != null;
        }

        @vr2
        public String toString() {
            return "LockCont[" + this.f25954a + ", " + this.f25943a + "] for " + an2.this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BF\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000eø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/onedelhi/secure/an2$b;", "R", "Lcom/onedelhi/secure/an2$c;", "Lcom/onedelhi/secure/an2;", "", "c1", "Lcom/onedelhi/secure/un4;", "a1", "", "toString", "", "owner", "Lcom/onedelhi/secure/it3;", "select", "Lkotlin/Function2;", "Lcom/onedelhi/secure/zm2;", "Lcom/onedelhi/secure/b80;", "block", "<init>", "(Lcom/onedelhi/secure/an2;Ljava/lang/Object;Lcom/onedelhi/secure/it3;Lcom/onedelhi/secure/sc1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.an2$b */
    public final class C4578b<R> extends C4580c {
        @rw1
        @vr2

        /* renamed from: a */
        public final it3<R> f25947a;
        @rw1
        @vr2

        /* renamed from: a */
        public final sc1<zm2, b80<? super R>, Object> f25948a;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.onedelhi.secure.an2$b$a */
        public static final class C4579a extends d12 implements ec1<Throwable, un4> {

            /* renamed from: a */
            public final /* synthetic */ C4578b<R> f25950a;

            /* renamed from: a */
            public final /* synthetic */ an2 f25951a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4579a(an2 an2, C4578b<R> bVar) {
                super(1);
                this.f25951a = an2;
                this.f25950a = bVar;
            }

            /* renamed from: X */
            public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
                mo31077a((Throwable) obj);
                return un4.f36206a;
            }

            /* renamed from: a */
            public final void mo31077a(@vr2 Throwable th) {
                this.f25951a.mo31067d(this.f25950a.f25954a);
            }
        }

        public C4578b(@ss2 Object obj, @vr2 it3<? super R> it3, @vr2 sc1<? super zm2, ? super b80<? super R>, ? extends Object> sc1) {
            super(obj);
            this.f25947a = it3;
            this.f25948a = sc1;
        }

        /* renamed from: a1 */
        public void mo31073a1() {
            C6303ou.m59637e(this.f25948a, an2.this, this.f25947a.mo35603k0(), new C4579a(an2.this, this));
        }

        /* renamed from: c1 */
        public boolean mo31074c1() {
            return mo31078b1() && this.f25947a.mo35594D();
        }

        @vr2
        public String toString() {
            return "LockSelect[" + this.f25954a + ", " + this.f25947a + "] for " + an2.this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/an2$c;", "Lcom/onedelhi/secure/l82;", "Lcom/onedelhi/secure/fn0;", "", "b1", "()Z", "Lcom/onedelhi/secure/un4;", "e", "()V", "c1", "a1", "", "owner", "<init>", "(Lcom/onedelhi/secure/an2;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.an2$c */
    public abstract class C4580c extends l82 implements fn0 {

        /* renamed from: a */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f25952a = AtomicIntegerFieldUpdater.newUpdater(C4580c.class, "isTaken");
        @rw1
        @ss2

        /* renamed from: a */
        public final Object f25954a;
        @vr2
        private volatile /* synthetic */ int isTaken = 0;

        public C4580c(@ss2 Object obj) {
            this.f25954a = obj;
        }

        /* renamed from: a1 */
        public abstract void mo31073a1();

        /* renamed from: b1 */
        public final boolean mo31078b1() {
            return f25952a.compareAndSet(this, 0, 1);
        }

        /* renamed from: c1 */
        public abstract boolean mo31074c1();

        /* renamed from: e */
        public final void mo30964e() {
            mo38449T0();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/onedelhi/secure/an2$d;", "Lcom/onedelhi/secure/j82;", "", "toString", "", "owner", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.an2$d */
    public static final class C4581d extends j82 {
        @rw1
        @vr2

        /* renamed from: a */
        public Object f25955a;

        public C4581d(@vr2 Object obj) {
            this.f25955a = obj;
        }

        @vr2
        public String toString() {
            return "LockedQueue[" + this.f25955a + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/onedelhi/secure/an2$e;", "Lcom/onedelhi/secure/rb;", "Lcom/onedelhi/secure/vb;", "op", "", "c", "failure", "Lcom/onedelhi/secure/un4;", "a", "Lcom/onedelhi/secure/an2;", "mutex", "owner", "<init>", "(Lcom/onedelhi/secure/an2;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.an2$e */
    public static final class C4582e extends C6656rb {
        @rw1
        @vr2

        /* renamed from: a */
        public final an2 f25956a;
        @rw1
        @ss2

        /* renamed from: a */
        public final Object f25957a;

        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/an2$e$a;", "Lcom/onedelhi/secure/wv2;", "", "affected", "c", "Lcom/onedelhi/secure/vb;", "atomicOp", "Lcom/onedelhi/secure/vb;", "a", "()Lcom/onedelhi/secure/vb;", "<init>", "(Lcom/onedelhi/secure/an2$e;Lcom/onedelhi/secure/vb;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: com.onedelhi.secure.an2$e$a */
        public final class C4583a extends wv2 {
            @vr2

            /* renamed from: a */
            public final C7022vb<?> f25959a;

            public C4583a(@vr2 C7022vb<?> vbVar) {
                this.f25959a = vbVar;
            }

            @vr2
            /* renamed from: a */
            public C7022vb<?> mo31081a() {
                return this.f25959a;
            }

            @ss2
            /* renamed from: c */
            public Object mo31082c(@ss2 Object obj) {
                Object d = mo31081a().mo46063h() ? bn2.f26453b : mo31081a();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
                C5759j1.m52871a(an2.f25942a, (an2) obj, this, d);
                return null;
            }
        }

        public C4582e(@vr2 an2 an2, @ss2 Object obj) {
            this.f25956a = an2;
            this.f25957a = obj;
        }

        /* renamed from: a */
        public void mo31079a(@vr2 C7022vb<?> vbVar, @ss2 Object obj) {
            et0 et0;
            if (obj != null) {
                et0 = bn2.f26453b;
            } else {
                Object obj2 = this.f25957a;
                et0 = obj2 == null ? bn2.f26451a : new et0(obj2);
            }
            C5759j1.m52871a(an2.f25942a, this.f25956a, vbVar, et0);
        }

        @ss2
        /* renamed from: c */
        public Object mo31080c(@vr2 C7022vb<?> vbVar) {
            C4583a aVar = new C4583a(vbVar);
            return !C5759j1.m52871a(an2.f25942a, this.f25956a, bn2.f26453b, aVar) ? bn2.f26452a : aVar.mo31082c(this.f25956a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/an2$f;", "Lcom/onedelhi/secure/vb;", "Lcom/onedelhi/secure/an2;", "affected", "", "k", "failure", "Lcom/onedelhi/secure/un4;", "j", "Lcom/onedelhi/secure/an2$d;", "queue", "<init>", "(Lcom/onedelhi/secure/an2$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.an2$f */
    public static final class C4584f extends C7022vb<an2> {
        @rw1
        @vr2

        /* renamed from: a */
        public final C4581d f25960a;

        public C4584f(@vr2 C4581d dVar) {
            this.f25960a = dVar;
        }

        /* renamed from: j */
        public void mo31083d(@vr2 an2 an2, @ss2 Object obj) {
            C5759j1.m52871a(an2.f25942a, an2, this, obj == null ? bn2.f26453b : this.f25960a);
        }

        @ss2
        /* renamed from: k */
        public Object mo31084i(@vr2 an2 an2) {
            if (this.f25960a.mo38451b1()) {
                return null;
            }
            return bn2.f26454b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/onedelhi/secure/un4;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.an2$g */
    public static final class C4585g extends d12 implements ec1<Throwable, un4> {

        /* renamed from: a */
        public final /* synthetic */ an2 f25961a;

        /* renamed from: a */
        public final /* synthetic */ Object f25962a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4585g(an2 an2, Object obj) {
            super(1);
            this.f25961a = an2;
            this.f25962a = obj;
        }

        /* renamed from: X */
        public /* bridge */ /* synthetic */ Object mo17094X(Object obj) {
            mo31087a((Throwable) obj);
            return un4.f36206a;
        }

        /* renamed from: a */
        public final void mo31087a(@vr2 Throwable th) {
            this.f25961a.mo31067d(this.f25962a);
        }
    }

    public an2(boolean z) {
        this._state = z ? bn2.f26451a : bn2.f26453b;
    }

    /* renamed from: D */
    public <R> void mo31063D(@vr2 it3<? super R> it3, @ss2 Object obj, @vr2 sc1<? super zm2, ? super b80<? super R>, ? extends Object> sc1) {
        while (!it3.mo35605l()) {
            Object obj2 = this._state;
            if (obj2 instanceof et0) {
                et0 et0 = (et0) obj2;
                if (et0.f28076a != bn2.f26456d) {
                    C5759j1.m52871a(f25942a, this, obj2, new C4581d(et0.f28076a));
                } else {
                    Object C = it3.mo35593C(new C4582e(this, obj));
                    if (C == null) {
                        pn4.m61465d(sc1, this, it3.mo35603k0());
                        return;
                    } else if (C != kt3.m54916d()) {
                        if (!(C == bn2.f26452a || C == C6944ub.f36019b)) {
                            throw new IllegalStateException(jt1.m53745C("performAtomicTrySelect(TryLockDesc) returned ", C).toString());
                        }
                    } else {
                        return;
                    }
                }
            } else if (obj2 instanceof C4581d) {
                C4581d dVar = (C4581d) obj2;
                if (dVar.f25955a != obj) {
                    C4578b bVar = new C4578b(obj, it3, sc1);
                    dVar.mo39679A0(bVar);
                    if (this._state == obj2 || !bVar.mo31078b1()) {
                        it3.mo35595F(bVar);
                        return;
                    }
                } else {
                    throw new IllegalStateException(jt1.m53745C("Already locked by ", obj).toString());
                }
            } else if (obj2 instanceof wv2) {
                ((wv2) obj2).mo31082c(this);
            } else {
                throw new IllegalStateException(jt1.m53745C("Illegal state ", obj2).toString());
            }
        }
    }

    /* renamed from: a */
    public boolean mo31064a(@vr2 Object obj) {
        Object obj2 = this._state;
        if (!(obj2 instanceof et0)) {
            return (obj2 instanceof C4581d) && ((C4581d) obj2).f25955a == obj;
        }
        if (((et0) obj2).f28076a == obj) {
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo31065b() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof et0) {
                return ((et0) obj).f28076a != bn2.f26456d;
            }
            if (obj instanceof C4581d) {
                return true;
            }
            if (obj instanceof wv2) {
                ((wv2) obj).mo31082c(this);
            } else {
                throw new IllegalStateException(jt1.m53745C("Illegal state ", obj).toString());
            }
        }
    }

    @ss2
    /* renamed from: c */
    public Object mo31066c(@ss2 Object obj, @vr2 b80<? super un4> b80) {
        if (mo31069f(obj)) {
            return un4.f36206a;
        }
        Object i = mo31071i(obj, b80);
        return i == mt1.m57558h() ? i : un4.f36206a;
    }

    /* renamed from: d */
    public void mo31067d(@ss2 Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof et0) {
                et0 et0 = (et0) obj2;
                if (obj == null) {
                    if (et0.f28076a == bn2.f26456d) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (et0.f28076a != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + et0.f28076a + " but expected " + obj).toString());
                    }
                }
                if (C5759j1.m52871a(f25942a, this, obj2, bn2.f26453b)) {
                    return;
                }
            } else if (obj2 instanceof wv2) {
                ((wv2) obj2).mo31082c(this);
            } else if (obj2 instanceof C4581d) {
                if (obj != null) {
                    C4581d dVar = (C4581d) obj2;
                    if (dVar.f25955a != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + dVar.f25955a + " but expected " + obj).toString());
                    }
                }
                C4581d dVar2 = (C4581d) obj2;
                l82 V0 = dVar2.mo39697V0();
                if (V0 == null) {
                    C4584f fVar = new C4584f(dVar2);
                    if (C5759j1.m52871a(f25942a, this, obj2, fVar) && fVar.mo31082c(this) == null) {
                        return;
                    }
                } else {
                    C4580c cVar = (C4580c) V0;
                    if (cVar.mo31074c1()) {
                        Object obj3 = cVar.f25954a;
                        if (obj3 == null) {
                            obj3 = bn2.f26455c;
                        }
                        dVar2.f25955a = obj3;
                        cVar.mo31073a1();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(jt1.m53745C("Illegal state ", obj2).toString());
            }
        }
    }

    @vr2
    /* renamed from: e */
    public ht3<Object, zm2> mo31068e() {
        return this;
    }

    /* renamed from: f */
    public boolean mo31069f(@ss2 Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof et0) {
                if (((et0) obj2).f28076a != bn2.f26456d) {
                    return false;
                }
                if (C5759j1.m52871a(f25942a, this, obj2, obj == null ? bn2.f26451a : new et0(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C4581d) {
                if (((C4581d) obj2).f25955a == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(jt1.m53745C("Already locked by ", obj).toString());
            } else if (obj2 instanceof wv2) {
                ((wv2) obj2).mo31082c(this);
            } else {
                throw new IllegalStateException(jt1.m53745C("Illegal state ", obj2).toString());
            }
        }
    }

    /* renamed from: h */
    public final boolean mo31070h() {
        Object obj = this._state;
        return (obj instanceof C4581d) && ((C4581d) obj).mo38451b1();
    }

    /* renamed from: i */
    public final Object mo31071i(Object obj, b80<? super un4> b80) {
        C5847ju<? super un4> b = C6057lu.m56509b(lt1.m56482d(b80));
        C4576a aVar = new C4576a(obj, b);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof et0) {
                et0 et0 = (et0) obj2;
                if (et0.f28076a != bn2.f26456d) {
                    C5759j1.m52871a(f25942a, this, obj2, new C4581d(et0.f28076a));
                } else {
                    if (C5759j1.m52871a(f25942a, this, obj2, obj == null ? bn2.f26451a : new et0(obj))) {
                        b.mo38242w(un4.f36206a, new C4585g(this, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof C4581d) {
                C4581d dVar = (C4581d) obj2;
                if (dVar.f25955a != obj) {
                    dVar.mo39679A0(aVar);
                    if (this._state == obj2 || !aVar.mo31078b1()) {
                        C6057lu.m56510c(b, aVar);
                    } else {
                        aVar = new C4576a(obj, b);
                    }
                } else {
                    throw new IllegalStateException(jt1.m53745C("Already locked by ", obj).toString());
                }
            } else if (obj2 instanceof wv2) {
                ((wv2) obj2).mo31082c(this);
            } else {
                throw new IllegalStateException(jt1.m53745C("Illegal state ", obj2).toString());
            }
        }
        Object A = b.mo38880A();
        if (A == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return A == mt1.m57558h() ? A : un4.f36206a;
    }

    @vr2
    public String toString() {
        StringBuilder sb;
        Object obj;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof et0) {
                sb = new StringBuilder();
                sb.append("Mutex[");
                obj = ((et0) obj2).f28076a;
                break;
            } else if (obj2 instanceof wv2) {
                ((wv2) obj2).mo31082c(this);
            } else if (obj2 instanceof C4581d) {
                sb = new StringBuilder();
                sb.append("Mutex[");
                obj = ((C4581d) obj2).f25955a;
            } else {
                throw new IllegalStateException(jt1.m53745C("Illegal state ", obj2).toString());
            }
        }
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}

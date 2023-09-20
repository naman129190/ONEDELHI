package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import com.onedelhi.secure.ei0;
import com.onedelhi.secure.f90;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u00014B\u0013\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b2\u00103J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u001c\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0002J7\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u0005J$\u0010(\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$J$\u0010)\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$J$\u0010*\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$J*\u0010,\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\u0018\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0+\u0012\u0004\u0012\u00020&0$J\b\u0010-\u001a\u00020\"H\u0016R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020%0+8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00065"}, d2 = {"Lcom/onedelhi/secure/oa4;", "Lcom/onedelhi/secure/b90;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lcom/onedelhi/secure/un4;", "D", "", "delayTime", "Lcom/onedelhi/secure/ke4;", "J", "L", "targetTime", "O", "R", "initial", "Lkotlin/Function2;", "Lcom/onedelhi/secure/b90$b;", "operation", "fold", "(Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)Ljava/lang/Object;", "E", "Lcom/onedelhi/secure/b90$c;", "key", "get", "(Lcom/onedelhi/secure/b90$c;)Lcom/onedelhi/secure/b90$b;", "minusKey", "Ljava/util/concurrent/TimeUnit;", "unit", "G", "n", "r", "N", "C", "", "message", "Lkotlin/Function1;", "", "", "predicate", "z", "t", "v", "", "x", "toString", "F", "()Ljava/util/List;", "exceptions", "name", "<init>", "(Ljava/lang/String;)V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@xj0(level = ak0.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @oi3(expression = "TestCoroutineScope", imports = {"kotlin.coroutines.test"}))
public final class oa4 implements b90 {
    @vr2

    /* renamed from: a */
    public final cc4<ke4> f32958a;
    @vr2

    /* renamed from: a */
    public final f90 f32959a;
    @vr2

    /* renamed from: a */
    public final C6259a f32960a;
    @vr2

    /* renamed from: a */
    public final List<Throwable> f32961a;

    /* renamed from: b */
    public long f32962b;
    @ss2

    /* renamed from: b */
    public final String f32963b;

    /* renamed from: c */
    public long f32964c;

    @Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001e\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/oa4$a;", "Lcom/onedelhi/secure/vv0;", "Lcom/onedelhi/secure/ei0;", "Lcom/onedelhi/secure/b90;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lcom/onedelhi/secure/un4;", "Q0", "", "C1", "", "timeMillis", "Lcom/onedelhi/secure/iu;", "continuation", "Z", "Lcom/onedelhi/secure/fn0;", "M0", "A1", "", "toString", "<init>", "(Lcom/onedelhi/secure/oa4;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.oa4$a */
    public final class C6259a extends vv0 implements ei0 {

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/onedelhi/secure/oa4$a$a", "Lcom/onedelhi/secure/fn0;", "Lcom/onedelhi/secure/un4;", "e", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: com.onedelhi.secure.oa4$a$a */
        public static final class C6260a implements fn0 {

            /* renamed from: a */
            public final /* synthetic */ ke4 f32966a;

            /* renamed from: a */
            public final /* synthetic */ oa4 f32967a;

            public C6260a(oa4 oa4, ke4 ke4) {
                this.f32967a = oa4;
                this.f32966a = ke4;
            }

            /* renamed from: e */
            public void mo30964e() {
                this.f32967a.f32958a.mo32295j(this.f32966a);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onedelhi/secure/un4;", "run", "()V", "com/onedelhi/secure/mo3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.onedelhi.secure.oa4$a$b */
        public static final class C6261b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C5744iu f32968a;

            /* renamed from: a */
            public final /* synthetic */ C6259a f32969a;

            public C6261b(C5744iu iuVar, C6259a aVar) {
                this.f32968a = iuVar;
                this.f32969a = aVar;
            }

            public final void run() {
                this.f32968a.mo38231G(this.f32969a, un4.f36206a);
            }
        }

        public C6259a() {
            vv0.m68522p1(this, false, 1, (Object) null);
        }

        /* renamed from: A1 */
        public long mo41645A1() {
            return oa4.this.mo41635L();
        }

        /* renamed from: C1 */
        public boolean mo41646C1() {
            return true;
        }

        @vr2
        /* renamed from: M0 */
        public fn0 mo31901M0(long j, @vr2 Runnable runnable, @vr2 b90 b90) {
            return new C6260a(oa4.this, oa4.this.mo41634J(runnable, j));
        }

        @ss2
        @xj0(level = ak0.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        /* renamed from: P0 */
        public Object mo33767P0(long j, @vr2 b80<? super un4> b80) {
            return ei0.C5156a.m46892a(this, j, b80);
        }

        /* renamed from: Q0 */
        public void mo31902Q0(@vr2 b90 b90, @vr2 Runnable runnable) {
            oa4.this.mo41631D(runnable);
        }

        /* renamed from: Z */
        public void mo31904Z(long j, @vr2 C5744iu<? super un4> iuVar) {
            ke4 unused = oa4.this.mo41634J(new C6261b(iuVar, this), j);
        }

        @vr2
        public String toString() {
            return "Dispatcher(" + oa4.this + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/h90$a", "Lcom/onedelhi/secure/m0;", "Lcom/onedelhi/secure/f90;", "Lcom/onedelhi/secure/b90;", "context", "", "exception", "Lcom/onedelhi/secure/un4;", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.oa4$b */
    public static final class C6262b extends C6072m0 implements f90 {

        /* renamed from: a */
        public final /* synthetic */ oa4 f32970a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6262b(f90.C5220b bVar, oa4 oa4) {
            super(bVar);
            this.f32970a = oa4;
        }

        public void handleException(@vr2 b90 b90, @vr2 Throwable th) {
            this.f32970a.f32961a.add(th);
        }
    }

    public oa4() {
        this((String) null, 1, (wg0) null);
    }

    public oa4(@ss2 String str) {
        this.f32963b = str;
        this.f32961a = new ArrayList();
        this.f32960a = new C6259a();
        this.f32959a = new C6262b(f90.f28193a, this);
        this.f32958a = new cc4<>();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa4(String str, int i, wg0 wg0) {
        this((i & 1) != 0 ? null : str);
    }

    /* renamed from: B */
    public static /* synthetic */ void m59146B(oa4 oa4, String str, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        oa4.mo41644z(str, ec1);
    }

    /* renamed from: I */
    public static /* synthetic */ long m59147I(oa4 oa4, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return oa4.mo41633G(timeUnit);
    }

    /* renamed from: o */
    public static /* synthetic */ long m59153o(oa4 oa4, long j, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return oa4.mo41638n(j, timeUnit);
    }

    /* renamed from: s */
    public static /* synthetic */ void m59154s(oa4 oa4, long j, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 2) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        oa4.mo41639r(j, timeUnit);
    }

    /* renamed from: u */
    public static /* synthetic */ void m59155u(oa4 oa4, String str, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        oa4.mo41640t(str, ec1);
    }

    /* renamed from: w */
    public static /* synthetic */ void m59156w(oa4 oa4, String str, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        oa4.mo41642v(str, ec1);
    }

    /* renamed from: y */
    public static /* synthetic */ void m59157y(oa4 oa4, String str, ec1 ec1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        oa4.mo41643x(str, ec1);
    }

    /* renamed from: C */
    public final void mo41630C() {
        if (!this.f32958a.mo32292g()) {
            this.f32958a.mo32289d();
        }
    }

    /* renamed from: D */
    public final void mo41631D(Runnable runnable) {
        cc4<ke4> cc4 = this.f32958a;
        long j = this.f32962b;
        this.f32962b = 1 + j;
        cc4.mo32287b(new ke4(runnable, j, 0, 4, (wg0) null));
    }

    @vr2
    /* renamed from: F */
    public final List<Throwable> mo41632F() {
        return this.f32961a;
    }

    /* renamed from: G */
    public final long mo41633G(@vr2 TimeUnit timeUnit) {
        return timeUnit.convert(this.f32964c, TimeUnit.NANOSECONDS);
    }

    /* renamed from: J */
    public final ke4 mo41634J(Runnable runnable, long j) {
        long j2 = this.f32962b;
        this.f32962b = 1 + j2;
        ke4 ke4 = new ke4(runnable, j2, this.f32964c + TimeUnit.MILLISECONDS.toNanos(j));
        this.f32958a.mo32287b(ke4);
        return ke4;
    }

    /* renamed from: L */
    public final long mo41635L() {
        ke4 h = this.f32958a.mo32293h();
        if (h != null) {
            mo41637O(h.f31190c);
        }
        return this.f32958a.mo32292g() ? Long.MAX_VALUE : 0;
    }

    /* renamed from: N */
    public final void mo41636N() {
        mo41637O(this.f32964c);
    }

    /* renamed from: O */
    public final void mo41637O(long j) {
        ke4 ke4;
        while (true) {
            cc4<ke4> cc4 = this.f32958a;
            synchronized (cc4) {
                ke4 e = cc4.mo32290e();
                ke4 = null;
                if (e != null) {
                    if (e.f31190c <= j) {
                        ke4 = cc4.mo32296k(0);
                    }
                }
            }
            ke4 ke42 = ke4;
            if (ke42 != null) {
                long j2 = ke42.f31190c;
                if (j2 != 0) {
                    this.f32964c = j2;
                }
                ke42.run();
            } else {
                return;
            }
        }
    }

    public <R> R fold(R r, @vr2 sc1<? super R, ? super b90.C4634b, ? extends R> sc1) {
        return sc1.mo21054h0(sc1.mo21054h0(r, this.f32960a), this.f32959a);
    }

    @ss2
    public <E extends b90.C4634b> E get(@vr2 b90.C4636c<E> cVar) {
        if (cVar == f80.f28189a) {
            return this.f32960a;
        }
        if (cVar == f90.f28193a) {
            return this.f32959a;
        }
        return null;
    }

    @vr2
    public b90 minusKey(@vr2 b90.C4636c<?> cVar) {
        return cVar == f80.f28189a ? this.f32959a : cVar == f90.f28193a ? this.f32960a : this;
    }

    /* renamed from: n */
    public final long mo41638n(long j, @vr2 TimeUnit timeUnit) {
        long j2 = this.f32964c;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        mo41639r(timeUnit.toNanos(j) + j2, timeUnit2);
        return timeUnit.convert(this.f32964c - j2, timeUnit2);
    }

    @vr2
    public b90 plus(@vr2 b90 b90) {
        return b90.C4632a.m39499a(this, b90);
    }

    /* renamed from: r */
    public final void mo41639r(long j, @vr2 TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        mo41637O(nanos);
        if (nanos > this.f32964c) {
            this.f32964c = nanos;
        }
    }

    /* renamed from: t */
    public final void mo41640t(@vr2 String str, @vr2 ec1<? super Throwable, Boolean> ec1) {
        List<Throwable> list = this.f32961a;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!ec1.mo17094X(it.next()).booleanValue()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.f32961a.clear();
            return;
        }
        throw new AssertionError(str);
    }

    @vr2
    public String toString() {
        String str = this.f32963b;
        return str == null ? jt1.m53745C("TestCoroutineContext@", if0.m52225b(this)) : str;
    }

    /* renamed from: v */
    public final void mo41642v(@vr2 String str, @vr2 ec1<? super Throwable, Boolean> ec1) {
        List<Throwable> list = this.f32961a;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (ec1.mo17094X(it.next()).booleanValue()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.f32961a.clear();
            return;
        }
        throw new AssertionError(str);
    }

    /* renamed from: x */
    public final void mo41643x(@vr2 String str, @vr2 ec1<? super List<? extends Throwable>, Boolean> ec1) {
        if (ec1.mo17094X(this.f32961a).booleanValue()) {
            this.f32961a.clear();
            return;
        }
        throw new AssertionError(str);
    }

    /* renamed from: z */
    public final void mo41644z(@vr2 String str, @vr2 ec1<? super Throwable, Boolean> ec1) {
        if (this.f32961a.size() != 1 || !ec1.mo17094X(this.f32961a.get(0)).booleanValue()) {
            throw new AssertionError(str);
        }
        this.f32961a.clear();
    }
}

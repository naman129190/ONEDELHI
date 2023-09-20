package com.onedelhi.secure;

import com.onedelhi.secure.ru1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001f\u0012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000r\u0012\u0006\u0010-\u001a\u00020'¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\b¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0017\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010\"\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J8\u0010%\u001a\u00020$2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*JZ\u00100\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\b\u0010/\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b0\u00101JH\u00102\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2%\b\u0002\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b2\u00103JJ\u00105\u001a\u0004\u0018\u0001042\b\u0010,\u001a\u0004\u0018\u00010 2\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u0002072\b\u0010,\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u001fJ\u000f\u0010\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0001\u0010\u001fJ\u000f\u0010;\u001a\u00020\u0006H\u0001¢\u0006\u0004\b;\u0010\bJ\u0017\u0010>\u001a\n\u0018\u00010<j\u0004\u0018\u0001`=H\u0016¢\u0006\u0004\b>\u0010?J\u0011\u0010@\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\b@\u0010AJ!\u0010C\u001a\u00020\u000e2\b\u0010B\u001a\u0004\u0018\u00010 2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bE\u0010\fJ\u0017\u0010F\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\bF\u0010GJ\u001f\u0010H\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020$2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bH\u0010IJ8\u0010J\u001a\u00020\u000e2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bJ\u0010\u0018J\u0017\u0010M\u001a\u00020\t2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u0011\u0010O\u001a\u0004\u0018\u00010 H\u0001¢\u0006\u0004\bO\u0010AJ \u0010R\u001a\u00020\u000e2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000PH\u0016ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ<\u0010U\u001a\u00020\u000e2\u0006\u0010T\u001a\u00028\u00002#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\bU\u0010VJ8\u0010W\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u000eH\u0000¢\u0006\u0004\bY\u0010\u001fJ#\u0010Z\u001a\u0004\u0018\u00010 2\u0006\u0010T\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\bZ\u0010[JH\u0010\\\u001a\u0004\u0018\u00010 2\u0006\u0010T\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001a\u0004\u0018\u00010 2\u0006\u0010^\u001a\u00020\tH\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020 H\u0016¢\u0006\u0004\bb\u0010SJ\u001b\u0010d\u001a\u00020\u000e*\u00020c2\u0006\u0010T\u001a\u00028\u0000H\u0016¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020\u000e*\u00020c2\u0006\u0010^\u001a\u00020\tH\u0016¢\u0006\u0004\bf\u0010gJ\u001f\u0010h\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bh\u0010iJ\u001b\u0010j\u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bj\u0010kJ\u000f\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020lH\u0014¢\u0006\u0004\bo\u0010nR\u0014\u0010q\u001a\u00020l8BX\u0004¢\u0006\u0006\u001a\u0004\bp\u0010nR \u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000r8\u0000X\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010x\u001a\u00020w8\u0016X\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0016\u0010!\u001a\u0004\u0018\u00010 8@X\u0004¢\u0006\u0006\u001a\u0004\b|\u0010AR\u0014\u0010~\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\bR\u0015\u0010\u0001\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\bR\u0016\u0010\u0001\u001a\u00020\u00068VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010\bR\u001f\u0010\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, d2 = {"Lcom/onedelhi/secure/ju;", "T", "Lcom/onedelhi/secure/tm0;", "Lcom/onedelhi/secure/iu;", "Lcom/onedelhi/secure/p90;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "E", "()Z", "", "cause", "t", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function0;", "Lcom/onedelhi/secure/un4;", "block", "r", "(Lcom/onedelhi/secure/cc1;)V", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "q", "(Lcom/onedelhi/secure/ec1;Ljava/lang/Throwable;)V", "V", "S", "Lcom/onedelhi/secure/fn0;", "D", "()Lcom/onedelhi/secure/fn0;", "L", "()V", "", "state", "H", "(Lcom/onedelhi/secure/ec1;Ljava/lang/Object;)V", "Lcom/onedelhi/secure/au;", "F", "(Lcom/onedelhi/secure/ec1;)Lcom/onedelhi/secure/au;", "", "mode", "x", "(I)V", "Lcom/onedelhi/secure/sr2;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "R", "(Lcom/onedelhi/secure/sr2;Ljava/lang/Object;ILcom/onedelhi/secure/ec1;Ljava/lang/Object;)Ljava/lang/Object;", "O", "(Ljava/lang/Object;ILcom/onedelhi/secure/ec1;)V", "Lcom/onedelhi/secure/l84;", "U", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)Lcom/onedelhi/secure/l84;", "", "o", "(Ljava/lang/Object;)Ljava/lang/Void;", "v", "M", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "P", "()Ljava/lang/StackTraceElement;", "m", "()Ljava/lang/Object;", "takenState", "e", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "a", "K", "(Ljava/lang/Throwable;)V", "p", "(Lcom/onedelhi/secure/au;Ljava/lang/Throwable;)V", "s", "Lcom/onedelhi/secure/ru1;", "parent", "z", "(Lcom/onedelhi/secure/ru1;)Ljava/lang/Throwable;", "A", "Lcom/onedelhi/secure/nl3;", "result", "m0", "(Ljava/lang/Object;)V", "value", "w", "(Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)V", "J", "(Lcom/onedelhi/secure/ec1;)V", "u", "y", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Z", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "exception", "j", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "N", "Lcom/onedelhi/secure/e90;", "G", "(Lcom/onedelhi/secure/e90;Ljava/lang/Object;)V", "n", "(Lcom/onedelhi/secure/e90;Ljava/lang/Throwable;)V", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "I", "C", "stateDebugRepresentation", "Lcom/onedelhi/secure/b80;", "delegate", "Lcom/onedelhi/secure/b80;", "g", "()Lcom/onedelhi/secure/b80;", "Lcom/onedelhi/secure/b90;", "context", "Lcom/onedelhi/secure/b90;", "f", "()Lcom/onedelhi/secure/b90;", "B", "b", "isActive", "d", "isCompleted", "isCancelled", "i", "()Lcom/onedelhi/secure/p90;", "callerFrame", "<init>", "(Lcom/onedelhi/secure/b80;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@z73
/* renamed from: com.onedelhi.secure.ju */
public class C5847ju<T> extends tm0<T> implements C5744iu<T>, p90 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30933a = AtomicIntegerFieldUpdater.newUpdater(C5847ju.class, "_decision");

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30934a = AtomicReferenceFieldUpdater.newUpdater(C5847ju.class, Object.class, "_state");
    @vr2
    private volatile /* synthetic */ int _decision = 0;
    @vr2
    private volatile /* synthetic */ Object _state = C7004v2.f36403a;
    @vr2

    /* renamed from: a */
    public final b80<T> f30935a;
    @vr2

    /* renamed from: a */
    public final b90 f30936a;
    @ss2

    /* renamed from: a */
    public fn0 f30937a;

    public C5847ju(@vr2 b80<? super T> b80, int i) {
        super(i);
        this.f30935a = b80;
        this.f30936a = b80.mo31187f();
    }

    /* renamed from: Q */
    public static /* synthetic */ void m53791Q(C5847ju juVar, Object obj, int i, ec1 ec1, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                ec1 = null;
            }
            juVar.mo38890O(obj, i, ec1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    @ss2
    @z73
    /* renamed from: A */
    public final Object mo38880A() {
        ru1 ru1;
        boolean E = mo38884E();
        if (mo38894V()) {
            if (this.f30937a == null) {
                mo38883D();
            }
            if (E) {
                mo38888L();
            }
            return mt1.m57558h();
        }
        if (E) {
            mo38888L();
        }
        Object B = mo38881B();
        if (B instanceof m20) {
            throw ((m20) B).f31975a;
        } else if (!um0.m67131c(this.f35730n) || (ru1 = (ru1) mo31187f().get(ru1.f34751a)) == null || ru1.mo32103b()) {
            return mo38898k(B);
        } else {
            CancellationException h = ru1.mo32113h();
            mo38895e(B, h);
            throw h;
        }
    }

    @ss2
    /* renamed from: B */
    public final Object mo38881B() {
        return this._state;
    }

    /* renamed from: C */
    public final String mo38882C() {
        Object B = mo38881B();
        return B instanceof sr2 ? "Active" : B instanceof C6900tu ? "Cancelled" : "Completed";
    }

    /* renamed from: D */
    public final fn0 mo38883D() {
        ru1 ru1 = (ru1) mo31187f().get(ru1.f34751a);
        if (ru1 == null) {
            return null;
        }
        fn0 f = ru1.C6713a.m63860f(ru1, true, false, new C6796sx(this), 2, (Object) null);
        this.f30937a = f;
        return f;
    }

    /* renamed from: E */
    public final boolean mo38884E() {
        return um0.m67132d(this.f35730n) && ((qm0) this.f30935a).mo43674t();
    }

    /* renamed from: F */
    public final C4592au mo38885F(ec1<? super Throwable, un4> ec1) {
        return ec1 instanceof C4592au ? (C4592au) ec1 : new au1(ec1);
    }

    /* renamed from: G */
    public void mo38231G(@vr2 e90 e90, T t) {
        b80<T> b80 = this.f30935a;
        e90 e902 = null;
        qm0 qm0 = b80 instanceof qm0 ? (qm0) b80 : null;
        if (qm0 != null) {
            e902 = qm0.f34311a;
        }
        m53791Q(this, t, e902 == e90 ? 4 : this.f35730n, (ec1) null, 4, (Object) null);
    }

    /* renamed from: H */
    public final void mo38886H(ec1<? super Throwable, un4> ec1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + ec1 + ", already has " + obj).toString());
    }

    @vr2
    /* renamed from: I */
    public String mo32151I() {
        return "CancellableContinuation";
    }

    /* renamed from: J */
    public void mo38232J(@vr2 ec1<? super Throwable, un4> ec1) {
        C4592au F = mo38885F(ec1);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C7004v2) {
                if (C5759j1.m52871a(f30934a, this, obj, F)) {
                    return;
                }
            } else if (obj instanceof C4592au) {
                mo38886H(ec1, obj);
            } else {
                boolean z = obj instanceof m20;
                if (z) {
                    m20 m20 = (m20) obj;
                    if (!m20.mo40423b()) {
                        mo38886H(ec1, obj);
                    }
                    if (obj instanceof C6900tu) {
                        Throwable th = null;
                        if (!z) {
                            m20 = null;
                        }
                        if (m20 != null) {
                            th = m20.f31975a;
                        }
                        mo38902q(ec1, th);
                        return;
                    }
                    return;
                } else if (obj instanceof k20) {
                    k20 k20 = (k20) obj;
                    if (k20.f31079a != null) {
                        mo38886H(ec1, obj);
                    }
                    if (!(F instanceof C5825jk)) {
                        if (k20.mo39012h()) {
                            mo38902q(ec1, k20.f31082a);
                            return;
                        }
                        if (C5759j1.m52871a(f30934a, this, obj, k20.m54009g(k20, (Object) null, F, (ec1) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(F instanceof C5825jk)) {
                    if (C5759j1.m52871a(f30934a, this, obj, new k20(obj, F, (ec1) null, (Object) null, (Throwable) null, 28, (wg0) null))) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: K */
    public final void mo38887K(@vr2 Throwable th) {
        if (!mo38905t(th)) {
            mo38236a(th);
            mo38908v();
        }
    }

    /* renamed from: L */
    public final void mo38888L() {
        b80<T> b80 = this.f30935a;
        Throwable th = null;
        qm0 qm0 = b80 instanceof qm0 ? (qm0) b80 : null;
        if (qm0 != null) {
            th = qm0.mo43669B(this);
        }
        if (th != null) {
            mo38907u();
            mo38236a(th);
        }
    }

    @uw1(name = "resetStateReusable")
    /* renamed from: M */
    public final boolean mo38889M() {
        Object obj = this._state;
        if (!(obj instanceof k20) || ((k20) obj).f31083b == null) {
            this._decision = 0;
            this._state = C7004v2.f36403a;
            return true;
        }
        mo38907u();
        return false;
    }

    /* renamed from: N */
    public void mo38233N(@vr2 Object obj) {
        mo38909x(this.f35730n);
    }

    /* renamed from: O */
    public final void mo38890O(Object obj, int i, ec1<? super Throwable, un4> ec1) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof sr2) {
            } else {
                if (obj2 instanceof C6900tu) {
                    C6900tu tuVar = (C6900tu) obj2;
                    if (tuVar.mo45310c()) {
                        if (ec1 != null) {
                            mo38904s(ec1, tuVar.f31975a);
                            return;
                        }
                        return;
                    }
                }
                mo38900o(obj);
                throw new b02();
            }
        } while (!C5759j1.m52871a(f30934a, this, obj2, mo38891R((sr2) obj2, obj, i, ec1, (Object) null)));
        mo38908v();
        mo38909x(i);
    }

    @ss2
    /* renamed from: P */
    public StackTraceElement mo35201P() {
        return null;
    }

    /* renamed from: R */
    public final Object mo38891R(sr2 sr2, Object obj, int i, ec1<? super Throwable, un4> ec1, Object obj2) {
        if (obj instanceof m20) {
            return obj;
        }
        if (!um0.m67131c(i) && obj2 == null) {
            return obj;
        }
        if (ec1 == null && ((!(sr2 instanceof C4592au) || (sr2 instanceof C5825jk)) && obj2 == null)) {
            return obj;
        }
        return new k20(obj, sr2 instanceof C4592au ? (C4592au) sr2 : null, ec1, obj2, (Throwable) null, 16, (wg0) null);
    }

    /* renamed from: S */
    public final boolean mo38892S() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f30933a.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: T */
    public void mo38234T() {
        fn0 D = mo38883D();
        if (D != null && mo38238d()) {
            D.mo30964e();
            this.f30937a = jr2.f30914a;
        }
    }

    /* renamed from: U */
    public final l84 mo38893U(Object obj, Object obj2, ec1<? super Throwable, un4> ec1) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof sr2) {
            } else if (!(obj3 instanceof k20) || obj2 == null || ((k20) obj3).f31083b != obj2) {
                return null;
            } else {
                return C5937ku.f31431a;
            }
        } while (!C5759j1.m52871a(f30934a, this, obj3, mo38891R((sr2) obj3, obj, this.f35730n, ec1, obj2)));
        mo38908v();
        return C5937ku.f31431a;
    }

    /* renamed from: V */
    public final boolean mo38894V() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f30933a.compareAndSet(this, 0, 1));
        return true;
    }

    @ss2
    /* renamed from: Z */
    public Object mo38235Z(T t, @ss2 Object obj, @ss2 ec1<? super Throwable, un4> ec1) {
        return mo38893U(t, obj, ec1);
    }

    /* renamed from: a */
    public boolean mo38236a(@ss2 Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof sr2)) {
                return false;
            }
            z = obj instanceof C4592au;
        } while (!C5759j1.m52871a(f30934a, this, obj, new C6900tu(this, th, z)));
        C4592au auVar = z ? (C4592au) obj : null;
        if (auVar != null) {
            mo38901p(auVar, th);
        }
        mo38908v();
        mo38909x(this.f35730n);
        return true;
    }

    /* renamed from: b */
    public boolean mo38237b() {
        return mo38881B() instanceof sr2;
    }

    /* renamed from: d */
    public boolean mo38238d() {
        return !(mo38881B() instanceof sr2);
    }

    /* renamed from: e */
    public void mo38895e(@ss2 Object obj, @vr2 Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof sr2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof m20)) {
                if (obj2 instanceof k20) {
                    k20 k20 = (k20) obj2;
                    if (!k20.mo39012h()) {
                        if (C5759j1.m52871a(f30934a, this, obj2, k20.m54009g(k20, (Object) null, (C4592au) null, (ec1) null, (Object) null, th, 15, (Object) null))) {
                            k20.mo39014i(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (C5759j1.m52871a(f30934a, this, obj2, new k20(obj2, (C4592au) null, (ec1) null, (Object) null, th, 14, (wg0) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @vr2
    /* renamed from: f */
    public b90 mo31187f() {
        return this.f30936a;
    }

    @vr2
    /* renamed from: g */
    public final b80<T> mo38896g() {
        return this.f30935a;
    }

    @ss2
    /* renamed from: h */
    public Throwable mo38897h(@ss2 Object obj) {
        Throwable h = super.mo38897h(obj);
        if (h == null) {
            return null;
        }
        mo38896g();
        return h;
    }

    @ss2
    /* renamed from: i */
    public p90 mo35202i() {
        b80<T> b80 = this.f30935a;
        if (b80 instanceof p90) {
            return (p90) b80;
        }
        return null;
    }

    public boolean isCancelled() {
        return mo38881B() instanceof C6900tu;
    }

    @ss2
    /* renamed from: j */
    public Object mo38240j(@vr2 Throwable th) {
        return mo38893U(new m20(th, false, 2, (wg0) null), (Object) null, (ec1<? super Throwable, un4>) null);
    }

    /* renamed from: k */
    public <T> T mo38898k(@ss2 Object obj) {
        return obj instanceof k20 ? ((k20) obj).f31081a : obj;
    }

    @ss2
    /* renamed from: m */
    public Object mo38899m() {
        return mo38881B();
    }

    /* renamed from: m0 */
    public void mo31191m0(@vr2 Object obj) {
        m53791Q(this, s20.m64134b(obj, this), this.f35730n, (ec1) null, 4, (Object) null);
    }

    /* renamed from: n */
    public void mo38241n(@vr2 e90 e90, @vr2 Throwable th) {
        b80<T> b80 = this.f30935a;
        e90 e902 = null;
        qm0 qm0 = b80 instanceof qm0 ? (qm0) b80 : null;
        m20 m20 = new m20(th, false, 2, (wg0) null);
        if (qm0 != null) {
            e902 = qm0.f34311a;
        }
        m53791Q(this, m20, e902 == e90 ? 4 : this.f35730n, (ec1) null, 4, (Object) null);
    }

    /* renamed from: o */
    public final Void mo38900o(Object obj) {
        throw new IllegalStateException(jt1.m53745C("Already resumed, but proposed with update ", obj).toString());
    }

    /* renamed from: p */
    public final void mo38901p(@vr2 C4592au auVar, @ss2 Throwable th) {
        try {
            auVar.mo31185a(th);
        } catch (Throwable th2) {
            h90.m50304b(mo31187f(), new p20(jt1.m53745C("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: q */
    public final void mo38902q(ec1<? super Throwable, un4> ec1, Throwable th) {
        try {
            ec1.mo17094X(th);
        } catch (Throwable th2) {
            h90.m50304b(mo31187f(), new p20(jt1.m53745C("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: r */
    public final void mo38903r(cc1<un4> cc1) {
        try {
            cc1.invoke();
        } catch (Throwable th) {
            h90.m50304b(mo31187f(), new p20(jt1.m53745C("Exception in invokeOnCancellation handler for ", this), th));
        }
    }

    /* renamed from: s */
    public final void mo38904s(@vr2 ec1<? super Throwable, un4> ec1, @vr2 Throwable th) {
        try {
            ec1.mo17094X(th);
        } catch (Throwable th2) {
            h90.m50304b(mo31187f(), new p20(jt1.m53745C("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    /* renamed from: t */
    public final boolean mo38905t(Throwable th) {
        if (!mo38884E()) {
            return false;
        }
        return ((qm0) this.f30935a).mo43676u(th);
    }

    @vr2
    public String toString() {
        return mo32151I() + '(' + if0.m52226c(this.f30935a) + "){" + mo38882C() + "}@" + if0.m52225b(this);
    }

    /* renamed from: u */
    public final void mo38907u() {
        fn0 fn0 = this.f30937a;
        if (fn0 != null) {
            fn0.mo30964e();
            this.f30937a = jr2.f30914a;
        }
    }

    /* renamed from: v */
    public final void mo38908v() {
        if (!mo38884E()) {
            mo38907u();
        }
    }

    /* renamed from: w */
    public void mo38242w(T t, @ss2 ec1<? super Throwable, un4> ec1) {
        mo38890O(t, this.f35730n, ec1);
    }

    /* renamed from: x */
    public final void mo38909x(int i) {
        if (!mo38892S()) {
            um0.m67129a(this, i);
        }
    }

    @ss2
    /* renamed from: y */
    public Object mo38243y(T t, @ss2 Object obj) {
        return mo38893U(t, obj, (ec1<? super Throwable, un4>) null);
    }

    @vr2
    /* renamed from: z */
    public Throwable mo32152z(@vr2 ru1 ru1) {
        return ru1.mo32113h();
    }
}

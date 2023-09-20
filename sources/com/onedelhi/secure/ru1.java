package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u001fJ\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\b\u0010\n\u001a\u00020\bH\u0017J\u0014\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000bH'J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'J\u0013\u0010\u0011\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\u00020\u00182'\u0010\u0017\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0016H&JE\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052'\u0010\u0017\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0016H'J\u0011\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0002R\u0014\u0010!\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010$\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/onedelhi/secure/ru1;", "Lcom/onedelhi/secure/b90$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "h", "", "O0", "cause", "Lcom/onedelhi/secure/un4;", "c", "cancel", "", "a", "Lcom/onedelhi/secure/vx;", "child", "Lcom/onedelhi/secure/tx;", "l", "X", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lcom/onedelhi/secure/fn0;", "F0", "onCancelling", "invokeImmediately", "j0", "other", "q", "b", "()Z", "isActive", "d", "isCompleted", "isCancelled", "Lcom/onedelhi/secure/zt3;", "m", "()Lcom/onedelhi/secure/zt3;", "children", "Lcom/onedelhi/secure/ft3;", "o0", "()Lcom/onedelhi/secure/ft3;", "onJoin", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface ru1 extends b90.C4634b {
    @vr2

    /* renamed from: a */
    public static final C6714b f34751a = C6714b.f34752b;

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.ru1$a */
    public static final class C6713a {
        /* renamed from: b */
        public static /* synthetic */ void m63856b(ru1 ru1, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                ru1.mo32105c(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: c */
        public static /* synthetic */ boolean m63857c(ru1 ru1, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return ru1.mo32101a(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: d */
        public static <R> R m63858d(@vr2 ru1 ru1, R r, @vr2 sc1<? super R, ? super b90.C4634b, ? extends R> sc1) {
            return b90.C4634b.C4635a.m39502a(ru1, r, sc1);
        }

        @ss2
        /* renamed from: e */
        public static <E extends b90.C4634b> E m63859e(@vr2 ru1 ru1, @vr2 b90.C4636c<E> cVar) {
            return b90.C4634b.C4635a.m39503b(ru1, cVar);
        }

        /* renamed from: f */
        public static /* synthetic */ fn0 m63860f(ru1 ru1, boolean z, boolean z2, ec1 ec1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return ru1.mo32119j0(z, z2, ec1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        @vr2
        /* renamed from: g */
        public static b90 m63861g(@vr2 ru1 ru1, @vr2 b90.C4636c<?> cVar) {
            return b90.C4634b.C4635a.m39504c(ru1, cVar);
        }

        @vr2
        /* renamed from: h */
        public static b90 m63862h(@vr2 ru1 ru1, @vr2 b90 b90) {
            return b90.C4634b.C4635a.m39505d(ru1, b90);
        }

        @vr2
        @xj0(level = ak0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* renamed from: i */
        public static ru1 m63863i(@vr2 ru1 ru1, @vr2 ru1 ru12) {
            return ru12;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onedelhi/secure/ru1$b;", "Lcom/onedelhi/secure/b90$c;", "Lcom/onedelhi/secure/ru1;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.ru1$b */
    public static final class C6714b implements b90.C4636c<ru1> {

        /* renamed from: b */
        public static final /* synthetic */ C6714b f34752b = new C6714b();
    }

    @vr2
    /* renamed from: F0 */
    fn0 mo32078F0(@vr2 ec1<? super Throwable, un4> ec1);

    /* renamed from: O0 */
    boolean mo32087O0();

    @ss2
    /* renamed from: X */
    Object mo32096X(@vr2 b80<? super un4> b80);

    @xj0(level = ak0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: a */
    /* synthetic */ boolean mo32101a(Throwable th);

    /* renamed from: b */
    boolean mo32103b();

    /* renamed from: c */
    void mo32105c(@ss2 CancellationException cancellationException);

    @xj0(level = ak0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    /* renamed from: d */
    boolean mo32108d();

    @zs1
    @vr2
    /* renamed from: h */
    CancellationException mo32113h();

    boolean isCancelled();

    @zs1
    @vr2
    /* renamed from: j0 */
    fn0 mo32119j0(boolean z, boolean z2, @vr2 ec1<? super Throwable, un4> ec1);

    @zs1
    @vr2
    /* renamed from: l */
    C6904tx mo32123l(@vr2 C7105vx vxVar);

    @vr2
    /* renamed from: m */
    zt3<ru1> mo32124m();

    @vr2
    /* renamed from: o0 */
    ft3 mo32128o0();

    @vr2
    @xj0(level = ak0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    /* renamed from: q */
    ru1 mo32130q(@vr2 ru1 ru1);
}

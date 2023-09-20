package com.onedelhi.secure;

import com.onedelhi.secure.ru1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b3\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0013\u0010\u0006\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00060\bj\u0002`\tH\u0017J1\u0010\u0013\u001a\u00020\u00122'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017JA\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017J\u0018\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0017J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0017J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u001a\u0010#\u001a\u00020\u00038VX\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\u00038VX\u0004¢\u0006\f\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010 R\u001a\u0010'\u001a\u00020\u00038VX\u0004¢\u0006\f\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010 R\u001a\u0010-\u001a\u00020)8VX\u0004¢\u0006\f\u0012\u0004\b,\u0010\"\u001a\u0004\b*\u0010+R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00020.8VX\u0004¢\u0006\f\u0012\u0004\b1\u0010\"\u001a\u0004\b/\u00100\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/onedelhi/secure/ir2;", "Lcom/onedelhi/secure/m0;", "Lcom/onedelhi/secure/ru1;", "", "O0", "Lcom/onedelhi/secure/un4;", "X", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "h", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/iy2;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lcom/onedelhi/secure/fn0;", "F0", "onCancelling", "invokeImmediately", "j0", "c", "a", "Lcom/onedelhi/secure/vx;", "child", "Lcom/onedelhi/secure/tx;", "l", "", "toString", "b", "()Z", "isActive$annotations", "()V", "isActive", "d", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "Lcom/onedelhi/secure/ft3;", "o0", "()Lcom/onedelhi/secure/ft3;", "getOnJoin$annotations", "onJoin", "Lcom/onedelhi/secure/zt3;", "m", "()Lcom/onedelhi/secure/zt3;", "getChildren$annotations", "children", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ir2 extends C6072m0 implements ru1 {
    @vr2

    /* renamed from: a */
    public static final ir2 f30435a = new ir2();
    @vr2

    /* renamed from: b */
    public static final String f30436b = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    public ir2() {
        super(ru1.f34751a);
    }

    @xj0(level = ak0.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: Q0 */
    public static /* synthetic */ void m52600Q0() {
    }

    @xj0(level = ak0.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: R0 */
    public static /* synthetic */ void m52601R0() {
    }

    @xj0(level = ak0.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: S0 */
    public static /* synthetic */ void m52602S0() {
    }

    @xj0(level = ak0.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: V0 */
    public static /* synthetic */ void m52603V0() {
    }

    @xj0(level = ak0.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: b1 */
    public static /* synthetic */ void m52604b1() {
    }

    @vr2
    @xj0(level = ak0.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: F0 */
    public fn0 mo32078F0(@vr2 ec1<? super Throwable, un4> ec1) {
        return jr2.f30914a;
    }

    @xj0(level = ak0.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: O0 */
    public boolean mo32087O0() {
        return false;
    }

    @ss2
    @xj0(level = ak0.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: X */
    public Object mo32096X(@vr2 b80<? super un4> b80) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @xj0(level = ak0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: a */
    public /* synthetic */ boolean mo32101a(Throwable th) {
        return false;
    }

    /* renamed from: b */
    public boolean mo32103b() {
        return true;
    }

    @xj0(level = ak0.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: c */
    public void mo32105c(@ss2 CancellationException cancellationException) {
    }

    @xj0(level = ak0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        mo32105c((CancellationException) null);
    }

    /* renamed from: d */
    public boolean mo32108d() {
        return false;
    }

    @vr2
    @xj0(level = ak0.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: h */
    public CancellationException mo32113h() {
        throw new IllegalStateException("This job is always active");
    }

    public boolean isCancelled() {
        return false;
    }

    @vr2
    @xj0(level = ak0.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: j0 */
    public fn0 mo32119j0(boolean z, boolean z2, @vr2 ec1<? super Throwable, un4> ec1) {
        return jr2.f30914a;
    }

    @vr2
    @xj0(level = ak0.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* renamed from: l */
    public C6904tx mo32123l(@vr2 C7105vx vxVar) {
        return jr2.f30914a;
    }

    @vr2
    /* renamed from: m */
    public zt3<ru1> mo32124m() {
        return fu3.m48489g();
    }

    @vr2
    /* renamed from: o0 */
    public ft3 mo32128o0() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @vr2
    @xj0(level = ak0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    /* renamed from: q */
    public ru1 mo32130q(@vr2 ru1 ru1) {
        return ru1.C6713a.m63863i(this, ru1);
    }

    @vr2
    public String toString() {
        return "NonCancellable";
    }
}

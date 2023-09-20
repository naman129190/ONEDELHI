package com.onedelhi.secure;

import com.onedelhi.secure.st3;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u00105\u001a\u000204\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u00106\u001a\u00020\u000e¢\u0006\u0004\b7\u00108J.\u0010\f\u001a\u00020\u00032#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0006H\u0001J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0001J\u001b\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\r\u001a\u00028\u0000H\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u0016\u0010\u001b\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u000eH\u0014J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016R \u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u000e8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0*8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010(R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Lcom/onedelhi/secure/go;", "E", "Lcom/onedelhi/secure/l0;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/p53;", "Lcom/onedelhi/secure/eo;", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/iy2;", "name", "cause", "handler", "a0", "element", "", "L", "(Ljava/lang/Object;)Z", "Lcom/onedelhi/secure/lg3;", "W", "F", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/kw;", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "c", "t0", "value", "L1", "(Lcom/onedelhi/secure/un4;)V", "handled", "H1", "I", "_channel", "Lcom/onedelhi/secure/eo;", "K1", "()Lcom/onedelhi/secure/eo;", "Q", "()Z", "isClosedForSend", "Lcom/onedelhi/secure/ht3;", "Lcom/onedelhi/secure/st3;", "B", "()Lcom/onedelhi/secure/ht3;", "onSend", "b", "isActive", "S", "()Lcom/onedelhi/secure/st3;", "channel", "Lcom/onedelhi/secure/b90;", "parentContext", "active", "<init>", "(Lcom/onedelhi/secure/b90;Lcom/onedelhi/secure/eo;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.go */
public class C5441go<E> extends C5951l0<un4> implements p53<E>, C5168eo<E> {
    @vr2

    /* renamed from: a */
    public final C5168eo<E> f29242a;

    public C5441go(@vr2 b90 b90, @vr2 C5168eo<E> eoVar, boolean z) {
        super(b90, false, z);
        this.f29242a = eoVar;
        mo32095W0((ru1) b90.get(ru1.f34751a));
    }

    @vr2
    /* renamed from: B */
    public ht3<E, st3<E>> mo36800B() {
        return this.f29242a.mo36800B();
    }

    @ss2
    /* renamed from: F */
    public Object mo36801F(E e, @vr2 b80<? super un4> b80) {
        return this.f29242a.mo36801F(e, b80);
    }

    /* renamed from: H1 */
    public void mo36802H1(@vr2 Throwable th, boolean z) {
        if (!this.f29242a.mo36803I(th) && !z) {
            h90.m50304b(mo31187f(), th);
        }
    }

    /* renamed from: I */
    public boolean mo36803I(@ss2 Throwable th) {
        boolean I = this.f29242a.mo36803I(th);
        mo32087O0();
        return I;
    }

    @vr2
    /* renamed from: K1 */
    public final C5168eo<E> mo36805K1() {
        return this.f29242a;
    }

    @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @oi3(expression = "trySend(element).isSuccess", imports = {}))
    /* renamed from: L */
    public boolean mo36806L(E e) {
        return this.f29242a.mo36806L(e);
    }

    /* renamed from: L1 */
    public void mo36804I1(@vr2 un4 un4) {
        st3.C6793a.m64879a(this.f29242a, (Throwable) null, 1, (Object) null);
    }

    /* renamed from: Q */
    public boolean mo36808Q() {
        return this.f29242a.mo36808Q();
    }

    @vr2
    /* renamed from: S */
    public st3<E> mo36809S() {
        return this;
    }

    @vr2
    /* renamed from: W */
    public lg3<E> mo30419W() {
        return this.f29242a.mo30419W();
    }

    @xj0(level = ak0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: a */
    public final /* synthetic */ boolean mo32101a(Throwable th) {
        if (th == null) {
            th = new su1(mo32146x0(), (Throwable) null, this);
        }
        mo32138t0(th);
        return true;
    }

    @fy0
    /* renamed from: a0 */
    public void mo36810a0(@vr2 ec1<? super Throwable, un4> ec1) {
        this.f29242a.mo36810a0(ec1);
    }

    /* renamed from: b */
    public boolean mo32103b() {
        return super.mo32103b();
    }

    /* renamed from: c */
    public final void mo32105c(@ss2 CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new su1(mo32146x0(), (Throwable) null, this);
        }
        mo32138t0(cancellationException);
    }

    @vr2
    /* renamed from: e */
    public Object mo36811e(E e) {
        return this.f29242a.mo36811e(e);
    }

    /* renamed from: t0 */
    public void mo32138t0(@vr2 Throwable th) {
        CancellationException y1 = bv1.m40481y1(this, th, (String) null, 1, (Object) null);
        this.f29242a.mo35517c(y1);
        mo32133r0(y1);
    }
}

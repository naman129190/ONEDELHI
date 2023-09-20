package com.onedelhi.secure;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010?\u001a\u00020>\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010@\u001a\u00020\u0007\u0012\u0006\u0010A\u001a\u00020\u0007¢\u0006\u0004\bB\u0010CJ\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001J.\u0010\r\u001a\u00020\u00032#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\tH\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0003J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017HAø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u0004\u0018\u00018\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u0014J'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0010\u001a\u00028\u0000H\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0012\u0010 \u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0016\u0010#\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b.\u0010*R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170/8\u0016X\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b3\u00101R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/8VX\u0005¢\u0006\u0006\u001a\u0004\b5\u00101R&\u0010;\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000008078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010(\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Lcom/onedelhi/secure/yv;", "E", "Lcom/onedelhi/secure/l0;", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wv;", "", "cause", "", "I", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "handler", "a0", "Lcom/onedelhi/secure/hw;", "R", "element", "L", "(Ljava/lang/Object;)Z", "V", "()Ljava/lang/Object;", "r", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/kw;", "O", "z", "F", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "x", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancel", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "c", "t0", "_channel", "Lcom/onedelhi/secure/wv;", "K1", "()Lcom/onedelhi/secure/wv;", "C", "()Z", "isClosedForReceive", "Q", "isClosedForSend", "isEmpty", "Lcom/onedelhi/secure/gt3;", "k", "()Lcom/onedelhi/secure/gt3;", "onReceive", "U", "onReceiveCatching", "t", "onReceiveOrNull", "Lcom/onedelhi/secure/ht3;", "Lcom/onedelhi/secure/st3;", "B", "()Lcom/onedelhi/secure/ht3;", "onSend", "v", "channel", "Lcom/onedelhi/secure/b90;", "parentContext", "initParentJob", "active", "<init>", "(Lcom/onedelhi/secure/b90;Lcom/onedelhi/secure/wv;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.yv */
public class C7391yv<E> extends C5951l0<un4> implements C7184wv<E> {
    @vr2

    /* renamed from: a */
    public final C7184wv<E> f38067a;

    public C7391yv(@vr2 b90 b90, @vr2 C7184wv<E> wvVar, boolean z, boolean z2) {
        super(b90, z, z2);
        this.f38067a = wvVar;
    }

    @vr2
    /* renamed from: B */
    public ht3<E, st3<E>> mo36800B() {
        return this.f38067a.mo36800B();
    }

    /* renamed from: C */
    public boolean mo31519C() {
        return this.f38067a.mo31519C();
    }

    @ss2
    /* renamed from: F */
    public Object mo36801F(E e, @vr2 b80<? super un4> b80) {
        return this.f38067a.mo36801F(e, b80);
    }

    /* renamed from: I */
    public boolean mo36803I(@ss2 Throwable th) {
        return this.f38067a.mo36803I(th);
    }

    @vr2
    /* renamed from: K1 */
    public final C7184wv<E> mo48009K1() {
        return this.f38067a;
    }

    @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @oi3(expression = "trySend(element).isSuccess", imports = {}))
    /* renamed from: L */
    public boolean mo36806L(E e) {
        return this.f38067a.mo36806L(e);
    }

    @ss2
    /* renamed from: O */
    public Object mo37692O(@vr2 b80<? super C5945kw<? extends E>> b80) {
        Object O = this.f38067a.mo37692O(b80);
        mt1.m57558h();
        return O;
    }

    /* renamed from: Q */
    public boolean mo36808Q() {
        return this.f38067a.mo36808Q();
    }

    @vr2
    /* renamed from: R */
    public C5600hw<E> mo37693R() {
        return this.f38067a.mo37693R();
    }

    @vr2
    /* renamed from: U */
    public gt3<C5945kw<E>> mo37695U() {
        return this.f38067a.mo37695U();
    }

    @ss2
    @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @oi3(expression = "tryReceive().getOrNull()", imports = {}))
    /* renamed from: V */
    public E mo37696V() {
        return this.f38067a.mo37696V();
    }

    @xj0(level = ak0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: a */
    public final /* synthetic */ boolean mo32101a(Throwable th) {
        mo32138t0(new su1(mo32146x0(), (Throwable) null, this));
        return true;
    }

    @fy0
    /* renamed from: a0 */
    public void mo36810a0(@vr2 ec1<? super Throwable, un4> ec1) {
        this.f38067a.mo36810a0(ec1);
    }

    /* renamed from: c */
    public final void mo32105c(@ss2 CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new su1(mo32146x0(), (Throwable) null, this);
            }
            mo32138t0(cancellationException);
        }
    }

    public /* synthetic */ void cancel() {
        mo32138t0(new su1(mo32146x0(), (Throwable) null, this));
    }

    @vr2
    /* renamed from: e */
    public Object mo36811e(E e) {
        return this.f38067a.mo36811e(e);
    }

    public boolean isEmpty() {
        return this.f38067a.isEmpty();
    }

    @vr2
    /* renamed from: k */
    public gt3<E> mo37705k() {
        return this.f38067a.mo37705k();
    }

    @ss2
    /* renamed from: r */
    public Object mo37710r(@vr2 b80<? super E> b80) {
        return this.f38067a.mo37710r(b80);
    }

    @vr2
    /* renamed from: t */
    public gt3<E> mo37712t() {
        return this.f38067a.mo37712t();
    }

    /* renamed from: t0 */
    public void mo32138t0(@vr2 Throwable th) {
        CancellationException y1 = bv1.m40481y1(this, th, (String) null, 1, (Object) null);
        this.f38067a.mo37698c(y1);
        mo32133r0(y1);
    }

    @vr2
    /* renamed from: v */
    public final C7184wv<E> mo48010v() {
        return this;
    }

    @vr2
    /* renamed from: x */
    public Object mo37716x() {
        return this.f38067a.mo37716x();
    }

    @xj0(level = ak0.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @oi3(expression = "receiveCatching().getOrNull()", imports = {}))
    @ib2
    @ss2
    /* renamed from: z */
    public Object mo37717z(@vr2 b80<? super E> b80) {
        return this.f38067a.mo37717z(b80);
    }
}

package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J-\u0010\u0012\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u000eH'J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lcom/onedelhi/secure/st3;", "E", "", "element", "Lcom/onedelhi/secure/un4;", "F", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/kw;", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "I", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "handler", "a0", "L", "(Ljava/lang/Object;)Z", "Q", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "Lcom/onedelhi/secure/ht3;", "B", "()Lcom/onedelhi/secure/ht3;", "onSend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface st3<E> {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.st3$a */
    public static final class C6793a {
        /* renamed from: a */
        public static /* synthetic */ boolean m64879a(st3 st3, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return st3.mo36803I(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }

        @fy0
        /* renamed from: b */
        public static /* synthetic */ void m64880b() {
        }

        @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @oi3(expression = "trySend(element).isSuccess", imports = {}))
        /* renamed from: c */
        public static <E> boolean m64881c(@vr2 st3<? super E> st3, E e) {
            Object e2 = st3.mo36811e(e);
            if (C5945kw.m55076m(e2)) {
                return true;
            }
            Throwable f = C5945kw.m55069f(e2);
            if (f == null) {
                return false;
            }
            throw i24.m51757p(f);
        }
    }

    @vr2
    /* renamed from: B */
    ht3<E, st3<E>> mo36800B();

    @ss2
    /* renamed from: F */
    Object mo36801F(E e, @vr2 b80<? super un4> b80);

    /* renamed from: I */
    boolean mo36803I(@ss2 Throwable th);

    @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @oi3(expression = "trySend(element).isSuccess", imports = {}))
    /* renamed from: L */
    boolean mo36806L(E e);

    /* renamed from: Q */
    boolean mo36808Q();

    @fy0
    /* renamed from: a0 */
    void mo36810a0(@vr2 ec1<? super Throwable, un4> ec1);

    @vr2
    /* renamed from: e */
    Object mo36811e(E e);
}

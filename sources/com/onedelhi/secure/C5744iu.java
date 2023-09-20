package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\tH'J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H'J\b\u0010\u0001\u001a\u00020\rH'J\u0014\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH&J1\u0010\u0019\u001a\u00020\r2'\u0010\u0018\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u0017H&J\u001b\u0010\u001b\u001a\u00020\r*\u00020\u001a2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\r*\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\tH'J<\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010%\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!¨\u0006&"}, d2 = {"Lcom/onedelhi/secure/iu;", "T", "Lcom/onedelhi/secure/b80;", "value", "", "idempotent", "y", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/iy2;", "name", "cause", "Lcom/onedelhi/secure/un4;", "onCancellation", "Z", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "exception", "j", "token", "N", "", "a", "Lkotlinx/coroutines/CompletionHandler;", "handler", "J", "Lcom/onedelhi/secure/e90;", "G", "(Lcom/onedelhi/secure/e90;Ljava/lang/Object;)V", "n", "w", "(Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)V", "b", "()Z", "isActive", "d", "isCompleted", "isCancelled", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.iu */
public interface C5744iu<T> extends b80<T> {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.iu$a */
    public static final class C5745a {
        /* renamed from: a */
        public static /* synthetic */ boolean m52675a(C5744iu iuVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return iuVar.mo38236a(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m52676b(C5744iu iuVar, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                return iuVar.mo38243y(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    @fy0
    /* renamed from: G */
    void mo38231G(@vr2 e90 e90, T t);

    /* renamed from: J */
    void mo38232J(@vr2 ec1<? super Throwable, un4> ec1);

    @zs1
    /* renamed from: N */
    void mo38233N(@vr2 Object obj);

    @zs1
    /* renamed from: T */
    void mo38234T();

    @zs1
    @ss2
    /* renamed from: Z */
    Object mo38235Z(T t, @ss2 Object obj, @ss2 ec1<? super Throwable, un4> ec1);

    /* renamed from: a */
    boolean mo38236a(@ss2 Throwable th);

    /* renamed from: b */
    boolean mo38237b();

    /* renamed from: d */
    boolean mo38238d();

    boolean isCancelled();

    @zs1
    @ss2
    /* renamed from: j */
    Object mo38240j(@vr2 Throwable th);

    @fy0
    /* renamed from: n */
    void mo38241n(@vr2 e90 e90, @vr2 Throwable th);

    @fy0
    /* renamed from: w */
    void mo38242w(T t, @ss2 ec1<? super Throwable, un4> ec1);

    @zs1
    @ss2
    /* renamed from: y */
    Object mo38243y(T t, @ss2 Object obj);
}

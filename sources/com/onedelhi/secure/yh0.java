package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import com.onedelhi.secure.ru1;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H'R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/onedelhi/secure/yh0;", "T", "Lcom/onedelhi/secure/ru1;", "G0", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "p", "()Ljava/lang/Object;", "", "K", "Lcom/onedelhi/secure/gt3;", "H", "()Lcom/onedelhi/secure/gt3;", "onAwait", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface yh0<T> extends ru1 {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.yh0$a */
    public static final class C7361a {
        /* renamed from: b */
        public static <T, R> R m71745b(@vr2 yh0<? extends T> yh0, R r, @vr2 sc1<? super R, ? super b90.C4634b, ? extends R> sc1) {
            return ru1.C6713a.m63858d(yh0, r, sc1);
        }

        @ss2
        /* renamed from: c */
        public static <T, E extends b90.C4634b> E m71746c(@vr2 yh0<? extends T> yh0, @vr2 b90.C4636c<E> cVar) {
            return ru1.C6713a.m63859e(yh0, cVar);
        }

        @vr2
        /* renamed from: d */
        public static <T> b90 m71747d(@vr2 yh0<? extends T> yh0, @vr2 b90.C4636c<?> cVar) {
            return ru1.C6713a.m63861g(yh0, cVar);
        }

        @vr2
        /* renamed from: e */
        public static <T> b90 m71748e(@vr2 yh0<? extends T> yh0, @vr2 b90 b90) {
            return ru1.C6713a.m63862h(yh0, b90);
        }

        @vr2
        @xj0(level = ak0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* renamed from: f */
        public static <T> ru1 m71749f(@vr2 yh0<? extends T> yh0, @vr2 ru1 ru1) {
            return ru1.C6713a.m63863i(yh0, ru1);
        }
    }

    @ss2
    /* renamed from: G0 */
    Object mo30930G0(@vr2 b80<? super T> b80);

    @vr2
    /* renamed from: H */
    gt3<T> mo30931H();

    @fy0
    @ss2
    /* renamed from: K */
    Throwable mo47806K();

    @fy0
    /* renamed from: p */
    T mo30933p();
}

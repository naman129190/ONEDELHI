package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import com.onedelhi.secure.ru1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@xj0(level = ak0.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¨\u0006\u0005"}, d2 = {"Lcom/onedelhi/secure/yy2;", "Lcom/onedelhi/secure/ru1;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "A", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@zs1
public interface yy2 extends ru1 {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.yy2$a */
    public static final class C7399a {
        /* renamed from: b */
        public static <R> R m72382b(@vr2 yy2 yy2, R r, @vr2 sc1<? super R, ? super b90.C4634b, ? extends R> sc1) {
            return ru1.C6713a.m63858d(yy2, r, sc1);
        }

        @ss2
        /* renamed from: c */
        public static <E extends b90.C4634b> E m72383c(@vr2 yy2 yy2, @vr2 b90.C4636c<E> cVar) {
            return ru1.C6713a.m63859e(yy2, cVar);
        }

        @vr2
        /* renamed from: d */
        public static b90 m72384d(@vr2 yy2 yy2, @vr2 b90.C4636c<?> cVar) {
            return ru1.C6713a.m63861g(yy2, cVar);
        }

        @vr2
        /* renamed from: e */
        public static b90 m72385e(@vr2 yy2 yy2, @vr2 b90 b90) {
            return ru1.C6713a.m63862h(yy2, b90);
        }

        @vr2
        @xj0(level = ak0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* renamed from: f */
        public static ru1 m72386f(@vr2 yy2 yy2, @vr2 ru1 ru1) {
            return ru1.C6713a.m63863i(yy2, ru1);
        }
    }

    @zs1
    @vr2
    /* renamed from: A */
    CancellationException mo32069A();
}

package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import com.onedelhi.secure.ru1;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lcom/onedelhi/secure/j20;", "Lcom/onedelhi/secure/ru1;", "", "C0", "", "exception", "g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface j20 extends ru1 {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.j20$a */
    public static final class C5760a {
        /* renamed from: b */
        public static <R> R m52879b(@vr2 j20 j20, R r, @vr2 sc1<? super R, ? super b90.C4634b, ? extends R> sc1) {
            return ru1.C6713a.m63858d(j20, r, sc1);
        }

        @ss2
        /* renamed from: c */
        public static <E extends b90.C4634b> E m52880c(@vr2 j20 j20, @vr2 b90.C4636c<E> cVar) {
            return ru1.C6713a.m63859e(j20, cVar);
        }

        @vr2
        /* renamed from: d */
        public static b90 m52881d(@vr2 j20 j20, @vr2 b90.C4636c<?> cVar) {
            return ru1.C6713a.m63861g(j20, cVar);
        }

        @vr2
        /* renamed from: e */
        public static b90 m52882e(@vr2 j20 j20, @vr2 b90 b90) {
            return ru1.C6713a.m63862h(j20, b90);
        }

        @vr2
        @xj0(level = ak0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* renamed from: f */
        public static ru1 m52883f(@vr2 j20 j20, @vr2 ru1 ru1) {
            return ru1.C6713a.m63863i(j20, ru1);
        }
    }

    /* renamed from: C0 */
    boolean mo38382C0();

    /* renamed from: g */
    boolean mo38383g(@vr2 Throwable th);
}

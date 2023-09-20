package com.onedelhi.secure;

import com.onedelhi.secure.b90;
import com.onedelhi.secure.ru1;
import kotlin.Metadata;

@xj0(level = ak0.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, d2 = {"Lcom/onedelhi/secure/vx;", "Lcom/onedelhi/secure/ru1;", "Lcom/onedelhi/secure/yy2;", "parentJob", "Lcom/onedelhi/secure/un4;", "Y", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@zs1
/* renamed from: com.onedelhi.secure.vx */
public interface C7105vx extends ru1 {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.vx$a */
    public static final class C7106a {
        /* renamed from: b */
        public static <R> R m68584b(@vr2 C7105vx vxVar, R r, @vr2 sc1<? super R, ? super b90.C4634b, ? extends R> sc1) {
            return ru1.C6713a.m63858d(vxVar, r, sc1);
        }

        @ss2
        /* renamed from: c */
        public static <E extends b90.C4634b> E m68585c(@vr2 C7105vx vxVar, @vr2 b90.C4636c<E> cVar) {
            return ru1.C6713a.m63859e(vxVar, cVar);
        }

        @vr2
        /* renamed from: d */
        public static b90 m68586d(@vr2 C7105vx vxVar, @vr2 b90.C4636c<?> cVar) {
            return ru1.C6713a.m63861g(vxVar, cVar);
        }

        @vr2
        /* renamed from: e */
        public static b90 m68587e(@vr2 C7105vx vxVar, @vr2 b90 b90) {
            return ru1.C6713a.m63862h(vxVar, b90);
        }

        @vr2
        @xj0(level = ak0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* renamed from: f */
        public static ru1 m68588f(@vr2 C7105vx vxVar, @vr2 ru1 ru1) {
            return ru1.C6713a.m63863i(vxVar, ru1);
        }
    }

    @zs1
    /* renamed from: Y */
    void mo32098Y(@vr2 yy2 yy2);
}

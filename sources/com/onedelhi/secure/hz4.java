package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Lcom/onedelhi/secure/un4;", "a", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class hz4 {
    @ss2
    /* renamed from: a */
    public static final Object m51317a(@vr2 b80<? super un4> b80) {
        Object obj;
        b90 f = b80.mo31187f();
        xu1.m70832z(f);
        b80<? super un4> d = lt1.m56482d(b80);
        qm0 qm0 = d instanceof qm0 ? (qm0) d : null;
        if (qm0 == null) {
            obj = un4.f36206a;
        } else {
            if (qm0.f34311a.mo31903S0(f)) {
                qm0.mo43672q(f, un4.f36206a);
            } else {
                gz4 gz4 = new gz4();
                b90 plus = f.plus(gz4);
                un4 un4 = un4.f36206a;
                qm0.mo43672q(plus, un4);
                if (gz4.f29346b && !rm0.m63749h(qm0)) {
                    obj = un4;
                }
            }
            obj = mt1.m57558h();
        }
        if (obj == mt1.m57558h()) {
            hf0.m50483c(b80);
        }
        return obj == mt1.m57558h() ? obj : un4.f36206a;
    }
}

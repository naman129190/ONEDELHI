package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class ck5 {

    /* renamed from: a */
    public final io5 f10313a = new io5();

    /* renamed from: a */
    public final Map f10314a = new HashMap();

    public ck5() {
        mo14171b(new mj5());
        mo14171b(new kk5());
        mo14171b(new sk5());
        mo14171b(new sm5());
        mo14171b(new wn5());
        mo14171b(new co5());
        mo14171b(new oo5());
    }

    /* renamed from: a */
    public final qh5 mo14170a(w96 w96, qh5 qh5) {
        sd6.m27475c(w96);
        if (!(qh5 instanceof yh5)) {
            return qh5;
        }
        yh5 yh5 = (yh5) qh5;
        ArrayList c = yh5.mo27496c();
        String a = yh5.mo27495a();
        return (this.f10314a.containsKey(a) ? (uj5) this.f10314a.get(a) : this.f10313a).mo14315a(a, w96, c);
    }

    /* renamed from: b */
    public final void mo14171b(uj5 uj5) {
        for (to5 b : uj5.f21412a) {
            this.f10314a.put(b.mo25238b().toString(), uj5);
        }
    }
}

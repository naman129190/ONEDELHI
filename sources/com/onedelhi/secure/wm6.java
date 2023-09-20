package com.onedelhi.secure;

import java.util.HashMap;
import java.util.List;

public final class wm6 extends ef5 {

    /* renamed from: a */
    public final zb5 f22216a;

    public wm6(zb5 zb5) {
        super("internal.eventLogger");
        this.f22216a = zb5;
    }

    /* renamed from: a */
    public final qh5 mo14991a(w96 w96, List list) {
        sd6.m27480h(this.f11215b, 3, list);
        String b = w96.mo26465b((qh5) list.get(0)).mo13084b();
        long a = (long) sd6.m27473a(w96.mo26465b((qh5) list.get(1)).mo13085e().doubleValue());
        qh5 b2 = w96.mo26465b((qh5) list.get(2));
        this.f22216a.mo27905e(b, a, b2 instanceof sg5 ? sd6.m27479g((sg5) b2) : new HashMap());
        return qh5.f19182a;
    }
}

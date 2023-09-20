package com.onedelhi.secure;

import java.util.List;

public final class wr6 extends ef5 {

    /* renamed from: a */
    public final /* synthetic */ fv6 f22268a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wr6(ot6 ot6, String str, fv6 fv6) {
        super("getValue");
        this.f22268a = fv6;
    }

    /* renamed from: a */
    public final qh5 mo14991a(w96 w96, List list) {
        sd6.m27480h("getValue", 2, list);
        qh5 b = w96.mo26465b((qh5) list.get(0));
        qh5 b2 = w96.mo26465b((qh5) list.get(1));
        String a = this.f22268a.mo16197a(b.mo13084b());
        return a != null ? new wi5(a) : b2;
    }
}

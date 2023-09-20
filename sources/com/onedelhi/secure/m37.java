package com.onedelhi.secure;

import java.util.List;

public final class m37 extends ef5 {

    /* renamed from: a */
    public final l67 f15903a;

    public m37(l67 l67) {
        super("internal.registerCallback");
        this.f15903a = l67;
    }

    /* renamed from: a */
    public final qh5 mo14991a(w96 w96, List list) {
        sd6.m27480h(this.f11215b, 3, list);
        String b = w96.mo26465b((qh5) list.get(0)).mo13084b();
        qh5 b2 = w96.mo26465b((qh5) list.get(1));
        if (b2 instanceof ih5) {
            qh5 b3 = w96.mo26465b((qh5) list.get(2));
            if (b3 instanceof sg5) {
                sg5 sg5 = (sg5) b3;
                if (sg5.mo15168j("type")) {
                    this.f15903a.mo19289a(b, sg5.mo15168j("priority") ? sd6.m27474b(sg5.mo15167i("priority").mo13085e().doubleValue()) : 1000, (ih5) b2, sg5.mo15167i("type").mo13084b());
                    return qh5.f19182a;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}

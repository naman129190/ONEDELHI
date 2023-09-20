package com.onedelhi.secure;

import java.util.List;

public final class sm5 extends uj5 {
    public sm5() {
        this.f21412a.add(to5.AND);
        this.f21412a.add(to5.NOT);
        this.f21412a.add(to5.OR);
    }

    /* renamed from: a */
    public final qh5 mo14315a(String str, w96 w96, List list) {
        to5 to5 = to5.ADD;
        int ordinal = sd6.m27477e(str).ordinal();
        if (ordinal == 1) {
            sd6.m27480h(to5.AND.name(), 2, list);
            qh5 b = w96.mo26465b((qh5) list.get(0));
            if (!b.mo13087f().booleanValue()) {
                return b;
            }
        } else if (ordinal == 47) {
            sd6.m27480h(to5.NOT.name(), 1, list);
            return new xd5(Boolean.valueOf(!w96.mo26465b((qh5) list.get(0)).mo13087f().booleanValue()));
        } else if (ordinal != 50) {
            return super.mo25645b(str);
        } else {
            sd6.m27480h(to5.OR.name(), 2, list);
            qh5 b2 = w96.mo26465b((qh5) list.get(0));
            if (b2.mo13087f().booleanValue()) {
                return b2;
            }
        }
        return w96.mo26465b((qh5) list.get(1));
    }
}

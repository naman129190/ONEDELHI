package com.onedelhi.secure;

import java.util.List;

public final class co5 extends uj5 {
    public co5() {
        this.f21412a.add(to5.ADD);
        this.f21412a.add(to5.DIVIDE);
        this.f21412a.add(to5.MODULUS);
        this.f21412a.add(to5.MULTIPLY);
        this.f21412a.add(to5.NEGATE);
        this.f21412a.add(to5.POST_DECREMENT);
        this.f21412a.add(to5.POST_INCREMENT);
        this.f21412a.add(to5.PRE_DECREMENT);
        this.f21412a.add(to5.PRE_INCREMENT);
        this.f21412a.add(to5.SUBTRACT);
    }

    /* renamed from: a */
    public final qh5 mo14315a(String str, w96 w96, List list) {
        to5 to5 = to5.ADD;
        int ordinal = sd6.m27477e(str).ordinal();
        if (ordinal == 0) {
            sd6.m27480h(to5.name(), 2, list);
            qh5 b = w96.mo26465b((qh5) list.get(0));
            qh5 b2 = w96.mo26465b((qh5) list.get(1));
            if (!(b instanceof jg5) && !(b instanceof wi5) && !(b2 instanceof jg5) && !(b2 instanceof wi5)) {
                return new te5(Double.valueOf(b.mo13085e().doubleValue() + b2.mo13085e().doubleValue()));
            }
            return new wi5(String.valueOf(b.mo13084b()).concat(String.valueOf(b2.mo13084b())));
        } else if (ordinal == 21) {
            sd6.m27480h(to5.DIVIDE.name(), 2, list);
            return new te5(Double.valueOf(w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue() / w96.mo26465b((qh5) list.get(1)).mo13085e().doubleValue()));
        } else if (ordinal == 59) {
            sd6.m27480h(to5.SUBTRACT.name(), 2, list);
            return new te5(Double.valueOf(w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue() + new te5(Double.valueOf(-w96.mo26465b((qh5) list.get(1)).mo13085e().doubleValue())).mo13085e().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            sd6.m27480h(str, 2, list);
            qh5 b3 = w96.mo26465b((qh5) list.get(0));
            w96.mo26465b((qh5) list.get(1));
            return b3;
        } else if (ordinal == 55 || ordinal == 56) {
            sd6.m27480h(str, 1, list);
            return w96.mo26465b((qh5) list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    sd6.m27480h(to5.MODULUS.name(), 2, list);
                    return new te5(Double.valueOf(w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue() % w96.mo26465b((qh5) list.get(1)).mo13085e().doubleValue()));
                case 45:
                    sd6.m27480h(to5.MULTIPLY.name(), 2, list);
                    return new te5(Double.valueOf(w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue() * w96.mo26465b((qh5) list.get(1)).mo13085e().doubleValue()));
                case 46:
                    sd6.m27480h(to5.NEGATE.name(), 1, list);
                    return new te5(Double.valueOf(-w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue()));
                default:
                    return super.mo25645b(str);
            }
        }
    }
}

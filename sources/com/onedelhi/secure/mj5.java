package com.onedelhi.secure;

import java.util.List;

public final class mj5 extends uj5 {
    public mj5() {
        this.f21412a.add(to5.BITWISE_AND);
        this.f21412a.add(to5.BITWISE_LEFT_SHIFT);
        this.f21412a.add(to5.BITWISE_NOT);
        this.f21412a.add(to5.BITWISE_OR);
        this.f21412a.add(to5.BITWISE_RIGHT_SHIFT);
        this.f21412a.add(to5.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f21412a.add(to5.BITWISE_XOR);
    }

    /* renamed from: a */
    public final qh5 mo14315a(String str, w96 w96, List list) {
        to5 to5 = to5.ADD;
        switch (sd6.m27477e(str).ordinal()) {
            case 4:
                sd6.m27480h(to5.BITWISE_AND.name(), 2, list);
                return new te5(Double.valueOf((double) (sd6.m27474b(w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue()) & sd6.m27474b(w96.mo26465b((qh5) list.get(1)).mo13085e().doubleValue()))));
            case 5:
                sd6.m27480h(to5.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new te5(Double.valueOf((double) (sd6.m27474b(w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue()) << ((int) (sd6.m27476d(w96.mo26465b((qh5) list.get(1)).mo13085e().doubleValue()) & 31)))));
            case 6:
                sd6.m27480h(to5.BITWISE_NOT.name(), 1, list);
                return new te5(Double.valueOf((double) (~sd6.m27474b(w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue()))));
            case 7:
                sd6.m27480h(to5.BITWISE_OR.name(), 2, list);
                return new te5(Double.valueOf((double) (sd6.m27474b(w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue()) | sd6.m27474b(w96.mo26465b((qh5) list.get(1)).mo13085e().doubleValue()))));
            case 8:
                sd6.m27480h(to5.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new te5(Double.valueOf((double) (sd6.m27474b(w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue()) >> ((int) (sd6.m27476d(w96.mo26465b((qh5) list.get(1)).mo13085e().doubleValue()) & 31)))));
            case 9:
                sd6.m27480h(to5.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new te5(Double.valueOf((double) (sd6.m27476d(w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue()) >>> ((int) (sd6.m27476d(w96.mo26465b((qh5) list.get(1)).mo13085e().doubleValue()) & 31)))));
            case 10:
                sd6.m27480h(to5.BITWISE_XOR.name(), 2, list);
                return new te5(Double.valueOf((double) (sd6.m27474b(w96.mo26465b((qh5) list.get(0)).mo13085e().doubleValue()) ^ sd6.m27474b(w96.mo26465b((qh5) list.get(1)).mo13085e().doubleValue()))));
            default:
                return super.mo25645b(str);
        }
    }
}

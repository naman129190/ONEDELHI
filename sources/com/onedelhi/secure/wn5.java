package com.onedelhi.secure;

import java.util.Iterator;
import java.util.List;

public final class wn5 extends uj5 {
    public wn5() {
        this.f21412a.add(to5.FOR_IN);
        this.f21412a.add(to5.FOR_IN_CONST);
        this.f21412a.add(to5.FOR_IN_LET);
        this.f21412a.add(to5.FOR_LET);
        this.f21412a.add(to5.FOR_OF);
        this.f21412a.add(to5.FOR_OF_CONST);
        this.f21412a.add(to5.FOR_OF_LET);
        this.f21412a.add(to5.WHILE);
    }

    /* renamed from: c */
    public static qh5 m30966c(kn5 kn5, Iterator it, qh5 qh5) {
        if (it != null) {
            while (it.hasNext()) {
                qh5 c = kn5.mo15234a((qh5) it.next()).mo26466c((ld5) qh5);
                if (c instanceof ie5) {
                    ie5 ie5 = (ie5) c;
                    if ("break".equals(ie5.mo17738c())) {
                        return qh5.f19182a;
                    }
                    if ("return".equals(ie5.mo17738c())) {
                        return ie5;
                    }
                }
            }
        }
        return qh5.f19182a;
    }

    /* renamed from: d */
    public static qh5 m30967d(kn5 kn5, qh5 qh5, qh5 qh52) {
        return m30966c(kn5, qh5.mo13091l(), qh52);
    }

    /* renamed from: e */
    public static qh5 m30968e(kn5 kn5, qh5 qh5, qh5 qh52) {
        if (qh5 instanceof Iterable) {
            return m30966c(kn5, ((Iterable) qh5).iterator(), qh52);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: a */
    public final qh5 mo14315a(String str, w96 w96, List list) {
        to5 to5 = to5.ADD;
        int ordinal = sd6.m27477e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    sd6.m27480h(to5.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof wi5) {
                        String b = ((qh5) list.get(0)).mo13084b();
                        return m30967d(new qn5(w96, b), w96.mo26465b((qh5) list.get(1)), w96.mo26465b((qh5) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    sd6.m27480h(to5.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof wi5) {
                        String b2 = ((qh5) list.get(0)).mo13084b();
                        return m30967d(new ym5(w96, b2), w96.mo26465b((qh5) list.get(1)), w96.mo26465b((qh5) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    sd6.m27480h(to5.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof wi5) {
                        String b3 = ((qh5) list.get(0)).mo13084b();
                        return m30967d(new en5(w96, b3), w96.mo26465b((qh5) list.get(1)), w96.mo26465b((qh5) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    sd6.m27480h(to5.FOR_LET.name(), 4, list);
                    qh5 b4 = w96.mo26465b((qh5) list.get(0));
                    if (b4 instanceof ld5) {
                        ld5 ld5 = (ld5) b4;
                        qh5 qh5 = (qh5) list.get(1);
                        qh5 qh52 = (qh5) list.get(2);
                        qh5 b5 = w96.mo26465b((qh5) list.get(3));
                        w96 a = w96.mo26464a();
                        for (int i = 0; i < ld5.mo19456r(); i++) {
                            String b6 = ld5.mo19457s(i).mo13084b();
                            a.mo26470g(b6, w96.mo26467d(b6));
                        }
                        while (w96.mo26465b(qh5).mo13087f().booleanValue()) {
                            qh5 c = w96.mo26466c((ld5) b5);
                            if (c instanceof ie5) {
                                ie5 ie5 = (ie5) c;
                                if ("break".equals(ie5.mo17738c())) {
                                    return qh5.f19182a;
                                }
                                if ("return".equals(ie5.mo17738c())) {
                                    return ie5;
                                }
                            }
                            w96 a2 = w96.mo26464a();
                            for (int i2 = 0; i2 < ld5.mo19456r(); i2++) {
                                String b7 = ld5.mo19457s(i2).mo13084b();
                                a2.mo26470g(b7, a.mo26467d(b7));
                            }
                            a2.mo26465b(qh52);
                            a = a2;
                        }
                        return qh5.f19182a;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    sd6.m27480h(to5.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof wi5) {
                        String b8 = ((qh5) list.get(0)).mo13084b();
                        return m30968e(new qn5(w96, b8), w96.mo26465b((qh5) list.get(1)), w96.mo26465b((qh5) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    sd6.m27480h(to5.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof wi5) {
                        String b9 = ((qh5) list.get(0)).mo13084b();
                        return m30968e(new ym5(w96, b9), w96.mo26465b((qh5) list.get(1)), w96.mo26465b((qh5) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    sd6.m27480h(to5.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof wi5) {
                        String b10 = ((qh5) list.get(0)).mo13084b();
                        return m30968e(new en5(w96, b10), w96.mo26465b((qh5) list.get(1)), w96.mo26465b((qh5) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.mo25645b(str);
            }
        } else {
            sd6.m27480h(to5.WHILE.name(), 4, list);
            qh5 qh53 = (qh5) list.get(0);
            qh5 qh54 = (qh5) list.get(1);
            qh5 b11 = w96.mo26465b((qh5) list.get(3));
            if (w96.mo26465b((qh5) list.get(2)).mo13087f().booleanValue()) {
                qh5 c2 = w96.mo26466c((ld5) b11);
                if (c2 instanceof ie5) {
                    ie5 ie52 = (ie5) c2;
                    if (!"break".equals(ie52.mo17738c())) {
                        if ("return".equals(ie52.mo17738c())) {
                            return ie52;
                        }
                    }
                    return qh5.f19182a;
                }
            }
            while (w96.mo26465b(qh53).mo13087f().booleanValue()) {
                qh5 c3 = w96.mo26466c((ld5) b11);
                if (c3 instanceof ie5) {
                    ie5 ie53 = (ie5) c3;
                    if ("break".equals(ie53.mo17738c())) {
                        break;
                    } else if ("return".equals(ie53.mo17738c())) {
                        return ie53;
                    }
                }
                w96.mo26465b(qh54);
            }
            return qh5.f19182a;
        }
    }
}

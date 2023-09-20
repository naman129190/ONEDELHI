package com.onedelhi.secure;

import com.onedelhi.secure.ak4;
import java.util.Iterator;
import java.util.List;

public final class oo5 extends uj5 {
    public oo5() {
        this.f21412a.add(to5.ASSIGN);
        this.f21412a.add(to5.CONST);
        this.f21412a.add(to5.CREATE_ARRAY);
        this.f21412a.add(to5.CREATE_OBJECT);
        this.f21412a.add(to5.EXPRESSION_LIST);
        this.f21412a.add(to5.GET);
        this.f21412a.add(to5.GET_INDEX);
        this.f21412a.add(to5.GET_PROPERTY);
        this.f21412a.add(to5.NULL);
        this.f21412a.add(to5.SET_PROPERTY);
        this.f21412a.add(to5.TYPEOF);
        this.f21412a.add(to5.UNDEFINED);
        this.f21412a.add(to5.VAR);
    }

    /* renamed from: a */
    public final qh5 mo14315a(String str, w96 w96, List list) {
        String str2;
        to5 to5 = to5.ADD;
        int ordinal = sd6.m27477e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            sd6.m27480h(to5.ASSIGN.name(), 2, list);
            qh5 b = w96.mo26465b((qh5) list.get(0));
            if (!(b instanceof wi5)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b.getClass().getCanonicalName()}));
            } else if (w96.mo26471h(b.mo13084b())) {
                qh5 b2 = w96.mo26465b((qh5) list.get(1));
                w96.mo26470g(b.mo13084b(), b2);
                return b2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b.mo13084b()}));
            }
        } else if (ordinal == 14) {
            sd6.m27481i(to5.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    qh5 b3 = w96.mo26465b((qh5) list.get(i2));
                    if (b3 instanceof wi5) {
                        w96.mo26469f(b3.mo13084b(), w96.mo26465b((qh5) list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b3.getClass().getCanonicalName()}));
                    }
                }
                return qh5.f19182a;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            sd6.m27481i(to5.EXPRESSION_LIST.name(), 1, list);
            qh5 qh5 = qh5.f19182a;
            while (i < list.size()) {
                qh5 = w96.mo26465b((qh5) list.get(i));
                if (!(qh5 instanceof ie5)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return qh5;
        } else if (ordinal == 33) {
            sd6.m27480h(to5.GET.name(), 1, list);
            qh5 b4 = w96.mo26465b((qh5) list.get(0));
            if (b4 instanceof wi5) {
                return w96.mo26467d(b4.mo13084b());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            sd6.m27480h(to5.NULL.name(), 0, list);
            return qh5.f19183b;
        } else if (ordinal == 58) {
            sd6.m27480h(to5.SET_PROPERTY.name(), 3, list);
            qh5 b5 = w96.mo26465b((qh5) list.get(0));
            qh5 b6 = w96.mo26465b((qh5) list.get(1));
            qh5 b7 = w96.mo26465b((qh5) list.get(2));
            if (b5 == qh5.f19182a || b5 == qh5.f19183b) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b6.mo13084b(), b5.mo13084b()}));
            }
            if ((b5 instanceof ld5) && (b6 instanceof te5)) {
                ((ld5) b5).mo19465z(b6.mo13085e().intValue(), b7);
            } else if (b5 instanceof jg5) {
                ((jg5) b5).mo15169n(b6.mo13084b(), b7);
            }
            return b7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    sd6.m27480h(to5.GET_PROPERTY.name(), 2, list);
                    qh5 b8 = w96.mo26465b((qh5) list.get(0));
                    qh5 b9 = w96.mo26465b((qh5) list.get(1));
                    if ((b8 instanceof ld5) && sd6.m27483k(b9)) {
                        return ((ld5) b8).mo19457s(b9.mo13085e().intValue());
                    }
                    if (b8 instanceof jg5) {
                        return ((jg5) b8).mo15167i(b9.mo13084b());
                    }
                    if (b8 instanceof wi5) {
                        if ("length".equals(b9.mo13084b())) {
                            return new te5(Double.valueOf((double) b8.mo13084b().length()));
                        }
                        if (sd6.m27483k(b9) && b9.mo13085e().doubleValue() < ((double) b8.mo13084b().length())) {
                            return new wi5(String.valueOf(b8.mo13084b().charAt(b9.mo13085e().intValue())));
                        }
                    }
                    return qh5.f19182a;
                }
                switch (ordinal) {
                    case 62:
                        sd6.m27480h(to5.TYPEOF.name(), 1, list);
                        qh5 b10 = w96.mo26465b((qh5) list.get(0));
                        if (b10 instanceof ej5) {
                            str2 = "undefined";
                        } else if (b10 instanceof xd5) {
                            str2 = ak4.C1709b.f9169f;
                        } else if (b10 instanceof te5) {
                            str2 = "number";
                        } else if (b10 instanceof wi5) {
                            str2 = ak4.C1709b.f9167e;
                        } else if (b10 instanceof ih5) {
                            str2 = "function";
                        } else if ((b10 instanceof yh5) || (b10 instanceof ie5)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b10}));
                        } else {
                            str2 = "object";
                        }
                        return new wi5(str2);
                    case 63:
                        sd6.m27480h(to5.UNDEFINED.name(), 0, list);
                        return qh5.f19182a;
                    case 64:
                        sd6.m27481i(to5.VAR.name(), 1, list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            qh5 b11 = w96.mo26465b((qh5) it.next());
                            if (b11 instanceof wi5) {
                                w96.mo26468e(b11.mo13084b(), qh5.f19182a);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b11.getClass().getCanonicalName()}));
                            }
                        }
                        return qh5.f19182a;
                    default:
                        return super.mo25645b(str);
                }
            } else if (list.isEmpty()) {
                return new sg5();
            } else {
                if (list.size() % 2 == 0) {
                    sg5 sg5 = new sg5();
                    while (i < list.size() - 1) {
                        qh5 b12 = w96.mo26465b((qh5) list.get(i));
                        qh5 b13 = w96.mo26465b((qh5) list.get(i + 1));
                        if ((b12 instanceof ie5) || (b13 instanceof ie5)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        sg5.mo15169n(b12.mo13084b(), b13);
                        i += 2;
                    }
                    return sg5;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new ld5();
        } else {
            ld5 ld5 = new ld5();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                qh5 b14 = w96.mo26465b((qh5) it2.next());
                if (!(b14 instanceof ie5)) {
                    ld5.mo19465z(i, b14);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return ld5;
        }
    }
}

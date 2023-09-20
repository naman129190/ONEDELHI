package com.onedelhi.secure;

import java.util.List;

public final class kk5 extends uj5 {
    public kk5() {
        this.f21412a.add(to5.EQUALS);
        this.f21412a.add(to5.GREATER_THAN);
        this.f21412a.add(to5.GREATER_THAN_EQUALS);
        this.f21412a.add(to5.IDENTITY_EQUALS);
        this.f21412a.add(to5.IDENTITY_NOT_EQUALS);
        this.f21412a.add(to5.LESS_THAN);
        this.f21412a.add(to5.LESS_THAN_EQUALS);
        this.f21412a.add(to5.NOT_EQUALS);
    }

    /* renamed from: c */
    public static boolean m19880c(qh5 qh5, qh5 qh52) {
        if (qh5.getClass().equals(qh52.getClass())) {
            if ((qh5 instanceof ej5) || (qh5 instanceof ah5)) {
                return true;
            }
            return qh5 instanceof te5 ? !Double.isNaN(qh5.mo13085e().doubleValue()) && !Double.isNaN(qh52.mo13085e().doubleValue()) && qh5.mo13085e().doubleValue() == qh52.mo13085e().doubleValue() : qh5 instanceof wi5 ? qh5.mo13084b().equals(qh52.mo13084b()) : qh5 instanceof xd5 ? qh5.mo13087f().equals(qh52.mo13087f()) : qh5 == qh52;
        } else if (((qh5 instanceof ej5) || (qh5 instanceof ah5)) && ((qh52 instanceof ej5) || (qh52 instanceof ah5))) {
            return true;
        } else {
            boolean z = qh5 instanceof te5;
            if (z && (qh52 instanceof wi5)) {
                return m19880c(qh5, new te5(qh52.mo13085e()));
            }
            boolean z2 = qh5 instanceof wi5;
            if (z2 && (qh52 instanceof te5)) {
                return m19880c(new te5(qh5.mo13085e()), qh52);
            }
            if (qh5 instanceof xd5) {
                return m19880c(new te5(qh5.mo13085e()), qh52);
            }
            if (qh52 instanceof xd5) {
                return m19880c(qh5, new te5(qh52.mo13085e()));
            }
            if ((z2 || z) && (qh52 instanceof jg5)) {
                return m19880c(qh5, new wi5(qh52.mo13084b()));
            }
            if (!(qh5 instanceof jg5) || (!(qh52 instanceof wi5) && !(qh52 instanceof te5))) {
                return false;
            }
            return m19880c(new wi5(qh5.mo13084b()), qh52);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = (r3 > 0.0d ? 1 : (r3 == 0.0d ? 0 : -1));
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m19881d(com.onedelhi.secure.qh5 r8, com.onedelhi.secure.qh5 r9) {
        /*
            boolean r0 = r8 instanceof com.onedelhi.secure.jg5
            if (r0 == 0) goto L_0x000e
            com.onedelhi.secure.wi5 r0 = new com.onedelhi.secure.wi5
            java.lang.String r8 = r8.mo13084b()
            r0.<init>(r8)
            r8 = r0
        L_0x000e:
            boolean r0 = r9 instanceof com.onedelhi.secure.jg5
            if (r0 == 0) goto L_0x001c
            com.onedelhi.secure.wi5 r0 = new com.onedelhi.secure.wi5
            java.lang.String r9 = r9.mo13084b()
            r0.<init>(r9)
            r9 = r0
        L_0x001c:
            boolean r0 = r8 instanceof com.onedelhi.secure.wi5
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            boolean r0 = r9 instanceof com.onedelhi.secure.wi5
            if (r0 != 0) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            java.lang.String r8 = r8.mo13084b()
            java.lang.String r9 = r9.mo13084b()
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x0036
            return r1
        L_0x0036:
            return r2
        L_0x0037:
            java.lang.Double r8 = r8.mo13085e()
            double r3 = r8.doubleValue()
            java.lang.Double r8 = r9.mo13085e()
            double r8 = r8.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L_0x006d
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 == 0) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0065
        L_0x005e:
            if (r0 != 0) goto L_0x0066
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            return r2
        L_0x0066:
            int r8 = java.lang.Double.compare(r3, r8)
            if (r8 >= 0) goto L_0x006d
            return r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.kk5.m19881d(com.onedelhi.secure.qh5, com.onedelhi.secure.qh5):boolean");
    }

    /* renamed from: e */
    public static boolean m19882e(qh5 qh5, qh5 qh52) {
        if (qh5 instanceof jg5) {
            qh5 = new wi5(qh5.mo13084b());
        }
        if (qh52 instanceof jg5) {
            qh52 = new wi5(qh52.mo13084b());
        }
        return (((qh5 instanceof wi5) && (qh52 instanceof wi5)) || (!Double.isNaN(qh5.mo13085e().doubleValue()) && !Double.isNaN(qh52.mo13085e().doubleValue()))) && !m19881d(qh52, qh5);
    }

    /* renamed from: a */
    public final qh5 mo14315a(String str, w96 w96, List list) {
        boolean z;
        boolean c;
        sd6.m27480h(sd6.m27477e(str).name(), 2, list);
        qh5 b = w96.mo26465b((qh5) list.get(0));
        qh5 b2 = w96.mo26465b((qh5) list.get(1));
        int ordinal = sd6.m27477e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c = m19880c(b, b2);
            } else if (ordinal == 42) {
                z = m19881d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m19881d(b2, b);
                        break;
                    case 38:
                        z = m19882e(b2, b);
                        break;
                    case 39:
                        z = sd6.m27484l(b, b2);
                        break;
                    case 40:
                        c = sd6.m27484l(b, b2);
                        break;
                    default:
                        return super.mo25645b(str);
                }
            } else {
                z = m19882e(b, b2);
            }
            z = !c;
        } else {
            z = m19880c(b, b2);
        }
        return z ? qh5.f19187f : qh5.f19188g;
    }
}

package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

public final class sk5 extends uj5 {
    public sk5() {
        this.f21412a.add(to5.APPLY);
        this.f21412a.add(to5.BLOCK);
        this.f21412a.add(to5.BREAK);
        this.f21412a.add(to5.CASE);
        this.f21412a.add(to5.DEFAULT);
        this.f21412a.add(to5.CONTINUE);
        this.f21412a.add(to5.DEFINE_FUNCTION);
        this.f21412a.add(to5.FN);
        this.f21412a.add(to5.IF);
        this.f21412a.add(to5.QUOTE);
        this.f21412a.add(to5.RETURN);
        this.f21412a.add(to5.SWITCH);
        this.f21412a.add(to5.TERNARY);
    }

    /* renamed from: c */
    public static qh5 m27708c(w96 w96, List list) {
        sd6.m27481i(to5.FN.name(), 2, list);
        qh5 b = w96.mo26465b((qh5) list.get(0));
        qh5 b2 = w96.mo26465b((qh5) list.get(1));
        if (b2 instanceof ld5) {
            List v = ((ld5) b2).mo19461v();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new ih5(b.mo13084b(), v, arrayList, w96);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{b2.getClass().getCanonicalName()}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
        if (r8.equals("continue") == false) goto L_0x0127;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.qh5 mo14315a(java.lang.String r8, com.onedelhi.secure.w96 r9, java.util.List r10) {
        /*
            r7 = this;
            com.onedelhi.secure.to5 r0 = com.onedelhi.secure.to5.ADD
            com.onedelhi.secure.to5 r0 = com.onedelhi.secure.sd6.m27477e(r8)
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L_0x0205
            r5 = 15
            if (r0 == r5) goto L_0x01f9
            r5 = 25
            if (r0 == r5) goto L_0x01f4
            r5 = 41
            if (r0 == r5) goto L_0x01a2
            r5 = 54
            if (r0 == r5) goto L_0x019c
            r5 = 57
            java.lang.String r6 = "return"
            if (r0 == r5) goto L_0x0179
            r5 = 19
            if (r0 == r5) goto L_0x015b
            r5 = 20
            if (r0 == r5) goto L_0x013a
            r5 = 60
            if (r0 == r5) goto L_0x0085
            r5 = 61
            if (r0 == r5) goto L_0x0058
            switch(r0) {
                case 11: goto L_0x004a;
                case 12: goto L_0x003e;
                case 13: goto L_0x015b;
                default: goto L_0x0039;
            }
        L_0x0039:
            com.onedelhi.secure.qh5 r8 = super.mo25645b(r8)
            return r8
        L_0x003e:
            com.onedelhi.secure.to5 r8 = com.onedelhi.secure.to5.BREAK
            java.lang.String r8 = r8.name()
            com.onedelhi.secure.sd6.m27480h(r8, r4, r10)
            com.onedelhi.secure.qh5 r8 = com.onedelhi.secure.qh5.f19185d
            return r8
        L_0x004a:
            com.onedelhi.secure.w96 r8 = r9.mo26464a()
            com.onedelhi.secure.ld5 r9 = new com.onedelhi.secure.ld5
            r9.<init>(r10)
            com.onedelhi.secure.qh5 r8 = r8.mo26466c(r9)
            return r8
        L_0x0058:
            com.onedelhi.secure.to5 r8 = com.onedelhi.secure.to5.TERNARY
            java.lang.String r8 = r8.name()
            com.onedelhi.secure.sd6.m27480h(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.onedelhi.secure.qh5 r8 = (com.onedelhi.secure.qh5) r8
            com.onedelhi.secure.qh5 r8 = r9.mo26465b(r8)
            java.lang.Boolean r8 = r8.mo13087f()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x007a
            java.lang.Object r8 = r10.get(r3)
            goto L_0x007e
        L_0x007a:
            java.lang.Object r8 = r10.get(r2)
        L_0x007e:
            com.onedelhi.secure.qh5 r8 = (com.onedelhi.secure.qh5) r8
            com.onedelhi.secure.qh5 r8 = r9.mo26465b(r8)
            return r8
        L_0x0085:
            com.onedelhi.secure.to5 r8 = com.onedelhi.secure.to5.SWITCH
            java.lang.String r8 = r8.name()
            com.onedelhi.secure.sd6.m27480h(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.onedelhi.secure.qh5 r8 = (com.onedelhi.secure.qh5) r8
            com.onedelhi.secure.qh5 r8 = r9.mo26465b(r8)
            java.lang.Object r0 = r10.get(r3)
            com.onedelhi.secure.qh5 r0 = (com.onedelhi.secure.qh5) r0
            com.onedelhi.secure.qh5 r0 = r9.mo26465b(r0)
            java.lang.Object r10 = r10.get(r2)
            com.onedelhi.secure.qh5 r10 = (com.onedelhi.secure.qh5) r10
            com.onedelhi.secure.qh5 r10 = r9.mo26465b(r10)
            boolean r1 = r0 instanceof com.onedelhi.secure.ld5
            if (r1 == 0) goto L_0x0132
            boolean r1 = r10 instanceof com.onedelhi.secure.ld5
            if (r1 == 0) goto L_0x012a
            com.onedelhi.secure.ld5 r0 = (com.onedelhi.secure.ld5) r0
            com.onedelhi.secure.ld5 r10 = (com.onedelhi.secure.ld5) r10
            r1 = 0
            r2 = 0
        L_0x00ba:
            int r5 = r0.mo19456r()
            if (r1 >= r5) goto L_0x00f5
            if (r2 != 0) goto L_0x00d3
            com.onedelhi.secure.qh5 r2 = r0.mo19457s(r1)
            com.onedelhi.secure.qh5 r2 = r9.mo26465b(r2)
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r2 = 0
            goto L_0x00f2
        L_0x00d3:
            com.onedelhi.secure.qh5 r2 = r10.mo19457s(r1)
            com.onedelhi.secure.qh5 r2 = r9.mo26465b(r2)
            boolean r5 = r2 instanceof com.onedelhi.secure.ie5
            if (r5 == 0) goto L_0x00f1
            r8 = r2
            com.onedelhi.secure.ie5 r8 = (com.onedelhi.secure.ie5) r8
            java.lang.String r8 = r8.mo17738c()
            java.lang.String r9 = "break"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0126
            com.onedelhi.secure.qh5 r8 = com.onedelhi.secure.qh5.f19182a
            return r8
        L_0x00f1:
            r2 = 1
        L_0x00f2:
            int r1 = r1 + 1
            goto L_0x00ba
        L_0x00f5:
            int r8 = r0.mo19456r()
            int r8 = r8 + r3
            int r1 = r10.mo19456r()
            if (r8 != r1) goto L_0x0127
            int r8 = r0.mo19456r()
            com.onedelhi.secure.qh5 r8 = r10.mo19457s(r8)
            com.onedelhi.secure.qh5 r2 = r9.mo26465b(r8)
            boolean r8 = r2 instanceof com.onedelhi.secure.ie5
            if (r8 == 0) goto L_0x0127
            r8 = r2
            com.onedelhi.secure.ie5 r8 = (com.onedelhi.secure.ie5) r8
            java.lang.String r8 = r8.mo17738c()
            boolean r9 = r8.equals(r6)
            if (r9 != 0) goto L_0x0126
            java.lang.String r9 = "continue"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            return r2
        L_0x0127:
            com.onedelhi.secure.qh5 r8 = com.onedelhi.secure.qh5.f19182a
            return r8
        L_0x012a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, case statements are not a list"
            r8.<init>(r9)
            throw r8
        L_0x0132:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, cases are not a list"
            r8.<init>(r9)
            throw r8
        L_0x013a:
            com.onedelhi.secure.to5 r8 = com.onedelhi.secure.to5.DEFINE_FUNCTION
            java.lang.String r8 = r8.name()
            com.onedelhi.secure.sd6.m27481i(r8, r2, r10)
            com.onedelhi.secure.qh5 r8 = m27708c(r9, r10)
            r10 = r8
            com.onedelhi.secure.ef5 r10 = (com.onedelhi.secure.ef5) r10
            java.lang.String r0 = r10.mo15164c()
            if (r0 != 0) goto L_0x0153
            java.lang.String r10 = ""
            goto L_0x0157
        L_0x0153:
            java.lang.String r10 = r10.mo15164c()
        L_0x0157:
            r9.mo26470g(r10, r8)
            return r8
        L_0x015b:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x0164
        L_0x0161:
            com.onedelhi.secure.qh5 r8 = com.onedelhi.secure.qh5.f19182a
            goto L_0x0178
        L_0x0164:
            java.lang.Object r8 = r10.get(r4)
            com.onedelhi.secure.qh5 r8 = (com.onedelhi.secure.qh5) r8
            com.onedelhi.secure.qh5 r8 = r9.mo26465b(r8)
            boolean r10 = r8 instanceof com.onedelhi.secure.ld5
            if (r10 == 0) goto L_0x0161
            com.onedelhi.secure.ld5 r8 = (com.onedelhi.secure.ld5) r8
            com.onedelhi.secure.qh5 r8 = r9.mo26466c(r8)
        L_0x0178:
            return r8
        L_0x0179:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x0182
            com.onedelhi.secure.qh5 r8 = com.onedelhi.secure.qh5.f19186e
            goto L_0x019b
        L_0x0182:
            com.onedelhi.secure.to5 r8 = com.onedelhi.secure.to5.RETURN
            java.lang.String r8 = r8.name()
            com.onedelhi.secure.sd6.m27480h(r8, r3, r10)
            java.lang.Object r8 = r10.get(r4)
            com.onedelhi.secure.qh5 r8 = (com.onedelhi.secure.qh5) r8
            com.onedelhi.secure.qh5 r8 = r9.mo26465b(r8)
            com.onedelhi.secure.ie5 r9 = new com.onedelhi.secure.ie5
            r9.<init>(r6, r8)
            r8 = r9
        L_0x019b:
            return r8
        L_0x019c:
            com.onedelhi.secure.ld5 r8 = new com.onedelhi.secure.ld5
            r8.<init>(r10)
            return r8
        L_0x01a2:
            com.onedelhi.secure.to5 r8 = com.onedelhi.secure.to5.IF
            java.lang.String r8 = r8.name()
            com.onedelhi.secure.sd6.m27481i(r8, r2, r10)
            java.lang.Object r8 = r10.get(r4)
            com.onedelhi.secure.qh5 r8 = (com.onedelhi.secure.qh5) r8
            com.onedelhi.secure.qh5 r8 = r9.mo26465b(r8)
            java.lang.Object r0 = r10.get(r3)
            com.onedelhi.secure.qh5 r0 = (com.onedelhi.secure.qh5) r0
            com.onedelhi.secure.qh5 r0 = r9.mo26465b(r0)
            int r1 = r10.size()
            if (r1 <= r2) goto L_0x01d0
            java.lang.Object r10 = r10.get(r2)
            com.onedelhi.secure.qh5 r10 = (com.onedelhi.secure.qh5) r10
            com.onedelhi.secure.qh5 r10 = r9.mo26465b(r10)
            goto L_0x01d1
        L_0x01d0:
            r10 = 0
        L_0x01d1:
            com.onedelhi.secure.qh5 r1 = com.onedelhi.secure.qh5.f19182a
            java.lang.Boolean r8 = r8.mo13087f()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x01e4
            com.onedelhi.secure.ld5 r0 = (com.onedelhi.secure.ld5) r0
            com.onedelhi.secure.qh5 r8 = r9.mo26466c(r0)
            goto L_0x01ee
        L_0x01e4:
            if (r10 == 0) goto L_0x01ed
            com.onedelhi.secure.ld5 r10 = (com.onedelhi.secure.ld5) r10
            com.onedelhi.secure.qh5 r8 = r9.mo26466c(r10)
            goto L_0x01ee
        L_0x01ed:
            r8 = r1
        L_0x01ee:
            boolean r9 = r8 instanceof com.onedelhi.secure.ie5
            if (r9 == 0) goto L_0x01f3
            return r8
        L_0x01f3:
            return r1
        L_0x01f4:
            com.onedelhi.secure.qh5 r8 = m27708c(r9, r10)
            return r8
        L_0x01f9:
            com.onedelhi.secure.to5 r8 = com.onedelhi.secure.to5.BREAK
            java.lang.String r8 = r8.name()
            com.onedelhi.secure.sd6.m27480h(r8, r4, r10)
            com.onedelhi.secure.qh5 r8 = com.onedelhi.secure.qh5.f19184c
            return r8
        L_0x0205:
            com.onedelhi.secure.to5 r8 = com.onedelhi.secure.to5.APPLY
            java.lang.String r8 = r8.name()
            com.onedelhi.secure.sd6.m27480h(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.onedelhi.secure.qh5 r8 = (com.onedelhi.secure.qh5) r8
            com.onedelhi.secure.qh5 r8 = r9.mo26465b(r8)
            java.lang.Object r0 = r10.get(r3)
            com.onedelhi.secure.qh5 r0 = (com.onedelhi.secure.qh5) r0
            com.onedelhi.secure.qh5 r0 = r9.mo26465b(r0)
            java.lang.String r0 = r0.mo13084b()
            java.lang.Object r10 = r10.get(r2)
            com.onedelhi.secure.qh5 r10 = (com.onedelhi.secure.qh5) r10
            com.onedelhi.secure.qh5 r10 = r9.mo26465b(r10)
            boolean r1 = r10 instanceof com.onedelhi.secure.ld5
            if (r1 == 0) goto L_0x024d
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0245
            com.onedelhi.secure.ld5 r10 = (com.onedelhi.secure.ld5) r10
            java.util.List r10 = r10.mo19461v()
            com.onedelhi.secure.qh5 r8 = r8.mo13088g(r0, r9, r10)
            return r8
        L_0x0245:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Function name for apply is undefined"
            r8.<init>(r9)
            throw r8
        L_0x024d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getCanonicalName()
            r9[r4] = r10
            java.lang.String r10 = "Function arguments for Apply are not a list found %s"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.sk5.mo14315a(java.lang.String, com.onedelhi.secure.w96, java.util.List):com.onedelhi.secure.qh5");
    }
}

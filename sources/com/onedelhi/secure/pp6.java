package com.onedelhi.secure;

public final class pp6 extends sg5 {

    /* renamed from: a */
    public final zb5 f18641a;

    public pp6(zb5 zb5) {
        this.f18641a = zb5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.qh5 mo13088g(java.lang.String r17, com.onedelhi.secure.w96 r18, java.util.List r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            r5 = 0
            switch(r4) {
                case 21624207: goto L_0x0049;
                case 45521504: goto L_0x0041;
                case 146575578: goto L_0x0039;
                case 700587132: goto L_0x0031;
                case 920706790: goto L_0x0029;
                case 1570616835: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0051
        L_0x0021:
            boolean r4 = r1.equals(r8)
            if (r4 == 0) goto L_0x0051
            r4 = 4
            goto L_0x0052
        L_0x0029:
            boolean r4 = r1.equals(r9)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x0031:
            boolean r4 = r1.equals(r10)
            if (r4 == 0) goto L_0x0051
            r4 = 2
            goto L_0x0052
        L_0x0039:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0041:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L_0x0051
            r4 = 3
            goto L_0x0052
        L_0x0049:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L_0x0051
            r4 = 0
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x0134
            if (r4 == r15) goto L_0x0114
            if (r4 == r14) goto L_0x00e1
            if (r4 == r7) goto L_0x00c9
            if (r4 == r6) goto L_0x008d
            r6 = 5
            if (r4 == r6) goto L_0x0064
            com.onedelhi.secure.qh5 r1 = super.mo13088g(r17, r18, r19)
            return r1
        L_0x0064:
            com.onedelhi.secure.sd6.m27480h(r9, r14, r3)
            java.lang.Object r1 = r3.get(r5)
            com.onedelhi.secure.qh5 r1 = (com.onedelhi.secure.qh5) r1
            com.onedelhi.secure.qh5 r1 = r2.mo26465b(r1)
            java.lang.String r1 = r1.mo13084b()
            java.lang.Object r3 = r3.get(r15)
            com.onedelhi.secure.qh5 r3 = (com.onedelhi.secure.qh5) r3
            com.onedelhi.secure.qh5 r2 = r2.mo26465b(r3)
            com.onedelhi.secure.zb5 r3 = r0.f18641a
            com.onedelhi.secure.mb5 r3 = r3.mo27901b()
            java.lang.Object r4 = com.onedelhi.secure.sd6.m27478f(r2)
            r3.mo20290g(r1, r4)
            return r2
        L_0x008d:
            com.onedelhi.secure.sd6.m27480h(r8, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.onedelhi.secure.qh5 r1 = (com.onedelhi.secure.qh5) r1
            com.onedelhi.secure.qh5 r1 = r2.mo26465b(r1)
            com.onedelhi.secure.qh5 r2 = com.onedelhi.secure.qh5.f19182a
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            com.onedelhi.secure.qh5 r2 = com.onedelhi.secure.qh5.f19183b
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            com.onedelhi.secure.zb5 r2 = r0.f18641a
            com.onedelhi.secure.mb5 r2 = r2.mo27901b()
            java.lang.String r3 = r1.mo13084b()
            r2.mo20289f(r3)
            com.onedelhi.secure.wi5 r2 = new com.onedelhi.secure.wi5
            java.lang.String r1 = r1.mo13084b()
            r2.<init>(r1)
            return r2
        L_0x00c1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00c9:
            com.onedelhi.secure.sd6.m27480h(r12, r5, r3)
            com.onedelhi.secure.zb5 r1 = r0.f18641a
            com.onedelhi.secure.mb5 r1 = r1.mo27901b()
            com.onedelhi.secure.te5 r2 = new com.onedelhi.secure.te5
            long r3 = r1.mo20282a()
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x00e1:
            com.onedelhi.secure.sd6.m27480h(r10, r5, r3)
            com.onedelhi.secure.zb5 r1 = r0.f18641a
            com.onedelhi.secure.mb5 r1 = r1.mo27901b()
            java.util.Map r1 = r1.mo20287e()
            com.onedelhi.secure.sg5 r2 = new com.onedelhi.secure.sg5
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00fb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0113
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            com.onedelhi.secure.qh5 r5 = com.onedelhi.secure.jh6.m18591b(r5)
            r2.mo15169n(r4, r5)
            goto L_0x00fb
        L_0x0113:
            return r2
        L_0x0114:
            com.onedelhi.secure.sd6.m27480h(r11, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.onedelhi.secure.qh5 r1 = (com.onedelhi.secure.qh5) r1
            com.onedelhi.secure.qh5 r1 = r2.mo26465b(r1)
            java.lang.String r1 = r1.mo13084b()
            com.onedelhi.secure.zb5 r2 = r0.f18641a
            com.onedelhi.secure.mb5 r2 = r2.mo27901b()
            java.lang.Object r1 = r2.mo20284c(r1)
            com.onedelhi.secure.qh5 r1 = com.onedelhi.secure.jh6.m18591b(r1)
            return r1
        L_0x0134:
            com.onedelhi.secure.sd6.m27480h(r13, r5, r3)
            com.onedelhi.secure.zb5 r1 = r0.f18641a
            com.onedelhi.secure.mb5 r1 = r1.mo27901b()
            com.onedelhi.secure.wi5 r2 = new com.onedelhi.secure.wi5
            java.lang.String r1 = r1.mo20286d()
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pp6.mo13088g(java.lang.String, com.onedelhi.secure.w96, java.util.List):com.onedelhi.secure.qh5");
    }
}

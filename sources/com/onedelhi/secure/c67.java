package com.onedelhi.secure;

public final class c67 extends n57 {

    /* renamed from: a */
    public final /* synthetic */ db5 f10156a;

    /* renamed from: a */
    public final z46 f10157a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c67(db5 db5, String str, int i, z46 z46) {
        super(str, i);
        this.f10156a = db5;
        this.f10157a = z46;
    }

    /* renamed from: a */
    public final int mo14029a() {
        return this.f10157a.mo27800B();
    }

    /* renamed from: b */
    public final boolean mo14030b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo14031c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a2  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14032k(java.lang.Long r11, java.lang.Long r12, com.onedelhi.secure.zb6 r13, boolean r14) {
        /*
            r10 = this;
            com.onedelhi.secure.rw6.m27098c()
            com.onedelhi.secure.db5 r0 = r10.f10156a
            com.onedelhi.secure.za6 r0 = r0.f11205a
            com.onedelhi.secure.ce5 r0 = r0.mo27891z()
            java.lang.String r1 = r10.f17111a
            com.onedelhi.secure.k36 r2 = com.onedelhi.secure.n36.f17039W
            boolean r0 = r0.mo14110B(r1, r2)
            com.onedelhi.secure.z46 r1 = r10.f10157a
            boolean r1 = r1.mo27803H()
            com.onedelhi.secure.z46 r2 = r10.f10157a
            boolean r2 = r2.mo27804I()
            com.onedelhi.secure.z46 r3 = r10.f10157a
            boolean r3 = r3.mo27805J()
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0030
            if (r2 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = 0
            goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            r2 = 0
            if (r14 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0060
            com.onedelhi.secure.db5 r11 = r10.f10156a
            com.onedelhi.secure.za6 r11 = r11.f11205a
            com.onedelhi.secure.a56 r11 = r11.mo15136e()
            com.onedelhi.secure.u46 r11 = r11.mo12730v()
            int r12 = r10.f17108a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.onedelhi.secure.z46 r13 = r10.f10157a
            boolean r13 = r13.mo27806K()
            if (r13 == 0) goto L_0x005a
            com.onedelhi.secure.z46 r13 = r10.f10157a
            int r13 = r13.mo27800B()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
        L_0x005a:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo25381c(r13, r12, r2)
            return r5
        L_0x0060:
            com.onedelhi.secure.z46 r6 = r10.f10157a
            com.onedelhi.secure.e46 r6 = r6.mo27801C()
            boolean r7 = r6.mo15043H()
            boolean r8 = r13.mo27913R()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo15045J()
            if (r8 != 0) goto L_0x0099
            com.onedelhi.secure.db5 r6 = r10.f10156a
            com.onedelhi.secure.za6 r6 = r6.f11205a
            com.onedelhi.secure.a56 r6 = r6.mo15136e()
            com.onedelhi.secure.u46 r6 = r6.mo12731w()
            com.onedelhi.secure.db5 r7 = r10.f10156a
            com.onedelhi.secure.za6 r7 = r7.f11205a
            com.onedelhi.secure.l46 r7 = r7.mo27862D()
            java.lang.String r8 = r13.mo27910G()
            java.lang.String r7 = r7.mo19282f(r8)
            java.lang.String r8 = "No number filter for long property. property"
        L_0x0094:
            r6.mo25380b(r8, r7)
            goto L_0x0188
        L_0x0099:
            long r8 = r13.mo27908C()
            com.onedelhi.secure.t46 r2 = r6.mo15040D()
            java.lang.Boolean r2 = com.onedelhi.secure.n57.m22348h(r8, r2)
        L_0x00a5:
            java.lang.Boolean r2 = com.onedelhi.secure.n57.m22350j(r2, r7)
            goto L_0x0188
        L_0x00ab:
            boolean r8 = r13.mo27912Q()
            if (r8 == 0) goto L_0x00e3
            boolean r8 = r6.mo15045J()
            if (r8 != 0) goto L_0x00d6
            com.onedelhi.secure.db5 r6 = r10.f10156a
            com.onedelhi.secure.za6 r6 = r6.f11205a
            com.onedelhi.secure.a56 r6 = r6.mo15136e()
            com.onedelhi.secure.u46 r6 = r6.mo12731w()
            com.onedelhi.secure.db5 r7 = r10.f10156a
            com.onedelhi.secure.za6 r7 = r7.f11205a
            com.onedelhi.secure.l46 r7 = r7.mo27862D()
            java.lang.String r8 = r13.mo27910G()
            java.lang.String r7 = r7.mo19282f(r8)
            java.lang.String r8 = "No number filter for double property. property"
            goto L_0x0094
        L_0x00d6:
            double r8 = r13.mo27907B()
            com.onedelhi.secure.t46 r2 = r6.mo15040D()
            java.lang.Boolean r2 = com.onedelhi.secure.n57.m22347g(r8, r2)
            goto L_0x00a5
        L_0x00e3:
            boolean r8 = r13.mo27915T()
            if (r8 == 0) goto L_0x0168
            boolean r8 = r6.mo15047L()
            if (r8 != 0) goto L_0x0152
            boolean r8 = r6.mo15045J()
            if (r8 != 0) goto L_0x0114
            com.onedelhi.secure.db5 r6 = r10.f10156a
            com.onedelhi.secure.za6 r6 = r6.f11205a
            com.onedelhi.secure.a56 r6 = r6.mo15136e()
            com.onedelhi.secure.u46 r6 = r6.mo12731w()
            com.onedelhi.secure.db5 r7 = r10.f10156a
            com.onedelhi.secure.za6 r7 = r7.f11205a
            com.onedelhi.secure.l46 r7 = r7.mo27862D()
            java.lang.String r8 = r13.mo27910G()
            java.lang.String r7 = r7.mo19282f(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            goto L_0x0094
        L_0x0114:
            java.lang.String r8 = r13.mo27911H()
            boolean r8 = com.onedelhi.secure.uq6.m29502N(r8)
            if (r8 == 0) goto L_0x012c
            java.lang.String r2 = r13.mo27911H()
            com.onedelhi.secure.t46 r6 = r6.mo15040D()
            java.lang.Boolean r2 = com.onedelhi.secure.n57.m22349i(r2, r6)
            goto L_0x00a5
        L_0x012c:
            com.onedelhi.secure.db5 r6 = r10.f10156a
            com.onedelhi.secure.za6 r6 = r6.f11205a
            com.onedelhi.secure.a56 r6 = r6.mo15136e()
            com.onedelhi.secure.u46 r6 = r6.mo12731w()
            com.onedelhi.secure.db5 r7 = r10.f10156a
            com.onedelhi.secure.za6 r7 = r7.f11205a
            com.onedelhi.secure.l46 r7 = r7.mo27862D()
            java.lang.String r8 = r13.mo27910G()
            java.lang.String r7 = r7.mo19282f(r8)
            java.lang.String r8 = r13.mo27911H()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo25381c(r9, r7, r8)
            goto L_0x0188
        L_0x0152:
            java.lang.String r2 = r13.mo27911H()
            com.onedelhi.secure.o56 r6 = r6.mo15041E()
            com.onedelhi.secure.db5 r8 = r10.f10156a
            com.onedelhi.secure.za6 r8 = r8.f11205a
            com.onedelhi.secure.a56 r8 = r8.mo15136e()
            java.lang.Boolean r2 = com.onedelhi.secure.n57.m22346f(r2, r6, r8)
            goto L_0x00a5
        L_0x0168:
            com.onedelhi.secure.db5 r6 = r10.f10156a
            com.onedelhi.secure.za6 r6 = r6.f11205a
            com.onedelhi.secure.a56 r6 = r6.mo15136e()
            com.onedelhi.secure.u46 r6 = r6.mo12731w()
            com.onedelhi.secure.db5 r7 = r10.f10156a
            com.onedelhi.secure.za6 r7 = r7.f11205a
            com.onedelhi.secure.l46 r7 = r7.mo27862D()
            java.lang.String r8 = r13.mo27910G()
            java.lang.String r7 = r7.mo19282f(r8)
            java.lang.String r8 = "User property has no value, property"
            goto L_0x0094
        L_0x0188:
            com.onedelhi.secure.db5 r6 = r10.f10156a
            com.onedelhi.secure.za6 r6 = r6.f11205a
            com.onedelhi.secure.a56 r6 = r6.mo15136e()
            com.onedelhi.secure.u46 r6 = r6.mo12730v()
            if (r2 != 0) goto L_0x0199
            java.lang.String r7 = "null"
            goto L_0x019a
        L_0x0199:
            r7 = r2
        L_0x019a:
            java.lang.String r8 = "Property filter result"
            r6.mo25380b(r8, r7)
            if (r2 != 0) goto L_0x01a2
            return r4
        L_0x01a2:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r10.f17109a = r4
            if (r3 == 0) goto L_0x01b0
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01af
            goto L_0x01b0
        L_0x01af:
            return r5
        L_0x01b0:
            if (r14 == 0) goto L_0x01ba
            com.onedelhi.secure.z46 r14 = r10.f10157a
            boolean r14 = r14.mo27803H()
            if (r14 == 0) goto L_0x01bc
        L_0x01ba:
            r10.f17112b = r2
        L_0x01bc:
            boolean r14 = r2.booleanValue()
            if (r14 == 0) goto L_0x0201
            if (r1 == 0) goto L_0x0201
            boolean r14 = r13.mo27914S()
            if (r14 == 0) goto L_0x0201
            long r13 = r13.mo27909D()
            if (r11 == 0) goto L_0x01d4
            long r13 = r11.longValue()
        L_0x01d4:
            if (r0 == 0) goto L_0x01ec
            com.onedelhi.secure.z46 r11 = r10.f10157a
            boolean r11 = r11.mo27803H()
            if (r11 == 0) goto L_0x01ec
            com.onedelhi.secure.z46 r11 = r10.f10157a
            boolean r11 = r11.mo27804I()
            if (r11 != 0) goto L_0x01ec
            if (r12 == 0) goto L_0x01ec
            long r13 = r12.longValue()
        L_0x01ec:
            com.onedelhi.secure.z46 r11 = r10.f10157a
            boolean r11 = r11.mo27804I()
            if (r11 == 0) goto L_0x01fb
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f17113b = r11
            goto L_0x0201
        L_0x01fb:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f17110a = r11
        L_0x0201:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.c67.mo14032k(java.lang.Long, java.lang.Long, com.onedelhi.secure.zb6, boolean):boolean");
    }
}

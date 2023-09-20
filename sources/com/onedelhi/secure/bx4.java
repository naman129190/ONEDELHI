package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u00020\u00032\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0002\b\u0004HHø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lcom/onedelhi/secure/dt3;", "", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "builder", "a", "(Lcom/onedelhi/secure/ec1;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class bx4 {

    @cf0(mo32326c = "kotlinx.coroutines.selects.WhileSelectKt", mo32327f = "WhileSelect.kt", mo32328i = {0}, mo32329l = {37}, mo32330m = "whileSelect", mo32331n = {"builder"}, mo32332s = {"L$0"})
    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 176)
    /* renamed from: com.onedelhi.secure.bx4$a */
    public static final class C4712a extends e80 {

        /* renamed from: a */
        public Object f26567a;

        /* renamed from: b */
        public /* synthetic */ Object f26568b;

        /* renamed from: n */
        public int f26569n;

        public C4712a(b80<? super C4712a> b80) {
            super(b80);
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            this.f26568b = obj;
            this.f26569n |= Integer.MIN_VALUE;
            return bx4.m40615a((ec1<? super dt3<? super Boolean>, un4>) null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    @com.onedelhi.secure.fy0
    @com.onedelhi.secure.ss2
    /* renamed from: a */
    public static final java.lang.Object m40615a(@com.onedelhi.secure.vr2 com.onedelhi.secure.ec1<? super com.onedelhi.secure.dt3<? super java.lang.Boolean>, com.onedelhi.secure.un4> r4, @com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super com.onedelhi.secure.un4> r5) {
        /*
            boolean r0 = r5 instanceof com.onedelhi.secure.bx4.C4712a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.onedelhi.secure.bx4$a r0 = (com.onedelhi.secure.bx4.C4712a) r0
            int r1 = r0.f26569n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26569n = r1
            goto L_0x0018
        L_0x0013:
            com.onedelhi.secure.bx4$a r0 = new com.onedelhi.secure.bx4$a
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f26568b
            java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
            int r2 = r0.f26569n
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f26567a
            com.onedelhi.secure.ec1 r4 = (com.onedelhi.secure.ec1) r4
            com.onedelhi.secure.pl3.m61436n(r5)
            goto L_0x0059
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            com.onedelhi.secure.pl3.m61436n(r5)
        L_0x0038:
            r0.f26567a = r4
            r0.f26569n = r3
            com.onedelhi.secure.et3 r5 = new com.onedelhi.secure.et3
            r5.<init>(r0)
            r4.mo17094X(r5)     // Catch:{ all -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r2 = move-exception
            r5.mo35602j1(r2)
        L_0x0049:
            java.lang.Object r5 = r5.mo35601i1()
            java.lang.Object r2 = com.onedelhi.secure.mt1.m57558h()
            if (r5 != r2) goto L_0x0056
            com.onedelhi.secure.hf0.m50483c(r0)
        L_0x0056:
            if (r5 != r1) goto L_0x0059
            return r1
        L_0x0059:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0062
            goto L_0x0038
        L_0x0062:
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bx4.m40615a(com.onedelhi.secure.ec1, com.onedelhi.secure.b80):java.lang.Object");
    }

    @fy0
    /* renamed from: b */
    public static final Object m40616b(ec1<? super dt3<? super Boolean>, un4> ec1, b80<? super un4> b80) {
        Object i1;
        do {
            uq1.m67404e(0);
            et3 et3 = new et3(b80);
            try {
                ec1.mo17094X(et3);
            } catch (Throwable th) {
                et3.mo35602j1(th);
            }
            i1 = et3.mo35601i1();
            if (i1 == mt1.m57558h()) {
                hf0.m50483c(b80);
            }
            uq1.m67404e(1);
        } while (((Boolean) i1).booleanValue());
        return un4.f36206a;
    }
}

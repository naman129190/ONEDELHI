package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0000\u001a;\u0010\u0017\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"T", "Lcom/onedelhi/secure/b80;", "Lcom/onedelhi/secure/nl3;", "result", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/iy2;", "name", "cause", "Lcom/onedelhi/secure/un4;", "onCancellation", "f", "(Lcom/onedelhi/secure/b80;Ljava/lang/Object;Lcom/onedelhi/secure/ec1;)V", "Lcom/onedelhi/secure/qm0;", "", "h", "", "contState", "", "mode", "doYield", "Lkotlin/Function0;", "block", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class rm0 {
    @vr2

    /* renamed from: a */
    public static final l84 f34682a = new l84("UNDEFINED");
    @rw1
    @vr2

    /* renamed from: b */
    public static final l84 f34683b = new l84("REUSABLE_CLAIMED");

    /* renamed from: b */
    public static final boolean m63743b(qm0<?> qm0, Object obj, int i, boolean z, cc1<un4> cc1) {
        vv0 b = wb4.f36943a.mo46668b();
        if (z && b.mo46382z1()) {
            return false;
        }
        if (b.mo46381w1()) {
            qm0.f34312a = obj;
            qm0.f35730n = i;
            b.mo46376i1(qm0);
            return true;
        }
        b.mo46378l1(true);
        try {
            cc1.invoke();
            do {
            } while (b.mo46372B1());
        } catch (Throwable th) {
            uq1.m67403d(1);
            b.mo46374c1(true);
            uq1.m67402c(1);
            throw th;
        }
        uq1.m67403d(1);
        b.mo46374c1(true);
        uq1.m67402c(1);
        return false;
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m63744c(qm0 qm0, Object obj, int i, boolean z, cc1 cc1, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        vv0 b = wb4.f36943a.mo46668b();
        if (z && b.mo46382z1()) {
            return false;
        }
        if (b.mo46381w1()) {
            qm0.f34312a = obj;
            qm0.f35730n = i;
            b.mo46376i1(qm0);
            return true;
        }
        b.mo46378l1(true);
        try {
            cc1.invoke();
            do {
            } while (b.mo46372B1());
        } catch (Throwable th) {
            uq1.m67403d(1);
            b.mo46374c1(true);
            uq1.m67402c(1);
            throw th;
        }
        uq1.m67403d(1);
        b.mo46374c1(true);
        uq1.m67402c(1);
        return false;
    }

    /* renamed from: d */
    public static /* synthetic */ void m63745d() {
    }

    /* renamed from: e */
    public static /* synthetic */ void m63746e() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r8.mo41920L1() != false) goto L_0x0091;
     */
    @com.onedelhi.secure.zs1
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m63747f(@com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super T> r6, @com.onedelhi.secure.vr2 java.lang.Object r7, @com.onedelhi.secure.ss2 com.onedelhi.secure.ec1<? super java.lang.Throwable, com.onedelhi.secure.un4> r8) {
        /*
            boolean r0 = r6 instanceof com.onedelhi.secure.qm0
            if (r0 == 0) goto L_0x00b6
            com.onedelhi.secure.qm0 r6 = (com.onedelhi.secure.qm0) r6
            java.lang.Object r8 = com.onedelhi.secure.s20.m64135c(r7, r8)
            com.onedelhi.secure.e90 r0 = r6.f34311a
            com.onedelhi.secure.b90 r1 = r6.mo31187f()
            boolean r0 = r0.mo31903S0(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f34312a = r8
            r6.f35730n = r1
            com.onedelhi.secure.e90 r7 = r6.f34311a
            com.onedelhi.secure.b90 r8 = r6.mo31187f()
            r7.mo31902Q0(r8, r6)
            goto L_0x00b9
        L_0x0026:
            com.onedelhi.secure.wb4 r0 = com.onedelhi.secure.wb4.f36943a
            com.onedelhi.secure.vv0 r0 = r0.mo46668b()
            boolean r2 = r0.mo46381w1()
            if (r2 == 0) goto L_0x003b
            r6.f34312a = r8
            r6.f35730n = r1
            r0.mo46376i1(r6)
            goto L_0x00b9
        L_0x003b:
            r0.mo46378l1(r1)
            r2 = 0
            com.onedelhi.secure.b90 r3 = r6.mo31187f()     // Catch:{ all -> 0x00a9 }
            com.onedelhi.secure.ru1$b r4 = com.onedelhi.secure.ru1.f34751a     // Catch:{ all -> 0x00a9 }
            com.onedelhi.secure.b90$b r3 = r3.get(r4)     // Catch:{ all -> 0x00a9 }
            com.onedelhi.secure.ru1 r3 = (com.onedelhi.secure.ru1) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0069
            boolean r4 = r3.mo32103b()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x0069
            java.util.concurrent.CancellationException r3 = r3.mo32113h()     // Catch:{ all -> 0x00a9 }
            r6.mo38895e(r8, r3)     // Catch:{ all -> 0x00a9 }
            com.onedelhi.secure.nl3$a r8 = com.onedelhi.secure.nl3.f32575a     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = com.onedelhi.secure.pl3.m61423a(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Object r8 = com.onedelhi.secure.nl3.m58187b(r8)     // Catch:{ all -> 0x00a9 }
            r6.mo31191m0(r8)     // Catch:{ all -> 0x00a9 }
            r8 = 1
            goto L_0x006a
        L_0x0069:
            r8 = 0
        L_0x006a:
            if (r8 != 0) goto L_0x00a2
            com.onedelhi.secure.b80<T> r8 = r6.f34310a     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.f34313b     // Catch:{ all -> 0x00a9 }
            com.onedelhi.secure.b90 r4 = r8.mo31187f()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = com.onedelhi.secure.ub4.m66925c(r4, r3)     // Catch:{ all -> 0x00a9 }
            com.onedelhi.secure.l84 r5 = com.onedelhi.secure.ub4.f36021a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0081
            com.onedelhi.secure.on4 r8 = com.onedelhi.secure.d90.m44811g(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0082
        L_0x0081:
            r8 = r2
        L_0x0082:
            com.onedelhi.secure.b80<T> r5 = r6.f34310a     // Catch:{ all -> 0x0095 }
            r5.mo31191m0(r7)     // Catch:{ all -> 0x0095 }
            com.onedelhi.secure.un4 r7 = com.onedelhi.secure.un4.f36206a     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.mo41920L1()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            com.onedelhi.secure.ub4.m66923a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.mo41920L1()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            com.onedelhi.secure.ub4.m66923a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.mo46372B1()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.mo45182l(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.mo46374c1(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.mo46374c1(r1)
            throw r6
        L_0x00b6:
            r6.mo31191m0(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rm0.m63747f(com.onedelhi.secure.b80, java.lang.Object, com.onedelhi.secure.ec1):void");
    }

    /* renamed from: g */
    public static /* synthetic */ void m63748g(b80 b80, Object obj, ec1 ec1, int i, Object obj2) {
        if ((i & 2) != 0) {
            ec1 = null;
        }
        m63747f(b80, obj, ec1);
    }

    /* renamed from: h */
    public static final boolean m63749h(@vr2 qm0<? super un4> qm0) {
        un4 un4 = un4.f36206a;
        vv0 b = wb4.f36943a.mo46668b();
        if (b.mo46382z1()) {
            return false;
        }
        if (b.mo46381w1()) {
            qm0.f34312a = un4;
            qm0.f35730n = 1;
            b.mo46376i1(qm0);
            return true;
        }
        b.mo46378l1(true);
        try {
            qm0.run();
            do {
            } while (b.mo46372B1());
        } catch (Throwable th) {
            b.mo46374c1(true);
            throw th;
        }
        b.mo46374c1(true);
        return false;
    }
}

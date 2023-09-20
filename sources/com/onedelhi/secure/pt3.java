package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000\u001a8\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HHø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"", "permits", "acquiredPermits", "Lcom/onedelhi/secure/nt3;", "a", "T", "Lkotlin/Function0;", "action", "q", "(Lcom/onedelhi/secure/nt3;Lcom/onedelhi/secure/cc1;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "id", "Lcom/onedelhi/secure/qt3;", "prev", "j", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class pt3 {

    /* renamed from: a */
    public static final int f33770a = i94.m51958d("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);
    @vr2

    /* renamed from: a */
    public static final l84 f33771a = new l84("PERMIT");

    /* renamed from: b */
    public static final int f33772b = i94.m51958d("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);
    @vr2

    /* renamed from: b */
    public static final l84 f33773b = new l84("TAKEN");
    @vr2

    /* renamed from: c */
    public static final l84 f33774c = new l84("BROKEN");
    @vr2

    /* renamed from: d */
    public static final l84 f33775d = new l84("CANCELLED");

    @cf0(mo32326c = "kotlinx.coroutines.sync.SemaphoreKt", mo32327f = "Semaphore.kt", mo32328i = {0, 0}, mo32329l = {85}, mo32330m = "withPermit", mo32331n = {"$this$withPermit", "action"}, mo32332s = {"L$0", "L$1"})
    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 176)
    /* renamed from: com.onedelhi.secure.pt3$a */
    public static final class C6471a<T> extends e80 {

        /* renamed from: a */
        public Object f33776a;

        /* renamed from: b */
        public Object f33777b;

        /* renamed from: c */
        public /* synthetic */ Object f33778c;

        /* renamed from: n */
        public int f33779n;

        public C6471a(b80<? super C6471a> b80) {
            super(b80);
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            this.f33778c = obj;
            this.f33779n |= Integer.MIN_VALUE;
            return pt3.m61645q((nt3) null, (cc1) null, this);
        }
    }

    @vr2
    /* renamed from: a */
    public static final nt3 m61629a(int i, int i2) {
        return new ot3(i, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ nt3 m61630b(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m61629a(i, i2);
    }

    /* renamed from: j */
    public static final qt3 m61638j(long j, qt3 qt3) {
        return new qt3(j, qt3, 0);
    }

    /* renamed from: k */
    public static /* synthetic */ void m61639k() {
    }

    /* renamed from: l */
    public static /* synthetic */ void m61640l() {
    }

    /* renamed from: m */
    public static /* synthetic */ void m61641m() {
    }

    /* renamed from: n */
    public static /* synthetic */ void m61642n() {
    }

    /* renamed from: o */
    public static /* synthetic */ void m61643o() {
    }

    /* renamed from: p */
    public static /* synthetic */ void m61644p() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.onedelhi.secure.cc1<? extends T>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @com.onedelhi.secure.ss2
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m61645q(@com.onedelhi.secure.vr2 com.onedelhi.secure.nt3 r4, @com.onedelhi.secure.vr2 com.onedelhi.secure.cc1<? extends T> r5, @com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super T> r6) {
        /*
            boolean r0 = r6 instanceof com.onedelhi.secure.pt3.C6471a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.onedelhi.secure.pt3$a r0 = (com.onedelhi.secure.pt3.C6471a) r0
            int r1 = r0.f33779n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f33779n = r1
            goto L_0x0018
        L_0x0013:
            com.onedelhi.secure.pt3$a r0 = new com.onedelhi.secure.pt3$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f33778c
            java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
            int r2 = r0.f33779n
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.f33777b
            r5 = r4
            com.onedelhi.secure.cc1 r5 = (com.onedelhi.secure.cc1) r5
            java.lang.Object r4 = r0.f33776a
            com.onedelhi.secure.nt3 r4 = (com.onedelhi.secure.nt3) r4
            com.onedelhi.secure.pl3.m61436n(r6)
            goto L_0x004a
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            com.onedelhi.secure.pl3.m61436n(r6)
            r0.f33776a = r4
            r0.f33777b = r5
            r0.f33779n = r3
            java.lang.Object r6 = r4.mo41488b(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.Object r5 = r5.invoke()     // Catch:{ all -> 0x0058 }
            com.onedelhi.secure.uq1.m67403d(r3)
            r4.release()
            com.onedelhi.secure.uq1.m67402c(r3)
            return r5
        L_0x0058:
            r5 = move-exception
            com.onedelhi.secure.uq1.m67403d(r3)
            r4.release()
            com.onedelhi.secure.uq1.m67402c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pt3.m61645q(com.onedelhi.secure.nt3, com.onedelhi.secure.cc1, com.onedelhi.secure.b80):java.lang.Object");
    }

    /* renamed from: r */
    public static final <T> Object m61646r(nt3 nt3, cc1<? extends T> cc1, b80<? super T> b80) {
        uq1.m67404e(0);
        nt3.mo41488b(b80);
        uq1.m67404e(1);
        try {
            return cc1.invoke();
        } finally {
            uq1.m67403d(1);
            nt3.release();
            uq1.m67402c(1);
        }
    }
}

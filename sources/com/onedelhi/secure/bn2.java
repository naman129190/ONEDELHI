package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HHø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"", "locked", "Lcom/onedelhi/secure/zm2;", "a", "T", "", "owner", "Lkotlin/Function0;", "action", "o", "(Lcom/onedelhi/secure/zm2;Ljava/lang/Object;Lcom/onedelhi/secure/cc1;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class bn2 {
    @vr2

    /* renamed from: a */
    public static final et0 f26451a;
    @vr2

    /* renamed from: a */
    public static final l84 f26452a = new l84("LOCK_FAIL");
    @vr2

    /* renamed from: b */
    public static final et0 f26453b;
    @vr2

    /* renamed from: b */
    public static final l84 f26454b = new l84("UNLOCK_FAIL");
    @vr2

    /* renamed from: c */
    public static final l84 f26455c;
    @vr2

    /* renamed from: d */
    public static final l84 f26456d;

    @cf0(mo32326c = "kotlinx.coroutines.sync.MutexKt", mo32327f = "Mutex.kt", mo32328i = {0, 0, 0}, mo32329l = {112}, mo32330m = "withLock", mo32331n = {"$this$withLock", "owner", "action"}, mo32332s = {"L$0", "L$1", "L$2"})
    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 176)
    /* renamed from: com.onedelhi.secure.bn2$a */
    public static final class C4687a<T> extends e80 {

        /* renamed from: a */
        public Object f26457a;

        /* renamed from: b */
        public Object f26458b;

        /* renamed from: c */
        public Object f26459c;

        /* renamed from: d */
        public /* synthetic */ Object f26460d;

        /* renamed from: n */
        public int f26461n;

        public C4687a(b80<? super C4687a> b80) {
            super(b80);
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            this.f26460d = obj;
            this.f26461n |= Integer.MIN_VALUE;
            return bn2.m40196o((zm2) null, (Object) null, (cc1) null, this);
        }
    }

    static {
        l84 l84 = new l84("LOCKED");
        f26455c = l84;
        l84 l842 = new l84("UNLOCKED");
        f26456d = l842;
        f26451a = new et0(l84);
        f26453b = new et0(l842);
    }

    @vr2
    /* renamed from: a */
    public static final zm2 m40182a(boolean z) {
        return new an2(z);
    }

    /* renamed from: b */
    public static /* synthetic */ zm2 m40183b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m40182a(z);
    }

    /* renamed from: i */
    public static /* synthetic */ void m40190i() {
    }

    /* renamed from: j */
    public static /* synthetic */ void m40191j() {
    }

    /* renamed from: k */
    public static /* synthetic */ void m40192k() {
    }

    /* renamed from: l */
    public static /* synthetic */ void m40193l() {
    }

    /* renamed from: m */
    public static /* synthetic */ void m40194m() {
    }

    /* renamed from: n */
    public static /* synthetic */ void m40195n() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.onedelhi.secure.cc1<? extends T>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @com.onedelhi.secure.ss2
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m40196o(@com.onedelhi.secure.vr2 com.onedelhi.secure.zm2 r4, @com.onedelhi.secure.ss2 java.lang.Object r5, @com.onedelhi.secure.vr2 com.onedelhi.secure.cc1<? extends T> r6, @com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super T> r7) {
        /*
            boolean r0 = r7 instanceof com.onedelhi.secure.bn2.C4687a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onedelhi.secure.bn2$a r0 = (com.onedelhi.secure.bn2.C4687a) r0
            int r1 = r0.f26461n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26461n = r1
            goto L_0x0018
        L_0x0013:
            com.onedelhi.secure.bn2$a r0 = new com.onedelhi.secure.bn2$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f26460d
            java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
            int r2 = r0.f26461n
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.f26459c
            r6 = r4
            com.onedelhi.secure.cc1 r6 = (com.onedelhi.secure.cc1) r6
            java.lang.Object r5 = r0.f26458b
            java.lang.Object r4 = r0.f26457a
            com.onedelhi.secure.zm2 r4 = (com.onedelhi.secure.zm2) r4
            com.onedelhi.secure.pl3.m61436n(r7)
            goto L_0x004e
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            com.onedelhi.secure.pl3.m61436n(r7)
            r0.f26457a = r4
            r0.f26458b = r5
            r0.f26459c = r6
            r0.f26461n = r3
            java.lang.Object r7 = r4.mo31066c(r5, r0)
            if (r7 != r1) goto L_0x004e
            return r1
        L_0x004e:
            java.lang.Object r6 = r6.invoke()     // Catch:{ all -> 0x005c }
            com.onedelhi.secure.uq1.m67403d(r3)
            r4.mo31067d(r5)
            com.onedelhi.secure.uq1.m67402c(r3)
            return r6
        L_0x005c:
            r6 = move-exception
            com.onedelhi.secure.uq1.m67403d(r3)
            r4.mo31067d(r5)
            com.onedelhi.secure.uq1.m67402c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bn2.m40196o(com.onedelhi.secure.zm2, java.lang.Object, com.onedelhi.secure.cc1, com.onedelhi.secure.b80):java.lang.Object");
    }

    /* renamed from: p */
    public static final <T> Object m40197p(zm2 zm2, Object obj, cc1<? extends T> cc1, b80<? super T> b80) {
        uq1.m67404e(0);
        zm2.mo31066c(obj, b80);
        uq1.m67404e(1);
        try {
            return cc1.invoke();
        } finally {
            uq1.m67403d(1);
            zm2.mo31067d(obj);
            uq1.m67402c(1);
        }
    }

    /* renamed from: q */
    public static /* synthetic */ Object m40198q(zm2 zm2, Object obj, cc1 cc1, b80 b80, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        uq1.m67404e(0);
        zm2.mo31066c(obj, b80);
        uq1.m67404e(1);
        try {
            return cc1.invoke();
        } finally {
            uq1.m67403d(1);
            zm2.mo31067d(obj);
            uq1.m67402c(1);
        }
    }
}

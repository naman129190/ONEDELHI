package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000HAø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/l64;", "T", "Lcom/onedelhi/secure/o81;", "value", "Lcom/onedelhi/secure/un4;", "c", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "a", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "collector", "Lkotlin/Function2;", "Lcom/onedelhi/secure/b80;", "", "Lcom/onedelhi/secure/wy0;", "action", "<init>", "(Lcom/onedelhi/secure/o81;Lcom/onedelhi/secure/sc1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class l64<T> implements o81<T> {
    @vr2

    /* renamed from: a */
    public final o81<T> f31570a;
    @vr2

    /* renamed from: a */
    public final sc1<o81<? super T>, b80<? super un4>, Object> f31571a;

    @cf0(mo32326c = "kotlinx.coroutines.flow.SubscribedFlowCollector", mo32327f = "Share.kt", mo32328i = {0, 0}, mo32329l = {419, 423}, mo32330m = "onSubscription", mo32331n = {"this", "safeCollector"}, mo32332s = {"L$0", "L$1"})
    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.l64$a */
    public static final class C5969a extends e80 {

        /* renamed from: a */
        public final /* synthetic */ l64<T> f31572a;

        /* renamed from: a */
        public Object f31573a;

        /* renamed from: b */
        public Object f31574b;

        /* renamed from: c */
        public /* synthetic */ Object f31575c;

        /* renamed from: n */
        public int f31576n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5969a(l64<T> l64, b80<? super C5969a> b80) {
            super(b80);
            this.f31572a = l64;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            this.f31575c = obj;
            this.f31576n |= Integer.MIN_VALUE;
            return this.f31572a.mo39677a(this);
        }
    }

    public l64(@vr2 o81<? super T> o81, @vr2 sc1<? super o81<? super T>, ? super b80<? super un4>, ? extends Object> sc1) {
        this.f31570a = o81;
        this.f31571a = sc1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @com.onedelhi.secure.ss2
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39677a(@com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super com.onedelhi.secure.un4> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.onedelhi.secure.l64.C5969a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onedelhi.secure.l64$a r0 = (com.onedelhi.secure.l64.C5969a) r0
            int r1 = r0.f31576n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31576n = r1
            goto L_0x0018
        L_0x0013:
            com.onedelhi.secure.l64$a r0 = new com.onedelhi.secure.l64$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f31575c
            java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
            int r2 = r0.f31576n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            com.onedelhi.secure.pl3.m61436n(r7)
            goto L_0x0077
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.f31574b
            com.onedelhi.secure.iq3 r2 = (com.onedelhi.secure.iq3) r2
            java.lang.Object r4 = r0.f31573a
            com.onedelhi.secure.l64 r4 = (com.onedelhi.secure.l64) r4
            com.onedelhi.secure.pl3.m61436n(r7)     // Catch:{ all -> 0x007d }
            goto L_0x005e
        L_0x0040:
            com.onedelhi.secure.pl3.m61436n(r7)
            com.onedelhi.secure.iq3 r2 = new com.onedelhi.secure.iq3
            com.onedelhi.secure.o81<T> r7 = r6.f31570a
            com.onedelhi.secure.b90 r5 = r0.mo31187f()
            r2.<init>(r7, r5)
            com.onedelhi.secure.sc1<com.onedelhi.secure.o81<? super T>, com.onedelhi.secure.b80<? super com.onedelhi.secure.un4>, java.lang.Object> r7 = r6.f31571a     // Catch:{ all -> 0x007d }
            r0.f31573a = r6     // Catch:{ all -> 0x007d }
            r0.f31574b = r2     // Catch:{ all -> 0x007d }
            r0.f31576n = r4     // Catch:{ all -> 0x007d }
            java.lang.Object r7 = r7.mo21054h0(r2, r0)     // Catch:{ all -> 0x007d }
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r4 = r6
        L_0x005e:
            r2.mo34861F()
            com.onedelhi.secure.o81<T> r7 = r4.f31570a
            boolean r2 = r7 instanceof com.onedelhi.secure.l64
            if (r2 == 0) goto L_0x007a
            com.onedelhi.secure.l64 r7 = (com.onedelhi.secure.l64) r7
            r2 = 0
            r0.f31573a = r2
            r0.f31574b = r2
            r0.f31576n = r3
            java.lang.Object r7 = r7.mo39677a(r0)
            if (r7 != r1) goto L_0x0077
            return r1
        L_0x0077:
            com.onedelhi.secure.un4 r7 = com.onedelhi.secure.un4.f36206a
            return r7
        L_0x007a:
            com.onedelhi.secure.un4 r7 = com.onedelhi.secure.un4.f36206a
            return r7
        L_0x007d:
            r7 = move-exception
            r2.mo34861F()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.l64.mo39677a(com.onedelhi.secure.b80):java.lang.Object");
    }

    @ss2
    /* renamed from: c */
    public Object mo31452c(T t, @vr2 b80<? super un4> b80) {
        return this.f31570a.mo31452c(t, b80);
    }
}

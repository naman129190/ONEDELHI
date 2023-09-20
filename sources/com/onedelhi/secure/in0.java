package com.onedelhi.secure;

import com.onedelhi.secure.yg3;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012:\u0010\u0012\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/onedelhi/secure/in0;", "T", "Lcom/onedelhi/secure/m81;", "Lcom/onedelhi/secure/o81;", "collector", "Lcom/onedelhi/secure/un4;", "a", "(Lcom/onedelhi/secure/o81;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "Lcom/onedelhi/secure/iy2;", "name", "old", "new", "", "areEquivalent", "<init>", "(Lcom/onedelhi/secure/m81;Lcom/onedelhi/secure/ec1;Lcom/onedelhi/secure/sc1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class in0<T> implements m81<T> {
    @rw1
    @vr2

    /* renamed from: a */
    public final ec1<T, Object> f30370a;
    @vr2

    /* renamed from: a */
    public final m81<T> f30371a;
    @rw1
    @vr2

    /* renamed from: a */
    public final sc1<Object, Object, Boolean> f30372a;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lcom/onedelhi/secure/un4;", "c", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.in0$a */
    public static final class C5736a<T> implements o81, g84 {

        /* renamed from: a */
        public final /* synthetic */ in0<T> f30373a;

        /* renamed from: a */
        public final /* synthetic */ o81<T> f30374a;

        /* renamed from: a */
        public final /* synthetic */ yg3.C7357h<Object> f30375a;

        @cf0(mo32326c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", mo32327f = "Distinct.kt", mo32328i = {}, mo32329l = {81}, mo32330m = "emit", mo32331n = {}, mo32332s = {})
        @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
        /* renamed from: com.onedelhi.secure.in0$a$a */
        public static final class C5737a extends e80 {

            /* renamed from: a */
            public final /* synthetic */ C5736a<T> f30376a;

            /* renamed from: a */
            public /* synthetic */ Object f30377a;

            /* renamed from: n */
            public int f30378n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5737a(C5736a<? super T> aVar, b80<? super C5737a> b80) {
                super(b80);
                this.f30376a = aVar;
            }

            @ss2
            /* renamed from: D */
            public final Object mo22645D(@vr2 Object obj) {
                this.f30377a = obj;
                this.f30378n |= Integer.MIN_VALUE;
                return this.f30376a.mo31452c(null, this);
            }
        }

        public C5736a(in0<T> in0, yg3.C7357h<Object> hVar, o81<? super T> o81) {
            this.f30373a = in0;
            this.f30375a = hVar;
            this.f30374a = o81;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @com.onedelhi.secure.ss2
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo31452c(T r6, @com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super com.onedelhi.secure.un4> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.onedelhi.secure.in0.C5736a.C5737a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                com.onedelhi.secure.in0$a$a r0 = (com.onedelhi.secure.in0.C5736a.C5737a) r0
                int r1 = r0.f30378n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f30378n = r1
                goto L_0x0018
            L_0x0013:
                com.onedelhi.secure.in0$a$a r0 = new com.onedelhi.secure.in0$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f30377a
                java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
                int r2 = r0.f30378n
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                com.onedelhi.secure.pl3.m61436n(r7)
                goto L_0x0067
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                com.onedelhi.secure.pl3.m61436n(r7)
                com.onedelhi.secure.in0<T> r7 = r5.f30373a
                com.onedelhi.secure.ec1<T, java.lang.Object> r7 = r7.f30370a
                java.lang.Object r7 = r7.mo17094X(r6)
                com.onedelhi.secure.yg3$h<java.lang.Object> r2 = r5.f30375a
                T r2 = r2.f37912a
                com.onedelhi.secure.l84 r4 = com.onedelhi.secure.qs2.f34347a
                if (r2 == r4) goto L_0x0058
                com.onedelhi.secure.in0<T> r4 = r5.f30373a
                com.onedelhi.secure.sc1<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f30372a
                java.lang.Object r2 = r4.mo21054h0(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0055
                goto L_0x0058
            L_0x0055:
                com.onedelhi.secure.un4 r6 = com.onedelhi.secure.un4.f36206a
                return r6
            L_0x0058:
                com.onedelhi.secure.yg3$h<java.lang.Object> r2 = r5.f30375a
                r2.f37912a = r7
                com.onedelhi.secure.o81<T> r7 = r5.f30374a
                r0.f30378n = r3
                java.lang.Object r6 = r7.mo31452c(r6, r0)
                if (r6 != r1) goto L_0x0067
                return r1
            L_0x0067:
                com.onedelhi.secure.un4 r6 = com.onedelhi.secure.un4.f36206a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.in0.C5736a.mo31452c(java.lang.Object, com.onedelhi.secure.b80):java.lang.Object");
        }
    }

    public in0(@vr2 m81<? extends T> m81, @vr2 ec1<? super T, ? extends Object> ec1, @vr2 sc1<Object, Object, Boolean> sc1) {
        this.f30371a = m81;
        this.f30370a = ec1;
        this.f30372a = sc1;
    }

    @ss2
    /* renamed from: a */
    public Object mo31451a(@vr2 o81<? super T> o81, @vr2 b80<? super un4> b80) {
        yg3.C7357h hVar = new yg3.C7357h();
        hVar.f37912a = qs2.f34347a;
        Object a = this.f30371a.mo31451a(new C5736a(this, hVar, o81), b80);
        return a == mt1.m57558h() ? a : un4.f36206a;
    }
}

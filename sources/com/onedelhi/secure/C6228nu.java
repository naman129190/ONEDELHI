package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/nu;", "T", "Lcom/onedelhi/secure/mu;", "Lcom/onedelhi/secure/o81;", "collector", "Lcom/onedelhi/secure/un4;", "a", "(Lcom/onedelhi/secure/o81;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/m81;", "flow", "<init>", "(Lcom/onedelhi/secure/m81;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.nu */
public final class C6228nu<T> implements C6142mu<T> {
    @vr2

    /* renamed from: a */
    public final m81<T> f32785a;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lcom/onedelhi/secure/un4;", "c", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.nu$a */
    public static final class C6229a<T> implements o81, g84 {

        /* renamed from: a */
        public final /* synthetic */ o81<T> f32786a;

        @cf0(mo32326c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", mo32327f = "Context.kt", mo32328i = {}, mo32329l = {275}, mo32330m = "emit", mo32331n = {}, mo32332s = {})
        @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
        /* renamed from: com.onedelhi.secure.nu$a$a */
        public static final class C6230a extends e80 {

            /* renamed from: a */
            public final /* synthetic */ C6229a<T> f32787a;

            /* renamed from: a */
            public /* synthetic */ Object f32788a;

            /* renamed from: n */
            public int f32789n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6230a(C6229a<? super T> aVar, b80<? super C6230a> b80) {
                super(b80);
                this.f32787a = aVar;
            }

            @ss2
            /* renamed from: D */
            public final Object mo22645D(@vr2 Object obj) {
                this.f32788a = obj;
                this.f32789n |= Integer.MIN_VALUE;
                return this.f32787a.mo31452c(null, this);
            }
        }

        public C6229a(o81<? super T> o81) {
            this.f32786a = o81;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @com.onedelhi.secure.ss2
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo31452c(T r5, @com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super com.onedelhi.secure.un4> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.onedelhi.secure.C6228nu.C6229a.C6230a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                com.onedelhi.secure.nu$a$a r0 = (com.onedelhi.secure.C6228nu.C6229a.C6230a) r0
                int r1 = r0.f32789n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f32789n = r1
                goto L_0x0018
            L_0x0013:
                com.onedelhi.secure.nu$a$a r0 = new com.onedelhi.secure.nu$a$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f32788a
                java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
                int r2 = r0.f32789n
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                com.onedelhi.secure.pl3.m61436n(r6)
                goto L_0x0046
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0031:
                com.onedelhi.secure.pl3.m61436n(r6)
                com.onedelhi.secure.b90 r6 = r0.mo31187f()
                com.onedelhi.secure.xu1.m70832z(r6)
                com.onedelhi.secure.o81<T> r6 = r4.f32786a
                r0.f32789n = r3
                java.lang.Object r5 = r6.mo31452c(r5, r0)
                if (r5 != r1) goto L_0x0046
                return r1
            L_0x0046:
                com.onedelhi.secure.un4 r5 = com.onedelhi.secure.un4.f36206a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6228nu.C6229a.mo31452c(java.lang.Object, com.onedelhi.secure.b80):java.lang.Object");
        }
    }

    public C6228nu(@vr2 m81<? extends T> m81) {
        this.f32785a = m81;
    }

    @ss2
    /* renamed from: a */
    public Object mo31451a(@vr2 o81<? super T> o81, @vr2 b80<? super un4> b80) {
        Object a = this.f32785a.mo31451a(new C6229a(o81), b80);
        return a == mt1.m57558h() ? a : un4.f36206a;
    }
}

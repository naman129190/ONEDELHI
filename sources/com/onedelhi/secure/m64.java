package com.onedelhi.secure;

import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r¢\u0006\u0002\b\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/onedelhi/secure/m64;", "T", "Lcom/onedelhi/secure/qx3;", "Lcom/onedelhi/secure/o81;", "collector", "", "a", "(Lcom/onedelhi/secure/o81;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "b", "()Ljava/util/List;", "replayCache", "sharedFlow", "Lkotlin/Function2;", "Lcom/onedelhi/secure/b80;", "Lcom/onedelhi/secure/un4;", "", "Lcom/onedelhi/secure/wy0;", "action", "<init>", "(Lcom/onedelhi/secure/qx3;Lcom/onedelhi/secure/sc1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class m64<T> implements qx3<T> {
    @vr2

    /* renamed from: a */
    public final qx3<T> f32029a;
    @vr2

    /* renamed from: a */
    public final sc1<o81<? super T>, b80<? super un4>, Object> f32030a;

    @cf0(mo32326c = "kotlinx.coroutines.flow.SubscribedSharedFlow", mo32327f = "Share.kt", mo32328i = {}, mo32329l = {409}, mo32330m = "collect", mo32331n = {}, mo32332s = {})
    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.m64$a */
    public static final class C6096a extends e80 {

        /* renamed from: a */
        public final /* synthetic */ m64<T> f32031a;

        /* renamed from: a */
        public /* synthetic */ Object f32032a;

        /* renamed from: n */
        public int f32033n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6096a(m64<T> m64, b80<? super C6096a> b80) {
            super(b80);
            this.f32031a = m64;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            this.f32032a = obj;
            this.f32033n |= Integer.MIN_VALUE;
            return this.f32031a.mo31451a((o81) null, this);
        }
    }

    public m64(@vr2 qx3<? extends T> qx3, @vr2 sc1<? super o81<? super T>, ? super b80<? super un4>, ? extends Object> sc1) {
        this.f32029a = qx3;
        this.f32030a = sc1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @com.onedelhi.secure.ss2
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo31451a(@com.onedelhi.secure.vr2 com.onedelhi.secure.o81<? super T> r6, @com.onedelhi.secure.vr2 com.onedelhi.secure.b80<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.onedelhi.secure.m64.C6096a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onedelhi.secure.m64$a r0 = (com.onedelhi.secure.m64.C6096a) r0
            int r1 = r0.f32033n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f32033n = r1
            goto L_0x0018
        L_0x0013:
            com.onedelhi.secure.m64$a r0 = new com.onedelhi.secure.m64$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f32032a
            java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
            int r2 = r0.f32033n
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            com.onedelhi.secure.pl3.m61436n(r7)
            goto L_0x0046
        L_0x0031:
            com.onedelhi.secure.pl3.m61436n(r7)
            com.onedelhi.secure.qx3<T> r7 = r5.f32029a
            com.onedelhi.secure.l64 r2 = new com.onedelhi.secure.l64
            com.onedelhi.secure.sc1<com.onedelhi.secure.o81<? super T>, com.onedelhi.secure.b80<? super com.onedelhi.secure.un4>, java.lang.Object> r4 = r5.f32030a
            r2.<init>(r6, r4)
            r0.f32033n = r3
            java.lang.Object r6 = r7.mo31451a(r2, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            com.onedelhi.secure.b02 r6 = new com.onedelhi.secure.b02
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.m64.mo31451a(com.onedelhi.secure.o81, com.onedelhi.secure.b80):java.lang.Object");
    }

    @vr2
    /* renamed from: b */
    public List<T> mo34780b() {
        return this.f32029a.mo34780b();
    }
}

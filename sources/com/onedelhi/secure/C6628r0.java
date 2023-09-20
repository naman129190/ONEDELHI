package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/r0;", "T", "Lcom/onedelhi/secure/m81;", "Lcom/onedelhi/secure/mu;", "Lcom/onedelhi/secure/o81;", "collector", "Lcom/onedelhi/secure/un4;", "a", "(Lcom/onedelhi/secure/o81;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "f", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@k91
/* renamed from: com.onedelhi.secure.r0 */
public abstract class C6628r0<T> implements m81<T>, C6142mu<T> {

    @cf0(mo32326c = "kotlinx.coroutines.flow.AbstractFlow", mo32327f = "Flow.kt", mo32328i = {0}, mo32329l = {230}, mo32330m = "collect", mo32331n = {"safeCollector"}, mo32332s = {"L$0"})
    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.r0$a */
    public static final class C6629a extends e80 {

        /* renamed from: a */
        public final /* synthetic */ C6628r0<T> f34409a;

        /* renamed from: a */
        public Object f34410a;

        /* renamed from: b */
        public /* synthetic */ Object f34411b;

        /* renamed from: n */
        public int f34412n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6629a(C6628r0<T> r0Var, b80<? super C6629a> b80) {
            super(b80);
            this.f34409a = r0Var;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            this.f34411b = obj;
            this.f34412n |= Integer.MIN_VALUE;
            return this.f34409a.mo31451a((o81) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @com.onedelhi.secure.ss2
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31451a(@com.onedelhi.secure.vr2 com.onedelhi.secure.o81<? super T> r6, @com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super com.onedelhi.secure.un4> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.onedelhi.secure.C6628r0.C6629a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onedelhi.secure.r0$a r0 = (com.onedelhi.secure.C6628r0.C6629a) r0
            int r1 = r0.f34412n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f34412n = r1
            goto L_0x0018
        L_0x0013:
            com.onedelhi.secure.r0$a r0 = new com.onedelhi.secure.r0$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f34411b
            java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
            int r2 = r0.f34412n
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f34410a
            com.onedelhi.secure.iq3 r6 = (com.onedelhi.secure.iq3) r6
            com.onedelhi.secure.pl3.m61436n(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            com.onedelhi.secure.pl3.m61436n(r7)
            com.onedelhi.secure.iq3 r7 = new com.onedelhi.secure.iq3
            com.onedelhi.secure.b90 r2 = r0.mo31187f()
            r7.<init>(r6, r2)
            r0.f34410a = r7     // Catch:{ all -> 0x0055 }
            r0.f34412n = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.mo40741f(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.mo34861F()
            com.onedelhi.secure.un4 r6 = com.onedelhi.secure.un4.f36206a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.mo34861F()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6628r0.mo31451a(com.onedelhi.secure.o81, com.onedelhi.secure.b80):java.lang.Object");
    }

    @ss2
    /* renamed from: f */
    public abstract Object mo40741f(@vr2 o81<? super T> o81, @vr2 b80<? super un4> b80);
}

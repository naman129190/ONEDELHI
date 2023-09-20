package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"T", "Lcom/onedelhi/secure/m81;", "", "destination", "", "b", "(Lcom/onedelhi/secure/m81;Ljava/util/List;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "", "d", "(Lcom/onedelhi/secure/m81;Ljava/util/Set;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "C", "a", "(Lcom/onedelhi/secure/m81;Ljava/util/Collection;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class w81 {

    @cf0(mo32326c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", mo32327f = "Collection.kt", mo32328i = {0}, mo32329l = {26}, mo32330m = "toCollection", mo32331n = {"destination"}, mo32332s = {"L$0"})
    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.w81$a */
    public static final class C7147a<T, C extends Collection<? super T>> extends e80 {

        /* renamed from: a */
        public Object f36922a;

        /* renamed from: b */
        public /* synthetic */ Object f36923b;

        /* renamed from: n */
        public int f36924n;

        public C7147a(b80<? super C7147a> b80) {
            super(b80);
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            this.f36923b = obj;
            this.f36924n |= Integer.MIN_VALUE;
            return s81.m64314V1((m81) null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0000H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "C", "value", "Lcom/onedelhi/secure/un4;", "c", "(Ljava/lang/Object;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.w81$b */
    public static final class C7148b<T> implements o81, g84 {

        /* renamed from: a */
        public final /* synthetic */ C f36925a;

        public C7148b(C c) {
            this.f36925a = c;
        }

        @ss2
        /* renamed from: c */
        public final Object mo31452c(T t, @vr2 b80<? super un4> b80) {
            this.f36925a.add(t);
            return un4.f36206a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @com.onedelhi.secure.ss2
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object m69207a(@com.onedelhi.secure.vr2 com.onedelhi.secure.m81<? extends T> r4, @com.onedelhi.secure.vr2 C r5, @com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super C> r6) {
        /*
            boolean r0 = r6 instanceof com.onedelhi.secure.w81.C7147a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.onedelhi.secure.w81$a r0 = (com.onedelhi.secure.w81.C7147a) r0
            int r1 = r0.f36924n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f36924n = r1
            goto L_0x0018
        L_0x0013:
            com.onedelhi.secure.w81$a r0 = new com.onedelhi.secure.w81$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f36923b
            java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
            int r2 = r0.f36924n
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.f36922a
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            com.onedelhi.secure.pl3.m61436n(r6)
            goto L_0x0049
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            com.onedelhi.secure.pl3.m61436n(r6)
            com.onedelhi.secure.w81$b r6 = new com.onedelhi.secure.w81$b
            r6.<init>(r5)
            r0.f36922a = r5
            r0.f36924n = r3
            java.lang.Object r4 = r4.mo31451a(r6, r0)
            if (r4 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.w81.m69207a(com.onedelhi.secure.m81, java.util.Collection, com.onedelhi.secure.b80):java.lang.Object");
    }

    @ss2
    /* renamed from: b */
    public static final <T> Object m69208b(@vr2 m81<? extends T> m81, @vr2 List<T> list, @vr2 b80<? super List<? extends T>> b80) {
        return s81.m64314V1(m81, list, b80);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m69209c(m81 m81, List list, b80 b80, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return s81.m64317W1(m81, list, b80);
    }

    @ss2
    /* renamed from: d */
    public static final <T> Object m69210d(@vr2 m81<? extends T> m81, @vr2 Set<T> set, @vr2 b80<? super Set<? extends T>> b80) {
        return s81.m64314V1(m81, set, b80);
    }

    /* renamed from: e */
    public static /* synthetic */ Object m69211e(m81 m81, Set set, b80 b80, int i, Object obj) {
        if ((i & 1) != 0) {
            set = new LinkedHashSet();
        }
        return s81.m64323Y1(m81, set, b80);
    }
}

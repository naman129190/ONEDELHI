package com.onedelhi.secure;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0001\"\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\n0\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "", "Lcom/onedelhi/secure/yh0;", "deferreds", "", "b", "([Lcom/onedelhi/secure/yh0;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "", "a", "(Ljava/util/Collection;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/ru1;", "jobs", "Lcom/onedelhi/secure/un4;", "d", "([Lcom/onedelhi/secure/ru1;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.sh */
public final class C6764sh {

    @cf0(mo32326c = "kotlinx.coroutines.AwaitKt", mo32327f = "Await.kt", mo32328i = {}, mo32329l = {54}, mo32330m = "joinAll", mo32331n = {}, mo32332s = {})
    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.sh$a */
    public static final class C6765a extends e80 {

        /* renamed from: a */
        public Object f35049a;

        /* renamed from: b */
        public /* synthetic */ Object f35050b;

        /* renamed from: n */
        public int f35051n;

        /* renamed from: o */
        public int f35052o;

        /* renamed from: p */
        public int f35053p;

        public C6765a(b80<? super C6765a> b80) {
            super(b80);
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            this.f35050b = obj;
            this.f35053p |= Integer.MIN_VALUE;
            return C6764sh.m64562d((ru1[]) null, this);
        }
    }

    @cf0(mo32326c = "kotlinx.coroutines.AwaitKt", mo32327f = "Await.kt", mo32328i = {}, mo32329l = {66}, mo32330m = "joinAll", mo32331n = {}, mo32332s = {})
    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.sh$b */
    public static final class C6766b extends e80 {

        /* renamed from: a */
        public Object f35054a;

        /* renamed from: b */
        public /* synthetic */ Object f35055b;

        /* renamed from: n */
        public int f35056n;

        public C6766b(b80<? super C6766b> b80) {
            super(b80);
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            this.f35055b = obj;
            this.f35056n |= Integer.MIN_VALUE;
            return C6764sh.m64561c((Collection<? extends ru1>) null, this);
        }
    }

    @ss2
    /* renamed from: a */
    public static final <T> Object m64559a(@vr2 Collection<? extends yh0<? extends T>> collection, @vr2 b80<? super List<? extends T>> b80) {
        if (collection.isEmpty()) {
            return s00.m64037F();
        }
        Object[] array = collection.toArray(new yh0[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new C6693rh((yh0[]) array).mo43895b(b80);
    }

    @ss2
    /* renamed from: b */
    public static final <T> Object m64560b(@vr2 yh0<? extends T>[] yh0Arr, @vr2 b80<? super List<? extends T>> b80) {
        return yh0Arr.length == 0 ? s00.m64037F() : new C6693rh(yh0Arr).mo43895b(b80);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @com.onedelhi.secure.ss2
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m64561c(@com.onedelhi.secure.vr2 java.util.Collection<? extends com.onedelhi.secure.ru1> r4, @com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super com.onedelhi.secure.un4> r5) {
        /*
            boolean r0 = r5 instanceof com.onedelhi.secure.C6764sh.C6766b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.onedelhi.secure.sh$b r0 = (com.onedelhi.secure.C6764sh.C6766b) r0
            int r1 = r0.f35056n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f35056n = r1
            goto L_0x0018
        L_0x0013:
            com.onedelhi.secure.sh$b r0 = new com.onedelhi.secure.sh$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f35055b
            java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
            int r2 = r0.f35056n
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f35054a
            java.util.Iterator r4 = (java.util.Iterator) r4
            com.onedelhi.secure.pl3.m61436n(r5)
            goto L_0x003c
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            com.onedelhi.secure.pl3.m61436n(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x003c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.ru1 r5 = (com.onedelhi.secure.ru1) r5
            r0.f35054a = r4
            r0.f35056n = r3
            java.lang.Object r5 = r5.mo32096X(r0)
            if (r5 != r1) goto L_0x003c
            return r1
        L_0x0053:
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6764sh.m64561c(java.util.Collection, com.onedelhi.secure.b80):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @com.onedelhi.secure.ss2
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m64562d(@com.onedelhi.secure.vr2 com.onedelhi.secure.ru1[] r6, @com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super com.onedelhi.secure.un4> r7) {
        /*
            boolean r0 = r7 instanceof com.onedelhi.secure.C6764sh.C6765a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.onedelhi.secure.sh$a r0 = (com.onedelhi.secure.C6764sh.C6765a) r0
            int r1 = r0.f35053p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f35053p = r1
            goto L_0x0018
        L_0x0013:
            com.onedelhi.secure.sh$a r0 = new com.onedelhi.secure.sh$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f35050b
            java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
            int r2 = r0.f35053p
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            int r6 = r0.f35052o
            int r2 = r0.f35051n
            java.lang.Object r4 = r0.f35049a
            com.onedelhi.secure.ru1[] r4 = (com.onedelhi.secure.ru1[]) r4
            com.onedelhi.secure.pl3.m61436n(r7)
            r7 = r4
            r5 = r1
            r1 = r0
            r0 = r2
            r2 = r5
            goto L_0x0048
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            com.onedelhi.secure.pl3.m61436n(r7)
            r7 = 0
            int r2 = r6.length
            r7 = r6
            r6 = r2
            r2 = r1
            r1 = r0
            r0 = 0
        L_0x0048:
            if (r0 >= r6) goto L_0x005d
            r4 = r7[r0]
            int r0 = r0 + 1
            r1.f35049a = r7
            r1.f35051n = r0
            r1.f35052o = r6
            r1.f35053p = r3
            java.lang.Object r4 = r4.mo32096X(r1)
            if (r4 != r2) goto L_0x0048
            return r2
        L_0x005d:
            com.onedelhi.secure.un4 r6 = com.onedelhi.secure.un4.f36206a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6764sh.m64562d(com.onedelhi.secure.ru1[], com.onedelhi.secure.b80):java.lang.Object");
    }
}

package com.onedelhi.secure;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010(\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001aD\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000\u001aH\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\f\"\u0004\b\u0000\u0010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¨\u0006\u000f"}, d2 = {"", "size", "step", "Lcom/onedelhi/secure/un4;", "a", "T", "Lcom/onedelhi/secure/zt3;", "", "partialWindows", "reuseBuffer", "", "c", "", "iterator", "b", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class g04 {

    @cf0(mo32326c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", mo32327f = "SlidingWindow.kt", mo32328i = {0, 0, 0, 2, 2, 3, 3}, mo32329l = {34, 40, 49, 55, 58}, mo32330m = "invokeSuspend", mo32331n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, mo32332s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H@"}, d2 = {"T", "Lcom/onedelhi/secure/bu3;", "", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.g04$a */
    public static final class C5349a extends ll3 implements sc1<bu3<? super List<? extends T>>, b80<? super un4>, Object> {

        /* renamed from: a */
        public Object f28839a;

        /* renamed from: a */
        public final /* synthetic */ Iterator<T> f28840a;

        /* renamed from: b */
        public Object f28841b;

        /* renamed from: b */
        public final /* synthetic */ boolean f28842b;

        /* renamed from: c */
        public /* synthetic */ Object f28843c;

        /* renamed from: c */
        public final /* synthetic */ boolean f28844c;

        /* renamed from: o */
        public int f28845o;

        /* renamed from: p */
        public int f28846p;

        /* renamed from: q */
        public final /* synthetic */ int f28847q;

        /* renamed from: r */
        public final /* synthetic */ int f28848r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5349a(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, b80<? super C5349a> b80) {
            super(2, b80);
            this.f28847q = i;
            this.f28848r = i2;
            this.f28840a = it;
            this.f28842b = z;
            this.f28844c = z2;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C5349a aVar = new C5349a(this.f28847q, this.f28848r, this.f28840a, this.f28842b, this.f28844c, b80);
            aVar.f28843c = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0133  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0125 A[SYNTHETIC] */
        @com.onedelhi.secure.ss2
        /* renamed from: D */
        public final java.lang.Object mo22645D(@com.onedelhi.secure.vr2 java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = com.onedelhi.secure.mt1.m57558h()
                int r1 = r12.f28846p
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L_0x005a
                if (r1 == r6) goto L_0x0046
                if (r1 == r5) goto L_0x0041
                if (r1 == r4) goto L_0x002f
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                goto L_0x0041
            L_0x0019:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0021:
                java.lang.Object r1 = r12.f28839a
                com.onedelhi.secure.sm3 r1 = (com.onedelhi.secure.sm3) r1
                java.lang.Object r4 = r12.f28843c
                com.onedelhi.secure.bu3 r4 = (com.onedelhi.secure.bu3) r4
                com.onedelhi.secure.pl3.m61436n(r13)
                r13 = r12
                goto L_0x014d
            L_0x002f:
                java.lang.Object r1 = r12.f28841b
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r12.f28839a
                com.onedelhi.secure.sm3 r5 = (com.onedelhi.secure.sm3) r5
                java.lang.Object r8 = r12.f28843c
                com.onedelhi.secure.bu3 r8 = (com.onedelhi.secure.bu3) r8
                com.onedelhi.secure.pl3.m61436n(r13)
                r13 = r12
                goto L_0x011f
            L_0x0041:
                com.onedelhi.secure.pl3.m61436n(r13)
                goto L_0x0169
            L_0x0046:
                int r1 = r12.f28845o
                java.lang.Object r2 = r12.f28841b
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r3 = r12.f28839a
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r4 = r12.f28843c
                com.onedelhi.secure.bu3 r4 = (com.onedelhi.secure.bu3) r4
                com.onedelhi.secure.pl3.m61436n(r13)
                r13 = r12
                r8 = r1
                goto L_0x00a8
            L_0x005a:
                com.onedelhi.secure.pl3.m61436n(r13)
                java.lang.Object r13 = r12.f28843c
                com.onedelhi.secure.bu3 r13 = (com.onedelhi.secure.bu3) r13
                int r1 = r12.f28847q
                r8 = 1024(0x400, float:1.435E-42)
                int r1 = com.onedelhi.secure.df3.m45219u(r1, r8)
                int r8 = r12.f28848r
                int r9 = r12.f28847q
                int r8 = r8 - r9
                if (r8 < 0) goto L_0x00dc
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                r1 = 0
                java.util.Iterator<T> r3 = r12.f28840a
                r4 = r13
                r13 = r12
                r11 = r3
                r3 = r2
                r2 = r11
            L_0x007d:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x00ba
                java.lang.Object r9 = r2.next()
                if (r1 <= 0) goto L_0x008c
                int r1 = r1 + -1
                goto L_0x007d
            L_0x008c:
                r3.add(r9)
                int r9 = r3.size()
                int r10 = r13.f28847q
                if (r9 != r10) goto L_0x007d
                r13.f28843c = r4
                r13.f28839a = r3
                r13.f28841b = r2
                r13.f28845o = r8
                r13.f28846p = r6
                java.lang.Object r1 = r4.mo31188h(r3, r13)
                if (r1 != r0) goto L_0x00a8
                return r0
            L_0x00a8:
                boolean r1 = r13.f28842b
                if (r1 == 0) goto L_0x00b0
                r3.clear()
                goto L_0x00b8
            L_0x00b0:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r13.f28847q
                r1.<init>(r3)
                r3 = r1
            L_0x00b8:
                r1 = r8
                goto L_0x007d
            L_0x00ba:
                boolean r1 = r3.isEmpty()
                r1 = r1 ^ r6
                if (r1 == 0) goto L_0x0169
                boolean r1 = r13.f28844c
                if (r1 != 0) goto L_0x00cd
                int r1 = r3.size()
                int r2 = r13.f28847q
                if (r1 != r2) goto L_0x0169
            L_0x00cd:
                r13.f28843c = r7
                r13.f28839a = r7
                r13.f28841b = r7
                r13.f28846p = r5
                java.lang.Object r13 = r4.mo31188h(r3, r13)
                if (r13 != r0) goto L_0x0169
                return r0
            L_0x00dc:
                com.onedelhi.secure.sm3 r5 = new com.onedelhi.secure.sm3
                r5.<init>(r1)
                java.util.Iterator<T> r1 = r12.f28840a
                r8 = r13
                r13 = r12
            L_0x00e5:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L_0x0125
                java.lang.Object r9 = r1.next()
                r5.mo44421j(r9)
                boolean r9 = r5.mo44424o()
                if (r9 == 0) goto L_0x00e5
                int r9 = r5.size()
                int r10 = r13.f28847q
                if (r9 >= r10) goto L_0x0105
                com.onedelhi.secure.sm3 r5 = r5.mo44422l(r10)
                goto L_0x00e5
            L_0x0105:
                boolean r9 = r13.f28842b
                if (r9 == 0) goto L_0x010b
                r9 = r5
                goto L_0x0110
            L_0x010b:
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>(r5)
            L_0x0110:
                r13.f28843c = r8
                r13.f28839a = r5
                r13.f28841b = r1
                r13.f28846p = r4
                java.lang.Object r9 = r8.mo31188h(r9, r13)
                if (r9 != r0) goto L_0x011f
                return r0
            L_0x011f:
                int r9 = r13.f28848r
                r5.mo44425r(r9)
                goto L_0x00e5
            L_0x0125:
                boolean r1 = r13.f28844c
                if (r1 == 0) goto L_0x0169
                r1 = r5
                r4 = r8
            L_0x012b:
                int r5 = r1.size()
                int r8 = r13.f28848r
                if (r5 <= r8) goto L_0x0153
                boolean r5 = r13.f28842b
                if (r5 == 0) goto L_0x0139
                r5 = r1
                goto L_0x013e
            L_0x0139:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r1)
            L_0x013e:
                r13.f28843c = r4
                r13.f28839a = r1
                r13.f28841b = r7
                r13.f28846p = r3
                java.lang.Object r5 = r4.mo31188h(r5, r13)
                if (r5 != r0) goto L_0x014d
                return r0
            L_0x014d:
                int r5 = r13.f28848r
                r1.mo44425r(r5)
                goto L_0x012b
            L_0x0153:
                boolean r3 = r1.isEmpty()
                r3 = r3 ^ r6
                if (r3 == 0) goto L_0x0169
                r13.f28843c = r7
                r13.f28839a = r7
                r13.f28841b = r7
                r13.f28846p = r2
                java.lang.Object r13 = r4.mo31188h(r1, r13)
                if (r13 != r0) goto L_0x0169
                return r0
            L_0x0169:
                com.onedelhi.secure.un4 r13 = com.onedelhi.secure.un4.f36206a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.g04.C5349a.mo22645D(java.lang.Object):java.lang.Object");
        }

        @ss2
        /* renamed from: L */
        public final Object mo21054h0(@vr2 bu3<? super List<? extends T>> bu3, @ss2 b80<? super un4> b80) {
            return ((C5349a) mo22644B(bu3, b80)).mo22645D(un4.f36206a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"com/onedelhi/secure/fu3$a", "Lcom/onedelhi/secure/zt3;", "", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.g04$b */
    public static final class C5350b implements zt3<List<? extends T>> {

        /* renamed from: a */
        public final /* synthetic */ int f28849a;

        /* renamed from: a */
        public final /* synthetic */ zt3 f28850a;

        /* renamed from: a */
        public final /* synthetic */ boolean f28851a;

        /* renamed from: b */
        public final /* synthetic */ int f28852b;

        /* renamed from: b */
        public final /* synthetic */ boolean f28853b;

        public C5350b(zt3 zt3, int i, int i2, boolean z, boolean z2) {
            this.f28850a = zt3;
            this.f28849a = i;
            this.f28852b = i2;
            this.f28851a = z;
            this.f28853b = z2;
        }

        @vr2
        public Iterator<List<? extends T>> iterator() {
            return g04.m48955b(this.f28850a.iterator(), this.f28849a, this.f28852b, this.f28851a, this.f28853b);
        }
    }

    /* renamed from: a */
    public static final void m48954a(int i, int i2) {
        String str;
        if (!(i > 0 && i2 > 0)) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @vr2
    /* renamed from: b */
    public static final <T> Iterator<List<T>> m48955b(@vr2 Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        jt1.m53777p(it, "iterator");
        return !it.hasNext() ? it0.f30457a : du3.m45550a(new C5349a(i, i2, it, z2, z, (b80<? super C5349a>) null));
    }

    @vr2
    /* renamed from: c */
    public static final <T> zt3<List<T>> m48956c(@vr2 zt3<? extends T> zt3, int i, int i2, boolean z, boolean z2) {
        jt1.m53777p(zt3, "<this>");
        m48954a(i, i2);
        return new C5350b(zt3, i, i2, z, z2);
    }
}

package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a1\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"", "delayMillis", "initialDelayMillis", "Lcom/onedelhi/secure/b90;", "context", "Lcom/onedelhi/secure/sc4;", "mode", "Lcom/onedelhi/secure/lg3;", "Lcom/onedelhi/secure/un4;", "e", "Lcom/onedelhi/secure/st3;", "channel", "d", "(JJLcom/onedelhi/secure/st3;Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class rc4 {

    @cf0(mo32326c = "kotlinx.coroutines.channels.TickerChannelsKt", mo32327f = "TickerChannels.kt", mo32328i = {0, 0, 1, 1, 2, 2}, mo32329l = {106, 108, 109}, mo32330m = "fixedDelayTicker", mo32331n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, mo32332s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.rc4$a */
    public static final class C6657a extends e80 {

        /* renamed from: a */
        public Object f34554a;

        /* renamed from: b */
        public long f34555b;

        /* renamed from: b */
        public /* synthetic */ Object f34556b;

        /* renamed from: n */
        public int f34557n;

        public C6657a(b80<? super C6657a> b80) {
            super(b80);
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            this.f34556b = obj;
            this.f34557n |= Integer.MIN_VALUE;
            return rc4.m63492c(0, 0, (st3<? super un4>) null, this);
        }
    }

    @cf0(mo32326c = "kotlinx.coroutines.channels.TickerChannelsKt", mo32327f = "TickerChannels.kt", mo32328i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, mo32329l = {84, 88, 94, 96}, mo32330m = "fixedPeriodTicker", mo32331n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, mo32332s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.rc4$b */
    public static final class C6658b extends e80 {

        /* renamed from: a */
        public Object f34558a;

        /* renamed from: b */
        public long f34559b;

        /* renamed from: b */
        public /* synthetic */ Object f34560b;

        /* renamed from: c */
        public long f34561c;

        /* renamed from: n */
        public int f34562n;

        public C6658b(b80<? super C6658b> b80) {
            super(b80);
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            this.f34560b = obj;
            this.f34562n |= Integer.MIN_VALUE;
            return rc4.m63493d(0, 0, (st3<? super un4>) null, this);
        }
    }

    @cf0(mo32326c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", mo32327f = "TickerChannels.kt", mo32328i = {}, mo32329l = {72, 73}, mo32330m = "invokeSuspend", mo32331n = {}, mo32332s = {})
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, d2 = {"Lcom/onedelhi/secure/p53;", "Lcom/onedelhi/secure/un4;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: com.onedelhi.secure.rc4$c */
    public static final class C6659c extends i84 implements sc1<p53<? super un4>, b80<? super un4>, Object> {

        /* renamed from: a */
        public final /* synthetic */ sc4 f34563a;

        /* renamed from: a */
        public /* synthetic */ Object f34564a;

        /* renamed from: b */
        public final /* synthetic */ long f34565b;

        /* renamed from: c */
        public final /* synthetic */ long f34566c;

        /* renamed from: o */
        public int f34567o;

        @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
        /* renamed from: com.onedelhi.secure.rc4$c$a */
        public /* synthetic */ class C6660a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f34568a;

            static {
                int[] iArr = new int[sc4.values().length];
                iArr[sc4.FIXED_PERIOD.ordinal()] = 1;
                iArr[sc4.FIXED_DELAY.ordinal()] = 2;
                f34568a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6659c(sc4 sc4, long j, long j2, b80<? super C6659c> b80) {
            super(2, b80);
            this.f34563a = sc4;
            this.f34565b = j;
            this.f34566c = j2;
        }

        @vr2
        /* renamed from: B */
        public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
            C6659c cVar = new C6659c(this.f34563a, this.f34565b, this.f34566c, b80);
            cVar.f34564a = obj;
            return cVar;
        }

        @ss2
        /* renamed from: D */
        public final Object mo22645D(@vr2 Object obj) {
            Object h = mt1.m57558h();
            int i = this.f34567o;
            if (i == 0) {
                pl3.m61436n(obj);
                p53 p53 = (p53) this.f34564a;
                int i2 = C6660a.f34568a[this.f34563a.ordinal()];
                if (i2 == 1) {
                    long j = this.f34565b;
                    long j2 = this.f34566c;
                    st3 S = p53.mo36809S();
                    this.f34567o = 1;
                    if (rc4.m63493d(j, j2, S, this) == h) {
                        return h;
                    }
                } else if (i2 == 2) {
                    long j3 = this.f34565b;
                    long j4 = this.f34566c;
                    st3 S2 = p53.mo36809S();
                    this.f34567o = 2;
                    if (rc4.m63492c(j3, j4, S2, this) == h) {
                        return h;
                    }
                }
            } else if (i == 1 || i == 2) {
                pl3.m61436n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return un4.f36206a;
        }

        @ss2
        /* renamed from: M */
        public final Object mo21054h0(@vr2 p53<? super un4> p53, @ss2 b80<? super un4> b80) {
            return ((C6659c) mo22644B(p53, b80)).mo22645D(un4.f36206a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: com.onedelhi.secure.st3<? super com.onedelhi.secure.un4>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m63492c(long r6, long r8, com.onedelhi.secure.st3<? super com.onedelhi.secure.un4> r10, com.onedelhi.secure.b80<? super com.onedelhi.secure.un4> r11) {
        /*
            boolean r0 = r11 instanceof com.onedelhi.secure.rc4.C6657a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.onedelhi.secure.rc4$a r0 = (com.onedelhi.secure.rc4.C6657a) r0
            int r1 = r0.f34557n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f34557n = r1
            goto L_0x0018
        L_0x0013:
            com.onedelhi.secure.rc4$a r0 = new com.onedelhi.secure.rc4$a
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f34556b
            java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
            int r2 = r0.f34557n
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            long r6 = r0.f34555b
            java.lang.Object r8 = r0.f34554a
            com.onedelhi.secure.st3 r8 = (com.onedelhi.secure.st3) r8
            com.onedelhi.secure.pl3.m61436n(r11)
        L_0x0034:
            r10 = r8
            goto L_0x0063
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            long r6 = r0.f34555b
            java.lang.Object r8 = r0.f34554a
            com.onedelhi.secure.st3 r8 = (com.onedelhi.secure.st3) r8
            com.onedelhi.secure.pl3.m61436n(r11)
            goto L_0x0073
        L_0x0048:
            long r6 = r0.f34555b
            java.lang.Object r8 = r0.f34554a
            r10 = r8
            com.onedelhi.secure.st3 r10 = (com.onedelhi.secure.st3) r10
            com.onedelhi.secure.pl3.m61436n(r11)
            goto L_0x0063
        L_0x0053:
            com.onedelhi.secure.pl3.m61436n(r11)
            r0.f34554a = r10
            r0.f34555b = r6
            r0.f34557n = r5
            java.lang.Object r8 = com.onedelhi.secure.fi0.m47884b(r8, r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            com.onedelhi.secure.un4 r8 = com.onedelhi.secure.un4.f36206a
            r0.f34554a = r10
            r0.f34555b = r6
            r0.f34557n = r4
            java.lang.Object r8 = r10.mo36801F(r8, r0)
            if (r8 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r8 = r10
        L_0x0073:
            r0.f34554a = r8
            r0.f34555b = r6
            r0.f34557n = r3
            java.lang.Object r9 = com.onedelhi.secure.fi0.m47884b(r6, r0)
            if (r9 != r1) goto L_0x0034
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rc4.m63492c(long, long, com.onedelhi.secure.st3, com.onedelhi.secure.b80):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0121 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m63493d(long r19, long r21, com.onedelhi.secure.st3<? super com.onedelhi.secure.un4> r23, com.onedelhi.secure.b80<? super com.onedelhi.secure.un4> r24) {
        /*
            r0 = r24
            boolean r1 = r0 instanceof com.onedelhi.secure.rc4.C6658b
            if (r1 == 0) goto L_0x0015
            r1 = r0
            com.onedelhi.secure.rc4$b r1 = (com.onedelhi.secure.rc4.C6658b) r1
            int r2 = r1.f34562n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f34562n = r2
            goto L_0x001a
        L_0x0015:
            com.onedelhi.secure.rc4$b r1 = new com.onedelhi.secure.rc4$b
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.f34560b
            java.lang.Object r2 = com.onedelhi.secure.mt1.m57558h()
            int r3 = r1.f34562n
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L_0x0070
            if (r3 == r8) goto L_0x0063
            if (r3 == r7) goto L_0x0057
            if (r3 == r6) goto L_0x0045
            if (r3 != r5) goto L_0x003d
            long r8 = r1.f34561c
            long r10 = r1.f34559b
            java.lang.Object r3 = r1.f34558a
            com.onedelhi.secure.st3 r3 = (com.onedelhi.secure.st3) r3
            com.onedelhi.secure.pl3.m61436n(r0)
            r0 = 4
            goto L_0x0050
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            long r8 = r1.f34561c
            long r10 = r1.f34559b
            java.lang.Object r3 = r1.f34558a
            com.onedelhi.secure.st3 r3 = (com.onedelhi.secure.st3) r3
            com.onedelhi.secure.pl3.m61436n(r0)
        L_0x0050:
            r17 = r8
            r8 = r10
            r10 = r17
            goto L_0x010b
        L_0x0057:
            long r8 = r1.f34561c
            long r10 = r1.f34559b
            java.lang.Object r3 = r1.f34558a
            com.onedelhi.secure.st3 r3 = (com.onedelhi.secure.st3) r3
            com.onedelhi.secure.pl3.m61436n(r0)
            goto L_0x00c6
        L_0x0063:
            long r8 = r1.f34561c
            long r10 = r1.f34559b
            java.lang.Object r3 = r1.f34558a
            com.onedelhi.secure.st3 r3 = (com.onedelhi.secure.st3) r3
            com.onedelhi.secure.pl3.m61436n(r0)
            r0 = r3
            goto L_0x00aa
        L_0x0070:
            com.onedelhi.secure.pl3.m61436n(r0)
            com.onedelhi.secure.p1 r0 = com.onedelhi.secure.C6492q1.m61804b()
            if (r0 != 0) goto L_0x007b
            r0 = 0
            goto L_0x0083
        L_0x007b:
            long r9 = r0.mo42347b()
            java.lang.Long r0 = com.onedelhi.secure.C7377yn.m71918g(r9)
        L_0x0083:
            if (r0 != 0) goto L_0x008a
            long r9 = java.lang.System.nanoTime()
            goto L_0x008e
        L_0x008a:
            long r9 = r0.longValue()
        L_0x008e:
            long r11 = com.onedelhi.secure.zv0.m74358d(r21)
            long r9 = r9 + r11
            r0 = r23
            r1.f34558a = r0
            r11 = r19
            r1.f34559b = r11
            r1.f34561c = r9
            r1.f34562n = r8
            r13 = r21
            java.lang.Object r3 = com.onedelhi.secure.fi0.m47884b(r13, r1)
            if (r3 != r2) goto L_0x00a8
            return r2
        L_0x00a8:
            r8 = r9
            r10 = r11
        L_0x00aa:
            long r10 = com.onedelhi.secure.zv0.m74358d(r10)
        L_0x00ae:
            long r8 = r8 + r10
            com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a
            r1.f34558a = r0
            r1.f34559b = r8
            r1.f34561c = r10
            r1.f34562n = r7
            java.lang.Object r3 = r0.mo36801F(r3, r1)
            if (r3 != r2) goto L_0x00c0
            return r2
        L_0x00c0:
            r3 = r0
            r17 = r8
            r8 = r10
            r10 = r17
        L_0x00c6:
            com.onedelhi.secure.p1 r0 = com.onedelhi.secure.C6492q1.m61804b()
            if (r0 != 0) goto L_0x00ce
            r0 = 0
            goto L_0x00d6
        L_0x00ce:
            long r12 = r0.mo42347b()
            java.lang.Long r0 = com.onedelhi.secure.C7377yn.m71918g(r12)
        L_0x00d6:
            if (r0 != 0) goto L_0x00dd
            long r12 = java.lang.System.nanoTime()
            goto L_0x00e1
        L_0x00dd:
            long r12 = r0.longValue()
        L_0x00e1:
            long r14 = r10 - r12
            r4 = 0
            long r14 = com.onedelhi.secure.df3.m45201o(r14, r4)
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x010e
            int r16 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x010e
            long r4 = r12 - r10
            long r4 = r4 % r8
            long r4 = r8 - r4
            long r10 = r12 + r4
            long r4 = com.onedelhi.secure.zv0.m74357c(r4)
            r1.f34558a = r3
            r1.f34559b = r10
            r1.f34561c = r8
            r1.f34562n = r6
            java.lang.Object r4 = com.onedelhi.secure.fi0.m47884b(r4, r1)
            if (r4 != r2) goto L_0x0050
            return r2
        L_0x010b:
            r0 = r3
            r5 = 4
            goto L_0x00ae
        L_0x010e:
            long r4 = com.onedelhi.secure.zv0.m74357c(r14)
            r1.f34558a = r3
            r1.f34559b = r10
            r1.f34561c = r8
            r0 = 4
            r1.f34562n = r0
            java.lang.Object r4 = com.onedelhi.secure.fi0.m47884b(r4, r1)
            if (r4 != r2) goto L_0x0050
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rc4.m63493d(long, long, com.onedelhi.secure.st3, com.onedelhi.secure.b80):java.lang.Object");
    }

    @cu2
    @vr2
    /* renamed from: e */
    public static final lg3<un4> m63494e(long j, long j2, @vr2 b90 b90, @vr2 sc4 sc4) {
        long j3 = j2;
        boolean z = true;
        if (j >= 0) {
            if (j3 < 0) {
                z = false;
            }
            if (z) {
                b90 b902 = b90;
                return n53.m57908e(lh1.f31667a, wm0.m69464g().plus(b90), 0, new C6659c(sc4, j, j2, (b80<? super C6659c>) null));
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
    }

    /* renamed from: f */
    public static /* synthetic */ lg3 m63495f(long j, long j2, b90 b90, sc4 sc4, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        if ((i & 4) != 0) {
            b90 = gt0.f29313a;
        }
        if ((i & 8) != 0) {
            sc4 = sc4.FIXED_PERIOD;
        }
        return m63494e(j, j2, b90, sc4);
    }
}

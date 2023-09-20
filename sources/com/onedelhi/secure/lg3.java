package com.onedelhi.secure;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH&J\b\u0010\u0010\u001a\u00020\u000eH\u0017J\u0014\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0011H'J\u0011\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0014\u0010\bJ\u0015\u0010\u0015\u001a\u0004\u0018\u00018\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u001d8&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\"\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001d8VX\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0019\u001a\u0004\b#\u0010\u001f\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lcom/onedelhi/secure/lg3;", "E", "", "r", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "Lcom/onedelhi/secure/kw;", "O", "x", "()Ljava/lang/Object;", "Lcom/onedelhi/secure/hw;", "R", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lcom/onedelhi/secure/un4;", "c", "cancel", "", "", "a", "V", "z", "C", "()Z", "isClosedForReceive$annotations", "()V", "isClosedForReceive", "isEmpty", "isEmpty$annotations", "Lcom/onedelhi/secure/gt3;", "k", "()Lcom/onedelhi/secure/gt3;", "onReceive", "U", "onReceiveCatching", "t", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface lg3<E> {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.lg3$a */
    public static final class C6006a {

        @Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001JL\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032$\u0010\b\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"com/onedelhi/secure/lg3$a$a", "Lcom/onedelhi/secure/gt3;", "R", "Lcom/onedelhi/secure/it3;", "select", "Lkotlin/Function2;", "Lcom/onedelhi/secure/b80;", "", "block", "Lcom/onedelhi/secure/un4;", "o", "(Lcom/onedelhi/secure/it3;Lcom/onedelhi/secure/sc1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: com.onedelhi.secure.lg3$a$a */
        public static final class C6007a implements gt3<E> {

            /* renamed from: a */
            public final /* synthetic */ lg3<E> f31653a;

            @cf0(mo32326c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", mo32327f = "Channel.kt", mo32328i = {}, mo32329l = {375}, mo32330m = "invokeSuspend", mo32331n = {}, mo32332s = {})
            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, d2 = {"R", "E", "Lcom/onedelhi/secure/kw;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* renamed from: com.onedelhi.secure.lg3$a$a$a */
            public static final class C6008a extends i84 implements sc1<C5945kw<? extends E>, b80<? super R>, Object> {

                /* renamed from: a */
                public final /* synthetic */ sc1<E, b80<? super R>, Object> f31654a;

                /* renamed from: a */
                public /* synthetic */ Object f31655a;

                /* renamed from: o */
                public int f31656o;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C6008a(sc1<? super E, ? super b80<? super R>, ? extends Object> sc1, b80<? super C6008a> b80) {
                    super(2, b80);
                    this.f31654a = sc1;
                }

                @vr2
                /* renamed from: B */
                public final b80<un4> mo22644B(@ss2 Object obj, @vr2 b80<?> b80) {
                    C6008a aVar = new C6008a(this.f31654a, b80);
                    aVar.f31655a = obj;
                    return aVar;
                }

                @ss2
                /* renamed from: D */
                public final Object mo22645D(@vr2 Object obj) {
                    Object h = mt1.m57558h();
                    int i = this.f31656o;
                    if (i == 0) {
                        pl3.m61436n(obj);
                        Object o = ((C5945kw) this.f31655a).mo39543o();
                        Throwable f = C5945kw.m55069f(o);
                        if (f == null) {
                            sc1<E, b80<? super R>, Object> sc1 = this.f31654a;
                            Object h2 = C5945kw.m55071h(o);
                            this.f31656o = 1;
                            obj = sc1.mo21054h0(h2, this);
                            if (obj == h) {
                                return h;
                            }
                        } else {
                            throw f;
                        }
                    } else if (i == 1) {
                        pl3.m61436n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return obj;
                }

                @ss2
                /* renamed from: M */
                public final Object mo39845M(@vr2 Object obj, @ss2 b80<? super R> b80) {
                    return ((C6008a) mo22644B(C5945kw.m55065b(obj), b80)).mo22645D(un4.f36206a);
                }

                /* renamed from: h0 */
                public /* bridge */ /* synthetic */ Object mo21054h0(Object obj, Object obj2) {
                    return mo39845M(((C5945kw) obj).mo39543o(), (b80) obj2);
                }
            }

            public C6007a(lg3<? extends E> lg3) {
                this.f31653a = lg3;
            }

            @zs1
            /* renamed from: o */
            public <R> void mo30932o(@vr2 it3<? super R> it3, @vr2 sc1<? super E, ? super b80<? super R>, ? extends Object> sc1) {
                this.f31653a.mo37695U().mo30932o(it3, new C6008a(sc1, (b80<? super C6008a>) null));
            }
        }

        @cf0(mo32326c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", mo32327f = "Channel.kt", mo32328i = {}, mo32329l = {354}, mo32330m = "receiveOrNull", mo32331n = {}, mo32332s = {})
        @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
        /* renamed from: com.onedelhi.secure.lg3$a$b */
        public static final class C6009b<E> extends e80 {

            /* renamed from: a */
            public /* synthetic */ Object f31657a;

            /* renamed from: n */
            public int f31658n;

            public C6009b(b80<? super C6009b> b80) {
                super(b80);
            }

            @ss2
            /* renamed from: D */
            public final Object mo22645D(@vr2 Object obj) {
                this.f31657a = obj;
                this.f31658n |= Integer.MIN_VALUE;
                return C6006a.m55603i((lg3) null, this);
            }
        }

        /* renamed from: b */
        public static /* synthetic */ void m55596b(lg3 lg3, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                lg3.mo37698c(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: c */
        public static /* synthetic */ boolean m55597c(lg3 lg3, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return lg3.mo37697a(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @vr2
        /* renamed from: d */
        public static <E> gt3<E> m55598d(@vr2 lg3<? extends E> lg3) {
            return new C6007a(lg3);
        }

        @xj0(level = ak0.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @oi3(expression = "onReceiveCatching", imports = {}))
        /* renamed from: e */
        public static /* synthetic */ void m55599e() {
        }

        @fy0
        /* renamed from: f */
        public static /* synthetic */ void m55600f() {
        }

        @fy0
        /* renamed from: g */
        public static /* synthetic */ void m55601g() {
        }

        @ss2
        @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @oi3(expression = "tryReceive().getOrNull()", imports = {}))
        /* renamed from: h */
        public static <E> E m55602h(@vr2 lg3<? extends E> lg3) {
            Object x = lg3.mo37716x();
            if (C5945kw.m55076m(x)) {
                return C5945kw.m55072i(x);
            }
            Throwable f = C5945kw.m55069f(x);
            if (f == null) {
                return null;
            }
            throw i24.m51757p(f);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @com.onedelhi.secure.xj0(level = com.onedelhi.secure.ak0.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @com.onedelhi.secure.oi3(expression = "receiveCatching().getOrNull()", imports = {}))
        @com.onedelhi.secure.ib2
        @com.onedelhi.secure.ss2
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <E> java.lang.Object m55603i(@com.onedelhi.secure.vr2 com.onedelhi.secure.lg3<? extends E> r4, @com.onedelhi.secure.vr2 com.onedelhi.secure.b80<? super E> r5) {
            /*
                boolean r0 = r5 instanceof com.onedelhi.secure.lg3.C6006a.C6009b
                if (r0 == 0) goto L_0x0013
                r0 = r5
                com.onedelhi.secure.lg3$a$b r0 = (com.onedelhi.secure.lg3.C6006a.C6009b) r0
                int r1 = r0.f31658n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f31658n = r1
                goto L_0x0018
            L_0x0013:
                com.onedelhi.secure.lg3$a$b r0 = new com.onedelhi.secure.lg3$a$b
                r0.<init>(r5)
            L_0x0018:
                java.lang.Object r5 = r0.f31657a
                java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
                int r2 = r0.f31658n
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                com.onedelhi.secure.pl3.m61436n(r5)
                com.onedelhi.secure.kw r5 = (com.onedelhi.secure.C5945kw) r5
                java.lang.Object r4 = r5.mo39543o()
                goto L_0x0043
            L_0x002f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0037:
                com.onedelhi.secure.pl3.m61436n(r5)
                r0.f31658n = r3
                java.lang.Object r4 = r4.mo37692O(r0)
                if (r4 != r1) goto L_0x0043
                return r1
            L_0x0043:
                java.lang.Object r4 = com.onedelhi.secure.C5945kw.m55071h(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.lg3.C6006a.m55603i(com.onedelhi.secure.lg3, com.onedelhi.secure.b80):java.lang.Object");
        }
    }

    /* renamed from: C */
    boolean mo31519C();

    @ss2
    /* renamed from: O */
    Object mo37692O(@vr2 b80<? super C5945kw<? extends E>> b80);

    @vr2
    /* renamed from: R */
    C5600hw<E> mo37693R();

    @vr2
    /* renamed from: U */
    gt3<C5945kw<E>> mo37695U();

    @ss2
    @xj0(level = ak0.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @oi3(expression = "tryReceive().getOrNull()", imports = {}))
    /* renamed from: V */
    E mo37696V();

    @xj0(level = ak0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: a */
    /* synthetic */ boolean mo37697a(Throwable th);

    /* renamed from: c */
    void mo37698c(@ss2 CancellationException cancellationException);

    @xj0(level = ak0.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    boolean isEmpty();

    @vr2
    /* renamed from: k */
    gt3<E> mo37705k();

    @ss2
    /* renamed from: r */
    Object mo37710r(@vr2 b80<? super E> b80);

    @vr2
    /* renamed from: t */
    gt3<E> mo37712t();

    @vr2
    /* renamed from: x */
    Object mo37716x();

    @xj0(level = ak0.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @oi3(expression = "receiveCatching().getOrNull()", imports = {}))
    @ib2
    @ss2
    /* renamed from: z */
    Object mo37717z(@vr2 b80<? super E> b80);
}

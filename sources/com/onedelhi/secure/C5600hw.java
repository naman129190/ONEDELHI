package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0004\u001a\u00020\u0003H¦Bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0007\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/onedelhi/secure/hw;", "E", "", "", "b", "(Lcom/onedelhi/secure/b80;)Ljava/lang/Object;", "a", "next", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.hw */
public interface C5600hw<E> {

    @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
    /* renamed from: com.onedelhi.secure.hw$a */
    public static final class C5601a {

        @cf0(mo32326c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", mo32327f = "Channel.kt", mo32328i = {0}, mo32329l = {584}, mo32330m = "next", mo32331n = {"this"}, mo32332s = {"L$0"})
        @ii2(mo38106k = 3, mo38107mv = {1, 6, 0}, mo38109xi = 48)
        /* renamed from: com.onedelhi.secure.hw$a$a */
        public static final class C5602a<E> extends e80 {

            /* renamed from: a */
            public Object f29877a;

            /* renamed from: b */
            public /* synthetic */ Object f29878b;

            /* renamed from: n */
            public int f29879n;

            public C5602a(b80<? super C5602a> b80) {
                super(b80);
            }

            @ss2
            /* renamed from: D */
            public final Object mo22645D(@vr2 Object obj) {
                this.f29878b = obj;
                this.f29879n |= Integer.MIN_VALUE;
                return C5601a.m51170a((C5600hw) null, this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @com.onedelhi.secure.uw1(name = "next")
        @com.onedelhi.secure.xj0(level = com.onedelhi.secure.ak0.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ java.lang.Object m51170a(com.onedelhi.secure.C5600hw r4, com.onedelhi.secure.b80 r5) {
            /*
                boolean r0 = r5 instanceof com.onedelhi.secure.C5600hw.C5601a.C5602a
                if (r0 == 0) goto L_0x0013
                r0 = r5
                com.onedelhi.secure.hw$a$a r0 = (com.onedelhi.secure.C5600hw.C5601a.C5602a) r0
                int r1 = r0.f29879n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f29879n = r1
                goto L_0x0018
            L_0x0013:
                com.onedelhi.secure.hw$a$a r0 = new com.onedelhi.secure.hw$a$a
                r0.<init>(r5)
            L_0x0018:
                java.lang.Object r5 = r0.f29878b
                java.lang.Object r1 = com.onedelhi.secure.mt1.m57558h()
                int r2 = r0.f29879n
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r4 = r0.f29877a
                com.onedelhi.secure.hw r4 = (com.onedelhi.secure.C5600hw) r4
                com.onedelhi.secure.pl3.m61436n(r5)
                goto L_0x0043
            L_0x002d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0035:
                com.onedelhi.secure.pl3.m61436n(r5)
                r0.f29877a = r4
                r0.f29879n = r3
                java.lang.Object r5 = r4.mo37576b(r0)
                if (r5 != r1) goto L_0x0043
                return r1
            L_0x0043:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0050
                java.lang.Object r4 = r4.next()
                return r4
            L_0x0050:
                com.onedelhi.secure.nz r4 = new com.onedelhi.secure.nz
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5600hw.C5601a.m51170a(com.onedelhi.secure.hw, com.onedelhi.secure.b80):java.lang.Object");
        }
    }

    @uw1(name = "next")
    @xj0(level = ak0.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* renamed from: a */
    /* synthetic */ Object mo37575a(b80 b80);

    @ss2
    /* renamed from: b */
    Object mo37576b(@vr2 b80<? super Boolean> b80);

    E next();
}

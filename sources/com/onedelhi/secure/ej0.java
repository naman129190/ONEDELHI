package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012:\u0010\u0010\u001a6\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e0\n¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¨\u0006\u0013"}, d2 = {"Lcom/onedelhi/secure/ej0;", "Lcom/onedelhi/secure/zt3;", "Lcom/onedelhi/secure/is1;", "", "iterator", "", "input", "", "startIndex", "limit", "Lkotlin/Function2;", "Lcom/onedelhi/secure/iy2;", "name", "currentIndex", "Lcom/onedelhi/secure/ey2;", "Lcom/onedelhi/secure/wy0;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILcom/onedelhi/secure/sc1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class ej0 implements zt3<is1> {

    /* renamed from: a */
    public final int f27951a;
    @vr2

    /* renamed from: a */
    public final sc1<CharSequence, Integer, ey2<Integer, Integer>> f27952a;
    @vr2

    /* renamed from: a */
    public final CharSequence f27953a;

    /* renamed from: b */
    public final int f27954b;

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, d2 = {"com/onedelhi/secure/ej0$a", "", "Lcom/onedelhi/secure/is1;", "j", "", "hasNext", "Lcom/onedelhi/secure/un4;", "a", "", "nextState", "I", "i", "()I", "p", "(I)V", "currentStartIndex", "d", "m", "nextSearchIndex", "h", "o", "nextItem", "Lcom/onedelhi/secure/is1;", "f", "()Lcom/onedelhi/secure/is1;", "n", "(Lcom/onedelhi/secure/is1;)V", "counter", "b", "l", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ej0$a */
    public static final class C5157a implements Iterator<is1>, nx1 {

        /* renamed from: a */
        public final /* synthetic */ ej0 f27955a;
        @ss2

        /* renamed from: a */
        public is1 f27956a;

        /* renamed from: n */
        public int f27957n = -1;

        /* renamed from: o */
        public int f27958o;

        /* renamed from: p */
        public int f27959p;

        /* renamed from: q */
        public int f27960q;

        public C5157a(ej0 ej0) {
            this.f27955a = ej0;
            int B = df3.m45104B(ej0.f27951a, 0, ej0.f27953a.length());
            this.f27958o = B;
            this.f27959p = B;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < com.onedelhi.secure.ej0.m46897e(r6.f27955a)) goto L_0x0023;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo35422a() {
            /*
                r6 = this;
                int r0 = r6.f27959p
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f27957n = r1
                r0 = 0
                r6.f27956a = r0
                goto L_0x0099
            L_0x000c:
                com.onedelhi.secure.ej0 r0 = r6.f27955a
                int r0 = r0.f27954b
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f27960q
                int r0 = r0 + r3
                r6.f27960q = r0
                com.onedelhi.secure.ej0 r4 = r6.f27955a
                int r4 = r4.f27954b
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f27959p
                com.onedelhi.secure.ej0 r4 = r6.f27955a
                java.lang.CharSequence r4 = r4.f27953a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                com.onedelhi.secure.is1 r0 = new com.onedelhi.secure.is1
                int r1 = r6.f27958o
                com.onedelhi.secure.ej0 r4 = r6.f27955a
                java.lang.CharSequence r4 = r4.f27953a
                int r4 = com.onedelhi.secure.u54.m66642i3(r4)
                r0.<init>(r1, r4)
            L_0x0042:
                r6.f27956a = r0
            L_0x0044:
                r6.f27959p = r2
                goto L_0x0097
            L_0x0047:
                com.onedelhi.secure.ej0 r0 = r6.f27955a
                com.onedelhi.secure.sc1 r0 = r0.f27952a
                com.onedelhi.secure.ej0 r4 = r6.f27955a
                java.lang.CharSequence r4 = r4.f27953a
                int r5 = r6.f27959p
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo21054h0(r4, r5)
                com.onedelhi.secure.ey2 r0 = (com.onedelhi.secure.ey2) r0
                if (r0 != 0) goto L_0x0073
                com.onedelhi.secure.is1 r0 = new com.onedelhi.secure.is1
                int r1 = r6.f27958o
                com.onedelhi.secure.ej0 r4 = r6.f27955a
                java.lang.CharSequence r4 = r4.f27953a
                int r4 = com.onedelhi.secure.u54.m66642i3(r4)
                r0.<init>(r1, r4)
                goto L_0x0042
            L_0x0073:
                java.lang.Object r2 = r0.mo35665a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo35666b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f27958o
                com.onedelhi.secure.is1 r4 = com.onedelhi.secure.df3.m45236z1(r4, r2)
                r6.f27956a = r4
                int r2 = r2 + r0
                r6.f27958o = r2
                if (r0 != 0) goto L_0x0095
                r1 = 1
            L_0x0095:
                int r2 = r2 + r1
                goto L_0x0044
            L_0x0097:
                r6.f27957n = r3
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ej0.C5157a.mo35422a():void");
        }

        /* renamed from: b */
        public final int mo35423b() {
            return this.f27960q;
        }

        /* renamed from: d */
        public final int mo35424d() {
            return this.f27958o;
        }

        @ss2
        /* renamed from: f */
        public final is1 mo35425f() {
            return this.f27956a;
        }

        /* renamed from: h */
        public final int mo35426h() {
            return this.f27959p;
        }

        public boolean hasNext() {
            if (this.f27957n == -1) {
                mo35422a();
            }
            return this.f27957n == 1;
        }

        /* renamed from: i */
        public final int mo35428i() {
            return this.f27957n;
        }

        @vr2
        /* renamed from: j */
        public is1 next() {
            if (this.f27957n == -1) {
                mo35422a();
            }
            if (this.f27957n != 0) {
                is1 is1 = this.f27956a;
                jt1.m53775n(is1, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f27956a = null;
                this.f27957n = -1;
                return is1;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: l */
        public final void mo35430l(int i) {
            this.f27960q = i;
        }

        /* renamed from: m */
        public final void mo35431m(int i) {
            this.f27958o = i;
        }

        /* renamed from: n */
        public final void mo35432n(@ss2 is1 is1) {
            this.f27956a = is1;
        }

        /* renamed from: o */
        public final void mo35434o(int i) {
            this.f27959p = i;
        }

        /* renamed from: p */
        public final void mo35435p(int i) {
            this.f27957n = i;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ej0(@vr2 CharSequence charSequence, int i, int i2, @vr2 sc1<? super CharSequence, ? super Integer, ey2<Integer, Integer>> sc1) {
        jt1.m53777p(charSequence, "input");
        jt1.m53777p(sc1, "getNextMatch");
        this.f27953a = charSequence;
        this.f27951a = i;
        this.f27954b = i2;
        this.f27952a = sc1;
    }

    @vr2
    public Iterator<is1> iterator() {
        return new C5157a(this);
    }
}

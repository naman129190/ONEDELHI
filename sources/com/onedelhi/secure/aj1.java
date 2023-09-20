package com.onedelhi.secure;

import java.util.ArrayList;

public class aj1 {

    /* renamed from: a */
    public static final boolean f9094a = false;

    /* renamed from: b */
    public static final boolean f9095b = false;

    /* renamed from: a */
    public static fx4 m11225a(o60 o60, int i, ArrayList<fx4> arrayList, fx4 fx4) {
        m60 m60;
        int l2;
        int i2 = i == 0 ? o60.f17742I : o60.f17743J;
        int i3 = 0;
        if (i2 != -1 && (fx4 == null || i2 != fx4.f12366a)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                fx4 fx42 = arrayList.get(i4);
                if (fx42.mo16205f() == i2) {
                    if (fx4 != null) {
                        fx4.mo16212m(i, fx42);
                        arrayList.remove(fx4);
                    }
                    fx4 = fx42;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return fx4;
        }
        if (fx4 == null) {
            if ((o60 instanceof ml1) && (l2 = ((ml1) o60).mo20466l2(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    fx4 fx43 = arrayList.get(i5);
                    if (fx43.mo16205f() == l2) {
                        fx4 = fx43;
                        break;
                    }
                    i5++;
                }
            }
            if (fx4 == null) {
                fx4 = new fx4(i);
            }
            arrayList.add(fx4);
        }
        if (fx4.mo16200a(o60)) {
            if (o60 instanceof nj1) {
                nj1 nj1 = (nj1) o60;
                m60 l22 = nj1.mo21321l2();
                if (nj1.mo21322m2() == 0) {
                    i3 = 1;
                }
                l22.mo20109d(i3, arrayList, fx4);
            }
            int f = fx4.mo16205f();
            if (i == 0) {
                o60.f17742I = f;
                o60.f17748a.mo20109d(i, arrayList, fx4);
                m60 = o60.f17775c;
            } else {
                o60.f17743J = f;
                o60.f17765b.mo20109d(i, arrayList, fx4);
                o60.f17785e.mo20109d(i, arrayList, fx4);
                m60 = o60.f17781d;
            }
            m60.mo20109d(i, arrayList, fx4);
            o60.f17796h.mo20109d(i, arrayList, fx4);
        }
        return fx4;
    }

    /* renamed from: b */
    public static fx4 m11226b(ArrayList<fx4> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            fx4 fx4 = arrayList.get(i2);
            if (i == fx4.f12366a) {
                return fx4;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:177:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x039d A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11227c(com.onedelhi.secure.p60 r16, com.onedelhi.secure.C1788bk.C1790b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.mo14933l2()
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x000c:
            if (r4 >= r2) goto L_0x0033
            java.lang.Object r5 = r1.get(r4)
            com.onedelhi.secure.o60 r5 = (com.onedelhi.secure.o60) r5
            com.onedelhi.secure.o60$b r6 = r16.mo21630H()
            com.onedelhi.secure.o60$b r7 = r16.mo21714j0()
            com.onedelhi.secure.o60$b r8 = r5.mo21630H()
            com.onedelhi.secure.o60$b r9 = r5.mo21714j0()
            boolean r6 = m11228d(r6, r7, r8, r9)
            if (r6 != 0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r5 = r5 instanceof com.onedelhi.secure.l81
            if (r5 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0033:
            com.onedelhi.secure.zi2 r4 = r0.f18387a
            if (r4 == 0) goto L_0x003e
            long r5 = r4.f23680P
            r7 = 1
            long r5 = r5 + r7
            r4.f23680P = r5
        L_0x003e:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0045:
            if (r5 >= r2) goto L_0x011e
            java.lang.Object r13 = r1.get(r5)
            com.onedelhi.secure.o60 r13 = (com.onedelhi.secure.o60) r13
            com.onedelhi.secure.o60$b r14 = r16.mo21630H()
            com.onedelhi.secure.o60$b r15 = r16.mo21714j0()
            com.onedelhi.secure.o60$b r4 = r13.mo21630H()
            com.onedelhi.secure.o60$b r12 = r13.mo21714j0()
            boolean r4 = m11228d(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x006d
            com.onedelhi.secure.bk$a r4 = r0.f18382a
            int r12 = com.onedelhi.secure.C1788bk.C1789a.f9861g
            r14 = r17
            com.onedelhi.secure.p60.m24475R2(r3, r13, r14, r4, r12)
            goto L_0x006f
        L_0x006d:
            r14 = r17
        L_0x006f:
            boolean r4 = r13 instanceof com.onedelhi.secure.nj1
            if (r4 == 0) goto L_0x0098
            r12 = r13
            com.onedelhi.secure.nj1 r12 = (com.onedelhi.secure.nj1) r12
            int r15 = r12.mo21322m2()
            if (r15 != 0) goto L_0x0086
            if (r8 != 0) goto L_0x0083
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0083:
            r8.add(r12)
        L_0x0086:
            int r15 = r12.mo21322m2()
            r3 = 1
            if (r15 != r3) goto L_0x0098
            if (r6 != 0) goto L_0x0095
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r3
        L_0x0095:
            r6.add(r12)
        L_0x0098:
            boolean r3 = r13 instanceof com.onedelhi.secure.ml1
            if (r3 == 0) goto L_0x00d9
            boolean r3 = r13 instanceof com.onedelhi.secure.C2063ej
            if (r3 == 0) goto L_0x00c2
            r3 = r13
            com.onedelhi.secure.ej r3 = (com.onedelhi.secure.C2063ej) r3
            int r12 = r3.mo15207r2()
            if (r12 != 0) goto L_0x00b3
            if (r7 != 0) goto L_0x00b0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00b0:
            r7.add(r3)
        L_0x00b3:
            int r12 = r3.mo15207r2()
            r15 = 1
            if (r12 != r15) goto L_0x00d9
            if (r9 != 0) goto L_0x00d6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L_0x00d6
        L_0x00c2:
            r3 = r13
            com.onedelhi.secure.ml1 r3 = (com.onedelhi.secure.ml1) r3
            if (r7 != 0) goto L_0x00cc
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00cc:
            r7.add(r3)
            if (r9 != 0) goto L_0x00d6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00d6:
            r9.add(r3)
        L_0x00d9:
            com.onedelhi.secure.m60 r3 = r13.f17748a
            com.onedelhi.secure.m60 r3 = r3.f15915a
            if (r3 != 0) goto L_0x00f6
            com.onedelhi.secure.m60 r3 = r13.f17775c
            com.onedelhi.secure.m60 r3 = r3.f15915a
            if (r3 != 0) goto L_0x00f6
            if (r4 != 0) goto L_0x00f6
            boolean r3 = r13 instanceof com.onedelhi.secure.C2063ej
            if (r3 != 0) goto L_0x00f6
            if (r10 != 0) goto L_0x00f3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10 = r3
        L_0x00f3:
            r10.add(r13)
        L_0x00f6:
            com.onedelhi.secure.m60 r3 = r13.f17765b
            com.onedelhi.secure.m60 r3 = r3.f15915a
            if (r3 != 0) goto L_0x0119
            com.onedelhi.secure.m60 r3 = r13.f17781d
            com.onedelhi.secure.m60 r3 = r3.f15915a
            if (r3 != 0) goto L_0x0119
            com.onedelhi.secure.m60 r3 = r13.f17785e
            com.onedelhi.secure.m60 r3 = r3.f15915a
            if (r3 != 0) goto L_0x0119
            if (r4 != 0) goto L_0x0119
            boolean r3 = r13 instanceof com.onedelhi.secure.C2063ej
            if (r3 != 0) goto L_0x0119
            if (r11 != 0) goto L_0x0116
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x0116:
            r11.add(r13)
        L_0x0119:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x0045
        L_0x011e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x013b
            java.util.Iterator r4 = r6.iterator()
        L_0x0129:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013b
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.nj1 r5 = (com.onedelhi.secure.nj1) r5
            r6 = 0
            r12 = 0
            m11225a(r5, r6, r3, r12)
            goto L_0x0129
        L_0x013b:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x015c
            java.util.Iterator r4 = r7.iterator()
        L_0x0143:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x015c
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.ml1 r5 = (com.onedelhi.secure.ml1) r5
            com.onedelhi.secure.fx4 r7 = m11225a(r5, r6, r3, r12)
            r5.mo20465k2(r3, r6, r7)
            r7.mo16202c(r3)
            r6 = 0
            r12 = 0
            goto L_0x0143
        L_0x015c:
            com.onedelhi.secure.m60$b r4 = com.onedelhi.secure.m60.C2835b.LEFT
            com.onedelhi.secure.m60 r4 = r0.mo21327r(r4)
            java.util.HashSet r5 = r4.mo20110e()
            if (r5 == 0) goto L_0x0184
            java.util.HashSet r4 = r4.mo20110e()
            java.util.Iterator r4 = r4.iterator()
        L_0x0170:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0184
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.m60 r5 = (com.onedelhi.secure.m60) r5
            com.onedelhi.secure.o60 r5 = r5.f15916a
            r6 = 0
            r7 = 0
            m11225a(r5, r6, r3, r7)
            goto L_0x0170
        L_0x0184:
            com.onedelhi.secure.m60$b r4 = com.onedelhi.secure.m60.C2835b.RIGHT
            com.onedelhi.secure.m60 r4 = r0.mo21327r(r4)
            java.util.HashSet r5 = r4.mo20110e()
            if (r5 == 0) goto L_0x01ac
            java.util.HashSet r4 = r4.mo20110e()
            java.util.Iterator r4 = r4.iterator()
        L_0x0198:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01ac
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.m60 r5 = (com.onedelhi.secure.m60) r5
            com.onedelhi.secure.o60 r5 = r5.f15916a
            r6 = 0
            r7 = 0
            m11225a(r5, r6, r3, r7)
            goto L_0x0198
        L_0x01ac:
            com.onedelhi.secure.m60$b r4 = com.onedelhi.secure.m60.C2835b.CENTER
            com.onedelhi.secure.m60 r4 = r0.mo21327r(r4)
            java.util.HashSet r5 = r4.mo20110e()
            if (r5 == 0) goto L_0x01d4
            java.util.HashSet r4 = r4.mo20110e()
            java.util.Iterator r4 = r4.iterator()
        L_0x01c0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01d4
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.m60 r5 = (com.onedelhi.secure.m60) r5
            com.onedelhi.secure.o60 r5 = r5.f15916a
            r6 = 0
            r7 = 0
            m11225a(r5, r6, r3, r7)
            goto L_0x01c0
        L_0x01d4:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01ec
            java.util.Iterator r4 = r10.iterator()
        L_0x01dc:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01ec
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.o60 r5 = (com.onedelhi.secure.o60) r5
            m11225a(r5, r6, r3, r7)
            goto L_0x01dc
        L_0x01ec:
            if (r8 == 0) goto L_0x0203
            java.util.Iterator r4 = r8.iterator()
        L_0x01f2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0203
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.nj1 r5 = (com.onedelhi.secure.nj1) r5
            r6 = 1
            m11225a(r5, r6, r3, r7)
            goto L_0x01f2
        L_0x0203:
            r6 = 1
            if (r9 == 0) goto L_0x0223
            java.util.Iterator r4 = r9.iterator()
        L_0x020a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0223
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.ml1 r5 = (com.onedelhi.secure.ml1) r5
            com.onedelhi.secure.fx4 r8 = m11225a(r5, r6, r3, r7)
            r5.mo20465k2(r3, r6, r8)
            r8.mo16202c(r3)
            r6 = 1
            r7 = 0
            goto L_0x020a
        L_0x0223:
            com.onedelhi.secure.m60$b r4 = com.onedelhi.secure.m60.C2835b.TOP
            com.onedelhi.secure.m60 r4 = r0.mo21327r(r4)
            java.util.HashSet r5 = r4.mo20110e()
            if (r5 == 0) goto L_0x024b
            java.util.HashSet r4 = r4.mo20110e()
            java.util.Iterator r4 = r4.iterator()
        L_0x0237:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x024b
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.m60 r5 = (com.onedelhi.secure.m60) r5
            com.onedelhi.secure.o60 r5 = r5.f15916a
            r6 = 1
            r7 = 0
            m11225a(r5, r6, r3, r7)
            goto L_0x0237
        L_0x024b:
            com.onedelhi.secure.m60$b r4 = com.onedelhi.secure.m60.C2835b.BASELINE
            com.onedelhi.secure.m60 r4 = r0.mo21327r(r4)
            java.util.HashSet r5 = r4.mo20110e()
            if (r5 == 0) goto L_0x0273
            java.util.HashSet r4 = r4.mo20110e()
            java.util.Iterator r4 = r4.iterator()
        L_0x025f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0273
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.m60 r5 = (com.onedelhi.secure.m60) r5
            com.onedelhi.secure.o60 r5 = r5.f15916a
            r6 = 1
            r7 = 0
            m11225a(r5, r6, r3, r7)
            goto L_0x025f
        L_0x0273:
            com.onedelhi.secure.m60$b r4 = com.onedelhi.secure.m60.C2835b.BOTTOM
            com.onedelhi.secure.m60 r4 = r0.mo21327r(r4)
            java.util.HashSet r5 = r4.mo20110e()
            if (r5 == 0) goto L_0x029b
            java.util.HashSet r4 = r4.mo20110e()
            java.util.Iterator r4 = r4.iterator()
        L_0x0287:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x029b
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.m60 r5 = (com.onedelhi.secure.m60) r5
            com.onedelhi.secure.o60 r5 = r5.f15916a
            r6 = 1
            r7 = 0
            m11225a(r5, r6, r3, r7)
            goto L_0x0287
        L_0x029b:
            com.onedelhi.secure.m60$b r4 = com.onedelhi.secure.m60.C2835b.CENTER
            com.onedelhi.secure.m60 r4 = r0.mo21327r(r4)
            java.util.HashSet r5 = r4.mo20110e()
            if (r5 == 0) goto L_0x02c3
            java.util.HashSet r4 = r4.mo20110e()
            java.util.Iterator r4 = r4.iterator()
        L_0x02af:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02c3
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.m60 r5 = (com.onedelhi.secure.m60) r5
            com.onedelhi.secure.o60 r5 = r5.f15916a
            r6 = 1
            r12 = 0
            m11225a(r5, r6, r3, r12)
            goto L_0x02af
        L_0x02c3:
            r6 = 1
            r12 = 0
            if (r11 == 0) goto L_0x02db
            java.util.Iterator r4 = r11.iterator()
        L_0x02cb:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02db
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.o60 r5 = (com.onedelhi.secure.o60) r5
            m11225a(r5, r6, r3, r12)
            goto L_0x02cb
        L_0x02db:
            r4 = 0
        L_0x02dc:
            if (r4 >= r2) goto L_0x0308
            java.lang.Object r5 = r1.get(r4)
            com.onedelhi.secure.o60 r5 = (com.onedelhi.secure.o60) r5
            boolean r6 = r5.mo21657Q0()
            if (r6 == 0) goto L_0x0305
            int r6 = r5.f17742I
            com.onedelhi.secure.fx4 r6 = m11226b(r3, r6)
            int r5 = r5.f17743J
            com.onedelhi.secure.fx4 r5 = m11226b(r3, r5)
            if (r6 == 0) goto L_0x0305
            if (r5 == 0) goto L_0x0305
            r7 = 0
            r6.mo16212m(r7, r5)
            r7 = 2
            r5.mo16214o(r7)
            r3.remove(r6)
        L_0x0305:
            int r4 = r4 + 1
            goto L_0x02dc
        L_0x0308:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0311
            r1 = 0
            return r1
        L_0x0311:
            com.onedelhi.secure.o60$b r1 = r16.mo21630H()
            com.onedelhi.secure.o60$b r2 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r1 != r2) goto L_0x0353
            java.util.Iterator r1 = r3.iterator()
            r2 = r12
            r6 = 0
        L_0x031f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0344
            java.lang.Object r4 = r1.next()
            com.onedelhi.secure.fx4 r4 = (com.onedelhi.secure.fx4) r4
            int r5 = r4.mo16206g()
            r7 = 1
            if (r5 != r7) goto L_0x0333
            goto L_0x031f
        L_0x0333:
            r5 = 0
            r4.mo16213n(r5)
            com.onedelhi.secure.p32 r7 = r16.mo22326I2()
            int r7 = r4.mo16211l(r7, r5)
            if (r7 <= r6) goto L_0x031f
            r2 = r4
            r6 = r7
            goto L_0x031f
        L_0x0344:
            if (r2 == 0) goto L_0x0353
            com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.FIXED
            r0.mo21621D1(r1)
            r0.mo21691c2(r6)
            r1 = 1
            r2.mo16213n(r1)
            goto L_0x0354
        L_0x0353:
            r2 = r12
        L_0x0354:
            com.onedelhi.secure.o60$b r1 = r16.mo21714j0()
            com.onedelhi.secure.o60$b r4 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r1 != r4) goto L_0x0398
            java.util.Iterator r1 = r3.iterator()
            r3 = r12
            r6 = 0
        L_0x0362:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0387
            java.lang.Object r4 = r1.next()
            com.onedelhi.secure.fx4 r4 = (com.onedelhi.secure.fx4) r4
            int r5 = r4.mo16206g()
            if (r5 != 0) goto L_0x0375
            goto L_0x0362
        L_0x0375:
            r5 = 0
            r4.mo16213n(r5)
            com.onedelhi.secure.p32 r7 = r16.mo22326I2()
            r8 = 1
            int r7 = r4.mo16211l(r7, r8)
            if (r7 <= r6) goto L_0x0362
            r3 = r4
            r6 = r7
            goto L_0x0362
        L_0x0387:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x039a
            com.onedelhi.secure.o60$b r1 = com.onedelhi.secure.o60.C3032b.FIXED
            r0.mo21679Y1(r1)
            r0.mo21758y1(r6)
            r3.mo16213n(r8)
            r4 = r3
            goto L_0x039b
        L_0x0398:
            r5 = 0
            r8 = 1
        L_0x039a:
            r4 = r12
        L_0x039b:
            if (r2 != 0) goto L_0x03a2
            if (r4 == 0) goto L_0x03a0
            goto L_0x03a2
        L_0x03a0:
            r3 = 0
            goto L_0x03a3
        L_0x03a2:
            r3 = 1
        L_0x03a3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.aj1.m11227c(com.onedelhi.secure.p60, com.onedelhi.secure.bk$b):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11228d(com.onedelhi.secure.o60.C3032b r5, com.onedelhi.secure.o60.C3032b r6, com.onedelhi.secure.o60.C3032b r7, com.onedelhi.secure.o60.C3032b r8) {
        /*
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            com.onedelhi.secure.o60$b r3 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            com.onedelhi.secure.o60$b r4 = com.onedelhi.secure.o60.C3032b.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = 0
            goto L_0x0014
        L_0x0013:
            r5 = 1
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            com.onedelhi.secure.o60$b r7 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            com.onedelhi.secure.o60$b r0 = com.onedelhi.secure.o60.C3032b.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = 0
            goto L_0x0024
        L_0x0023:
            r6 = 1
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.aj1.m11228d(com.onedelhi.secure.o60$b, com.onedelhi.secure.o60$b, com.onedelhi.secure.o60$b, com.onedelhi.secure.o60$b):boolean");
    }
}

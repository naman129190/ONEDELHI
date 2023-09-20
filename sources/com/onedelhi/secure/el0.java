package com.onedelhi.secure;

import com.onedelhi.secure.C1788bk;
import com.onedelhi.secure.o60;
import com.onedelhi.secure.yg1;
import java.util.ArrayList;

public class el0 {

    /* renamed from: a */
    public static int f11279a = 0;

    /* renamed from: a */
    public static C1788bk.C1789a f11280a = new C1788bk.C1789a();

    /* renamed from: a */
    public static final boolean f11281a = false;

    /* renamed from: b */
    public static int f11282b = 0;

    /* renamed from: b */
    public static final boolean f11283b = false;

    /* renamed from: c */
    public static final boolean f11284c = true;

    /* renamed from: a */
    public static boolean m13849a(int i, o60 o60) {
        o60.C3032b bVar;
        o60.C3032b bVar2;
        o60.C3032b H = o60.mo21630H();
        o60.C3032b j0 = o60.mo21714j0();
        p60 p60 = o60.mo21666U() != null ? (p60) o60.mo21666U() : null;
        if (p60 != null) {
            o60.C3032b H2 = p60.mo21630H();
            o60.C3032b bVar3 = o60.C3032b.FIXED;
        }
        if (p60 != null) {
            o60.C3032b j02 = p60.mo21714j0();
            o60.C3032b bVar4 = o60.C3032b.FIXED;
        }
        o60.C3032b bVar5 = o60.C3032b.FIXED;
        boolean z = H == bVar5 || o60.mo15197G0() || H == o60.C3032b.WRAP_CONTENT || (H == (bVar2 = o60.C3032b.MATCH_CONSTRAINT) && o60.f17788f == 0 && o60.f17783e == 0.0f && o60.mo21736r0(0)) || (H == bVar2 && o60.f17788f == 1 && o60.mo21745u0(0, o60.mo21723m0()));
        boolean z2 = j0 == bVar5 || o60.mo15198H0() || j0 == o60.C3032b.WRAP_CONTENT || (j0 == (bVar = o60.C3032b.MATCH_CONSTRAINT) && o60.f17792g == 0 && o60.f17783e == 0.0f && o60.mo21736r0(1)) || (j0 == bVar && o60.f17792g == 1 && o60.mo21745u0(1, o60.mo21619D()));
        if (o60.f17783e <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r11 = r12.f17775c.f15915a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r11 = r12.f17748a.f15915a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13850b(int r16, com.onedelhi.secure.o60 r17, com.onedelhi.secure.C1788bk.C1790b r18, boolean r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r17.mo21760z0()
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            int r3 = f11279a
            r4 = 1
            int r3 = r3 + r4
            f11279a = r3
            boolean r3 = r0 instanceof com.onedelhi.secure.p60
            if (r3 != 0) goto L_0x002f
            boolean r3 = r17.mo21626F0()
            if (r3 == 0) goto L_0x002f
            int r3 = r16 + 1
            boolean r5 = m13849a(r3, r0)
            if (r5 == 0) goto L_0x002f
            com.onedelhi.secure.bk$a r5 = new com.onedelhi.secure.bk$a
            r5.<init>()
            int r6 = com.onedelhi.secure.C1788bk.C1789a.f9861g
            com.onedelhi.secure.p60.m24475R2(r3, r0, r1, r5, r6)
        L_0x002f:
            com.onedelhi.secure.m60$b r3 = com.onedelhi.secure.m60.C2835b.LEFT
            com.onedelhi.secure.m60 r3 = r0.mo21327r(r3)
            com.onedelhi.secure.m60$b r5 = com.onedelhi.secure.m60.C2835b.RIGHT
            com.onedelhi.secure.m60 r5 = r0.mo21327r(r5)
            int r6 = r3.mo20111f()
            int r7 = r5.mo20111f()
            java.util.HashSet r8 = r3.mo20110e()
            r9 = 0
            r10 = 8
            if (r8 == 0) goto L_0x012e
            boolean r8 = r3.mo20120o()
            if (r8 == 0) goto L_0x012e
            java.util.HashSet r3 = r3.mo20110e()
            java.util.Iterator r3 = r3.iterator()
        L_0x005a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x012e
            java.lang.Object r8 = r3.next()
            com.onedelhi.secure.m60 r8 = (com.onedelhi.secure.m60) r8
            com.onedelhi.secure.o60 r12 = r8.f15916a
            int r13 = r16 + 1
            boolean r14 = m13849a(r13, r12)
            boolean r15 = r12.mo21626F0()
            if (r15 == 0) goto L_0x0080
            if (r14 == 0) goto L_0x0080
            com.onedelhi.secure.bk$a r15 = new com.onedelhi.secure.bk$a
            r15.<init>()
            int r11 = com.onedelhi.secure.C1788bk.C1789a.f9861g
            com.onedelhi.secure.p60.m24475R2(r13, r12, r1, r15, r11)
        L_0x0080:
            com.onedelhi.secure.m60 r11 = r12.f17748a
            if (r8 != r11) goto L_0x0090
            com.onedelhi.secure.m60 r11 = r12.f17775c
            com.onedelhi.secure.m60 r11 = r11.f15915a
            if (r11 == 0) goto L_0x0090
            boolean r11 = r11.mo20120o()
            if (r11 != 0) goto L_0x00a0
        L_0x0090:
            com.onedelhi.secure.m60 r11 = r12.f17775c
            if (r8 != r11) goto L_0x00a2
            com.onedelhi.secure.m60 r11 = r12.f17748a
            com.onedelhi.secure.m60 r11 = r11.f15915a
            if (r11 == 0) goto L_0x00a2
            boolean r11 = r11.mo20120o()
            if (r11 == 0) goto L_0x00a2
        L_0x00a0:
            r11 = 1
            goto L_0x00a3
        L_0x00a2:
            r11 = 0
        L_0x00a3:
            com.onedelhi.secure.o60$b r15 = r12.mo21630H()
            com.onedelhi.secure.o60$b r4 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r15 != r4) goto L_0x00e6
            if (r14 == 0) goto L_0x00ae
            goto L_0x00e6
        L_0x00ae:
            com.onedelhi.secure.o60$b r8 = r12.mo21630H()
            if (r8 != r4) goto L_0x00ec
            int r4 = r12.f17798i
            if (r4 < 0) goto L_0x00ec
            int r4 = r12.f17795h
            if (r4 < 0) goto L_0x00ec
            int r4 = r12.mo21720l0()
            if (r4 == r10) goto L_0x00ce
            int r4 = r12.f17788f
            if (r4 != 0) goto L_0x00ec
            float r4 = r12.mo21610A()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x00ec
        L_0x00ce:
            boolean r4 = r12.mo21614B0()
            if (r4 != 0) goto L_0x00ec
            boolean r4 = r12.mo21623E0()
            if (r4 != 0) goto L_0x00ec
            if (r11 == 0) goto L_0x00ec
            boolean r4 = r12.mo21614B0()
            if (r4 != 0) goto L_0x00ec
            m13855g(r13, r0, r1, r12, r2)
            goto L_0x00ec
        L_0x00e6:
            boolean r4 = r12.mo21626F0()
            if (r4 == 0) goto L_0x00ef
        L_0x00ec:
            r4 = 1
            goto L_0x005a
        L_0x00ef:
            com.onedelhi.secure.m60 r4 = r12.f17748a
            if (r8 != r4) goto L_0x010a
            com.onedelhi.secure.m60 r14 = r12.f17775c
            com.onedelhi.secure.m60 r14 = r14.f15915a
            if (r14 != 0) goto L_0x010a
            int r4 = r4.mo20112g()
            int r4 = r4 + r6
            int r8 = r12.mo21723m0()
            int r8 = r8 + r4
            r12.mo21735q1(r4, r8)
        L_0x0106:
            m13850b(r13, r12, r1, r2)
            goto L_0x00ec
        L_0x010a:
            com.onedelhi.secure.m60 r14 = r12.f17775c
            if (r8 != r14) goto L_0x0122
            com.onedelhi.secure.m60 r4 = r4.f15915a
            if (r4 != 0) goto L_0x0122
            int r4 = r14.mo20112g()
            int r4 = r6 - r4
            int r8 = r12.mo21723m0()
            int r8 = r4 - r8
            r12.mo21735q1(r8, r4)
            goto L_0x0106
        L_0x0122:
            if (r11 == 0) goto L_0x00ec
            boolean r4 = r12.mo21614B0()
            if (r4 != 0) goto L_0x00ec
            m13854f(r13, r1, r12, r2)
            goto L_0x00ec
        L_0x012e:
            boolean r3 = r0 instanceof com.onedelhi.secure.nj1
            if (r3 == 0) goto L_0x0133
            return
        L_0x0133:
            java.util.HashSet r3 = r5.mo20110e()
            if (r3 == 0) goto L_0x021e
            boolean r3 = r5.mo20120o()
            if (r3 == 0) goto L_0x021e
            java.util.HashSet r3 = r5.mo20110e()
            java.util.Iterator r3 = r3.iterator()
        L_0x0147:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x021e
            java.lang.Object r4 = r3.next()
            com.onedelhi.secure.m60 r4 = (com.onedelhi.secure.m60) r4
            com.onedelhi.secure.o60 r5 = r4.f15916a
            r6 = 1
            int r8 = r16 + 1
            boolean r11 = m13849a(r8, r5)
            boolean r12 = r5.mo21626F0()
            if (r12 == 0) goto L_0x016e
            if (r11 == 0) goto L_0x016e
            com.onedelhi.secure.bk$a r12 = new com.onedelhi.secure.bk$a
            r12.<init>()
            int r13 = com.onedelhi.secure.C1788bk.C1789a.f9861g
            com.onedelhi.secure.p60.m24475R2(r8, r5, r1, r12, r13)
        L_0x016e:
            com.onedelhi.secure.m60 r12 = r5.f17748a
            if (r4 != r12) goto L_0x017e
            com.onedelhi.secure.m60 r12 = r5.f17775c
            com.onedelhi.secure.m60 r12 = r12.f15915a
            if (r12 == 0) goto L_0x017e
            boolean r12 = r12.mo20120o()
            if (r12 != 0) goto L_0x018e
        L_0x017e:
            com.onedelhi.secure.m60 r12 = r5.f17775c
            if (r4 != r12) goto L_0x0190
            com.onedelhi.secure.m60 r12 = r5.f17748a
            com.onedelhi.secure.m60 r12 = r12.f15915a
            if (r12 == 0) goto L_0x0190
            boolean r12 = r12.mo20120o()
            if (r12 == 0) goto L_0x0190
        L_0x018e:
            r12 = 1
            goto L_0x0191
        L_0x0190:
            r12 = 0
        L_0x0191:
            com.onedelhi.secure.o60$b r13 = r5.mo21630H()
            com.onedelhi.secure.o60$b r14 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r13 != r14) goto L_0x01d5
            if (r11 == 0) goto L_0x019c
            goto L_0x01d5
        L_0x019c:
            com.onedelhi.secure.o60$b r4 = r5.mo21630H()
            if (r4 != r14) goto L_0x0147
            int r4 = r5.f17798i
            if (r4 < 0) goto L_0x0147
            int r4 = r5.f17795h
            if (r4 < 0) goto L_0x0147
            int r4 = r5.mo21720l0()
            if (r4 == r10) goto L_0x01bc
            int r4 = r5.f17788f
            if (r4 != 0) goto L_0x0147
            float r4 = r5.mo21610A()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0147
        L_0x01bc:
            boolean r4 = r5.mo21614B0()
            if (r4 != 0) goto L_0x0147
            boolean r4 = r5.mo21623E0()
            if (r4 != 0) goto L_0x0147
            if (r12 == 0) goto L_0x0147
            boolean r4 = r5.mo21614B0()
            if (r4 != 0) goto L_0x0147
            m13855g(r8, r0, r1, r5, r2)
            goto L_0x0147
        L_0x01d5:
            boolean r11 = r5.mo21626F0()
            if (r11 == 0) goto L_0x01dd
            goto L_0x0147
        L_0x01dd:
            com.onedelhi.secure.m60 r11 = r5.f17748a
            if (r4 != r11) goto L_0x01f9
            com.onedelhi.secure.m60 r13 = r5.f17775c
            com.onedelhi.secure.m60 r13 = r13.f15915a
            if (r13 != 0) goto L_0x01f9
            int r4 = r11.mo20112g()
            int r4 = r4 + r7
            int r11 = r5.mo21723m0()
            int r11 = r11 + r4
            r5.mo21735q1(r4, r11)
        L_0x01f4:
            m13850b(r8, r5, r1, r2)
            goto L_0x0147
        L_0x01f9:
            com.onedelhi.secure.m60 r13 = r5.f17775c
            if (r4 != r13) goto L_0x0211
            com.onedelhi.secure.m60 r4 = r11.f15915a
            if (r4 != 0) goto L_0x0211
            int r4 = r13.mo20112g()
            int r4 = r7 - r4
            int r11 = r5.mo21723m0()
            int r11 = r4 - r11
            r5.mo21735q1(r11, r4)
            goto L_0x01f4
        L_0x0211:
            if (r12 == 0) goto L_0x0147
            boolean r4 = r5.mo21614B0()
            if (r4 != 0) goto L_0x0147
            m13854f(r8, r1, r5, r2)
            goto L_0x0147
        L_0x021e:
            r17.mo21648N0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.el0.m13850b(int, com.onedelhi.secure.o60, com.onedelhi.secure.bk$b, boolean):void");
    }

    /* renamed from: c */
    public static String m13851c(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(yg1.C3999a.f23084c);
        }
        sb.append("+-(" + i + ") ");
        return sb.toString();
    }

    /* renamed from: d */
    public static void m13852d(int i, C2063ej ejVar, C1788bk.C1790b bVar, int i2, boolean z) {
        if (ejVar.mo15201m2()) {
            int i3 = i + 1;
            if (i2 == 0) {
                m13850b(i3, ejVar, bVar, z);
            } else {
                m13859k(i3, ejVar, bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d7, code lost:
        if (r6[r23].f15915a.f15916a == r0) goto L_0x01db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0151  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13853e(com.onedelhi.secure.p60 r20, com.onedelhi.secure.p32 r21, int r22, int r23, com.onedelhi.secure.C3546sv r24, boolean r25, boolean r26, boolean r27) {
        /*
            r0 = 0
            if (r27 == 0) goto L_0x0004
            return r0
        L_0x0004:
            if (r22 != 0) goto L_0x000d
            boolean r1 = r20.mo15197G0()
            if (r1 != 0) goto L_0x0014
            return r0
        L_0x000d:
            boolean r1 = r20.mo15198H0()
            if (r1 != 0) goto L_0x0014
            return r0
        L_0x0014:
            boolean r1 = r20.mo22332O2()
            com.onedelhi.secure.o60 r2 = r24.mo24564c()
            com.onedelhi.secure.o60 r3 = r24.mo24568g()
            com.onedelhi.secure.o60 r4 = r24.mo24566e()
            com.onedelhi.secure.o60 r5 = r24.mo24570i()
            com.onedelhi.secure.o60 r6 = r24.mo24567f()
            com.onedelhi.secure.m60[] r7 = r2.f17759a
            r7 = r7[r23]
            com.onedelhi.secure.m60[] r3 = r3.f17759a
            int r8 = r23 + 1
            r3 = r3[r8]
            com.onedelhi.secure.m60 r9 = r7.f15915a
            if (r9 == 0) goto L_0x022f
            com.onedelhi.secure.m60 r10 = r3.f15915a
            if (r10 != 0) goto L_0x0040
            goto L_0x022f
        L_0x0040:
            boolean r9 = r9.mo20120o()
            if (r9 == 0) goto L_0x022f
            com.onedelhi.secure.m60 r9 = r3.f15915a
            boolean r9 = r9.mo20120o()
            if (r9 != 0) goto L_0x0050
            goto L_0x022f
        L_0x0050:
            if (r4 == 0) goto L_0x022f
            if (r5 != 0) goto L_0x0056
            goto L_0x022f
        L_0x0056:
            com.onedelhi.secure.m60 r7 = r7.f15915a
            int r7 = r7.mo20111f()
            com.onedelhi.secure.m60[] r9 = r4.f17759a
            r9 = r9[r23]
            int r9 = r9.mo20112g()
            int r7 = r7 + r9
            com.onedelhi.secure.m60 r3 = r3.f15915a
            int r3 = r3.mo20111f()
            com.onedelhi.secure.m60[] r9 = r5.f17759a
            r9 = r9[r8]
            int r9 = r9.mo20112g()
            int r3 = r3 - r9
            int r9 = r3 - r7
            if (r9 > 0) goto L_0x0079
            return r0
        L_0x0079:
            com.onedelhi.secure.bk$a r10 = new com.onedelhi.secure.bk$a
            r10.<init>()
            r13 = r2
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
        L_0x0083:
            r17 = 0
            r0 = 1
            if (r11 != 0) goto L_0x0103
            boolean r18 = m13849a(r0, r13)
            r16 = 0
            if (r18 != 0) goto L_0x0091
            return r16
        L_0x0091:
            com.onedelhi.secure.o60$b[] r0 = r13.f17760a
            r0 = r0[r22]
            r18 = r2
            com.onedelhi.secure.o60$b r2 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x009c
            return r16
        L_0x009c:
            boolean r0 = r13.mo21626F0()
            if (r0 == 0) goto L_0x00af
            com.onedelhi.secure.bk$b r0 = r20.mo22324G2()
            int r2 = com.onedelhi.secure.C1788bk.C1789a.f9861g
            r19 = r11
            r11 = 1
            com.onedelhi.secure.p60.m24475R2(r11, r13, r0, r10, r2)
            goto L_0x00b1
        L_0x00af:
            r19 = r11
        L_0x00b1:
            com.onedelhi.secure.m60[] r0 = r13.f17759a
            r0 = r0[r23]
            int r0 = r0.mo20112g()
            int r15 = r15 + r0
            if (r22 != 0) goto L_0x00c1
            int r0 = r13.mo21723m0()
            goto L_0x00c5
        L_0x00c1:
            int r0 = r13.mo21619D()
        L_0x00c5:
            int r15 = r15 + r0
            com.onedelhi.secure.m60[] r0 = r13.f17759a
            r0 = r0[r8]
            int r0 = r0.mo20112g()
            int r15 = r15 + r0
            int r14 = r14 + 1
            int r0 = r13.mo21720l0()
            r2 = 8
            if (r0 == r2) goto L_0x00db
            int r12 = r12 + 1
        L_0x00db:
            com.onedelhi.secure.m60[] r0 = r13.f17759a
            r0 = r0[r8]
            com.onedelhi.secure.m60 r0 = r0.f15915a
            if (r0 == 0) goto L_0x00f8
            com.onedelhi.secure.o60 r0 = r0.f15916a
            com.onedelhi.secure.m60[] r2 = r0.f17759a
            r11 = r2[r23]
            com.onedelhi.secure.m60 r11 = r11.f15915a
            if (r11 == 0) goto L_0x00f8
            r2 = r2[r23]
            com.onedelhi.secure.m60 r2 = r2.f15915a
            com.onedelhi.secure.o60 r2 = r2.f15916a
            if (r2 == r13) goto L_0x00f6
            goto L_0x00f8
        L_0x00f6:
            r17 = r0
        L_0x00f8:
            if (r17 == 0) goto L_0x00ff
            r13 = r17
            r11 = r19
            goto L_0x0100
        L_0x00ff:
            r11 = 1
        L_0x0100:
            r2 = r18
            goto L_0x0083
        L_0x0103:
            r18 = r2
            r0 = 0
            if (r12 != 0) goto L_0x0109
            return r0
        L_0x0109:
            if (r12 == r14) goto L_0x010c
            return r0
        L_0x010c:
            if (r9 >= r15) goto L_0x010f
            return r0
        L_0x010f:
            int r9 = r9 - r15
            r0 = 2
            if (r25 == 0) goto L_0x0118
            int r2 = r12 + 1
            int r9 = r9 / r2
        L_0x0116:
            r2 = 1
            goto L_0x011f
        L_0x0118:
            if (r26 == 0) goto L_0x0116
            if (r12 <= r0) goto L_0x0116
            int r9 = r9 / r12
            r2 = 1
            int r9 = r9 - r2
        L_0x011f:
            if (r12 != r2) goto L_0x0151
            if (r22 != 0) goto L_0x0128
            float r0 = r6.mo21622E()
            goto L_0x012c
        L_0x0128:
            float r0 = r6.mo21703g0()
        L_0x012c:
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = (float) r7
            float r3 = r3 + r2
            float r2 = (float) r9
            float r2 = r2 * r0
            float r3 = r3 + r2
            int r0 = (int) r3
            if (r22 != 0) goto L_0x0140
            int r2 = r4.mo21723m0()
            int r2 = r2 + r0
            r4.mo21735q1(r0, r2)
            goto L_0x0148
        L_0x0140:
            int r2 = r4.mo21619D()
            int r2 = r2 + r0
            r4.mo21743t1(r0, r2)
        L_0x0148:
            com.onedelhi.secure.bk$b r0 = r20.mo22324G2()
            r2 = 1
            m13850b(r2, r4, r0, r1)
            return r2
        L_0x0151:
            if (r25 == 0) goto L_0x01e3
            int r7 = r7 + r9
            r0 = r18
            r3 = 0
        L_0x0157:
            if (r3 != 0) goto L_0x022e
            int r4 = r0.mo21720l0()
            r5 = 8
            if (r4 != r5) goto L_0x017c
            if (r22 != 0) goto L_0x016e
            r0.mo21735q1(r7, r7)
            com.onedelhi.secure.bk$b r4 = r20.mo22324G2()
            m13850b(r2, r0, r4, r1)
            goto L_0x0178
        L_0x016e:
            r0.mo21743t1(r7, r7)
            com.onedelhi.secure.bk$b r4 = r20.mo22324G2()
            m13859k(r2, r0, r4)
        L_0x0178:
            r2 = r21
            r4 = 0
            goto L_0x01bc
        L_0x017c:
            com.onedelhi.secure.m60[] r2 = r0.f17759a
            r2 = r2[r23]
            int r2 = r2.mo20112g()
            int r7 = r7 + r2
            if (r22 != 0) goto L_0x019c
            int r2 = r0.mo21723m0()
            int r2 = r2 + r7
            r0.mo21735q1(r7, r2)
            com.onedelhi.secure.bk$b r2 = r20.mo22324G2()
            r4 = 1
            m13850b(r4, r0, r2, r1)
            int r2 = r0.mo21723m0()
            goto L_0x01b0
        L_0x019c:
            r4 = 1
            int r2 = r0.mo21619D()
            int r2 = r2 + r7
            r0.mo21743t1(r7, r2)
            com.onedelhi.secure.bk$b r2 = r20.mo22324G2()
            m13859k(r4, r0, r2)
            int r2 = r0.mo21619D()
        L_0x01b0:
            int r7 = r7 + r2
            com.onedelhi.secure.m60[] r2 = r0.f17759a
            r2 = r2[r8]
            int r2 = r2.mo20112g()
            int r7 = r7 + r2
            int r7 = r7 + r9
            goto L_0x0178
        L_0x01bc:
            r0.mo15199g(r2, r4)
            com.onedelhi.secure.m60[] r4 = r0.f17759a
            r4 = r4[r8]
            com.onedelhi.secure.m60 r4 = r4.f15915a
            if (r4 == 0) goto L_0x01d9
            com.onedelhi.secure.o60 r4 = r4.f15916a
            com.onedelhi.secure.m60[] r6 = r4.f17759a
            r10 = r6[r23]
            com.onedelhi.secure.m60 r10 = r10.f15915a
            if (r10 == 0) goto L_0x01d9
            r6 = r6[r23]
            com.onedelhi.secure.m60 r6 = r6.f15915a
            com.onedelhi.secure.o60 r6 = r6.f15916a
            if (r6 == r0) goto L_0x01db
        L_0x01d9:
            r4 = r17
        L_0x01db:
            if (r4 == 0) goto L_0x01df
            r0 = r4
            goto L_0x01e0
        L_0x01df:
            r3 = 1
        L_0x01e0:
            r2 = 1
            goto L_0x0157
        L_0x01e3:
            if (r26 == 0) goto L_0x022d
            if (r12 != r0) goto L_0x022b
            if (r22 != 0) goto L_0x020a
            int r0 = r4.mo21723m0()
            int r0 = r0 + r7
            r4.mo21735q1(r7, r0)
            int r0 = r5.mo21723m0()
            int r0 = r3 - r0
            r5.mo21735q1(r0, r3)
            com.onedelhi.secure.bk$b r0 = r20.mo22324G2()
            r2 = 1
            m13850b(r2, r4, r0, r1)
            com.onedelhi.secure.bk$b r0 = r20.mo22324G2()
            m13850b(r2, r5, r0, r1)
            goto L_0x022a
        L_0x020a:
            r2 = 1
            int r0 = r4.mo21619D()
            int r0 = r0 + r7
            r4.mo21743t1(r7, r0)
            int r0 = r5.mo21619D()
            int r0 = r3 - r0
            r5.mo21743t1(r0, r3)
            com.onedelhi.secure.bk$b r0 = r20.mo22324G2()
            m13859k(r2, r4, r0)
            com.onedelhi.secure.bk$b r0 = r20.mo22324G2()
            m13859k(r2, r5, r0)
        L_0x022a:
            return r2
        L_0x022b:
            r0 = 0
            return r0
        L_0x022d:
            r2 = 1
        L_0x022e:
            return r2
        L_0x022f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.el0.m13853e(com.onedelhi.secure.p60, com.onedelhi.secure.p32, int, int, com.onedelhi.secure.sv, boolean, boolean, boolean):boolean");
    }

    /* renamed from: f */
    public static void m13854f(int i, C1788bk.C1790b bVar, o60 o60, boolean z) {
        float E = o60.mo21622E();
        int f = o60.f17748a.f15915a.mo20111f();
        int f2 = o60.f17775c.f15915a.mo20111f();
        int g = o60.f17748a.mo20112g() + f;
        int g2 = f2 - o60.f17775c.mo20112g();
        if (f == f2) {
            E = 0.5f;
        } else {
            f = g;
            f2 = g2;
        }
        int m0 = o60.mo21723m0();
        int i2 = (f2 - f) - m0;
        if (f > f2) {
            i2 = (f - f2) - m0;
        }
        int i3 = ((int) (i2 > 0 ? (E * ((float) i2)) + 0.5f : E * ((float) i2))) + f;
        int i4 = i3 + m0;
        if (f > f2) {
            i4 = i3 - m0;
        }
        o60.mo21735q1(i3, i4);
        m13850b(i + 1, o60, bVar, z);
    }

    /* renamed from: g */
    public static void m13855g(int i, o60 o60, C1788bk.C1790b bVar, o60 o602, boolean z) {
        float E = o602.mo21622E();
        int f = o602.f17748a.f15915a.mo20111f() + o602.f17748a.mo20112g();
        int f2 = o602.f17775c.f15915a.mo20111f() - o602.f17775c.mo20112g();
        if (f2 >= f) {
            int m0 = o602.mo21723m0();
            if (o602.mo21720l0() != 8) {
                int i2 = o602.f17788f;
                if (i2 == 2) {
                    if (!(o60 instanceof p60)) {
                        o60 = o60.mo21666U();
                    }
                    m0 = (int) (o602.mo21622E() * 0.5f * ((float) o60.mo21723m0()));
                } else if (i2 == 0) {
                    m0 = f2 - f;
                }
                m0 = Math.max(o602.f17795h, m0);
                int i3 = o602.f17798i;
                if (i3 > 0) {
                    m0 = Math.min(i3, m0);
                }
            }
            int i4 = f + ((int) ((E * ((float) ((f2 - f) - m0))) + 0.5f));
            o602.mo21735q1(i4, m0 + i4);
            m13850b(i + 1, o602, bVar, z);
        }
    }

    /* renamed from: h */
    public static void m13856h(int i, C1788bk.C1790b bVar, o60 o60) {
        float g0 = o60.mo21703g0();
        int f = o60.f17765b.f15915a.mo20111f();
        int f2 = o60.f17781d.f15915a.mo20111f();
        int g = o60.f17765b.mo20112g() + f;
        int g2 = f2 - o60.f17781d.mo20112g();
        if (f == f2) {
            g0 = 0.5f;
        } else {
            f = g;
            f2 = g2;
        }
        int D = o60.mo21619D();
        int i2 = (f2 - f) - D;
        if (f > f2) {
            i2 = (f - f2) - D;
        }
        int i3 = (int) (i2 > 0 ? (g0 * ((float) i2)) + 0.5f : g0 * ((float) i2));
        int i4 = f + i3;
        int i5 = i4 + D;
        if (f > f2) {
            i4 = f - i3;
            i5 = i4 - D;
        }
        o60.mo21743t1(i4, i5);
        m13859k(i + 1, o60, bVar);
    }

    /* renamed from: i */
    public static void m13857i(int i, o60 o60, C1788bk.C1790b bVar, o60 o602) {
        float g0 = o602.mo21703g0();
        int f = o602.f17765b.f15915a.mo20111f() + o602.f17765b.mo20112g();
        int f2 = o602.f17781d.f15915a.mo20111f() - o602.f17781d.mo20112g();
        if (f2 >= f) {
            int D = o602.mo21619D();
            if (o602.mo21720l0() != 8) {
                int i2 = o602.f17792g;
                if (i2 == 2) {
                    if (!(o60 instanceof p60)) {
                        o60 = o60.mo21666U();
                    }
                    D = (int) (g0 * 0.5f * ((float) o60.mo21619D()));
                } else if (i2 == 0) {
                    D = f2 - f;
                }
                D = Math.max(o602.f17800j, D);
                int i3 = o602.f17802k;
                if (i3 > 0) {
                    D = Math.min(i3, D);
                }
            }
            int i4 = f + ((int) ((g0 * ((float) ((f2 - f) - D))) + 0.5f));
            o602.mo21743t1(i4, D + i4);
            m13859k(i + 1, o602, bVar);
        }
    }

    /* renamed from: j */
    public static void m13858j(p60 p60, C1788bk.C1790b bVar) {
        int q2;
        int q22;
        o60.C3032b H = p60.mo21630H();
        o60.C3032b j0 = p60.mo21714j0();
        f11279a = 0;
        f11282b = 0;
        p60.mo21670V0();
        ArrayList<o60> l2 = p60.mo14933l2();
        int size = l2.size();
        for (int i = 0; i < size; i++) {
            l2.get(i).mo21670V0();
        }
        boolean O2 = p60.mo22332O2();
        if (H == o60.C3032b.FIXED) {
            p60.mo21735q1(0, p60.mo21723m0());
        } else {
            p60.mo21737r1(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            o60 o60 = l2.get(i2);
            if (o60 instanceof nj1) {
                nj1 nj1 = (nj1) o60;
                if (nj1.mo21322m2() == 1) {
                    if (nj1.mo21323n2() != -1) {
                        q22 = nj1.mo21323n2();
                    } else if (nj1.mo21325p2() == -1 || !p60.mo15197G0()) {
                        if (p60.mo15197G0()) {
                            q22 = (int) ((nj1.mo21326q2() * ((float) p60.mo21723m0())) + 0.5f);
                        }
                        z = true;
                    } else {
                        q22 = p60.mo21723m0() - nj1.mo21325p2();
                    }
                    nj1.mo21332v2(q22);
                    z = true;
                }
            } else if ((o60 instanceof C2063ej) && ((C2063ej) o60).mo15207r2() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                o60 o602 = l2.get(i3);
                if (o602 instanceof nj1) {
                    nj1 nj12 = (nj1) o602;
                    if (nj12.mo21322m2() == 1) {
                        m13850b(0, nj12, bVar, O2);
                    }
                }
            }
        }
        m13850b(0, p60, bVar, O2);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                o60 o603 = l2.get(i4);
                if (o603 instanceof C2063ej) {
                    C2063ej ejVar = (C2063ej) o603;
                    if (ejVar.mo15207r2() == 0) {
                        m13852d(0, ejVar, bVar, 0, O2);
                    }
                }
            }
        }
        if (j0 == o60.C3032b.FIXED) {
            p60.mo21743t1(0, p60.mo21619D());
        } else {
            p60.mo21740s1(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            o60 o604 = l2.get(i5);
            if (o604 instanceof nj1) {
                nj1 nj13 = (nj1) o604;
                if (nj13.mo21322m2() == 0) {
                    if (nj13.mo21323n2() != -1) {
                        q2 = nj13.mo21323n2();
                    } else if (nj13.mo21325p2() == -1 || !p60.mo15198H0()) {
                        if (p60.mo15198H0()) {
                            q2 = (int) ((nj13.mo21326q2() * ((float) p60.mo21619D())) + 0.5f);
                        }
                        z3 = true;
                    } else {
                        q2 = p60.mo21619D() - nj13.mo21325p2();
                    }
                    nj13.mo21332v2(q2);
                    z3 = true;
                }
            } else if ((o604 instanceof C2063ej) && ((C2063ej) o604).mo15207r2() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                o60 o605 = l2.get(i6);
                if (o605 instanceof nj1) {
                    nj1 nj14 = (nj1) o605;
                    if (nj14.mo21322m2() == 0) {
                        m13859k(1, nj14, bVar);
                    }
                }
            }
        }
        m13859k(0, p60, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                o60 o606 = l2.get(i7);
                if (o606 instanceof C2063ej) {
                    C2063ej ejVar2 = (C2063ej) o606;
                    if (ejVar2.mo15207r2() == 1) {
                        m13852d(0, ejVar2, bVar, 1, O2);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            o60 o607 = l2.get(i8);
            if (o607.mo21626F0() && m13849a(0, o607)) {
                p60.m24475R2(0, o607, bVar, f11280a, C1788bk.C1789a.f9861g);
                if (!(o607 instanceof nj1)) {
                    m13850b(0, o607, bVar, O2);
                } else if (((nj1) o607).mo21322m2() != 0) {
                    m13850b(0, o607, bVar, O2);
                }
                m13859k(0, o607, bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        r14 = r11.f17781d.f15915a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r14 = r11.f17765b.f15915a;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13859k(int r16, com.onedelhi.secure.o60 r17, com.onedelhi.secure.C1788bk.C1790b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r17.mo21642L0()
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            int r2 = f11282b
            r3 = 1
            int r2 = r2 + r3
            f11282b = r2
            boolean r2 = r0 instanceof com.onedelhi.secure.p60
            if (r2 != 0) goto L_0x002d
            boolean r2 = r17.mo21626F0()
            if (r2 == 0) goto L_0x002d
            int r2 = r16 + 1
            boolean r4 = m13849a(r2, r0)
            if (r4 == 0) goto L_0x002d
            com.onedelhi.secure.bk$a r4 = new com.onedelhi.secure.bk$a
            r4.<init>()
            int r5 = com.onedelhi.secure.C1788bk.C1789a.f9861g
            com.onedelhi.secure.p60.m24475R2(r2, r0, r1, r4, r5)
        L_0x002d:
            com.onedelhi.secure.m60$b r2 = com.onedelhi.secure.m60.C2835b.TOP
            com.onedelhi.secure.m60 r2 = r0.mo21327r(r2)
            com.onedelhi.secure.m60$b r4 = com.onedelhi.secure.m60.C2835b.BOTTOM
            com.onedelhi.secure.m60 r4 = r0.mo21327r(r4)
            int r5 = r2.mo20111f()
            int r6 = r4.mo20111f()
            java.util.HashSet r7 = r2.mo20110e()
            r8 = 0
            r9 = 8
            if (r7 == 0) goto L_0x012e
            boolean r7 = r2.mo20120o()
            if (r7 == 0) goto L_0x012e
            java.util.HashSet r2 = r2.mo20110e()
            java.util.Iterator r2 = r2.iterator()
        L_0x0058:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x012e
            java.lang.Object r7 = r2.next()
            com.onedelhi.secure.m60 r7 = (com.onedelhi.secure.m60) r7
            com.onedelhi.secure.o60 r11 = r7.f15916a
            int r12 = r16 + 1
            boolean r13 = m13849a(r12, r11)
            boolean r14 = r11.mo21626F0()
            if (r14 == 0) goto L_0x007e
            if (r13 == 0) goto L_0x007e
            com.onedelhi.secure.bk$a r14 = new com.onedelhi.secure.bk$a
            r14.<init>()
            int r15 = com.onedelhi.secure.C1788bk.C1789a.f9861g
            com.onedelhi.secure.p60.m24475R2(r12, r11, r1, r14, r15)
        L_0x007e:
            com.onedelhi.secure.m60 r14 = r11.f17765b
            if (r7 != r14) goto L_0x008e
            com.onedelhi.secure.m60 r14 = r11.f17781d
            com.onedelhi.secure.m60 r14 = r14.f15915a
            if (r14 == 0) goto L_0x008e
            boolean r14 = r14.mo20120o()
            if (r14 != 0) goto L_0x009e
        L_0x008e:
            com.onedelhi.secure.m60 r14 = r11.f17781d
            if (r7 != r14) goto L_0x00a0
            com.onedelhi.secure.m60 r14 = r11.f17765b
            com.onedelhi.secure.m60 r14 = r14.f15915a
            if (r14 == 0) goto L_0x00a0
            boolean r14 = r14.mo20120o()
            if (r14 == 0) goto L_0x00a0
        L_0x009e:
            r14 = 1
            goto L_0x00a1
        L_0x00a0:
            r14 = 0
        L_0x00a1:
            com.onedelhi.secure.o60$b r15 = r11.mo21714j0()
            com.onedelhi.secure.o60$b r10 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r15 != r10) goto L_0x00e5
            if (r13 == 0) goto L_0x00ac
            goto L_0x00e5
        L_0x00ac:
            com.onedelhi.secure.o60$b r7 = r11.mo21714j0()
            if (r7 != r10) goto L_0x0058
            int r7 = r11.f17802k
            if (r7 < 0) goto L_0x0058
            int r7 = r11.f17800j
            if (r7 < 0) goto L_0x0058
            int r7 = r11.mo21720l0()
            if (r7 == r9) goto L_0x00cc
            int r7 = r11.f17792g
            if (r7 != 0) goto L_0x0058
            float r7 = r11.mo21610A()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0058
        L_0x00cc:
            boolean r7 = r11.mo21620D0()
            if (r7 != 0) goto L_0x0058
            boolean r7 = r11.mo21623E0()
            if (r7 != 0) goto L_0x0058
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.mo21620D0()
            if (r7 != 0) goto L_0x0058
            m13857i(r12, r0, r1, r11)
            goto L_0x0058
        L_0x00e5:
            boolean r10 = r11.mo21626F0()
            if (r10 == 0) goto L_0x00ed
            goto L_0x0058
        L_0x00ed:
            com.onedelhi.secure.m60 r10 = r11.f17765b
            if (r7 != r10) goto L_0x0109
            com.onedelhi.secure.m60 r13 = r11.f17781d
            com.onedelhi.secure.m60 r13 = r13.f15915a
            if (r13 != 0) goto L_0x0109
            int r7 = r10.mo20112g()
            int r7 = r7 + r5
            int r10 = r11.mo21619D()
            int r10 = r10 + r7
            r11.mo21743t1(r7, r10)
        L_0x0104:
            m13859k(r12, r11, r1)
            goto L_0x0058
        L_0x0109:
            com.onedelhi.secure.m60 r13 = r11.f17781d
            if (r7 != r13) goto L_0x0121
            com.onedelhi.secure.m60 r7 = r10.f15915a
            if (r7 != 0) goto L_0x0121
            int r7 = r13.mo20112g()
            int r7 = r5 - r7
            int r10 = r11.mo21619D()
            int r10 = r7 - r10
            r11.mo21743t1(r10, r7)
            goto L_0x0104
        L_0x0121:
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.mo21620D0()
            if (r7 != 0) goto L_0x0058
            m13856h(r12, r1, r11)
            goto L_0x0058
        L_0x012e:
            boolean r2 = r0 instanceof com.onedelhi.secure.nj1
            if (r2 == 0) goto L_0x0133
            return
        L_0x0133:
            java.util.HashSet r2 = r4.mo20110e()
            if (r2 == 0) goto L_0x021d
            boolean r2 = r4.mo20120o()
            if (r2 == 0) goto L_0x021d
            java.util.HashSet r2 = r4.mo20110e()
            java.util.Iterator r2 = r2.iterator()
        L_0x0147:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x021d
            java.lang.Object r4 = r2.next()
            com.onedelhi.secure.m60 r4 = (com.onedelhi.secure.m60) r4
            com.onedelhi.secure.o60 r5 = r4.f15916a
            int r7 = r16 + 1
            boolean r10 = m13849a(r7, r5)
            boolean r11 = r5.mo21626F0()
            if (r11 == 0) goto L_0x016d
            if (r10 == 0) goto L_0x016d
            com.onedelhi.secure.bk$a r11 = new com.onedelhi.secure.bk$a
            r11.<init>()
            int r12 = com.onedelhi.secure.C1788bk.C1789a.f9861g
            com.onedelhi.secure.p60.m24475R2(r7, r5, r1, r11, r12)
        L_0x016d:
            com.onedelhi.secure.m60 r11 = r5.f17765b
            if (r4 != r11) goto L_0x017d
            com.onedelhi.secure.m60 r11 = r5.f17781d
            com.onedelhi.secure.m60 r11 = r11.f15915a
            if (r11 == 0) goto L_0x017d
            boolean r11 = r11.mo20120o()
            if (r11 != 0) goto L_0x018d
        L_0x017d:
            com.onedelhi.secure.m60 r11 = r5.f17781d
            if (r4 != r11) goto L_0x018f
            com.onedelhi.secure.m60 r11 = r5.f17765b
            com.onedelhi.secure.m60 r11 = r11.f15915a
            if (r11 == 0) goto L_0x018f
            boolean r11 = r11.mo20120o()
            if (r11 == 0) goto L_0x018f
        L_0x018d:
            r11 = 1
            goto L_0x0190
        L_0x018f:
            r11 = 0
        L_0x0190:
            com.onedelhi.secure.o60$b r12 = r5.mo21714j0()
            com.onedelhi.secure.o60$b r13 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x01d4
            if (r10 == 0) goto L_0x019b
            goto L_0x01d4
        L_0x019b:
            com.onedelhi.secure.o60$b r4 = r5.mo21714j0()
            if (r4 != r13) goto L_0x0147
            int r4 = r5.f17802k
            if (r4 < 0) goto L_0x0147
            int r4 = r5.f17800j
            if (r4 < 0) goto L_0x0147
            int r4 = r5.mo21720l0()
            if (r4 == r9) goto L_0x01bb
            int r4 = r5.f17792g
            if (r4 != 0) goto L_0x0147
            float r4 = r5.mo21610A()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0147
        L_0x01bb:
            boolean r4 = r5.mo21620D0()
            if (r4 != 0) goto L_0x0147
            boolean r4 = r5.mo21623E0()
            if (r4 != 0) goto L_0x0147
            if (r11 == 0) goto L_0x0147
            boolean r4 = r5.mo21620D0()
            if (r4 != 0) goto L_0x0147
            m13857i(r7, r0, r1, r5)
            goto L_0x0147
        L_0x01d4:
            boolean r10 = r5.mo21626F0()
            if (r10 == 0) goto L_0x01dc
            goto L_0x0147
        L_0x01dc:
            com.onedelhi.secure.m60 r10 = r5.f17765b
            if (r4 != r10) goto L_0x01f8
            com.onedelhi.secure.m60 r12 = r5.f17781d
            com.onedelhi.secure.m60 r12 = r12.f15915a
            if (r12 != 0) goto L_0x01f8
            int r4 = r10.mo20112g()
            int r4 = r4 + r6
            int r10 = r5.mo21619D()
            int r10 = r10 + r4
            r5.mo21743t1(r4, r10)
        L_0x01f3:
            m13859k(r7, r5, r1)
            goto L_0x0147
        L_0x01f8:
            com.onedelhi.secure.m60 r12 = r5.f17781d
            if (r4 != r12) goto L_0x0210
            com.onedelhi.secure.m60 r4 = r10.f15915a
            if (r4 != 0) goto L_0x0210
            int r4 = r12.mo20112g()
            int r4 = r6 - r4
            int r10 = r5.mo21619D()
            int r10 = r4 - r10
            r5.mo21743t1(r10, r4)
            goto L_0x01f3
        L_0x0210:
            if (r11 == 0) goto L_0x0147
            boolean r4 = r5.mo21620D0()
            if (r4 != 0) goto L_0x0147
            m13856h(r7, r1, r5)
            goto L_0x0147
        L_0x021d:
            com.onedelhi.secure.m60$b r2 = com.onedelhi.secure.m60.C2835b.BASELINE
            com.onedelhi.secure.m60 r2 = r0.mo21327r(r2)
            java.util.HashSet r4 = r2.mo20110e()
            if (r4 == 0) goto L_0x0282
            boolean r4 = r2.mo20120o()
            if (r4 == 0) goto L_0x0282
            int r4 = r2.mo20111f()
            java.util.HashSet r2 = r2.mo20110e()
            java.util.Iterator r2 = r2.iterator()
        L_0x023b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0282
            java.lang.Object r5 = r2.next()
            com.onedelhi.secure.m60 r5 = (com.onedelhi.secure.m60) r5
            com.onedelhi.secure.o60 r6 = r5.f15916a
            int r7 = r16 + 1
            boolean r8 = m13849a(r7, r6)
            boolean r9 = r6.mo21626F0()
            if (r9 == 0) goto L_0x0261
            if (r8 == 0) goto L_0x0261
            com.onedelhi.secure.bk$a r9 = new com.onedelhi.secure.bk$a
            r9.<init>()
            int r10 = com.onedelhi.secure.C1788bk.C1789a.f9861g
            com.onedelhi.secure.p60.m24475R2(r7, r6, r1, r9, r10)
        L_0x0261:
            com.onedelhi.secure.o60$b r9 = r6.mo21714j0()
            com.onedelhi.secure.o60$b r10 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x026b
            if (r8 == 0) goto L_0x023b
        L_0x026b:
            boolean r8 = r6.mo21626F0()
            if (r8 == 0) goto L_0x0272
            goto L_0x023b
        L_0x0272:
            com.onedelhi.secure.m60 r8 = r6.f17785e
            if (r5 != r8) goto L_0x023b
            int r5 = r5.mo20112g()
            int r5 = r5 + r4
            r6.mo21729o1(r5)
            m13859k(r7, r6, r1)     // Catch:{ all -> 0x0286 }
            goto L_0x023b
        L_0x0282:
            r17.mo21651O0()
            return
        L_0x0286:
            r0 = move-exception
            r1 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.el0.m13859k(int, com.onedelhi.secure.o60, com.onedelhi.secure.bk$b):void");
    }
}

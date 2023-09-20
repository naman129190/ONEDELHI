package com.onedelhi.secure;

import com.onedelhi.secure.m60;
import com.onedelhi.secure.o60;
import java.util.ArrayList;

/* renamed from: com.onedelhi.secure.bk */
public class C1788bk {

    /* renamed from: a */
    public static final int f9850a = 30;

    /* renamed from: a */
    public static final boolean f9851a = false;

    /* renamed from: b */
    public static final int f9852b = 0;

    /* renamed from: c */
    public static final int f9853c = 1073741824;

    /* renamed from: d */
    public static final int f9854d = Integer.MIN_VALUE;

    /* renamed from: e */
    public static final int f9855e = -1;

    /* renamed from: f */
    public static final int f9856f = -2;

    /* renamed from: g */
    public static final int f9857g = -3;

    /* renamed from: a */
    public C1789a f9858a = new C1789a();

    /* renamed from: a */
    public p60 f9859a;

    /* renamed from: a */
    public final ArrayList<o60> f9860a = new ArrayList<>();

    /* renamed from: com.onedelhi.secure.bk$a */
    public static class C1789a {

        /* renamed from: g */
        public static int f9861g = 0;

        /* renamed from: h */
        public static int f9862h = 1;

        /* renamed from: i */
        public static int f9863i = 2;

        /* renamed from: a */
        public int f9864a;

        /* renamed from: a */
        public o60.C3032b f9865a;

        /* renamed from: a */
        public boolean f9866a;

        /* renamed from: b */
        public int f9867b;

        /* renamed from: b */
        public o60.C3032b f9868b;

        /* renamed from: b */
        public boolean f9869b;

        /* renamed from: c */
        public int f9870c;

        /* renamed from: d */
        public int f9871d;

        /* renamed from: e */
        public int f9872e;

        /* renamed from: f */
        public int f9873f;
    }

    /* renamed from: com.onedelhi.secure.bk$b */
    public interface C1790b {
        /* renamed from: a */
        void mo3259a(o60 o60, C1789a aVar);

        /* renamed from: b */
        void mo3260b();
    }

    public C1788bk(p60 p60) {
        this.f9859a = p60;
    }

    /* renamed from: a */
    public final boolean mo13742a(C1790b bVar, o60 o60, int i) {
        this.f9858a.f9865a = o60.mo21630H();
        this.f9858a.f9868b = o60.mo21714j0();
        this.f9858a.f9864a = o60.mo21723m0();
        this.f9858a.f9867b = o60.mo21619D();
        C1789a aVar = this.f9858a;
        aVar.f9869b = false;
        aVar.f9873f = i;
        o60.C3032b bVar2 = aVar.f9865a;
        o60.C3032b bVar3 = o60.C3032b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.f9868b == bVar3;
        boolean z3 = z && o60.f17783e > 0.0f;
        boolean z4 = z2 && o60.f17783e > 0.0f;
        if (z3 && o60.f17757a[0] == 4) {
            aVar.f9865a = o60.C3032b.FIXED;
        }
        if (z4 && o60.f17757a[1] == 4) {
            aVar.f9868b = o60.C3032b.FIXED;
        }
        bVar.mo3259a(o60, aVar);
        o60.mo21691c2(this.f9858a.f9870c);
        o60.mo21758y1(this.f9858a.f9871d);
        o60.mo21755x1(this.f9858a.f9866a);
        o60.mo21704g1(this.f9858a.f9872e);
        C1789a aVar2 = this.f9858a;
        aVar2.f9873f = C1789a.f9861g;
        return aVar2.f9869b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008e, code lost:
        if (r8 != r9) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0095, code lost:
        if (r5.f17783e <= 0.0f) goto L_0x0098;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13743b(com.onedelhi.secure.p60 r13) {
        /*
            r12 = this;
            java.util.ArrayList<com.onedelhi.secure.o60> r0 = r13.f10993b
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.mo22335S2(r1)
            com.onedelhi.secure.bk$b r2 = r13.mo22324G2()
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r4 >= r0) goto L_0x00b0
            java.util.ArrayList<com.onedelhi.secure.o60> r5 = r13.f10993b
            java.lang.Object r5 = r5.get(r4)
            com.onedelhi.secure.o60 r5 = (com.onedelhi.secure.o60) r5
            boolean r6 = r5 instanceof com.onedelhi.secure.nj1
            if (r6 == 0) goto L_0x0022
            goto L_0x00ac
        L_0x0022:
            boolean r6 = r5 instanceof com.onedelhi.secure.C2063ej
            if (r6 == 0) goto L_0x0028
            goto L_0x00ac
        L_0x0028:
            boolean r6 = r5.mo21623E0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00ac
        L_0x0030:
            if (r1 == 0) goto L_0x0048
            com.onedelhi.secure.ul1 r6 = r5.f17750a
            if (r6 == 0) goto L_0x0048
            com.onedelhi.secure.bt4 r7 = r5.f17746a
            if (r7 == 0) goto L_0x0048
            com.onedelhi.secure.cl0 r6 = r6.f12803a
            boolean r6 = r6.f22152c
            if (r6 == 0) goto L_0x0048
            com.onedelhi.secure.cl0 r6 = r7.f12803a
            boolean r6 = r6.f22152c
            if (r6 == 0) goto L_0x0048
            goto L_0x00ac
        L_0x0048:
            com.onedelhi.secure.o60$b r6 = r5.mo21759z(r3)
            r7 = 1
            com.onedelhi.secure.o60$b r8 = r5.mo21759z(r7)
            com.onedelhi.secure.o60$b r9 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0061
            int r10 = r5.f17788f
            if (r10 == r7) goto L_0x0061
            if (r8 != r9) goto L_0x0061
            int r10 = r5.f17792g
            if (r10 == r7) goto L_0x0061
            r10 = 1
            goto L_0x0062
        L_0x0061:
            r10 = 0
        L_0x0062:
            if (r10 != 0) goto L_0x0098
            boolean r11 = r13.mo22335S2(r7)
            if (r11 == 0) goto L_0x0098
            boolean r11 = r5 instanceof com.onedelhi.secure.dw4
            if (r11 != 0) goto L_0x0098
            if (r6 != r9) goto L_0x007d
            int r11 = r5.f17788f
            if (r11 != 0) goto L_0x007d
            if (r8 == r9) goto L_0x007d
            boolean r11 = r5.mo21614B0()
            if (r11 != 0) goto L_0x007d
            r10 = 1
        L_0x007d:
            if (r8 != r9) goto L_0x008c
            int r11 = r5.f17792g
            if (r11 != 0) goto L_0x008c
            if (r6 == r9) goto L_0x008c
            boolean r11 = r5.mo21614B0()
            if (r11 != 0) goto L_0x008c
            r10 = 1
        L_0x008c:
            if (r6 == r9) goto L_0x0090
            if (r8 != r9) goto L_0x0098
        L_0x0090:
            float r6 = r5.f17783e
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r7 = r10
        L_0x0099:
            if (r7 == 0) goto L_0x009c
            goto L_0x00ac
        L_0x009c:
            int r6 = com.onedelhi.secure.C1788bk.C1789a.f9861g
            r12.mo13742a(r2, r5, r6)
            com.onedelhi.secure.zi2 r5 = r13.f18387a
            if (r5 == 0) goto L_0x00ac
            long r6 = r5.f23684c
            r8 = 1
            long r6 = r6 + r8
            r5.f23684c = r6
        L_0x00ac:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00b0:
            r2.mo3260b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C1788bk.mo13743b(com.onedelhi.secure.p60):void");
    }

    /* renamed from: c */
    public final void mo13744c(p60 p60, String str, int i, int i2, int i3) {
        int Q = p60.mo21656Q();
        int P = p60.mo21653P();
        p60.mo21655P1(0);
        p60.mo21652O1(0);
        p60.mo21691c2(i2);
        p60.mo21758y1(i3);
        p60.mo21655P1(Q);
        p60.mo21652O1(P);
        this.f9859a.mo22340X2(i);
        this.f9859a.mo14935n2();
    }

    /* renamed from: d */
    public long mo13745d(p60 p60, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        int i11;
        int i12;
        boolean z2;
        C1790b bVar;
        int i13;
        int i14;
        int i15;
        boolean z3;
        zi2 zi2;
        p60 p602 = p60;
        int i16 = i;
        int i17 = i4;
        int i18 = i6;
        C1790b G2 = p60.mo22324G2();
        int size = p602.f10993b.size();
        int m0 = p60.mo21723m0();
        int D = p60.mo21619D();
        boolean b = mw2.m22047b(i16, 128);
        boolean z4 = b || mw2.m22047b(i16, 64);
        if (z4) {
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    break;
                }
                o60 o60 = p602.f10993b.get(i19);
                o60.C3032b H = o60.mo21630H();
                o60.C3032b bVar2 = o60.C3032b.MATCH_CONSTRAINT;
                boolean z5 = (H == bVar2) && (o60.mo21714j0() == bVar2) && o60.mo21610A() > 0.0f;
                if ((!o60.mo21614B0() || !z5) && ((!o60.mo21620D0() || !z5) && !(o60 instanceof dw4) && !o60.mo21614B0() && !o60.mo21620D0())) {
                    i19++;
                }
            }
            z4 = false;
        }
        if (z4 && (zi2 = p32.f18327a) != null) {
            zi2.f23686e++;
        }
        boolean z6 = z4 & ((i17 == 1073741824 && i18 == 1073741824) || b);
        if (z6) {
            int min = Math.min(p60.mo21650O(), i5);
            int min2 = Math.min(p60.mo21647N(), i7);
            if (i17 == 1073741824 && p60.mo21723m0() != min) {
                p602.mo21691c2(min);
                p60.mo22329L2();
            }
            if (i18 == 1073741824 && p60.mo21619D() != min2) {
                p602.mo21758y1(min2);
                p60.mo22329L2();
            }
            if (i17 == 1073741824 && i18 == 1073741824) {
                z = p602.mo22319B2(b);
                i10 = 2;
            } else {
                boolean C2 = p602.mo22320C2(b);
                if (i17 == 1073741824) {
                    C2 &= p602.mo22321D2(b, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i18 == 1073741824) {
                    z = p602.mo22321D2(b, 1) & C2;
                    i10++;
                } else {
                    z = C2;
                }
            }
            if (z) {
                p602.mo21712i2(i17 == 1073741824, i18 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0;
        }
        int H2 = p60.mo22325H2();
        if (size > 0) {
            mo13743b(p60);
        }
        mo13746e(p60);
        int size2 = this.f9860a.size();
        if (size > 0) {
            mo13744c(p60, "First pass", 0, m0, D);
        }
        if (size2 > 0) {
            o60.C3032b H3 = p60.mo21630H();
            o60.C3032b bVar3 = o60.C3032b.WRAP_CONTENT;
            boolean z7 = H3 == bVar3;
            boolean z8 = p60.mo21714j0() == bVar3;
            int max = Math.max(p60.mo21723m0(), this.f9859a.mo21656Q());
            int max2 = Math.max(p60.mo21619D(), this.f9859a.mo21653P());
            int i20 = 0;
            boolean z9 = false;
            while (i20 < size2) {
                o60 o602 = this.f9860a.get(i20);
                if (!(o602 instanceof dw4)) {
                    i13 = H2;
                    i14 = m0;
                    i15 = D;
                } else {
                    int m02 = o602.mo21723m0();
                    i13 = H2;
                    int D2 = o602.mo21619D();
                    i15 = D;
                    boolean a = mo13742a(G2, o602, C1789a.f9862h) | z9;
                    zi2 zi22 = p602.f18387a;
                    i14 = m0;
                    boolean z10 = a;
                    if (zi22 != null) {
                        zi22.f23685d++;
                    }
                    int m03 = o602.mo21723m0();
                    int D3 = o602.mo21619D();
                    if (m03 != m02) {
                        o602.mo21691c2(m03);
                        if (z7 && o602.mo21674X() > max) {
                            max = Math.max(max, o602.mo21674X() + o602.mo21327r(m60.C2835b.RIGHT).mo20112g());
                        }
                        z3 = true;
                    } else {
                        z3 = z10;
                    }
                    if (D3 != D2) {
                        o602.mo21758y1(D3);
                        if (z8 && o602.mo21747v() > max2) {
                            max2 = Math.max(max2, o602.mo21747v() + o602.mo21327r(m60.C2835b.BOTTOM).mo20112g());
                        }
                        z3 = true;
                    }
                    z9 = z3 | ((dw4) o602).mo14921y2();
                }
                i20++;
                H2 = i13;
                D = i15;
                m0 = i14;
            }
            int i21 = H2;
            int i22 = m0;
            int i23 = D;
            int i24 = 0;
            int i25 = 2;
            while (i24 < i25) {
                int i26 = 0;
                while (i26 < size2) {
                    o60 o603 = this.f9860a.get(i26);
                    if ((!(o603 instanceof jl1) || (o603 instanceof dw4)) && !(o603 instanceof nj1) && o603.mo21720l0() != 8 && ((!z6 || !o603.f17750a.f12803a.f22152c || !o603.f17746a.f12803a.f22152c) && !(o603 instanceof dw4))) {
                        int m04 = o603.mo21723m0();
                        int D4 = o603.mo21619D();
                        int t = o603.mo21741t();
                        int i27 = C1789a.f9862h;
                        z2 = z6;
                        if (i24 == 1) {
                            i27 = C1789a.f9863i;
                        }
                        boolean a2 = mo13742a(G2, o603, i27) | z9;
                        zi2 zi23 = p602.f18387a;
                        i12 = size2;
                        bVar = G2;
                        if (zi23 != null) {
                            zi23.f23685d++;
                        }
                        int m05 = o603.mo21723m0();
                        int D5 = o603.mo21619D();
                        if (m05 != m04) {
                            o603.mo21691c2(m05);
                            if (z7 && o603.mo21674X() > max) {
                                max = Math.max(max, o603.mo21674X() + o603.mo21327r(m60.C2835b.RIGHT).mo20112g());
                            }
                            a2 = true;
                        }
                        if (D5 != D4) {
                            o603.mo21758y1(D5);
                            if (z8 && o603.mo21747v() > max2) {
                                max2 = Math.max(max2, o603.mo21747v() + o603.mo21327r(m60.C2835b.BOTTOM).mo20112g());
                            }
                            a2 = true;
                        }
                        z9 = (!o603.mo21734q0() || t == o603.mo21741t()) ? a2 : true;
                    } else {
                        z2 = z6;
                        i12 = size2;
                        bVar = G2;
                    }
                    i26++;
                    G2 = bVar;
                    z6 = z2;
                    size2 = i12;
                }
                boolean z11 = z6;
                int i28 = size2;
                C1790b bVar4 = G2;
                if (!z9) {
                    break;
                }
                i24++;
                mo13744c(p60, "intermediate pass", i24, i22, i23);
                G2 = bVar4;
                z6 = z11;
                size2 = i28;
                i25 = 2;
                z9 = false;
            }
            i11 = i21;
        } else {
            i11 = H2;
        }
        p602.mo22338V2(i11);
        return 0;
    }

    /* renamed from: e */
    public void mo13746e(p60 p60) {
        this.f9860a.clear();
        int size = p60.f10993b.size();
        for (int i = 0; i < size; i++) {
            o60 o60 = p60.f10993b.get(i);
            o60.C3032b H = o60.mo21630H();
            o60.C3032b bVar = o60.C3032b.MATCH_CONSTRAINT;
            if (H == bVar || o60.mo21714j0() == bVar) {
                this.f9860a.add(o60);
            }
        }
        p60.mo22329L2();
    }
}

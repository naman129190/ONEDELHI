package com.onedelhi.secure;

import com.onedelhi.secure.c22;
import com.onedelhi.secure.f21;
import com.onedelhi.secure.wx4;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public final class ci2<T> implements xr3<T> {

    /* renamed from: a */
    public final ao4<?, ?> f26760a;

    /* renamed from: a */
    public final az0<?> f26761a;

    /* renamed from: a */
    public final yh2 f26762a;

    /* renamed from: a */
    public final boolean f26763a;

    public ci2(ao4<?, ?> ao4, az0<?> az0, yh2 yh2) {
        this.f26760a = ao4;
        this.f26763a = az0.mo31264e(yh2);
        this.f26761a = az0;
        this.f26762a = yh2;
    }

    /* renamed from: m */
    public static <T> ci2<T> m40981m(ao4<?, ?> ao4, az0<?> az0, yh2 yh2) {
        return new ci2<>(ao4, az0, yh2);
    }

    /* renamed from: a */
    public void mo31760a(T t, T t2) {
        gs3.m49731J(this.f26760a, t, t2);
        if (this.f26763a) {
            gs3.m49729H(this.f26761a, t, t2);
        }
    }

    /* renamed from: b */
    public int mo31761b(T t) {
        int hashCode = this.f26760a.mo31095g(t).hashCode();
        return this.f26763a ? (hashCode * 53) + this.f26761a.mo31262c(t).hashCode() : hashCode;
    }

    /* renamed from: c */
    public boolean mo31762c(T t, T t2) {
        if (!this.f26760a.mo31095g(t).equals(this.f26760a.mo31095g(t2))) {
            return false;
        }
        if (this.f26763a) {
            return this.f26761a.mo31262c(t).equals(this.f26761a.mo31262c(t2));
        }
        return true;
    }

    /* renamed from: d */
    public void mo31764d(T t, ty4 ty4) throws IOException {
        Iterator<Map.Entry<?, Object>> H = this.f26761a.mo31262c(t).mo35720H();
        while (H.hasNext()) {
            Map.Entry next = H.next();
            f21.C5210c cVar = (f21.C5210c) next.getKey();
            if (cVar.mo35765k() != wx4.C7200c.MESSAGE || cVar.mo35766m() || cVar.mo35763i()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            ty4.mo38356q(cVar.mo35764j(), next instanceof c22.C4725b ? ((c22.C4725b) next).mo32218a().mo34159n() : next.getValue());
        }
        mo32384o(this.f26760a, t, ty4);
    }

    /* renamed from: e */
    public int mo31766e(T t) {
        int k = mo32381k(this.f26760a, t) + 0;
        return this.f26763a ? k + this.f26761a.mo31262c(t).mo35740v() : k;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.onedelhi.secure.qe1$h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31768f(T r11, byte[] r12, int r13, int r14, com.onedelhi.secure.C4992da.C4994b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.onedelhi.secure.qe1 r0 = (com.onedelhi.secure.qe1) r0
            com.onedelhi.secure.bo4 r1 = r0.unknownFields
            com.onedelhi.secure.bo4 r2 = com.onedelhi.secure.bo4.m40221c()
            if (r1 != r2) goto L_0x0011
            com.onedelhi.secure.bo4 r1 = com.onedelhi.secure.bo4.m40225n()
            r0.unknownFields = r1
        L_0x0011:
            com.onedelhi.secure.qe1$e r11 = (com.onedelhi.secure.qe1.C6549e) r11
            com.onedelhi.secure.f21 r11 = r11.mo43410gk()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = com.onedelhi.secure.C4992da.m44912I(r12, r13, r15)
            int r13 = r15.f27351a
            int r3 = com.onedelhi.secure.wx4.f37178q
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = com.onedelhi.secure.wx4.m69699b(r13)
            if (r3 != r5) goto L_0x0066
            com.onedelhi.secure.az0<?> r2 = r10.f26761a
            com.onedelhi.secure.zy0 r3 = r15.f27353a
            com.onedelhi.secure.yh2 r5 = r10.f26762a
            int r6 = com.onedelhi.secure.wx4.m69698a(r13)
            java.lang.Object r2 = r2.mo31261b(r3, r5, r6)
            r8 = r2
            com.onedelhi.secure.qe1$h r8 = (com.onedelhi.secure.qe1.C6553h) r8
            if (r8 == 0) goto L_0x005b
            com.onedelhi.secure.p63 r13 = com.onedelhi.secure.p63.m60498a()
            com.onedelhi.secure.yh2 r2 = r8.mo43427c()
            java.lang.Class r2 = r2.getClass()
            com.onedelhi.secure.xr3 r13 = r13.mo42385i(r2)
            int r13 = com.onedelhi.secure.C4992da.m44933p(r13, r12, r4, r14, r15)
            com.onedelhi.secure.qe1$g r2 = r8.f34080a
            java.lang.Object r3 = r15.f27354a
            r11.mo35724O(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.onedelhi.secure.C4992da.m44910G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = com.onedelhi.secure.C4992da.m44917N(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = com.onedelhi.secure.C4992da.m44912I(r12, r4, r15)
            int r6 = r15.f27351a
            int r7 = com.onedelhi.secure.wx4.m69698a(r6)
            int r8 = com.onedelhi.secure.wx4.m69699b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            com.onedelhi.secure.p63 r6 = com.onedelhi.secure.p63.m60498a()
            com.onedelhi.secure.yh2 r7 = r2.mo43427c()
            java.lang.Class r7 = r7.getClass()
            com.onedelhi.secure.xr3 r6 = r6.mo42385i(r7)
            int r4 = com.onedelhi.secure.C4992da.m44933p(r6, r12, r4, r14, r15)
            com.onedelhi.secure.qe1$g r6 = r2.f34080a
            java.lang.Object r7 = r15.f27354a
            r11.mo35724O(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = com.onedelhi.secure.C4992da.m44919b(r12, r4, r15)
            java.lang.Object r3 = r15.f27354a
            com.onedelhi.secure.er r3 = (com.onedelhi.secure.C5173er) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = com.onedelhi.secure.C4992da.m44912I(r12, r4, r15)
            int r13 = r15.f27351a
            com.onedelhi.secure.az0<?> r2 = r10.f26761a
            com.onedelhi.secure.zy0 r6 = r15.f27353a
            com.onedelhi.secure.yh2 r7 = r10.f26762a
            java.lang.Object r2 = r2.mo31261b(r6, r7, r13)
            com.onedelhi.secure.qe1$h r2 = (com.onedelhi.secure.qe1.C6553h) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = com.onedelhi.secure.wx4.f37179r
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = com.onedelhi.secure.C4992da.m44917N(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = com.onedelhi.secure.wx4.m69700c(r13, r5)
            r1.mo31970q(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            com.onedelhi.secure.nt1 r11 = com.onedelhi.secure.nt1.m58788i()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ci2.mo31768f(java.lang.Object, byte[], int, int, com.onedelhi.secure.da$b):void");
    }

    /* renamed from: g */
    public T mo31770g() {
        return this.f26762a.mo43350V8().mo43377Ja();
    }

    /* renamed from: h */
    public final boolean mo31772h(T t) {
        return this.f26761a.mo31262c(t).mo35719E();
    }

    /* renamed from: i */
    public void mo31774i(T t) {
        this.f26760a.mo31098j(t);
        this.f26761a.mo31265f(t);
    }

    /* renamed from: j */
    public void mo31776j(T t, vf3 vf3, zy0 zy0) throws IOException {
        mo32382l(this.f26760a, this.f26761a, t, vf3, zy0);
    }

    /* renamed from: k */
    public final <UT, UB> int mo32381k(ao4<UT, UB> ao4, T t) {
        return ao4.mo31097i(ao4.mo31095g(t));
    }

    /* renamed from: l */
    public final <UT, UB, ET extends f21.C5210c<ET>> void mo32382l(ao4<UT, UB> ao4, az0<ET> az0, T t, vf3 vf3, zy0 zy0) throws IOException {
        UB f = ao4.mo31094f(t);
        f21<ET> d = az0.mo31263d(t);
        do {
            try {
                if (vf3.mo36994C() == Integer.MAX_VALUE) {
                    ao4.mo31103o(t, f);
                    return;
                }
            } finally {
                ao4.mo31103o(t, f);
            }
        } while (mo32383n(vf3, zy0, az0, d, ao4, f));
    }

    /* renamed from: n */
    public final <UT, UB, ET extends f21.C5210c<ET>> boolean mo32383n(vf3 vf3, zy0 zy0, az0<ET> az0, f21<ET> f21, ao4<UT, UB> ao4, UB ub) throws IOException {
        int y = vf3.mo37045y();
        if (y == wx4.f37178q) {
            int i = 0;
            Object obj = null;
            C5173er erVar = null;
            while (vf3.mo36994C() != Integer.MAX_VALUE) {
                int y2 = vf3.mo37045y();
                if (y2 == wx4.f37180s) {
                    i = vf3.mo37032n();
                    obj = az0.mo31261b(zy0, this.f26762a, i);
                } else if (y2 == wx4.f37181t) {
                    if (obj != null) {
                        az0.mo31267h(vf3, obj, zy0, f21);
                    } else {
                        erVar = vf3.mo37007P();
                    }
                } else if (!vf3.mo37027i()) {
                    break;
                }
            }
            if (vf3.mo37045y() == wx4.f37179r) {
                if (erVar != null) {
                    if (obj != null) {
                        az0.mo31268i(erVar, obj, zy0, f21);
                    } else {
                        ao4.mo31092d(ub, i, erVar);
                    }
                }
                return true;
            }
            throw nt1.m58782c();
        } else if (wx4.m69699b(y) != 2) {
            return vf3.mo37027i();
        } else {
            Object b = az0.mo31261b(zy0, this.f26762a, wx4.m69698a(y));
            if (b == null) {
                return ao4.mo31101m(ub, vf3);
            }
            az0.mo31267h(vf3, b, zy0, f21);
            return true;
        }
    }

    /* renamed from: o */
    public final <UT, UB> void mo32384o(ao4<UT, UB> ao4, T t, ty4 ty4) throws IOException {
        ao4.mo31107s(ao4.mo31095g(t), ty4);
    }
}

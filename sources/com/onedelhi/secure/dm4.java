package com.onedelhi.secure;

import java.util.Map;

public final class dm4 extends im4 {

    /* renamed from: a */
    public final im4 f27503a = new tq0();

    /* renamed from: s */
    public static ol3 m45367s(ol3 ol3) throws ha1 {
        String g = ol3.mo41829g();
        if (g.charAt(0) == '0') {
            ol3 ol32 = new ol3(g.substring(1), (byte[]) null, ol3.mo41828f(), C7363yi.UPC_A);
            if (ol3.mo41827e() != null) {
                ol32.mo41831i(ol3.mo41827e());
            }
            return ol32;
        }
        throw ha1.m50341a();
    }

    /* renamed from: a */
    public ol3 mo34501a(C6969uk ukVar) throws tr2, ha1 {
        return m45367s(this.f27503a.mo34501a(ukVar));
    }

    /* renamed from: b */
    public ol3 mo34502b(C6969uk ukVar, Map<pf0, ?> map) throws tr2, ha1 {
        return m45367s(this.f27503a.mo34502b(ukVar, map));
    }

    /* renamed from: c */
    public ol3 mo31296c(int i, C6014ll llVar, Map<pf0, ?> map) throws tr2, ha1, C6619qx {
        return m45367s(this.f27503a.mo31296c(i, llVar, map));
    }

    /* renamed from: l */
    public int mo34503l(C6014ll llVar, int[] iArr, StringBuilder sb) throws tr2 {
        return this.f27503a.mo34503l(llVar, iArr, sb);
    }

    /* renamed from: m */
    public ol3 mo34504m(int i, C6014ll llVar, int[] iArr, Map<pf0, ?> map) throws tr2, ha1, C6619qx {
        return m45367s(this.f27503a.mo34504m(i, llVar, iArr, map));
    }

    /* renamed from: q */
    public C7363yi mo34505q() {
        return C7363yi.UPC_A;
    }
}

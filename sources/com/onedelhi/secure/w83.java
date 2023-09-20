package com.onedelhi.secure;

import java.util.List;
import java.util.Map;

public class w83 implements uf3 {

    /* renamed from: a */
    public static final sl3[] f36927a = new sl3[0];

    /* renamed from: a */
    public final dg0 f36928a = new dg0();

    /* renamed from: e */
    public static C6190nl m69223e(C6190nl nlVar) throws tr2 {
        int[] k = nlVar.mo41093k();
        int[] f = nlVar.mo41087f();
        if (k == null || f == null) {
            throw tr2.m66179a();
        }
        float g = m69224g(k, nlVar);
        int i = k[1];
        int i2 = f[1];
        int i3 = k[0];
        int i4 = f[0];
        if (i3 >= i4 || i >= i2) {
            throw tr2.m66179a();
        }
        int i5 = i2 - i;
        if (i5 == i4 - i3 || (i4 = i3 + i5) < nlVar.mo41094l()) {
            int round = Math.round(((float) ((i4 - i3) + 1)) / g);
            int round2 = Math.round(((float) (i5 + 1)) / g);
            if (round <= 0 || round2 <= 0) {
                throw tr2.m66179a();
            } else if (round2 == round) {
                int i6 = (int) (g / 2.0f);
                int i7 = i + i6;
                int i8 = i3 + i6;
                int i9 = (((int) (((float) (round - 1)) * g)) + i8) - i4;
                if (i9 > 0) {
                    if (i9 <= i6) {
                        i8 -= i9;
                    } else {
                        throw tr2.m66179a();
                    }
                }
                int i10 = (((int) (((float) (round2 - 1)) * g)) + i7) - i2;
                if (i10 > 0) {
                    if (i10 <= i6) {
                        i7 -= i10;
                    } else {
                        throw tr2.m66179a();
                    }
                }
                C6190nl nlVar2 = new C6190nl(round, round2);
                for (int i11 = 0; i11 < round2; i11++) {
                    int i12 = ((int) (((float) i11) * g)) + i7;
                    for (int i13 = 0; i13 < round; i13++) {
                        if (nlVar.mo41085e(((int) (((float) i13) * g)) + i8, i12)) {
                            nlVar2.mo41096p(i13, i11);
                        }
                    }
                }
                return nlVar2;
            } else {
                throw tr2.m66179a();
            }
        } else {
            throw tr2.m66179a();
        }
    }

    /* renamed from: g */
    public static float m69224g(int[] iArr, C6190nl nlVar) throws tr2 {
        int h = nlVar.mo41089h();
        int l = nlVar.mo41094l();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < l && i2 < h) {
            if (z != nlVar.mo41085e(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != l && i2 != h) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw tr2.m66179a();
    }

    /* renamed from: a */
    public ol3 mo34501a(C6969uk ukVar) throws tr2, C6619qx, ha1 {
        return mo34502b(ukVar, (Map<pf0, ?>) null);
    }

    /* renamed from: b */
    public final ol3 mo34502b(C6969uk ukVar, Map<pf0, ?> map) throws tr2, C6619qx, ha1 {
        sl3[] sl3Arr;
        gg0 gg0;
        if (map == null || !map.containsKey(pf0.PURE_BARCODE)) {
            nk0 f = new mk0(ukVar.mo45634b()).mo40686f(map);
            gg0 c = this.f36928a.mo34412c(f.mo41078a(), map);
            sl3Arr = f.mo41079b();
            gg0 = c;
        } else {
            gg0 = this.f36928a.mo34412c(m69223e(ukVar.mo45634b()), map);
            sl3Arr = f36927a;
        }
        if (gg0.mo36722f() instanceof u83) {
            ((u83) gg0.mo36722f()).mo45538a(sl3Arr);
        }
        ol3 ol3 = new ol3(gg0.mo36726j(), gg0.mo36723g(), sl3Arr, C7363yi.QR_CODE);
        List<byte[]> a = gg0.mo36717a();
        if (a != null) {
            ol3.mo41832j(ql3.BYTE_SEGMENTS, a);
        }
        String b = gg0.mo36718b();
        if (b != null) {
            ol3.mo41832j(ql3.ERROR_CORRECTION_LEVEL, b);
        }
        if (gg0.mo36727k()) {
            ol3.mo41832j(ql3.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(gg0.mo36725i()));
            ol3.mo41832j(ql3.STRUCTURED_APPEND_PARITY, Integer.valueOf(gg0.mo36724h()));
        }
        return ol3;
    }

    /* renamed from: f */
    public final dg0 mo46646f() {
        return this.f36928a;
    }

    public void reset() {
    }
}

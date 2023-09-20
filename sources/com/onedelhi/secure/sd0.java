package com.onedelhi.secure;

import java.util.List;
import java.util.Map;

public final class sd0 implements uf3 {

    /* renamed from: a */
    public static final sl3[] f34975a = new sl3[0];

    /* renamed from: a */
    public final bg0 f34976a = new bg0();

    /* renamed from: c */
    public static C6190nl m64457c(C6190nl nlVar) throws tr2 {
        int[] k = nlVar.mo41093k();
        int[] f = nlVar.mo41087f();
        if (k == null || f == null) {
            throw tr2.m66179a();
        }
        int d = m64458d(k, nlVar);
        int i = k[1];
        int i2 = f[1];
        int i3 = k[0];
        int i4 = ((f[0] - i3) + 1) / d;
        int i5 = ((i2 - i) + 1) / d;
        if (i4 <= 0 || i5 <= 0) {
            throw tr2.m66179a();
        }
        int i6 = d / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        C6190nl nlVar2 = new C6190nl(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * d) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (nlVar.mo41085e((i11 * d) + i8, i10)) {
                    nlVar2.mo41096p(i11, i9);
                }
            }
        }
        return nlVar2;
    }

    /* renamed from: d */
    public static int m64458d(int[] iArr, C6190nl nlVar) throws tr2 {
        int l = nlVar.mo41094l();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < l && nlVar.mo41085e(i, i2)) {
            i++;
        }
        if (i != l) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw tr2.m66179a();
        }
        throw tr2.m66179a();
    }

    /* renamed from: a */
    public ol3 mo34501a(C6969uk ukVar) throws tr2, C6619qx, ha1 {
        return mo34502b(ukVar, (Map<pf0, ?>) null);
    }

    /* renamed from: b */
    public ol3 mo34502b(C6969uk ukVar, Map<pf0, ?> map) throws tr2, C6619qx, ha1 {
        sl3[] sl3Arr;
        gg0 gg0;
        if (map == null || !map.containsKey(pf0.PURE_BARCODE)) {
            nk0 b = new kk0(ukVar.mo45634b()).mo39272b();
            gg0 b2 = this.f34976a.mo31664b(b.mo41078a());
            sl3Arr = b.mo41079b();
            gg0 = b2;
        } else {
            gg0 = this.f34976a.mo31664b(m64457c(ukVar.mo45634b()));
            sl3Arr = f34975a;
        }
        ol3 ol3 = new ol3(gg0.mo36726j(), gg0.mo36723g(), sl3Arr, C7363yi.DATA_MATRIX);
        List<byte[]> a = gg0.mo36717a();
        if (a != null) {
            ol3.mo41832j(ql3.BYTE_SEGMENTS, a);
        }
        String b3 = gg0.mo36718b();
        if (b3 != null) {
            ol3.mo41832j(ql3.ERROR_CORRECTION_LEVEL, b3);
        }
        return ol3;
    }

    public void reset() {
    }
}

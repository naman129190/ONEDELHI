package com.onedelhi.secure;

import java.util.Map;

public final class ud0 implements uy4 {
    /* renamed from: c */
    public static C6190nl m66948c(C7512zq zqVar, int i, int i2) {
        C6190nl nlVar;
        int e = zqVar.mo48429e();
        int d = zqVar.mo48428d();
        int max = Math.max(i, e);
        int max2 = Math.max(i2, d);
        int min = Math.min(max / e, max2 / d);
        int i3 = (max - (e * min)) / 2;
        int i4 = (max2 - (d * min)) / 2;
        if (i2 < d || i < e) {
            nlVar = new C6190nl(e, d);
            i3 = 0;
            i4 = 0;
        } else {
            nlVar = new C6190nl(i, i2);
        }
        nlVar.mo41081b();
        int i5 = 0;
        while (i5 < d) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < e) {
                if (zqVar.mo48426b(i7, i5) == 1) {
                    nlVar.mo41097q(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return nlVar;
    }

    /* renamed from: d */
    public static C6190nl m66949d(lh0 lh0, m84 m84, int i, int i2) {
        int i3 = m84.mo40518i();
        int h = m84.mo40517h();
        C7512zq zqVar = new C7512zq(m84.mo40520k(), m84.mo40519j());
        int i4 = 0;
        for (int i5 = 0; i5 < h; i5++) {
            if (i5 % m84.f32061d == 0) {
                int i6 = 0;
                for (int i7 = 0; i7 < m84.mo40520k(); i7++) {
                    zqVar.mo48432h(i6, i4, i7 % 2 == 0);
                    i6++;
                }
                i4++;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < i3; i9++) {
                if (i9 % m84.f32060c == 0) {
                    zqVar.mo48432h(i8, i4, true);
                    i8++;
                }
                zqVar.mo48432h(i8, i4, lh0.mo39857e(i9, i5));
                i8++;
                int i10 = m84.f32060c;
                if (i9 % i10 == i10 - 1) {
                    zqVar.mo48432h(i8, i4, i5 % 2 == 0);
                    i8++;
                }
            }
            i4++;
            int i11 = m84.f32061d;
            if (i5 % i11 == i11 - 1) {
                int i12 = 0;
                for (int i13 = 0; i13 < m84.mo40520k(); i13++) {
                    zqVar.mo48432h(i12, i4, true);
                    i12++;
                }
                i4++;
            }
        }
        return m66948c(zqVar, i, i2);
    }

    /* renamed from: a */
    public C6190nl mo35510a(String str, C7363yi yiVar, int i, int i2) {
        return mo35511b(str, yiVar, i, i2, (Map<ut0, ?>) null);
    }

    /* renamed from: b */
    public C6190nl mo35511b(String str, C7363yi yiVar, int i, int i2, Map<ut0, ?> map) {
        bl0 bl0;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (yiVar != C7363yi.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(yiVar)));
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        } else {
            n84 n84 = n84.FORCE_NONE;
            bl0 bl02 = null;
            if (map != null) {
                n84 n842 = (n84) map.get(ut0.DATA_MATRIX_SHAPE);
                if (n842 != null) {
                    n84 = n842;
                }
                bl0 bl03 = (bl0) map.get(ut0.MIN_SIZE);
                if (bl03 == null) {
                    bl03 = null;
                }
                bl0 = (bl0) map.get(ut0.MAX_SIZE);
                if (bl0 == null) {
                    bl0 = null;
                }
                bl02 = bl03;
            } else {
                bl0 = null;
            }
            String c = ql1.m63038c(str, n84, bl02, bl0);
            m84 o = m84.m56971o(c.length(), n84, bl02, bl0, true);
            lh0 lh0 = new lh0(jv0.m53862b(c, o), o.mo40518i(), o.mo40517h());
            lh0.mo39863k();
            return m66949d(lh0, o, i, i2);
        }
    }
}

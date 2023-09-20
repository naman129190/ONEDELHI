package com.onedelhi.secure;

import java.util.Map;

public final class x83 implements uy4 {

    /* renamed from: a */
    public static final int f37370a = 4;

    /* renamed from: c */
    public static C6190nl m70105c(t83 t83, int i, int i2, int i3) {
        C7512zq c = t83.mo44937c();
        if (c != null) {
            int e = c.mo48429e();
            int d = c.mo48428d();
            int i4 = i3 << 1;
            int i5 = e + i4;
            int i6 = i4 + d;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (e * min)) / 2;
            int i8 = (max2 - (d * min)) / 2;
            C6190nl nlVar = new C6190nl(max, max2);
            int i9 = 0;
            while (i9 < d) {
                int i10 = i7;
                int i11 = 0;
                while (i11 < e) {
                    if (c.mo48426b(i11, i9) == 1) {
                        nlVar.mo41097q(i10, i8, min, min);
                    }
                    i11++;
                    i10 += min;
                }
                i9++;
                i8 += min;
            }
            return nlVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C6190nl mo35510a(String str, C7363yi yiVar, int i, int i2) throws vy4 {
        return mo35511b(str, yiVar, i, i2, (Map<ut0, ?>) null);
    }

    /* renamed from: b */
    public C6190nl mo35511b(String str, C7363yi yiVar, int i, int i2, Map<ut0, ?> map) throws vy4 {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (yiVar != C7363yi.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(yiVar)));
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            kv0 kv0 = kv0.L;
            int i3 = 4;
            if (map != null) {
                ut0 ut0 = ut0.ERROR_CORRECTION;
                if (map.containsKey(ut0)) {
                    kv0 = kv0.valueOf(map.get(ut0).toString());
                }
                ut0 ut02 = ut0.MARGIN;
                if (map.containsKey(ut02)) {
                    i3 = Integer.parseInt(map.get(ut02).toString());
                }
            }
            return m70105c(bu0.m40393p(str, kv0, map), i, i2, i3);
        }
    }
}

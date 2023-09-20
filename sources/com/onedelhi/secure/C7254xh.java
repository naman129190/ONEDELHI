package com.onedelhi.secure;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* renamed from: com.onedelhi.secure.xh */
public final class C7254xh implements uy4 {
    /* renamed from: c */
    public static C6190nl m70271c(String str, C7363yi yiVar, int i, int i2, Charset charset, int i3, int i4) {
        if (yiVar == C7363yi.AZTEC) {
            return m70272d(zt0.m74290e(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(yiVar)));
    }

    /* renamed from: d */
    public static C6190nl m70272d(C6966uh uhVar, int i, int i2) {
        C6190nl c = uhVar.mo45588c();
        if (c != null) {
            int l = c.mo41094l();
            int h = c.mo41089h();
            int max = Math.max(i, l);
            int max2 = Math.max(i2, h);
            int min = Math.min(max / l, max2 / h);
            int i3 = (max - (l * min)) / 2;
            int i4 = (max2 - (h * min)) / 2;
            C6190nl nlVar = new C6190nl(max, max2);
            int i5 = 0;
            while (i5 < h) {
                int i6 = i3;
                int i7 = 0;
                while (i7 < l) {
                    if (c.mo41085e(i7, i5)) {
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
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C6190nl mo35510a(String str, C7363yi yiVar, int i, int i2) {
        return mo35511b(str, yiVar, i, i2, (Map<ut0, ?>) null);
    }

    /* renamed from: b */
    public C6190nl mo35511b(String str, C7363yi yiVar, int i, int i2, Map<ut0, ?> map) {
        int i3;
        int i4;
        Charset charset;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        int i5 = 33;
        if (map != null) {
            ut0 ut0 = ut0.CHARACTER_SET;
            if (map.containsKey(ut0)) {
                charset2 = Charset.forName(map.get(ut0).toString());
            }
            ut0 ut02 = ut0.ERROR_CORRECTION;
            if (map.containsKey(ut02)) {
                i5 = Integer.parseInt(map.get(ut02).toString());
            }
            ut0 ut03 = ut0.AZTEC_LAYERS;
            if (map.containsKey(ut03)) {
                charset = charset2;
                i4 = i5;
                i3 = Integer.parseInt(map.get(ut03).toString());
                return m70271c(str, yiVar, i, i2, charset, i4, i3);
            }
            charset = charset2;
            i4 = i5;
        } else {
            charset = charset2;
            i4 = 33;
        }
        i3 = 0;
        return m70271c(str, yiVar, i, i2, charset, i4, i3);
    }
}

package com.onedelhi.secure;

import java.util.Collection;
import java.util.Collections;

public final class uq0 extends jm4 {

    /* renamed from: a */
    public static final int f36228a = 95;

    /* renamed from: e */
    public boolean[] mo30374e(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + im4.m52457r(str);
            } catch (ha1 e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!im4.m52452i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (ha1 unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        sv2.m64913d(str);
        int i = tq0.f35759e[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int c = sv2.m64912c(zArr, 0, im4.f30361a, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            c += sv2.m64912c(zArr, c, im4.f30365b[digit], false);
        }
        int c2 = c + sv2.m64912c(zArr, c, im4.f30364b, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            c2 += sv2.m64912c(zArr, c2, im4.f30362a[Character.digit(str.charAt(i3), 10)], true);
        }
        sv2.m64912c(zArr, c2, im4.f30361a, true);
        return zArr;
    }

    /* renamed from: g */
    public Collection<C7363yi> mo30375g() {
        return Collections.singleton(C7363yi.EAN_13);
    }
}

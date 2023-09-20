package com.onedelhi.secure;

import java.util.Collection;
import java.util.Collections;

public final class lm4 extends jm4 {

    /* renamed from: a */
    public static final int f31730a = 51;

    /* renamed from: e */
    public boolean[] mo30374e(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + im4.m52457r(km4.m54566s(str));
            } catch (ha1 e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!im4.m52452i(km4.m54566s(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (ha1 unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        sv2.m64913d(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i = km4.f31255c[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int c = sv2.m64912c(zArr, 0, im4.f30361a, true);
            for (int i2 = 1; i2 <= 6; i2++) {
                int digit2 = Character.digit(str.charAt(i2), 10);
                if (((i >> (6 - i2)) & 1) == 1) {
                    digit2 += 10;
                }
                c += sv2.m64912c(zArr, c, im4.f30365b[digit2], false);
            }
            sv2.m64912c(zArr, c, im4.f30366c, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }

    /* renamed from: g */
    public Collection<C7363yi> mo30375g() {
        return Collections.singleton(C7363yi.UPC_E);
    }
}

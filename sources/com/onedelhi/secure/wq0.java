package com.onedelhi.secure;

import java.util.Collection;
import java.util.Collections;

public final class wq0 extends jm4 {

    /* renamed from: a */
    public static final int f37086a = 67;

    /* renamed from: e */
    public boolean[] mo30374e(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + im4.m52457r(str);
            } catch (ha1 e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!im4.m52452i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (ha1 unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        sv2.m64913d(str);
        boolean[] zArr = new boolean[67];
        int c = sv2.m64912c(zArr, 0, im4.f30361a, true) + 0;
        for (int i = 0; i <= 3; i++) {
            c += sv2.m64912c(zArr, c, im4.f30362a[Character.digit(str.charAt(i), 10)], false);
        }
        int c2 = c + sv2.m64912c(zArr, c, im4.f30364b, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            c2 += sv2.m64912c(zArr, c2, im4.f30362a[Character.digit(str.charAt(i2), 10)], true);
        }
        sv2.m64912c(zArr, c2, im4.f30361a, true);
        return zArr;
    }

    /* renamed from: g */
    public Collection<C7363yi> mo30375g() {
        return Collections.singleton(C7363yi.EAN_8);
    }
}

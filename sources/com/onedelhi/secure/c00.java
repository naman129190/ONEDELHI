package com.onedelhi.secure;

import java.util.Collection;
import java.util.Collections;

public class c00 extends sv2 {
    @Deprecated
    /* renamed from: c */
    public static int m40642c(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
        return 9;
    }

    /* renamed from: i */
    public static int m40643i(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
        return 9;
    }

    /* renamed from: j */
    public static int m40644j(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += b00.f26081a.indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    /* renamed from: k */
    public static String m40645k(String str) {
        int i;
        String str2;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 0) {
                str2 = "bU";
            } else {
                if (charAt <= 26) {
                    sb.append('a');
                    i = (charAt + 'A') - 1;
                } else if (charAt <= 31) {
                    sb.append('b');
                    i = (charAt + 'A') - 27;
                } else {
                    if (!(charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+')) {
                        if (charAt <= ',') {
                            sb.append('c');
                            i = (charAt + 'A') - 33;
                        } else if (charAt > '9') {
                            if (charAt == ':') {
                                str2 = "cZ";
                            } else if (charAt <= '?') {
                                sb.append('b');
                                i = (charAt + 'F') - 59;
                            } else if (charAt == '@') {
                                str2 = "bV";
                            } else if (charAt > 'Z') {
                                if (charAt <= '_') {
                                    sb.append('b');
                                    i = (charAt + 'K') - 91;
                                } else if (charAt == '`') {
                                    str2 = "bW";
                                } else if (charAt <= 'z') {
                                    sb.append('d');
                                    i = (charAt + 'A') - 97;
                                } else if (charAt <= 127) {
                                    sb.append('b');
                                    i = (charAt + 'P') - 123;
                                } else {
                                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
                                }
                            }
                        }
                    }
                    sb.append(charAt);
                }
                charAt = (char) i;
                sb.append(charAt);
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public boolean[] mo30374e(String str) {
        String k = m40645k(str);
        int length = k.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[(((k.length() + 2 + 2) * 9) + 1)];
            int i = m40643i(zArr, 0, b00.f26080a);
            for (int i2 = 0; i2 < length; i2++) {
                i += m40643i(zArr, i, b00.f26083b[b00.f26081a.indexOf(k.charAt(i2))]);
            }
            int j = m40644j(k, 20);
            int[] iArr = b00.f26083b;
            int i3 = i + m40643i(zArr, i, iArr[j]);
            int i4 = i3 + m40643i(zArr, i3, iArr[m40644j(k + b00.f26081a.charAt(j), 15)]);
            zArr[i4 + m40643i(zArr, i4, b00.f26080a)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length)));
    }

    /* renamed from: g */
    public Collection<C7363yi> mo30375g() {
        return Collections.singleton(C7363yi.CODE_93);
    }
}

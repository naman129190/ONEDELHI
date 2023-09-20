package com.onedelhi.secure;

import java.util.Collection;
import java.util.Collections;

public final class a00 extends sv2 {
    /* renamed from: i */
    public static void m35639i(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: j */
    public static String m35640j(String str) {
        String str2;
        int i;
        int i2;
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        str2 = "%V";
                    } else if (charAt == '`') {
                        str2 = "%W";
                    } else if (!(charAt == '-' || charAt == '.')) {
                        if (charAt <= 26) {
                            sb.append('$');
                            i = charAt - 1;
                        } else if (charAt < ' ') {
                            sb.append('%');
                            i = charAt - 27;
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb.append('/');
                            i = charAt - '!';
                        } else {
                            if (charAt <= '9') {
                                i2 = (charAt - '0') + 48;
                            } else if (charAt <= '?') {
                                sb.append('%');
                                i2 = (charAt - ';') + 70;
                            } else if (charAt <= 'Z') {
                                i = charAt - 'A';
                            } else if (charAt <= '_') {
                                sb.append('%');
                                i2 = (charAt - '[') + 75;
                            } else if (charAt <= 'z') {
                                sb.append('+');
                                i = charAt - 'a';
                            } else if (charAt <= 127) {
                                sb.append('%');
                                i2 = (charAt - '{') + 80;
                            } else {
                                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i3) + "'");
                            }
                            charAt = (char) i2;
                        }
                        i2 = i + 65;
                        charAt = (char) i2;
                    }
                }
                sb.append(charAt);
            } else {
                str2 = "%U";
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public boolean[] mo30374e(String str) {
        int length = str.length();
        if (length <= 80) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (C7525zz.f38510a.indexOf(str.charAt(i)) < 0) {
                    str = m35640j(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i++;
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[((length * 13) + 25)];
            m35639i(148, iArr);
            int c = sv2.m64912c(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int c2 = c + sv2.m64912c(zArr, c, iArr2, false);
            for (int i2 = 0; i2 < length; i2++) {
                m35639i(C7525zz.f38511b[C7525zz.f38510a.indexOf(str.charAt(i2))], iArr);
                int c3 = c2 + sv2.m64912c(zArr, c2, iArr, true);
                c2 = c3 + sv2.m64912c(zArr, c3, iArr2, false);
            }
            m35639i(148, iArr);
            sv2.m64912c(zArr, c2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }

    /* renamed from: g */
    public Collection<C7363yi> mo30375g() {
        return Collections.singleton(C7363yi.CODE_39);
    }
}

package com.onedelhi.secure;

import java.util.Arrays;

public final class ql1 {

    /* renamed from: a */
    public static final char f34273a = '';

    /* renamed from: a */
    public static final int f34274a = 0;

    /* renamed from: a */
    public static final String f34275a = "[)>\u001e05\u001d";

    /* renamed from: b */
    public static final char f34276b = 'æ';

    /* renamed from: b */
    public static final int f34277b = 1;

    /* renamed from: b */
    public static final String f34278b = "[)>\u001e06\u001d";

    /* renamed from: c */
    public static final char f34279c = 'ç';

    /* renamed from: c */
    public static final int f34280c = 2;

    /* renamed from: c */
    public static final String f34281c = "\u001e\u0004";

    /* renamed from: d */
    public static final char f34282d = 'ë';

    /* renamed from: d */
    public static final int f34283d = 3;

    /* renamed from: e */
    public static final char f34284e = 'ì';

    /* renamed from: e */
    public static final int f34285e = 4;

    /* renamed from: f */
    public static final char f34286f = 'í';

    /* renamed from: f */
    public static final int f34287f = 5;

    /* renamed from: g */
    public static final char f34288g = 'î';

    /* renamed from: h */
    public static final char f34289h = 'ï';

    /* renamed from: i */
    public static final char f34290i = 'ð';

    /* renamed from: j */
    public static final char f34291j = 'þ';

    /* renamed from: k */
    public static final char f34292k = 'þ';

    /* renamed from: a */
    public static int m63036a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i);
                while (true) {
                    if (!m63042g(charAt) || i >= length) {
                        break loop0;
                    }
                    i2++;
                    i++;
                    if (i < length) {
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static String m63037b(String str) {
        return m63038c(str, n84.FORCE_NONE, (bl0) null, (bl0) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m63038c(java.lang.String r7, com.onedelhi.secure.n84 r8, com.onedelhi.secure.bl0 r9, com.onedelhi.secure.bl0 r10) {
        /*
            r0 = 6
            com.onedelhi.secure.au0[] r0 = new com.onedelhi.secure.au0[r0]
            com.onedelhi.secure.z r1 = new com.onedelhi.secure.z
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            com.onedelhi.secure.mr r1 = new com.onedelhi.secure.mr
            r1.<init>()
            r3 = 1
            r0[r3] = r1
            com.onedelhi.secure.za4 r1 = new com.onedelhi.secure.za4
            r1.<init>()
            r4 = 2
            r0[r4] = r1
            com.onedelhi.secure.wy4 r1 = new com.onedelhi.secure.wy4
            r1.<init>()
            r5 = 3
            r0[r5] = r1
            com.onedelhi.secure.cs0 r1 = new com.onedelhi.secure.cs0
            r1.<init>()
            r5 = 4
            r0[r5] = r1
            com.onedelhi.secure.gj r1 = new com.onedelhi.secure.gj
            r1.<init>()
            r6 = 5
            r0[r6] = r1
            com.onedelhi.secure.eu0 r1 = new com.onedelhi.secure.eu0
            r1.<init>(r7)
            r1.mo35628o(r8)
            r1.mo35626m(r9, r10)
            java.lang.String r8 = "[)>\u001e05\u001d"
            boolean r8 = r7.startsWith(r8)
            java.lang.String r9 = "\u001e\u0004"
            if (r8 == 0) goto L_0x005d
            boolean r8 = r7.endsWith(r9)
            if (r8 == 0) goto L_0x005d
            r7 = 236(0xec, float:3.31E-43)
        L_0x0050:
            r1.mo35632s(r7)
            r1.mo35627n(r4)
            int r7 = r1.f28091a
            int r7 = r7 + 7
            r1.f28091a = r7
            goto L_0x006e
        L_0x005d:
            java.lang.String r8 = "[)>\u001e06\u001d"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L_0x006e
            boolean r7 = r7.endsWith(r9)
            if (r7 == 0) goto L_0x006e
            r7 = 237(0xed, float:3.32E-43)
            goto L_0x0050
        L_0x006e:
            boolean r7 = r1.mo35623j()
            if (r7 == 0) goto L_0x0087
            r7 = r0[r2]
            r7.mo31183a(r1)
            int r7 = r1.mo35619f()
            if (r7 < 0) goto L_0x006e
            int r2 = r1.mo35619f()
            r1.mo35624k()
            goto L_0x006e
        L_0x0087:
            int r7 = r1.mo35614a()
            r1.mo35630q()
            com.onedelhi.secure.m84 r8 = r1.mo35621h()
            int r8 = r8.mo40511b()
            if (r7 >= r8) goto L_0x00a3
            if (r2 == 0) goto L_0x00a3
            if (r2 == r6) goto L_0x00a3
            if (r2 == r5) goto L_0x00a3
            r7 = 254(0xfe, float:3.56E-43)
            r1.mo35632s(r7)
        L_0x00a3:
            java.lang.StringBuilder r7 = r1.mo35615b()
            int r9 = r7.length()
            if (r9 >= r8) goto L_0x00b2
            r9 = 129(0x81, float:1.81E-43)
        L_0x00af:
            r7.append(r9)
        L_0x00b2:
            int r9 = r7.length()
            if (r9 >= r8) goto L_0x00c2
            int r9 = r7.length()
            int r9 = r9 + r3
            char r9 = m63051p(r9)
            goto L_0x00af
        L_0x00c2:
            java.lang.StringBuilder r7 = r1.mo35615b()
            java.lang.String r7 = r7.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ql1.m63038c(java.lang.String, com.onedelhi.secure.n84, com.onedelhi.secure.bl0, com.onedelhi.secure.bl0):java.lang.String");
    }

    /* renamed from: d */
    public static int m63039d(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil((double) fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, (byte) 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: e */
    public static int m63040e(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: f */
    public static void m63041f(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* renamed from: g */
    public static boolean m63042g(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: h */
    public static boolean m63043h(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: i */
    public static boolean m63044i(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m63045j(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: k */
    public static boolean m63046k(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m63047l(char c) {
        if (m63049n(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m63048m(char c) {
        return false;
    }

    /* renamed from: n */
    public static boolean m63049n(char c) {
        return c == 13 || c == '*' || c == '>';
    }

    /* renamed from: o */
    public static int m63050o(CharSequence charSequence, int i, int i2) {
        char c;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        if (i3 >= charSequence.length()) {
            return i2;
        }
        float[] fArr = new float[6];
        if (i2 == 0) {
            // fill-array-data instruction
            fArr[0] = 0;
            fArr[1] = 1065353216;
            fArr[2] = 1065353216;
            fArr[3] = 1065353216;
            fArr[4] = 1065353216;
            fArr[5] = 1067450368;
        } else {
            // fill-array-data instruction
            fArr[0] = 1065353216;
            fArr[1] = 1073741824;
            fArr[2] = 1073741824;
            fArr[3] = 1073741824;
            fArr[4] = 1073741824;
            fArr[5] = 1074790400;
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i3 + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int d = m63039d(fArr, iArr, Integer.MAX_VALUE, bArr);
                int e = m63040e(bArr);
                if (iArr[0] == d) {
                    return 0;
                }
                if (e == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (e == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (e != 1 || bArr[2] <= 0) {
                    return (e != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i5);
            i4++;
            if (m63042g(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m63043h(charAt)) {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m63044i(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m63043h(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m63046k(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m63043h(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m63047l(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m63043h(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m63045j(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m63043h(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m63048m(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m63039d(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int e2 = m63040e(bArr2);
                if (iArr2[0] < iArr2[c] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (e2 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (e2 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (e2 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        int i6 = i3 + i4 + 1;
                        while (i6 < charSequence.length()) {
                            char charAt2 = charSequence2.charAt(i6);
                            if (!m63049n(charAt2)) {
                                if (!m63047l(charAt2)) {
                                    break;
                                }
                                i6++;
                            } else {
                                return 3;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public static char m63051p(int i) {
        int i2 = ((i * 149) % 253) + 1 + 129;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }
}

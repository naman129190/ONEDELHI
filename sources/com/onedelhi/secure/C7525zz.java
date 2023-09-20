package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.onedelhi.secure.zz */
public final class C7525zz extends rv2 {

    /* renamed from: a */
    public static final int f38509a = 148;

    /* renamed from: a */
    public static final String f38510a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";

    /* renamed from: b */
    public static final int[] f38511b = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, hh0.f13094k, 82, 7, 262, 70, 22, 385, ci1.f10300r, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a */
    public final StringBuilder f38512a;

    /* renamed from: a */
    public final boolean f38513a;

    /* renamed from: a */
    public final int[] f38514a;

    /* renamed from: b */
    public final boolean f38515b;

    public C7525zz() {
        this(false);
    }

    public C7525zz(boolean z) {
        this(z, false);
    }

    public C7525zz(boolean z, boolean z2) {
        this.f38513a = z;
        this.f38515b = z2;
        this.f38512a = new StringBuilder(20);
        this.f38514a = new int[9];
    }

    /* renamed from: h */
    public static String m74402h(CharSequence charSequence) throws ha1 {
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    charAt = ':';
                                } else {
                                    throw ha1.m50341a();
                                }
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw ha1.m50341a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 + tf0.f35551f;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i = charAt2 + '+';
                    } else if (charAt2 != 'U') {
                        if (charAt2 == 'V') {
                            charAt = '@';
                        } else if (charAt2 == 'W') {
                            charAt = '`';
                        } else if (charAt2 == 'X' || charAt2 == 'Y' || charAt2 == 'Z') {
                            charAt = oo2.f33151b;
                        } else {
                            throw ha1.m50341a();
                        }
                    }
                    charAt = 0;
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw ha1.m50341a();
                } else {
                    i = charAt2 - '@';
                }
                charAt = (char) i;
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: i */
    public static int[] m74403i(C6014ll llVar, int[] iArr) throws tr2 {
        int l = llVar.mo39935l();
        int j = llVar.mo39933j(0);
        int length = iArr.length;
        int i = j;
        boolean z = false;
        int i2 = 0;
        while (j < l) {
            if (llVar.mo39930h(j) != z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else if (m74405k(iArr) != 148 || !llVar.mo39937n(Math.max(0, i - ((j - i) / 2)), i, false)) {
                    i += iArr[0] + iArr[1];
                    int i3 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i2] = 0;
                    i2--;
                } else {
                    return new int[]{i, j};
                }
                iArr[i2] = 1;
                z = !z;
            }
            j++;
        }
        throw tr2.m66179a();
    }

    /* renamed from: j */
    public static char m74404j(int i) throws tr2 {
        int i2 = 0;
        while (true) {
            int[] iArr = f38511b;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return f38510a.charAt(i2);
                }
                i2++;
            } else if (i == 148) {
                return '*';
            } else {
                throw tr2.m66179a();
            }
        }
    }

    /* renamed from: k */
    public static int m74405k(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: c */
    public ol3 mo31296c(int i, C6014ll llVar, Map<pf0, ?> map) throws tr2, C6619qx, ha1 {
        int[] iArr = this.f38514a;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f38512a;
        sb.setLength(0);
        int[] i2 = m74403i(llVar, iArr);
        int j = llVar.mo39933j(i2[1]);
        int l = llVar.mo39935l();
        while (true) {
            rv2.m63923f(llVar, j, iArr);
            int k = m74405k(iArr);
            if (k >= 0) {
                char j2 = m74404j(k);
                sb.append(j2);
                int i3 = j;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int j3 = llVar.mo39933j(i3);
                if (j2 == '*') {
                    sb.setLength(sb.length() - 1);
                    int i5 = 0;
                    for (int i6 : iArr) {
                        i5 += i6;
                    }
                    int i7 = (j3 - j) - i5;
                    if (j3 == l || (i7 << 1) >= i5) {
                        if (this.f38513a) {
                            int length = sb.length() - 1;
                            int i8 = 0;
                            for (int i9 = 0; i9 < length; i9++) {
                                i8 += f38510a.indexOf(this.f38512a.charAt(i9));
                            }
                            if (sb.charAt(length) == f38510a.charAt(i8 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw C6619qx.m63242a();
                            }
                        }
                        if (sb.length() != 0) {
                            float f = (float) i;
                            return new ol3(this.f38515b ? m74402h(sb) : sb.toString(), (byte[]) null, new sl3[]{new sl3(((float) (i2[1] + i2[0])) / 2.0f, f), new sl3(((float) j) + (((float) i5) / 2.0f), f)}, C7363yi.CODE_39);
                        }
                        throw tr2.m66179a();
                    }
                    throw tr2.m66179a();
                }
                j = j3;
            } else {
                throw tr2.m66179a();
            }
        }
    }
}

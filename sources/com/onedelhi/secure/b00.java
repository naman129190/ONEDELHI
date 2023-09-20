package com.onedelhi.secure;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.onedelhi.secure.ak4;
import java.util.Arrays;
import java.util.Map;

public final class b00 extends rv2 {

    /* renamed from: a */
    public static final int f26080a;

    /* renamed from: a */
    public static final String f26081a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";

    /* renamed from: a */
    public static final char[] f26082a = f26081a.toCharArray();

    /* renamed from: b */
    public static final int[] f26083b;

    /* renamed from: a */
    public final StringBuilder f26084a = new StringBuilder(20);

    /* renamed from: a */
    public final int[] f26085a = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, hh0.f13094k, 266, ak4.C1710c.f9214u, 420, 418, tu3.f35795c, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, ak4.C1710c.f9210s, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, FloatingActionButton.f8417y, 306, 350};
        f26083b = iArr;
        f26080a = iArr[47];
    }

    /* renamed from: h */
    public static void m39235h(CharSequence charSequence) throws C6619qx {
        int length = charSequence.length();
        m39236i(charSequence, length - 2, 20);
        m39236i(charSequence, length - 1, 15);
    }

    /* renamed from: i */
    public static void m39236i(CharSequence charSequence, int i, int i2) throws C6619qx {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += f26081a.indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f26082a[i3 % 47]) {
            throw C6619qx.m63242a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r4 = 0;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m39237j(java.lang.CharSequence r9) throws com.onedelhi.secure.ha1 {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r0) goto L_0x00b0
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x00a9
            r5 = 100
            if (r4 > r5) goto L_0x00a9
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x00a4
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0097;
                case 98: goto L_0x004e;
                case 99: goto L_0x003c;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = 0
            goto L_0x00a9
        L_0x002f:
            if (r5 < r8) goto L_0x0037
            if (r5 > r7) goto L_0x0037
            int r5 = r5 + 32
            goto L_0x009d
        L_0x0037:
            com.onedelhi.secure.ha1 r9 = com.onedelhi.secure.ha1.m50341a()
            throw r9
        L_0x003c:
            if (r5 < r8) goto L_0x0043
            if (r5 > r6) goto L_0x0043
            int r5 = r5 + -32
            goto L_0x009d
        L_0x0043:
            if (r5 != r7) goto L_0x0049
            r4 = 58
            goto L_0x00a9
        L_0x0049:
            com.onedelhi.secure.ha1 r9 = com.onedelhi.secure.ha1.m50341a()
            throw r9
        L_0x004e:
            if (r5 < r8) goto L_0x0057
            r4 = 69
            if (r5 > r4) goto L_0x0057
            int r5 = r5 + -38
            goto L_0x009d
        L_0x0057:
            r4 = 70
            if (r5 < r4) goto L_0x0062
            r4 = 74
            if (r5 > r4) goto L_0x0062
            int r5 = r5 + -11
            goto L_0x009d
        L_0x0062:
            r4 = 75
            if (r5 < r4) goto L_0x006b
            if (r5 > r6) goto L_0x006b
            int r5 = r5 + 16
            goto L_0x009d
        L_0x006b:
            r4 = 80
            if (r5 < r4) goto L_0x0076
            r4 = 84
            if (r5 > r4) goto L_0x0076
            int r5 = r5 + 43
            goto L_0x009d
        L_0x0076:
            r4 = 85
            if (r5 != r4) goto L_0x007b
            goto L_0x002c
        L_0x007b:
            r4 = 86
            if (r5 != r4) goto L_0x0082
            r4 = 64
            goto L_0x00a9
        L_0x0082:
            r4 = 87
            if (r5 != r4) goto L_0x0089
            r4 = 96
            goto L_0x00a9
        L_0x0089:
            r4 = 88
            if (r5 < r4) goto L_0x0092
            if (r5 > r7) goto L_0x0092
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x00a9
        L_0x0092:
            com.onedelhi.secure.ha1 r9 = com.onedelhi.secure.ha1.m50341a()
            throw r9
        L_0x0097:
            if (r5 < r8) goto L_0x009f
            if (r5 > r7) goto L_0x009f
            int r5 = r5 + -64
        L_0x009d:
            char r4 = (char) r5
            goto L_0x00a9
        L_0x009f:
            com.onedelhi.secure.ha1 r9 = com.onedelhi.secure.ha1.m50341a()
            throw r9
        L_0x00a4:
            com.onedelhi.secure.ha1 r9 = com.onedelhi.secure.ha1.m50341a()
            throw r9
        L_0x00a9:
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x000b
        L_0x00b0:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.b00.m39237j(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: l */
    public static char m39238l(int i) throws tr2 {
        int i2 = 0;
        while (true) {
            int[] iArr = f26083b;
            if (i2 >= iArr.length) {
                throw tr2.m66179a();
            } else if (iArr[i2] == i) {
                return f26082a[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static int m39239m(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    /* renamed from: c */
    public ol3 mo31296c(int i, C6014ll llVar, Map<pf0, ?> map) throws tr2, C6619qx, ha1 {
        int[] k = mo31297k(llVar);
        int j = llVar.mo39933j(k[1]);
        int l = llVar.mo39935l();
        int[] iArr = this.f26085a;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f26084a;
        sb.setLength(0);
        while (true) {
            rv2.m63923f(llVar, j, iArr);
            int m = m39239m(iArr);
            if (m >= 0) {
                char l2 = m39238l(m);
                sb.append(l2);
                int i2 = j;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int j2 = llVar.mo39933j(i2);
                if (l2 == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (j2 == l || !llVar.mo39930h(j2)) {
                        throw tr2.m66179a();
                    } else if (sb.length() >= 2) {
                        m39235h(sb);
                        sb.setLength(sb.length() - 2);
                        float f = (float) i;
                        return new ol3(m39237j(sb), (byte[]) null, new sl3[]{new sl3(((float) (k[1] + k[0])) / 2.0f, f), new sl3(((float) j) + (((float) i4) / 2.0f), f)}, C7363yi.CODE_93);
                    } else {
                        throw tr2.m66179a();
                    }
                } else {
                    j = j2;
                }
            } else {
                throw tr2.m66179a();
            }
        }
    }

    /* renamed from: k */
    public final int[] mo31297k(C6014ll llVar) throws tr2 {
        int l = llVar.mo39935l();
        int j = llVar.mo39933j(0);
        Arrays.fill(this.f26085a, 0);
        int[] iArr = this.f26085a;
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
                } else if (m39239m(iArr) == f26080a) {
                    return new int[]{i, j};
                } else {
                    i += iArr[0] + iArr[1];
                    int i3 = i2 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i2] = 0;
                    i2--;
                }
                iArr[i2] = 1;
                z = !z;
            }
            j++;
        }
        throw tr2.m66179a();
    }
}

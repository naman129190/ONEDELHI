package com.onedelhi.secure;

public final class km4 extends im4 {

    /* renamed from: c */
    public static final int[][] f31255c = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: e */
    public static final int[] f31256e = {1, 1, 1, 1, 1, 1};

    /* renamed from: d */
    public final int[] f31257d = new int[4];

    /* renamed from: s */
    public static String m54566s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    /* renamed from: t */
    public static void m54567t(StringBuilder sb, int i) throws tr2 {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f31255c[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw tr2.m66179a();
    }

    /* renamed from: h */
    public boolean mo38160h(String str) throws ha1 {
        return super.mo38160h(m54566s(str));
    }

    /* renamed from: k */
    public int[] mo38161k(C6014ll llVar, int i) throws tr2 {
        return im4.m52454n(llVar, i, true, f31256e);
    }

    /* renamed from: l */
    public int mo34503l(C6014ll llVar, int[] iArr, StringBuilder sb) throws tr2 {
        int[] iArr2 = this.f31257d;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l = llVar.mo39935l();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < l; i3++) {
            int j = im4.m52453j(llVar, iArr2, i, im4.f30365b);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m54567t(sb, i2);
        return i;
    }

    /* renamed from: q */
    public C7363yi mo34505q() {
        return C7363yi.UPC_E;
    }
}

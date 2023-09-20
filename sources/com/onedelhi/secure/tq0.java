package com.onedelhi.secure;

public final class tq0 extends im4 {

    /* renamed from: e */
    public static final int[] f35759e = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: d */
    public final int[] f35760d = new int[4];

    /* renamed from: s */
    public static void m66111s(StringBuilder sb, int i) throws tr2 {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f35759e[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw tr2.m66179a();
    }

    /* renamed from: l */
    public int mo34503l(C6014ll llVar, int[] iArr, StringBuilder sb) throws tr2 {
        int[] iArr2 = this.f35760d;
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
        m66111s(sb, i2);
        int i5 = im4.m52454n(llVar, i, true, im4.f30364b)[1];
        for (int i6 = 0; i6 < 6 && i5 < l; i6++) {
            sb.append((char) (im4.m52453j(llVar, iArr2, i5, im4.f30362a) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    /* renamed from: q */
    public C7363yi mo34505q() {
        return C7363yi.EAN_13;
    }
}

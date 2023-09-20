package com.onedelhi.secure;

public final class vq0 extends im4 {

    /* renamed from: d */
    public final int[] f36619d = new int[4];

    /* renamed from: l */
    public int mo34503l(C6014ll llVar, int[] iArr, StringBuilder sb) throws tr2 {
        int[] iArr2 = this.f36619d;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l = llVar.mo39935l();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < l; i2++) {
            sb.append((char) (im4.m52453j(llVar, iArr2, i, im4.f30362a) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = im4.m52454n(llVar, i, true, im4.f30364b)[1];
        for (int i5 = 0; i5 < 4 && i4 < l; i5++) {
            sb.append((char) (im4.m52453j(llVar, iArr2, i4, im4.f30362a) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    /* renamed from: q */
    public C7363yi mo34505q() {
        return C7363yi.EAN_8;
    }
}

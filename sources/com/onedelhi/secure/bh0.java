package com.onedelhi.secure;

public final class bh0 extends vi1 {
    /* renamed from: c */
    public C6190nl mo31720c(C6190nl nlVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws tr2 {
        C6190nl nlVar2 = nlVar;
        int i3 = i;
        int i4 = i2;
        return mo31721d(nlVar, i, i2, u13.m66383b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* renamed from: d */
    public C6190nl mo31721d(C6190nl nlVar, int i, int i2, u13 u13) throws tr2 {
        if (i <= 0 || i2 <= 0) {
            throw tr2.m66179a();
        }
        C6190nl nlVar2 = new C6190nl(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = ((float) i4) + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = ((float) (i5 / 2)) + 0.5f;
                fArr[i5 + 1] = f;
            }
            u13.mo45365f(fArr);
            vi1.m68087a(nlVar, fArr);
            int i6 = 0;
            while (i6 < i3) {
                try {
                    if (nlVar.mo41085e((int) fArr[i6], (int) fArr[i6 + 1])) {
                        nlVar2.mo41096p(i6 / 2, i4);
                    }
                    i6 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw tr2.m66179a();
                }
            }
        }
        return nlVar2;
    }
}

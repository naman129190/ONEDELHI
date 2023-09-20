package com.onedelhi.secure;

import java.util.Map;

public final class cg0 {

    /* renamed from: a */
    public static final int f26746a = 0;

    /* renamed from: b */
    public static final int f26747b = 1;

    /* renamed from: c */
    public static final int f26748c = 2;

    /* renamed from: a */
    public final vg3 f26749a = new vg3(te1.f35532h);

    /* renamed from: a */
    public final void mo32363a(byte[] bArr, int i, int i2, int i3, int i4) throws C6619qx {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f26749a.mo46148a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (xg3 unused) {
            throw C6619qx.m63242a();
        }
    }

    /* renamed from: b */
    public gg0 mo32364b(C6190nl nlVar) throws C6619qx, ha1 {
        return mo32365c(nlVar, (Map<pf0, ?>) null);
    }

    /* renamed from: c */
    public gg0 mo32365c(C6190nl nlVar, Map<pf0, ?> map) throws ha1, C6619qx {
        int i;
        byte[] a = new C6283ol(nlVar).mo41821a();
        mo32363a(a, 0, 10, 10, 0);
        byte b = a[0] & 15;
        if (b == 2 || b == 3 || b == 4) {
            byte[] bArr = a;
            mo32363a(bArr, 20, 84, 40, 1);
            mo32363a(bArr, 20, 84, 40, 2);
            i = 94;
        } else if (b == 5) {
            byte[] bArr2 = a;
            mo32363a(bArr2, 20, 68, 56, 1);
            mo32363a(bArr2, 20, 68, 56, 2);
            i = 78;
        } else {
            throw ha1.m50341a();
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(a, 0, bArr3, 0, 10);
        System.arraycopy(a, 20, bArr3, 10, bArr3.length - 10);
        return tf0.m65607a(bArr3, b);
    }
}

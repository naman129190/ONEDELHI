package com.onedelhi.secure;

import java.lang.reflect.Array;

public final class jx2 {

    /* renamed from: a */
    public static final float[][] f30996a;

    static {
        int i;
        int length = kx2.f31487b.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f30996a = (float[][]) Array.newInstance(float.class, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = kx2.f31487b;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i3 >>= 1;
                    }
                    f30996a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static int m53880a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | ((long) i3);
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    public static int m53881b(int[] iArr) {
        int d = qf2.m62734d(iArr);
        float[] fArr = new float[8];
        if (d > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = ((float) iArr[i]) / ((float) d);
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f30996a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float f2 = 0.0f;
            float[] fArr3 = fArr2[i3];
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = kx2.f31487b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: c */
    public static int m53882c(int[] iArr) {
        int a = m53880a(iArr);
        if (kx2.m55125b(a) == -1) {
            return -1;
        }
        return a;
    }

    /* renamed from: d */
    public static int m53883d(int[] iArr) {
        int c = m53882c(m53884e(iArr));
        return c != -1 ? c : m53881b(iArr);
    }

    /* renamed from: e */
    public static int[] m53884e(int[] iArr) {
        float d = (float) qf2.m62734d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (((float) (iArr[i2] + i)) <= (d / 34.0f) + ((((float) i3) * d) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}

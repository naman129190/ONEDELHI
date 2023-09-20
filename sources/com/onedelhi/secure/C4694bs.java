package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.bs */
public class C4694bs {

    /* renamed from: a */
    public static final int f26521a = -306674912;

    /* renamed from: a */
    public static final int[] f26522a = new int[256];

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>>= 1;
                if (i4 != 0) {
                    i2 ^= f26521a;
                }
            }
            f26522a[i] = i2;
        }
    }
}

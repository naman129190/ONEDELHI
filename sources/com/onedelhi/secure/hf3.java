package com.onedelhi.secure;

public class hf3 {
    /* renamed from: a */
    public static void m50489a(f31[] f31Arr) throws no4 {
        int i = 0;
        while (i < f31Arr.length - 1) {
            if (f31Arr[i].mo35770c()) {
                i++;
            } else {
                throw new no4("Unsupported XZ filter chain");
            }
        }
        if (f31Arr[f31Arr.length - 1].mo35769a()) {
            int i2 = 0;
            for (f31 f : f31Arr) {
                if (f.mo35771f()) {
                    i2++;
                }
            }
            if (i2 > 3) {
                throw new no4("Unsupported XZ filter chain");
            }
            return;
        }
        throw new no4("Unsupported XZ filter chain");
    }
}

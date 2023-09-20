package com.onedelhi.secure;

import org.jspecify.nullness.NullMarked;

@NullMarked
public final class pe5 {
    @C7277xt
    /* renamed from: a */
    public static Object[] m24626a(Object[] objArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException("at index " + i2);
            }
        }
        return objArr;
    }
}

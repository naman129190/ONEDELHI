package com.onedelhi.secure;

import javax.annotation.CheckForNull;

public final class bl6 {
    /* renamed from: a */
    public static Object m11947a(@CheckForNull Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    /* renamed from: b */
    public static Object[] m11948b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m11947a(objArr[i2], i2);
        }
        return objArr;
    }
}

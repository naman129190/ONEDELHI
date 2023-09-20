package com.onedelhi.secure;

import android.text.TextUtils;

@Deprecated
public final class be0 {
    @Deprecated
    /* renamed from: a */
    public static String[] m11841a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[(strArr.length + strArr2.length)];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    @Deprecated
    /* renamed from: b */
    public static String m11842b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return pl2.f33726c + str + ") AND (" + str2 + pl2.f33727d;
    }
}

package com.onedelhi.secure;

public final class aw1 {

    /* renamed from: a */
    public static final int f9539a = 1;

    /* renamed from: b */
    public static final int f9540b = 2;

    /* renamed from: c */
    public static final int f9541c = 3;

    /* renamed from: d */
    public static final int f9542d = 4;

    /* renamed from: e */
    public static final int f9543e = 5;

    /* renamed from: f */
    public static final int f9544f = 6;

    /* renamed from: g */
    public static final int f9545g = 7;

    /* renamed from: h */
    public static final int f9546h = 8;

    /* renamed from: a */
    public static String m11450a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }
}

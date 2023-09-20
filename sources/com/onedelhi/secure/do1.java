package com.onedelhi.secure;

import java.util.Collection;
import java.util.Collections;

public final class do1 extends sv2 {

    /* renamed from: a */
    public static final int f27564a = 3;

    /* renamed from: a */
    public static final int[] f27565a = {1, 1, 1, 1};

    /* renamed from: a */
    public static final int[][] f27566a = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: b */
    public static final int f27567b = 1;

    /* renamed from: b */
    public static final int[] f27568b = {3, 1, 1};

    /* renamed from: e */
    public boolean[] mo30374e(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            sv2.m64913d(str);
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int c = sv2.m64912c(zArr, 0, f27565a, true);
            for (int i = 0; i < length; i += 2) {
                int digit = Character.digit(str.charAt(i), 10);
                int digit2 = Character.digit(str.charAt(i + 1), 10);
                int[] iArr = new int[10];
                for (int i2 = 0; i2 < 5; i2++) {
                    int i3 = i2 * 2;
                    int[][] iArr2 = f27566a;
                    iArr[i3] = iArr2[digit][i2];
                    iArr[i3 + 1] = iArr2[digit2][i2];
                }
                c += sv2.m64912c(zArr, c, iArr, true);
            }
            sv2.m64912c(zArr, c, f27568b, true);
            return zArr;
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }

    /* renamed from: g */
    public Collection<C7363yi> mo30375g() {
        return Collections.singleton(C7363yi.ITF);
    }
}

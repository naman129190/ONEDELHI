package com.onedelhi.secure;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class sv2 implements uy4 {

    /* renamed from: a */
    public static final Pattern f35201a = Pattern.compile("[0-9]+");

    /* renamed from: c */
    public static int m64912c(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* renamed from: d */
    public static void m64913d(String str) {
        if (!f35201a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    /* renamed from: h */
    public static C6190nl m64914h(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        C6190nl nlVar = new C6190nl(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                nlVar.mo41097q(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return nlVar;
    }

    /* renamed from: a */
    public final C6190nl mo35510a(String str, C7363yi yiVar, int i, int i2) {
        return mo35511b(str, yiVar, i, i2, (Map<ut0, ?>) null);
    }

    /* renamed from: b */
    public C6190nl mo35511b(String str, C7363yi yiVar, int i, int i2, Map<ut0, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        } else {
            Collection<C7363yi> g = mo30375g();
            if (g == null || g.contains(yiVar)) {
                int f = mo38785f();
                if (map != null) {
                    ut0 ut0 = ut0.MARGIN;
                    if (map.containsKey(ut0)) {
                        f = Integer.parseInt(map.get(ut0).toString());
                    }
                }
                return m64914h(mo30374e(str), i, i2, f);
            }
            throw new IllegalArgumentException("Can only encode " + g + ", but got " + yiVar);
        }
    }

    /* renamed from: e */
    public abstract boolean[] mo30374e(String str);

    /* renamed from: f */
    public int mo38785f() {
        return 10;
    }

    /* renamed from: g */
    public Collection<C7363yi> mo30375g() {
        return null;
    }
}

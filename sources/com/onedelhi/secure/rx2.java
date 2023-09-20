package com.onedelhi.secure;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

public final class rx2 implements uy4 {

    /* renamed from: a */
    public static final int f34783a = 30;

    /* renamed from: b */
    public static final int f34784b = 2;

    /* renamed from: c */
    public static C6190nl m63963c(byte[][] bArr, int i) {
        int i2 = i * 2;
        C6190nl nlVar = new C6190nl(bArr[0].length + i2, bArr.length + i2);
        nlVar.mo41081b();
        int h = (nlVar.mo41089h() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    nlVar.mo41096p(i4 + i, h);
                }
            }
            i3++;
            h--;
        }
        return nlVar;
    }

    /* renamed from: d */
    public static C6190nl m63964d(ix2 ix2, String str, int i, int i2, int i3, int i4) throws vy4 {
        boolean z;
        ix2.mo38269e(str, i);
        byte[][] c = ix2.mo38270f().mo48273c(1, 4);
        if ((i3 > i2) != (c[0].length < c.length)) {
            c = m63965e(c);
            z = true;
        } else {
            z = false;
        }
        int min = Math.min(i2 / c[0].length, i3 / c.length);
        if (min <= 1) {
            return m63963c(c, i4);
        }
        byte[][] c2 = ix2.mo38270f().mo48273c(min, min << 2);
        if (z) {
            c2 = m63965e(c2);
        }
        return m63963c(c2, i4);
    }

    /* renamed from: e */
    public static byte[][] m63965e(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, iArr);
        for (int i = 0; i < bArr.length; i++) {
            int length2 = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length2] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public C6190nl mo35510a(String str, C7363yi yiVar, int i, int i2) throws vy4 {
        return mo35511b(str, yiVar, i, i2, (Map<ut0, ?>) null);
    }

    /* renamed from: b */
    public C6190nl mo35511b(String str, C7363yi yiVar, int i, int i2, Map<ut0, ?> map) throws vy4 {
        int i3;
        int i4;
        if (yiVar == C7363yi.PDF_417) {
            ix2 ix2 = new ix2();
            int i5 = 30;
            int i6 = 2;
            if (map != null) {
                ut0 ut0 = ut0.PDF417_COMPACT;
                if (map.containsKey(ut0)) {
                    ix2.mo38271h(Boolean.parseBoolean(map.get(ut0).toString()));
                }
                ut0 ut02 = ut0.PDF417_COMPACTION;
                if (map.containsKey(ut02)) {
                    ix2.mo38272i(v10.valueOf(map.get(ut02).toString()));
                }
                ut0 ut03 = ut0.PDF417_DIMENSIONS;
                if (map.containsKey(ut03)) {
                    dl0 dl0 = (dl0) map.get(ut03);
                    ix2.mo38273j(dl0.mo34491a(), dl0.mo34493c(), dl0.mo34492b(), dl0.mo34494d());
                }
                ut0 ut04 = ut0.MARGIN;
                if (map.containsKey(ut04)) {
                    i5 = Integer.parseInt(map.get(ut04).toString());
                }
                ut0 ut05 = ut0.ERROR_CORRECTION;
                if (map.containsKey(ut05)) {
                    i6 = Integer.parseInt(map.get(ut05).toString());
                }
                ut0 ut06 = ut0.CHARACTER_SET;
                if (map.containsKey(ut06)) {
                    ix2.mo38274k(Charset.forName(map.get(ut06).toString()));
                }
                i3 = i5;
                i4 = i6;
            } else {
                i4 = 2;
                i3 = 30;
            }
            return m63964d(ix2, str, i4, i, i2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(yiVar)));
    }
}

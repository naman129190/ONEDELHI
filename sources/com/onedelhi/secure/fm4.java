package com.onedelhi.secure;

import java.util.EnumMap;
import java.util.Map;

public final class fm4 {

    /* renamed from: a */
    public final StringBuilder f28599a = new StringBuilder();

    /* renamed from: a */
    public final int[] f28600a = new int[4];

    /* renamed from: c */
    public static Map<ql3, Object> m48192c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ql3.class);
        enumMap.put(ql3.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* renamed from: a */
    public final int mo36142a(C6014ll llVar, int[] iArr, StringBuilder sb) throws tr2 {
        int[] iArr2 = this.f28600a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l = llVar.mo39935l();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < l; i3++) {
            int j = im4.m52453j(llVar, iArr2, i, im4.f30365b);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = llVar.mo39934k(llVar.mo39933j(i));
            }
        }
        if (sb.length() != 2) {
            throw tr2.m66179a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        } else {
            throw tr2.m66179a();
        }
    }

    /* renamed from: b */
    public ol3 mo36143b(int i, C6014ll llVar, int[] iArr) throws tr2 {
        StringBuilder sb = this.f28599a;
        sb.setLength(0);
        int a = mo36142a(llVar, iArr, sb);
        String sb2 = sb.toString();
        Map<ql3, Object> c = m48192c(sb2);
        float f = (float) i;
        ol3 ol3 = new ol3(sb2, (byte[]) null, new sl3[]{new sl3(((float) (iArr[0] + iArr[1])) / 2.0f, f), new sl3((float) a, f)}, C7363yi.UPC_EAN_EXTENSION);
        if (c != null) {
            ol3.mo41831i(c);
        }
        return ol3;
    }
}

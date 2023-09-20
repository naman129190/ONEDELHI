package com.onedelhi.secure;

import java.util.EnumMap;
import java.util.Map;

public final class gm4 {

    /* renamed from: b */
    public static final int[] f29227b = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    public final StringBuilder f29228a = new StringBuilder();

    /* renamed from: a */
    public final int[] f29229a = new int[4];

    /* renamed from: c */
    public static int m49569c(int i) throws tr2 {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f29227b[i2]) {
                return i2;
            }
        }
        throw tr2.m66179a();
    }

    /* renamed from: d */
    public static int m49570d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r5.equals("90000") == false) goto L_0x001d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m49571e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            java.lang.String r3 = ""
            r4 = 1
            if (r1 == r2) goto L_0x004d
            r2 = 53
            if (r1 == r2) goto L_0x004a
            r2 = 57
            if (r1 == r2) goto L_0x0015
            goto L_0x004f
        L_0x0015:
            r1 = -1
            int r2 = r5.hashCode()
            switch(r2) {
                case 54118329: goto L_0x0035;
                case 54395376: goto L_0x002a;
                case 54395377: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = -1
            goto L_0x003e
        L_0x001f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x001d
        L_0x0028:
            r0 = 2
            goto L_0x003e
        L_0x002a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0033
            goto L_0x001d
        L_0x0033:
            r0 = 1
            goto L_0x003e
        L_0x0035:
            java.lang.String r2 = "90000"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x003e
            goto L_0x001d
        L_0x003e:
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0045;
                case 2: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x004f
        L_0x0042:
            java.lang.String r5 = "0.00"
            return r5
        L_0x0045:
            java.lang.String r5 = "Used"
            return r5
        L_0x0048:
            r5 = 0
            return r5
        L_0x004a:
            java.lang.String r3 = "$"
            goto L_0x004f
        L_0x004d:
            java.lang.String r3 = "£"
        L_0x004f:
            java.lang.String r5 = r5.substring(r4)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L_0x006e
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "0"
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0072
        L_0x006e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L_0x0072:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gm4.m49571e(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    public static Map<ql3, Object> m49572f(String str) {
        String e;
        if (str.length() != 5 || (e = m49571e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ql3.class);
        enumMap.put(ql3.SUGGESTED_PRICE, e);
        return enumMap;
    }

    /* renamed from: a */
    public final int mo36789a(C6014ll llVar, int[] iArr, StringBuilder sb) throws tr2 {
        int[] iArr2 = this.f29229a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int l = llVar.mo39935l();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < l; i3++) {
            int j = im4.m52453j(llVar, iArr2, i, im4.f30365b);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = llVar.mo39934k(llVar.mo39933j(i));
            }
        }
        if (sb.length() == 5) {
            if (m49570d(sb.toString()) == m49569c(i2)) {
                return i;
            }
            throw tr2.m66179a();
        }
        throw tr2.m66179a();
    }

    /* renamed from: b */
    public ol3 mo36790b(int i, C6014ll llVar, int[] iArr) throws tr2 {
        StringBuilder sb = this.f29228a;
        sb.setLength(0);
        int a = mo36789a(llVar, iArr, sb);
        String sb2 = sb.toString();
        Map<ql3, Object> f = m49572f(sb2);
        float f2 = (float) i;
        ol3 ol3 = new ol3(sb2, (byte[]) null, new sl3[]{new sl3(((float) (iArr[0] + iArr[1])) / 2.0f, f2), new sl3((float) a, f2)}, C7363yi.UPC_EAN_EXTENSION);
        if (f != null) {
            ol3.mo41831i(f);
        }
        return ol3;
    }
}

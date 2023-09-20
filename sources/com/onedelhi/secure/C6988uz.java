package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.uz */
public final class C6988uz extends rv2 {

    /* renamed from: a */
    public static final float f36338a = 2.0f;

    /* renamed from: a */
    public static final String f36339a = "0123456789-$:/.+ABCD";

    /* renamed from: a */
    public static final char[] f36340a = f36339a.toCharArray();

    /* renamed from: b */
    public static final float f36341b = 1.5f;

    /* renamed from: b */
    public static final int f36342b = 3;

    /* renamed from: b */
    public static final char[] f36343b = {'A', 'B', 'C', 'D'};

    /* renamed from: b */
    public static final int[] f36344b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: a */
    public int f36345a = 0;

    /* renamed from: a */
    public final StringBuilder f36346a = new StringBuilder(20);

    /* renamed from: a */
    public int[] f36347a = new int[80];

    /* renamed from: h */
    public static boolean m67529h(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onedelhi.secure.ol3 mo31296c(int r11, com.onedelhi.secure.C6014ll r12, java.util.Map<com.onedelhi.secure.pf0, ?> r13) throws com.onedelhi.secure.tr2 {
        /*
            r10 = this;
            int[] r0 = r10.f36347a
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r10.mo45871k(r12)
            int r12 = r10.mo45870j()
            java.lang.StringBuilder r0 = r10.f36346a
            r0.setLength(r1)
            r0 = r12
        L_0x0013:
            int r2 = r10.mo45872l(r0)
            r3 = -1
            if (r2 == r3) goto L_0x0101
            java.lang.StringBuilder r4 = r10.f36346a
            char r5 = (char) r2
            r4.append(r5)
            int r0 = r0 + 8
            java.lang.StringBuilder r4 = r10.f36346a
            int r4 = r4.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0037
            char[] r4 = f36343b
            char[] r6 = f36340a
            char r2 = r6[r2]
            boolean r2 = m67529h(r4, r2)
            if (r2 != 0) goto L_0x003b
        L_0x0037:
            int r2 = r10.f36345a
            if (r0 < r2) goto L_0x0013
        L_0x003b:
            int[] r2 = r10.f36347a
            int r4 = r0 + -1
            r2 = r2[r4]
            r6 = -8
            r7 = 0
        L_0x0043:
            if (r6 >= r3) goto L_0x004f
            int[] r8 = r10.f36347a
            int r9 = r0 + r6
            r8 = r8[r9]
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0043
        L_0x004f:
            int r3 = r10.f36345a
            r6 = 2
            if (r0 >= r3) goto L_0x005d
            int r7 = r7 / r6
            if (r2 < r7) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            com.onedelhi.secure.tr2 r11 = com.onedelhi.secure.tr2.m66179a()
            throw r11
        L_0x005d:
            r10.mo45873m(r12)
            r0 = 0
        L_0x0061:
            java.lang.StringBuilder r2 = r10.f36346a
            int r2 = r2.length()
            if (r0 >= r2) goto L_0x0079
            java.lang.StringBuilder r2 = r10.f36346a
            char[] r3 = f36340a
            char r7 = r2.charAt(r0)
            char r3 = r3[r7]
            r2.setCharAt(r0, r3)
            int r0 = r0 + 1
            goto L_0x0061
        L_0x0079:
            java.lang.StringBuilder r0 = r10.f36346a
            char r0 = r0.charAt(r1)
            char[] r2 = f36343b
            boolean r0 = m67529h(r2, r0)
            if (r0 == 0) goto L_0x00fc
            java.lang.StringBuilder r0 = r10.f36346a
            int r3 = r0.length()
            int r3 = r3 - r5
            char r0 = r0.charAt(r3)
            boolean r0 = m67529h(r2, r0)
            if (r0 == 0) goto L_0x00f7
            java.lang.StringBuilder r0 = r10.f36346a
            int r0 = r0.length()
            r2 = 3
            if (r0 <= r2) goto L_0x00f2
            if (r13 == 0) goto L_0x00ab
            com.onedelhi.secure.pf0 r0 = com.onedelhi.secure.pf0.RETURN_CODABAR_START_END
            boolean r13 = r13.containsKey(r0)
            if (r13 != 0) goto L_0x00ba
        L_0x00ab:
            java.lang.StringBuilder r13 = r10.f36346a
            int r0 = r13.length()
            int r0 = r0 - r5
            r13.deleteCharAt(r0)
            java.lang.StringBuilder r13 = r10.f36346a
            r13.deleteCharAt(r1)
        L_0x00ba:
            r13 = 0
            r0 = 0
        L_0x00bc:
            if (r13 >= r12) goto L_0x00c6
            int[] r2 = r10.f36347a
            r2 = r2[r13]
            int r0 = r0 + r2
            int r13 = r13 + 1
            goto L_0x00bc
        L_0x00c6:
            float r13 = (float) r0
        L_0x00c7:
            if (r12 >= r4) goto L_0x00d1
            int[] r2 = r10.f36347a
            r2 = r2[r12]
            int r0 = r0 + r2
            int r12 = r12 + 1
            goto L_0x00c7
        L_0x00d1:
            float r12 = (float) r0
            com.onedelhi.secure.ol3 r0 = new com.onedelhi.secure.ol3
            java.lang.StringBuilder r2 = r10.f36346a
            java.lang.String r2 = r2.toString()
            r3 = 0
            com.onedelhi.secure.sl3[] r4 = new com.onedelhi.secure.sl3[r6]
            com.onedelhi.secure.sl3 r6 = new com.onedelhi.secure.sl3
            float r11 = (float) r11
            r6.<init>(r13, r11)
            r4[r1] = r6
            com.onedelhi.secure.sl3 r13 = new com.onedelhi.secure.sl3
            r13.<init>(r12, r11)
            r4[r5] = r13
            com.onedelhi.secure.yi r11 = com.onedelhi.secure.C7363yi.CODABAR
            r0.<init>(r2, r3, r4, r11)
            return r0
        L_0x00f2:
            com.onedelhi.secure.tr2 r11 = com.onedelhi.secure.tr2.m66179a()
            throw r11
        L_0x00f7:
            com.onedelhi.secure.tr2 r11 = com.onedelhi.secure.tr2.m66179a()
            throw r11
        L_0x00fc:
            com.onedelhi.secure.tr2 r11 = com.onedelhi.secure.tr2.m66179a()
            throw r11
        L_0x0101:
            com.onedelhi.secure.tr2 r11 = com.onedelhi.secure.tr2.m66179a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6988uz.mo31296c(int, com.onedelhi.secure.ll, java.util.Map):com.onedelhi.secure.ol3");
    }

    /* renamed from: i */
    public final void mo45869i(int i) {
        int[] iArr = this.f36347a;
        int i2 = this.f36345a;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f36345a = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f36347a = iArr2;
        }
    }

    /* renamed from: j */
    public final int mo45870j() throws tr2 {
        for (int i = 1; i < this.f36345a; i += 2) {
            int l = mo45872l(i);
            if (l != -1 && m67529h(f36343b, f36340a[l])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f36347a[i3];
                }
                if (i == 1 || this.f36347a[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw tr2.m66179a();
    }

    /* renamed from: k */
    public final void mo45871k(C6014ll llVar) throws tr2 {
        int i = 0;
        this.f36345a = 0;
        int k = llVar.mo39934k(0);
        int l = llVar.mo39935l();
        if (k < l) {
            boolean z = true;
            while (k < l) {
                if (llVar.mo39930h(k) != z) {
                    i++;
                } else {
                    mo45869i(i);
                    z = !z;
                    i = 1;
                }
                k++;
            }
            mo45869i(i);
            return;
        }
        throw tr2.m66179a();
    }

    /* renamed from: l */
    public final int mo45872l(int i) {
        int i2 = i + 7;
        if (i2 >= this.f36345a) {
            return -1;
        }
        int[] iArr = this.f36347a;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = f36344b;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }

    /* renamed from: m */
    public final void mo45873m(int i) throws tr2 {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f36346a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f36344b[this.f36346a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f36347a[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            fArr2[i9] = ((((float) iArr[i8]) / ((float) iArr2[i8])) + (((float) iArr[i9]) / ((float) iArr2[i9]))) / 2.0f;
            fArr[i8] = fArr2[i9];
            fArr[i9] = ((((float) iArr[i9]) * 2.0f) + 1.5f) / ((float) iArr2[i9]);
        }
        loop3:
        while (true) {
            int i10 = f36344b[this.f36346a.charAt(i2)];
            int i11 = 6;
            while (i11 >= 0) {
                int i12 = (i11 & 1) + ((i10 & 1) << 1);
                float f = (float) this.f36347a[i + i11];
                if (f >= fArr2[i12] && f <= fArr[i12]) {
                    i10 >>= 1;
                    i11--;
                }
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw tr2.m66179a();
    }
}

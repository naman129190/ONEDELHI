package com.onedelhi.secure;

public final class xy4 implements xy3 {

    /* renamed from: a */
    public static final int[] f37688a = {0, 1, 2, 2, 3, 3, 3, 3};

    /* renamed from: a */
    public static final boolean[] f37689a = {true, true, true, false, true, false, false, false};

    /* renamed from: a */
    public int f37690a;

    /* renamed from: a */
    public final boolean f37691a;

    /* renamed from: b */
    public int f37692b = 0;

    public xy4(boolean z, int i) {
        this.f37691a = z;
        this.f37690a = i + 5;
    }

    /* renamed from: b */
    public static boolean m70939b(byte b) {
        byte b2 = b & 255;
        return b2 == 0 || b2 == 255;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (m70939b(r11[(r1 + 4) - f37688a[r0]]) != false) goto L_0x00ae;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo38163a(byte[] r11, int r12, int r13) {
        /*
            r10 = this;
            int r0 = r12 + -1
            int r13 = r13 + r12
            int r13 = r13 + -5
            r1 = r12
        L_0x0006:
            r2 = 0
            r3 = 1
            if (r1 > r13) goto L_0x00b8
            byte r4 = r11[r1]
            r4 = r4 & 254(0xfe, float:3.56E-43)
            r5 = 232(0xe8, float:3.25E-43)
            if (r4 == r5) goto L_0x0014
            goto L_0x00b5
        L_0x0014:
            int r0 = r1 - r0
            r4 = r0 & -4
            if (r4 == 0) goto L_0x001d
            r10.f37692b = r2
            goto L_0x0040
        L_0x001d:
            int r2 = r10.f37692b
            int r0 = r0 + -1
            int r0 = r2 << r0
            r0 = r0 & 7
            r10.f37692b = r0
            if (r0 == 0) goto L_0x0040
            boolean[] r2 = f37689a
            boolean r2 = r2[r0]
            if (r2 == 0) goto L_0x00ae
            int r2 = r1 + 4
            int[] r4 = f37688a
            r0 = r4[r0]
            int r2 = r2 - r0
            byte r0 = r11[r2]
            boolean r0 = m70939b(r0)
            if (r0 == 0) goto L_0x0040
            goto L_0x00ae
        L_0x0040:
            int r0 = r1 + 4
            byte r2 = r11[r0]
            boolean r2 = m70939b(r2)
            if (r2 == 0) goto L_0x00ae
            int r2 = r1 + 1
            byte r4 = r11[r2]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r1 + 2
            byte r6 = r11[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r4 = r4 | r6
            int r6 = r1 + 3
            byte r7 = r11[r6]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r4 = r4 | r7
            byte r7 = r11[r0]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 24
            r4 = r4 | r7
        L_0x0069:
            boolean r7 = r10.f37691a
            if (r7 == 0) goto L_0x0073
            int r7 = r10.f37690a
            int r7 = r7 + r1
            int r7 = r7 - r12
            int r4 = r4 + r7
            goto L_0x0078
        L_0x0073:
            int r7 = r10.f37690a
            int r7 = r7 + r1
            int r7 = r7 - r12
            int r4 = r4 - r7
        L_0x0078:
            int r7 = r10.f37692b
            if (r7 != 0) goto L_0x007d
            goto L_0x008e
        L_0x007d:
            int[] r8 = f37688a
            r7 = r8[r7]
            int r7 = r7 * 8
            int r8 = 24 - r7
            int r8 = r4 >>> r8
            byte r8 = (byte) r8
            boolean r8 = m70939b(r8)
            if (r8 != 0) goto L_0x00a7
        L_0x008e:
            byte r7 = (byte) r4
            r11[r2] = r7
            int r2 = r4 >>> 8
            byte r2 = (byte) r2
            r11[r5] = r2
            int r2 = r4 >>> 16
            byte r2 = (byte) r2
            r11[r6] = r2
            int r2 = r4 >>> 24
            r2 = r2 & r3
            int r2 = r2 - r3
            int r2 = ~r2
            byte r2 = (byte) r2
            r11[r0] = r2
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x00b5
        L_0x00a7:
            int r7 = 32 - r7
            int r7 = r3 << r7
            int r7 = r7 - r3
            r4 = r4 ^ r7
            goto L_0x0069
        L_0x00ae:
            int r0 = r10.f37692b
            int r0 = r0 << r3
            r0 = r0 | r3
            r10.f37692b = r0
            r0 = r1
        L_0x00b5:
            int r1 = r1 + r3
            goto L_0x0006
        L_0x00b8:
            int r11 = r1 - r0
            r13 = r11 & -4
            if (r13 == 0) goto L_0x00bf
            goto L_0x00c4
        L_0x00bf:
            int r13 = r10.f37692b
            int r11 = r11 - r3
            int r2 = r13 << r11
        L_0x00c4:
            r10.f37692b = r2
            int r1 = r1 - r12
            int r11 = r10.f37690a
            int r11 = r11 + r1
            r10.f37690a = r11
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xy4.mo38163a(byte[], int, int):int");
    }
}

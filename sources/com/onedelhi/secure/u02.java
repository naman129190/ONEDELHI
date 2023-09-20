package com.onedelhi.secure;

public final class u02 extends t02 {

    /* renamed from: A */
    public static final int f35862A = 1;

    /* renamed from: B */
    public static final int f35863B = 272;

    /* renamed from: a */
    public fe2 f35864a = null;

    public u02(ve3 ve3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C4477aa aaVar) {
        super(ve3, k02.m53925g(i4, Math.max(i5, 1), f35863B, i6, 273, i7, i8, aaVar), i, i2, i3, i4, i6);
    }

    /* renamed from: F */
    public static int m66322F(int i, int i2, int i3) {
        return k02.m53926k(i, Math.max(i2, 1), f35863B, 273, i3);
    }

    /* renamed from: E */
    public final boolean mo45351E(int i, int i2) {
        return i < (i2 >>> 7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bb  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo44706u() {
        /*
            r13 = this;
            int r0 = r13.f35307s
            r1 = -1
            if (r0 != r1) goto L_0x000b
            com.onedelhi.secure.fe2 r0 = r13.mo44705s()
            r13.f35864a = r0
        L_0x000b:
            r13.f35306r = r1
            com.onedelhi.secure.k02 r0 = r13.f35294a
            int r0 = r0.mo38968c()
            r1 = 273(0x111, float:3.83E-43)
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L_0x001e
            return r2
        L_0x001e:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0022:
            r7 = 4
            if (r4 >= r7) goto L_0x0045
            com.onedelhi.secure.k02 r7 = r13.f35294a
            int[] r8 = r13.f34429a
            r8 = r8[r4]
            int r7 = r7.mo38971h(r8, r0)
            if (r7 >= r1) goto L_0x0032
            goto L_0x0042
        L_0x0032:
            int r8 = r13.f35302n
            if (r7 < r8) goto L_0x003e
            r13.f35306r = r4
            int r0 = r7 + -1
            r13.mo44688A(r0)
            return r7
        L_0x003e:
            if (r7 <= r5) goto L_0x0042
            r6 = r4
            r5 = r7
        L_0x0042:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x0045:
            com.onedelhi.secure.fe2 r4 = r13.f35864a
            int r8 = r4.f28271a
            if (r8 <= 0) goto L_0x009a
            int[] r9 = r4.f28272a
            int r10 = r8 + -1
            r9 = r9[r10]
            int[] r4 = r4.f28273b
            int r8 = r8 - r2
            r4 = r4[r8]
            int r8 = r13.f35302n
            if (r9 < r8) goto L_0x0063
            int r4 = r4 + r7
            r13.f35306r = r4
            int r0 = r9 + -1
        L_0x005f:
            r13.mo44688A(r0)
            return r9
        L_0x0063:
            com.onedelhi.secure.fe2 r8 = r13.f35864a
            int r10 = r8.f28271a
            if (r10 <= r2) goto L_0x0092
            int[] r11 = r8.f28272a
            int r12 = r10 + -2
            r11 = r11[r12]
            int r11 = r11 + r2
            if (r9 != r11) goto L_0x0092
            int[] r8 = r8.f28273b
            int r10 = r10 + -2
            r8 = r8[r10]
            boolean r8 = r13.mo45351E(r8, r4)
            if (r8 != 0) goto L_0x007f
            goto L_0x0092
        L_0x007f:
            com.onedelhi.secure.fe2 r4 = r13.f35864a
            int r8 = r4.f28271a
            int r8 = r8 - r2
            r4.f28271a = r8
            int[] r9 = r4.f28272a
            int r10 = r8 + -1
            r9 = r9[r10]
            int[] r4 = r4.f28273b
            int r8 = r8 - r2
            r4 = r4[r8]
            goto L_0x0063
        L_0x0092:
            if (r9 != r1) goto L_0x009c
            r8 = 128(0x80, float:1.794E-43)
            if (r4 < r8) goto L_0x009c
            r9 = 1
            goto L_0x009c
        L_0x009a:
            r4 = 0
            r9 = 0
        L_0x009c:
            if (r5 < r1) goto L_0x00bb
            int r8 = r5 + 1
            if (r8 >= r9) goto L_0x00b3
            int r8 = r5 + 2
            if (r8 < r9) goto L_0x00aa
            r8 = 512(0x200, float:7.175E-43)
            if (r4 >= r8) goto L_0x00b3
        L_0x00aa:
            int r8 = r5 + 3
            if (r8 < r9) goto L_0x00bb
            r8 = 32768(0x8000, float:4.5918E-41)
            if (r4 < r8) goto L_0x00bb
        L_0x00b3:
            r13.f35306r = r6
            int r0 = r5 + -1
            r13.mo44688A(r0)
            return r5
        L_0x00bb:
            if (r9 < r1) goto L_0x0111
            if (r0 > r1) goto L_0x00c0
            goto L_0x0111
        L_0x00c0:
            com.onedelhi.secure.fe2 r0 = r13.mo44705s()
            r13.f35864a = r0
            int r5 = r0.f28271a
            if (r5 <= 0) goto L_0x00f2
            int[] r6 = r0.f28272a
            int r8 = r5 + -1
            r6 = r6[r8]
            int[] r0 = r0.f28273b
            int r5 = r5 - r2
            r0 = r0[r5]
            if (r6 < r9) goto L_0x00d9
            if (r0 < r4) goto L_0x00f1
        L_0x00d9:
            int r5 = r9 + 1
            if (r6 != r5) goto L_0x00e3
            boolean r8 = r13.mo45351E(r4, r0)
            if (r8 == 0) goto L_0x00f1
        L_0x00e3:
            if (r6 > r5) goto L_0x00f1
            int r6 = r6 + r2
            if (r6 < r9) goto L_0x00f2
            r5 = 3
            if (r9 < r5) goto L_0x00f2
            boolean r0 = r13.mo45351E(r0, r4)
            if (r0 == 0) goto L_0x00f2
        L_0x00f1:
            return r2
        L_0x00f2:
            int r0 = r9 + -1
            int r0 = java.lang.Math.max(r0, r1)
        L_0x00f8:
            if (r3 >= r7) goto L_0x010a
            com.onedelhi.secure.k02 r1 = r13.f35294a
            int[] r5 = r13.f34429a
            r5 = r5[r3]
            int r1 = r1.mo38971h(r5, r0)
            if (r1 != r0) goto L_0x0107
            return r2
        L_0x0107:
            int r3 = r3 + 1
            goto L_0x00f8
        L_0x010a:
            int r4 = r4 + r7
            r13.f35306r = r4
            int r0 = r9 + -2
            goto L_0x005f
        L_0x0111:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.u02.mo44706u():int");
    }
}

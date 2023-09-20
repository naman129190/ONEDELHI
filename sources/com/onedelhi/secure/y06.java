package com.onedelhi.secure;

import com.onedelhi.secure.m10;
import java.io.IOException;

public final class y06 {
    /* renamed from: a */
    public static int m31813a(byte[] bArr, int i, u06 u06) throws t66 {
        int j = m31822j(bArr, i, u06);
        int i2 = u06.f21191a;
        if (i2 < 0) {
            throw t66.m28136c();
        } else if (i2 > bArr.length - j) {
            throw t66.m28138f();
        } else if (i2 == 0) {
            u06.f21194a = i36.f13476a;
            return j;
        } else {
            u06.f21194a = i36.m17166o(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    public static int m31814b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    public static int m31815c(mb6 mb6, byte[] bArr, int i, int i2, int i3, u06 u06) throws IOException {
        r96 r96 = (r96) mb6;
        Object f = r96.mo20298f();
        int r = r96.mo23743r(f, bArr, i, i2, i3, u06);
        r96.mo20295c(f);
        u06.f21194a = f;
        return r;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m31816d(com.onedelhi.secure.mb6 r6, byte[] r7, int r8, int r9, com.onedelhi.secure.u06 r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m31823k(r8, r7, r0, r10)
            int r8 = r10.f21191a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo20298f()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo20296d(r1, r2, r3, r4, r5)
            r6.mo20295c(r9)
            r10.f21194a = r9
            return r8
        L_0x0025:
            com.onedelhi.secure.t66 r6 = com.onedelhi.secure.t66.m28138f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.y06.m31816d(com.onedelhi.secure.mb6, byte[], int, int, com.onedelhi.secure.u06):int");
    }

    /* renamed from: e */
    public static int m31817e(mb6 mb6, int i, byte[] bArr, int i2, int i3, q56 q56, u06 u06) throws IOException {
        int d = m31816d(mb6, bArr, i2, i3, u06);
        while (true) {
            q56.add(u06.f21194a);
            if (d >= i3) {
                break;
            }
            int j = m31822j(bArr, d, u06);
            if (i != u06.f21191a) {
                break;
            }
            d = m31816d(mb6, bArr, j, i3, u06);
        }
        return d;
    }

    /* renamed from: f */
    public static int m31818f(byte[] bArr, int i, q56 q56, u06 u06) throws IOException {
        h56 h56 = (h56) q56;
        int j = m31822j(bArr, i, u06);
        int i2 = u06.f21191a + j;
        while (j < i2) {
            j = m31822j(bArr, j, u06);
            h56.mo17067e(u06.f21191a);
        }
        if (j == i2) {
            return j;
        }
        throw t66.m28138f();
    }

    /* renamed from: g */
    public static int m31819g(byte[] bArr, int i, u06 u06) throws t66 {
        int j = m31822j(bArr, i, u06);
        int i2 = u06.f21191a;
        if (i2 < 0) {
            throw t66.m28136c();
        } else if (i2 == 0) {
            u06.f21194a = "";
            return j;
        } else {
            u06.f21194a = new String(bArr, j, i2, t56.f20660b);
            return j + i2;
        }
    }

    /* renamed from: h */
    public static int m31820h(byte[] bArr, int i, u06 u06) throws t66 {
        int j = m31822j(bArr, i, u06);
        int i2 = u06.f21191a;
        if (i2 < 0) {
            throw t66.m28136c();
        } else if (i2 == 0) {
            u06.f21194a = "";
            return j;
        } else {
            u06.f21194a = wf6.m30810b(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    public static int m31821i(int i, byte[] bArr, int i2, int i3, od6 od6, u06 u06) throws t66 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m31825m(bArr, i2, u06);
                od6.mo21901f(i, Long.valueOf(u06.f21192a));
                return m;
            } else if (i4 == 1) {
                od6.mo21901f(i, Long.valueOf(m31826n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m31822j(bArr, i2, u06);
                int i5 = u06.f21191a;
                if (i5 < 0) {
                    throw t66.m28136c();
                } else if (i5 <= bArr.length - j) {
                    od6.mo21901f(i, i5 == 0 ? i36.f13476a : i36.m17166o(bArr, j, i5));
                    return j + i5;
                } else {
                    throw t66.m28138f();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                od6 c = od6.m23711c();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m31822j(bArr, i2, u06);
                    int i8 = u06.f21191a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = j2;
                        break;
                    }
                    int i9 = m31821i(i7, bArr, j2, i3, c, u06);
                    i7 = i8;
                    i2 = i9;
                }
                if (i2 > i3 || i7 != i6) {
                    throw t66.m28137d();
                }
                od6.mo21901f(i, c);
                return i2;
            } else if (i4 == 5) {
                od6.mo21901f(i, Integer.valueOf(m31814b(bArr, i2)));
                return i2 + 4;
            } else {
                throw t66.m28134a();
            }
        } else {
            throw t66.m28134a();
        }
    }

    /* renamed from: j */
    public static int m31822j(byte[] bArr, int i, u06 u06) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m31823k(b, bArr, i2, u06);
        }
        u06.f21191a = b;
        return i2;
    }

    /* renamed from: k */
    public static int m31823k(int i, byte[] bArr, int i2, u06 u06) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << m10.C2800f.f15783a;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << m10.C2800f.f15783a);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] < 0) {
                                i8 = i10;
                            } else {
                                u06.f21191a = i9;
                                return i10;
                            }
                        }
                    }
                }
            }
            u06.f21191a = i7 | i3;
            return i8;
        }
        u06.f21191a = i5 | i4;
        return i6;
    }

    /* renamed from: l */
    public static int m31824l(int i, byte[] bArr, int i2, int i3, q56 q56, u06 u06) {
        h56 h56 = (h56) q56;
        int j = m31822j(bArr, i2, u06);
        while (true) {
            h56.mo17067e(u06.f21191a);
            if (j >= i3) {
                break;
            }
            int j2 = m31822j(bArr, j, u06);
            if (i != u06.f21191a) {
                break;
            }
            j = m31822j(bArr, j2, u06);
        }
        return j;
    }

    /* renamed from: m */
    public static int m31825m(byte[] bArr, int i, u06 u06) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            u06.f21192a = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        u06.f21192a = j2;
        return i3;
    }

    /* renamed from: n */
    public static long m31826n(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}

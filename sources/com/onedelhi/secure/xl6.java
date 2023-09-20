package com.onedelhi.secure;

import com.onedelhi.secure.m10;
import java.io.IOException;

public final class xl6 {
    /* renamed from: a */
    public static int m31534a(byte[] bArr, int i, vl6 vl6) throws dr6 {
        int j = m31543j(bArr, i, vl6);
        int i2 = vl6.f21853a;
        if (i2 < 0) {
            throw dr6.m13275d();
        } else if (i2 > bArr.length - j) {
            throw dr6.m13277f();
        } else if (i2 == 0) {
            vl6.f21856a = on6.f18031a;
            return j;
        } else {
            vl6.f21856a = on6.m23919r(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    public static int m31535b(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    public static int m31536c(gt6 gt6, byte[] bArr, int i, int i2, int i3, vl6 vl6) throws IOException {
        Object h = gt6.mo16914h();
        int n = m31547n(h, gt6, bArr, i, i2, i3, vl6);
        gt6.mo16909c(h);
        vl6.f21856a = h;
        return n;
    }

    /* renamed from: d */
    public static int m31537d(gt6 gt6, byte[] bArr, int i, int i2, vl6 vl6) throws IOException {
        Object h = gt6.mo16914h();
        int o = m31548o(h, gt6, bArr, i, i2, vl6);
        gt6.mo16909c(h);
        vl6.f21856a = h;
        return o;
    }

    /* renamed from: e */
    public static int m31538e(gt6 gt6, int i, byte[] bArr, int i2, int i3, xq6 xq6, vl6 vl6) throws IOException {
        int d = m31537d(gt6, bArr, i2, i3, vl6);
        while (true) {
            xq6.add(vl6.f21856a);
            if (d >= i3) {
                break;
            }
            int j = m31543j(bArr, d, vl6);
            if (i != vl6.f21853a) {
                break;
            }
            d = m31537d(gt6, bArr, j, i3, vl6);
        }
        return d;
    }

    /* renamed from: f */
    public static int m31539f(byte[] bArr, int i, xq6 xq6, vl6 vl6) throws IOException {
        lq6 lq6 = (lq6) xq6;
        int j = m31543j(bArr, i, vl6);
        int i2 = vl6.f21853a + j;
        while (j < i2) {
            j = m31543j(bArr, j, vl6);
            lq6.mo19758g(vl6.f21853a);
        }
        if (j == i2) {
            return j;
        }
        throw dr6.m13277f();
    }

    /* renamed from: g */
    public static int m31540g(byte[] bArr, int i, vl6 vl6) throws dr6 {
        int j = m31543j(bArr, i, vl6);
        int i2 = vl6.f21853a;
        if (i2 < 0) {
            throw dr6.m13275d();
        } else if (i2 == 0) {
            vl6.f21856a = "";
            return j;
        } else {
            vl6.f21856a = new String(bArr, j, i2, zq6.f23859b);
            return j + i2;
        }
    }

    /* renamed from: h */
    public static int m31541h(byte[] bArr, int i, vl6 vl6) throws dr6 {
        int i2;
        int i3;
        int j = m31543j(bArr, i, vl6);
        int i4 = vl6.f21853a;
        if (i4 < 0) {
            throw dr6.m13275d();
        } else if (i4 == 0) {
            vl6.f21856a = "";
            return j;
        } else {
            int i5 = ev6.f11730a;
            int length = bArr.length;
            if ((((length - j) - i4) | j | i4) >= 0) {
                int i6 = j + i4;
                char[] cArr = new char[i4];
                int i7 = 0;
                while (i2 < i6) {
                    byte b = bArr[i2];
                    if (!av6.m11439d(b)) {
                        break;
                    }
                    j = i2 + 1;
                    cArr[i3] = (char) b;
                    i7 = i3 + 1;
                }
                while (i2 < i6) {
                    int i8 = i2 + 1;
                    byte b2 = bArr[i2];
                    if (av6.m11439d(b2)) {
                        int i9 = i3 + 1;
                        cArr[i3] = (char) b2;
                        i2 = i8;
                        while (true) {
                            i3 = i9;
                            if (i2 >= i6) {
                                break;
                            }
                            byte b3 = bArr[i2];
                            if (!av6.m11439d(b3)) {
                                break;
                            }
                            i2++;
                            i9 = i3 + 1;
                            cArr[i3] = (char) b3;
                        }
                    } else if (b2 < -32) {
                        if (i8 < i6) {
                            av6.m11438c(b2, bArr[i8], cArr, i3);
                            i2 = i8 + 1;
                            i3++;
                        } else {
                            throw dr6.m13274c();
                        }
                    } else if (b2 < -16) {
                        if (i8 < i6 - 1) {
                            int i10 = i8 + 1;
                            av6.m11437b(b2, bArr[i8], bArr[i10], cArr, i3);
                            i2 = i10 + 1;
                            i3++;
                        } else {
                            throw dr6.m13274c();
                        }
                    } else if (i8 < i6 - 2) {
                        int i11 = i8 + 1;
                        byte b4 = bArr[i8];
                        int i12 = i11 + 1;
                        av6.m11436a(b2, b4, bArr[i11], bArr[i12], cArr, i3);
                        i3 += 2;
                        i2 = i12 + 1;
                    } else {
                        throw dr6.m13274c();
                    }
                }
                vl6.f21856a = new String(cArr, 0, i3);
                return i6;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(j), Integer.valueOf(i4)}));
        }
    }

    /* renamed from: i */
    public static int m31542i(int i, byte[] bArr, int i2, int i3, qu6 qu6, vl6 vl6) throws dr6 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m31546m(bArr, i2, vl6);
                qu6.mo23454j(i, Long.valueOf(vl6.f21854a));
                return m;
            } else if (i4 == 1) {
                qu6.mo23454j(i, Long.valueOf(m31549p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m31543j(bArr, i2, vl6);
                int i5 = vl6.f21853a;
                if (i5 < 0) {
                    throw dr6.m13275d();
                } else if (i5 <= bArr.length - j) {
                    qu6.mo23454j(i, i5 == 0 ? on6.f18031a : on6.m23919r(bArr, j, i5));
                    return j + i5;
                } else {
                    throw dr6.m13277f();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                qu6 f = qu6.m26177f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m31543j(bArr, i2, vl6);
                    int i8 = vl6.f21853a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = j2;
                        break;
                    }
                    int i9 = m31542i(i7, bArr, j2, i3, f, vl6);
                    i7 = i8;
                    i2 = i9;
                }
                if (i2 > i3 || i7 != i6) {
                    throw dr6.m13276e();
                }
                qu6.mo23454j(i, f);
                return i2;
            } else if (i4 == 5) {
                qu6.mo23454j(i, Integer.valueOf(m31535b(bArr, i2)));
                return i2 + 4;
            } else {
                throw dr6.m13273b();
            }
        } else {
            throw dr6.m13273b();
        }
    }

    /* renamed from: j */
    public static int m31543j(byte[] bArr, int i, vl6 vl6) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m31544k(b, bArr, i2, vl6);
        }
        vl6.f21853a = b;
        return i2;
    }

    /* renamed from: k */
    public static int m31544k(int i, byte[] bArr, int i2, vl6 vl6) {
        int i3;
        int i4;
        byte b = bArr[i2];
        int i5 = i2 + 1;
        int i6 = i & 127;
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i6 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i5 + 1;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i6 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i5 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i6 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i5 + 1;
                    byte b4 = bArr[i5];
                    if (b4 >= 0) {
                        i3 = b4 << m10.C2800f.f15783a;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << m10.C2800f.f15783a);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] < 0) {
                                i8 = i10;
                            } else {
                                vl6.f21853a = i9;
                                return i10;
                            }
                        }
                    }
                }
            }
            vl6.f21853a = i7 | i3;
            return i8;
        }
        vl6.f21853a = i6 | i4;
        return i5;
    }

    /* renamed from: l */
    public static int m31545l(int i, byte[] bArr, int i2, int i3, xq6 xq6, vl6 vl6) {
        lq6 lq6 = (lq6) xq6;
        int j = m31543j(bArr, i2, vl6);
        while (true) {
            lq6.mo19758g(vl6.f21853a);
            if (j >= i3) {
                break;
            }
            int j2 = m31543j(bArr, j, vl6);
            if (i != vl6.f21853a) {
                break;
            }
            j = m31543j(bArr, j2, vl6);
        }
        return j;
    }

    /* renamed from: m */
    public static int m31546m(byte[] bArr, int i, vl6 vl6) {
        long j = (long) bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            vl6.f21854a = j;
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
            byte b3 = b2;
            i3 = i5;
            b = b3;
        }
        vl6.f21854a = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m31547n(Object obj, gt6 gt6, byte[] bArr, int i, int i2, int i3, vl6 vl6) throws IOException {
        int F = ((ys6) gt6).mo27682F(obj, bArr, i, i2, i3, vl6);
        vl6.f21856a = obj;
        return F;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m31548o(java.lang.Object r6, com.onedelhi.secure.gt6 r7, byte[] r8, int r9, int r10, com.onedelhi.secure.vl6 r11) throws java.io.IOException {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = m31544k(r9, r8, r0, r11)
            int r9 = r11.f21853a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.mo16910d(r1, r2, r3, r4, r5)
            r11.f21856a = r6
            return r9
        L_0x001e:
            com.onedelhi.secure.dr6 r6 = com.onedelhi.secure.dr6.m13277f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xl6.m31548o(java.lang.Object, com.onedelhi.secure.gt6, byte[], int, int, com.onedelhi.secure.vl6):int");
    }

    /* renamed from: p */
    public static long m31549p(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}

package com.onedelhi.secure;

import com.onedelhi.secure.m10;
import com.onedelhi.secure.qe1;
import com.onedelhi.secure.vs1;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.onedelhi.secure.da */
public final class C4992da {

    /* renamed from: com.onedelhi.secure.da$a */
    public static /* synthetic */ class C4993a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27350a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.wx4$b[] r0 = com.onedelhi.secure.wx4.C7195b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27350a = r0
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.FIXED32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.BOOL     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f27350a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.onedelhi.secure.wx4$b r1 = com.onedelhi.secure.wx4.C7195b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4992da.C4993a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.da$b */
    public static final class C4994b {

        /* renamed from: a */
        public int f27351a;

        /* renamed from: a */
        public long f27352a;

        /* renamed from: a */
        public final zy0 f27353a;

        /* renamed from: a */
        public Object f27354a;

        public C4994b() {
            this.f27353a = zy0.m74393d();
        }

        public C4994b(zy0 zy0) {
            Objects.requireNonNull(zy0);
            this.f27353a = zy0;
        }
    }

    /* renamed from: A */
    public static int m44904A(int i, byte[] bArr, int i2, int i3, vs1.C7095k<?> kVar, C4994b bVar) {
        as1 as1 = (as1) kVar;
        int I = m44912I(bArr, i2, bVar);
        while (true) {
            as1.mo31124G0(g00.m48668b(bVar.f27351a));
            if (I >= i3) {
                break;
            }
            int I2 = m44912I(bArr, I, bVar);
            if (i != bVar.f27351a) {
                break;
            }
            I = m44912I(bArr, I2, bVar);
        }
        return I;
    }

    /* renamed from: B */
    public static int m44905B(int i, byte[] bArr, int i2, int i3, vs1.C7095k<?> kVar, C4994b bVar) {
        v92 v92 = (v92) kVar;
        int L = m44915L(bArr, i2, bVar);
        while (true) {
            v92.mo46036L1(g00.m48669c(bVar.f27352a));
            if (L >= i3) {
                break;
            }
            int I = m44912I(bArr, L, bVar);
            if (i != bVar.f27351a) {
                break;
            }
            L = m44915L(bArr, I, bVar);
        }
        return L;
    }

    /* renamed from: C */
    public static int m44906C(byte[] bArr, int i, C4994b bVar) throws nt1 {
        int I = m44912I(bArr, i, bVar);
        int i2 = bVar.f27351a;
        if (i2 < 0) {
            throw nt1.m58787h();
        } else if (i2 == 0) {
            bVar.f27354a = "";
            return I;
        } else {
            bVar.f27354a = new String(bArr, I, i2, vs1.f36665a);
            return I + i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m44907D(int r4, byte[] r5, int r6, int r7, com.onedelhi.secure.vs1.C7095k<?> r8, com.onedelhi.secure.C4992da.C4994b r9) throws com.onedelhi.secure.nt1 {
        /*
            int r6 = m44912I(r5, r6, r9)
            int r0 = r9.f27351a
            if (r0 < 0) goto L_0x003f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.onedelhi.secure.vs1.f36665a
            r2.<init>(r5, r6, r0, r3)
        L_0x0017:
            r8.add(r2)
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x003e
            int r0 = m44912I(r5, r6, r9)
            int r2 = r9.f27351a
            if (r4 == r2) goto L_0x0026
            goto L_0x003e
        L_0x0026:
            int r6 = m44912I(r5, r0, r9)
            int r0 = r9.f27351a
            if (r0 < 0) goto L_0x0039
            if (r0 != 0) goto L_0x0031
            goto L_0x000c
        L_0x0031:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.onedelhi.secure.vs1.f36665a
            r2.<init>(r5, r6, r0, r3)
            goto L_0x0017
        L_0x0039:
            com.onedelhi.secure.nt1 r4 = com.onedelhi.secure.nt1.m58787h()
            throw r4
        L_0x003e:
            return r6
        L_0x003f:
            com.onedelhi.secure.nt1 r4 = com.onedelhi.secure.nt1.m58787h()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4992da.m44907D(int, byte[], int, int, com.onedelhi.secure.vs1$k, com.onedelhi.secure.da$b):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m44908E(int r5, byte[] r6, int r7, int r8, com.onedelhi.secure.vs1.C7095k<?> r9, com.onedelhi.secure.C4992da.C4994b r10) throws com.onedelhi.secure.nt1 {
        /*
            int r7 = m44912I(r6, r7, r10)
            int r0 = r10.f27351a
            if (r0 < 0) goto L_0x0059
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            r9.add(r1)
            goto L_0x0023
        L_0x0010:
            int r2 = r7 + r0
            boolean r3 = com.onedelhi.secure.hq4.m50772u(r6, r7, r2)
            if (r3 == 0) goto L_0x0054
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.onedelhi.secure.vs1.f36665a
            r3.<init>(r6, r7, r0, r4)
        L_0x001f:
            r9.add(r3)
            r7 = r2
        L_0x0023:
            if (r7 >= r8) goto L_0x0053
            int r0 = m44912I(r6, r7, r10)
            int r2 = r10.f27351a
            if (r5 == r2) goto L_0x002e
            goto L_0x0053
        L_0x002e:
            int r7 = m44912I(r6, r0, r10)
            int r0 = r10.f27351a
            if (r0 < 0) goto L_0x004e
            if (r0 != 0) goto L_0x0039
            goto L_0x000c
        L_0x0039:
            int r2 = r7 + r0
            boolean r3 = com.onedelhi.secure.hq4.m50772u(r6, r7, r2)
            if (r3 == 0) goto L_0x0049
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.onedelhi.secure.vs1.f36665a
            r3.<init>(r6, r7, r0, r4)
            goto L_0x001f
        L_0x0049:
            com.onedelhi.secure.nt1 r5 = com.onedelhi.secure.nt1.m58784e()
            throw r5
        L_0x004e:
            com.onedelhi.secure.nt1 r5 = com.onedelhi.secure.nt1.m58787h()
            throw r5
        L_0x0053:
            return r7
        L_0x0054:
            com.onedelhi.secure.nt1 r5 = com.onedelhi.secure.nt1.m58784e()
            throw r5
        L_0x0059:
            com.onedelhi.secure.nt1 r5 = com.onedelhi.secure.nt1.m58787h()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4992da.m44908E(int, byte[], int, int, com.onedelhi.secure.vs1$k, com.onedelhi.secure.da$b):int");
    }

    /* renamed from: F */
    public static int m44909F(byte[] bArr, int i, C4994b bVar) throws nt1 {
        int I = m44912I(bArr, i, bVar);
        int i2 = bVar.f27351a;
        if (i2 < 0) {
            throw nt1.m58787h();
        } else if (i2 == 0) {
            bVar.f27354a = "";
            return I;
        } else {
            bVar.f27354a = hq4.m50759h(bArr, I, i2);
            return I + i2;
        }
    }

    /* renamed from: G */
    public static int m44910G(int i, byte[] bArr, int i2, int i3, bo4 bo4, C4994b bVar) throws nt1 {
        if (wx4.m69698a(i) != 0) {
            int b = wx4.m69699b(i);
            if (b == 0) {
                int L = m44915L(bArr, i2, bVar);
                bo4.mo31970q(i, Long.valueOf(bVar.f27352a));
                return L;
            } else if (b == 1) {
                bo4.mo31970q(i, Long.valueOf(m44927j(bArr, i2)));
                return i2 + 8;
            } else if (b == 2) {
                int I = m44912I(bArr, i2, bVar);
                int i4 = bVar.f27351a;
                if (i4 < 0) {
                    throw nt1.m58787h();
                } else if (i4 <= bArr.length - I) {
                    bo4.mo31970q(i, i4 == 0 ? C5173er.f28039a : C5173er.m47135v(bArr, I, i4));
                    return I + i4;
                } else {
                    throw nt1.m58791n();
                }
            } else if (b == 3) {
                bo4 n = bo4.m40225n();
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int I2 = m44912I(bArr, i2, bVar);
                    int i7 = bVar.f27351a;
                    i6 = i7;
                    if (i7 == i5) {
                        i2 = I2;
                        break;
                    }
                    int G = m44910G(i6, bArr, I2, i3, n, bVar);
                    i6 = i7;
                    i2 = G;
                }
                if (i2 > i3 || i6 != i5) {
                    throw nt1.m58788i();
                }
                bo4.mo31970q(i, n);
                return i2;
            } else if (b == 5) {
                bo4.mo31970q(i, Integer.valueOf(m44925h(bArr, i2)));
                return i2 + 4;
            } else {
                throw nt1.m58783d();
            }
        } else {
            throw nt1.m58783d();
        }
    }

    /* renamed from: H */
    public static int m44911H(int i, byte[] bArr, int i2, C4994b bVar) {
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
                                bVar.f27351a = i9;
                                return i10;
                            }
                        }
                    }
                }
            }
            bVar.f27351a = i7 | i3;
            return i8;
        }
        bVar.f27351a = i5 | i4;
        return i6;
    }

    /* renamed from: I */
    public static int m44912I(byte[] bArr, int i, C4994b bVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m44911H(b, bArr, i2, bVar);
        }
        bVar.f27351a = b;
        return i2;
    }

    /* renamed from: J */
    public static int m44913J(int i, byte[] bArr, int i2, int i3, vs1.C7095k<?> kVar, C4994b bVar) {
        as1 as1 = (as1) kVar;
        int I = m44912I(bArr, i2, bVar);
        while (true) {
            as1.mo31124G0(bVar.f27351a);
            if (I >= i3) {
                break;
            }
            int I2 = m44912I(bArr, I, bVar);
            if (i != bVar.f27351a) {
                break;
            }
            I = m44912I(bArr, I2, bVar);
        }
        return I;
    }

    /* renamed from: K */
    public static int m44914K(long j, byte[] bArr, int i, C4994b bVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i3;
            byte b3 = b2;
            i2 = i4;
            b = b3;
        }
        bVar.f27352a = j2;
        return i2;
    }

    /* renamed from: L */
    public static int m44915L(byte[] bArr, int i, C4994b bVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            return m44914K(j, bArr, i2, bVar);
        }
        bVar.f27352a = j;
        return i2;
    }

    /* renamed from: M */
    public static int m44916M(int i, byte[] bArr, int i2, int i3, vs1.C7095k<?> kVar, C4994b bVar) {
        v92 v92 = (v92) kVar;
        int L = m44915L(bArr, i2, bVar);
        while (true) {
            v92.mo46036L1(bVar.f27352a);
            if (L >= i3) {
                break;
            }
            int I = m44912I(bArr, L, bVar);
            if (i != bVar.f27351a) {
                break;
            }
            L = m44915L(bArr, I, bVar);
        }
        return L;
    }

    /* renamed from: N */
    public static int m44917N(int i, byte[] bArr, int i2, int i3, C4994b bVar) throws nt1 {
        if (wx4.m69698a(i) != 0) {
            int b = wx4.m69699b(i);
            if (b == 0) {
                return m44915L(bArr, i2, bVar);
            }
            if (b == 1) {
                return i2 + 8;
            }
            if (b == 2) {
                return m44912I(bArr, i2, bVar) + bVar.f27351a;
            }
            if (b == 3) {
                int i4 = (i & -8) | 4;
                int i5 = 0;
                while (i2 < i3) {
                    i2 = m44912I(bArr, i2, bVar);
                    i5 = bVar.f27351a;
                    if (i5 == i4) {
                        break;
                    }
                    i2 = m44917N(i5, bArr, i2, i3, bVar);
                }
                if (i2 <= i3 && i5 == i4) {
                    return i2;
                }
                throw nt1.m58788i();
            } else if (b == 5) {
                return i2 + 4;
            } else {
                throw nt1.m58783d();
            }
        } else {
            throw nt1.m58783d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x000e, code lost:
        if (r12.f27352a != 0) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r11.mo40703S0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r9 >= r10) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = m44912I(r8, r9, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r7 == r12.f27351a) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r9 = m44915L(r8, r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r12.f27352a == 0) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m44918a(int r7, byte[] r8, int r9, int r10, com.onedelhi.secure.vs1.C7095k<?> r11, com.onedelhi.secure.C4992da.C4994b r12) {
        /*
            com.onedelhi.secure.mn r11 = (com.onedelhi.secure.C6126mn) r11
            int r9 = m44915L(r8, r9, r12)
            long r0 = r12.f27352a
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r11.mo40703S0(r0)
            if (r9 >= r10) goto L_0x002c
            int r0 = m44912I(r8, r9, r12)
            int r1 = r12.f27351a
            if (r7 == r1) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            int r9 = m44915L(r8, r0, r12)
            long r0 = r12.f27352a
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0012
            goto L_0x0010
        L_0x002c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4992da.m44918a(int, byte[], int, int, com.onedelhi.secure.vs1$k, com.onedelhi.secure.da$b):int");
    }

    /* renamed from: b */
    public static int m44919b(byte[] bArr, int i, C4994b bVar) throws nt1 {
        int I = m44912I(bArr, i, bVar);
        int i2 = bVar.f27351a;
        if (i2 < 0) {
            throw nt1.m58787h();
        } else if (i2 > bArr.length - I) {
            throw nt1.m58791n();
        } else if (i2 == 0) {
            bVar.f27354a = C5173er.f28039a;
            return I;
        } else {
            bVar.f27354a = C5173er.m47135v(bArr, I, i2);
            return I + i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r4 = m44912I(r3, r0, r7);
        r0 = r7.f27351a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r0 < 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 > (r3.length - r4)) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r0 != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        throw com.onedelhi.secure.nt1.m58791n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        throw com.onedelhi.secure.nt1.m58787h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r0 == 0) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r6.add(com.onedelhi.secure.C5173er.f28039a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r6.add(com.onedelhi.secure.C5173er.m47135v(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r4 >= r5) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = m44912I(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r2 == r7.f27351a) goto L_0x0027;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m44920c(int r2, byte[] r3, int r4, int r5, com.onedelhi.secure.vs1.C7095k<?> r6, com.onedelhi.secure.C4992da.C4994b r7) throws com.onedelhi.secure.nt1 {
        /*
            int r4 = m44912I(r3, r4, r7)
            int r0 = r7.f27351a
            if (r0 < 0) goto L_0x0046
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0041
            if (r0 != 0) goto L_0x0014
        L_0x000e:
            com.onedelhi.secure.er r0 = com.onedelhi.secure.C5173er.f28039a
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            com.onedelhi.secure.er r1 = com.onedelhi.secure.C5173er.m47135v(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x0040
            int r0 = m44912I(r3, r4, r7)
            int r1 = r7.f27351a
            if (r2 == r1) goto L_0x0027
            goto L_0x0040
        L_0x0027:
            int r4 = m44912I(r3, r0, r7)
            int r0 = r7.f27351a
            if (r0 < 0) goto L_0x003b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0036
            if (r0 != 0) goto L_0x0014
            goto L_0x000e
        L_0x0036:
            com.onedelhi.secure.nt1 r2 = com.onedelhi.secure.nt1.m58791n()
            throw r2
        L_0x003b:
            com.onedelhi.secure.nt1 r2 = com.onedelhi.secure.nt1.m58787h()
            throw r2
        L_0x0040:
            return r4
        L_0x0041:
            com.onedelhi.secure.nt1 r2 = com.onedelhi.secure.nt1.m58791n()
            throw r2
        L_0x0046:
            com.onedelhi.secure.nt1 r2 = com.onedelhi.secure.nt1.m58787h()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4992da.m44920c(int, byte[], int, int, com.onedelhi.secure.vs1$k, com.onedelhi.secure.da$b):int");
    }

    /* renamed from: d */
    public static double m44921d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m44927j(bArr, i));
    }

    /* renamed from: e */
    public static int m44922e(int i, byte[] bArr, int i2, int i3, vs1.C7095k<?> kVar, C4994b bVar) {
        do0 do0 = (do0) kVar;
        do0.mo34579V0(m44921d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = m44912I(bArr, i4, bVar);
            if (i != bVar.f27351a) {
                break;
            }
            do0.mo34579V0(m44921d(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0145, code lost:
        r2 = r14.f27354a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019e, code lost:
        r2 = java.lang.Long.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ab, code lost:
        r9 = r9 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b6, code lost:
        r9 = r9 + 8;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m44923f(int r7, byte[] r8, int r9, int r10, com.onedelhi.secure.qe1.C6549e<?, ?> r11, com.onedelhi.secure.qe1.C6553h<?, ?> r12, com.onedelhi.secure.ao4<com.onedelhi.secure.bo4, com.onedelhi.secure.bo4> r13, com.onedelhi.secure.C4992da.C4994b r14) throws java.io.IOException {
        /*
            com.onedelhi.secure.f21<com.onedelhi.secure.qe1$g> r0 = r11.extensions
            int r7 = r7 >>> 3
            com.onedelhi.secure.qe1$g r1 = r12.f34080a
            boolean r1 = r1.mo35766m()
            r2 = 0
            if (r1 == 0) goto L_0x00cb
            com.onedelhi.secure.qe1$g r1 = r12.f34080a
            boolean r1 = r1.mo35763i()
            if (r1 == 0) goto L_0x00cb
            int[] r10 = com.onedelhi.secure.C4992da.C4993a.f27350a
            com.onedelhi.secure.wx4$b r1 = r12.mo43426b()
            int r1 = r1.ordinal()
            r10 = r10[r1]
            switch(r10) {
                case 1: goto L_0x00bb;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00a7;
                case 4: goto L_0x00a7;
                case 5: goto L_0x009d;
                case 6: goto L_0x009d;
                case 7: goto L_0x0093;
                case 8: goto L_0x0093;
                case 9: goto L_0x0089;
                case 10: goto L_0x0089;
                case 11: goto L_0x007f;
                case 12: goto L_0x0075;
                case 13: goto L_0x006b;
                case 14: goto L_0x0041;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Type cannot be packed: "
            r8.append(r9)
            com.onedelhi.secure.qe1$g r9 = r12.f34080a
            com.onedelhi.secure.wx4$b r9 = r9.mo35762h()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0041:
            com.onedelhi.secure.as1 r10 = new com.onedelhi.secure.as1
            r10.<init>()
            int r8 = m44942y(r8, r9, r10, r14)
            com.onedelhi.secure.bo4 r9 = r11.unknownFields
            com.onedelhi.secure.bo4 r14 = com.onedelhi.secure.bo4.m40221c()
            if (r9 != r14) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = r9
        L_0x0054:
            com.onedelhi.secure.qe1$g r9 = r12.f34080a
            com.onedelhi.secure.vs1$d r9 = r9.mo35767n()
            java.lang.Object r7 = com.onedelhi.secure.gs3.m49718B(r7, r10, r9, r2, r13)
            com.onedelhi.secure.bo4 r7 = (com.onedelhi.secure.bo4) r7
            if (r7 == 0) goto L_0x0064
            r11.unknownFields = r7
        L_0x0064:
            com.onedelhi.secure.qe1$g r7 = r12.f34080a
            r0.mo35724O(r7, r10)
            goto L_0x01eb
        L_0x006b:
            com.onedelhi.secure.v92 r7 = new com.onedelhi.secure.v92
            r7.<init>()
            int r8 = m44941x(r8, r9, r7, r14)
            goto L_0x00c4
        L_0x0075:
            com.onedelhi.secure.as1 r7 = new com.onedelhi.secure.as1
            r7.<init>()
            int r8 = m44940w(r8, r9, r7, r14)
            goto L_0x00c4
        L_0x007f:
            com.onedelhi.secure.mn r7 = new com.onedelhi.secure.mn
            r7.<init>()
            int r8 = m44935r(r8, r9, r7, r14)
            goto L_0x00c4
        L_0x0089:
            com.onedelhi.secure.as1 r7 = new com.onedelhi.secure.as1
            r7.<init>()
            int r8 = m44937t(r8, r9, r7, r14)
            goto L_0x00c4
        L_0x0093:
            com.onedelhi.secure.v92 r7 = new com.onedelhi.secure.v92
            r7.<init>()
            int r8 = m44938u(r8, r9, r7, r14)
            goto L_0x00c4
        L_0x009d:
            com.onedelhi.secure.as1 r7 = new com.onedelhi.secure.as1
            r7.<init>()
            int r8 = m44942y(r8, r9, r7, r14)
            goto L_0x00c4
        L_0x00a7:
            com.onedelhi.secure.v92 r7 = new com.onedelhi.secure.v92
            r7.<init>()
            int r8 = m44943z(r8, r9, r7, r14)
            goto L_0x00c4
        L_0x00b1:
            com.onedelhi.secure.w71 r7 = new com.onedelhi.secure.w71
            r7.<init>()
            int r8 = m44939v(r8, r9, r7, r14)
            goto L_0x00c4
        L_0x00bb:
            com.onedelhi.secure.do0 r7 = new com.onedelhi.secure.do0
            r7.<init>()
            int r8 = m44936s(r8, r9, r7, r14)
        L_0x00c4:
            com.onedelhi.secure.qe1$g r9 = r12.f34080a
            r0.mo35724O(r9, r7)
            goto L_0x01eb
        L_0x00cb:
            com.onedelhi.secure.wx4$b r1 = r12.mo43426b()
            com.onedelhi.secure.wx4$b r3 = com.onedelhi.secure.wx4.C7195b.ENUM
            if (r1 != r3) goto L_0x00f9
            int r9 = m44912I(r8, r9, r14)
            com.onedelhi.secure.qe1$g r8 = r12.f34080a
            com.onedelhi.secure.vs1$d r8 = r8.mo35767n()
            int r10 = r14.f27351a
            com.onedelhi.secure.vs1$c r8 = r8.mo32393a(r10)
            if (r8 != 0) goto L_0x0191
            com.onedelhi.secure.bo4 r8 = r11.unknownFields
            com.onedelhi.secure.bo4 r10 = com.onedelhi.secure.bo4.m40221c()
            if (r8 != r10) goto L_0x00f3
            com.onedelhi.secure.bo4 r8 = com.onedelhi.secure.bo4.m40225n()
            r11.unknownFields = r8
        L_0x00f3:
            int r10 = r14.f27351a
            com.onedelhi.secure.gs3.m49738Q(r7, r10, r8, r13)
            return r9
        L_0x00f9:
            int[] r11 = com.onedelhi.secure.C4992da.C4993a.f27350a
            com.onedelhi.secure.wx4$b r13 = r12.mo43426b()
            int r13 = r13.ordinal()
            r11 = r11[r13]
            switch(r11) {
                case 1: goto L_0x01ae;
                case 2: goto L_0x01a3;
                case 3: goto L_0x0198;
                case 4: goto L_0x0198;
                case 5: goto L_0x018d;
                case 6: goto L_0x018d;
                case 7: goto L_0x0184;
                case 8: goto L_0x0184;
                case 9: goto L_0x017b;
                case 10: goto L_0x017b;
                case 11: goto L_0x0167;
                case 12: goto L_0x015c;
                case 13: goto L_0x0151;
                case 14: goto L_0x0149;
                case 15: goto L_0x0141;
                case 16: goto L_0x013c;
                case 17: goto L_0x011f;
                case 18: goto L_0x010a;
                default: goto L_0x0108;
            }
        L_0x0108:
            goto L_0x01b8
        L_0x010a:
            com.onedelhi.secure.p63 r7 = com.onedelhi.secure.p63.m60498a()
            com.onedelhi.secure.yh2 r11 = r12.mo43427c()
            java.lang.Class r11 = r11.getClass()
            com.onedelhi.secure.xr3 r7 = r7.mo42385i(r11)
            int r9 = m44933p(r7, r8, r9, r10, r14)
            goto L_0x0145
        L_0x011f:
            int r7 = r7 << 3
            r5 = r7 | 4
            com.onedelhi.secure.p63 r7 = com.onedelhi.secure.p63.m60498a()
            com.onedelhi.secure.yh2 r11 = r12.mo43427c()
            java.lang.Class r11 = r11.getClass()
            com.onedelhi.secure.xr3 r1 = r7.mo42385i(r11)
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r14
            int r9 = m44931n(r1, r2, r3, r4, r5, r6)
            goto L_0x0145
        L_0x013c:
            int r9 = m44906C(r8, r9, r14)
            goto L_0x0145
        L_0x0141:
            int r9 = m44919b(r8, r9, r14)
        L_0x0145:
            java.lang.Object r2 = r14.f27354a
            goto L_0x01b8
        L_0x0149:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Shouldn't reach here."
            r7.<init>(r8)
            throw r7
        L_0x0151:
            int r9 = m44915L(r8, r9, r14)
            long r7 = r14.f27352a
            long r7 = com.onedelhi.secure.g00.m48669c(r7)
            goto L_0x019e
        L_0x015c:
            int r9 = m44912I(r8, r9, r14)
            int r7 = r14.f27351a
            int r7 = com.onedelhi.secure.g00.m48668b(r7)
            goto L_0x0193
        L_0x0167:
            int r9 = m44915L(r8, r9, r14)
            long r7 = r14.f27352a
            r10 = 0
            int r13 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r13 == 0) goto L_0x0175
            r7 = 1
            goto L_0x0176
        L_0x0175:
            r7 = 0
        L_0x0176:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            goto L_0x01b8
        L_0x017b:
            int r7 = m44925h(r8, r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x01ab
        L_0x0184:
            long r7 = m44927j(r8, r9)
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            goto L_0x01b6
        L_0x018d:
            int r9 = m44912I(r8, r9, r14)
        L_0x0191:
            int r7 = r14.f27351a
        L_0x0193:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x01b8
        L_0x0198:
            int r9 = m44915L(r8, r9, r14)
            long r7 = r14.f27352a
        L_0x019e:
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            goto L_0x01b8
        L_0x01a3:
            float r7 = m44929l(r8, r9)
            java.lang.Float r2 = java.lang.Float.valueOf(r7)
        L_0x01ab:
            int r9 = r9 + 4
            goto L_0x01b8
        L_0x01ae:
            double r7 = m44921d(r8, r9)
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
        L_0x01b6:
            int r9 = r9 + 8
        L_0x01b8:
            boolean r7 = r12.mo43429f()
            if (r7 == 0) goto L_0x01c4
            com.onedelhi.secure.qe1$g r7 = r12.f34080a
            r0.mo35732h(r7, r2)
            goto L_0x01ea
        L_0x01c4:
            int[] r7 = com.onedelhi.secure.C4992da.C4993a.f27350a
            com.onedelhi.secure.wx4$b r8 = r12.mo43426b()
            int r8 = r8.ordinal()
            r7 = r7[r8]
            r8 = 17
            if (r7 == r8) goto L_0x01d9
            r8 = 18
            if (r7 == r8) goto L_0x01d9
            goto L_0x01e5
        L_0x01d9:
            com.onedelhi.secure.qe1$g r7 = r12.f34080a
            java.lang.Object r7 = r0.mo35739u(r7)
            if (r7 == 0) goto L_0x01e5
            java.lang.Object r2 = com.onedelhi.secure.vs1.m68450v(r7, r2)
        L_0x01e5:
            com.onedelhi.secure.qe1$g r7 = r12.f34080a
            r0.mo35724O(r7, r2)
        L_0x01ea:
            r8 = r9
        L_0x01eb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4992da.m44923f(int, byte[], int, int, com.onedelhi.secure.qe1$e, com.onedelhi.secure.qe1$h, com.onedelhi.secure.ao4, com.onedelhi.secure.da$b):int");
    }

    /* renamed from: g */
    public static int m44924g(int i, byte[] bArr, int i2, int i3, Object obj, yh2 yh2, ao4<bo4, bo4> ao4, C4994b bVar) throws IOException {
        qe1.C6553h c = bVar.f27353a.mo48471c(yh2, i >>> 3);
        if (c == null) {
            return m44910G(i, bArr, i2, i3, bi2.m39908w(obj), bVar);
        }
        qe1.C6549e eVar = (qe1.C6549e) obj;
        eVar.mo43410gk();
        return m44923f(i, bArr, i2, i3, eVar, c, ao4, bVar);
    }

    /* renamed from: h */
    public static int m44925h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m44926i(int i, byte[] bArr, int i2, int i3, vs1.C7095k<?> kVar, C4994b bVar) {
        as1 as1 = (as1) kVar;
        as1.mo31124G0(m44925h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = m44912I(bArr, i4, bVar);
            if (i != bVar.f27351a) {
                break;
            }
            as1.mo31124G0(m44925h(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    /* renamed from: j */
    public static long m44927j(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: k */
    public static int m44928k(int i, byte[] bArr, int i2, int i3, vs1.C7095k<?> kVar, C4994b bVar) {
        v92 v92 = (v92) kVar;
        v92.mo46036L1(m44927j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = m44912I(bArr, i4, bVar);
            if (i != bVar.f27351a) {
                break;
            }
            v92.mo46036L1(m44927j(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* renamed from: l */
    public static float m44929l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m44925h(bArr, i));
    }

    /* renamed from: m */
    public static int m44930m(int i, byte[] bArr, int i2, int i3, vs1.C7095k<?> kVar, C4994b bVar) {
        w71 w71 = (w71) kVar;
        w71.mo46323b2(m44929l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = m44912I(bArr, i4, bVar);
            if (i != bVar.f27351a) {
                break;
            }
            w71.mo46323b2(m44929l(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    /* renamed from: n */
    public static int m44931n(xr3 xr3, byte[] bArr, int i, int i2, int i3, C4994b bVar) throws IOException {
        bi2 bi2 = (bi2) xr3;
        Object g = bi2.mo31770g();
        int e0 = bi2.mo31767e0(g, bArr, i, i2, i3, bVar);
        bi2.mo31774i(g);
        bVar.f27354a = g;
        return e0;
    }

    /* renamed from: o */
    public static int m44932o(xr3 xr3, int i, byte[] bArr, int i2, int i3, vs1.C7095k<?> kVar, C4994b bVar) throws IOException {
        int i4 = (i & -8) | 4;
        int n = m44931n(xr3, bArr, i2, i3, i4, bVar);
        while (true) {
            kVar.add(bVar.f27354a);
            if (n >= i3) {
                break;
            }
            int I = m44912I(bArr, n, bVar);
            if (i != bVar.f27351a) {
                break;
            }
            n = m44931n(xr3, bArr, I, i3, i4, bVar);
        }
        return n;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m44933p(com.onedelhi.secure.xr3 r6, byte[] r7, int r8, int r9, com.onedelhi.secure.C4992da.C4994b r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m44911H(r8, r7, r0, r10)
            int r8 = r10.f27351a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo31770g()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo31768f(r1, r2, r3, r4, r5)
            r6.mo31774i(r9)
            r10.f27354a = r9
            return r8
        L_0x0025:
            com.onedelhi.secure.nt1 r6 = com.onedelhi.secure.nt1.m58791n()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4992da.m44933p(com.onedelhi.secure.xr3, byte[], int, int, com.onedelhi.secure.da$b):int");
    }

    /* renamed from: q */
    public static int m44934q(xr3<?> xr3, int i, byte[] bArr, int i2, int i3, vs1.C7095k<?> kVar, C4994b bVar) throws IOException {
        int p = m44933p(xr3, bArr, i2, i3, bVar);
        while (true) {
            kVar.add(bVar.f27354a);
            if (p >= i3) {
                break;
            }
            int I = m44912I(bArr, p, bVar);
            if (i != bVar.f27351a) {
                break;
            }
            p = m44933p(xr3, bArr, I, i3, bVar);
        }
        return p;
    }

    /* renamed from: r */
    public static int m44935r(byte[] bArr, int i, vs1.C7095k<?> kVar, C4994b bVar) throws IOException {
        C6126mn mnVar = (C6126mn) kVar;
        int I = m44912I(bArr, i, bVar);
        int i2 = bVar.f27351a + I;
        while (I < i2) {
            I = m44915L(bArr, I, bVar);
            mnVar.mo40703S0(bVar.f27352a != 0);
        }
        if (I == i2) {
            return I;
        }
        throw nt1.m58791n();
    }

    /* renamed from: s */
    public static int m44936s(byte[] bArr, int i, vs1.C7095k<?> kVar, C4994b bVar) throws IOException {
        do0 do0 = (do0) kVar;
        int I = m44912I(bArr, i, bVar);
        int i2 = bVar.f27351a + I;
        while (I < i2) {
            do0.mo34579V0(m44921d(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw nt1.m58791n();
    }

    /* renamed from: t */
    public static int m44937t(byte[] bArr, int i, vs1.C7095k<?> kVar, C4994b bVar) throws IOException {
        as1 as1 = (as1) kVar;
        int I = m44912I(bArr, i, bVar);
        int i2 = bVar.f27351a + I;
        while (I < i2) {
            as1.mo31124G0(m44925h(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw nt1.m58791n();
    }

    /* renamed from: u */
    public static int m44938u(byte[] bArr, int i, vs1.C7095k<?> kVar, C4994b bVar) throws IOException {
        v92 v92 = (v92) kVar;
        int I = m44912I(bArr, i, bVar);
        int i2 = bVar.f27351a + I;
        while (I < i2) {
            v92.mo46036L1(m44927j(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw nt1.m58791n();
    }

    /* renamed from: v */
    public static int m44939v(byte[] bArr, int i, vs1.C7095k<?> kVar, C4994b bVar) throws IOException {
        w71 w71 = (w71) kVar;
        int I = m44912I(bArr, i, bVar);
        int i2 = bVar.f27351a + I;
        while (I < i2) {
            w71.mo46323b2(m44929l(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw nt1.m58791n();
    }

    /* renamed from: w */
    public static int m44940w(byte[] bArr, int i, vs1.C7095k<?> kVar, C4994b bVar) throws IOException {
        as1 as1 = (as1) kVar;
        int I = m44912I(bArr, i, bVar);
        int i2 = bVar.f27351a + I;
        while (I < i2) {
            I = m44912I(bArr, I, bVar);
            as1.mo31124G0(g00.m48668b(bVar.f27351a));
        }
        if (I == i2) {
            return I;
        }
        throw nt1.m58791n();
    }

    /* renamed from: x */
    public static int m44941x(byte[] bArr, int i, vs1.C7095k<?> kVar, C4994b bVar) throws IOException {
        v92 v92 = (v92) kVar;
        int I = m44912I(bArr, i, bVar);
        int i2 = bVar.f27351a + I;
        while (I < i2) {
            I = m44915L(bArr, I, bVar);
            v92.mo46036L1(g00.m48669c(bVar.f27352a));
        }
        if (I == i2) {
            return I;
        }
        throw nt1.m58791n();
    }

    /* renamed from: y */
    public static int m44942y(byte[] bArr, int i, vs1.C7095k<?> kVar, C4994b bVar) throws IOException {
        as1 as1 = (as1) kVar;
        int I = m44912I(bArr, i, bVar);
        int i2 = bVar.f27351a + I;
        while (I < i2) {
            I = m44912I(bArr, I, bVar);
            as1.mo31124G0(bVar.f27351a);
        }
        if (I == i2) {
            return I;
        }
        throw nt1.m58791n();
    }

    /* renamed from: z */
    public static int m44943z(byte[] bArr, int i, vs1.C7095k<?> kVar, C4994b bVar) throws IOException {
        v92 v92 = (v92) kVar;
        int I = m44912I(bArr, i, bVar);
        int i2 = bVar.f27351a + I;
        while (I < i2) {
            I = m44915L(bArr, I, bVar);
            v92.mo46036L1(bVar.f27352a);
        }
        if (I == i2) {
            return I;
        }
        throw nt1.m58791n();
    }
}

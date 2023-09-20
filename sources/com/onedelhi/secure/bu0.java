package com.onedelhi.secure;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

public final class bu0 {

    /* renamed from: a */
    public static final String f26531a = "ISO-8859-1";

    /* renamed from: a */
    public static final int[] f26532a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: com.onedelhi.secure.bu0$a */
    public static /* synthetic */ class C4698a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26533a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.onedelhi.secure.oj2[] r0 = com.onedelhi.secure.oj2.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26533a = r0
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26533a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26533a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26533a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.oj2 r1 = com.onedelhi.secure.oj2.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bu0.C4698a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m40378a(String str, C6014ll llVar, String str2) throws vy4 {
        try {
            for (byte c : str.getBytes(str2)) {
                llVar.mo39923c(c, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new vy4((Throwable) e);
        }
    }

    /* renamed from: b */
    public static void m40379b(CharSequence charSequence, C6014ll llVar) throws vy4 {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int r = m40395r(charSequence.charAt(i));
            if (r != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int r2 = m40395r(charSequence.charAt(i2));
                    if (r2 != -1) {
                        llVar.mo39923c((r * 45) + r2, 11);
                        i += 2;
                    } else {
                        throw new vy4();
                    }
                } else {
                    llVar.mo39923c(r, 6);
                    i = i2;
                }
            } else {
                throw new vy4();
            }
        }
    }

    /* renamed from: c */
    public static void m40380c(String str, oj2 oj2, C6014ll llVar, String str2) throws vy4 {
        int i = C4698a.f26533a[oj2.ordinal()];
        if (i == 1) {
            m40385h(str, llVar);
        } else if (i == 2) {
            m40379b(str, llVar);
        } else if (i == 3) {
            m40378a(str, llVar, str2);
        } else if (i == 4) {
            m40382e(str, llVar);
        } else {
            throw new vy4("Invalid mode: ".concat(String.valueOf(oj2)));
        }
    }

    /* renamed from: d */
    public static void m40381d(C4597ax axVar, C6014ll llVar) {
        llVar.mo39923c(oj2.ECI.mo41792b(), 4);
        llVar.mo39923c(axVar.mo31241e(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c A[LOOP:0: B:6:0x000f->B:19:0x003c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m40382e(java.lang.String r6, com.onedelhi.secure.C6014ll r7) throws com.onedelhi.secure.vy4 {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x005c }
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0054
            int r0 = r6.length
            int r0 = r0 + -1
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0053
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x002b
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x002b
        L_0x0029:
            int r2 = r2 - r3
            goto L_0x003a
        L_0x002b:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0039
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0039
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0029
        L_0x0039:
            r2 = -1
        L_0x003a:
            if (r2 == r4) goto L_0x004b
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.mo39923c(r3, r2)
            int r1 = r1 + 2
            goto L_0x000f
        L_0x004b:
            com.onedelhi.secure.vy4 r6 = new com.onedelhi.secure.vy4
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x0053:
            return
        L_0x0054:
            com.onedelhi.secure.vy4 r6 = new com.onedelhi.secure.vy4
            java.lang.String r7 = "Kanji byte size not even"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x005c:
            r6 = move-exception
            com.onedelhi.secure.vy4 r7 = new com.onedelhi.secure.vy4
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bu0.m40382e(java.lang.String, com.onedelhi.secure.ll):void");
    }

    /* renamed from: f */
    public static void m40383f(int i, ts4 ts4, oj2 oj2, C6014ll llVar) throws vy4 {
        int e = oj2.mo41793e(ts4);
        int i2 = 1 << e;
        if (i < i2) {
            llVar.mo39923c(i, e);
            return;
        }
        throw new vy4(i + " is bigger than " + (i2 - 1));
    }

    /* renamed from: g */
    public static void m40384g(oj2 oj2, C6014ll llVar) {
        llVar.mo39923c(oj2.mo41792b(), 4);
    }

    /* renamed from: h */
    public static void m40385h(CharSequence charSequence, C6014ll llVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                llVar.mo39923c((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    llVar.mo39923c((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    llVar.mo39923c(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    public static int m40386i(oj2 oj2, C6014ll llVar, C6014ll llVar2, ts4 ts4) {
        return llVar.mo39935l() + oj2.mo41793e(ts4) + llVar2.mo39935l();
    }

    /* renamed from: j */
    public static int m40387j(C7512zq zqVar) {
        return yd2.m71679a(zqVar) + yd2.m71681c(zqVar) + yd2.m71682d(zqVar) + yd2.m71683e(zqVar);
    }

    /* renamed from: k */
    public static int m40388k(C6014ll llVar, kv0 kv0, ts4 ts4, C7512zq zqVar) throws vy4 {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            uf2.m66988a(llVar, kv0, ts4, i3, zqVar);
            int j = m40387j(zqVar);
            if (j < i) {
                i2 = i3;
                i = j;
            }
        }
        return i2;
    }

    /* renamed from: l */
    public static oj2 m40389l(String str) {
        return m40390m(str, (String) null);
    }

    /* renamed from: m */
    public static oj2 m40390m(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m40398u(str)) {
            return oj2.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m40395r(charAt) == -1) {
                return oj2.BYTE;
            } else {
                z = true;
            }
        }
        return z ? oj2.ALPHANUMERIC : z2 ? oj2.NUMERIC : oj2.BYTE;
    }

    /* renamed from: n */
    public static ts4 m40391n(int i, kv0 kv0) throws vy4 {
        for (int i2 = 1; i2 <= 40; i2++) {
            ts4 i3 = ts4.m66186i(i2);
            if (m40401x(i, i3, kv0)) {
                return i3;
            }
        }
        throw new vy4("Data too big");
    }

    /* renamed from: o */
    public static t83 m40392o(String str, kv0 kv0) throws vy4 {
        return m40393p(str, kv0, (Map<ut0, ?>) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fc, code lost:
        if (com.onedelhi.secure.t83.m65529f(r9) != false) goto L_0x0100;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.t83 m40393p(java.lang.String r7, com.onedelhi.secure.kv0 r8, java.util.Map<com.onedelhi.secure.ut0, ?> r9) throws com.onedelhi.secure.vy4 {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x000e
            com.onedelhi.secure.ut0 r2 = com.onedelhi.secure.ut0.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x000e
            r2 = 1
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            if (r2 == 0) goto L_0x001c
            com.onedelhi.secure.ut0 r3 = com.onedelhi.secure.ut0.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r3 = "ISO-8859-1"
        L_0x001e:
            com.onedelhi.secure.oj2 r4 = m40390m(r7, r3)
            com.onedelhi.secure.ll r5 = new com.onedelhi.secure.ll
            r5.<init>()
            com.onedelhi.secure.oj2 r6 = com.onedelhi.secure.oj2.BYTE
            if (r4 != r6) goto L_0x0036
            if (r2 == 0) goto L_0x0036
            com.onedelhi.secure.ax r2 = com.onedelhi.secure.C4597ax.m39174a(r3)
            if (r2 == 0) goto L_0x0036
            m40381d(r2, r5)
        L_0x0036:
            if (r9 == 0) goto L_0x0041
            com.onedelhi.secure.ut0 r2 = com.onedelhi.secure.ut0.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x0059
            com.onedelhi.secure.ut0 r0 = com.onedelhi.secure.ut0.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L_0x0059
            com.onedelhi.secure.oj2 r0 = com.onedelhi.secure.oj2.FNC1_FIRST_POSITION
            m40384g(r0, r5)
        L_0x0059:
            m40384g(r4, r5)
            com.onedelhi.secure.ll r0 = new com.onedelhi.secure.ll
            r0.<init>()
            m40380c(r7, r4, r0, r3)
            if (r9 == 0) goto L_0x0091
            com.onedelhi.secure.ut0 r1 = com.onedelhi.secure.ut0.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L_0x0091
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            com.onedelhi.secure.ts4 r1 = com.onedelhi.secure.ts4.m66186i(r1)
            int r2 = m40386i(r4, r5, r0, r1)
            boolean r2 = m40401x(r2, r1, r8)
            if (r2 == 0) goto L_0x0089
            goto L_0x0095
        L_0x0089:
            com.onedelhi.secure.vy4 r7 = new com.onedelhi.secure.vy4
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0091:
            com.onedelhi.secure.ts4 r1 = m40399v(r8, r4, r5, r0)
        L_0x0095:
            com.onedelhi.secure.ll r2 = new com.onedelhi.secure.ll
            r2.<init>()
            r2.mo39922b(r5)
            if (r4 != r6) goto L_0x00a4
            int r7 = r0.mo39936m()
            goto L_0x00a8
        L_0x00a4:
            int r7 = r7.length()
        L_0x00a8:
            m40383f(r7, r1, r4, r2)
            r2.mo39922b(r0)
            com.onedelhi.secure.ts4$b r7 = r1.mo45298f(r8)
            int r0 = r1.mo45299h()
            int r3 = r7.mo45307d()
            int r0 = r0 - r3
            m40400w(r0, r2)
            int r3 = r1.mo45299h()
            int r7 = r7.mo45306c()
            com.onedelhi.secure.ll r7 = m40397t(r2, r3, r0, r7)
            com.onedelhi.secure.t83 r0 = new com.onedelhi.secure.t83
            r0.<init>()
            r0.mo44940g(r8)
            r0.mo44943j(r4)
            r0.mo44944k(r1)
            int r2 = r1.mo45297e()
            com.onedelhi.secure.zq r3 = new com.onedelhi.secure.zq
            r3.<init>(r2, r2)
            r2 = -1
            if (r9 == 0) goto L_0x00ff
            com.onedelhi.secure.ut0 r4 = com.onedelhi.secure.ut0.QR_MASK_PATTERN
            boolean r5 = r9.containsKey(r4)
            if (r5 == 0) goto L_0x00ff
            java.lang.Object r9 = r9.get(r4)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            boolean r4 = com.onedelhi.secure.t83.m65529f(r9)
            if (r4 == 0) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r9 = -1
        L_0x0100:
            if (r9 != r2) goto L_0x0106
            int r9 = m40388k(r7, r8, r1, r3)
        L_0x0106:
            r0.mo44941h(r9)
            com.onedelhi.secure.uf2.m66988a(r7, r8, r1, r9, r3)
            r0.mo44942i(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bu0.m40393p(java.lang.String, com.onedelhi.secure.kv0, java.util.Map):com.onedelhi.secure.t83");
    }

    /* renamed from: q */
    public static byte[] m40394q(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new wg3(te1.f35529e).mo46728b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: r */
    public static int m40395r(int i) {
        int[] iArr = f26532a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: s */
    public static void m40396s(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws vy4 {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new vy4("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new vy4("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new vy4("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new vy4("Block ID too large");
        }
    }

    /* renamed from: t */
    public static C6014ll m40397t(C6014ll llVar, int i, int i2, int i3) throws vy4 {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (llVar.mo39936m() == i5) {
            ArrayList<C4575an> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m40396s(i, i2, i3, i10, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                llVar.mo39942t(i7 << 3, bArr, 0, i11);
                byte[] q = m40394q(bArr, iArr2[0]);
                arrayList.add(new C4575an(bArr, q));
                i8 = Math.max(i8, i11);
                i9 = Math.max(i9, q.length);
                i7 += iArr[0];
            }
            if (i5 == i7) {
                C6014ll llVar2 = new C6014ll();
                for (int i12 = 0; i12 < i8; i12++) {
                    for (C4575an a : arrayList) {
                        byte[] a2 = a.mo31039a();
                        if (i12 < a2.length) {
                            llVar2.mo39923c(a2[i12], 8);
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (C4575an b : arrayList) {
                        byte[] b2 = b.mo31040b();
                        if (i13 < b2.length) {
                            llVar2.mo39923c(b2[i13], 8);
                        }
                    }
                }
                if (i4 == llVar2.mo39936m()) {
                    return llVar2;
                }
                throw new vy4("Interleaving error: " + i4 + " and " + llVar2.mo39936m() + " differ.");
            }
            throw new vy4("Data bytes does not match offset");
        }
        throw new vy4("Number of bits and data bytes does not match");
    }

    /* renamed from: u */
    public static boolean m40398u(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: v */
    public static ts4 m40399v(kv0 kv0, oj2 oj2, C6014ll llVar, C6014ll llVar2) throws vy4 {
        return m40391n(m40386i(oj2, llVar, llVar2, m40391n(m40386i(oj2, llVar, llVar2, ts4.m66186i(1)), kv0)), kv0);
    }

    /* renamed from: w */
    public static void m40400w(int i, C6014ll llVar) throws vy4 {
        int i2 = i << 3;
        if (llVar.mo39935l() <= i2) {
            for (int i3 = 0; i3 < 4 && llVar.mo39935l() < i2; i3++) {
                llVar.mo39921a(false);
            }
            int l = llVar.mo39935l() & 7;
            if (l > 0) {
                while (l < 8) {
                    llVar.mo39921a(false);
                    l++;
                }
            }
            int m = i - llVar.mo39936m();
            for (int i4 = 0; i4 < m; i4++) {
                llVar.mo39923c((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (llVar.mo39935l() != i2) {
                throw new vy4("Bits size does not equal capacity");
            }
            return;
        }
        throw new vy4("data bits cannot fit in the QR Code" + llVar.mo39935l() + " > " + i2);
    }

    /* renamed from: x */
    public static boolean m40401x(int i, ts4 ts4, kv0 kv0) {
        return ts4.mo45299h() - ts4.mo45298f(kv0).mo45307d() >= (i + 7) / 8;
    }
}

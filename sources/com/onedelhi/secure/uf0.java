package com.onedelhi.secure;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class uf0 {

    /* renamed from: A */
    public static final int f36051A = 2;

    /* renamed from: a */
    public static final int f36052a = 900;

    /* renamed from: a */
    public static final char[] f36053a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: a */
    public static final BigInteger[] f36054a;

    /* renamed from: b */
    public static final int f36055b = 901;

    /* renamed from: b */
    public static final char[] f36056b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    public static final int f36057c = 902;

    /* renamed from: d */
    public static final int f36058d = 924;

    /* renamed from: e */
    public static final int f36059e = 925;

    /* renamed from: f */
    public static final int f36060f = 926;

    /* renamed from: g */
    public static final int f36061g = 927;

    /* renamed from: h */
    public static final int f36062h = 928;

    /* renamed from: i */
    public static final int f36063i = 923;

    /* renamed from: j */
    public static final int f36064j = 922;

    /* renamed from: k */
    public static final int f36065k = 913;

    /* renamed from: l */
    public static final int f36066l = 15;

    /* renamed from: m */
    public static final int f36067m = 0;

    /* renamed from: n */
    public static final int f36068n = 1;

    /* renamed from: o */
    public static final int f36069o = 2;

    /* renamed from: p */
    public static final int f36070p = 3;

    /* renamed from: q */
    public static final int f36071q = 4;

    /* renamed from: r */
    public static final int f36072r = 5;

    /* renamed from: s */
    public static final int f36073s = 6;

    /* renamed from: t */
    public static final int f36074t = 25;

    /* renamed from: u */
    public static final int f36075u = 27;

    /* renamed from: v */
    public static final int f36076v = 27;

    /* renamed from: w */
    public static final int f36077w = 28;

    /* renamed from: x */
    public static final int f36078x = 28;

    /* renamed from: y */
    public static final int f36079y = 29;

    /* renamed from: z */
    public static final int f36080z = 29;

    /* renamed from: com.onedelhi.secure.uf0$a */
    public static /* synthetic */ class C6964a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36081a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.uf0$b[] r0 = com.onedelhi.secure.uf0.C6965b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36081a = r0
                com.onedelhi.secure.uf0$b r1 = com.onedelhi.secure.uf0.C6965b.ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36081a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.uf0$b r1 = com.onedelhi.secure.uf0.C6965b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36081a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.uf0$b r1 = com.onedelhi.secure.uf0.C6965b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36081a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.uf0$b r1 = com.onedelhi.secure.uf0.C6965b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36081a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.uf0$b r1 = com.onedelhi.secure.uf0.C6965b.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36081a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.uf0$b r1 = com.onedelhi.secure.uf0.C6965b.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.uf0.C6964a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.uf0$b */
    public enum C6965b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f36054a = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f36054a;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static int m66981a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7 = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long j2 = 900;
        int i8 = 6;
        if (i7 == 901) {
            int[] iArr2 = new int[6];
            int i9 = i2 + 1;
            int i10 = iArr[i2];
            boolean z = false;
            while (true) {
                i6 = 0;
                long j3 = 0;
                while (i5 < iArr[0] && !z) {
                    int i11 = i6 + 1;
                    iArr2[i6] = i4;
                    j3 = (j3 * j) + ((long) i4);
                    int i12 = i5 + 1;
                    i10 = iArr[i5];
                    if (i10 != 928) {
                        switch (i10) {
                            case 900:
                            case 901:
                            case 902:
                                break;
                            default:
                                switch (i10) {
                                    case f36064j /*922*/:
                                    case f36063i /*923*/:
                                    case 924:
                                        break;
                                    default:
                                        if (i11 % 5 != 0 || i11 <= 0) {
                                            i4 = i10;
                                            i5 = i12;
                                            i6 = i11;
                                            j = 900;
                                            i8 = 6;
                                            break;
                                        } else {
                                            int i13 = 0;
                                            while (i13 < i8) {
                                                byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i13) * 8))));
                                                i13++;
                                                i10 = i10;
                                                i8 = 6;
                                            }
                                            int i14 = i10;
                                            i9 = i12;
                                            j2 = 900;
                                        }
                                }
                                break;
                        }
                    }
                    i5 = i12 - 1;
                    i4 = i10;
                    i6 = i11;
                    j = 900;
                    i8 = 6;
                    z = true;
                }
            }
            if (i5 == iArr[0] && i4 < 900) {
                iArr2[i6] = i4;
                i6++;
            }
            for (int i15 = 0; i15 < i6; i15++) {
                byteArrayOutputStream.write((byte) iArr2[i15]);
            }
            i3 = i5;
        } else if (i7 != 924) {
            i3 = i2;
        } else {
            i3 = i2;
            boolean z2 = false;
            while (true) {
                int i16 = 0;
                long j4 = 0;
                while (i3 < iArr[0] && !z2) {
                    int i17 = i3 + 1;
                    int i18 = iArr[i3];
                    if (i18 < 900) {
                        i16++;
                        j4 = (j4 * 900) + ((long) i18);
                    } else {
                        if (i18 != 928) {
                            switch (i18) {
                                case 900:
                                case 901:
                                case 902:
                                    break;
                                default:
                                    switch (i18) {
                                        case f36064j /*922*/:
                                        case f36063i /*923*/:
                                        case 924:
                                            break;
                                    }
                            }
                        }
                        i3 = i17 - 1;
                        z2 = true;
                        if (i16 % 5 != 0 && i16 > 0) {
                            for (int i19 = 0; i19 < 6; i19++) {
                                byteArrayOutputStream.write((byte) ((int) (j4 >> ((5 - i19) * 8))));
                            }
                        }
                    }
                    i3 = i17;
                    if (i16 % 5 != 0) {
                    }
                }
            }
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r2 = m66981a(r2, r6, r1, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r2 = m66987g(r6, r4, r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.gg0 m66982b(int[] r6, java.lang.String r7) throws com.onedelhi.secure.ha1 {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = r6[r2]
            com.onedelhi.secure.px2 r3 = new com.onedelhi.secure.px2
            r3.<init>()
            r4 = 2
        L_0x0012:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L_0x0069
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L_0x0054
            switch(r2) {
                case 900: goto L_0x004f;
                case 901: goto L_0x004a;
                case 902: goto L_0x0045;
                default: goto L_0x001e;
            }
        L_0x001e:
            switch(r2) {
                case 922: goto L_0x0040;
                case 923: goto L_0x0040;
                case 924: goto L_0x004a;
                case 925: goto L_0x003d;
                case 926: goto L_0x003a;
                case 927: goto L_0x0029;
                case 928: goto L_0x0024;
                default: goto L_0x0021;
            }
        L_0x0021:
            int r4 = r4 + -1
            goto L_0x004f
        L_0x0024:
            int r2 = m66984d(r6, r4, r3)
            goto L_0x005c
        L_0x0029:
            int r2 = r4 + 1
            r1 = r6[r4]
            com.onedelhi.secure.ax r1 = com.onedelhi.secure.C4597ax.m39175b(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L_0x005c
        L_0x003a:
            int r2 = r4 + 2
            goto L_0x005c
        L_0x003d:
            int r2 = r4 + 1
            goto L_0x005c
        L_0x0040:
            com.onedelhi.secure.ha1 r6 = com.onedelhi.secure.ha1.m50341a()
            throw r6
        L_0x0045:
            int r2 = m66986f(r6, r4, r0)
            goto L_0x005c
        L_0x004a:
            int r2 = m66981a(r2, r6, r1, r4, r0)
            goto L_0x005c
        L_0x004f:
            int r2 = m66987g(r6, r4, r0)
            goto L_0x005c
        L_0x0054:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L_0x005c:
            int r4 = r6.length
            if (r2 >= r4) goto L_0x0064
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L_0x0012
        L_0x0064:
            com.onedelhi.secure.ha1 r6 = com.onedelhi.secure.ha1.m50341a()
            throw r6
        L_0x0069:
            int r6 = r0.length()
            if (r6 == 0) goto L_0x007d
            com.onedelhi.secure.gg0 r6 = new com.onedelhi.secure.gg0
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.mo36731o(r3)
            return r6
        L_0x007d:
            com.onedelhi.secure.ha1 r6 = com.onedelhi.secure.ha1.m50341a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.uf0.m66982b(int[], java.lang.String):com.onedelhi.secure.gg0");
    }

    /* renamed from: c */
    public static String m66983c(int[] iArr, int i) throws ha1 {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f36054a[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw ha1.m50341a();
    }

    /* renamed from: d */
    public static int m66984d(int[] iArr, int i, px2 px2) throws ha1 {
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i2 = 0;
            while (i2 < 2) {
                iArr2[i2] = iArr[i];
                i2++;
                i++;
            }
            px2.mo42969t(Integer.parseInt(m66983c(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int g = m66987g(iArr, i, sb);
            px2.mo42963n(sb.toString());
            int i3 = iArr[g] == 923 ? g + 1 : -1;
            while (g < iArr[0]) {
                int i4 = iArr[g];
                if (i4 == 922) {
                    g++;
                    px2.mo42966q(true);
                } else if (i4 == 923) {
                    int i5 = g + 1;
                    switch (iArr[i5]) {
                        case 0:
                            StringBuilder sb2 = new StringBuilder();
                            g = m66987g(iArr, i5 + 1, sb2);
                            px2.mo42964o(sb2.toString());
                            break;
                        case 1:
                            StringBuilder sb3 = new StringBuilder();
                            g = m66986f(iArr, i5 + 1, sb3);
                            px2.mo42968s(Integer.parseInt(sb3.toString()));
                            break;
                        case 2:
                            StringBuilder sb4 = new StringBuilder();
                            g = m66986f(iArr, i5 + 1, sb4);
                            px2.mo42971v(Long.parseLong(sb4.toString()));
                            break;
                        case 3:
                            StringBuilder sb5 = new StringBuilder();
                            g = m66987g(iArr, i5 + 1, sb5);
                            px2.mo42970u(sb5.toString());
                            break;
                        case 4:
                            StringBuilder sb6 = new StringBuilder();
                            g = m66987g(iArr, i5 + 1, sb6);
                            px2.mo42961l(sb6.toString());
                            break;
                        case 5:
                            StringBuilder sb7 = new StringBuilder();
                            g = m66986f(iArr, i5 + 1, sb7);
                            px2.mo42965p(Long.parseLong(sb7.toString()));
                            break;
                        case 6:
                            StringBuilder sb8 = new StringBuilder();
                            g = m66986f(iArr, i5 + 1, sb8);
                            px2.mo42962m(Integer.parseInt(sb8.toString()));
                            break;
                        default:
                            throw ha1.m50341a();
                    }
                } else {
                    throw ha1.m50341a();
                }
            }
            if (i3 != -1) {
                int i6 = g - i3;
                if (px2.mo42960k()) {
                    i6--;
                }
                px2.mo42967r(Arrays.copyOfRange(iArr, i3, i6 + i3));
            }
            return g;
        }
        throw ha1.m50341a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r4 != 900) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r0 = com.onedelhi.secure.uf0.C6965b.f36082a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0088, code lost:
        r6 = (char) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0092, code lost:
        r2 = com.onedelhi.secure.uf0.C6965b.f36088f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        r6 = 0;
        r11 = r2;
        r2 = r0;
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0099, code lost:
        r0 = com.onedelhi.secure.uf0.C6965b.f36085c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009c, code lost:
        r0 = com.onedelhi.secure.uf0.C6965b.f36084b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a1, code lost:
        r15.append((char) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a5, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        if (r6 == 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a8, code lost:
        r15.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ab, code lost:
        r3 = r3 + 1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m66985e(int[] r12, int[] r13, int r14, java.lang.StringBuilder r15) {
        /*
            com.onedelhi.secure.uf0$b r0 = com.onedelhi.secure.uf0.C6965b.ALPHA
            r1 = 0
            r2 = r0
            r3 = 0
        L_0x0005:
            if (r3 >= r14) goto L_0x00af
            r4 = r12[r3]
            int[] r5 = com.onedelhi.secure.uf0.C6964a.f36081a
            int r6 = r0.ordinal()
            r5 = r5[r6]
            r6 = 32
            r7 = 29
            r8 = 26
            r9 = 913(0x391, float:1.28E-42)
            r10 = 900(0x384, float:1.261E-42)
            switch(r5) {
                case 1: goto L_0x0084;
                case 2: goto L_0x0071;
                case 3: goto L_0x0057;
                case 4: goto L_0x0044;
                case 5: goto L_0x0037;
                case 6: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x00a5
        L_0x0020:
            if (r4 >= r7) goto L_0x0027
            char[] r0 = f36053a
            char r6 = r0[r4]
            goto L_0x003c
        L_0x0027:
            if (r4 == r7) goto L_0x006e
            if (r4 == r10) goto L_0x006e
            if (r4 == r9) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            r0 = r13[r3]
            char r0 = (char) r0
            r15.append(r0)
        L_0x0034:
            r0 = r2
            goto L_0x00a5
        L_0x0037:
            if (r4 >= r8) goto L_0x003f
            int r4 = r4 + 65
            char r6 = (char) r4
        L_0x003c:
            r0 = r2
            goto L_0x00a6
        L_0x003f:
            if (r4 == r8) goto L_0x003c
            if (r4 == r10) goto L_0x006e
            goto L_0x0034
        L_0x0044:
            if (r4 >= r7) goto L_0x004c
            char[] r5 = f36053a
            char r6 = r5[r4]
            goto L_0x00a6
        L_0x004c:
            if (r4 == r7) goto L_0x006e
            if (r4 == r10) goto L_0x006e
            if (r4 == r9) goto L_0x0054
            goto L_0x00a5
        L_0x0054:
            r4 = r13[r3]
            goto L_0x00a1
        L_0x0057:
            r5 = 25
            if (r4 >= r5) goto L_0x0060
            char[] r5 = f36056b
            char r6 = r5[r4]
            goto L_0x00a6
        L_0x0060:
            if (r4 == r10) goto L_0x006e
            if (r4 == r9) goto L_0x006b
            switch(r4) {
                case 25: goto L_0x0068;
                case 26: goto L_0x00a6;
                case 27: goto L_0x009c;
                case 28: goto L_0x006e;
                case 29: goto L_0x0092;
                default: goto L_0x0067;
            }
        L_0x0067:
            goto L_0x00a5
        L_0x0068:
            com.onedelhi.secure.uf0$b r0 = com.onedelhi.secure.uf0.C6965b.PUNCT
            goto L_0x00a5
        L_0x006b:
            r4 = r13[r3]
            goto L_0x00a1
        L_0x006e:
            com.onedelhi.secure.uf0$b r0 = com.onedelhi.secure.uf0.C6965b.ALPHA
            goto L_0x00a5
        L_0x0071:
            if (r4 >= r8) goto L_0x0076
            int r4 = r4 + 97
            goto L_0x0088
        L_0x0076:
            if (r4 == r10) goto L_0x006e
            if (r4 == r9) goto L_0x0081
            switch(r4) {
                case 26: goto L_0x00a6;
                case 27: goto L_0x007e;
                case 28: goto L_0x0099;
                case 29: goto L_0x0092;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x00a5
        L_0x007e:
            com.onedelhi.secure.uf0$b r2 = com.onedelhi.secure.uf0.C6965b.ALPHA_SHIFT
            goto L_0x0094
        L_0x0081:
            r4 = r13[r3]
            goto L_0x00a1
        L_0x0084:
            if (r4 >= r8) goto L_0x008a
            int r4 = r4 + 65
        L_0x0088:
            char r6 = (char) r4
            goto L_0x00a6
        L_0x008a:
            if (r4 == r10) goto L_0x006e
            if (r4 == r9) goto L_0x009f
            switch(r4) {
                case 26: goto L_0x00a6;
                case 27: goto L_0x009c;
                case 28: goto L_0x0099;
                case 29: goto L_0x0092;
                default: goto L_0x0091;
            }
        L_0x0091:
            goto L_0x00a5
        L_0x0092:
            com.onedelhi.secure.uf0$b r2 = com.onedelhi.secure.uf0.C6965b.PUNCT_SHIFT
        L_0x0094:
            r6 = 0
            r11 = r2
            r2 = r0
            r0 = r11
            goto L_0x00a6
        L_0x0099:
            com.onedelhi.secure.uf0$b r0 = com.onedelhi.secure.uf0.C6965b.MIXED
            goto L_0x00a5
        L_0x009c:
            com.onedelhi.secure.uf0$b r0 = com.onedelhi.secure.uf0.C6965b.LOWER
            goto L_0x00a5
        L_0x009f:
            r4 = r13[r3]
        L_0x00a1:
            char r4 = (char) r4
            r15.append(r4)
        L_0x00a5:
            r6 = 0
        L_0x00a6:
            if (r6 == 0) goto L_0x00ab
            r15.append(r6)
        L_0x00ab:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.uf0.m66985e(int[], int[], int, java.lang.StringBuilder):void");
    }

    /* renamed from: f */
    public static int m66986f(int[] iArr, int i, StringBuilder sb) throws ha1 {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < 900) {
                iArr2[i2] = i4;
                i2++;
            } else {
                if (!(i4 == 900 || i4 == 901 || i4 == 928)) {
                    switch (i4) {
                        case f36064j /*922*/:
                        case f36063i /*923*/:
                        case 924:
                            break;
                    }
                }
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == 902 || z) && i2 > 0) {
                sb.append(m66983c(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    /* renamed from: g */
    public static int m66987g(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[((iArr[0] - i) << 1)];
        int[] iArr3 = new int[((iArr[0] - i) << 1)];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < 900) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
            } else if (i4 != 913) {
                if (i4 != 928) {
                    switch (i4) {
                        case 900:
                            iArr2[i2] = 900;
                            i2++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i4) {
                                case f36064j /*922*/:
                                case f36063i /*923*/:
                                case 924:
                                    break;
                            }
                    }
                }
                i = i3 - 1;
                z = true;
            } else {
                iArr2[i2] = 913;
                i = i3 + 1;
                iArr3[i2] = iArr[i3];
                i2++;
            }
            i = i3;
        }
        m66985e(iArr2, iArr3, i2, sb);
        return i;
    }
}

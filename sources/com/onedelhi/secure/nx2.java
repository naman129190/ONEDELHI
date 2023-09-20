package com.onedelhi.secure;

import com.onedelhi.secure.m10;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.apache.commons.compress.archivers.tar.TarConstants;

public final class nx2 {

    /* renamed from: a */
    public static final int f32828a = 0;

    /* renamed from: a */
    public static final Charset f32829a = StandardCharsets.ISO_8859_1;

    /* renamed from: a */
    public static final byte[] f32830a = {TarConstants.LF_NORMAL, TarConstants.LF_LINK, TarConstants.LF_SYMLINK, TarConstants.LF_CHR, TarConstants.LF_BLK, TarConstants.LF_DIR, TarConstants.LF_FIFO, TarConstants.LF_CONTIG, 56, 57, 38, v44.f21655a, 9, 44, 58, 35, 45, 46, 36, mx0.f16579a, 43, 37, mx0.f16598b, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    public static final int f32831b = 1;

    /* renamed from: b */
    public static final byte[] f32832b = {59, 60, 62, m10.C2804j.f15814a, 91, 92, 93, 95, 96, 126, 33, v44.f21655a, 9, 44, 58, 10, 45, 46, 36, mx0.f16579a, 34, 124, mx0.f16598b, 40, 41, iq4.f30423a, 123, 125, 39, 0};

    /* renamed from: c */
    public static final int f32833c = 2;

    /* renamed from: c */
    public static final byte[] f32834c;

    /* renamed from: d */
    public static final int f32835d = 0;

    /* renamed from: d */
    public static final byte[] f32836d = new byte[128];

    /* renamed from: e */
    public static final int f32837e = 1;

    /* renamed from: f */
    public static final int f32838f = 2;

    /* renamed from: g */
    public static final int f32839g = 3;

    /* renamed from: h */
    public static final int f32840h = 900;

    /* renamed from: i */
    public static final int f32841i = 901;

    /* renamed from: j */
    public static final int f32842j = 902;

    /* renamed from: k */
    public static final int f32843k = 913;

    /* renamed from: l */
    public static final int f32844l = 924;

    /* renamed from: m */
    public static final int f32845m = 925;

    /* renamed from: n */
    public static final int f32846n = 926;

    /* renamed from: o */
    public static final int f32847o = 927;

    /* renamed from: com.onedelhi.secure.nx2$a */
    public static /* synthetic */ class C6235a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32848a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onedelhi.secure.v10[] r0 = com.onedelhi.secure.v10.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32848a = r0
                com.onedelhi.secure.v10 r1 = com.onedelhi.secure.v10.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32848a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.v10 r1 = com.onedelhi.secure.v10.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32848a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.v10 r1 = com.onedelhi.secure.v10.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nx2.C6235a.<clinit>():void");
        }
    }

    static {
        byte[] bArr = new byte[128];
        f32834c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f32830a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                f32834c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f32836d, (byte) -1);
        while (true) {
            byte[] bArr3 = f32832b;
            if (i < bArr3.length) {
                byte b2 = bArr3[i];
                if (b2 > 0) {
                    f32836d[b2] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r3 = r3 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m58856a(java.lang.String r5, int r6, java.nio.charset.Charset r7) throws com.onedelhi.secure.vy4 {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L_0x0009:
            if (r1 >= r0) goto L_0x0057
            char r2 = r5.charAt(r1)
            r3 = 0
        L_0x0010:
            r4 = 13
            if (r3 >= r4) goto L_0x0025
            boolean r2 = m58866k(r2)
            if (r2 == 0) goto L_0x0025
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L_0x0025
            char r2 = r5.charAt(r2)
            goto L_0x0010
        L_0x0025:
            if (r3 < r4) goto L_0x0029
            int r1 = r1 - r6
            return r1
        L_0x0029:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L_0x0036
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0036:
            com.onedelhi.secure.vy4 r5 = new com.onedelhi.secure.vy4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x0057:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nx2.m58856a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    /* renamed from: b */
    public static int m58857b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i);
                while (true) {
                    if (!m58866k(charAt) || i >= length) {
                        break loop0;
                    }
                    i2++;
                    i++;
                    if (i < length) {
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static int m58858c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m58866k(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
            if (i3 < 13) {
                if (i3 <= 0) {
                    if (!m58869n(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            } else {
                return (i2 - i) - i3;
            }
        }
        return i2 - i;
    }

    /* renamed from: d */
    public static void m58859d(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        sb.append((i2 == 1 && i3 == 0) ? 913 : i2 % 6 == 0 ? (char) 924 : 901);
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* renamed from: e */
    public static String m58860e(String str, v10 v10, Charset charset) throws vy4 {
        C4597ax a;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f32829a;
        } else if (!f32829a.equals(charset) && (a = C4597ax.m39174a(charset.name())) != null) {
            m58863h(a.mo31241e(), sb);
        }
        int length = str.length();
        int i = C6235a.f32848a[v10.ordinal()];
        if (i == 1) {
            m58862g(str, 0, length, sb, 0);
        } else if (i == 2) {
            byte[] bytes = str.getBytes(charset);
            m58859d(bytes, 0, bytes.length, 1, sb);
        } else if (i != 3) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int b = m58857b(str, i2);
                if (b >= 13) {
                    sb.append(902);
                    m58861f(str, i2, b, sb);
                    i2 += b;
                    i3 = 0;
                    i4 = 2;
                } else {
                    int c = m58858c(str, i2);
                    if (c >= 5 || b == length) {
                        if (i4 != 0) {
                            sb.append(900);
                            i3 = 0;
                            i4 = 0;
                        }
                        i3 = m58862g(str, i2, c, sb, i3);
                        i2 += c;
                    } else {
                        int a2 = m58856a(str, i2, charset);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        int i5 = a2 + i2;
                        byte[] bytes2 = str.substring(i2, i5).getBytes(charset);
                        if (bytes2.length == 1 && i4 == 0) {
                            m58859d(bytes2, 0, 1, 0, sb);
                        } else {
                            m58859d(bytes2, 0, bytes2.length, i4, sb);
                            i3 = 0;
                            i4 = 1;
                        }
                        i2 = i5;
                    }
                }
            }
        } else {
            sb.append(902);
            m58861f(str, 0, length, sb);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static void m58861f(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder(mm0.f16219f);
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (r10 == ' ') goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf A[EDGE_INSN: B:66:0x00cf->B:51:0x00cf ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0011 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m58862g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = r20
            r8 = 0
        L_0x0011:
            int r9 = r17 + r8
            char r10 = r0.charAt(r9)
            r11 = 26
            r12 = 32
            r13 = 28
            r14 = 27
            r15 = 29
            if (r7 == 0) goto L_0x009a
            if (r7 == r6) goto L_0x0075
            if (r7 == r4) goto L_0x0037
            boolean r9 = m58868m(r10)
            if (r9 == 0) goto L_0x0032
            byte[] r9 = f32836d
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x0032:
            r3.append(r15)
        L_0x0035:
            r7 = 0
            goto L_0x0011
        L_0x0037:
            boolean r11 = m58867l(r10)
            if (r11 == 0) goto L_0x0047
            byte[] r9 = f32834c
            byte r9 = r9[r10]
        L_0x0041:
            char r9 = (char) r9
        L_0x0042:
            r3.append(r9)
            goto L_0x00cb
        L_0x0047:
            boolean r11 = m58865j(r10)
            if (r11 == 0) goto L_0x0051
            r3.append(r13)
            goto L_0x0035
        L_0x0051:
            boolean r11 = m58864i(r10)
            if (r11 == 0) goto L_0x0058
            goto L_0x00b0
        L_0x0058:
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x006d
            char r9 = r0.charAt(r9)
            boolean r9 = m58868m(r9)
            if (r9 == 0) goto L_0x006d
            r7 = 3
            r9 = 25
            r3.append(r9)
            goto L_0x0011
        L_0x006d:
            r3.append(r15)
            byte[] r9 = f32836d
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x0075:
            boolean r9 = m58864i(r10)
            if (r9 == 0) goto L_0x0081
            if (r10 != r12) goto L_0x007e
            goto L_0x00a2
        L_0x007e:
            int r10 = r10 + -97
            goto L_0x00a8
        L_0x0081:
            boolean r9 = m58865j(r10)
            if (r9 == 0) goto L_0x008b
            r3.append(r14)
            goto L_0x00a6
        L_0x008b:
            boolean r9 = m58867l(r10)
            if (r9 == 0) goto L_0x0092
            goto L_0x00bc
        L_0x0092:
            r3.append(r15)
            byte[] r9 = f32836d
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x009a:
            boolean r9 = m58865j(r10)
            if (r9 == 0) goto L_0x00aa
            if (r10 != r12) goto L_0x00a6
        L_0x00a2:
            r3.append(r11)
            goto L_0x00cb
        L_0x00a6:
            int r10 = r10 + -65
        L_0x00a8:
            char r9 = (char) r10
            goto L_0x0042
        L_0x00aa:
            boolean r9 = m58864i(r10)
            if (r9 == 0) goto L_0x00b6
        L_0x00b0:
            r3.append(r14)
            r7 = 1
            goto L_0x0011
        L_0x00b6:
            boolean r9 = m58867l(r10)
            if (r9 == 0) goto L_0x00c2
        L_0x00bc:
            r3.append(r13)
            r7 = 2
            goto L_0x0011
        L_0x00c2:
            r3.append(r15)
            byte[] r9 = f32836d
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x00cb:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0011
            int r0 = r3.length()
            r1 = 0
            r8 = 0
        L_0x00d5:
            if (r1 >= r0) goto L_0x00f3
            int r9 = r1 % 2
            if (r9 == 0) goto L_0x00dd
            r9 = 1
            goto L_0x00de
        L_0x00dd:
            r9 = 0
        L_0x00de:
            if (r9 == 0) goto L_0x00ec
            int r8 = r8 * 30
            char r9 = r3.charAt(r1)
            int r8 = r8 + r9
            char r8 = (char) r8
            r2.append(r8)
            goto L_0x00f0
        L_0x00ec:
            char r8 = r3.charAt(r1)
        L_0x00f0:
            int r1 = r1 + 1
            goto L_0x00d5
        L_0x00f3:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x00fd
            int r8 = r8 * 30
            int r8 = r8 + r15
            char r0 = (char) r8
            r2.append(r0)
        L_0x00fd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.nx2.m58862g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: h */
    public static void m58863h(int i, StringBuilder sb) throws vy4 {
        char c;
        if (i >= 0 && i < 900) {
            sb.append(927);
        } else if (i < 810900) {
            sb.append(926);
            sb.append((char) ((i / 900) - 1));
            i %= 900;
        } else if (i < 811800) {
            sb.append(925);
            c = (char) (810900 - i);
            sb.append(c);
        } else {
            throw new vy4("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i)));
        }
        c = (char) i;
        sb.append(c);
    }

    /* renamed from: i */
    public static boolean m58864i(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m58865j(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m58866k(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: l */
    public static boolean m58867l(char c) {
        return f32834c[c] != -1;
    }

    /* renamed from: m */
    public static boolean m58868m(char c) {
        return f32836d[c] != -1;
    }

    /* renamed from: n */
    public static boolean m58869n(char c) {
        if (c == 9 || c == 10 || c == 13) {
            return true;
        }
        return c >= ' ' && c <= '~';
    }
}

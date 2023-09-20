package com.onedelhi.secure;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class xv1 implements Closeable {

    /* renamed from: A */
    public static final int f37602A = 6;

    /* renamed from: B */
    public static final int f37603B = 7;

    /* renamed from: C */
    public static final int f37604C = 8;

    /* renamed from: D */
    public static final int f37605D = 9;

    /* renamed from: E */
    public static final int f37606E = 10;

    /* renamed from: F */
    public static final int f37607F = 11;

    /* renamed from: G */
    public static final int f37608G = 12;

    /* renamed from: H */
    public static final int f37609H = 13;

    /* renamed from: I */
    public static final int f37610I = 14;

    /* renamed from: J */
    public static final int f37611J = 15;

    /* renamed from: K */
    public static final int f37612K = 16;

    /* renamed from: L */
    public static final int f37613L = 17;

    /* renamed from: M */
    public static final int f37614M = 0;

    /* renamed from: N */
    public static final int f37615N = 1;

    /* renamed from: O */
    public static final int f37616O = 2;

    /* renamed from: P */
    public static final int f37617P = 3;

    /* renamed from: Q */
    public static final int f37618Q = 4;

    /* renamed from: R */
    public static final int f37619R = 5;

    /* renamed from: S */
    public static final int f37620S = 6;

    /* renamed from: T */
    public static final int f37621T = 7;

    /* renamed from: U */
    public static final int f37622U = 1024;

    /* renamed from: c */
    public static final long f37623c = -922337203685477580L;

    /* renamed from: u */
    public static final int f37624u = 0;

    /* renamed from: v */
    public static final int f37625v = 1;

    /* renamed from: w */
    public static final int f37626w = 2;

    /* renamed from: x */
    public static final int f37627x = 3;

    /* renamed from: y */
    public static final int f37628y = 4;

    /* renamed from: z */
    public static final int f37629z = 5;

    /* renamed from: a */
    public final Reader f37630a;

    /* renamed from: a */
    public final char[] f37631a = new char[1024];

    /* renamed from: a */
    public int[] f37632a;

    /* renamed from: a */
    public String[] f37633a;

    /* renamed from: b */
    public long f37634b;

    /* renamed from: b */
    public String f37635b;

    /* renamed from: b */
    public boolean f37636b = false;

    /* renamed from: b */
    public int[] f37637b;

    /* renamed from: n */
    public int f37638n = 0;

    /* renamed from: o */
    public int f37639o = 0;

    /* renamed from: p */
    public int f37640p = 0;

    /* renamed from: q */
    public int f37641q = 0;

    /* renamed from: r */
    public int f37642r = 0;

    /* renamed from: s */
    public int f37643s;

    /* renamed from: t */
    public int f37644t;

    /* renamed from: com.onedelhi.secure.xv1$a */
    public class C7279a extends yv1 {
        /* renamed from: a */
        public void mo47419a(xv1 xv1) throws IOException {
            int i;
            if (xv1 instanceof gw1) {
                ((gw1) xv1).mo36938h1();
                return;
            }
            int i2 = xv1.f37642r;
            if (i2 == 0) {
                i2 = xv1.mo47413g();
            }
            if (i2 == 13) {
                i = 9;
            } else if (i2 == 12) {
                i = 8;
            } else if (i2 == 14) {
                i = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + xv1.mo36944q0() + xv1.mo47403K());
            }
            xv1.f37642r = i;
        }
    }

    static {
        yv1.f38068a = new C7279a();
    }

    public xv1(Reader reader) {
        int[] iArr = new int[32];
        this.f37632a = iArr;
        this.f37644t = 0 + 1;
        iArr[0] = 6;
        this.f37633a = new String[32];
        this.f37637b = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f37630a = reader;
    }

    /* renamed from: A */
    public boolean mo36922A() throws IOException {
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    /* renamed from: C0 */
    public final int mo47398C0() throws IOException {
        int i;
        char c;
        char[] cArr = this.f37631a;
        int i2 = this.f37638n;
        int i3 = this.f37639o;
        int i4 = 0;
        int i5 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i2 + i5 == i3) {
                if (i5 == cArr.length) {
                    return i4;
                }
                if (!mo47415m(i5 + 1)) {
                    break;
                }
                i2 = this.f37638n;
                i3 = this.f37639o;
            }
            c = cArr[i2 + i5];
            if (c == '+') {
                i4 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i4 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i5++;
            } else {
                if (c == '-') {
                    i4 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i4 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j = (long) (-(c - '0'));
                        i4 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - '0'));
                            int i6 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                            z &= i6 > 0 || (i6 == 0 && j2 < j);
                            j = j2;
                        } else if (c2 == 3) {
                            i4 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i4 = 0;
                            c2 = 7;
                        }
                        i4 = 0;
                    }
                }
                i5++;
            }
            c2 = 6;
            i5++;
        }
        if (mo47402H(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f37634b = j;
            this.f37638n += i5;
            i = 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f37643s = i5;
            i = 16;
        }
        this.f37642r = i;
        return i;
    }

    /* renamed from: E */
    public final boolean mo47399E() {
        return this.f37636b;
    }

    /* renamed from: F0 */
    public final void mo47400F0(int i) {
        int i2 = this.f37644t;
        int[] iArr = this.f37632a;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f37632a = Arrays.copyOf(iArr, i3);
            this.f37637b = Arrays.copyOf(this.f37637b, i3);
            this.f37633a = (String[]) Arrays.copyOf(this.f37633a, i3);
        }
        int[] iArr2 = this.f37632a;
        int i4 = this.f37644t;
        this.f37644t = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: G0 */
    public final char mo47401G0() throws IOException {
        int i;
        int i2;
        if (this.f37638n != this.f37639o || mo47415m(1)) {
            char[] cArr = this.f37631a;
            int i3 = this.f37638n;
            int i4 = i3 + 1;
            this.f37638n = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f37640p++;
                this.f37641q = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    throw mo47409S0("Invalid escape sequence");
                } else if (i4 + 4 <= this.f37639o || mo47415m(4)) {
                    char c2 = 0;
                    int i5 = this.f37638n;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c3 = this.f37631a[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f37631a, this.f37638n, 4));
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i5++;
                    }
                    this.f37638n += 4;
                    return c2;
                } else {
                    throw mo47409S0("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw mo47409S0("Unterminated escape sequence");
    }

    /* renamed from: H */
    public final boolean mo47402H(char c) throws IOException {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        mo47410c();
        return false;
    }

    /* renamed from: K */
    public String mo47403K() {
        return " at line " + (this.f37640p + 1) + " column " + ((this.f37638n - this.f37641q) + 1) + " path " + mo36935f0();
    }

    /* renamed from: M */
    public boolean mo36923M() throws IOException {
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        if (i == 5) {
            this.f37642r = 0;
            int[] iArr = this.f37637b;
            int i2 = this.f37644t - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f37642r = 0;
            int[] iArr2 = this.f37637b;
            int i3 = this.f37644t - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo36944q0() + mo47403K());
        }
    }

    /* renamed from: M0 */
    public final void mo47404M0(boolean z) {
        this.f37636b = z;
    }

    /* renamed from: N0 */
    public final void mo47405N0(char c) throws IOException {
        char[] cArr = this.f37631a;
        while (true) {
            int i = this.f37638n;
            int i2 = this.f37639o;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f37638n = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f37638n = i3;
                        mo47401G0();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f37640p++;
                            this.f37641q = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f37638n = i;
                    if (!mo47415m(1)) {
                        throw mo47409S0("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: O0 */
    public final boolean mo47406O0(String str) throws IOException {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f37638n + length > this.f37639o && !mo47415m(length)) {
                return false;
            }
            char[] cArr = this.f37631a;
            int i2 = this.f37638n;
            if (cArr[i2] == 10) {
                this.f37640p++;
                this.f37641q = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f37631a[this.f37638n + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f37638n++;
        }
    }

    /* renamed from: P0 */
    public final void mo47407P0() throws IOException {
        char c;
        do {
            if (this.f37638n < this.f37639o || mo47415m(1)) {
                char[] cArr = this.f37631a;
                int i = this.f37638n;
                int i2 = i + 1;
                this.f37638n = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f37640p++;
                    this.f37641q = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        mo47410c();
     */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47408Q0() throws java.io.IOException {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f37638n
            int r2 = r1 + r0
            int r3 = r4.f37639o
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f37631a
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.mo47410c()
        L_0x004b:
            int r1 = r4.f37638n
            int r1 = r1 + r0
            r4.f37638n = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f37638n = r1
            r0 = 1
            boolean r0 = r4.mo47415m(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xv1.mo47408Q0():void");
    }

    /* renamed from: R0 */
    public void mo36924R0() throws IOException {
        char c;
        int i = 0;
        do {
            int i2 = this.f37642r;
            if (i2 == 0) {
                i2 = mo47413g();
            }
            if (i2 == 3) {
                mo47400F0(1);
            } else if (i2 == 1) {
                mo47400F0(3);
            } else if (i2 == 4 || i2 == 2) {
                this.f37644t--;
                i--;
                this.f37642r = 0;
            } else if (i2 == 14 || i2 == 10) {
                mo47408Q0();
                this.f37642r = 0;
            } else {
                if (i2 == 8 || i2 == 12) {
                    c = '\'';
                } else if (i2 == 9 || i2 == 13) {
                    c = tk4.f35693a;
                } else {
                    if (i2 == 16) {
                        this.f37638n += this.f37643s;
                    }
                    this.f37642r = 0;
                }
                mo47405N0(c);
                this.f37642r = 0;
            }
            i++;
            this.f37642r = 0;
        } while (i != 0);
        int[] iArr = this.f37637b;
        int i3 = this.f37644t;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f37633a[i3 - 1] = "null";
    }

    /* renamed from: S0 */
    public final IOException mo47409S0(String str) throws IOException {
        throw new cc2(str + mo47403K());
    }

    /* renamed from: X */
    public double mo36926X() throws IOException {
        String str;
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        if (i == 15) {
            this.f37642r = 0;
            int[] iArr = this.f37637b;
            int i2 = this.f37644t - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f37634b;
        }
        if (i == 16) {
            this.f37635b = new String(this.f37631a, this.f37638n, this.f37643s);
            this.f37638n += this.f37643s;
        } else {
            if (i == 8 || i == 9) {
                str = mo47414l0(i == 8 ? '\'' : tk4.f35693a);
            } else if (i == 10) {
                str = mo47417p0();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + mo36944q0() + mo47403K());
            }
            this.f37635b = str;
        }
        this.f37642r = 11;
        double parseDouble = Double.parseDouble(this.f37635b);
        if (this.f37636b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f37635b = null;
            this.f37642r = 0;
            int[] iArr2 = this.f37637b;
            int i3 = this.f37644t - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new cc2("JSON forbids NaN and infinities: " + parseDouble + mo47403K());
    }

    /* renamed from: Y */
    public int mo36927Y() throws IOException {
        String l0;
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        if (i == 15) {
            long j = this.f37634b;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f37642r = 0;
                int[] iArr = this.f37637b;
                int i3 = this.f37644t - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f37634b + mo47403K());
        }
        if (i == 16) {
            this.f37635b = new String(this.f37631a, this.f37638n, this.f37643s);
            this.f37638n += this.f37643s;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                l0 = mo47417p0();
            } else {
                l0 = mo47414l0(i == 8 ? '\'' : tk4.f35693a);
            }
            this.f37635b = l0;
            try {
                int parseInt = Integer.parseInt(this.f37635b);
                this.f37642r = 0;
                int[] iArr2 = this.f37637b;
                int i4 = this.f37644t - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + mo36944q0() + mo47403K());
        }
        this.f37642r = 11;
        double parseDouble = Double.parseDouble(this.f37635b);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f37635b = null;
            this.f37642r = 0;
            int[] iArr3 = this.f37637b;
            int i6 = this.f37644t - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f37635b + mo47403K());
    }

    /* renamed from: Z */
    public long mo36928Z() throws IOException {
        String l0;
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        if (i == 15) {
            this.f37642r = 0;
            int[] iArr = this.f37637b;
            int i2 = this.f37644t - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f37634b;
        }
        if (i == 16) {
            this.f37635b = new String(this.f37631a, this.f37638n, this.f37643s);
            this.f37638n += this.f37643s;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                l0 = mo47417p0();
            } else {
                l0 = mo47414l0(i == 8 ? '\'' : tk4.f35693a);
            }
            this.f37635b = l0;
            try {
                long parseLong = Long.parseLong(this.f37635b);
                this.f37642r = 0;
                int[] iArr2 = this.f37637b;
                int i3 = this.f37644t - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + mo36944q0() + mo47403K());
        }
        this.f37642r = 11;
        double parseDouble = Double.parseDouble(this.f37635b);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f37635b = null;
            this.f37642r = 0;
            int[] iArr3 = this.f37637b;
            int i4 = this.f37644t - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f37635b + mo47403K());
    }

    /* renamed from: a */
    public void mo36929a() throws IOException {
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        if (i == 3) {
            mo47400F0(1);
            this.f37637b[this.f37644t - 1] = 0;
            this.f37642r = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo36944q0() + mo47403K());
    }

    /* renamed from: b */
    public void mo36930b() throws IOException {
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        if (i == 1) {
            mo47400F0(3);
            this.f37642r = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo36944q0() + mo47403K());
    }

    /* renamed from: c */
    public final void mo47410c() throws IOException {
        if (!this.f37636b) {
            throw mo47409S0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: c0 */
    public String mo36932c0() throws IOException {
        String str;
        char c;
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        if (i == 14) {
            str = mo47417p0();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = tk4.f35693a;
            } else {
                throw new IllegalStateException("Expected a name but was " + mo36944q0() + mo47403K());
            }
            str = mo47414l0(c);
        }
        this.f37642r = 0;
        this.f37633a[this.f37644t - 1] = str;
        return str;
    }

    public void close() throws IOException {
        this.f37642r = 0;
        this.f37632a[0] = 8;
        this.f37644t = 1;
        this.f37630a.close();
    }

    /* renamed from: d */
    public final void mo47411d() throws IOException {
        mo47412e0(true);
        int i = this.f37638n - 1;
        this.f37638n = i;
        if (i + 5 <= this.f37639o || mo47415m(5)) {
            int i2 = this.f37638n;
            char[] cArr = this.f37631a;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == 10) {
                this.f37638n = i2 + 5;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r1 != '/') goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r7.f37638n = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r4 != r2) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r7.f37638n = r4 - 1;
        r2 = mo47415m(2);
        r7.f37638n++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r2 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        mo47410c();
        r2 = r7.f37638n;
        r3 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r3 == '*') goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r3 == '/') goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        r7.f37638n = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r7.f37638n = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (mo47406O0("*/") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        throw mo47409S0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        r7.f37638n = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r1 != '#') goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        mo47410c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        return r1;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47412e0(boolean r8) throws java.io.IOException {
        /*
            r7 = this;
            char[] r0 = r7.f37631a
        L_0x0002:
            int r1 = r7.f37638n
        L_0x0004:
            int r2 = r7.f37639o
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0034
            r7.f37638n = r1
            boolean r1 = r7.mo47415m(r3)
            if (r1 != 0) goto L_0x0030
            if (r8 != 0) goto L_0x0015
            r8 = -1
            return r8
        L_0x0015:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.mo47403K()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0030:
            int r1 = r7.f37638n
            int r2 = r7.f37639o
        L_0x0034:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0044
            int r1 = r7.f37640p
            int r1 = r1 + r3
            r7.f37640p = r1
            r7.f37641q = r4
            goto L_0x00a3
        L_0x0044:
            r5 = 32
            if (r1 == r5) goto L_0x00a3
            r5 = 13
            if (r1 == r5) goto L_0x00a3
            r5 = 9
            if (r1 != r5) goto L_0x0051
            goto L_0x00a3
        L_0x0051:
            r5 = 47
            if (r1 != r5) goto L_0x0098
            r7.f37638n = r4
            r6 = 2
            if (r4 != r2) goto L_0x006a
            int r4 = r4 + -1
            r7.f37638n = r4
            boolean r2 = r7.mo47415m(r6)
            int r4 = r7.f37638n
            int r4 = r4 + r3
            r7.f37638n = r4
            if (r2 != 0) goto L_0x006a
            return r1
        L_0x006a:
            r7.mo47410c()
            int r2 = r7.f37638n
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L_0x0080
            if (r3 == r5) goto L_0x0078
            return r1
        L_0x0078:
            int r2 = r2 + 1
            r7.f37638n = r2
        L_0x007c:
            r7.mo47407P0()
            goto L_0x0002
        L_0x0080:
            int r2 = r2 + 1
            r7.f37638n = r2
            java.lang.String r1 = "*/"
            boolean r1 = r7.mo47406O0(r1)
            if (r1 == 0) goto L_0x0091
            int r1 = r7.f37638n
            int r1 = r1 + r6
            goto L_0x0004
        L_0x0091:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.mo47409S0(r8)
            throw r8
        L_0x0098:
            r2 = 35
            r7.f37638n = r4
            if (r1 != r2) goto L_0x00a2
            r7.mo47410c()
            goto L_0x007c
        L_0x00a2:
            return r1
        L_0x00a3:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xv1.mo47412e0(boolean):int");
    }

    /* renamed from: f0 */
    public String mo36935f0() {
        return mo47416p(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo47413g() throws java.io.IOException {
        /*
            r15 = this;
            int[] r0 = r15.f37632a
            int r1 = r15.f37644t
            int r2 = r1 + -1
            r2 = r0[r2]
            r3 = 8
            r4 = 39
            r5 = 34
            r6 = 93
            r7 = 3
            r8 = 7
            r9 = 59
            r10 = 44
            r11 = 4
            r12 = 2
            r13 = 1
            if (r2 != r13) goto L_0x0020
            int r1 = r1 - r13
            r0[r1] = r12
            goto L_0x00a2
        L_0x0020:
            if (r2 != r12) goto L_0x003a
            int r0 = r15.mo47412e0(r13)
            if (r0 == r10) goto L_0x00a2
            if (r0 == r9) goto L_0x0036
            if (r0 != r6) goto L_0x002f
            r15.f37642r = r11
            return r11
        L_0x002f:
            java.lang.String r0 = "Unterminated array"
            java.io.IOException r0 = r15.mo47409S0(r0)
            throw r0
        L_0x0036:
            r15.mo47410c()
            goto L_0x00a2
        L_0x003a:
            r14 = 5
            if (r2 == r7) goto L_0x0117
            if (r2 != r14) goto L_0x0041
            goto L_0x0117
        L_0x0041:
            if (r2 != r11) goto L_0x0076
            int r1 = r1 - r13
            r0[r1] = r14
            int r0 = r15.mo47412e0(r13)
            r1 = 58
            if (r0 == r1) goto L_0x00a2
            r1 = 61
            if (r0 != r1) goto L_0x006f
            r15.mo47410c()
            int r0 = r15.f37638n
            int r1 = r15.f37639o
            if (r0 < r1) goto L_0x0061
            boolean r0 = r15.mo47415m(r13)
            if (r0 == 0) goto L_0x00a2
        L_0x0061:
            char[] r0 = r15.f37631a
            int r1 = r15.f37638n
            char r0 = r0[r1]
            r14 = 62
            if (r0 != r14) goto L_0x00a2
            int r1 = r1 + r13
            r15.f37638n = r1
            goto L_0x00a2
        L_0x006f:
            java.lang.String r0 = "Expected ':'"
            java.io.IOException r0 = r15.mo47409S0(r0)
            throw r0
        L_0x0076:
            r0 = 6
            if (r2 != r0) goto L_0x0088
            boolean r0 = r15.f37636b
            if (r0 == 0) goto L_0x0080
            r15.mo47411d()
        L_0x0080:
            int[] r0 = r15.f37632a
            int r1 = r15.f37644t
            int r1 = r1 - r13
            r0[r1] = r8
            goto L_0x00a2
        L_0x0088:
            if (r2 != r8) goto L_0x00a0
            r0 = 0
            int r0 = r15.mo47412e0(r0)
            r1 = -1
            if (r0 != r1) goto L_0x0097
            r0 = 17
        L_0x0094:
            r15.f37642r = r0
            return r0
        L_0x0097:
            r15.mo47410c()
            int r0 = r15.f37638n
            int r0 = r0 - r13
            r15.f37638n = r0
            goto L_0x00a2
        L_0x00a0:
            if (r2 == r3) goto L_0x010f
        L_0x00a2:
            int r0 = r15.mo47412e0(r13)
            if (r0 == r5) goto L_0x010c
            if (r0 == r4) goto L_0x0106
            if (r0 == r10) goto L_0x00ef
            if (r0 == r9) goto L_0x00ef
            r1 = 91
            if (r0 == r1) goto L_0x00ec
            if (r0 == r6) goto L_0x00e7
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L_0x00e4
            int r0 = r15.f37638n
            int r0 = r0 - r13
            r15.f37638n = r0
            int r0 = r15.mo47418u0()
            if (r0 == 0) goto L_0x00c4
            return r0
        L_0x00c4:
            int r0 = r15.mo47398C0()
            if (r0 == 0) goto L_0x00cb
            return r0
        L_0x00cb:
            char[] r0 = r15.f37631a
            int r1 = r15.f37638n
            char r0 = r0[r1]
            boolean r0 = r15.mo47402H(r0)
            if (r0 == 0) goto L_0x00dd
            r15.mo47410c()
            r0 = 10
            goto L_0x0094
        L_0x00dd:
            java.lang.String r0 = "Expected value"
            java.io.IOException r0 = r15.mo47409S0(r0)
            throw r0
        L_0x00e4:
            r15.f37642r = r13
            return r13
        L_0x00e7:
            if (r2 != r13) goto L_0x00ef
            r15.f37642r = r11
            return r11
        L_0x00ec:
            r15.f37642r = r7
            return r7
        L_0x00ef:
            if (r2 == r13) goto L_0x00fb
            if (r2 != r12) goto L_0x00f4
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r0 = "Unexpected value"
            java.io.IOException r0 = r15.mo47409S0(r0)
            throw r0
        L_0x00fb:
            r15.mo47410c()
            int r0 = r15.f37638n
            int r0 = r0 - r13
            r15.f37638n = r0
            r15.f37642r = r8
            return r8
        L_0x0106:
            r15.mo47410c()
            r15.f37642r = r3
            return r3
        L_0x010c:
            r0 = 9
            goto L_0x0094
        L_0x010f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonReader is closed"
            r0.<init>(r1)
            throw r0
        L_0x0117:
            int r1 = r1 - r13
            r0[r1] = r11
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 != r14) goto L_0x0135
            int r1 = r15.mo47412e0(r13)
            if (r1 == r10) goto L_0x0135
            if (r1 == r9) goto L_0x0132
            if (r1 != r0) goto L_0x012b
            r15.f37642r = r12
            return r12
        L_0x012b:
            java.lang.String r0 = "Unterminated object"
            java.io.IOException r0 = r15.mo47409S0(r0)
            throw r0
        L_0x0132:
            r15.mo47410c()
        L_0x0135:
            int r1 = r15.mo47412e0(r13)
            if (r1 == r5) goto L_0x016a
            if (r1 == r4) goto L_0x0163
            java.lang.String r3 = "Expected name"
            if (r1 == r0) goto L_0x0159
            r15.mo47410c()
            int r0 = r15.f37638n
            int r0 = r0 - r13
            r15.f37638n = r0
            char r0 = (char) r1
            boolean r0 = r15.mo47402H(r0)
            if (r0 == 0) goto L_0x0154
            r0 = 14
            goto L_0x0094
        L_0x0154:
            java.io.IOException r0 = r15.mo47409S0(r3)
            throw r0
        L_0x0159:
            if (r2 == r14) goto L_0x015e
            r15.f37642r = r12
            return r12
        L_0x015e:
            java.io.IOException r0 = r15.mo47409S0(r3)
            throw r0
        L_0x0163:
            r15.mo47410c()
            r0 = 12
            goto L_0x0094
        L_0x016a:
            r0 = 13
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xv1.mo47413g():int");
    }

    /* renamed from: h */
    public void mo36937h() throws IOException {
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        if (i == 4) {
            int i2 = this.f37644t - 1;
            this.f37644t = i2;
            int[] iArr = this.f37637b;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f37642r = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo36944q0() + mo47403K());
    }

    /* renamed from: j0 */
    public void mo36940j0() throws IOException {
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        if (i == 7) {
            this.f37642r = 0;
            int[] iArr = this.f37637b;
            int i2 = this.f37644t - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo36944q0() + mo47403K());
    }

    /* renamed from: l */
    public void mo36941l() throws IOException {
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        if (i == 2) {
            int i2 = this.f37644t - 1;
            this.f37644t = i2;
            this.f37633a[i2] = null;
            int[] iArr = this.f37637b;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f37642r = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo36944q0() + mo47403K());
    }

    /* renamed from: l0 */
    public final String mo47414l0(char c) throws IOException {
        char[] cArr = this.f37631a;
        StringBuilder sb = null;
        while (true) {
            int i = this.f37638n;
            int i2 = this.f37639o;
            int i3 = i;
            while (true) {
                if (i < i2) {
                    int i4 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f37638n = i4;
                        int i5 = (i4 - i3) - 1;
                        if (sb == null) {
                            return new String(cArr, i3, i5);
                        }
                        sb.append(cArr, i3, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f37638n = i4;
                        int i6 = (i4 - i3) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i3, i6);
                        sb.append(mo47401G0());
                    } else {
                        if (c2 == 10) {
                            this.f37640p++;
                            this.f37641q = i4;
                        }
                        i = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i3) * 2, 16));
                    }
                    sb.append(cArr, i3, i - i3);
                    this.f37638n = i;
                    if (!mo47415m(1)) {
                        throw mo47409S0("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final boolean mo47415m(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.f37631a;
        int i4 = this.f37641q;
        int i5 = this.f37638n;
        this.f37641q = i4 - i5;
        int i6 = this.f37639o;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f37639o = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f37639o = 0;
        }
        this.f37638n = 0;
        do {
            Reader reader = this.f37630a;
            int i8 = this.f37639o;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f37639o + read;
            this.f37639o = i2;
            if (this.f37640p == 0 && (i3 = this.f37641q) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f37638n++;
                this.f37641q = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: o0 */
    public String mo36942o0() throws IOException {
        String str;
        char c;
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        if (i == 10) {
            str = mo47417p0();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = tk4.f35693a;
            } else if (i == 11) {
                str = this.f37635b;
                this.f37635b = null;
            } else if (i == 15) {
                str = Long.toString(this.f37634b);
            } else if (i == 16) {
                str = new String(this.f37631a, this.f37638n, this.f37643s);
                this.f37638n += this.f37643s;
            } else {
                throw new IllegalStateException("Expected a string but was " + mo36944q0() + mo47403K());
            }
            str = mo47414l0(c);
        }
        this.f37642r = 0;
        int[] iArr = this.f37637b;
        int i2 = this.f37644t - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: p */
    public final String mo47416p(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.f37644t;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f37632a[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.f37637b[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f37633a;
                if (strArr[i] != null) {
                    sb.append(strArr[i]);
                }
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        mo47410c();
     */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo47417p0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f37638n
            int r4 = r3 + r2
            int r5 = r6.f37639o
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f37631a
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.mo47410c()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f37631a
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.mo47415m(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f37631a
            int r4 = r6.f37638n
            r1.append(r3, r4, r2)
            int r3 = r6.f37638n
            int r3 = r3 + r2
            r6.f37638n = r3
            r2 = 1
            boolean r2 = r6.mo47415m(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f37631a
            int r3 = r6.f37638n
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f37631a
            int r3 = r6.f37638n
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f37638n
            int r2 = r2 + r0
            r6.f37638n = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xv1.mo47417p0():java.lang.String");
    }

    /* renamed from: q */
    public String mo36943q() {
        return mo47416p(true);
    }

    /* renamed from: q0 */
    public fw1 mo36944q0() throws IOException {
        int i = this.f37642r;
        if (i == 0) {
            i = mo47413g();
        }
        switch (i) {
            case 1:
                return fw1.BEGIN_OBJECT;
            case 2:
                return fw1.END_OBJECT;
            case 3:
                return fw1.BEGIN_ARRAY;
            case 4:
                return fw1.END_ARRAY;
            case 5:
            case 6:
                return fw1.BOOLEAN;
            case 7:
                return fw1.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return fw1.STRING;
            case 12:
            case 13:
            case 14:
                return fw1.NAME;
            case 15:
            case 16:
                return fw1.NUMBER;
            case 17:
                return fw1.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + mo47403K();
    }

    /* renamed from: u0 */
    public final int mo47418u0() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.f37631a[this.f37638n];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = h60.f29487F;
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = h60.f29488G;
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f37638n + i2 >= this.f37639o && !mo47415m(i2 + 1)) {
                return 0;
            }
            char c2 = this.f37631a[this.f37638n + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f37638n + length < this.f37639o || mo47415m(length + 1)) && mo47402H(this.f37631a[this.f37638n + length])) {
            return 0;
        }
        this.f37638n += length;
        this.f37642r = i;
        return i;
    }
}

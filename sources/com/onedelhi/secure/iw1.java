package com.onedelhi.secure;

import com.onedelhi.secure.wv1;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;

public final class iw1 extends wv1 {

    /* renamed from: A */
    public static final int f13846A = 10;

    /* renamed from: B */
    public static final int f13847B = 11;

    /* renamed from: C */
    public static final int f13848C = 12;

    /* renamed from: D */
    public static final int f13849D = 13;

    /* renamed from: E */
    public static final int f13850E = 14;

    /* renamed from: F */
    public static final int f13851F = 15;

    /* renamed from: G */
    public static final int f13852G = 16;

    /* renamed from: H */
    public static final int f13853H = 17;

    /* renamed from: I */
    public static final int f13854I = 18;

    /* renamed from: J */
    public static final int f13855J = 0;

    /* renamed from: K */
    public static final int f13856K = 1;

    /* renamed from: L */
    public static final int f13857L = 2;

    /* renamed from: M */
    public static final int f13858M = 3;

    /* renamed from: N */
    public static final int f13859N = 4;

    /* renamed from: O */
    public static final int f13860O = 5;

    /* renamed from: P */
    public static final int f13861P = 6;

    /* renamed from: Q */
    public static final int f13862Q = 7;

    /* renamed from: a */
    public static final C5301fr f13863a = C5301fr.m48392v("'\\");

    /* renamed from: b */
    public static final C5301fr f13864b = C5301fr.m48392v("\"\\");

    /* renamed from: c */
    public static final long f13865c = -922337203685477580L;

    /* renamed from: c */
    public static final C5301fr f13866c = C5301fr.m48392v("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: d */
    public static final C5301fr f13867d = C5301fr.m48392v("\n\r");

    /* renamed from: e */
    public static final C5301fr f13868e = C5301fr.m48392v("*/");

    /* renamed from: q */
    public static final int f13869q = 0;

    /* renamed from: r */
    public static final int f13870r = 1;

    /* renamed from: s */
    public static final int f13871s = 2;

    /* renamed from: t */
    public static final int f13872t = 3;

    /* renamed from: u */
    public static final int f13873u = 4;

    /* renamed from: v */
    public static final int f13874v = 5;

    /* renamed from: w */
    public static final int f13875w = 6;

    /* renamed from: x */
    public static final int f13876x = 7;

    /* renamed from: y */
    public static final int f13877y = 8;

    /* renamed from: z */
    public static final int f13878z = 9;

    /* renamed from: a */
    public final C6205no f13879a;

    /* renamed from: a */
    public final C6893to f13880a;

    /* renamed from: b */
    public long f13881b;
    @ts2

    /* renamed from: b */
    public String f13882b;

    /* renamed from: o */
    public int f13883o = 0;

    /* renamed from: p */
    public int f13884p;

    public iw1(C6893to toVar) {
        Objects.requireNonNull(toVar, "source == null");
        this.f13880a = toVar;
        this.f13879a = toVar.mo31682e();
        mo26706K(6);
    }

    /* renamed from: A */
    public String mo17951A() throws IOException {
        String str;
        C5301fr frVar;
        int i = this.f13883o;
        if (i == 0) {
            i = mo17971j0();
        }
        if (i == 10) {
            str = mo17952C0();
        } else {
            if (i == 9) {
                frVar = f13864b;
            } else if (i == 8) {
                frVar = f13863a;
            } else if (i == 11) {
                str = this.f13882b;
                this.f13882b = null;
            } else if (i == 16) {
                str = Long.toString(this.f13881b);
            } else if (i == 17) {
                str = this.f13879a.mo31698r1((long) this.f13884p);
            } else {
                throw new lv1("Expected a string but was " + mo17955H() + " at path " + mo26708f0());
            }
            str = mo17981u0(frVar);
        }
        this.f13883o = 0;
        int[] iArr = this.f22312b;
        int i2 = this.f22314n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: C0 */
    public final String mo17952C0() throws IOException {
        long q1 = this.f13880a.mo31695q1(f13866c);
        return q1 != -1 ? this.f13879a.mo31698r1(q1) : this.f13879a.mo31688j();
    }

    /* renamed from: F0 */
    public final int mo17953F0() throws IOException {
        String str;
        String str2;
        int i;
        byte Z = this.f13879a.mo41249Z(0);
        if (Z == 116 || Z == 84) {
            i = 5;
            str2 = h60.f29487F;
            str = "TRUE";
        } else if (Z == 102 || Z == 70) {
            i = 6;
            str2 = h60.f29488G;
            str = "FALSE";
        } else if (Z != 110 && Z != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f13880a.mo31677T((long) i3)) {
                return 0;
            }
            byte Z2 = this.f13879a.mo41249Z((long) i2);
            if (Z2 != str2.charAt(i2) && Z2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f13880a.mo31677T((long) (length + 1)) && mo17977p0(this.f13879a.mo41249Z((long) length))) {
            return 0;
        }
        this.f13879a.mo31670F1((long) length);
        this.f13883o = i;
        return i;
    }

    /* renamed from: G0 */
    public final int mo17954G0() throws IOException {
        int i;
        byte Z;
        boolean z = true;
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        char c = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            int i4 = i3 + 1;
            if (!this.f13880a.mo31677T((long) i4)) {
                break;
            }
            Z = this.f13879a.mo41249Z((long) i3);
            if (Z != 43) {
                if (Z != 69 && Z != 101) {
                    if (Z != 45) {
                        if (Z != 46) {
                            if (Z >= 48 && Z <= 57) {
                                if (c == z || c == 0) {
                                    j = (long) (-(Z - 48));
                                    i2 = 0;
                                    c = 2;
                                } else {
                                    if (c == 2) {
                                        if (j == 0) {
                                            return i2;
                                        }
                                        long j2 = (10 * j) - ((long) (Z - 48));
                                        int i5 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                                        z2 &= i5 > 0 || (i5 == 0 && j2 < j);
                                        j = j2;
                                    } else if (c == 3) {
                                        i2 = 0;
                                        c = 4;
                                    } else if (c == 5 || c == 6) {
                                        i2 = 0;
                                        c = 7;
                                    }
                                    i2 = 0;
                                }
                            }
                        } else if (c != 2) {
                            return i2;
                        } else {
                            c = 3;
                        }
                    } else if (c == 0) {
                        c = 1;
                        z3 = true;
                    } else if (c != 5) {
                        return i2;
                    }
                    i3 = i4;
                    z = true;
                } else if (c != 2 && c != 4) {
                    return i2;
                } else {
                    c = 5;
                    i3 = i4;
                    z = true;
                }
            } else if (c != 5) {
                return i2;
            }
            c = 6;
            i3 = i4;
            z = true;
        }
        if (mo17977p0(Z)) {
            return 0;
        }
        if (c == 2 && z2 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f13881b = j;
            this.f13879a.mo31670F1((long) i3);
            i = 16;
        } else if (c != 2 && c != 4 && c != 7) {
            return 0;
        } else {
            this.f13884p = i3;
            i = 17;
        }
        this.f13883o = i;
        return i;
    }

    /* renamed from: H */
    public wv1.C3877b mo17955H() throws IOException {
        int i = this.f13883o;
        if (i == 0) {
            i = mo17971j0();
        }
        switch (i) {
            case 1:
                return wv1.C3877b.BEGIN_OBJECT;
            case 2:
                return wv1.C3877b.END_OBJECT;
            case 3:
                return wv1.C3877b.BEGIN_ARRAY;
            case 4:
                return wv1.C3877b.END_ARRAY;
            case 5:
            case 6:
                return wv1.C3877b.BOOLEAN;
            case 7:
                return wv1.C3877b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return wv1.C3877b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return wv1.C3877b.NAME;
            case 16:
            case 17:
                return wv1.C3877b.NUMBER;
            case 18:
                return wv1.C3877b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: M */
    public int mo17956M(wv1.C3876a aVar) throws IOException {
        int i = this.f13883o;
        if (i == 0) {
            i = mo17971j0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return mo17973l0(this.f13882b, aVar);
        }
        int m0 = this.f13880a.mo31692m0(aVar.f22315a);
        if (m0 != -1) {
            this.f13883o = 0;
            this.f22310a[this.f22314n - 1] = aVar.f22316a[m0];
            return m0;
        }
        String str = this.f22310a[this.f22314n - 1];
        String q = mo17978q();
        int l0 = mo17973l0(q, aVar);
        if (l0 == -1) {
            this.f13883o = 15;
            this.f13882b = q;
            this.f22310a[this.f22314n - 1] = str;
        }
        return l0;
    }

    /* renamed from: M0 */
    public final char mo17957M0() throws IOException {
        int i;
        int i2;
        if (this.f13880a.mo31677T(1)) {
            byte readByte = this.f13879a.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f22311b) {
                    return (char) readByte;
                }
                throw mo26707c0("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f13880a.mo31677T(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte Z = this.f13879a.mo41249Z((long) i3);
                    char c2 = (char) (c << 4);
                    if (Z < 48 || Z > 57) {
                        if (Z >= 97 && Z <= 102) {
                            i = Z - 97;
                        } else if (Z < 65 || Z > 70) {
                            throw mo26707c0("\\u" + this.f13879a.mo31698r1(4));
                        } else {
                            i = Z - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = Z - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f13879a.mo31670F1(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + mo26708f0());
            }
        } else {
            throw mo26707c0("Unterminated escape sequence");
        }
    }

    /* renamed from: N0 */
    public final void mo17958N0(C5301fr frVar) throws IOException {
        while (true) {
            long q1 = this.f13880a.mo31695q1(frVar);
            if (q1 == -1) {
                throw mo26707c0("Unterminated string");
            } else if (this.f13879a.mo41249Z(q1) == 92) {
                this.f13879a.mo31670F1(q1 + 1);
                mo17957M0();
            } else {
                this.f13879a.mo31670F1(q1 + 1);
                return;
            }
        }
    }

    /* renamed from: O0 */
    public final boolean mo17959O0() throws IOException {
        C6893to toVar = this.f13880a;
        C5301fr frVar = f13868e;
        long N1 = toVar.mo31675N1(frVar);
        boolean z = N1 != -1;
        C6205no noVar = this.f13879a;
        noVar.mo31670F1(z ? N1 + ((long) frVar.mo36274j0()) : noVar.mo41244V0());
        return z;
    }

    /* renamed from: P0 */
    public final void mo17960P0() throws IOException {
        long q1 = this.f13880a.mo31695q1(f13867d);
        C6205no noVar = this.f13879a;
        noVar.mo31670F1(q1 != -1 ? q1 + 1 : noVar.mo41244V0());
    }

    /* renamed from: Q0 */
    public final void mo17961Q0() throws IOException {
        long q1 = this.f13880a.mo31695q1(f13866c);
        C6205no noVar = this.f13879a;
        if (q1 == -1) {
            q1 = noVar.mo41244V0();
        }
        noVar.mo31670F1(q1);
    }

    /* renamed from: X */
    public void mo17962X() throws IOException {
        C5301fr frVar;
        if (!this.f22313c) {
            int i = this.f13883o;
            if (i == 0) {
                i = mo17971j0();
            }
            if (i == 14) {
                mo17961Q0();
            } else {
                if (i == 13) {
                    frVar = f13864b;
                } else if (i == 12) {
                    frVar = f13863a;
                } else if (i != 15) {
                    throw new lv1("Expected a name but was " + mo17955H() + " at path " + mo26708f0());
                }
                mo17958N0(frVar);
            }
            this.f13883o = 0;
            this.f22310a[this.f22314n - 1] = "null";
            return;
        }
        throw new lv1("Cannot skip unexpected " + mo17955H() + " at " + mo26708f0());
    }

    /* renamed from: Y */
    public void mo17963Y() throws IOException {
        C5301fr frVar;
        if (!this.f22313c) {
            int i = 0;
            do {
                int i2 = this.f13883o;
                if (i2 == 0) {
                    i2 = mo17971j0();
                }
                if (i2 == 3) {
                    mo26706K(1);
                } else if (i2 == 1) {
                    mo26706K(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i < 0) {
                            throw new lv1("Expected a value but was " + mo17955H() + " at path " + mo26708f0());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i < 0) {
                            throw new lv1("Expected a value but was " + mo17955H() + " at path " + mo26708f0());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        mo17961Q0();
                        this.f13883o = 0;
                    } else {
                        if (i2 == 9 || i2 == 13) {
                            frVar = f13864b;
                        } else if (i2 == 8 || i2 == 12) {
                            frVar = f13863a;
                        } else {
                            if (i2 == 17) {
                                this.f13879a.mo31670F1((long) this.f13884p);
                            } else if (i2 == 18) {
                                throw new lv1("Expected a value but was " + mo17955H() + " at path " + mo26708f0());
                            }
                            this.f13883o = 0;
                        }
                        mo17958N0(frVar);
                        this.f13883o = 0;
                    }
                    this.f22314n--;
                    this.f13883o = 0;
                }
                i++;
                this.f13883o = 0;
            } while (i != 0);
            int[] iArr = this.f22312b;
            int i3 = this.f22314n;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f22310a[i3 - 1] = "null";
            return;
        }
        throw new lv1("Cannot skip unexpected " + mo17955H() + " at " + mo26708f0());
    }

    /* renamed from: b */
    public void mo17964b() throws IOException {
        int i = this.f13883o;
        if (i == 0) {
            i = mo17971j0();
        }
        if (i == 3) {
            mo26706K(1);
            this.f22312b[this.f22314n - 1] = 0;
            this.f13883o = 0;
            return;
        }
        throw new lv1("Expected BEGIN_ARRAY but was " + mo17955H() + " at path " + mo26708f0());
    }

    /* renamed from: c */
    public void mo17965c() throws IOException {
        int i = this.f13883o;
        if (i == 0) {
            i = mo17971j0();
        }
        if (i == 1) {
            mo26706K(3);
            this.f13883o = 0;
            return;
        }
        throw new lv1("Expected BEGIN_OBJECT but was " + mo17955H() + " at path " + mo26708f0());
    }

    public void close() throws IOException {
        this.f13883o = 0;
        this.f22309a[0] = 8;
        this.f22314n = 1;
        this.f13879a.mo41255c();
        this.f13880a.close();
    }

    /* renamed from: d */
    public void mo17967d() throws IOException {
        int i = this.f13883o;
        if (i == 0) {
            i = mo17971j0();
        }
        if (i == 4) {
            int i2 = this.f22314n - 1;
            this.f22314n = i2;
            int[] iArr = this.f22312b;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f13883o = 0;
            return;
        }
        throw new lv1("Expected END_ARRAY but was " + mo17955H() + " at path " + mo26708f0());
    }

    /* renamed from: e0 */
    public final void mo17968e0() throws IOException {
        if (!this.f22311b) {
            throw mo26707c0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: g */
    public void mo17969g() throws IOException {
        int i = this.f13883o;
        if (i == 0) {
            i = mo17971j0();
        }
        if (i == 2) {
            int i2 = this.f22314n - 1;
            this.f22314n = i2;
            this.f22310a[i2] = null;
            int[] iArr = this.f22312b;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f13883o = 0;
            return;
        }
        throw new lv1("Expected END_OBJECT but was " + mo17955H() + " at path " + mo26708f0());
    }

    /* renamed from: h */
    public boolean mo17970h() throws IOException {
        int i = this.f13883o;
        if (i == 0) {
            i = mo17971j0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0110  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo17971j0() throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.f22309a
            int r2 = r0.f22314n
            int r3 = r2 + -1
            r3 = r1[r3]
            r4 = 0
            r6 = 8
            r8 = 34
            r9 = 93
            r10 = 3
            r11 = 7
            r12 = 59
            r13 = 44
            r14 = 4
            r15 = 2
            r7 = 1
            if (r3 != r7) goto L_0x0022
            int r2 = r2 - r7
            r1[r2] = r15
            goto L_0x009a
        L_0x0022:
            if (r3 != r15) goto L_0x003d
            int r1 = r0.mo17979q0(r7)
            com.onedelhi.secure.no r2 = r0.f13879a
            r2.readByte()
            if (r1 == r13) goto L_0x009a
            if (r1 == r12) goto L_0x0094
            if (r1 != r9) goto L_0x0036
            r0.f13883o = r14
            return r14
        L_0x0036:
            java.lang.String r1 = "Unterminated array"
            com.onedelhi.secure.pv1 r1 = r0.mo26707c0(r1)
            throw r1
        L_0x003d:
            r15 = 5
            if (r3 == r10) goto L_0x0121
            if (r3 != r15) goto L_0x0044
            goto L_0x0121
        L_0x0044:
            if (r3 != r14) goto L_0x007e
            int r2 = r2 - r7
            r1[r2] = r15
            int r1 = r0.mo17979q0(r7)
            com.onedelhi.secure.no r2 = r0.f13879a
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x009a
            r2 = 61
            if (r1 != r2) goto L_0x0077
            r16.mo17968e0()
            com.onedelhi.secure.to r1 = r0.f13880a
            r14 = 1
            boolean r1 = r1.mo31677T(r14)
            if (r1 == 0) goto L_0x009a
            com.onedelhi.secure.no r1 = r0.f13879a
            byte r1 = r1.mo41249Z(r4)
            r2 = 62
            if (r1 != r2) goto L_0x009a
            com.onedelhi.secure.no r1 = r0.f13879a
            r1.readByte()
            goto L_0x009a
        L_0x0077:
            java.lang.String r1 = "Expected ':'"
            com.onedelhi.secure.pv1 r1 = r0.mo26707c0(r1)
            throw r1
        L_0x007e:
            r14 = 6
            if (r3 != r14) goto L_0x0085
            int r2 = r2 - r7
            r1[r2] = r11
            goto L_0x009a
        L_0x0085:
            if (r3 != r11) goto L_0x0098
            r1 = 0
            int r1 = r0.mo17979q0(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0094
            r1 = 18
        L_0x0091:
            r0.f13883o = r1
            return r1
        L_0x0094:
            r16.mo17968e0()
            goto L_0x009a
        L_0x0098:
            if (r3 == r6) goto L_0x0119
        L_0x009a:
            int r1 = r0.mo17979q0(r7)
            if (r1 == r8) goto L_0x0110
            r2 = 39
            if (r1 == r2) goto L_0x0105
            if (r1 == r13) goto L_0x00f2
            if (r1 == r12) goto L_0x00f2
            r2 = 91
            if (r1 == r2) goto L_0x00ea
            if (r1 == r9) goto L_0x00e1
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x00d9
            int r1 = r16.mo17953F0()
            if (r1 == 0) goto L_0x00b9
            return r1
        L_0x00b9:
            int r1 = r16.mo17954G0()
            if (r1 == 0) goto L_0x00c0
            return r1
        L_0x00c0:
            com.onedelhi.secure.no r1 = r0.f13879a
            byte r1 = r1.mo41249Z(r4)
            boolean r1 = r0.mo17977p0(r1)
            if (r1 == 0) goto L_0x00d2
            r16.mo17968e0()
            r1 = 10
            goto L_0x0091
        L_0x00d2:
            java.lang.String r1 = "Expected value"
            com.onedelhi.secure.pv1 r1 = r0.mo26707c0(r1)
            throw r1
        L_0x00d9:
            com.onedelhi.secure.no r1 = r0.f13879a
            r1.readByte()
            r0.f13883o = r7
            return r7
        L_0x00e1:
            if (r3 != r7) goto L_0x00f2
            com.onedelhi.secure.no r1 = r0.f13879a
            r1.readByte()
            r1 = 4
            goto L_0x0091
        L_0x00ea:
            com.onedelhi.secure.no r1 = r0.f13879a
            r1.readByte()
            r0.f13883o = r10
            return r10
        L_0x00f2:
            if (r3 == r7) goto L_0x00ff
            r1 = 2
            if (r3 != r1) goto L_0x00f8
            goto L_0x00ff
        L_0x00f8:
            java.lang.String r1 = "Unexpected value"
            com.onedelhi.secure.pv1 r1 = r0.mo26707c0(r1)
            throw r1
        L_0x00ff:
            r16.mo17968e0()
            r0.f13883o = r11
            return r11
        L_0x0105:
            r16.mo17968e0()
            com.onedelhi.secure.no r1 = r0.f13879a
            r1.readByte()
            r0.f13883o = r6
            return r6
        L_0x0110:
            com.onedelhi.secure.no r1 = r0.f13879a
            r1.readByte()
            r1 = 9
            goto L_0x0091
        L_0x0119:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0121:
            int r2 = r2 - r7
            r4 = 4
            r1[r2] = r4
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r15) goto L_0x0145
            int r2 = r0.mo17979q0(r7)
            com.onedelhi.secure.no r4 = r0.f13879a
            r4.readByte()
            if (r2 == r13) goto L_0x0145
            if (r2 == r12) goto L_0x0142
            if (r2 != r1) goto L_0x013b
        L_0x0138:
            r1 = 2
            goto L_0x0091
        L_0x013b:
            java.lang.String r1 = "Unterminated object"
            com.onedelhi.secure.pv1 r1 = r0.mo26707c0(r1)
            throw r1
        L_0x0142:
            r16.mo17968e0()
        L_0x0145:
            int r2 = r0.mo17979q0(r7)
            if (r2 == r8) goto L_0x017f
            r4 = 39
            if (r2 == r4) goto L_0x0173
            java.lang.String r4 = "Expected name"
            if (r2 == r1) goto L_0x0166
            r16.mo17968e0()
            char r1 = (char) r2
            boolean r1 = r0.mo17977p0(r1)
            if (r1 == 0) goto L_0x0161
            r1 = 14
            goto L_0x0091
        L_0x0161:
            com.onedelhi.secure.pv1 r1 = r0.mo26707c0(r4)
            throw r1
        L_0x0166:
            if (r3 == r15) goto L_0x016e
            com.onedelhi.secure.no r1 = r0.f13879a
            r1.readByte()
            goto L_0x0138
        L_0x016e:
            com.onedelhi.secure.pv1 r1 = r0.mo26707c0(r4)
            throw r1
        L_0x0173:
            com.onedelhi.secure.no r1 = r0.f13879a
            r1.readByte()
            r16.mo17968e0()
            r1 = 12
            goto L_0x0091
        L_0x017f:
            com.onedelhi.secure.no r1 = r0.f13879a
            r1.readByte()
            r1 = 13
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.iw1.mo17971j0():int");
    }

    /* renamed from: l */
    public boolean mo17972l() throws IOException {
        int i = this.f13883o;
        if (i == 0) {
            i = mo17971j0();
        }
        if (i == 5) {
            this.f13883o = 0;
            int[] iArr = this.f22312b;
            int i2 = this.f22314n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f13883o = 0;
            int[] iArr2 = this.f22312b;
            int i3 = this.f22314n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new lv1("Expected a boolean but was " + mo17955H() + " at path " + mo26708f0());
        }
    }

    /* renamed from: l0 */
    public final int mo17973l0(String str, wv1.C3876a aVar) {
        int length = aVar.f22316a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f22316a[i])) {
                this.f13883o = 0;
                this.f22310a[this.f22314n - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double mo17974m() throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.f13883o
            if (r0 != 0) goto L_0x0008
            int r0 = r8.mo17971j0()
        L_0x0008:
            r1 = 16
            r2 = 0
            if (r0 != r1) goto L_0x001f
            r8.f13883o = r2
            int[] r0 = r8.f22312b
            int r1 = r8.f22314n
            int r1 = r1 + -1
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r8.f13881b
            double r0 = (double) r0
            return r0
        L_0x001f:
            r1 = 17
            java.lang.String r3 = "Expected a double but was "
            r4 = 11
            java.lang.String r5 = " at path "
            if (r0 != r1) goto L_0x0035
            com.onedelhi.secure.no r0 = r8.f13879a
            int r1 = r8.f13884p
            long r6 = (long) r1
            java.lang.String r0 = r0.mo31698r1(r6)
        L_0x0032:
            r8.f13882b = r0
            goto L_0x0052
        L_0x0035:
            r1 = 9
            if (r0 != r1) goto L_0x0040
            com.onedelhi.secure.fr r0 = f13864b
        L_0x003b:
            java.lang.String r0 = r8.mo17981u0(r0)
            goto L_0x0032
        L_0x0040:
            r1 = 8
            if (r0 != r1) goto L_0x0047
            com.onedelhi.secure.fr r0 = f13863a
            goto L_0x003b
        L_0x0047:
            r1 = 10
            if (r0 != r1) goto L_0x0050
            java.lang.String r0 = r8.mo17952C0()
            goto L_0x0032
        L_0x0050:
            if (r0 != r4) goto L_0x00bf
        L_0x0052:
            r8.f13883o = r4
            java.lang.String r0 = r8.f13882b     // Catch:{ NumberFormatException -> 0x009e }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x009e }
            boolean r3 = r8.f22311b
            if (r3 != 0) goto L_0x008c
            boolean r3 = java.lang.Double.isNaN(r0)
            if (r3 != 0) goto L_0x006b
            boolean r3 = java.lang.Double.isInfinite(r0)
            if (r3 != 0) goto L_0x006b
            goto L_0x008c
        L_0x006b:
            com.onedelhi.secure.pv1 r2 = new com.onedelhi.secure.pv1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "JSON forbids NaN and infinities: "
            r3.append(r4)
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r8.mo26708f0()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x008c:
            r3 = 0
            r8.f13882b = r3
            r8.f13883o = r2
            int[] r2 = r8.f22312b
            int r3 = r8.f22314n
            int r3 = r3 + -1
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
            return r0
        L_0x009e:
            com.onedelhi.secure.lv1 r0 = new com.onedelhi.secure.lv1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r8.f13882b
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = r8.mo26708f0()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bf:
            com.onedelhi.secure.lv1 r0 = new com.onedelhi.secure.lv1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            com.onedelhi.secure.wv1$b r2 = r8.mo17955H()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = r8.mo26708f0()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.iw1.mo17974m():double");
    }

    /* renamed from: o0 */
    public final int mo17975o0(String str, wv1.C3876a aVar) {
        int length = aVar.f22316a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f22316a[i])) {
                this.f13883o = 0;
                int[] iArr = this.f22312b;
                int i2 = this.f22314n - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public int mo17976p() throws IOException {
        int i = this.f13883o;
        if (i == 0) {
            i = mo17971j0();
        }
        if (i == 16) {
            long j = this.f13881b;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f13883o = 0;
                int[] iArr = this.f22312b;
                int i3 = this.f22314n - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new lv1("Expected an int but was " + this.f13881b + " at path " + mo26708f0());
        }
        if (i == 17) {
            this.f13882b = this.f13879a.mo31698r1((long) this.f13884p);
        } else if (i == 9 || i == 8) {
            String u0 = mo17981u0(i == 9 ? f13864b : f13863a);
            this.f13882b = u0;
            try {
                int parseInt = Integer.parseInt(u0);
                this.f13883o = 0;
                int[] iArr2 = this.f22312b;
                int i4 = this.f22314n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new lv1("Expected an int but was " + mo17955H() + " at path " + mo26708f0());
        }
        this.f13883o = 11;
        try {
            double parseDouble = Double.parseDouble(this.f13882b);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f13882b = null;
                this.f13883o = 0;
                int[] iArr3 = this.f22312b;
                int i6 = this.f22314n - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new lv1("Expected an int but was " + this.f13882b + " at path " + mo26708f0());
        } catch (NumberFormatException unused2) {
            throw new lv1("Expected an int but was " + this.f13882b + " at path " + mo26708f0());
        }
    }

    /* renamed from: p0 */
    public final boolean mo17977p0(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        mo17968e0();
        return false;
    }

    /* renamed from: q */
    public String mo17978q() throws IOException {
        String str;
        C5301fr frVar;
        int i = this.f13883o;
        if (i == 0) {
            i = mo17971j0();
        }
        if (i == 14) {
            str = mo17952C0();
        } else {
            if (i == 13) {
                frVar = f13864b;
            } else if (i == 12) {
                frVar = f13863a;
            } else if (i == 15) {
                str = this.f13882b;
            } else {
                throw new lv1("Expected a name but was " + mo17955H() + " at path " + mo26708f0());
            }
            str = mo17981u0(frVar);
        }
        this.f13883o = 0;
        this.f22310a[this.f22314n - 1] = str;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f13879a.mo31670F1((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f13880a.mo31677T(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        mo17968e0();
        r3 = r6.f13879a.mo41249Z(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f13879a.readByte();
        r6.f13879a.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        mo17960P0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r6.f13879a.readByte();
        r6.f13879a.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (mo17959O0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        throw mo26707c0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r1 != 35) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        mo17968e0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        return r1;
     */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo17979q0(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            com.onedelhi.secure.to r2 = r6.f13880a
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo31677T(r4)
            if (r2 == 0) goto L_0x007f
            com.onedelhi.secure.no r2 = r6.f13879a
            long r4 = (long) r1
            byte r1 = r2.mo41249Z(r4)
            r2 = 10
            if (r1 == r2) goto L_0x007d
            r2 = 32
            if (r1 == r2) goto L_0x007d
            r2 = 13
            if (r1 == r2) goto L_0x007d
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x007d
        L_0x0025:
            com.onedelhi.secure.no r2 = r6.f13879a
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.mo31670F1(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            com.onedelhi.secure.to r3 = r6.f13880a
            r4 = 2
            boolean r3 = r3.mo31677T(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.mo17968e0()
            com.onedelhi.secure.no r3 = r6.f13879a
            r4 = 1
            byte r3 = r3.mo41249Z(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            com.onedelhi.secure.no r1 = r6.f13879a
            r1.readByte()
            com.onedelhi.secure.no r1 = r6.f13879a
            r1.readByte()
        L_0x0058:
            r6.mo17960P0()
            goto L_0x0001
        L_0x005c:
            com.onedelhi.secure.no r1 = r6.f13879a
            r1.readByte()
            com.onedelhi.secure.no r1 = r6.f13879a
            r1.readByte()
            boolean r1 = r6.mo17959O0()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            com.onedelhi.secure.pv1 r7 = r6.mo26707c0(r7)
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007c
            r6.mo17968e0()
            goto L_0x0058
        L_0x007c:
            return r1
        L_0x007d:
            r1 = r3
            goto L_0x0002
        L_0x007f:
            if (r7 != 0) goto L_0x0083
            r7 = -1
            return r7
        L_0x0083:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.iw1.mo17979q0(boolean):int");
    }

    public String toString() {
        return "JsonReader(" + this.f13880a + pl2.f33727d;
    }

    /* renamed from: u0 */
    public final String mo17981u0(C5301fr frVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long q1 = this.f13880a.mo31695q1(frVar);
            if (q1 == -1) {
                throw mo26707c0("Unterminated string");
            } else if (this.f13879a.mo41249Z(q1) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f13879a.mo31698r1(q1));
                this.f13879a.readByte();
                sb.append(mo17957M0());
            } else {
                String r1 = this.f13879a.mo31698r1(q1);
                if (sb == null) {
                    this.f13879a.readByte();
                    return r1;
                }
                sb.append(r1);
                this.f13879a.readByte();
                return sb.toString();
            }
        }
    }
}

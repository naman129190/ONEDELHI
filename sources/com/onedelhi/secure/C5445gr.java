package com.onedelhi.secure;

import com.google.firebase.messaging.C4311b;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0005\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\b\u001a\r\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\b\u001a\u001d\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\b\u001a\u0015\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\b\u001a\r\u0010\u000f\u001a\u00020\b*\u00020\u0000H\b\u001a\r\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\b\u001a\r\u0010\u0012\u001a\u00020\u0010*\u00020\u0000H\b\u001a-\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\b\u001a-\u0010\u0019\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\b\u001a\u0015\u0010\u001b\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\b\u001a\u0015\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0010H\b\u001a\u0015\u0010\u001e\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\b\u001a\u0015\u0010\u001f\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0010H\b\u001a\u001d\u0010!\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\bH\b\u001a\u001d\u0010\"\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\bH\b\u001a\u001d\u0010#\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\bH\b\u001a\u0017\u0010%\u001a\u00020\u0017*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010$H\b\u001a\r\u0010&\u001a\u00020\b*\u00020\u0000H\b\u001a\u0015\u0010'\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\b\u001a\u0011\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0010H\b\u001a\u001d\u0010*\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\b\u001a\r\u0010+\u001a\u00020\u0000*\u00020\u0001H\b\u001a\u000f\u0010,\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\b\u001a\r\u0010-\u001a\u00020\u0000*\u00020\u0001H\b\u001a$\u00101\u001a\u000200*\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0000\u001a\u0010\u00104\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0002\u001a\r\u00105\u001a\u00020\u0001*\u00020\u0000H\b\u001a\u0018\u00103\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00102\u0006\u00106\u001a\u00020\bH\u0002\"\u001a\u00108\u001a\u0002078\u0000X\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/onedelhi/secure/fr;", "", "F", "d", "e", "p", "A", "B", "", "beginIndex", "endIndex", "z", "pos", "", "m", "n", "", "C", "r", "offset", "other", "otherOffset", "byteCount", "", "v", "w", "prefix", "x", "y", "suffix", "j", "k", "fromIndex", "q", "s", "t", "", "l", "o", "f", "data", "u", "D", "i", "g", "h", "Lcom/onedelhi/secure/no;", "buffer", "Lcom/onedelhi/secure/un4;", "G", "", "c", "H", "E", "codePointCount", "", "HEX_DIGIT_CHARS", "[C", "I", "()[C", "okio"}, k = 2, mv = {1, 4, 0})
/* renamed from: com.onedelhi.secure.gr */
public final class C5445gr {
    @vr2

    /* renamed from: a */
    public static final char[] f29295a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @vr2
    /* renamed from: A */
    public static final C5301fr m49672A(@vr2 C5301fr frVar) {
        byte b;
        jt1.m53777p(frVar, "$this$commonToAsciiLowercase");
        int i = 0;
        while (i < frVar.mo36285z().length) {
            byte b2 = frVar.mo36285z()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] z = frVar.mo36285z();
                byte[] copyOf = Arrays.copyOf(z, z.length);
                jt1.m53776o(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new C5301fr(copyOf);
            }
        }
        return frVar;
    }

    @vr2
    /* renamed from: B */
    public static final C5301fr m49673B(@vr2 C5301fr frVar) {
        byte b;
        jt1.m53777p(frVar, "$this$commonToAsciiUppercase");
        int i = 0;
        while (i < frVar.mo36285z().length) {
            byte b2 = frVar.mo36285z()[i];
            byte b3 = (byte) 97;
            if (b2 < b3 || b2 > (b = (byte) 122)) {
                i++;
            } else {
                byte[] z = frVar.mo36285z();
                byte[] copyOf = Arrays.copyOf(z, z.length);
                jt1.m53776o(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new C5301fr(copyOf);
            }
        }
        return frVar;
    }

    @vr2
    /* renamed from: C */
    public static final byte[] m49674C(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "$this$commonToByteArray");
        byte[] z = frVar.mo36285z();
        byte[] copyOf = Arrays.copyOf(z, z.length);
        jt1.m53776o(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @vr2
    /* renamed from: D */
    public static final C5301fr m49675D(@vr2 byte[] bArr, int i, int i2) {
        jt1.m53777p(bArr, "$this$commonToByteString");
        C5950l.m55169e((long) bArr.length, (long) i, (long) i2);
        return new C5301fr(C7458za.m72745G1(bArr, i, i2 + i));
    }

    @vr2
    /* renamed from: E */
    public static final String m49676E(@vr2 C5301fr frVar) {
        StringBuilder sb;
        StringBuilder sb2;
        C5301fr frVar2 = frVar;
        jt1.m53777p(frVar2, "$this$commonToString");
        boolean z = true;
        if (frVar.mo36285z().length == 0) {
            return "[size=0]";
        }
        int a = m49683c(frVar.mo36285z(), 64);
        if (a == -1) {
            if (frVar.mo36285z().length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(frVar.mo31159D());
                sb2.append(']');
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(frVar.mo36285z().length);
                sb2.append(" hex=");
                if (64 > frVar.mo36285z().length) {
                    z = false;
                }
                if (z) {
                    if (64 != frVar.mo36285z().length) {
                        frVar2 = new C5301fr(C7458za.m72745G1(frVar.mo36285z(), 0, 64));
                    }
                    sb2.append(frVar2.mo31159D());
                    sb2.append("…]");
                } else {
                    throw new IllegalArgumentException(("endIndex > length(" + frVar.mo36285z().length + ')').toString());
                }
            }
            return sb2.toString();
        }
        String u0 = frVar.mo36280u0();
        Objects.requireNonNull(u0, "null cannot be cast to non-null type java.lang.String");
        String substring = u0.substring(0, a);
        jt1.m53776o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String k2 = t54.m65446k2(t54.m65446k2(t54.m65446k2(substring, C3002nr.f17551h, "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
        if (a < u0.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(frVar.mo36285z().length);
            sb.append(" text=");
            sb.append(k2);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(k2);
            sb.append(']');
        }
        return sb.toString();
    }

    @vr2
    /* renamed from: F */
    public static final String m49677F(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "$this$commonUtf8");
        String C = frVar.mo36254C();
        if (C != null) {
            return C;
        }
        String c = C5857k.m53901c(frVar.mo31162O());
        frVar.mo36270f0(c);
        return c;
    }

    /* renamed from: G */
    public static final void m49678G(@vr2 C5301fr frVar, @vr2 C6205no noVar, int i, int i2) {
        jt1.m53777p(frVar, "$this$commonWrite");
        jt1.m53777p(noVar, "buffer");
        noVar.mo41266h0(frVar.mo36285z(), i, i2);
    }

    /* renamed from: H */
    public static final int m49679H(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    @vr2
    /* renamed from: I */
    public static final char[] m49680I() {
        return f29295a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0068, code lost:
        return -1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m49683c(byte[] r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            int r2 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0008:
            if (r4 >= r2) goto L_0x01dd
            byte r7 = r0[r4]
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 159(0x9f, float:2.23E-43)
            r10 = 31
            r11 = 13
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 10
            r14 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            r17 = 1
            if (r7 < 0) goto L_0x0071
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0026
            return r5
        L_0x0026:
            if (r7 == r13) goto L_0x0038
            if (r7 == r11) goto L_0x0038
            if (r7 < 0) goto L_0x002e
            if (r10 >= r7) goto L_0x0033
        L_0x002e:
            if (r8 <= r7) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            if (r9 < r7) goto L_0x0035
        L_0x0033:
            r6 = 1
            goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            if (r6 != 0) goto L_0x003a
        L_0x0038:
            if (r7 != r12) goto L_0x003b
        L_0x003a:
            return r16
        L_0x003b:
            if (r7 >= r14) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = 2
        L_0x0040:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L_0x0043:
            r6 = r18
            if (r4 >= r2) goto L_0x0008
            byte r7 = r0[r4]
            if (r7 < 0) goto L_0x0008
            int r7 = r4 + 1
            byte r4 = r0[r4]
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0054
            return r5
        L_0x0054:
            if (r4 == r13) goto L_0x0066
            if (r4 == r11) goto L_0x0066
            if (r4 < 0) goto L_0x005c
            if (r10 >= r4) goto L_0x0061
        L_0x005c:
            if (r8 <= r4) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            if (r9 < r4) goto L_0x0063
        L_0x0061:
            r6 = 1
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            if (r6 != 0) goto L_0x0068
        L_0x0066:
            if (r4 != r12) goto L_0x0069
        L_0x0068:
            return r16
        L_0x0069:
            if (r4 >= r14) goto L_0x006d
            r4 = 1
            goto L_0x006e
        L_0x006d:
            r4 = 2
        L_0x006e:
            int r5 = r5 + r4
            r4 = r7
            goto L_0x0043
        L_0x0071:
            int r3 = r7 >> 5
            r15 = -2
            r14 = 128(0x80, float:1.794E-43)
            if (r3 != r15) goto L_0x00c5
            int r3 = r4 + 1
            if (r2 > r3) goto L_0x0080
            if (r6 != r1) goto L_0x007f
            return r5
        L_0x007f:
            return r16
        L_0x0080:
            byte r7 = r0[r4]
            byte r3 = r0[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x008a
            r15 = 1
            goto L_0x008b
        L_0x008a:
            r15 = 0
        L_0x008b:
            if (r15 != 0) goto L_0x0091
            if (r6 != r1) goto L_0x0090
            return r5
        L_0x0090:
            return r16
        L_0x0091:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r3 = r3 ^ r7
            if (r3 >= r14) goto L_0x009c
            if (r6 != r1) goto L_0x009b
            return r5
        L_0x009b:
            return r16
        L_0x009c:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x00a1
            return r5
        L_0x00a1:
            if (r3 == r13) goto L_0x00b3
            if (r3 == r11) goto L_0x00b3
            if (r3 < 0) goto L_0x00a9
            if (r10 >= r3) goto L_0x00ae
        L_0x00a9:
            if (r8 <= r3) goto L_0x00ac
            goto L_0x00b0
        L_0x00ac:
            if (r9 < r3) goto L_0x00b0
        L_0x00ae:
            r6 = 1
            goto L_0x00b1
        L_0x00b0:
            r6 = 0
        L_0x00b1:
            if (r6 != 0) goto L_0x00b5
        L_0x00b3:
            if (r3 != r12) goto L_0x00b6
        L_0x00b5:
            return r16
        L_0x00b6:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00bc
            r15 = 1
            goto L_0x00bd
        L_0x00bc:
            r15 = 2
        L_0x00bd:
            int r5 = r5 + r15
            com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a
            int r4 = r4 + 2
        L_0x00c2:
            r6 = r7
            goto L_0x0008
        L_0x00c5:
            int r3 = r7 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r3 != r15) goto L_0x0142
            int r3 = r4 + 2
            if (r2 > r3) goto L_0x00d7
            if (r6 != r1) goto L_0x00d6
            return r5
        L_0x00d6:
            return r16
        L_0x00d7:
            byte r7 = r0[r4]
            int r15 = r4 + 1
            byte r15 = r0[r15]
            r8 = r15 & 192(0xc0, float:2.69E-43)
            if (r8 != r14) goto L_0x00e3
            r8 = 1
            goto L_0x00e4
        L_0x00e3:
            r8 = 0
        L_0x00e4:
            if (r8 != 0) goto L_0x00ea
            if (r6 != r1) goto L_0x00e9
            return r5
        L_0x00e9:
            return r16
        L_0x00ea:
            byte r3 = r0[r3]
            r8 = r3 & 192(0xc0, float:2.69E-43)
            if (r8 != r14) goto L_0x00f2
            r8 = 1
            goto L_0x00f3
        L_0x00f2:
            r8 = 0
        L_0x00f3:
            if (r8 != 0) goto L_0x00f9
            if (r6 != r1) goto L_0x00f8
            return r5
        L_0x00f8:
            return r16
        L_0x00f9:
            r8 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r8
            int r8 = r15 << 6
            r3 = r3 ^ r8
            int r7 = r7 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L_0x010b
            if (r6 != r1) goto L_0x010a
            return r5
        L_0x010a:
            return r16
        L_0x010b:
            if (r12 <= r3) goto L_0x010e
            goto L_0x0114
        L_0x010e:
            if (r9 < r3) goto L_0x0114
            if (r6 != r1) goto L_0x0113
            return r5
        L_0x0113:
            return r16
        L_0x0114:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x0119
            return r5
        L_0x0119:
            if (r3 == r13) goto L_0x012f
            if (r3 == r11) goto L_0x012f
            if (r3 < 0) goto L_0x0121
            if (r10 >= r3) goto L_0x012a
        L_0x0121:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x012c
        L_0x012a:
            r6 = 1
            goto L_0x012d
        L_0x012c:
            r6 = 0
        L_0x012d:
            if (r6 != 0) goto L_0x0134
        L_0x012f:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0135
        L_0x0134:
            return r16
        L_0x0135:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x013b
            r15 = 1
            goto L_0x013c
        L_0x013b:
            r15 = 2
        L_0x013c:
            int r5 = r5 + r15
            com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a
            int r4 = r4 + 3
            goto L_0x00c2
        L_0x0142:
            int r3 = r7 >> 3
            if (r3 != r15) goto L_0x01d9
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x014e
            if (r6 != r1) goto L_0x014d
            return r5
        L_0x014d:
            return r16
        L_0x014e:
            byte r7 = r0[r4]
            int r8 = r4 + 1
            byte r8 = r0[r8]
            r15 = r8 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x015a
            r15 = 1
            goto L_0x015b
        L_0x015a:
            r15 = 0
        L_0x015b:
            if (r15 != 0) goto L_0x0161
            if (r6 != r1) goto L_0x0160
            return r5
        L_0x0160:
            return r16
        L_0x0161:
            int r15 = r4 + 2
            byte r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x016b
            r10 = 1
            goto L_0x016c
        L_0x016b:
            r10 = 0
        L_0x016c:
            if (r10 != 0) goto L_0x0172
            if (r6 != r1) goto L_0x0171
            return r5
        L_0x0171:
            return r16
        L_0x0172:
            byte r3 = r0[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x017a
            r10 = 1
            goto L_0x017b
        L_0x017a:
            r10 = 0
        L_0x017b:
            if (r10 != 0) goto L_0x0181
            if (r6 != r1) goto L_0x0180
            return r5
        L_0x0180:
            return r16
        L_0x0181:
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r15 << 6
            r3 = r3 ^ r10
            int r8 = r8 << 12
            r3 = r3 ^ r8
            int r7 = r7 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L_0x0197
            if (r6 != r1) goto L_0x0196
            return r5
        L_0x0196:
            return r16
        L_0x0197:
            if (r12 <= r3) goto L_0x019a
            goto L_0x01a0
        L_0x019a:
            if (r9 < r3) goto L_0x01a0
            if (r6 != r1) goto L_0x019f
            return r5
        L_0x019f:
            return r16
        L_0x01a0:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r7) goto L_0x01a8
            if (r6 != r1) goto L_0x01a7
            return r5
        L_0x01a7:
            return r16
        L_0x01a8:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x01ad
            return r5
        L_0x01ad:
            if (r3 == r13) goto L_0x01c5
            if (r3 == r11) goto L_0x01c5
            if (r3 < 0) goto L_0x01b7
            r6 = 31
            if (r6 >= r3) goto L_0x01c0
        L_0x01b7:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x01bc
            goto L_0x01c2
        L_0x01bc:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x01c2
        L_0x01c0:
            r6 = 1
            goto L_0x01c3
        L_0x01c2:
            r6 = 0
        L_0x01c3:
            if (r6 != 0) goto L_0x01ca
        L_0x01c5:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x01cb
        L_0x01ca:
            return r16
        L_0x01cb:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x01d1
            r15 = 1
            goto L_0x01d2
        L_0x01d1:
            r15 = 2
        L_0x01d2:
            int r5 = r5 + r15
            com.onedelhi.secure.un4 r3 = com.onedelhi.secure.un4.f36206a
            int r4 = r4 + 4
            goto L_0x00c2
        L_0x01d9:
            if (r6 != r1) goto L_0x01dc
            return r5
        L_0x01dc:
            return r16
        L_0x01dd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5445gr.m49683c(byte[], int):int");
    }

    @vr2
    /* renamed from: d */
    public static final String m49684d(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "$this$commonBase64");
        return C4717c.m40639c(frVar.mo36285z(), (byte[]) null, 1, (Object) null);
    }

    @vr2
    /* renamed from: e */
    public static final String m49685e(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "$this$commonBase64Url");
        return C4717c.m40638b(frVar.mo36285z(), C4717c.m40641e());
    }

    /* renamed from: f */
    public static final int m49686f(@vr2 C5301fr frVar, @vr2 C5301fr frVar2) {
        jt1.m53777p(frVar, "$this$commonCompareTo");
        jt1.m53777p(frVar2, "other");
        int j0 = frVar.mo36274j0();
        int j02 = frVar2.mo36274j0();
        int min = Math.min(j0, j02);
        for (int i = 0; i < min; i++) {
            byte y = frVar.mo36284y(i) & 255;
            byte y2 = frVar2.mo36284y(i) & 255;
            if (y != y2) {
                return y < y2 ? -1 : 1;
            }
        }
        if (j0 == j02) {
            return 0;
        }
        return j0 < j02 ? -1 : 1;
    }

    @ss2
    /* renamed from: g */
    public static final C5301fr m49687g(@vr2 String str) {
        jt1.m53777p(str, "$this$commonDecodeBase64");
        byte[] a = C4717c.m40637a(str);
        if (a != null) {
            return new C5301fr(a);
        }
        return null;
    }

    @vr2
    /* renamed from: h */
    public static final C5301fr m49688h(@vr2 String str) {
        jt1.m53777p(str, "$this$commonDecodeHex");
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m49679H(str.charAt(i2)) << 4) + m49679H(str.charAt(i2 + 1)));
            }
            return new C5301fr(bArr);
        }
        throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
    }

    @vr2
    /* renamed from: i */
    public static final C5301fr m49689i(@vr2 String str) {
        jt1.m53777p(str, "$this$commonEncodeUtf8");
        C5301fr frVar = new C5301fr(C5857k.m53899a(str));
        frVar.mo36270f0(str);
        return frVar;
    }

    /* renamed from: j */
    public static final boolean m49690j(@vr2 C5301fr frVar, @vr2 C5301fr frVar2) {
        jt1.m53777p(frVar, "$this$commonEndsWith");
        jt1.m53777p(frVar2, "suffix");
        return frVar.mo31165a0(frVar.mo36274j0() - frVar2.mo36274j0(), frVar2, 0, frVar2.mo36274j0());
    }

    /* renamed from: k */
    public static final boolean m49691k(@vr2 C5301fr frVar, @vr2 byte[] bArr) {
        jt1.m53777p(frVar, "$this$commonEndsWith");
        jt1.m53777p(bArr, "suffix");
        return frVar.mo31166b0(frVar.mo36274j0() - bArr.length, bArr, 0, bArr.length);
    }

    /* renamed from: l */
    public static final boolean m49692l(@vr2 C5301fr frVar, @ss2 Object obj) {
        jt1.m53777p(frVar, "$this$commonEquals");
        if (obj == frVar) {
            return true;
        }
        if (obj instanceof C5301fr) {
            C5301fr frVar2 = (C5301fr) obj;
            return frVar2.mo36274j0() == frVar.mo36285z().length && frVar2.mo31166b0(0, frVar.mo36285z(), 0, frVar.mo36285z().length);
        }
    }

    /* renamed from: m */
    public static final byte m49693m(@vr2 C5301fr frVar, int i) {
        jt1.m53777p(frVar, "$this$commonGetByte");
        return frVar.mo36285z()[i];
    }

    /* renamed from: n */
    public static final int m49694n(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "$this$commonGetSize");
        return frVar.mo36285z().length;
    }

    /* renamed from: o */
    public static final int m49695o(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "$this$commonHashCode");
        int A = frVar.mo36253A();
        if (A != 0) {
            return A;
        }
        int hashCode = Arrays.hashCode(frVar.mo36285z());
        frVar.mo36269e0(hashCode);
        return hashCode;
    }

    @vr2
    /* renamed from: p */
    public static final String m49696p(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "$this$commonHex");
        char[] cArr = new char[(frVar.mo36285z().length * 2)];
        int i = 0;
        for (byte b : frVar.mo36285z()) {
            int i2 = i + 1;
            cArr[i] = m49680I()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = m49680I()[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: q */
    public static final int m49697q(@vr2 C5301fr frVar, @vr2 byte[] bArr, int i) {
        jt1.m53777p(frVar, "$this$commonIndexOf");
        jt1.m53777p(bArr, "other");
        int length = frVar.mo36285z().length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!C5950l.m55168d(frVar.mo36285z(), max, bArr, 0, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    @vr2
    /* renamed from: r */
    public static final byte[] m49698r(@vr2 C5301fr frVar) {
        jt1.m53777p(frVar, "$this$commonInternalArray");
        return frVar.mo36285z();
    }

    /* renamed from: s */
    public static final int m49699s(@vr2 C5301fr frVar, @vr2 C5301fr frVar2, int i) {
        jt1.m53777p(frVar, "$this$commonLastIndexOf");
        jt1.m53777p(frVar2, "other");
        return frVar.mo31164T(frVar2.mo31162O(), i);
    }

    /* renamed from: t */
    public static final int m49700t(@vr2 C5301fr frVar, @vr2 byte[] bArr, int i) {
        jt1.m53777p(frVar, "$this$commonLastIndexOf");
        jt1.m53777p(bArr, "other");
        for (int min = Math.min(i, frVar.mo36285z().length - bArr.length); min >= 0; min--) {
            if (C5950l.m55168d(frVar.mo36285z(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    @vr2
    /* renamed from: u */
    public static final C5301fr m49701u(@vr2 byte[] bArr) {
        jt1.m53777p(bArr, C4311b.C4317f.C4318a.f25149a);
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        jt1.m53776o(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new C5301fr(copyOf);
    }

    /* renamed from: v */
    public static final boolean m49702v(@vr2 C5301fr frVar, int i, @vr2 C5301fr frVar2, int i2, int i3) {
        jt1.m53777p(frVar, "$this$commonRangeEquals");
        jt1.m53777p(frVar2, "other");
        return frVar2.mo31166b0(i2, frVar.mo36285z(), i, i3);
    }

    /* renamed from: w */
    public static final boolean m49703w(@vr2 C5301fr frVar, int i, @vr2 byte[] bArr, int i2, int i3) {
        jt1.m53777p(frVar, "$this$commonRangeEquals");
        jt1.m53777p(bArr, "other");
        return i >= 0 && i <= frVar.mo36285z().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C5950l.m55168d(frVar.mo36285z(), i, bArr, i2, i3);
    }

    /* renamed from: x */
    public static final boolean m49704x(@vr2 C5301fr frVar, @vr2 C5301fr frVar2) {
        jt1.m53777p(frVar, "$this$commonStartsWith");
        jt1.m53777p(frVar2, "prefix");
        return frVar.mo31165a0(0, frVar2, 0, frVar2.mo36274j0());
    }

    /* renamed from: y */
    public static final boolean m49705y(@vr2 C5301fr frVar, @vr2 byte[] bArr) {
        jt1.m53777p(frVar, "$this$commonStartsWith");
        jt1.m53777p(bArr, "prefix");
        return frVar.mo31166b0(0, bArr, 0, bArr.length);
    }

    @vr2
    /* renamed from: z */
    public static final C5301fr m49706z(@vr2 C5301fr frVar, int i, int i2) {
        jt1.m53777p(frVar, "$this$commonSubstring");
        boolean z = true;
        if (i >= 0) {
            if (i2 <= frVar.mo36285z().length) {
                if (i2 - i < 0) {
                    z = false;
                }
                if (z) {
                    return (i == 0 && i2 == frVar.mo36285z().length) ? frVar : new C5301fr(C7458za.m72745G1(frVar.mo36285z(), i, i2));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + frVar.mo36285z().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }
}

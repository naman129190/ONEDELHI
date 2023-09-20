package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\b\u001a\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\b\u001a4\u0010\u0010\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rH\bø\u0001\u0000\u001a4\u0010\u0012\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\bø\u0001\u0000\u001a4\u0010\u0014\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\rH\bø\u0001\u0000\u001a4\u0010\u0015\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\bø\u0001\u0000\u001a4\u0010\u0016\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0018"}, d2 = {"", "", "beginIndex", "endIndex", "", "k", "(Ljava/lang/String;II)J", "codePoint", "", "a", "", "byte", "b", "Lkotlin/Function1;", "Lcom/onedelhi/secure/un4;", "yield", "g", "", "h", "", "f", "c", "d", "e", "okio"}, k = 2, mv = {1, 4, 0})
@uw1(name = "Utf8")
public final class iq4 {

    /* renamed from: a */
    public static final byte f30423a = 63;

    /* renamed from: a */
    public static final char f30424a = '�';

    /* renamed from: a */
    public static final int f30425a = 65533;

    /* renamed from: b */
    public static final int f30426b = 55232;

    /* renamed from: c */
    public static final int f30427c = 56320;

    /* renamed from: d */
    public static final int f30428d = 3968;

    /* renamed from: e */
    public static final int f30429e = -123008;

    /* renamed from: f */
    public static final int f30430f = 3678080;

    /* renamed from: a */
    public static final boolean m52581a(int i) {
        return (i >= 0 && 31 >= i) || (127 <= i && 159 >= i);
    }

    /* renamed from: b */
    public static final boolean m52582b(byte b) {
        return (b & mx0.f16640e) == 128;
    }

    /* renamed from: c */
    public static final int m52583c(@vr2 byte[] bArr, int i, int i2, @vr2 ec1<? super Integer, un4> ec1) {
        jt1.m53777p(bArr, "$this$process2Utf8Bytes");
        jt1.m53777p(ec1, "yield");
        int i3 = i + 1;
        Integer valueOf = Integer.valueOf(f30425a);
        if (i2 <= i3) {
            ec1.mo17094X(valueOf);
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i3];
        if (!((b2 & mx0.f16640e) == 128)) {
            ec1.mo17094X(valueOf);
            return 1;
        }
        byte b3 = (b2 ^ C7276xq.f37586a) ^ (b << 6);
        if (b3 < 128) {
            ec1.mo17094X(valueOf);
            return 2;
        }
        ec1.mo17094X(Integer.valueOf(b3));
        return 2;
    }

    /* renamed from: d */
    public static final int m52584d(@vr2 byte[] bArr, int i, int i2, @vr2 ec1<? super Integer, un4> ec1) {
        jt1.m53777p(bArr, "$this$process3Utf8Bytes");
        jt1.m53777p(ec1, "yield");
        int i3 = i + 2;
        boolean z = false;
        Integer valueOf = Integer.valueOf(f30425a);
        if (i2 <= i3) {
            ec1.mo17094X(valueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & mx0.f16640e) == 128) {
                    z = true;
                }
                return !z ? 1 : 2;
            }
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if (!((b2 & mx0.f16640e) == 128)) {
            ec1.mo17094X(valueOf);
            return 1;
        }
        byte b3 = bArr[i3];
        if ((b3 & mx0.f16640e) == 128) {
            z = true;
        }
        if (!z) {
            ec1.mo17094X(valueOf);
            return 2;
        }
        byte b4 = ((b3 ^ C7276xq.f37586a) ^ (b2 << 6)) ^ (b << 12);
        if (b4 >= 2048 && (55296 > b4 || 57343 < b4)) {
            ec1.mo17094X(Integer.valueOf(b4));
            return 3;
        }
        ec1.mo17094X(valueOf);
        return 3;
    }

    /* renamed from: e */
    public static final int m52585e(@vr2 byte[] bArr, int i, int i2, @vr2 ec1<? super Integer, un4> ec1) {
        jt1.m53777p(bArr, "$this$process4Utf8Bytes");
        jt1.m53777p(ec1, "yield");
        int i3 = i + 3;
        boolean z = false;
        Integer valueOf = Integer.valueOf(f30425a);
        if (i2 <= i3) {
            ec1.mo17094X(valueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & mx0.f16640e) == 128) {
                    int i5 = i + 2;
                    if (i2 > i5) {
                        if ((bArr[i5] & mx0.f16640e) == 128) {
                            z = true;
                        }
                        return !z ? 2 : 3;
                    }
                }
            }
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if (!((b2 & mx0.f16640e) == 128)) {
            ec1.mo17094X(valueOf);
            return 1;
        }
        byte b3 = bArr[i + 2];
        if (!((b3 & mx0.f16640e) == 128)) {
            ec1.mo17094X(valueOf);
            return 2;
        }
        byte b4 = bArr[i3];
        if ((b4 & mx0.f16640e) == 128) {
            z = true;
        }
        if (!z) {
            ec1.mo17094X(valueOf);
            return 3;
        }
        byte b5 = (((b4 ^ C7276xq.f37586a) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
        if (b5 <= 1114111 && ((55296 > b5 || 57343 < b5) && b5 >= 65536)) {
            ec1.mo17094X(Integer.valueOf(b5));
            return 4;
        }
        ec1.mo17094X(valueOf);
        return 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        if (r8 == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0119, code lost:
        if (r8 == false) goto L_0x0071;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m52586f(@com.onedelhi.secure.vr2 byte[] r16, int r17, int r18, @com.onedelhi.secure.vr2 com.onedelhi.secure.ec1<? super java.lang.Character, com.onedelhi.secure.un4> r19) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.String r3 = "$this$processUtf16Chars"
            com.onedelhi.secure.jt1.m53777p(r0, r3)
            java.lang.String r3 = "yield"
            com.onedelhi.secure.jt1.m53777p(r2, r3)
            r3 = r17
        L_0x0012:
            if (r3 >= r1) goto L_0x01b8
            byte r4 = r0[r3]
            if (r4 < 0) goto L_0x0036
            char r4 = (char) r4
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.mo17094X(r4)
            int r3 = r3 + 1
        L_0x0022:
            if (r3 >= r1) goto L_0x0012
            byte r4 = r0[r3]
            if (r4 < 0) goto L_0x0012
            int r4 = r3 + 1
            byte r3 = r0[r3]
            char r3 = (char) r3
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r2.mo17094X(r3)
            r3 = r4
            goto L_0x0022
        L_0x0036:
            int r5 = r4 >> 5
            r6 = -2
            r8 = 0
            r9 = 128(0x80, float:1.794E-43)
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 1
            if (r5 != r6) goto L_0x0074
            int r4 = r3 + 1
            if (r1 > r4) goto L_0x0052
        L_0x0046:
            char r4 = (char) r10
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
        L_0x0050:
            r7 = 1
            goto L_0x0072
        L_0x0052:
            byte r5 = r0[r3]
            byte r4 = r0[r4]
            r6 = r4 & 192(0xc0, float:2.69E-43)
            if (r6 != r9) goto L_0x005b
            r8 = 1
        L_0x005b:
            if (r8 != 0) goto L_0x005e
            goto L_0x0046
        L_0x005e:
            r4 = r4 ^ 3968(0xf80, float:5.56E-42)
            int r5 = r5 << 6
            r4 = r4 ^ r5
            if (r4 >= r9) goto L_0x0067
            char r4 = (char) r10
            goto L_0x0068
        L_0x0067:
            char r4 = (char) r4
        L_0x0068:
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
        L_0x0071:
            r7 = 2
        L_0x0072:
            int r3 = r3 + r7
            goto L_0x0012
        L_0x0074:
            int r5 = r4 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r13 = 57343(0xdfff, float:8.0355E-41)
            r14 = 3
            if (r5 != r6) goto L_0x00ec
            int r4 = r3 + 2
            if (r1 > r4) goto L_0x009b
            char r4 = (char) r10
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            int r4 = r3 + 1
            if (r1 <= r4) goto L_0x0050
            byte r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L_0x0098
            r8 = 1
        L_0x0098:
            if (r8 != 0) goto L_0x0071
            goto L_0x0050
        L_0x009b:
            byte r5 = r0[r3]
            int r6 = r3 + 1
            byte r6 = r0[r6]
            r15 = r6 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x00a7
            r15 = 1
            goto L_0x00a8
        L_0x00a7:
            r15 = 0
        L_0x00a8:
            if (r15 != 0) goto L_0x00b5
            char r4 = (char) r10
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x0050
        L_0x00b5:
            byte r4 = r0[r4]
            r15 = r4 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x00bc
            r8 = 1
        L_0x00bc:
            if (r8 != 0) goto L_0x00c9
            char r4 = (char) r10
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x0071
        L_0x00c9:
            r7 = -123008(0xfffffffffffe1f80, float:NaN)
            r4 = r4 ^ r7
            int r6 = r6 << 6
            r4 = r4 ^ r6
            int r5 = r5 << 12
            r4 = r4 ^ r5
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L_0x00e2
        L_0x00d7:
            char r4 = (char) r10
        L_0x00d8:
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x00ea
        L_0x00e2:
            if (r12 <= r4) goto L_0x00e5
            goto L_0x00e8
        L_0x00e5:
            if (r13 < r4) goto L_0x00e8
            goto L_0x00d7
        L_0x00e8:
            char r4 = (char) r4
            goto L_0x00d8
        L_0x00ea:
            r7 = 3
            goto L_0x0072
        L_0x00ec:
            int r4 = r4 >> 3
            if (r4 != r6) goto L_0x01ad
            int r4 = r3 + 3
            if (r1 > r4) goto L_0x011d
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            int r4 = r3 + 1
            if (r1 <= r4) goto L_0x0050
            byte r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L_0x0109
            r4 = 1
            goto L_0x010a
        L_0x0109:
            r4 = 0
        L_0x010a:
            if (r4 != 0) goto L_0x010e
            goto L_0x0050
        L_0x010e:
            int r4 = r3 + 2
            if (r1 <= r4) goto L_0x0071
            byte r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L_0x0119
            r8 = 1
        L_0x0119:
            if (r8 != 0) goto L_0x00ea
            goto L_0x0071
        L_0x011d:
            byte r5 = r0[r3]
            int r6 = r3 + 1
            byte r6 = r0[r6]
            r15 = r6 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x0129
            r15 = 1
            goto L_0x012a
        L_0x0129:
            r15 = 0
        L_0x012a:
            if (r15 != 0) goto L_0x0137
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x0050
        L_0x0137:
            int r15 = r3 + 2
            byte r15 = r0[r15]
            r7 = r15 & 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L_0x0141
            r7 = 1
            goto L_0x0142
        L_0x0141:
            r7 = 0
        L_0x0142:
            if (r7 != 0) goto L_0x014f
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x0071
        L_0x014f:
            byte r4 = r0[r4]
            r7 = r4 & 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L_0x0156
            r8 = 1
        L_0x0156:
            if (r8 != 0) goto L_0x0162
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x00ea
        L_0x0162:
            r7 = 3678080(0x381f80, float:5.154088E-39)
            r4 = r4 ^ r7
            int r7 = r15 << 6
            r4 = r4 ^ r7
            int r6 = r6 << 12
            r4 = r4 ^ r6
            int r5 = r5 << 18
            r4 = r4 ^ r5
            r5 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 <= r5) goto L_0x017e
        L_0x0174:
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
        L_0x0178:
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x01aa
        L_0x017e:
            if (r12 <= r4) goto L_0x0181
            goto L_0x0184
        L_0x0181:
            if (r13 < r4) goto L_0x0184
            goto L_0x0174
        L_0x0184:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r5) goto L_0x0189
            goto L_0x0174
        L_0x0189:
            if (r4 == r10) goto L_0x01a5
            int r5 = r4 >>> 10
            r6 = 55232(0xd7c0, float:7.7397E-41)
            int r5 = r5 + r6
            char r5 = (char) r5
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            r2.mo17094X(r5)
            r4 = r4 & 1023(0x3ff, float:1.434E-42)
            r5 = 56320(0xdc00, float:7.8921E-41)
            int r4 = r4 + r5
            char r4 = (char) r4
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            goto L_0x0178
        L_0x01a5:
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            goto L_0x0178
        L_0x01aa:
            r7 = 4
            goto L_0x0072
        L_0x01ad:
            java.lang.Character r4 = java.lang.Character.valueOf(r10)
            r2.mo17094X(r4)
            int r3 = r3 + 1
            goto L_0x0012
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.iq4.m52586f(byte[], int, int, com.onedelhi.secure.ec1):void");
    }

    /* renamed from: g */
    public static final void m52587g(@vr2 String str, int i, int i2, @vr2 ec1<? super Byte, un4> ec1) {
        int i3;
        Byte valueOf;
        int i4;
        char charAt;
        jt1.m53777p(str, "$this$processUtf8Bytes");
        jt1.m53777p(ec1, "yield");
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (jt1.m53781t(charAt2, 128) < 0) {
                ec1.mo17094X(Byte.valueOf((byte) charAt2));
                i++;
                while (i < i2 && jt1.m53781t(str.charAt(i), 128) < 0) {
                    ec1.mo17094X(Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (jt1.m53781t(charAt2, 2048) < 0) {
                    i3 = (charAt2 >> 6) | 192;
                } else if (55296 > charAt2 || 57343 < charAt2) {
                    ec1.mo17094X(Byte.valueOf((byte) ((charAt2 >> 12) | 224)));
                    i3 = ((charAt2 >> 6) & 63) | 128;
                } else if (jt1.m53781t(charAt2, 56319) > 0 || i2 <= (i4 = i + 1) || 56320 > (charAt = str.charAt(i4)) || 57343 < charAt) {
                    valueOf = Byte.valueOf(f30423a);
                    ec1.mo17094X(valueOf);
                    i++;
                } else {
                    int charAt3 = ((charAt2 << 10) + str.charAt(i4)) - 56613888;
                    ec1.mo17094X(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                    ec1.mo17094X(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    ec1.mo17094X(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    ec1.mo17094X(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i += 2;
                }
                ec1.mo17094X(Byte.valueOf((byte) i3));
                valueOf = Byte.valueOf((byte) ((charAt2 & '?') | 128));
                ec1.mo17094X(valueOf);
                i++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        if (r8 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0117, code lost:
        if (r8 == false) goto L_0x0070;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m52588h(@com.onedelhi.secure.vr2 byte[] r16, int r17, int r18, @com.onedelhi.secure.vr2 com.onedelhi.secure.ec1<? super java.lang.Integer, com.onedelhi.secure.un4> r19) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.String r3 = "$this$processUtf8CodePoints"
            com.onedelhi.secure.jt1.m53777p(r0, r3)
            java.lang.String r3 = "yield"
            com.onedelhi.secure.jt1.m53777p(r2, r3)
            r3 = r17
        L_0x0012:
            if (r3 >= r1) goto L_0x019a
            byte r4 = r0[r3]
            if (r4 < 0) goto L_0x0034
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.mo17094X(r4)
            int r3 = r3 + 1
        L_0x0021:
            if (r3 >= r1) goto L_0x0012
            byte r4 = r0[r3]
            if (r4 < 0) goto L_0x0012
            int r4 = r3 + 1
            byte r3 = r0[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo17094X(r3)
            r3 = r4
            goto L_0x0021
        L_0x0034:
            int r5 = r4 >> 5
            r6 = -2
            r8 = 0
            r9 = 128(0x80, float:1.794E-43)
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 1
            if (r5 != r6) goto L_0x0073
            int r4 = r3 + 1
            if (r1 > r4) goto L_0x004f
        L_0x0044:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
        L_0x004d:
            r7 = 1
            goto L_0x0071
        L_0x004f:
            byte r5 = r0[r3]
            byte r4 = r0[r4]
            r6 = r4 & 192(0xc0, float:2.69E-43)
            if (r6 != r9) goto L_0x0058
            r8 = 1
        L_0x0058:
            if (r8 != 0) goto L_0x005b
            goto L_0x0044
        L_0x005b:
            r4 = r4 ^ 3968(0xf80, float:5.56E-42)
            int r5 = r5 << 6
            r4 = r4 ^ r5
            if (r4 >= r9) goto L_0x0067
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            goto L_0x006b
        L_0x0067:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x006b:
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
        L_0x0070:
            r7 = 2
        L_0x0071:
            int r3 = r3 + r7
            goto L_0x0012
        L_0x0073:
            int r5 = r4 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r13 = 57343(0xdfff, float:8.0355E-41)
            r14 = 3
            if (r5 != r6) goto L_0x00ea
            int r4 = r3 + 2
            if (r1 > r4) goto L_0x0099
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            int r4 = r3 + 1
            if (r1 <= r4) goto L_0x004d
            byte r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L_0x0096
            r8 = 1
        L_0x0096:
            if (r8 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0099:
            byte r5 = r0[r3]
            int r6 = r3 + 1
            byte r6 = r0[r6]
            r15 = r6 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x00a5
            r15 = 1
            goto L_0x00a6
        L_0x00a5:
            r15 = 0
        L_0x00a6:
            if (r15 != 0) goto L_0x00b2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x004d
        L_0x00b2:
            byte r4 = r0[r4]
            r15 = r4 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x00b9
            r8 = 1
        L_0x00b9:
            if (r8 != 0) goto L_0x00c5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x0070
        L_0x00c5:
            r7 = -123008(0xfffffffffffe1f80, float:NaN)
            r4 = r4 ^ r7
            int r6 = r6 << 6
            r4 = r4 ^ r6
            int r5 = r5 << 12
            r4 = r4 ^ r5
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L_0x00dd
        L_0x00d3:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
        L_0x00d7:
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x00e8
        L_0x00dd:
            if (r12 <= r4) goto L_0x00e0
            goto L_0x00e3
        L_0x00e0:
            if (r13 < r4) goto L_0x00e3
            goto L_0x00d3
        L_0x00e3:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x00d7
        L_0x00e8:
            r7 = 3
            goto L_0x0071
        L_0x00ea:
            int r4 = r4 >> 3
            if (r4 != r6) goto L_0x018f
            int r4 = r3 + 3
            if (r1 > r4) goto L_0x011b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            int r4 = r3 + 1
            if (r1 <= r4) goto L_0x004d
            byte r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L_0x0107
            r4 = 1
            goto L_0x0108
        L_0x0107:
            r4 = 0
        L_0x0108:
            if (r4 != 0) goto L_0x010c
            goto L_0x004d
        L_0x010c:
            int r4 = r3 + 2
            if (r1 <= r4) goto L_0x0070
            byte r4 = r0[r4]
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L_0x0117
            r8 = 1
        L_0x0117:
            if (r8 != 0) goto L_0x00e8
            goto L_0x0070
        L_0x011b:
            byte r5 = r0[r3]
            int r6 = r3 + 1
            byte r6 = r0[r6]
            r15 = r6 & 192(0xc0, float:2.69E-43)
            if (r15 != r9) goto L_0x0127
            r15 = 1
            goto L_0x0128
        L_0x0127:
            r15 = 0
        L_0x0128:
            if (r15 != 0) goto L_0x0135
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x004d
        L_0x0135:
            int r15 = r3 + 2
            byte r15 = r0[r15]
            r7 = r15 & 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L_0x013f
            r7 = 1
            goto L_0x0140
        L_0x013f:
            r7 = 0
        L_0x0140:
            if (r7 != 0) goto L_0x014d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x0070
        L_0x014d:
            byte r4 = r0[r4]
            r7 = r4 & 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L_0x0154
            r8 = 1
        L_0x0154:
            if (r8 != 0) goto L_0x0160
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x00e8
        L_0x0160:
            r7 = 3678080(0x381f80, float:5.154088E-39)
            r4 = r4 ^ r7
            int r7 = r15 << 6
            r4 = r4 ^ r7
            int r6 = r6 << 12
            r4 = r4 ^ r6
            int r5 = r5 << 18
            r4 = r4 ^ r5
            r5 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 <= r5) goto L_0x017c
        L_0x0172:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
        L_0x0176:
            r2.mo17094X(r4)
            com.onedelhi.secure.un4 r4 = com.onedelhi.secure.un4.f36206a
            goto L_0x018c
        L_0x017c:
            if (r12 <= r4) goto L_0x017f
            goto L_0x0182
        L_0x017f:
            if (r13 < r4) goto L_0x0182
            goto L_0x0172
        L_0x0182:
            r5 = 65536(0x10000, float:9.18355E-41)
            if (r4 >= r5) goto L_0x0187
            goto L_0x0172
        L_0x0187:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0176
        L_0x018c:
            r7 = 4
            goto L_0x0071
        L_0x018f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.mo17094X(r4)
            int r3 = r3 + 1
            goto L_0x0012
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.iq4.m52588h(byte[], int, int, com.onedelhi.secure.ec1):void");
    }

    @vw1
    @uw1(name = "size")
    /* renamed from: i */
    public static final long m52589i(@vr2 String str) {
        return m52592l(str, 0, 0, 3, (Object) null);
    }

    @vw1
    @uw1(name = "size")
    /* renamed from: j */
    public static final long m52590j(@vr2 String str, int i) {
        return m52592l(str, i, 0, 2, (Object) null);
    }

    @vw1
    @uw1(name = "size")
    /* renamed from: k */
    public static final long m52591k(@vr2 String str, int i, int i2) {
        int i3;
        jt1.m53777p(str, "$this$utf8Size");
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (z) {
                    long j = 0;
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            j++;
                        } else {
                            if (charAt < 2048) {
                                i3 = 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                i3 = 3;
                            } else {
                                int i4 = i + 1;
                                char charAt2 = i4 < i2 ? str.charAt(i4) : 0;
                                if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                                    j++;
                                    i = i4;
                                } else {
                                    j += (long) 4;
                                    i += 2;
                                }
                            }
                            j += (long) i3;
                        }
                        i++;
                    }
                    return j;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* renamed from: l */
    public static /* synthetic */ long m52592l(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m52591k(str, i, i2);
    }
}

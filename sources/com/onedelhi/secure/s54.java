package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000H\u0000¨\u0006\u0019"}, d2 = {"", "", "V0", "(Ljava/lang/String;)Ljava/lang/Byte;", "", "radix", "W0", "(Ljava/lang/String;I)Ljava/lang/Byte;", "", "b1", "(Ljava/lang/String;)Ljava/lang/Short;", "c1", "(Ljava/lang/String;I)Ljava/lang/Short;", "X0", "(Ljava/lang/String;)Ljava/lang/Integer;", "Y0", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "Z0", "(Ljava/lang/String;)Ljava/lang/Long;", "a1", "(Ljava/lang/String;I)Ljava/lang/Long;", "input", "", "U0", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/StringsKt")
public class s54 extends r54 {
    @vr2
    /* renamed from: U0 */
    public static final Void m64203U0(@vr2 String str) {
        jt1.m53777p(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    @gz3(version = "1.1")
    @ss2
    /* renamed from: V0 */
    public static final Byte m64204V0(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        return m64205W0(str, 10);
    }

    @gz3(version = "1.1")
    @ss2
    /* renamed from: W0 */
    public static final Byte m64205W0(@vr2 String str, int i) {
        int intValue;
        jt1.m53777p(str, "<this>");
        Integer Y0 = m64207Y0(str, i);
        if (Y0 == null || (intValue = Y0.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    @gz3(version = "1.1")
    @ss2
    /* renamed from: X0 */
    public static final Integer m64206X0(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        return m64207Y0(str, 10);
    }

    @gz3(version = "1.1")
    @ss2
    /* renamed from: Y0 */
    public static final Integer m64207Y0(@vr2 String str, int i) {
        boolean z;
        int i2;
        jt1.m53777p(str, "<this>");
        C5327fx.m48539a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        int i5 = 1;
        if (jt1.m53781t(charAt, 48) >= 0) {
            z = false;
            i5 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i4 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i6 = -59652323;
        while (i5 < length) {
            int b = C5327fx.m48540b(str.charAt(i5), i);
            if (b < 0) {
                return null;
            }
            if ((i3 < i6 && (i6 != -59652323 || i3 < (i6 = i4 / i))) || (i2 = i3 * i) < i4 + b) {
                return null;
            }
            i3 = i2 - b;
            i5++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    @gz3(version = "1.1")
    @ss2
    /* renamed from: Z0 */
    public static final Long m64208Z0(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        return m64209a1(str, 10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    @com.onedelhi.secure.gz3(version = "1.1")
    @com.onedelhi.secure.ss2
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Long m64209a1(@com.onedelhi.secure.vr2 java.lang.String r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r0, r2)
            com.onedelhi.secure.C5327fx.m48539a(r19)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L_0x0014
            return r3
        L_0x0014:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = com.onedelhi.secure.jt1.m53781t(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r6 >= 0) goto L_0x0039
            if (r2 != r9) goto L_0x002a
            return r3
        L_0x002a:
            r6 = 45
            if (r5 != r6) goto L_0x0032
            r7 = -9223372036854775808
            r4 = 1
            goto L_0x003a
        L_0x0032:
            r6 = 43
            if (r5 != r6) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            return r3
        L_0x0039:
            r9 = 0
        L_0x003a:
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r5
        L_0x0042:
            if (r4 >= r2) goto L_0x0073
            char r14 = r0.charAt(r4)
            int r14 = com.onedelhi.secure.C5327fx.m48540b(r14, r1)
            if (r14 >= 0) goto L_0x004f
            return r3
        L_0x004f:
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x005f
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x005e
            long r12 = (long) r1
            long r12 = r7 / r12
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x005f
        L_0x005e:
            return r3
        L_0x005f:
            long r5 = (long) r1
            long r10 = r10 * r5
            long r5 = (long) r14
            long r16 = r7 + r5
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x006a
            return r3
        L_0x006a:
            long r10 = r10 - r5
            int r4 = r4 + 1
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L_0x0042
        L_0x0073:
            if (r9 == 0) goto L_0x007a
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            goto L_0x007f
        L_0x007a:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.s54.m64209a1(java.lang.String, int):java.lang.Long");
    }

    @gz3(version = "1.1")
    @ss2
    /* renamed from: b1 */
    public static final Short m64210b1(@vr2 String str) {
        jt1.m53777p(str, "<this>");
        return m64211c1(str, 10);
    }

    @gz3(version = "1.1")
    @ss2
    /* renamed from: c1 */
    public static final Short m64211c1(@vr2 String str, int i) {
        int intValue;
        jt1.m53777p(str, "<this>");
        Integer Y0 = m64207Y0(str, i);
        if (Y0 == null || (intValue = Y0.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }
}

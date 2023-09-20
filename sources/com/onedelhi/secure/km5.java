package com.onedelhi.secure;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class km5 {

    /* renamed from: a */
    public final int f15024a;

    /* renamed from: a */
    public final String f15025a;

    /* renamed from: a */
    public final boolean f15026a;

    /* renamed from: a */
    public final byte[] f15027a;

    /* renamed from: a */
    public final char[] f15028a;

    /* renamed from: b */
    public final int f15029b;

    /* renamed from: c */
    public final int f15030c;

    /* renamed from: d */
    public final int f15031d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public km5(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = 0
        L_0x000a:
            int r5 = r11.length
            if (r4 >= r5) goto L_0x002b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L_0x0014
            r7 = 1
            goto L_0x0015
        L_0x0014:
            r7 = 0
        L_0x0015:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.onedelhi.secure.pg5.m24696d(r7, r8, r5)
            byte r7 = r1[r5]
            if (r7 != r2) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r6 = 0
        L_0x0020:
            java.lang.String r7 = "Duplicate character: %s"
            com.onedelhi.secure.pg5.m24696d(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto L_0x000a
        L_0x002b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.km5.<init>(java.lang.String, char[]):void");
    }

    public km5(String str, char[] cArr, byte[] bArr, boolean z) {
        this.f15025a = str;
        Objects.requireNonNull(cArr);
        this.f15028a = cArr;
        try {
            int length = cArr.length;
            int b = un5.m29471b(length, RoundingMode.UNNECESSARY);
            this.f15029b = b;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(b);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.f15030c = i;
            this.f15031d = b >> numberOfTrailingZeros;
            this.f15024a = length - 1;
            this.f15027a = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f15031d; i2++) {
                zArr[un5.m29470a(i2 * 8, this.f15029b, RoundingMode.CEILING)] = true;
            }
            this.f15026a = false;
        } catch (ArithmeticException e) {
            int length2 = cArr.length;
            throw new IllegalArgumentException("Illegal alphabet length " + length2, e);
        }
    }

    /* renamed from: a */
    public final char mo19163a(int i) {
        return this.f15028a[i];
    }

    /* renamed from: b */
    public final boolean mo19164b(char c) {
        return this.f15027a[61] != -1;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof km5) {
            km5 km5 = (km5) obj;
            boolean z = km5.f15026a;
            if (Arrays.equals(this.f15028a, km5.f15028a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15028a) + 1237;
    }

    public final String toString() {
        return this.f15025a;
    }
}

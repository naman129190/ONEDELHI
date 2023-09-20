package com.onedelhi.secure;

public final class w33 implements xy3 {

    /* renamed from: a */
    public int f36887a;

    /* renamed from: a */
    public final boolean f36888a;

    public w33(boolean z, int i) {
        this.f36888a = z;
        this.f36887a = i;
    }

    /* renamed from: a */
    public int mo38163a(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4] & 252) == 72) {
                int i5 = i4 + 3;
                if ((bArr[i5] & 3) == 1) {
                    int i6 = i4 + 1;
                    int i7 = i4 + 2;
                    byte b = ((bArr[i4] & 3) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (bArr[i5] & 252);
                    int i8 = this.f36888a ? b + ((this.f36887a + i4) - i) : b - ((this.f36887a + i4) - i);
                    bArr[i4] = (byte) (72 | ((i8 >>> 24) & 3));
                    bArr[i6] = (byte) (i8 >>> 16);
                    bArr[i7] = (byte) (i8 >>> 8);
                    bArr[i5] = (byte) ((bArr[i5] & 3) | i8);
                }
            }
            i4 += 4;
        }
        int i9 = i4 - i;
        this.f36887a += i9;
        return i9;
    }
}

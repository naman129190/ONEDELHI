package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.v */
public final class C6992v implements xy3 {

    /* renamed from: a */
    public int f36363a;

    /* renamed from: a */
    public final boolean f36364a;

    public C6992v(boolean z, int i) {
        this.f36364a = z;
        this.f36363a = i + 8;
    }

    /* renamed from: a */
    public int mo38163a(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4 + 3] & 255) == 235) {
                int i5 = i4 + 2;
                int i6 = i4 + 1;
                int i7 = ((((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8)) | (bArr[i4] & 255)) << 2;
                int i8 = (this.f36364a ? i7 + ((this.f36363a + i4) - i) : i7 - ((this.f36363a + i4) - i)) >>> 2;
                bArr[i5] = (byte) (i8 >>> 16);
                bArr[i6] = (byte) (i8 >>> 8);
                bArr[i4] = (byte) i8;
            }
            i4 += 4;
        }
        int i9 = i4 - i;
        this.f36363a += i9;
        return i9;
    }
}

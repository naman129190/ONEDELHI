package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.x */
public final class C7214x implements xy3 {

    /* renamed from: a */
    public int f37289a;

    /* renamed from: a */
    public final boolean f37290a;

    public C7214x(boolean z, int i) {
        this.f37290a = z;
        this.f37289a = i + 4;
    }

    /* renamed from: a */
    public int mo38163a(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            int i5 = i4 + 1;
            if ((bArr[i5] & 248) == 240) {
                int i6 = i4 + 3;
                if ((bArr[i6] & 248) == 248) {
                    int i7 = i4 + 2;
                    int i8 = (((((bArr[i5] & 7) << 19) | ((bArr[i4] & 255) << 11)) | ((bArr[i6] & 7) << 8)) | (bArr[i7] & 255)) << 1;
                    int i9 = (this.f37290a ? i8 + ((this.f37289a + i4) - i) : i8 - ((this.f37289a + i4) - i)) >>> 1;
                    bArr[i5] = (byte) (240 | ((i9 >>> 19) & 7));
                    bArr[i4] = (byte) (i9 >>> 11);
                    bArr[i6] = (byte) (((i9 >>> 8) & 7) | 248);
                    bArr[i7] = (byte) i9;
                    i4 = i7;
                }
            }
            i4 += 2;
        }
        int i10 = i4 - i;
        this.f37289a += i10;
        return i10;
    }
}

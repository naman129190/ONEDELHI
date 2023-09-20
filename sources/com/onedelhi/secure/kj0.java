package com.onedelhi.secure;

public class kj0 extends gj0 {
    public kj0(int i) {
        super(i);
    }

    /* renamed from: a */
    public void mo39266a(byte[] bArr, int i, int i2, byte[] bArr2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr3 = this.f29209a;
            int i4 = this.f29208a;
            int i5 = this.f29210b;
            byte b = bArr3[(i4 + i5) & 255];
            this.f29210b = i5 - 1;
            int i6 = i + i3;
            bArr3[i5 & 255] = bArr[i6];
            bArr2[i3] = (byte) (bArr[i6] - b);
        }
    }
}

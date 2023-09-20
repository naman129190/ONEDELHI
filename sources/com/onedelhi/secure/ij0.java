package com.onedelhi.secure;

public class ij0 extends gj0 {
    public ij0(int i) {
        super(i);
    }

    /* renamed from: a */
    public void mo38114a(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            byte[] bArr2 = this.f29209a;
            int i4 = this.f29208a;
            int i5 = this.f29210b;
            bArr[i] = (byte) (b + bArr2[(i4 + i5) & 255]);
            this.f29210b = i5 - 1;
            bArr2[i5 & 255] = bArr[i];
            i++;
        }
    }
}

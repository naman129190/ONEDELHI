package com.onedelhi.secure;

import android.graphics.Rect;

public class jf3 {

    /* renamed from: a */
    public int f30755a;

    /* renamed from: a */
    public byte[] f30756a;

    /* renamed from: b */
    public int f30757b;

    public jf3(byte[] bArr, int i, int i2) {
        this.f30756a = bArr;
        this.f30755a = i;
        this.f30757b = i2;
    }

    /* renamed from: e */
    public static byte[] m53323e(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2[i4] = bArr[i5];
            i4--;
        }
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m53324f(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = i2 - 1; i6 >= 0; i6--) {
                bArr2[i4] = bArr[(i6 * i) + i5];
                i4--;
            }
        }
        return bArr2;
    }

    /* renamed from: g */
    public static byte[] m53325g(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = i2 - 1; i5 >= 0; i5--) {
                bArr2[i3] = bArr[(i5 * i) + i4];
                i3++;
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public jf3 mo38616a(Rect rect, int i) {
        int width = rect.width() / i;
        int height = rect.height() / i;
        int i2 = rect.top;
        byte[] bArr = new byte[(width * height)];
        if (i == 1) {
            int i3 = (i2 * this.f30755a) + rect.left;
            for (int i4 = 0; i4 < height; i4++) {
                System.arraycopy(this.f30756a, i3, bArr, i4 * width, width);
                i3 += this.f30755a;
            }
        } else {
            int i5 = (i2 * this.f30755a) + rect.left;
            for (int i6 = 0; i6 < height; i6++) {
                int i7 = i6 * width;
                int i8 = i5;
                for (int i9 = 0; i9 < width; i9++) {
                    bArr[i7] = this.f30756a[i8];
                    i8 += i;
                    i7++;
                }
                i5 += this.f30755a * i;
            }
        }
        return new jf3(bArr, width, height);
    }

    /* renamed from: b */
    public byte[] mo38617b() {
        return this.f30756a;
    }

    /* renamed from: c */
    public int mo38618c() {
        return this.f30757b;
    }

    /* renamed from: d */
    public int mo38619d() {
        return this.f30755a;
    }

    /* renamed from: h */
    public jf3 mo38620h(int i) {
        return i != 90 ? i != 180 ? i != 270 ? this : new jf3(m53324f(this.f30756a, this.f30755a, this.f30757b), this.f30757b, this.f30755a) : new jf3(m53323e(this.f30756a, this.f30755a, this.f30757b), this.f30755a, this.f30757b) : new jf3(m53325g(this.f30756a, this.f30755a, this.f30757b), this.f30757b, this.f30755a);
    }
}

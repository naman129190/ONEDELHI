package com.onedelhi.secure;

import com.onedelhi.secure.ss4;

public final class gd0 {

    /* renamed from: a */
    public final int f29133a;

    /* renamed from: a */
    public final byte[] f29134a;

    public gd0(int i, byte[] bArr) {
        this.f29133a = i;
        this.f29134a = bArr;
    }

    /* renamed from: b */
    public static gd0[] m49373b(byte[] bArr, ss4 ss4) {
        ss4.C6791c d = ss4.mo44530d();
        ss4.C6790b[] a = d.mo44538a();
        int i = 0;
        for (ss4.C6790b a2 : a) {
            i += a2.mo44536a();
        }
        gd0[] gd0Arr = new gd0[i];
        int i2 = 0;
        for (ss4.C6790b bVar : a) {
            int i3 = 0;
            while (i3 < bVar.mo44536a()) {
                int b = bVar.mo44537b();
                gd0Arr[i2] = new gd0(b, new byte[(d.mo44539b() + b)]);
                i3++;
                i2++;
            }
        }
        int length = gd0Arr[0].f29134a.length - d.mo44539b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                gd0Arr[i7].f29134a[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = ss4.mo44534i() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            gd0Arr[i9].f29134a[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = gd0Arr[0].f29134a.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                gd0Arr[i11].f29134a[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return gd0Arr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] mo36680a() {
        return this.f29134a;
    }

    /* renamed from: c */
    public int mo36681c() {
        return this.f29133a;
    }
}

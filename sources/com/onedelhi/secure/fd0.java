package com.onedelhi.secure;

import com.onedelhi.secure.ts4;

public final class fd0 {

    /* renamed from: a */
    public final int f28262a;

    /* renamed from: a */
    public final byte[] f28263a;

    public fd0(int i, byte[] bArr) {
        this.f28262a = i;
        this.f28263a = bArr;
    }

    /* renamed from: b */
    public static fd0[] m47749b(byte[] bArr, ts4 ts4, kv0 kv0) {
        if (bArr.length == ts4.mo45299h()) {
            ts4.C6897b f = ts4.mo45298f(kv0);
            ts4.C6896a[] a = f.mo45304a();
            int i = 0;
            for (ts4.C6896a a2 : a) {
                i += a2.mo45302a();
            }
            fd0[] fd0Arr = new fd0[i];
            int i2 = 0;
            for (ts4.C6896a aVar : a) {
                int i3 = 0;
                while (i3 < aVar.mo45302a()) {
                    int b = aVar.mo45303b();
                    fd0Arr[i2] = new fd0(b, new byte[(f.mo45305b() + b)]);
                    i3++;
                    i2++;
                }
            }
            int length = fd0Arr[0].f28263a.length;
            int i4 = i - 1;
            while (i4 >= 0 && fd0Arr[i4].f28263a.length != length) {
                i4--;
            }
            int i5 = i4 + 1;
            int b2 = length - f.mo45305b();
            int i6 = 0;
            for (int i7 = 0; i7 < b2; i7++) {
                int i8 = 0;
                while (i8 < i2) {
                    fd0Arr[i8].f28263a[i7] = bArr[i6];
                    i8++;
                    i6++;
                }
            }
            int i9 = i5;
            while (i9 < i2) {
                fd0Arr[i9].f28263a[b2] = bArr[i6];
                i9++;
                i6++;
            }
            int length2 = fd0Arr[0].f28263a.length;
            while (b2 < length2) {
                int i10 = 0;
                while (i10 < i2) {
                    fd0Arr[i10].f28263a[i10 < i5 ? b2 : b2 + 1] = bArr[i6];
                    i10++;
                    i6++;
                }
                b2++;
            }
            return fd0Arr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] mo35848a() {
        return this.f28263a;
    }

    /* renamed from: c */
    public int mo35849c() {
        return this.f28262a;
    }
}

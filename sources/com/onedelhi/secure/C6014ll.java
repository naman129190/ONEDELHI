package com.onedelhi.secure;

import java.util.Arrays;

/* renamed from: com.onedelhi.secure.ll */
public final class C6014ll implements Cloneable {

    /* renamed from: a */
    public int[] f31725a;

    /* renamed from: n */
    public int f31726n;

    public C6014ll() {
        this.f31726n = 0;
        this.f31725a = new int[1];
    }

    public C6014ll(int i) {
        this.f31726n = i;
        this.f31725a = m55795o(i);
    }

    public C6014ll(int[] iArr, int i) {
        this.f31725a = iArr;
        this.f31726n = i;
    }

    /* renamed from: o */
    public static int[] m55795o(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo39921a(boolean z) {
        mo39928f(this.f31726n + 1);
        if (z) {
            int[] iArr = this.f31725a;
            int i = this.f31726n;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f31726n++;
    }

    /* renamed from: b */
    public void mo39922b(C6014ll llVar) {
        int i = llVar.f31726n;
        mo39928f(this.f31726n + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo39921a(llVar.mo39930h(i2));
        }
    }

    /* renamed from: c */
    public void mo39923c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        mo39928f(this.f31726n + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo39921a(z);
            i2--;
        }
    }

    /* renamed from: d */
    public void mo39925d() {
        int length = this.f31725a.length;
        for (int i = 0; i < length; i++) {
            this.f31725a[i] = 0;
        }
    }

    /* renamed from: e */
    public C6014ll clone() {
        return new C6014ll((int[]) this.f31725a.clone(), this.f31726n);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6014ll)) {
            return false;
        }
        C6014ll llVar = (C6014ll) obj;
        return this.f31726n == llVar.f31726n && Arrays.equals(this.f31725a, llVar.f31725a);
    }

    /* renamed from: f */
    public final void mo39928f(int i) {
        if (i > (this.f31725a.length << 5)) {
            int[] o = m55795o(i);
            int[] iArr = this.f31725a;
            System.arraycopy(iArr, 0, o, 0, iArr.length);
            this.f31725a = o;
        }
    }

    /* renamed from: g */
    public void mo39929g(int i) {
        int[] iArr = this.f31725a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) ^ iArr[i2];
    }

    /* renamed from: h */
    public boolean mo39930h(int i) {
        return ((1 << (i & 31)) & this.f31725a[i / 32]) != 0;
    }

    public int hashCode() {
        return (this.f31726n * 31) + Arrays.hashCode(this.f31725a);
    }

    /* renamed from: i */
    public int[] mo39932i() {
        return this.f31725a;
    }

    /* renamed from: j */
    public int mo39933j(int i) {
        int i2 = this.f31726n;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & this.f31725a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f31725a;
            if (i3 == iArr.length) {
                return this.f31726n;
            }
            i4 = iArr[i3];
        }
        return Math.min((i3 << 5) + Integer.numberOfTrailingZeros(i4), this.f31726n);
    }

    /* renamed from: k */
    public int mo39934k(int i) {
        int i2 = this.f31726n;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & (~this.f31725a[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f31725a;
            if (i3 == iArr.length) {
                return this.f31726n;
            }
            i4 = ~iArr[i3];
        }
        return Math.min((i3 << 5) + Integer.numberOfTrailingZeros(i4), this.f31726n);
    }

    /* renamed from: l */
    public int mo39935l() {
        return this.f31726n;
    }

    /* renamed from: m */
    public int mo39936m() {
        return (this.f31726n + 7) / 8;
    }

    /* renamed from: n */
    public boolean mo39937n(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f31726n) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                int i9 = (2 << i7) - (1 << i8);
                int i10 = this.f31725a[i6] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
                i6++;
            }
            return true;
        }
    }

    /* renamed from: p */
    public void mo39938p() {
        int[] iArr = new int[this.f31725a.length];
        int i = (this.f31726n - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f31725a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & xw4.f37660c) << 16) | ((j5 >> 16) & xw4.f37660c));
        }
        int i4 = this.f31726n;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f31725a = iArr;
    }

    /* renamed from: q */
    public void mo39939q(int i) {
        int[] iArr = this.f31725a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: r */
    public void mo39940r(int i, int i2) {
        this.f31725a[i / 32] = i2;
    }

    /* renamed from: s */
    public void mo39941s(int i, int i2) {
        if (i2 < i || i < 0 || i2 > this.f31726n) {
            throw new IllegalArgumentException();
        } else if (i2 != i) {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                int i9 = (2 << i7) - (1 << i8);
                int[] iArr = this.f31725a;
                iArr[i6] = i9 | iArr[i6];
                i6++;
            }
        }
    }

    /* renamed from: t */
    public void mo39942t(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (mo39930h(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public String toString() {
        int i = this.f31726n;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f31726n; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo39930h(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void mo39944u(C6014ll llVar) {
        if (this.f31726n == llVar.f31726n) {
            int i = 0;
            while (true) {
                int[] iArr = this.f31725a;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ llVar.f31725a[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }
}

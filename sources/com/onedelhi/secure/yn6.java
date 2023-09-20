package com.onedelhi.secure;

import java.io.IOException;
import java.util.Objects;

public final class yn6 extends eo6 {

    /* renamed from: a */
    public final byte[] f23261a;

    /* renamed from: b */
    public final int f23262b;

    /* renamed from: c */
    public int f23263c;

    public yn6(byte[] bArr, int i, int i2) {
        super((co6) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f23261a = bArr;
            this.f23263c = 0;
            this.f23262b = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: B */
    public final void mo27648B(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f23261a, this.f23263c, i2);
            this.f23263c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new ao6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f23263c), Integer.valueOf(this.f23262b), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: C */
    public final void mo27649C(String str) throws IOException {
        int i = this.f23263c;
        try {
            int y = eo6.m13910y(str.length() * 3);
            int y2 = eo6.m13910y(str.length());
            if (y2 == y) {
                int i2 = i + y2;
                this.f23263c = i2;
                int b = ev6.m14401b(str, this.f23261a, i2, this.f23262b - i2);
                this.f23263c = i;
                mo15278r((b - i) - y2);
                this.f23263c = b;
                return;
            }
            mo15278r(ev6.m14402c(str));
            byte[] bArr = this.f23261a;
            int i3 = this.f23263c;
            this.f23263c = ev6.m14401b(str, bArr, i3, this.f23262b - i3);
        } catch (dv6 e) {
            this.f23263c = i;
            mo15263b(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new ao6(e2);
        }
    }

    /* renamed from: d */
    public final int mo15264d() {
        return this.f23262b - this.f23263c;
    }

    /* renamed from: e */
    public final void mo15265e(byte b) throws IOException {
        try {
            byte[] bArr = this.f23261a;
            int i = this.f23263c;
            this.f23263c = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new ao6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f23263c), Integer.valueOf(this.f23262b), 1}), e);
        }
    }

    /* renamed from: f */
    public final void mo15266f(int i, boolean z) throws IOException {
        mo15278r(i << 3);
        mo15265e(z ? (byte) 1 : 0);
    }

    /* renamed from: g */
    public final void mo15267g(int i, on6 on6) throws IOException {
        mo15278r((i << 3) | 2);
        mo15278r(on6.mo18486f());
        on6.mo22030k(this);
    }

    /* renamed from: h */
    public final void mo15268h(int i, int i2) throws IOException {
        mo15278r((i << 3) | 5);
        mo15269i(i2);
    }

    /* renamed from: i */
    public final void mo15269i(int i) throws IOException {
        try {
            byte[] bArr = this.f23261a;
            int i2 = this.f23263c;
            int i3 = i2 + 1;
            this.f23263c = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f23263c = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f23263c = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f23263c = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new ao6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f23263c), Integer.valueOf(this.f23262b), 1}), e);
        }
    }

    /* renamed from: j */
    public final void mo15270j(int i, long j) throws IOException {
        mo15278r((i << 3) | 1);
        mo15271k(j);
    }

    /* renamed from: k */
    public final void mo15271k(long j) throws IOException {
        try {
            byte[] bArr = this.f23261a;
            int i = this.f23263c;
            int i2 = i + 1;
            this.f23263c = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f23263c = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f23263c = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f23263c = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f23263c = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f23263c = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f23263c = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f23263c = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new ao6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f23263c), Integer.valueOf(this.f23262b), 1}), e);
        }
    }

    /* renamed from: l */
    public final void mo15272l(int i, int i2) throws IOException {
        mo15278r(i << 3);
        mo15273m(i2);
    }

    /* renamed from: m */
    public final void mo15273m(int i) throws IOException {
        if (i >= 0) {
            mo15278r(i);
        } else {
            mo15280t((long) i);
        }
    }

    /* renamed from: n */
    public final void mo15274n(byte[] bArr, int i, int i2) throws IOException {
        mo27648B(bArr, 0, i2);
    }

    /* renamed from: o */
    public final void mo15275o(int i, String str) throws IOException {
        mo15278r((i << 3) | 2);
        mo27649C(str);
    }

    /* renamed from: p */
    public final void mo15276p(int i, int i2) throws IOException {
        mo15278r((i << 3) | i2);
    }

    /* renamed from: q */
    public final void mo15277q(int i, int i2) throws IOException {
        mo15278r(i << 3);
        mo15278r(i2);
    }

    /* renamed from: r */
    public final void mo15278r(int i) throws IOException {
        while ((i & -128) != 0) {
            byte[] bArr = this.f23261a;
            int i2 = this.f23263c;
            this.f23263c = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f23261a;
            int i3 = this.f23263c;
            this.f23263c = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new ao6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f23263c), Integer.valueOf(this.f23262b), 1}), e);
        }
    }

    /* renamed from: s */
    public final void mo15279s(int i, long j) throws IOException {
        mo15278r(i << 3);
        mo15280t(j);
    }

    /* renamed from: t */
    public final void mo15280t(long j) throws IOException {
        if (!eo6.f11312a || this.f23262b - this.f23263c < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f23261a;
                int i = this.f23263c;
                this.f23263c = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f23261a;
                int i2 = this.f23263c;
                this.f23263c = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new ao6(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f23263c), Integer.valueOf(this.f23262b), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f23261a;
                int i3 = this.f23263c;
                this.f23263c = i3 + 1;
                zu6.m33472s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f23261a;
            int i4 = this.f23263c;
            this.f23263c = i4 + 1;
            zu6.m33472s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}

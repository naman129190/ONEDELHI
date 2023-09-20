package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;

public abstract class k02 {

    /* renamed from: b */
    public static final /* synthetic */ boolean f31033b = false;

    /* renamed from: j */
    public static final int f31034j = 4;

    /* renamed from: k */
    public static final int f31035k = 20;

    /* renamed from: a */
    public final int f31036a;

    /* renamed from: a */
    public boolean f31037a = false;

    /* renamed from: a */
    public final byte[] f31038a;

    /* renamed from: b */
    public final int f31039b;

    /* renamed from: c */
    public final int f31040c;

    /* renamed from: d */
    public final int f31041d;

    /* renamed from: e */
    public final int f31042e;

    /* renamed from: f */
    public int f31043f = -1;

    /* renamed from: g */
    public int f31044g = -1;

    /* renamed from: h */
    public int f31045h = 0;

    /* renamed from: i */
    public int f31046i = 0;

    public k02(int i, int i2, int i3, int i4, int i5, C4477aa aaVar) {
        int d = m53924d(i, i2, i3, i5);
        this.f31042e = d;
        this.f31038a = aaVar.mo30487a(d, false);
        this.f31036a = i2 + i;
        this.f31039b = i3 + i5;
        this.f31040c = i5;
        this.f31041d = i4;
    }

    /* renamed from: d */
    public static int m53924d(int i, int i2, int i3, int i4) {
        return i2 + i + i3 + i4 + Math.min((i / 2) + 262144, bi2.f26359j);
    }

    /* renamed from: g */
    public static k02 m53925g(int i, int i2, int i3, int i4, int i5, int i6, int i7, C4477aa aaVar) {
        int i8 = i6;
        if (i8 == 4) {
            return new uj1(i, i2, i3, i4, i5, i7, aaVar);
        }
        if (i8 == 20) {
            return new C5028di(i, i2, i3, i4, i5, i7, aaVar);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public static int m53926k(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int d = (m53924d(i, i2, i3, i4) / 1024) + 10;
        if (i5 == 4) {
            i6 = uj1.m67087y(i);
        } else if (i5 == 20) {
            i6 = C5028di.m45296y(i);
        } else {
            throw new IllegalArgumentException();
        }
        return d + i6;
    }

    /* renamed from: q */
    public static void m53927q(int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] <= i2) {
                iArr[i3] = 0;
            } else {
                iArr[i3] = iArr[i3] - i2;
            }
        }
    }

    /* renamed from: a */
    public void mo38966a(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f31038a, (this.f31043f + 1) - i, i2);
    }

    /* renamed from: b */
    public int mo38967b(byte[] bArr, int i, int i2) {
        if (this.f31043f >= this.f31042e - this.f31039b) {
            mo38977p();
        }
        int i3 = this.f31042e;
        int i4 = this.f31045h;
        if (i2 > i3 - i4) {
            i2 = i3 - i4;
        }
        System.arraycopy(bArr, i, this.f31038a, i4, i2);
        int i5 = this.f31045h + i2;
        this.f31045h = i5;
        int i6 = this.f31039b;
        if (i5 >= i6) {
            this.f31044g = i5 - i6;
        }
        mo38978r();
        return i2;
    }

    /* renamed from: c */
    public int mo38968c() {
        return this.f31045h - this.f31043f;
    }

    /* renamed from: e */
    public int mo38969e(int i) {
        return this.f31038a[this.f31043f - i] & 255;
    }

    /* renamed from: f */
    public int mo38970f(int i, int i2) {
        return this.f31038a[(this.f31043f + i) - i2] & 255;
    }

    /* renamed from: h */
    public int mo38971h(int i, int i2) {
        int i3 = (this.f31043f - i) - 1;
        int i4 = 0;
        while (i4 < i2) {
            byte[] bArr = this.f31038a;
            if (bArr[this.f31043f + i4] != bArr[i3 + i4]) {
                break;
            }
            i4++;
        }
        return i4;
    }

    /* renamed from: i */
    public int mo38972i(int i, int i2, int i3) {
        int i4 = this.f31043f + i;
        int i5 = (i4 - i2) - 1;
        int i6 = 0;
        while (i6 < i3) {
            byte[] bArr = this.f31038a;
            if (bArr[i4 + i6] != bArr[i5 + i6]) {
                break;
            }
            i6++;
        }
        return i6;
    }

    /* renamed from: j */
    public abstract fe2 mo34462j();

    /* renamed from: l */
    public int mo38973l() {
        return this.f31043f;
    }

    /* renamed from: m */
    public boolean mo38974m(int i) {
        return this.f31043f - i < this.f31044g;
    }

    /* renamed from: n */
    public boolean mo38975n() {
        return this.f31043f != -1;
    }

    /* renamed from: o */
    public int mo38976o(int i, int i2) {
        int i3 = this.f31043f + 1;
        this.f31043f = i3;
        int i4 = this.f31045h - i3;
        if (i4 >= i) {
            return i4;
        }
        if (i4 >= i2 && this.f31037a) {
            return i4;
        }
        this.f31046i++;
        return 0;
    }

    /* renamed from: p */
    public final void mo38977p() {
        int i = ((this.f31043f + 1) - this.f31036a) & -16;
        byte[] bArr = this.f31038a;
        System.arraycopy(bArr, i, bArr, 0, this.f31045h - i);
        this.f31043f -= i;
        this.f31044g -= i;
        this.f31045h -= i;
    }

    /* renamed from: r */
    public final void mo38978r() {
        int i;
        int i2 = this.f31046i;
        if (i2 > 0 && (i = this.f31043f) < this.f31044g) {
            this.f31043f = i - i2;
            this.f31046i = 0;
            mo34464w(i2);
        }
    }

    /* renamed from: s */
    public void mo34463s(C4477aa aaVar) {
        aaVar.mo30489e(this.f31038a);
    }

    /* renamed from: t */
    public void mo38979t() {
        this.f31044g = this.f31045h - 1;
        this.f31037a = true;
        mo38978r();
    }

    /* renamed from: u */
    public void mo38980u() {
        this.f31044g = this.f31045h - 1;
        mo38978r();
    }

    /* renamed from: v */
    public void mo38981v(int i, byte[] bArr) {
        if (bArr != null) {
            int min = Math.min(bArr.length, i);
            System.arraycopy(bArr, bArr.length - min, this.f31038a, 0, min);
            this.f31045h += min;
            mo34464w(min);
        }
    }

    /* renamed from: w */
    public abstract void mo34464w(int i);

    /* renamed from: x */
    public boolean mo38982x(fe2 fe2) {
        int min = Math.min(mo38968c(), this.f31040c);
        for (int i = 0; i < fe2.f28271a; i++) {
            if (mo38971h(fe2.f28273b[i], min) != fe2.f28272a[i]) {
                return false;
            }
        }
        return true;
    }
}

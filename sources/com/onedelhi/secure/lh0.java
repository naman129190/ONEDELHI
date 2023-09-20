package com.onedelhi.secure;

import java.util.Arrays;

public class lh0 {

    /* renamed from: a */
    public final int f31663a;

    /* renamed from: a */
    public final CharSequence f31664a;

    /* renamed from: a */
    public final byte[] f31665a;

    /* renamed from: b */
    public final int f31666b;

    public lh0(CharSequence charSequence, int i, int i2) {
        this.f31664a = charSequence;
        this.f31666b = i;
        this.f31663a = i2;
        byte[] bArr = new byte[(i * i2)];
        this.f31665a = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    public final void mo39853a(int i) {
        mo39861i(this.f31663a - 1, 0, i, 1);
        mo39861i(this.f31663a - 1, 1, i, 2);
        mo39861i(this.f31663a - 1, 2, i, 3);
        mo39861i(0, this.f31666b - 2, i, 4);
        mo39861i(0, this.f31666b - 1, i, 5);
        mo39861i(1, this.f31666b - 1, i, 6);
        mo39861i(2, this.f31666b - 1, i, 7);
        mo39861i(3, this.f31666b - 1, i, 8);
    }

    /* renamed from: b */
    public final void mo39854b(int i) {
        mo39861i(this.f31663a - 3, 0, i, 1);
        mo39861i(this.f31663a - 2, 0, i, 2);
        mo39861i(this.f31663a - 1, 0, i, 3);
        mo39861i(0, this.f31666b - 4, i, 4);
        mo39861i(0, this.f31666b - 3, i, 5);
        mo39861i(0, this.f31666b - 2, i, 6);
        mo39861i(0, this.f31666b - 1, i, 7);
        mo39861i(1, this.f31666b - 1, i, 8);
    }

    /* renamed from: c */
    public final void mo39855c(int i) {
        mo39861i(this.f31663a - 3, 0, i, 1);
        mo39861i(this.f31663a - 2, 0, i, 2);
        mo39861i(this.f31663a - 1, 0, i, 3);
        mo39861i(0, this.f31666b - 2, i, 4);
        mo39861i(0, this.f31666b - 1, i, 5);
        mo39861i(1, this.f31666b - 1, i, 6);
        mo39861i(2, this.f31666b - 1, i, 7);
        mo39861i(3, this.f31666b - 1, i, 8);
    }

    /* renamed from: d */
    public final void mo39856d(int i) {
        mo39861i(this.f31663a - 1, 0, i, 1);
        mo39861i(this.f31663a - 1, this.f31666b - 1, i, 2);
        mo39861i(0, this.f31666b - 3, i, 3);
        mo39861i(0, this.f31666b - 2, i, 4);
        mo39861i(0, this.f31666b - 1, i, 5);
        mo39861i(1, this.f31666b - 3, i, 6);
        mo39861i(1, this.f31666b - 2, i, 7);
        mo39861i(1, this.f31666b - 1, i, 8);
    }

    /* renamed from: e */
    public final boolean mo39857e(int i, int i2) {
        return this.f31665a[(i2 * this.f31666b) + i] == 1;
    }

    /* renamed from: f */
    public final byte[] mo39858f() {
        return this.f31665a;
    }

    /* renamed from: g */
    public final int mo39859g() {
        return this.f31666b;
    }

    /* renamed from: h */
    public final int mo39860h() {
        return this.f31663a;
    }

    /* renamed from: i */
    public final void mo39861i(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f31663a;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f31666b;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.f31664a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        mo39864l(i2, i, z);
    }

    /* renamed from: j */
    public final boolean mo39862j(int i, int i2) {
        return this.f31665a[(i2 * this.f31666b) + i] < 0;
    }

    /* renamed from: k */
    public final void mo39863k() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f31663a && i3 == 0) {
                mo39853a(i4);
                i4++;
            }
            if (i5 == this.f31663a - 2 && i3 == 0 && this.f31666b % 4 != 0) {
                mo39854b(i4);
                i4++;
            }
            if (i5 == this.f31663a - 2 && i3 == 0 && this.f31666b % 8 == 4) {
                mo39855c(i4);
                i4++;
            }
            if (i5 == this.f31663a + 4 && i3 == 2 && this.f31666b % 8 == 0) {
                mo39856d(i4);
                i4++;
            }
            do {
                if (i5 < this.f31663a && i3 >= 0 && mo39862j(i3, i5)) {
                    mo39865m(i5, i3, i4);
                    i4++;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0 || i3 >= this.f31666b) {
                    int i6 = i5 + 1;
                    int i7 = i3 + 3;
                }
                mo39865m(i5, i3, i4);
                i4++;
                i5 -= 2;
                i3 += 2;
                break;
            } while (i3 >= this.f31666b);
            int i62 = i5 + 1;
            int i72 = i3 + 3;
            do {
                if (i62 >= 0 && i72 < this.f31666b && mo39862j(i72, i62)) {
                    mo39865m(i62, i72, i4);
                    i4++;
                }
                i62 += 2;
                i72 -= 2;
                i = this.f31663a;
                if (i62 >= i) {
                    break;
                }
            } while (i72 >= 0);
            i5 = i62 + 3;
            i3 = i72 + 1;
            if (i5 >= i && i3 >= (i2 = this.f31666b)) {
                break;
            }
        }
        if (mo39862j(i2 - 1, i - 1)) {
            mo39864l(this.f31666b - 1, this.f31663a - 1, true);
            mo39864l(this.f31666b - 2, this.f31663a - 2, true);
        }
    }

    /* renamed from: l */
    public final void mo39864l(int i, int i2, boolean z) {
        this.f31665a[(i2 * this.f31666b) + i] = z ? (byte) 1 : 0;
    }

    /* renamed from: m */
    public final void mo39865m(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        mo39861i(i4, i5, i3, 1);
        int i6 = i2 - 1;
        mo39861i(i4, i6, i3, 2);
        int i7 = i - 1;
        mo39861i(i7, i5, i3, 3);
        mo39861i(i7, i6, i3, 4);
        mo39861i(i7, i2, i3, 5);
        mo39861i(i, i5, i3, 6);
        mo39861i(i, i6, i3, 7);
        mo39861i(i, i2, i3, 8);
    }
}

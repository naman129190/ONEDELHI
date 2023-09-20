package com.onedelhi.secure;

public final class dk2 {

    /* renamed from: a */
    public final ck2 f27478a;

    /* renamed from: a */
    public final int[] f27479a;

    public dk2(ck2 ck2, int[] iArr) {
        if (iArr.length != 0) {
            this.f27478a = ck2;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f27479a = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f27479a = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f27479a = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public dk2 mo34479a(dk2 dk2) {
        if (!this.f27478a.equals(dk2.f27478a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo34484f()) {
            return dk2;
        } else {
            if (dk2.mo34484f()) {
                return this;
            }
            int[] iArr = this.f27479a;
            int[] iArr2 = dk2.f27479a;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = this.f27478a.mo33768a(iArr2[i - length], iArr[i]);
            }
            return new dk2(this.f27478a, iArr4);
        }
    }

    /* renamed from: b */
    public int mo34480b(int i) {
        if (i == 0) {
            return mo34481c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f27479a) {
                i2 = this.f27478a.mo33768a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f27479a;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            ck2 ck2 = this.f27478a;
            i3 = ck2.mo33768a(ck2.mo33776i(i, i3), this.f27479a[i4]);
        }
        return i3;
    }

    /* renamed from: c */
    public int mo34481c(int i) {
        int[] iArr = this.f27479a;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: d */
    public int[] mo34482d() {
        return this.f27479a;
    }

    /* renamed from: e */
    public int mo34483e() {
        return this.f27479a.length - 1;
    }

    /* renamed from: f */
    public boolean mo34484f() {
        return this.f27479a[0] == 0;
    }

    /* renamed from: g */
    public dk2 mo34485g(int i) {
        if (i == 0) {
            return this.f27478a.mo33773f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f27479a.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f27478a.mo33776i(this.f27479a[i2], i);
        }
        return new dk2(this.f27478a, iArr);
    }

    /* renamed from: h */
    public dk2 mo34486h(dk2 dk2) {
        if (!this.f27478a.equals(dk2.f27478a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo34484f() || dk2.mo34484f()) {
            return this.f27478a.mo33773f();
        } else {
            int[] iArr = this.f27479a;
            int length = iArr.length;
            int[] iArr2 = dk2.f27479a;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    ck2 ck2 = this.f27478a;
                    iArr3[i4] = ck2.mo33768a(iArr3[i4], ck2.mo33776i(i2, iArr2[i3]));
                }
            }
            return new dk2(this.f27478a, iArr3);
        }
    }

    /* renamed from: i */
    public dk2 mo34487i(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f27478a.mo33773f();
        } else {
            int length = this.f27479a.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f27478a.mo33776i(this.f27479a[i3], i2);
            }
            return new dk2(this.f27478a, iArr);
        }
    }

    /* renamed from: j */
    public dk2 mo34488j() {
        int length = this.f27479a.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f27478a.mo33777j(0, this.f27479a[i]);
        }
        return new dk2(this.f27478a, iArr);
    }

    /* renamed from: k */
    public dk2 mo34489k(dk2 dk2) {
        if (this.f27478a.equals(dk2.f27478a)) {
            return dk2.mo34484f() ? this : mo34479a(dk2.mo34488j());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo34483e() * 8);
        for (int e = mo34483e(); e >= 0; e--) {
            int c = mo34481c(e);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (e == 0 || c != 1) {
                    sb.append(c);
                }
                if (e != 0) {
                    if (e == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(e);
                    }
                }
            }
        }
        return sb.toString();
    }
}

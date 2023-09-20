package com.onedelhi.secure;

public final class ue1 {

    /* renamed from: a */
    public final te1 f36045a;

    /* renamed from: a */
    public final int[] f36046a;

    public ue1(te1 te1, int[] iArr) {
        if (iArr.length != 0) {
            this.f36045a = te1;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f36046a = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f36046a = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f36046a = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public ue1 mo45564a(ue1 ue1) {
        if (!this.f36045a.equals(ue1.f36045a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo45570g()) {
            return ue1;
        } else {
            if (ue1.mo45570g()) {
                return this;
            }
            int[] iArr = this.f36046a;
            int[] iArr2 = ue1.f36046a;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = te1.m65582a(iArr2[i - length], iArr[i]);
            }
            return new ue1(this.f36045a, iArr4);
        }
    }

    /* renamed from: b */
    public ue1[] mo45565b(ue1 ue1) {
        if (!this.f36045a.equals(ue1.f36045a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!ue1.mo45570g()) {
            ue1 g = this.f36045a.mo44968g();
            int h = this.f36045a.mo44969h(ue1.mo45567d(ue1.mo45569f()));
            ue1 ue12 = this;
            while (ue12.mo45569f() >= ue1.mo45569f() && !ue12.mo45570g()) {
                int f = ue12.mo45569f() - ue1.mo45569f();
                int j = this.f36045a.mo44971j(ue12.mo45567d(ue12.mo45569f()), h);
                ue1 j2 = ue1.mo45573j(f, j);
                g = g.mo45564a(this.f36045a.mo44963b(f, j));
                ue12 = ue12.mo45564a(j2);
            }
            return new ue1[]{g, ue12};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* renamed from: c */
    public int mo45566c(int i) {
        if (i == 0) {
            return mo45567d(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f36046a) {
                i2 = te1.m65582a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f36046a;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            i3 = te1.m65582a(this.f36045a.mo44971j(i, i3), this.f36046a[i4]);
        }
        return i3;
    }

    /* renamed from: d */
    public int mo45567d(int i) {
        int[] iArr = this.f36046a;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: e */
    public int[] mo45568e() {
        return this.f36046a;
    }

    /* renamed from: f */
    public int mo45569f() {
        return this.f36046a.length - 1;
    }

    /* renamed from: g */
    public boolean mo45570g() {
        return this.f36046a[0] == 0;
    }

    /* renamed from: h */
    public ue1 mo45571h(int i) {
        if (i == 0) {
            return this.f36045a.mo44968g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f36046a.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f36045a.mo44971j(this.f36046a[i2], i);
        }
        return new ue1(this.f36045a, iArr);
    }

    /* renamed from: i */
    public ue1 mo45572i(ue1 ue1) {
        if (!this.f36045a.equals(ue1.f36045a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo45570g() || ue1.mo45570g()) {
            return this.f36045a.mo44968g();
        } else {
            int[] iArr = this.f36046a;
            int length = iArr.length;
            int[] iArr2 = ue1.f36046a;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = te1.m65582a(iArr3[i4], this.f36045a.mo44971j(i2, iArr2[i3]));
                }
            }
            return new ue1(this.f36045a, iArr3);
        }
    }

    /* renamed from: j */
    public ue1 mo45573j(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f36045a.mo44968g();
        } else {
            int length = this.f36046a.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f36045a.mo44971j(this.f36046a[i3], i2);
            }
            return new ue1(this.f36045a, iArr);
        }
    }

    public String toString() {
        char c;
        if (mo45570g()) {
            return qa0.f34045b;
        }
        StringBuilder sb = new StringBuilder(mo45569f() * 8);
        int f = mo45569f();
        while (f >= 0) {
            int d = mo45567d(f);
            if (d != 0) {
                if (d < 0) {
                    sb.append(f == mo45569f() ? "-" : " - ");
                    d = -d;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (f == 0 || d != 1) {
                    int i = this.f36045a.mo44970i(d);
                    if (i == 0) {
                        c = '1';
                    } else if (i == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                    sb.append(c);
                }
                if (f != 0) {
                    if (f == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(f);
                    }
                }
            }
            f--;
        }
        return sb.toString();
    }
}

package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.fy */
public final class C2208fy<E> {

    /* renamed from: a */
    public int f12381a;

    /* renamed from: a */
    public E[] f12382a;

    /* renamed from: b */
    public int f12383b;

    /* renamed from: c */
    public int f12384c;

    public C2208fy() {
        this(8);
    }

    public C2208fy(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.f12384c = i - 1;
            this.f12382a = new Object[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    /* renamed from: a */
    public void mo16220a(E e) {
        int i = (this.f12381a - 1) & this.f12384c;
        this.f12381a = i;
        this.f12382a[i] = e;
        if (i == this.f12383b) {
            mo16223d();
        }
    }

    /* renamed from: b */
    public void mo16221b(E e) {
        E[] eArr = this.f12382a;
        int i = this.f12383b;
        eArr[i] = e;
        int i2 = this.f12384c & (i + 1);
        this.f12383b = i2;
        if (i2 == this.f12381a) {
            mo16223d();
        }
    }

    /* renamed from: c */
    public void mo16222c() {
        mo16231l(mo16232m());
    }

    /* renamed from: d */
    public final void mo16223d() {
        E[] eArr = this.f12382a;
        int length = eArr.length;
        int i = this.f12381a;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            E[] eArr2 = new Object[i3];
            System.arraycopy(eArr, i, eArr2, 0, i2);
            System.arraycopy(this.f12382a, 0, eArr2, i2, this.f12381a);
            this.f12382a = eArr2;
            this.f12381a = 0;
            this.f12383b = length;
            this.f12384c = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: e */
    public E mo16224e(int i) {
        if (i < 0 || i >= mo16232m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f12382a[this.f12384c & (this.f12381a + i)];
    }

    /* renamed from: f */
    public E mo16225f() {
        int i = this.f12381a;
        if (i != this.f12383b) {
            return this.f12382a[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: g */
    public E mo16226g() {
        int i = this.f12381a;
        int i2 = this.f12383b;
        if (i != i2) {
            return this.f12382a[(i2 - 1) & this.f12384c];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: h */
    public boolean mo16227h() {
        return this.f12381a == this.f12383b;
    }

    /* renamed from: i */
    public E mo16228i() {
        int i = this.f12381a;
        if (i != this.f12383b) {
            E[] eArr = this.f12382a;
            E e = eArr[i];
            eArr[i] = null;
            this.f12381a = (i + 1) & this.f12384c;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: j */
    public E mo16229j() {
        int i = this.f12381a;
        int i2 = this.f12383b;
        if (i != i2) {
            int i3 = this.f12384c & (i2 - 1);
            E[] eArr = this.f12382a;
            E e = eArr[i3];
            eArr[i3] = null;
            this.f12383b = i3;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: k */
    public void mo16230k(int i) {
        int i2;
        if (i > 0) {
            if (i <= mo16232m()) {
                int i3 = 0;
                int i4 = this.f12383b;
                if (i < i4) {
                    i3 = i4 - i;
                }
                int i5 = i3;
                while (true) {
                    i2 = this.f12383b;
                    if (i5 >= i2) {
                        break;
                    }
                    this.f12382a[i5] = null;
                    i5++;
                }
                int i6 = i2 - i3;
                int i7 = i - i6;
                this.f12383b = i2 - i6;
                if (i7 > 0) {
                    int length = this.f12382a.length;
                    this.f12383b = length;
                    int i8 = length - i7;
                    for (int i9 = i8; i9 < this.f12383b; i9++) {
                        this.f12382a[i9] = null;
                    }
                    this.f12383b = i8;
                    return;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: l */
    public void mo16231l(int i) {
        if (i > 0) {
            if (i <= mo16232m()) {
                int length = this.f12382a.length;
                int i2 = this.f12381a;
                if (i < length - i2) {
                    length = i2 + i;
                }
                while (i2 < length) {
                    this.f12382a[i2] = null;
                    i2++;
                }
                int i3 = this.f12381a;
                int i4 = length - i3;
                int i5 = i - i4;
                this.f12381a = this.f12384c & (i3 + i4);
                if (i5 > 0) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        this.f12382a[i6] = null;
                    }
                    this.f12381a = i5;
                    return;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: m */
    public int mo16232m() {
        return (this.f12383b - this.f12381a) & this.f12384c;
    }
}

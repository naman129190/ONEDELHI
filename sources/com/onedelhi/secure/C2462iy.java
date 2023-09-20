package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.iy */
public final class C2462iy {

    /* renamed from: a */
    public int f13900a;

    /* renamed from: a */
    public int[] f13901a;

    /* renamed from: b */
    public int f13902b;

    /* renamed from: c */
    public int f13903c;

    public C2462iy() {
        this(8);
    }

    public C2462iy(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.f13903c = i - 1;
            this.f13901a = new int[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    /* renamed from: a */
    public void mo18000a(int i) {
        int i2 = (this.f13900a - 1) & this.f13903c;
        this.f13900a = i2;
        this.f13901a[i2] = i;
        if (i2 == this.f13902b) {
            mo18003d();
        }
    }

    /* renamed from: b */
    public void mo18001b(int i) {
        int[] iArr = this.f13901a;
        int i2 = this.f13902b;
        iArr[i2] = i;
        int i3 = this.f13903c & (i2 + 1);
        this.f13902b = i3;
        if (i3 == this.f13900a) {
            mo18003d();
        }
    }

    /* renamed from: c */
    public void mo18002c() {
        this.f13902b = this.f13900a;
    }

    /* renamed from: d */
    public final void mo18003d() {
        int[] iArr = this.f13901a;
        int length = iArr.length;
        int i = this.f13900a;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            int[] iArr2 = new int[i3];
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f13901a, 0, iArr2, i2, this.f13900a);
            this.f13901a = iArr2;
            this.f13900a = 0;
            this.f13902b = length;
            this.f13903c = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: e */
    public int mo18004e(int i) {
        if (i < 0 || i >= mo18012m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f13901a[this.f13903c & (this.f13900a + i)];
    }

    /* renamed from: f */
    public int mo18005f() {
        int i = this.f13900a;
        if (i != this.f13902b) {
            return this.f13901a[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int mo18006g() {
        int i = this.f13900a;
        int i2 = this.f13902b;
        if (i != i2) {
            return this.f13901a[(i2 - 1) & this.f13903c];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: h */
    public boolean mo18007h() {
        return this.f13900a == this.f13902b;
    }

    /* renamed from: i */
    public int mo18008i() {
        int i = this.f13900a;
        if (i != this.f13902b) {
            int i2 = this.f13901a[i];
            this.f13900a = (i + 1) & this.f13903c;
            return i2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: j */
    public int mo18009j() {
        int i = this.f13900a;
        int i2 = this.f13902b;
        if (i != i2) {
            int i3 = this.f13903c & (i2 - 1);
            int i4 = this.f13901a[i3];
            this.f13902b = i3;
            return i4;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: k */
    public void mo18010k(int i) {
        if (i > 0) {
            if (i <= mo18012m()) {
                this.f13902b = this.f13903c & (this.f13902b - i);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: l */
    public void mo18011l(int i) {
        if (i > 0) {
            if (i <= mo18012m()) {
                this.f13900a = this.f13903c & (this.f13900a + i);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: m */
    public int mo18012m() {
        return (this.f13902b - this.f13900a) & this.f13903c;
    }
}

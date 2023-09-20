package com.onedelhi.secure;

public final class ck2 {

    /* renamed from: a */
    public static final ck2 f26875a = new ck2(kx2.f31484a, 3);

    /* renamed from: a */
    public final int f26876a;

    /* renamed from: a */
    public final dk2 f26877a;

    /* renamed from: a */
    public final int[] f26878a;

    /* renamed from: b */
    public final dk2 f26879b;

    /* renamed from: b */
    public final int[] f26880b;

    public ck2(int i, int i2) {
        this.f26876a = i;
        this.f26878a = new int[i];
        this.f26880b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f26878a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f26880b[this.f26878a[i5]] = i5;
        }
        this.f26877a = new dk2(this, new int[]{0});
        this.f26879b = new dk2(this, new int[]{1});
    }

    /* renamed from: a */
    public int mo33768a(int i, int i2) {
        return (i + i2) % this.f26876a;
    }

    /* renamed from: b */
    public dk2 mo33769b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f26877a;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new dk2(this, iArr);
        }
    }

    /* renamed from: c */
    public int mo33770c(int i) {
        return this.f26878a[i];
    }

    /* renamed from: d */
    public dk2 mo33771d() {
        return this.f26879b;
    }

    /* renamed from: e */
    public int mo33772e() {
        return this.f26876a;
    }

    /* renamed from: f */
    public dk2 mo33773f() {
        return this.f26877a;
    }

    /* renamed from: g */
    public int mo33774g(int i) {
        if (i != 0) {
            return this.f26878a[(this.f26876a - this.f26880b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: h */
    public int mo33775h(int i) {
        if (i != 0) {
            return this.f26880b[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public int mo33776i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f26878a;
        int[] iArr2 = this.f26880b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f26876a - 1)];
    }

    /* renamed from: j */
    public int mo33777j(int i, int i2) {
        int i3 = this.f26876a;
        return ((i + i3) - i2) % i3;
    }
}

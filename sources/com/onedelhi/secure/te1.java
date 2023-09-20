package com.onedelhi.secure;

public final class te1 {

    /* renamed from: a */
    public static final te1 f35525a = new te1(4201, 4096, 1);

    /* renamed from: b */
    public static final te1 f35526b = new te1(1033, 1024, 1);

    /* renamed from: c */
    public static final te1 f35527c;

    /* renamed from: d */
    public static final te1 f35528d = new te1(19, 16, 1);

    /* renamed from: e */
    public static final te1 f35529e = new te1(285, 256, 0);

    /* renamed from: f */
    public static final te1 f35530f;

    /* renamed from: g */
    public static final te1 f35531g;

    /* renamed from: h */
    public static final te1 f35532h;

    /* renamed from: a */
    public final int f35533a;

    /* renamed from: a */
    public final ue1 f35534a;

    /* renamed from: a */
    public final int[] f35535a;

    /* renamed from: b */
    public final int f35536b;

    /* renamed from: b */
    public final ue1 f35537b;

    /* renamed from: b */
    public final int[] f35538b;

    /* renamed from: c */
    public final int f35539c;

    static {
        te1 te1 = new te1(67, 64, 1);
        f35527c = te1;
        te1 te12 = new te1(301, 256, 1);
        f35530f = te12;
        f35531g = te12;
        f35532h = te1;
    }

    public te1(int i, int i2, int i3) {
        this.f35536b = i;
        this.f35533a = i2;
        this.f35539c = i3;
        this.f35535a = new int[i2];
        this.f35538b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f35535a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f35538b[this.f35535a[i6]] = i6;
        }
        this.f35534a = new ue1(this, new int[]{0});
        this.f35537b = new ue1(this, new int[]{1});
    }

    /* renamed from: a */
    public static int m65582a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: b */
    public ue1 mo44963b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f35534a;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new ue1(this, iArr);
        }
    }

    /* renamed from: c */
    public int mo44964c(int i) {
        return this.f35535a[i];
    }

    /* renamed from: d */
    public int mo44965d() {
        return this.f35539c;
    }

    /* renamed from: e */
    public ue1 mo44966e() {
        return this.f35537b;
    }

    /* renamed from: f */
    public int mo44967f() {
        return this.f35533a;
    }

    /* renamed from: g */
    public ue1 mo44968g() {
        return this.f35534a;
    }

    /* renamed from: h */
    public int mo44969h(int i) {
        if (i != 0) {
            return this.f35535a[(this.f35533a - this.f35538b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: i */
    public int mo44970i(int i) {
        if (i != 0) {
            return this.f35538b[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: j */
    public int mo44971j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f35535a;
        int[] iArr2 = this.f35538b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f35533a - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f35536b) + ',' + this.f35533a + ')';
    }
}

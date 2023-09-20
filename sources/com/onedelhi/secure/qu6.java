package com.onedelhi.secure;

import java.io.IOException;
import java.util.Arrays;

public final class qu6 {

    /* renamed from: a */
    public static final qu6 f19480a = new qu6(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f19481a;

    /* renamed from: a */
    public boolean f19482a;

    /* renamed from: a */
    public int[] f19483a;

    /* renamed from: a */
    public Object[] f19484a;

    /* renamed from: b */
    public int f19485b;

    public qu6() {
        this(0, new int[8], new Object[8], true);
    }

    public qu6(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f19485b = -1;
        this.f19481a = i;
        this.f19483a = iArr;
        this.f19484a = objArr;
        this.f19482a = z;
    }

    /* renamed from: c */
    public static qu6 m26175c() {
        return f19480a;
    }

    /* renamed from: e */
    public static qu6 m26176e(qu6 qu6, qu6 qu62) {
        int i = qu6.f19481a + qu62.f19481a;
        int[] copyOf = Arrays.copyOf(qu6.f19483a, i);
        System.arraycopy(qu62.f19483a, 0, copyOf, qu6.f19481a, qu62.f19481a);
        Object[] copyOf2 = Arrays.copyOf(qu6.f19484a, i);
        System.arraycopy(qu62.f19484a, 0, copyOf2, qu6.f19481a, qu62.f19481a);
        return new qu6(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static qu6 m26177f() {
        return new qu6(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo23446a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f19485b;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f19481a; i6++) {
            int i7 = this.f19483a[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f19484a[i6]).longValue();
                    i = eo6.m13910y(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int i10 = eo6.f11310a;
                    int f = ((on6) this.f19484a[i6]).mo18486f();
                    i = eo6.m13910y(i8 << 3) + eo6.m13910y(f) + f;
                } else if (i9 == 3) {
                    int i11 = i8 << 3;
                    int i12 = eo6.f11310a;
                    i2 = ((qu6) this.f19484a[i6]).mo23446a();
                    int y = eo6.m13910y(i11);
                    i3 = y + y;
                } else if (i9 == 5) {
                    ((Integer) this.f19484a[i6]).intValue();
                    i = eo6.m13910y(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(dr6.m13272a());
                }
                i5 += i;
            } else {
                int i13 = i8 << 3;
                i2 = eo6.m13911z(((Long) this.f19484a[i6]).longValue());
                i3 = eo6.m13910y(i13);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f19485b = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo23447b() {
        int i = this.f19485b;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f19481a; i3++) {
            int i4 = eo6.f11310a;
            int f = ((on6) this.f19484a[i3]).mo18486f();
            int y = eo6.m13910y(f) + f;
            int y2 = eo6.m13910y(16);
            int y3 = eo6.m13910y(this.f19483a[i3] >>> 3);
            int y4 = eo6.m13910y(8);
            i2 += y4 + y4 + y2 + y3 + eo6.m13910y(24) + y;
        }
        this.f19485b = i2;
        return i2;
    }

    /* renamed from: d */
    public final qu6 mo23448d(qu6 qu6) {
        if (qu6.equals(f19480a)) {
            return this;
        }
        mo23450g();
        int i = this.f19481a + qu6.f19481a;
        mo23456l(i);
        System.arraycopy(qu6.f19483a, 0, this.f19483a, this.f19481a, qu6.f19481a);
        System.arraycopy(qu6.f19484a, 0, this.f19484a, this.f19481a, qu6.f19481a);
        this.f19481a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qu6)) {
            return false;
        }
        qu6 qu6 = (qu6) obj;
        int i = this.f19481a;
        if (i == qu6.f19481a) {
            int[] iArr = this.f19483a;
            int[] iArr2 = qu6.f19483a;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f19484a;
                    Object[] objArr2 = qu6.f19484a;
                    int i3 = this.f19481a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo23450g() {
        if (!this.f19482a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void mo23451h() {
        if (this.f19482a) {
            this.f19482a = false;
        }
    }

    public final int hashCode() {
        int i = this.f19481a;
        int i2 = i + 527;
        int[] iArr = this.f19483a;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.f19484a;
        int i7 = this.f19481a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    /* renamed from: i */
    public final void mo23453i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f19481a; i2++) {
            xs6.m31716b(sb, i, String.valueOf(this.f19483a[i2] >>> 3), this.f19484a[i2]);
        }
    }

    /* renamed from: j */
    public final void mo23454j(int i, Object obj) {
        mo23450g();
        mo23456l(this.f19481a + 1);
        int[] iArr = this.f19483a;
        int i2 = this.f19481a;
        iArr[i2] = i;
        this.f19484a[i2] = obj;
        this.f19481a = i2 + 1;
    }

    /* renamed from: k */
    public final void mo23455k(yv6 yv6) throws IOException {
        if (this.f19481a != 0) {
            for (int i = 0; i < this.f19481a; i++) {
                int i2 = this.f19483a[i];
                Object obj = this.f19484a[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    yv6.mo16792u(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    yv6.mo16794w(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    yv6.mo16766E(i4, (on6) obj);
                } else if (i3 == 3) {
                    yv6.mo16775d(i4);
                    ((qu6) obj).mo23455k(yv6);
                    yv6.mo16780i(i4);
                } else if (i3 == 5) {
                    yv6.mo16764C(i4, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(dr6.m13272a());
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo23456l(int i) {
        int[] iArr = this.f19483a;
        if (i > iArr.length) {
            int i2 = this.f19481a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f19483a = Arrays.copyOf(iArr, i);
            this.f19484a = Arrays.copyOf(this.f19484a, i);
        }
    }
}

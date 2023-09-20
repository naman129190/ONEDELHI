package com.onedelhi.secure;

import java.util.Arrays;

public final class od6 {

    /* renamed from: a */
    public static final od6 f17920a = new od6(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f17921a;

    /* renamed from: a */
    public boolean f17922a;

    /* renamed from: a */
    public int[] f17923a;

    /* renamed from: a */
    public Object[] f17924a;

    public od6() {
        this(0, new int[8], new Object[8], true);
    }

    public od6(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f17921a = i;
        this.f17923a = iArr;
        this.f17924a = objArr;
        this.f17922a = z;
    }

    /* renamed from: a */
    public static od6 m23709a() {
        return f17920a;
    }

    /* renamed from: b */
    public static od6 m23710b(od6 od6, od6 od62) {
        int i = od6.f17921a + od62.f17921a;
        int[] copyOf = Arrays.copyOf(od6.f17923a, i);
        System.arraycopy(od62.f17923a, 0, copyOf, od6.f17921a, od62.f17921a);
        Object[] copyOf2 = Arrays.copyOf(od6.f17924a, i);
        System.arraycopy(od62.f17924a, 0, copyOf2, od6.f17921a, od62.f17921a);
        return new od6(i, copyOf, copyOf2, true);
    }

    /* renamed from: c */
    public static od6 m23711c() {
        return new od6(0, new int[8], new Object[8], true);
    }

    /* renamed from: d */
    public final void mo21898d() {
        this.f17922a = false;
    }

    /* renamed from: e */
    public final void mo21899e(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f17921a; i2++) {
            o96.m23617b(sb, i, String.valueOf(this.f17923a[i2] >>> 3), this.f17924a[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof od6)) {
            return false;
        }
        od6 od6 = (od6) obj;
        int i = this.f17921a;
        if (i == od6.f17921a) {
            int[] iArr = this.f17923a;
            int[] iArr2 = od6.f17923a;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f17924a;
                    Object[] objArr2 = od6.f17924a;
                    int i3 = this.f17921a;
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

    /* renamed from: f */
    public final void mo21901f(int i, Object obj) {
        if (this.f17922a) {
            int i2 = this.f17921a;
            int[] iArr = this.f17923a;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f17923a = Arrays.copyOf(iArr, i3);
                this.f17924a = Arrays.copyOf(this.f17924a, i3);
            }
            int[] iArr2 = this.f17923a;
            int i4 = this.f17921a;
            iArr2[i4] = i;
            this.f17924a[i4] = obj;
            this.f17921a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f17921a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f17923a;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f17924a;
        int i7 = this.f17921a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}

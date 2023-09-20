package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class lq6 extends rl6 implements RandomAccess, tq6, ct6 {

    /* renamed from: a */
    public static final lq6 f15534a = new lq6(new int[0], 0, false);

    /* renamed from: a */
    public int[] f15535a;

    /* renamed from: n */
    public int f15536n;

    public lq6() {
        this(new int[10], 0, true);
    }

    public lq6(int[] iArr, int i, boolean z) {
        super(z);
        this.f15535a = iArr;
        this.f15536n = i;
    }

    /* renamed from: f */
    public static lq6 m20908f() {
        return f15534a;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo23935b();
        if (i < 0 || i > (i2 = this.f15536n)) {
            throw new IndexOutOfBoundsException(mo19760i(i));
        }
        int[] iArr = this.f15535a;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f15535a, i, iArr2, i + 1, this.f15536n - i);
            this.f15535a = iArr2;
        }
        this.f15535a[i] = intValue;
        this.f15536n++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo19758g(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo23935b();
        byte[] bArr = zq6.f23858a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof lq6)) {
            return super.addAll(collection);
        }
        lq6 lq6 = (lq6) collection;
        int i = lq6.f15536n;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15536n;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f15535a;
            if (i3 > iArr.length) {
                this.f15535a = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(lq6.f15535a, 0, this.f15535a, this.f15536n, lq6.f15536n);
            this.f15536n = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c1 */
    public final tq6 mo14324d2(int i) {
        if (i >= this.f15536n) {
            return new lq6(Arrays.copyOf(this.f15535a, i), this.f15536n, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final int mo19757e(int i) {
        mo19762j(i);
        return this.f15535a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq6)) {
            return super.equals(obj);
        }
        lq6 lq6 = (lq6) obj;
        if (this.f15536n != lq6.f15536n) {
            return false;
        }
        int[] iArr = lq6.f15535a;
        for (int i = 0; i < this.f15536n; i++) {
            if (this.f15535a[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void mo19758g(int i) {
        mo23935b();
        int i2 = this.f15536n;
        int[] iArr = this.f15535a;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f15535a = iArr2;
        }
        int[] iArr3 = this.f15535a;
        int i3 = this.f15536n;
        this.f15536n = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ Object get(int i) {
        mo19762j(i);
        return Integer.valueOf(this.f15535a[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15536n; i2++) {
            i = (i * 31) + this.f15535a[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final String mo19760i(int i) {
        int i2 = this.f15536n;
        return "Index:" + i + ", Size:" + i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f15536n;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15535a[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo19762j(int i) {
        if (i < 0 || i >= this.f15536n) {
            throw new IndexOutOfBoundsException(mo19760i(i));
        }
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo23935b();
        mo19762j(i);
        int[] iArr = this.f15535a;
        int i2 = iArr[i];
        int i3 = this.f15536n;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f15536n--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo23935b();
        if (i2 >= i) {
            int[] iArr = this.f15535a;
            System.arraycopy(iArr, i2, iArr, i, this.f15536n - i2);
            this.f15536n -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo23935b();
        mo19762j(i);
        int[] iArr = this.f15535a;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f15536n;
    }
}

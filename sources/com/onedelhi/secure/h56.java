package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class h56 extends m06 implements RandomAccess, q56, ab6 {

    /* renamed from: a */
    public static final h56 f12916a;

    /* renamed from: a */
    public int[] f12917a;

    /* renamed from: n */
    public int f12918n;

    static {
        h56 h56 = new h56(new int[0], 0);
        f12916a = h56;
        h56.mo19980a();
    }

    public h56() {
        this(new int[10], 0);
    }

    public h56(int[] iArr, int i) {
        this.f12917a = iArr;
        this.f12918n = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo19981b();
        if (i < 0 || i > (i2 = this.f12918n)) {
            throw new IndexOutOfBoundsException(mo17068f(i));
        }
        int[] iArr = this.f12917a;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f12917a, i, iArr2, i + 1, this.f12918n - i);
            this.f12917a = iArr2;
        }
        this.f12917a[i] = intValue;
        this.f12918n++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo17067e(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo19981b();
        t56.m28113e(collection);
        if (!(collection instanceof h56)) {
            return super.addAll(collection);
        }
        h56 h56 = (h56) collection;
        int i = h56.f12918n;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12918n;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f12917a;
            if (i3 > iArr.length) {
                this.f12917a = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(h56.f12917a, 0, this.f12917a, this.f12918n, h56.f12918n);
            this.f12918n = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo17067e(int i) {
        mo19981b();
        int i2 = this.f12918n;
        int[] iArr = this.f12917a;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f12917a = iArr2;
        }
        int[] iArr3 = this.f12917a;
        int i3 = this.f12918n;
        this.f12918n = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h56)) {
            return super.equals(obj);
        }
        h56 h56 = (h56) obj;
        if (this.f12918n != h56.f12918n) {
            return false;
        }
        int[] iArr = h56.f12917a;
        for (int i = 0; i < this.f12918n; i++) {
            if (this.f12917a[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo17068f(int i) {
        int i2 = this.f12918n;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: g */
    public final void mo17069g(int i) {
        if (i < 0 || i >= this.f12918n) {
            throw new IndexOutOfBoundsException(mo17068f(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo17069g(i);
        return Integer.valueOf(this.f12917a[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12918n; i2++) {
            i = (i * 31) + this.f12917a[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f12918n;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f12917a[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo19981b();
        mo17069g(i);
        int[] iArr = this.f12917a;
        int i2 = iArr[i];
        int i3 = this.f12918n;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f12918n--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        mo19981b();
        if (i2 >= i) {
            int[] iArr = this.f12917a;
            System.arraycopy(iArr, i2, iArr, i, this.f12918n - i2);
            this.f12918n -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo19981b();
        mo17069g(i);
        int[] iArr = this.f12917a;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f12918n;
    }

    /* renamed from: z1 */
    public final /* bridge */ /* synthetic */ q56 mo12861z1(int i) {
        if (i >= this.f12918n) {
            return new h56(Arrays.copyOf(this.f12917a, i), this.f12918n);
        }
        throw new IllegalArgumentException();
    }
}

package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class c16 extends m06 implements RandomAccess, q56, ab6 {

    /* renamed from: a */
    public static final c16 f10079a;

    /* renamed from: a */
    public boolean[] f10080a;

    /* renamed from: n */
    public int f10081n;

    static {
        c16 c16 = new c16(new boolean[0], 0);
        f10079a = c16;
        c16.mo19980a();
    }

    public c16() {
        this(new boolean[10], 0);
    }

    public c16(boolean[] zArr, int i) {
        this.f10080a = zArr;
        this.f10081n = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo19981b();
        if (i < 0 || i > (i2 = this.f10081n)) {
            throw new IndexOutOfBoundsException(mo13896f(i));
        }
        boolean[] zArr = this.f10080a;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f10080a, i, zArr2, i + 1, this.f10081n - i);
            this.f10080a = zArr2;
        }
        this.f10080a[i] = booleanValue;
        this.f10081n++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13895e(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo19981b();
        t56.m28113e(collection);
        if (!(collection instanceof c16)) {
            return super.addAll(collection);
        }
        c16 c16 = (c16) collection;
        int i = c16.f10081n;
        if (i == 0) {
            return false;
        }
        int i2 = this.f10081n;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f10080a;
            if (i3 > zArr.length) {
                this.f10080a = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c16.f10080a, 0, this.f10080a, this.f10081n, c16.f10081n);
            this.f10081n = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo13895e(boolean z) {
        mo19981b();
        int i = this.f10081n;
        boolean[] zArr = this.f10080a;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f10080a = zArr2;
        }
        boolean[] zArr3 = this.f10080a;
        int i2 = this.f10081n;
        this.f10081n = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c16)) {
            return super.equals(obj);
        }
        c16 c16 = (c16) obj;
        if (this.f10081n != c16.f10081n) {
            return false;
        }
        boolean[] zArr = c16.f10080a;
        for (int i = 0; i < this.f10081n; i++) {
            if (this.f10080a[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo13896f(int i) {
        int i2 = this.f10081n;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: g */
    public final void mo13897g(int i) {
        if (i < 0 || i >= this.f10081n) {
            throw new IndexOutOfBoundsException(mo13896f(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo13897g(i);
        return Boolean.valueOf(this.f10080a[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10081n; i2++) {
            i = (i * 31) + t56.m28109a(this.f10080a[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f10081n;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f10080a[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo19981b();
        mo13897g(i);
        boolean[] zArr = this.f10080a;
        boolean z = zArr[i];
        int i2 = this.f10081n;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f10081n--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo19981b();
        if (i2 >= i) {
            boolean[] zArr = this.f10080a;
            System.arraycopy(zArr, i2, zArr, i, this.f10081n - i2);
            this.f10081n -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo19981b();
        mo13897g(i);
        boolean[] zArr = this.f10080a;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f10081n;
    }

    /* renamed from: z1 */
    public final /* bridge */ /* synthetic */ q56 mo12861z1(int i) {
        if (i >= this.f10081n) {
            return new c16(Arrays.copyOf(this.f10080a, i), this.f10081n);
        }
        throw new IllegalArgumentException();
    }
}

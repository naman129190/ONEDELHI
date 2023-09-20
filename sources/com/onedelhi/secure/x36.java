package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class x36 extends m06 implements RandomAccess, q56, ab6 {

    /* renamed from: a */
    public static final x36 f22404a;

    /* renamed from: a */
    public double[] f22405a;

    /* renamed from: n */
    public int f22406n;

    static {
        x36 x36 = new x36(new double[0], 0);
        f22404a = x36;
        x36.mo19980a();
    }

    public x36() {
        this(new double[10], 0);
    }

    public x36(double[] dArr, int i) {
        this.f22405a = dArr;
        this.f22406n = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo19981b();
        if (i < 0 || i > (i2 = this.f22406n)) {
            throw new IndexOutOfBoundsException(mo26766f(i));
        }
        double[] dArr = this.f22405a;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f22405a, i, dArr2, i + 1, this.f22406n - i);
            this.f22405a = dArr2;
        }
        this.f22405a[i] = doubleValue;
        this.f22406n++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo26765e(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo19981b();
        t56.m28113e(collection);
        if (!(collection instanceof x36)) {
            return super.addAll(collection);
        }
        x36 x36 = (x36) collection;
        int i = x36.f22406n;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22406n;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f22405a;
            if (i3 > dArr.length) {
                this.f22405a = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(x36.f22405a, 0, this.f22405a, this.f22406n, x36.f22406n);
            this.f22406n = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo26765e(double d) {
        mo19981b();
        int i = this.f22406n;
        double[] dArr = this.f22405a;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f22405a = dArr2;
        }
        double[] dArr3 = this.f22405a;
        int i2 = this.f22406n;
        this.f22406n = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x36)) {
            return super.equals(obj);
        }
        x36 x36 = (x36) obj;
        if (this.f22406n != x36.f22406n) {
            return false;
        }
        double[] dArr = x36.f22405a;
        for (int i = 0; i < this.f22406n; i++) {
            if (Double.doubleToLongBits(this.f22405a[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo26766f(int i) {
        int i2 = this.f22406n;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: g */
    public final void mo26767g(int i) {
        if (i < 0 || i >= this.f22406n) {
            throw new IndexOutOfBoundsException(mo26766f(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo26767g(i);
        return Double.valueOf(this.f22405a[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22406n; i2++) {
            i = (i * 31) + t56.m28111c(Double.doubleToLongBits(this.f22405a[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f22406n;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f22405a[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo19981b();
        mo26767g(i);
        double[] dArr = this.f22405a;
        double d = dArr[i];
        int i2 = this.f22406n;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f22406n--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo19981b();
        if (i2 >= i) {
            double[] dArr = this.f22405a;
            System.arraycopy(dArr, i2, dArr, i, this.f22406n - i2);
            this.f22406n -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo19981b();
        mo26767g(i);
        double[] dArr = this.f22405a;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f22406n;
    }

    /* renamed from: z1 */
    public final /* bridge */ /* synthetic */ q56 mo12861z1(int i) {
        if (i >= this.f22406n) {
            return new x36(Arrays.copyOf(this.f22405a, i), this.f22406n);
        }
        throw new IllegalArgumentException();
    }
}

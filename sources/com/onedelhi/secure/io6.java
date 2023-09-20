package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class io6 extends rl6 implements RandomAccess, xq6, ct6 {

    /* renamed from: a */
    public static final io6 f13789a = new io6(new double[0], 0, false);

    /* renamed from: a */
    public double[] f13790a;

    /* renamed from: n */
    public int f13791n;

    public io6() {
        this(new double[10], 0, true);
    }

    public io6(double[] dArr, int i, boolean z) {
        super(z);
        this.f13790a = dArr;
        this.f13791n = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo23935b();
        if (i < 0 || i > (i2 = this.f13791n)) {
            throw new IndexOutOfBoundsException(mo17903f(i));
        }
        double[] dArr = this.f13790a;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f13790a, i, dArr2, i + 1, this.f13791n - i);
            this.f13790a = dArr2;
        }
        this.f13790a[i] = doubleValue;
        this.f13791n++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo17902e(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo23935b();
        byte[] bArr = zq6.f23858a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof io6)) {
            return super.addAll(collection);
        }
        io6 io6 = (io6) collection;
        int i = io6.f13791n;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13791n;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f13790a;
            if (i3 > dArr.length) {
                this.f13790a = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(io6.f13790a, 0, this.f13790a, this.f13791n, io6.f13791n);
            this.f13791n = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d2 */
    public final /* bridge */ /* synthetic */ xq6 mo14324d2(int i) {
        if (i >= this.f13791n) {
            return new io6(Arrays.copyOf(this.f13790a, i), this.f13791n, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void mo17902e(double d) {
        mo23935b();
        int i = this.f13791n;
        double[] dArr = this.f13790a;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f13790a = dArr2;
        }
        double[] dArr3 = this.f13790a;
        int i2 = this.f13791n;
        this.f13791n = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io6)) {
            return super.equals(obj);
        }
        io6 io6 = (io6) obj;
        if (this.f13791n != io6.f13791n) {
            return false;
        }
        double[] dArr = io6.f13790a;
        for (int i = 0; i < this.f13791n; i++) {
            if (Double.doubleToLongBits(this.f13790a[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo17903f(int i) {
        int i2 = this.f13791n;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: g */
    public final void mo17904g(int i) {
        if (i < 0 || i >= this.f13791n) {
            throw new IndexOutOfBoundsException(mo17903f(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo17904g(i);
        return Double.valueOf(this.f13790a[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13791n; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.f13790a[i2]);
            byte[] bArr = zq6.f23858a;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f13791n;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13790a[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo23935b();
        mo17904g(i);
        double[] dArr = this.f13790a;
        double d = dArr[i];
        int i2 = this.f13791n;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f13791n--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i, int i2) {
        mo23935b();
        if (i2 >= i) {
            double[] dArr = this.f13790a;
            System.arraycopy(dArr, i2, dArr, i, this.f13791n - i2);
            this.f13791n -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo23935b();
        mo17904g(i);
        double[] dArr = this.f13790a;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f13791n;
    }
}

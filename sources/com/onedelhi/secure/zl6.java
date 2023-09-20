package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class zl6 extends rl6 implements RandomAccess, xq6, ct6 {

    /* renamed from: a */
    public static final zl6 f23815a = new zl6(new boolean[0], 0, false);

    /* renamed from: a */
    public boolean[] f23816a;

    /* renamed from: n */
    public int f23817n;

    public zl6() {
        this(new boolean[10], 0, true);
    }

    public zl6(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f23816a = zArr;
        this.f23817n = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo23935b();
        if (i < 0 || i > (i2 = this.f23817n)) {
            throw new IndexOutOfBoundsException(mo28042f(i));
        }
        boolean[] zArr = this.f23816a;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f23816a, i, zArr2, i + 1, this.f23817n - i);
            this.f23816a = zArr2;
        }
        this.f23816a[i] = booleanValue;
        this.f23817n++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo28041e(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo23935b();
        byte[] bArr = zq6.f23858a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zl6)) {
            return super.addAll(collection);
        }
        zl6 zl6 = (zl6) collection;
        int i = zl6.f23817n;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23817n;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f23816a;
            if (i3 > zArr.length) {
                this.f23816a = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zl6.f23816a, 0, this.f23816a, this.f23817n, zl6.f23817n);
            this.f23817n = i3;
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
        if (i >= this.f23817n) {
            return new zl6(Arrays.copyOf(this.f23816a, i), this.f23817n, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void mo28041e(boolean z) {
        mo23935b();
        int i = this.f23817n;
        boolean[] zArr = this.f23816a;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f23816a = zArr2;
        }
        boolean[] zArr3 = this.f23816a;
        int i2 = this.f23817n;
        this.f23817n = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl6)) {
            return super.equals(obj);
        }
        zl6 zl6 = (zl6) obj;
        if (this.f23817n != zl6.f23817n) {
            return false;
        }
        boolean[] zArr = zl6.f23816a;
        for (int i = 0; i < this.f23817n; i++) {
            if (this.f23816a[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo28042f(int i) {
        int i2 = this.f23817n;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: g */
    public final void mo28043g(int i) {
        if (i < 0 || i >= this.f23817n) {
            throw new IndexOutOfBoundsException(mo28042f(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo28043g(i);
        return Boolean.valueOf(this.f23816a[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f23817n; i2++) {
            i = (i * 31) + zq6.m33322a(this.f23816a[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f23817n;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f23816a[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo23935b();
        mo28043g(i);
        boolean[] zArr = this.f23816a;
        boolean z = zArr[i];
        int i2 = this.f23817n;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f23817n--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i, int i2) {
        mo23935b();
        if (i2 >= i) {
            boolean[] zArr = this.f23816a;
            System.arraycopy(zArr, i2, zArr, i, this.f23817n - i2);
            this.f23817n -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo23935b();
        mo28043g(i);
        boolean[] zArr = this.f23816a;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f23817n;
    }
}

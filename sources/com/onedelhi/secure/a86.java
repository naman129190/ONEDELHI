package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class a86 extends m06 implements RandomAccess, q56, ab6 {

    /* renamed from: a */
    public static final a86 f8901a;

    /* renamed from: a */
    public long[] f8902a;

    /* renamed from: n */
    public int f8903n;

    static {
        a86 a86 = new a86(new long[0], 0);
        f8901a = a86;
        a86.mo19980a();
    }

    public a86() {
        this(new long[10], 0);
    }

    public a86(long[] jArr, int i) {
        this.f8902a = jArr;
        this.f8903n = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo19981b();
        if (i < 0 || i > (i2 = this.f8903n)) {
            throw new IndexOutOfBoundsException(mo12852f(i));
        }
        long[] jArr = this.f8902a;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f8902a, i, jArr2, i + 1, this.f8903n - i);
            this.f8902a = jArr2;
        }
        this.f8902a[i] = longValue;
        this.f8903n++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo12850e(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo19981b();
        t56.m28113e(collection);
        if (!(collection instanceof a86)) {
            return super.addAll(collection);
        }
        a86 a86 = (a86) collection;
        int i = a86.f8903n;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8903n;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f8902a;
            if (i3 > jArr.length) {
                this.f8902a = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(a86.f8902a, 0, this.f8902a, this.f8903n, a86.f8903n);
            this.f8903n = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo12850e(long j) {
        mo19981b();
        int i = this.f8903n;
        long[] jArr = this.f8902a;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f8902a = jArr2;
        }
        long[] jArr3 = this.f8902a;
        int i2 = this.f8903n;
        this.f8903n = i2 + 1;
        jArr3[i2] = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a86)) {
            return super.equals(obj);
        }
        a86 a86 = (a86) obj;
        if (this.f8903n != a86.f8903n) {
            return false;
        }
        long[] jArr = a86.f8902a;
        for (int i = 0; i < this.f8903n; i++) {
            if (this.f8902a[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo12852f(int i) {
        int i2 = this.f8903n;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: g */
    public final void mo12853g(int i) {
        if (i < 0 || i >= this.f8903n) {
            throw new IndexOutOfBoundsException(mo12852f(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo12853g(i);
        return Long.valueOf(this.f8902a[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8903n; i2++) {
            i = (i * 31) + t56.m28111c(this.f8902a[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f8903n;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f8902a[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo19981b();
        mo12853g(i);
        long[] jArr = this.f8902a;
        long j = jArr[i];
        int i2 = this.f8903n;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f8903n--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo19981b();
        if (i2 >= i) {
            long[] jArr = this.f8902a;
            System.arraycopy(jArr, i2, jArr, i, this.f8903n - i2);
            this.f8903n -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo19981b();
        mo12853g(i);
        long[] jArr = this.f8902a;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f8903n;
    }

    /* renamed from: z1 */
    public final /* bridge */ /* synthetic */ q56 mo12861z1(int i) {
        if (i >= this.f8903n) {
            return new a86(Arrays.copyOf(this.f8902a, i), this.f8903n);
        }
        throw new IllegalArgumentException();
    }
}

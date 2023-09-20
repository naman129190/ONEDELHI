package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class rr6 extends rl6 implements RandomAccess, vq6, ct6 {

    /* renamed from: a */
    public static final rr6 f20087a = new rr6(new long[0], 0, false);

    /* renamed from: a */
    public long[] f20088a;

    /* renamed from: n */
    public int f20089n;

    public rr6() {
        this(new long[10], 0, true);
    }

    public rr6(long[] jArr, int i, boolean z) {
        super(z);
        this.f20088a = jArr;
        this.f20089n = i;
    }

    /* renamed from: e */
    public static rr6 m27033e() {
        return f20087a;
    }

    /* renamed from: O0 */
    public final long mo24060O0(int i) {
        mo24065i(i);
        return this.f20088a[i];
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo23935b();
        if (i < 0 || i > (i2 = this.f20089n)) {
            throw new IndexOutOfBoundsException(mo24063g(i));
        }
        long[] jArr = this.f20088a;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f20088a, i, jArr2, i + 1, this.f20089n - i);
            this.f20088a = jArr2;
        }
        this.f20088a[i] = longValue;
        this.f20089n++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo24062f(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo23935b();
        byte[] bArr = zq6.f23858a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof rr6)) {
            return super.addAll(collection);
        }
        rr6 rr6 = (rr6) collection;
        int i = rr6.f20089n;
        if (i == 0) {
            return false;
        }
        int i2 = this.f20089n;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f20088a;
            if (i3 > jArr.length) {
                this.f20088a = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(rr6.f20088a, 0, this.f20088a, this.f20089n, rr6.f20089n);
            this.f20089n = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr6)) {
            return super.equals(obj);
        }
        rr6 rr6 = (rr6) obj;
        if (this.f20089n != rr6.f20089n) {
            return false;
        }
        long[] jArr = rr6.f20088a;
        for (int i = 0; i < this.f20089n; i++) {
            if (this.f20088a[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo24062f(long j) {
        mo23935b();
        int i = this.f20089n;
        long[] jArr = this.f20088a;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f20088a = jArr2;
        }
        long[] jArr3 = this.f20088a;
        int i2 = this.f20089n;
        this.f20089n = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: g */
    public final String mo24063g(int i) {
        int i2 = this.f20089n;
        return "Index:" + i + ", Size:" + i2;
    }

    public final /* synthetic */ Object get(int i) {
        mo24065i(i);
        return Long.valueOf(this.f20088a[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20089n; i2++) {
            long j = this.f20088a[i2];
            byte[] bArr = zq6.f23858a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    /* renamed from: i */
    public final void mo24065i(int i) {
        if (i < 0 || i >= this.f20089n) {
            throw new IndexOutOfBoundsException(mo24063g(i));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f20089n;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f20088a[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: j0 */
    public final vq6 mo14324d2(int i) {
        if (i >= this.f20089n) {
            return new rr6(Arrays.copyOf(this.f20088a, i), this.f20089n, true);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo23935b();
        mo24065i(i);
        long[] jArr = this.f20088a;
        long j = jArr[i];
        int i2 = this.f20089n;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f20089n--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final void removeRange(int i, int i2) {
        mo23935b();
        if (i2 >= i) {
            long[] jArr = this.f20088a;
            System.arraycopy(jArr, i2, jArr, i, this.f20089n - i2);
            this.f20089n -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo23935b();
        mo24065i(i);
        long[] jArr = this.f20088a;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f20089n;
    }
}

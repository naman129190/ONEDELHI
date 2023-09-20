package com.onedelhi.secure;

import com.onedelhi.secure.vs1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class v92 extends C5351g1<Long> implements vs1.C7088i, RandomAccess, x43 {

    /* renamed from: a */
    public static final v92 f36460a;

    /* renamed from: a */
    public long[] f36461a;

    /* renamed from: o */
    public int f36462o;

    static {
        v92 v92 = new v92(new long[0], 0);
        f36460a = v92;
        v92.mo36496Q0();
    }

    public v92() {
        this(new long[10], 0);
    }

    public v92(long[] jArr, int i) {
        this.f36461a = jArr;
        this.f36462o = i;
    }

    /* renamed from: i */
    public static v92 m67804i() {
        return f36460a;
    }

    /* renamed from: C2 */
    public vs1.C7088i mo31125H1(int i) {
        if (i >= this.f36462o) {
            return new v92(Arrays.copyOf(this.f36461a, i), this.f36462o);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: L1 */
    public void mo46036L1(long j) {
        mo36498b();
        int i = this.f36462o;
        long[] jArr = this.f36461a;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f36461a = jArr2;
        }
        long[] jArr3 = this.f36461a;
        int i2 = this.f36462o;
        this.f36462o = i2 + 1;
        jArr3[i2] = j;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo36498b();
        vs1.m68432d(collection);
        if (!(collection instanceof v92)) {
            return super.addAll(collection);
        }
        v92 v92 = (v92) collection;
        int i = v92.f36462o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f36462o;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f36461a;
            if (i3 > jArr.length) {
                this.f36461a = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(v92.f36461a, 0, this.f36461a, this.f36462o, v92.f36462o);
            this.f36462o = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c0 */
    public long mo46037c0(int i, long j) {
        mo36498b();
        mo46045j(i);
        long[] jArr = this.f36461a;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public void add(int i, Long l) {
        mo46041g(i, l.longValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v92)) {
            return super.equals(obj);
        }
        v92 v92 = (v92) obj;
        if (this.f36462o != v92.f36462o) {
            return false;
        }
        long[] jArr = v92.f36461a;
        for (int i = 0; i < this.f36462o; i++) {
            if (this.f36461a[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Long l) {
        mo46036L1(l.longValue());
        return true;
    }

    /* renamed from: g */
    public final void mo46041g(int i, long j) {
        int i2;
        mo36498b();
        if (i < 0 || i > (i2 = this.f36462o)) {
            throw new IndexOutOfBoundsException(mo46047l(i));
        }
        long[] jArr = this.f36461a;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f36461a, i, jArr2, i + 1, this.f36462o - i);
            this.f36461a = jArr2;
        }
        this.f36461a[i] = j;
        this.f36462o++;
        this.modCount++;
    }

    public long getLong(int i) {
        mo46045j(i);
        return this.f36461a[i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f36462o; i2++) {
            i = (i * 31) + vs1.m68447s(this.f36461a[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f36461a[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo46045j(int i) {
        if (i < 0 || i >= this.f36462o) {
            throw new IndexOutOfBoundsException(mo46047l(i));
        }
    }

    /* renamed from: k */
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    /* renamed from: l */
    public final String mo46047l(int i) {
        return "Index:" + i + ", Size:" + this.f36462o;
    }

    /* renamed from: n */
    public Long remove(int i) {
        mo36498b();
        mo46045j(i);
        long[] jArr = this.f36461a;
        long j = jArr[i];
        int i2 = this.f36462o;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f36462o--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* renamed from: o */
    public Long set(int i, Long l) {
        return Long.valueOf(mo46037c0(i, l.longValue()));
    }

    public void removeRange(int i, int i2) {
        mo36498b();
        if (i2 >= i) {
            long[] jArr = this.f36461a;
            System.arraycopy(jArr, i2, jArr, i, this.f36462o - i2);
            this.f36462o -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f36462o;
    }
}

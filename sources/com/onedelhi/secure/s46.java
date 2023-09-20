package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class s46 extends m06 implements RandomAccess, q56, ab6 {

    /* renamed from: a */
    public static final s46 f20203a;

    /* renamed from: a */
    public float[] f20204a;

    /* renamed from: n */
    public int f20205n;

    static {
        s46 s46 = new s46(new float[0], 0);
        f20203a = s46;
        s46.mo19980a();
    }

    public s46() {
        this(new float[10], 0);
    }

    public s46(float[] fArr, int i) {
        this.f20204a = fArr;
        this.f20205n = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo19981b();
        if (i < 0 || i > (i2 = this.f20205n)) {
            throw new IndexOutOfBoundsException(mo24205f(i));
        }
        float[] fArr = this.f20204a;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f20204a, i, fArr2, i + 1, this.f20205n - i);
            this.f20204a = fArr2;
        }
        this.f20204a[i] = floatValue;
        this.f20205n++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo24204e(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo19981b();
        t56.m28113e(collection);
        if (!(collection instanceof s46)) {
            return super.addAll(collection);
        }
        s46 s46 = (s46) collection;
        int i = s46.f20205n;
        if (i == 0) {
            return false;
        }
        int i2 = this.f20205n;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f20204a;
            if (i3 > fArr.length) {
                this.f20204a = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(s46.f20204a, 0, this.f20204a, this.f20205n, s46.f20205n);
            this.f20205n = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void mo24204e(float f) {
        mo19981b();
        int i = this.f20205n;
        float[] fArr = this.f20204a;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f20204a = fArr2;
        }
        float[] fArr3 = this.f20204a;
        int i2 = this.f20205n;
        this.f20205n = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s46)) {
            return super.equals(obj);
        }
        s46 s46 = (s46) obj;
        if (this.f20205n != s46.f20205n) {
            return false;
        }
        float[] fArr = s46.f20204a;
        for (int i = 0; i < this.f20205n; i++) {
            if (Float.floatToIntBits(this.f20204a[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo24205f(int i) {
        int i2 = this.f20205n;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: g */
    public final void mo24206g(int i) {
        if (i < 0 || i >= this.f20205n) {
            throw new IndexOutOfBoundsException(mo24205f(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo24206g(i);
        return Float.valueOf(this.f20204a[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20205n; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f20204a[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f20205n;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f20204a[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo19981b();
        mo24206g(i);
        float[] fArr = this.f20204a;
        float f = fArr[i];
        int i2 = this.f20205n;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f20205n--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo19981b();
        if (i2 >= i) {
            float[] fArr = this.f20204a;
            System.arraycopy(fArr, i2, fArr, i, this.f20205n - i2);
            this.f20205n -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo19981b();
        mo24206g(i);
        float[] fArr = this.f20204a;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f20205n;
    }

    /* renamed from: z1 */
    public final /* bridge */ /* synthetic */ q56 mo12861z1(int i) {
        if (i >= this.f20205n) {
            return new s46(Arrays.copyOf(this.f20204a, i), this.f20205n);
        }
        throw new IllegalArgumentException();
    }
}

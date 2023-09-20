package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public final class cp6 extends rl6 implements RandomAccess, xq6, ct6 {

    /* renamed from: a */
    public static final cp6 f10461a = new cp6(new float[0], 0, false);

    /* renamed from: a */
    public float[] f10462a;

    /* renamed from: n */
    public int f10463n;

    public cp6() {
        this(new float[10], 0, true);
    }

    public cp6(float[] fArr, int i, boolean z) {
        super(z);
        this.f10462a = fArr;
        this.f10463n = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo23935b();
        if (i < 0 || i > (i2 = this.f10463n)) {
            throw new IndexOutOfBoundsException(mo14327f(i));
        }
        float[] fArr = this.f10462a;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f10462a, i, fArr2, i + 1, this.f10463n - i);
            this.f10462a = fArr2;
        }
        this.f10462a[i] = floatValue;
        this.f10463n++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo14325e(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo23935b();
        byte[] bArr = zq6.f23858a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof cp6)) {
            return super.addAll(collection);
        }
        cp6 cp6 = (cp6) collection;
        int i = cp6.f10463n;
        if (i == 0) {
            return false;
        }
        int i2 = this.f10463n;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f10462a;
            if (i3 > fArr.length) {
                this.f10462a = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(cp6.f10462a, 0, this.f10462a, this.f10463n, cp6.f10463n);
            this.f10463n = i3;
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
        if (i >= this.f10463n) {
            return new cp6(Arrays.copyOf(this.f10462a, i), this.f10463n, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void mo14325e(float f) {
        mo23935b();
        int i = this.f10463n;
        float[] fArr = this.f10462a;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f10462a = fArr2;
        }
        float[] fArr3 = this.f10462a;
        int i2 = this.f10463n;
        this.f10463n = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp6)) {
            return super.equals(obj);
        }
        cp6 cp6 = (cp6) obj;
        if (this.f10463n != cp6.f10463n) {
            return false;
        }
        float[] fArr = cp6.f10462a;
        for (int i = 0; i < this.f10463n; i++) {
            if (Float.floatToIntBits(this.f10462a[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo14327f(int i) {
        int i2 = this.f10463n;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: g */
    public final void mo14328g(int i) {
        if (i < 0 || i >= this.f10463n) {
            throw new IndexOutOfBoundsException(mo14327f(i));
        }
    }

    public final /* synthetic */ Object get(int i) {
        mo14328g(i);
        return Float.valueOf(this.f10462a[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10463n; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f10462a[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f10463n;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f10462a[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo23935b();
        mo14328g(i);
        float[] fArr = this.f10462a;
        float f = fArr[i];
        int i2 = this.f10463n;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f10463n--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        mo23935b();
        if (i2 >= i) {
            float[] fArr = this.f10462a;
            System.arraycopy(fArr, i2, fArr, i, this.f10463n - i2);
            this.f10463n -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo23935b();
        mo14328g(i);
        float[] fArr = this.f10462a;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f10463n;
    }
}

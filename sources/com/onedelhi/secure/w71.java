package com.onedelhi.secure;

import com.onedelhi.secure.vs1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class w71 extends C5351g1<Float> implements vs1.C7084f, RandomAccess, x43 {

    /* renamed from: a */
    public static final w71 f36914a;

    /* renamed from: a */
    public float[] f36915a;

    /* renamed from: o */
    public int f36916o;

    static {
        w71 w71 = new w71(new float[0], 0);
        f36914a = w71;
        w71.mo36496Q0();
    }

    public w71() {
        this(new float[10], 0);
    }

    public w71(float[] fArr, int i) {
        this.f36915a = fArr;
        this.f36916o = i;
    }

    /* renamed from: i */
    public static w71 m69188i() {
        return f36914a;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo36498b();
        vs1.m68432d(collection);
        if (!(collection instanceof w71)) {
            return super.addAll(collection);
        }
        w71 w71 = (w71) collection;
        int i = w71.f36916o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f36916o;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f36915a;
            if (i3 > fArr.length) {
                this.f36915a = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(w71.f36915a, 0, this.f36915a, this.f36916o, w71.f36916o);
            this.f36916o = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b2 */
    public void mo46323b2(float f) {
        mo36498b();
        int i = this.f36916o;
        float[] fArr = this.f36915a;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f36915a = fArr2;
        }
        float[] fArr3 = this.f36915a;
        int i2 = this.f36916o;
        this.f36916o = i2 + 1;
        fArr3[i2] = f;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public void add(int i, Float f) {
        mo46632g(i, f.floatValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w71)) {
            return super.equals(obj);
        }
        w71 w71 = (w71) obj;
        if (this.f36916o != w71.f36916o) {
            return false;
        }
        float[] fArr = w71.f36915a;
        for (int i = 0; i < this.f36916o; i++) {
            if (Float.floatToIntBits(this.f36915a[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Float f) {
        mo46323b2(f.floatValue());
        return true;
    }

    /* renamed from: g */
    public final void mo46632g(int i, float f) {
        int i2;
        mo36498b();
        if (i < 0 || i > (i2 = this.f36916o)) {
            throw new IndexOutOfBoundsException(mo46637l(i));
        }
        float[] fArr = this.f36915a;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f36915a, i, fArr2, i + 1, this.f36916o - i);
            this.f36915a = fArr2;
        }
        this.f36915a[i] = f;
        this.f36916o++;
        this.modCount++;
    }

    public float getFloat(int i) {
        mo46635j(i);
        return this.f36915a[i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f36916o; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f36915a[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f36915a[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo46635j(int i) {
        if (i < 0 || i >= this.f36916o) {
            throw new IndexOutOfBoundsException(mo46637l(i));
        }
    }

    /* renamed from: k */
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    /* renamed from: l */
    public final String mo46637l(int i) {
        return "Index:" + i + ", Size:" + this.f36916o;
    }

    /* renamed from: n */
    public Float remove(int i) {
        mo36498b();
        mo46635j(i);
        float[] fArr = this.f36915a;
        float f = fArr[i];
        int i2 = this.f36916o;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f36916o--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* renamed from: o */
    public Float set(int i, Float f) {
        return Float.valueOf(mo46326p1(i, f.floatValue()));
    }

    /* renamed from: o2 */
    public vs1.C7084f mo31125H1(int i) {
        if (i >= this.f36916o) {
            return new w71(Arrays.copyOf(this.f36915a, i), this.f36916o);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p1 */
    public float mo46326p1(int i, float f) {
        mo36498b();
        mo46635j(i);
        float[] fArr = this.f36915a;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public void removeRange(int i, int i2) {
        mo36498b();
        if (i2 >= i) {
            float[] fArr = this.f36915a;
            System.arraycopy(fArr, i2, fArr, i, this.f36916o - i2);
            this.f36916o -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f36916o;
    }
}

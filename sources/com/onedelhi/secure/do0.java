package com.onedelhi.secure;

import com.onedelhi.secure.vs1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class do0 extends C5351g1<Double> implements vs1.C7080b, RandomAccess, x43 {

    /* renamed from: a */
    public static final do0 f27561a;

    /* renamed from: a */
    public double[] f27562a;

    /* renamed from: o */
    public int f27563o;

    static {
        do0 do0 = new do0(new double[0], 0);
        f27561a = do0;
        do0.mo36496Q0();
    }

    public do0() {
        this(new double[10], 0);
    }

    public do0(double[] dArr, int i) {
        this.f27562a = dArr;
        this.f27563o = i;
    }

    /* renamed from: i */
    public static do0 m45459i() {
        return f27561a;
    }

    /* renamed from: P0 */
    public vs1.C7080b mo31125H1(int i) {
        if (i >= this.f27563o) {
            return new do0(Arrays.copyOf(this.f27562a, i), this.f27563o);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: V0 */
    public void mo34579V0(double d) {
        mo36498b();
        int i = this.f27563o;
        double[] dArr = this.f27562a;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f27562a = dArr2;
        }
        double[] dArr3 = this.f27562a;
        int i2 = this.f27563o;
        this.f27563o = i2 + 1;
        dArr3[i2] = d;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo36498b();
        vs1.m68432d(collection);
        if (!(collection instanceof do0)) {
            return super.addAll(collection);
        }
        do0 do0 = (do0) collection;
        int i = do0.f27563o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f27563o;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f27562a;
            if (i3 > dArr.length) {
                this.f27562a = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(do0.f27562a, 0, this.f27562a, this.f27563o, do0.f27563o);
            this.f27563o = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public void add(int i, Double d) {
        mo34583g(i, d.doubleValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do0)) {
            return super.equals(obj);
        }
        do0 do0 = (do0) obj;
        if (this.f27563o != do0.f27563o) {
            return false;
        }
        double[] dArr = do0.f27562a;
        for (int i = 0; i < this.f27563o; i++) {
            if (Double.doubleToLongBits(this.f27562a[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Double d) {
        mo34579V0(d.doubleValue());
        return true;
    }

    /* renamed from: g */
    public final void mo34583g(int i, double d) {
        int i2;
        mo36498b();
        if (i < 0 || i > (i2 = this.f27563o)) {
            throw new IndexOutOfBoundsException(mo34589l(i));
        }
        double[] dArr = this.f27562a;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f27562a, i, dArr2, i + 1, this.f27563o - i);
            this.f27562a = dArr2;
        }
        this.f27562a[i] = d;
        this.f27563o++;
        this.modCount++;
    }

    public double getDouble(int i) {
        mo34587j(i);
        return this.f27562a[i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f27563o; i2++) {
            i = (i * 31) + vs1.m68447s(Double.doubleToLongBits(this.f27562a[i2]));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f27562a[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void mo34587j(int i) {
        if (i < 0 || i >= this.f27563o) {
            throw new IndexOutOfBoundsException(mo34589l(i));
        }
    }

    /* renamed from: k */
    public Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    /* renamed from: l */
    public final String mo34589l(int i) {
        return "Index:" + i + ", Size:" + this.f27563o;
    }

    /* renamed from: n */
    public Double remove(int i) {
        mo36498b();
        mo34587j(i);
        double[] dArr = this.f27562a;
        double d = dArr[i];
        int i2 = this.f27563o;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f27563o--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* renamed from: o */
    public Double set(int i, Double d) {
        return Double.valueOf(mo34592q0(i, d.doubleValue()));
    }

    /* renamed from: q0 */
    public double mo34592q0(int i, double d) {
        mo36498b();
        mo34587j(i);
        double[] dArr = this.f27562a;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public void removeRange(int i, int i2) {
        mo36498b();
        if (i2 >= i) {
            double[] dArr = this.f27562a;
            System.arraycopy(dArr, i2, dArr, i, this.f27563o - i2);
            this.f27563o -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f27563o;
    }
}

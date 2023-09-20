package com.onedelhi.secure;

import java.util.Arrays;
import java.util.RandomAccess;

public final class gb6 extends m06 implements RandomAccess {

    /* renamed from: a */
    public static final gb6 f12515a;

    /* renamed from: a */
    public Object[] f12516a;

    /* renamed from: n */
    public int f12517n;

    static {
        gb6 gb6 = new gb6(new Object[0], 0);
        f12515a = gb6;
        gb6.mo19980a();
    }

    public gb6() {
        this(new Object[10], 0);
    }

    public gb6(Object[] objArr, int i) {
        this.f12516a = objArr;
        this.f12517n = i;
    }

    /* renamed from: e */
    public static gb6 m15700e() {
        return f12515a;
    }

    public final void add(int i, Object obj) {
        int i2;
        mo19981b();
        if (i < 0 || i > (i2 = this.f12517n)) {
            throw new IndexOutOfBoundsException(mo16504f(i));
        }
        Object[] objArr = this.f12516a;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f12516a, i, objArr2, i + 1, this.f12517n - i);
            this.f12516a = objArr2;
        }
        this.f12516a[i] = obj;
        this.f12517n++;
        this.modCount++;
    }

    public final boolean add(Object obj) {
        mo19981b();
        int i = this.f12517n;
        Object[] objArr = this.f12516a;
        if (i == objArr.length) {
            this.f12516a = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f12516a;
        int i2 = this.f12517n;
        this.f12517n = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }

    /* renamed from: f */
    public final String mo16504f(int i) {
        int i2 = this.f12517n;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: g */
    public final void mo16505g(int i) {
        if (i < 0 || i >= this.f12517n) {
            throw new IndexOutOfBoundsException(mo16504f(i));
        }
    }

    public final Object get(int i) {
        mo16505g(i);
        return this.f12516a[i];
    }

    public final Object remove(int i) {
        mo19981b();
        mo16505g(i);
        Object[] objArr = this.f12516a;
        Object obj = objArr[i];
        int i2 = this.f12517n;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f12517n--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo19981b();
        mo16505g(i);
        Object[] objArr = this.f12516a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f12517n;
    }

    /* renamed from: z1 */
    public final /* bridge */ /* synthetic */ q56 mo12861z1(int i) {
        if (i >= this.f12517n) {
            return new gb6(Arrays.copyOf(this.f12516a, i), this.f12517n);
        }
        throw new IllegalArgumentException();
    }
}

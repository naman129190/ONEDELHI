package com.onedelhi.secure;

import java.util.Arrays;
import java.util.RandomAccess;

public final class q63<E> extends C5351g1<E> implements RandomAccess {

    /* renamed from: a */
    public static final q63<Object> f34012a;

    /* renamed from: a */
    public E[] f34013a;

    /* renamed from: o */
    public int f34014o;

    static {
        q63<Object> q63 = new q63<>(new Object[0], 0);
        f34012a = q63;
        q63.mo36496Q0();
    }

    public q63() {
        this(new Object[10], 0);
    }

    public q63(E[] eArr, int i) {
        this.f34013a = eArr;
        this.f34014o = i;
    }

    /* renamed from: e */
    public static <E> E[] m62152e(int i) {
        return new Object[i];
    }

    /* renamed from: f */
    public static <E> q63<E> m62153f() {
        return f34012a;
    }

    public void add(int i, E e) {
        int i2;
        mo36498b();
        if (i < 0 || i > (i2 = this.f34014o)) {
            throw new IndexOutOfBoundsException(mo43167i(i));
        }
        E[] eArr = this.f34013a;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] e2 = m62152e(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f34013a, 0, e2, 0, i);
            System.arraycopy(this.f34013a, i, e2, i + 1, this.f34014o - i);
            this.f34013a = e2;
        }
        this.f34013a[i] = e;
        this.f34014o++;
        this.modCount++;
    }

    public boolean add(E e) {
        mo36498b();
        int i = this.f34014o;
        E[] eArr = this.f34013a;
        if (i == eArr.length) {
            this.f34013a = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f34013a;
        int i2 = this.f34014o;
        this.f34014o = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: g */
    public final void mo43165g(int i) {
        if (i < 0 || i >= this.f34014o) {
            throw new IndexOutOfBoundsException(mo43167i(i));
        }
    }

    public E get(int i) {
        mo43165g(i);
        return this.f34013a[i];
    }

    /* renamed from: i */
    public final String mo43167i(int i) {
        return "Index:" + i + ", Size:" + this.f34014o;
    }

    /* renamed from: j */
    public q63<E> mo31125H1(int i) {
        if (i >= this.f34014o) {
            return new q63<>(Arrays.copyOf(this.f34013a, i), this.f34014o);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        mo36498b();
        mo43165g(i);
        E[] eArr = this.f34013a;
        E e = eArr[i];
        int i2 = this.f34014o;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f34014o--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo36498b();
        mo43165g(i);
        E[] eArr = this.f34013a;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f34014o;
    }
}

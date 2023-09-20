package com.onedelhi.secure;

import java.util.Arrays;
import java.util.RandomAccess;

public final class et6 extends rl6 implements RandomAccess {

    /* renamed from: a */
    public static final et6 f11716a = new et6(new Object[0], 0, false);

    /* renamed from: a */
    public Object[] f11717a;

    /* renamed from: n */
    public int f11718n;

    public et6() {
        this(new Object[10], 0, true);
    }

    public et6(Object[] objArr, int i, boolean z) {
        super(z);
        this.f11717a = objArr;
        this.f11718n = i;
    }

    /* renamed from: e */
    public static et6 m14365e() {
        return f11716a;
    }

    public final void add(int i, Object obj) {
        int i2;
        mo23935b();
        if (i < 0 || i > (i2 = this.f11718n)) {
            throw new IndexOutOfBoundsException(mo15590f(i));
        }
        Object[] objArr = this.f11717a;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f11717a, i, objArr2, i + 1, this.f11718n - i);
            this.f11717a = objArr2;
        }
        this.f11717a[i] = obj;
        this.f11718n++;
        this.modCount++;
    }

    public final boolean add(Object obj) {
        mo23935b();
        int i = this.f11718n;
        Object[] objArr = this.f11717a;
        if (i == objArr.length) {
            this.f11717a = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f11717a;
        int i2 = this.f11718n;
        this.f11718n = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }

    /* renamed from: d2 */
    public final /* bridge */ /* synthetic */ xq6 mo14324d2(int i) {
        if (i >= this.f11718n) {
            return new et6(Arrays.copyOf(this.f11717a, i), this.f11718n, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final String mo15590f(int i) {
        int i2 = this.f11718n;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: g */
    public final void mo15591g(int i) {
        if (i < 0 || i >= this.f11718n) {
            throw new IndexOutOfBoundsException(mo15590f(i));
        }
    }

    public final Object get(int i) {
        mo15591g(i);
        return this.f11717a[i];
    }

    public final Object remove(int i) {
        mo23935b();
        mo15591g(i);
        Object[] objArr = this.f11717a;
        Object obj = objArr[i];
        int i2 = this.f11718n;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f11718n--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo23935b();
        mo15591g(i);
        Object[] objArr = this.f11717a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f11718n;
    }
}

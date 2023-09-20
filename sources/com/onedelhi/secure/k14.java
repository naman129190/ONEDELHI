package com.onedelhi.secure;

public class k14<E> implements Cloneable {

    /* renamed from: a */
    public static final Object f14677a = new Object();

    /* renamed from: a */
    public int[] f14678a;

    /* renamed from: a */
    public Object[] f14679a;

    /* renamed from: b */
    public boolean f14680b;

    /* renamed from: n */
    public int f14681n;

    public k14() {
        this(10);
    }

    public k14(int i) {
        this.f14680b = false;
        if (i == 0) {
            this.f14678a = w60.f22052a;
            this.f14679a = w60.f22054a;
            return;
        }
        int e = w60.m30697e(i);
        this.f14678a = new int[e];
        this.f14679a = new Object[e];
    }

    /* renamed from: a */
    public void mo18841a(int i, E e) {
        int i2 = this.f14681n;
        if (i2 == 0 || i > this.f14678a[i2 - 1]) {
            if (this.f14680b && i2 >= this.f14678a.length) {
                mo18848g();
            }
            int i3 = this.f14681n;
            if (i3 >= this.f14678a.length) {
                int e2 = w60.m30697e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f14678a;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f14679a;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f14678a = iArr;
                this.f14679a = objArr;
            }
            this.f14678a[i3] = i;
            this.f14679a[i3] = e;
            this.f14681n = i3 + 1;
            return;
        }
        mo18855n(i, e);
    }

    /* renamed from: b */
    public void mo18842b() {
        int i = this.f14681n;
        Object[] objArr = this.f14679a;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f14681n = 0;
        this.f14680b = false;
    }

    /* renamed from: c */
    public k14<E> clone() {
        try {
            k14<E> k14 = (k14) super.clone();
            k14.f14678a = (int[]) this.f14678a.clone();
            k14.f14679a = (Object[]) this.f14679a.clone();
            return k14;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public boolean mo18845d(int i) {
        return mo18851j(i) >= 0;
    }

    /* renamed from: e */
    public boolean mo18846e(E e) {
        return mo18852k(e) >= 0;
    }

    @Deprecated
    /* renamed from: f */
    public void mo18847f(int i) {
        mo18858q(i);
    }

    /* renamed from: g */
    public final void mo18848g() {
        int i = this.f14681n;
        int[] iArr = this.f14678a;
        Object[] objArr = this.f14679a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f14677a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f14680b = false;
        this.f14681n = i2;
    }

    @ts2
    /* renamed from: h */
    public E mo18849h(int i) {
        return mo18850i(i, (Object) null);
    }

    /* renamed from: i */
    public E mo18850i(int i, E e) {
        int a = w60.m30693a(this.f14678a, this.f14681n, i);
        if (a >= 0) {
            E[] eArr = this.f14679a;
            if (eArr[a] != f14677a) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: j */
    public int mo18851j(int i) {
        if (this.f14680b) {
            mo18848g();
        }
        return w60.m30693a(this.f14678a, this.f14681n, i);
    }

    /* renamed from: k */
    public int mo18852k(E e) {
        if (this.f14680b) {
            mo18848g();
        }
        for (int i = 0; i < this.f14681n; i++) {
            if (this.f14679a[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public boolean mo18853l() {
        return mo18866x() == 0;
    }

    /* renamed from: m */
    public int mo18854m(int i) {
        if (this.f14680b) {
            mo18848g();
        }
        return this.f14678a[i];
    }

    /* renamed from: n */
    public void mo18855n(int i, E e) {
        int a = w60.m30693a(this.f14678a, this.f14681n, i);
        if (a >= 0) {
            this.f14679a[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f14681n;
        if (i2 < i3) {
            Object[] objArr = this.f14679a;
            if (objArr[i2] == f14677a) {
                this.f14678a[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f14680b && i3 >= this.f14678a.length) {
            mo18848g();
            i2 = ~w60.m30693a(this.f14678a, this.f14681n, i);
        }
        int i4 = this.f14681n;
        if (i4 >= this.f14678a.length) {
            int e2 = w60.m30697e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f14678a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f14679a;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f14678a = iArr;
            this.f14679a = objArr2;
        }
        int i5 = this.f14681n;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f14678a;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f14679a;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f14681n - i2);
        }
        this.f14678a[i2] = i;
        this.f14679a[i2] = e;
        this.f14681n++;
    }

    /* renamed from: o */
    public void mo18856o(@mr2 k14<? extends E> k14) {
        int x = k14.mo18866x();
        for (int i = 0; i < x; i++) {
            mo18855n(k14.mo18854m(i), k14.mo18867y(i));
        }
    }

    @ts2
    /* renamed from: p */
    public E mo18857p(int i, E e) {
        E h = mo18849h(i);
        if (h == null) {
            mo18855n(i, e);
        }
        return h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f14679a;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18858q(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f14678a
            int r1 = r3.f14681n
            int r4 = com.onedelhi.secure.w60.m30693a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f14679a
            r1 = r0[r4]
            java.lang.Object r2 = f14677a
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f14680b = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.k14.mo18858q(int):void");
    }

    /* renamed from: r */
    public boolean mo18859r(int i, Object obj) {
        int j = mo18851j(i);
        if (j < 0) {
            return false;
        }
        Object y = mo18867y(j);
        if (obj != y && (obj == null || !obj.equals(y))) {
            return false;
        }
        mo18860s(j);
        return true;
    }

    /* renamed from: s */
    public void mo18860s(int i) {
        Object[] objArr = this.f14679a;
        Object obj = objArr[i];
        Object obj2 = f14677a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f14680b = true;
        }
    }

    /* renamed from: t */
    public void mo18861t(int i, int i2) {
        int min = Math.min(this.f14681n, i2 + i);
        while (i < min) {
            mo18860s(i);
            i++;
        }
    }

    public String toString() {
        if (mo18866x() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14681n * 28);
        sb.append('{');
        for (int i = 0; i < this.f14681n; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo18854m(i));
            sb.append('=');
            Object y = mo18867y(i);
            if (y != this) {
                sb.append(y);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @ts2
    /* renamed from: u */
    public E mo18863u(int i, E e) {
        int j = mo18851j(i);
        if (j < 0) {
            return null;
        }
        E[] eArr = this.f14679a;
        E e2 = eArr[j];
        eArr[j] = e;
        return e2;
    }

    /* renamed from: v */
    public boolean mo18864v(int i, E e, E e2) {
        int j = mo18851j(i);
        if (j < 0) {
            return false;
        }
        E e3 = this.f14679a[j];
        if (e3 != e && (e == null || !e.equals(e3))) {
            return false;
        }
        this.f14679a[j] = e2;
        return true;
    }

    /* renamed from: w */
    public void mo18865w(int i, E e) {
        if (this.f14680b) {
            mo18848g();
        }
        this.f14679a[i] = e;
    }

    /* renamed from: x */
    public int mo18866x() {
        if (this.f14680b) {
            mo18848g();
        }
        return this.f14681n;
    }

    /* renamed from: y */
    public E mo18867y(int i) {
        if (this.f14680b) {
            mo18848g();
        }
        return this.f14679a[i];
    }
}

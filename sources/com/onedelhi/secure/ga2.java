package com.onedelhi.secure;

public class ga2<E> implements Cloneable {

    /* renamed from: a */
    public static final Object f12478a = new Object();

    /* renamed from: a */
    public long[] f12479a;

    /* renamed from: a */
    public Object[] f12480a;

    /* renamed from: b */
    public boolean f12481b;

    /* renamed from: n */
    public int f12482n;

    public ga2() {
        this(10);
    }

    public ga2(int i) {
        this.f12481b = false;
        if (i == 0) {
            this.f12479a = w60.f22053a;
            this.f12480a = w60.f22054a;
            return;
        }
        int f = w60.m30698f(i);
        this.f12479a = new long[f];
        this.f12480a = new Object[f];
    }

    /* renamed from: a */
    public void mo16409a(long j, E e) {
        int i = this.f12482n;
        if (i == 0 || j > this.f12479a[i - 1]) {
            if (this.f12481b && i >= this.f12479a.length) {
                mo16416g();
            }
            int i2 = this.f12482n;
            if (i2 >= this.f12479a.length) {
                int f = w60.m30698f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f12479a;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f12480a;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f12479a = jArr;
                this.f12480a = objArr;
            }
            this.f12479a[i2] = j;
            this.f12480a[i2] = e;
            this.f12482n = i2 + 1;
            return;
        }
        mo16423n(j, e);
    }

    /* renamed from: b */
    public void mo16410b() {
        int i = this.f12482n;
        Object[] objArr = this.f12480a;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f12482n = 0;
        this.f12481b = false;
    }

    /* renamed from: c */
    public ga2<E> clone() {
        try {
            ga2<E> ga2 = (ga2) super.clone();
            ga2.f12479a = (long[]) this.f12479a.clone();
            ga2.f12480a = (Object[]) this.f12480a.clone();
            return ga2;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public boolean mo16413d(long j) {
        return mo16419j(j) >= 0;
    }

    /* renamed from: e */
    public boolean mo16414e(E e) {
        return mo16420k(e) >= 0;
    }

    @Deprecated
    /* renamed from: f */
    public void mo16415f(long j) {
        mo16426q(j);
    }

    /* renamed from: g */
    public final void mo16416g() {
        int i = this.f12482n;
        long[] jArr = this.f12479a;
        Object[] objArr = this.f12480a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f12478a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f12481b = false;
        this.f12482n = i2;
    }

    @ts2
    /* renamed from: h */
    public E mo16417h(long j) {
        return mo16418i(j, (Object) null);
    }

    /* renamed from: i */
    public E mo16418i(long j, E e) {
        int b = w60.m30694b(this.f12479a, this.f12482n, j);
        if (b >= 0) {
            E[] eArr = this.f12480a;
            if (eArr[b] != f12478a) {
                return eArr[b];
            }
        }
        return e;
    }

    /* renamed from: j */
    public int mo16419j(long j) {
        if (this.f12481b) {
            mo16416g();
        }
        return w60.m30694b(this.f12479a, this.f12482n, j);
    }

    /* renamed from: k */
    public int mo16420k(E e) {
        if (this.f12481b) {
            mo16416g();
        }
        for (int i = 0; i < this.f12482n; i++) {
            if (this.f12480a[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public boolean mo16421l() {
        return mo16433w() == 0;
    }

    /* renamed from: m */
    public long mo16422m(int i) {
        if (this.f12481b) {
            mo16416g();
        }
        return this.f12479a[i];
    }

    /* renamed from: n */
    public void mo16423n(long j, E e) {
        int b = w60.m30694b(this.f12479a, this.f12482n, j);
        if (b >= 0) {
            this.f12480a[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.f12482n;
        if (i < i2) {
            Object[] objArr = this.f12480a;
            if (objArr[i] == f12478a) {
                this.f12479a[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f12481b && i2 >= this.f12479a.length) {
            mo16416g();
            i = ~w60.m30694b(this.f12479a, this.f12482n, j);
        }
        int i3 = this.f12482n;
        if (i3 >= this.f12479a.length) {
            int f = w60.m30698f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f12479a;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f12480a;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12479a = jArr;
            this.f12480a = objArr2;
        }
        int i4 = this.f12482n;
        if (i4 - i != 0) {
            long[] jArr3 = this.f12479a;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f12480a;
            System.arraycopy(objArr4, i, objArr4, i5, this.f12482n - i);
        }
        this.f12479a[i] = j;
        this.f12480a[i] = e;
        this.f12482n++;
    }

    /* renamed from: o */
    public void mo16424o(@mr2 ga2<? extends E> ga2) {
        int w = ga2.mo16433w();
        for (int i = 0; i < w; i++) {
            mo16423n(ga2.mo16422m(i), ga2.mo16434x(i));
        }
    }

    @ts2
    /* renamed from: p */
    public E mo16425p(long j, E e) {
        E h = mo16417h(j);
        if (h == null) {
            mo16423n(j, e);
        }
        return h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f12480a;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16426q(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f12479a
            int r1 = r2.f12482n
            int r3 = com.onedelhi.secure.w60.m30694b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f12480a
            r0 = r4[r3]
            java.lang.Object r1 = f12478a
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f12481b = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ga2.mo16426q(long):void");
    }

    /* renamed from: r */
    public boolean mo16427r(long j, Object obj) {
        int j2 = mo16419j(j);
        if (j2 < 0) {
            return false;
        }
        Object x = mo16434x(j2);
        if (obj != x && (obj == null || !obj.equals(x))) {
            return false;
        }
        mo16428s(j2);
        return true;
    }

    /* renamed from: s */
    public void mo16428s(int i) {
        Object[] objArr = this.f12480a;
        Object obj = objArr[i];
        Object obj2 = f12478a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f12481b = true;
        }
    }

    @ts2
    /* renamed from: t */
    public E mo16429t(long j, E e) {
        int j2 = mo16419j(j);
        if (j2 < 0) {
            return null;
        }
        E[] eArr = this.f12480a;
        E e2 = eArr[j2];
        eArr[j2] = e;
        return e2;
    }

    public String toString() {
        if (mo16433w() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12482n * 28);
        sb.append('{');
        for (int i = 0; i < this.f12482n; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo16422m(i));
            sb.append('=');
            Object x = mo16434x(i);
            if (x != this) {
                sb.append(x);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo16431u(long j, E e, E e2) {
        int j2 = mo16419j(j);
        if (j2 < 0) {
            return false;
        }
        E e3 = this.f12480a[j2];
        if (e3 != e && (e == null || !e.equals(e3))) {
            return false;
        }
        this.f12480a[j2] = e2;
        return true;
    }

    /* renamed from: v */
    public void mo16432v(int i, E e) {
        if (this.f12481b) {
            mo16416g();
        }
        this.f12480a[i] = e;
    }

    /* renamed from: w */
    public int mo16433w() {
        if (this.f12481b) {
            mo16416g();
        }
        return this.f12482n;
    }

    /* renamed from: x */
    public E mo16434x(int i) {
        if (this.f12481b) {
            mo16416g();
        }
        return this.f12480a[i];
    }
}

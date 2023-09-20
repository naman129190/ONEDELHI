package androidx.recyclerview.widget;

import com.onedelhi.secure.C2064ek;
import com.onedelhi.secure.h42;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* renamed from: androidx.recyclerview.widget.z */
public class C0954z<T> {

    /* renamed from: e */
    public static final int f5215e = -1;

    /* renamed from: f */
    public static final int f5216f = 10;

    /* renamed from: g */
    public static final int f5217g = 10;

    /* renamed from: h */
    public static final int f5218h = 1;

    /* renamed from: i */
    public static final int f5219i = 2;

    /* renamed from: j */
    public static final int f5220j = 4;

    /* renamed from: a */
    public int f5221a;

    /* renamed from: a */
    public C0955a f5222a;

    /* renamed from: a */
    public C0956b f5223a;

    /* renamed from: a */
    public final Class<T> f5224a;

    /* renamed from: a */
    public T[] f5225a;

    /* renamed from: b */
    public int f5226b;

    /* renamed from: b */
    public T[] f5227b;

    /* renamed from: c */
    public int f5228c;

    /* renamed from: d */
    public int f5229d;

    /* renamed from: androidx.recyclerview.widget.z$a */
    public static class C0955a<T2> extends C0956b<T2> {

        /* renamed from: a */
        public final C0956b<T2> f5230a;

        /* renamed from: a */
        public final C2064ek f5231a;

        public C0955a(C0956b<T2> bVar) {
            this.f5230a = bVar;
            this.f5231a = new C2064ek(bVar);
        }

        /* renamed from: a */
        public void mo6146a(int i, int i2, Object obj) {
            this.f5231a.mo6146a(i, i2, obj);
        }

        /* renamed from: b */
        public void mo6147b(int i, int i2) {
            this.f5231a.mo6147b(i, i2);
        }

        /* renamed from: c */
        public void mo6148c(int i, int i2) {
            this.f5231a.mo6148c(i, i2);
        }

        public int compare(T2 t2, T2 t22) {
            return this.f5230a.compare(t2, t22);
        }

        /* renamed from: d */
        public void mo6149d(int i, int i2) {
            this.f5231a.mo6149d(i, i2);
        }

        /* renamed from: e */
        public boolean mo6594e(T2 t2, T2 t22) {
            return this.f5230a.mo6594e(t2, t22);
        }

        /* renamed from: f */
        public boolean mo6595f(T2 t2, T2 t22) {
            return this.f5230a.mo6595f(t2, t22);
        }

        @ts2
        /* renamed from: g */
        public Object mo6596g(T2 t2, T2 t22) {
            return this.f5230a.mo6596g(t2, t22);
        }

        /* renamed from: h */
        public void mo6150h(int i, int i2) {
            this.f5231a.mo6146a(i, i2, (Object) null);
        }

        /* renamed from: i */
        public void mo6597i() {
            this.f5231a.mo15216e();
        }
    }

    /* renamed from: androidx.recyclerview.widget.z$b */
    public static abstract class C0956b<T2> implements Comparator<T2>, h42 {
        /* renamed from: a */
        public void mo6146a(int i, int i2, Object obj) {
            mo6150h(i, i2);
        }

        public abstract int compare(T2 t2, T2 t22);

        /* renamed from: e */
        public abstract boolean mo6594e(T2 t2, T2 t22);

        /* renamed from: f */
        public abstract boolean mo6595f(T2 t2, T2 t22);

        @ts2
        /* renamed from: g */
        public Object mo6596g(T2 t2, T2 t22) {
            return null;
        }

        /* renamed from: h */
        public abstract void mo6150h(int i, int i2);
    }

    public C0954z(@mr2 Class<T> cls, @mr2 C0956b<T> bVar) {
        this(cls, bVar, 10);
    }

    public C0954z(@mr2 Class<T> cls, @mr2 C0956b<T> bVar, int i) {
        this.f5224a = cls;
        this.f5225a = (Object[]) Array.newInstance(cls, i);
        this.f5223a = bVar;
        this.f5229d = 0;
    }

    /* renamed from: A */
    public final void mo6561A(@mr2 T[] tArr) {
        boolean z = !(this.f5223a instanceof C0955a);
        if (z) {
            mo6574h();
        }
        this.f5221a = 0;
        this.f5226b = this.f5229d;
        this.f5227b = this.f5225a;
        this.f5228c = 0;
        int D = mo6564D(tArr);
        this.f5225a = (Object[]) Array.newInstance(this.f5224a, D);
        while (true) {
            int i = this.f5228c;
            if (i >= D && this.f5221a >= this.f5226b) {
                break;
            }
            int i2 = this.f5221a;
            int i3 = this.f5226b;
            if (i2 >= i3) {
                int i4 = D - i;
                System.arraycopy(tArr, i, this.f5225a, i, i4);
                this.f5228c += i4;
                this.f5229d += i4;
                this.f5223a.mo6148c(i, i4);
                break;
            } else if (i >= D) {
                int i5 = i3 - i2;
                this.f5229d -= i5;
                this.f5223a.mo6147b(i, i5);
                break;
            } else {
                T t = this.f5227b[i2];
                T t2 = tArr[i];
                int compare = this.f5223a.compare(t, t2);
                if (compare < 0) {
                    mo6562B();
                } else {
                    if (compare <= 0) {
                        if (!this.f5223a.mo6595f(t, t2)) {
                            mo6562B();
                        } else {
                            T[] tArr2 = this.f5225a;
                            int i6 = this.f5228c;
                            tArr2[i6] = t2;
                            this.f5221a++;
                            this.f5228c = i6 + 1;
                            if (!this.f5223a.mo6594e(t, t2)) {
                                C0956b bVar = this.f5223a;
                                bVar.mo6146a(this.f5228c - 1, 1, bVar.mo6596g(t, t2));
                            }
                        }
                    }
                    mo6592z(t2);
                }
            }
        }
        this.f5227b = null;
        if (z) {
            mo6577k();
        }
    }

    /* renamed from: B */
    public final void mo6562B() {
        this.f5229d--;
        this.f5221a++;
        this.f5223a.mo6147b(this.f5228c, 1);
    }

    /* renamed from: C */
    public int mo6563C() {
        return this.f5229d;
    }

    /* renamed from: D */
    public final int mo6564D(@mr2 T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f5223a);
        int i = 1;
        int i2 = 0;
        for (int i3 = 1; i3 < tArr.length; i3++) {
            T t = tArr[i3];
            if (this.f5223a.compare(tArr[i2], t) == 0) {
                int m = mo6579m(t, tArr, i2, i);
                if (m != -1) {
                    tArr[m] = t;
                } else {
                    if (i != i3) {
                        tArr[i] = t;
                    }
                    i++;
                }
            } else {
                if (i != i3) {
                    tArr[i] = t;
                }
                i2 = i;
                i++;
            }
        }
        return i;
    }

    /* renamed from: E */
    public final void mo6565E() {
        if (this.f5227b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    /* renamed from: F */
    public void mo6566F(int i, T t) {
        mo6565E();
        T n = mo6580n(i);
        boolean z = n == t || !this.f5223a.mo6594e(n, t);
        if (n == t || this.f5223a.compare(n, t) != 0) {
            if (z) {
                C0956b bVar = this.f5223a;
                bVar.mo6146a(i, 1, bVar.mo6596g(n, t));
            }
            mo6588v(i, false);
            int b = mo6568b(t, false);
            if (i != b) {
                this.f5223a.mo6149d(i, b);
                return;
            }
            return;
        }
        this.f5225a[i] = t;
        if (z) {
            C0956b bVar2 = this.f5223a;
            bVar2.mo6146a(i, 1, bVar2.mo6596g(n, t));
        }
    }

    /* renamed from: a */
    public int mo6567a(T t) {
        mo6565E();
        return mo6568b(t, true);
    }

    /* renamed from: b */
    public final int mo6568b(T t, boolean z) {
        int l = mo6578l(t, this.f5225a, 0, this.f5229d, 1);
        if (l == -1) {
            l = 0;
        } else if (l < this.f5229d) {
            T t2 = this.f5225a[l];
            if (this.f5223a.mo6595f(t2, t)) {
                if (this.f5223a.mo6594e(t2, t)) {
                    this.f5225a[l] = t;
                    return l;
                }
                this.f5225a[l] = t;
                C0956b bVar = this.f5223a;
                bVar.mo6146a(l, 1, bVar.mo6596g(t2, t));
                return l;
            }
        }
        mo6573g(l, t);
        if (z) {
            this.f5223a.mo6148c(l, 1);
        }
        return l;
    }

    /* renamed from: c */
    public void mo6569c(@mr2 Collection<T> collection) {
        mo6571e(collection.toArray((Object[]) Array.newInstance(this.f5224a, collection.size())), true);
    }

    /* renamed from: d */
    public void mo6570d(@mr2 T... tArr) {
        mo6571e(tArr, false);
    }

    /* renamed from: e */
    public void mo6571e(@mr2 T[] tArr, boolean z) {
        mo6565E();
        if (tArr.length != 0) {
            if (z) {
                mo6572f(tArr);
            } else {
                mo6572f(mo6576j(tArr));
            }
        }
    }

    /* renamed from: f */
    public final void mo6572f(T[] tArr) {
        if (tArr.length >= 1) {
            int D = mo6564D(tArr);
            if (this.f5229d == 0) {
                this.f5225a = tArr;
                this.f5229d = D;
                this.f5223a.mo6148c(0, D);
                return;
            }
            mo6583q(tArr, D);
        }
    }

    /* renamed from: g */
    public final void mo6573g(int i, T t) {
        int i2 = this.f5229d;
        if (i <= i2) {
            T[] tArr = this.f5225a;
            if (i2 == tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(this.f5224a, tArr.length + 10);
                System.arraycopy(this.f5225a, 0, tArr2, 0, i);
                tArr2[i] = t;
                System.arraycopy(this.f5225a, i, tArr2, i + 1, this.f5229d - i);
                this.f5225a = tArr2;
            } else {
                System.arraycopy(tArr, i, tArr, i + 1, i2 - i);
                this.f5225a[i] = t;
            }
            this.f5229d++;
            return;
        }
        throw new IndexOutOfBoundsException("cannot add item to " + i + " because size is " + this.f5229d);
    }

    /* renamed from: h */
    public void mo6574h() {
        mo6565E();
        C0956b bVar = this.f5223a;
        if (!(bVar instanceof C0955a)) {
            if (this.f5222a == null) {
                this.f5222a = new C0955a(bVar);
            }
            this.f5223a = this.f5222a;
        }
    }

    /* renamed from: i */
    public void mo6575i() {
        mo6565E();
        int i = this.f5229d;
        if (i != 0) {
            Arrays.fill(this.f5225a, 0, i, (Object) null);
            this.f5229d = 0;
            this.f5223a.mo6147b(0, i);
        }
    }

    /* renamed from: j */
    public final T[] mo6576j(T[] tArr) {
        T[] tArr2 = (Object[]) Array.newInstance(this.f5224a, tArr.length);
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    /* renamed from: k */
    public void mo6577k() {
        mo6565E();
        C0956b bVar = this.f5223a;
        if (bVar instanceof C0955a) {
            ((C0955a) bVar).mo6597i();
        }
        C0956b bVar2 = this.f5223a;
        C0955a aVar = this.f5222a;
        if (bVar2 == aVar) {
            this.f5223a = aVar.f5230a;
        }
    }

    /* renamed from: l */
    public final int mo6578l(T t, T[] tArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            T t2 = tArr[i4];
            int compare = this.f5223a.compare(t2, t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare != 0) {
                i2 = i4;
            } else if (this.f5223a.mo6595f(t2, t)) {
                return i4;
            } else {
                int p = mo6582p(t, i4, i, i2);
                return i3 == 1 ? p == -1 ? i4 : p : p;
            }
        }
        if (i3 == 1) {
            return i;
        }
        return -1;
    }

    /* renamed from: m */
    public final int mo6579m(T t, T[] tArr, int i, int i2) {
        while (i < i2) {
            if (this.f5223a.mo6595f(tArr[i], t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r1 = r3.f5228c;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo6580n(int r4) throws java.lang.IndexOutOfBoundsException {
        /*
            r3 = this;
            int r0 = r3.f5229d
            if (r4 >= r0) goto L_0x001a
            if (r4 < 0) goto L_0x001a
            T[] r0 = r3.f5227b
            if (r0 == 0) goto L_0x0015
            int r1 = r3.f5228c
            if (r4 < r1) goto L_0x0015
            int r4 = r4 - r1
            int r1 = r3.f5221a
            int r4 = r4 + r1
            r4 = r0[r4]
            return r4
        L_0x0015:
            T[] r0 = r3.f5225a
            r4 = r0[r4]
            return r4
        L_0x001a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Asked to get item at "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " but size is "
            r1.append(r4)
            int r4 = r3.f5229d
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0954z.mo6580n(int):java.lang.Object");
    }

    /* renamed from: o */
    public int mo6581o(T t) {
        if (this.f5227b != null) {
            int l = mo6578l(t, this.f5225a, 0, this.f5228c, 4);
            if (l != -1) {
                return l;
            }
            int l2 = mo6578l(t, this.f5227b, this.f5221a, this.f5226b, 4);
            if (l2 != -1) {
                return (l2 - this.f5221a) + this.f5228c;
            }
            return -1;
        }
        return mo6578l(t, this.f5225a, 0, this.f5229d, 4);
    }

    /* renamed from: p */
    public final int mo6582p(T t, int i, int i2, int i3) {
        T t2;
        int i4 = i - 1;
        while (i4 >= i2) {
            T t3 = this.f5225a[i4];
            if (this.f5223a.compare(t3, t) != 0) {
                break;
            } else if (this.f5223a.mo6595f(t3, t)) {
                return i4;
            } else {
                i4--;
            }
        }
        do {
            i++;
            if (i >= i3) {
                return -1;
            }
            t2 = this.f5225a[i];
            if (this.f5223a.compare(t2, t) != 0) {
                return -1;
            }
        } while (!this.f5223a.mo6595f(t2, t));
        return i;
    }

    /* renamed from: q */
    public final void mo6583q(T[] tArr, int i) {
        boolean z = !(this.f5223a instanceof C0955a);
        if (z) {
            mo6574h();
        }
        this.f5227b = this.f5225a;
        int i2 = 0;
        this.f5221a = 0;
        int i3 = this.f5229d;
        this.f5226b = i3;
        this.f5225a = (Object[]) Array.newInstance(this.f5224a, i3 + i + 10);
        this.f5228c = 0;
        while (true) {
            int i4 = this.f5221a;
            int i5 = this.f5226b;
            if (i4 >= i5 && i2 >= i) {
                break;
            } else if (i4 == i5) {
                int i6 = i - i2;
                System.arraycopy(tArr, i2, this.f5225a, this.f5228c, i6);
                int i7 = this.f5228c + i6;
                this.f5228c = i7;
                this.f5229d += i6;
                this.f5223a.mo6148c(i7 - i6, i6);
                break;
            } else if (i2 == i) {
                int i8 = i5 - i4;
                System.arraycopy(this.f5227b, i4, this.f5225a, this.f5228c, i8);
                this.f5228c += i8;
                break;
            } else {
                T t = this.f5227b[i4];
                T t2 = tArr[i2];
                int compare = this.f5223a.compare(t, t2);
                if (compare > 0) {
                    T[] tArr2 = this.f5225a;
                    int i9 = this.f5228c;
                    int i10 = i9 + 1;
                    this.f5228c = i10;
                    tArr2[i9] = t2;
                    this.f5229d++;
                    i2++;
                    this.f5223a.mo6148c(i10 - 1, 1);
                } else if (compare != 0 || !this.f5223a.mo6595f(t, t2)) {
                    T[] tArr3 = this.f5225a;
                    int i11 = this.f5228c;
                    this.f5228c = i11 + 1;
                    tArr3[i11] = t;
                    this.f5221a++;
                } else {
                    T[] tArr4 = this.f5225a;
                    int i12 = this.f5228c;
                    this.f5228c = i12 + 1;
                    tArr4[i12] = t2;
                    i2++;
                    this.f5221a++;
                    if (!this.f5223a.mo6594e(t, t2)) {
                        C0956b bVar = this.f5223a;
                        bVar.mo6146a(this.f5228c - 1, 1, bVar.mo6596g(t, t2));
                    }
                }
            }
        }
        this.f5227b = null;
        if (z) {
            mo6577k();
        }
    }

    /* renamed from: r */
    public void mo6584r(int i) {
        mo6565E();
        Object n = mo6580n(i);
        mo6588v(i, false);
        int b = mo6568b(n, false);
        if (i != b) {
            this.f5223a.mo6149d(i, b);
        }
    }

    /* renamed from: s */
    public boolean mo6585s(T t) {
        mo6565E();
        return mo6586t(t, true);
    }

    /* renamed from: t */
    public final boolean mo6586t(T t, boolean z) {
        int l = mo6578l(t, this.f5225a, 0, this.f5229d, 2);
        if (l == -1) {
            return false;
        }
        mo6588v(l, z);
        return true;
    }

    /* renamed from: u */
    public T mo6587u(int i) {
        mo6565E();
        T n = mo6580n(i);
        mo6588v(i, true);
        return n;
    }

    /* renamed from: v */
    public final void mo6588v(int i, boolean z) {
        T[] tArr = this.f5225a;
        System.arraycopy(tArr, i + 1, tArr, i, (this.f5229d - i) - 1);
        int i2 = this.f5229d - 1;
        this.f5229d = i2;
        this.f5225a[i2] = null;
        if (z) {
            this.f5223a.mo6147b(i, 1);
        }
    }

    /* renamed from: w */
    public void mo6589w(@mr2 Collection<T> collection) {
        mo6591y(collection.toArray((Object[]) Array.newInstance(this.f5224a, collection.size())), true);
    }

    /* renamed from: x */
    public void mo6590x(@mr2 T... tArr) {
        mo6591y(tArr, false);
    }

    /* renamed from: y */
    public void mo6591y(@mr2 T[] tArr, boolean z) {
        mo6565E();
        if (z) {
            mo6561A(tArr);
        } else {
            mo6561A(mo6576j(tArr));
        }
    }

    /* renamed from: z */
    public final void mo6592z(T t) {
        T[] tArr = this.f5225a;
        int i = this.f5228c;
        tArr[i] = t;
        int i2 = i + 1;
        this.f5228c = i2;
        this.f5229d++;
        this.f5223a.mo6148c(i2 - 1, 1);
    }
}

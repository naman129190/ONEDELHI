package com.onedelhi.secure;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.onedelhi.secure.ua */
public final class C3679ua<E> implements Collection<E>, Set<E> {

    /* renamed from: b */
    public static final String f21280b = "ArraySet";

    /* renamed from: b */
    public static final boolean f21281b = false;

    /* renamed from: b */
    public static final int[] f21282b = new int[0];

    /* renamed from: b */
    public static final Object[] f21283b = new Object[0];
    @ts2

    /* renamed from: c */
    public static Object[] f21284c = null;
    @ts2

    /* renamed from: d */
    public static Object[] f21285d = null;

    /* renamed from: o */
    public static final int f21286o = 4;

    /* renamed from: p */
    public static final int f21287p = 10;

    /* renamed from: q */
    public static int f21288q;

    /* renamed from: r */
    public static int f21289r;

    /* renamed from: a */
    public nc2<E, E> f21290a;

    /* renamed from: a */
    public int[] f21291a;

    /* renamed from: a */
    public Object[] f21292a;

    /* renamed from: n */
    public int f21293n;

    /* renamed from: com.onedelhi.secure.ua$a */
    public class C3680a extends nc2<E, E> {
        public C3680a() {
        }

        /* renamed from: a */
        public void mo21074a() {
            C3679ua.this.clear();
        }

        /* renamed from: b */
        public Object mo21075b(int i, int i2) {
            return C3679ua.this.f21292a[i];
        }

        /* renamed from: c */
        public Map<E, E> mo21076c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: d */
        public int mo21077d() {
            return C3679ua.this.f21293n;
        }

        /* renamed from: e */
        public int mo21078e(Object obj) {
            return C3679ua.this.indexOf(obj);
        }

        /* renamed from: f */
        public int mo21079f(Object obj) {
            return C3679ua.this.indexOf(obj);
        }

        /* renamed from: g */
        public void mo21080g(E e, E e2) {
            C3679ua.this.add(e);
        }

        /* renamed from: h */
        public void mo21081h(int i) {
            C3679ua.this.mo25488n(i);
        }

        /* renamed from: i */
        public E mo21082i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C3679ua() {
        this(0);
    }

    public C3679ua(int i) {
        if (i == 0) {
            this.f21291a = f21282b;
            this.f21292a = f21283b;
        } else {
            mo25477e(i);
        }
        this.f21293n = 0;
    }

    public C3679ua(@ts2 C3679ua<E> uaVar) {
        this();
        if (uaVar != null) {
            mo25473b(uaVar);
        }
    }

    public C3679ua(@ts2 Collection<E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    /* renamed from: g */
    public static void m29202g(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C3679ua.class) {
                if (f21289r < 10) {
                    objArr[0] = f21285d;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f21285d = objArr;
                    f21289r++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C3679ua.class) {
                if (f21288q < 10) {
                    objArr[0] = f21284c;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f21284c = objArr;
                    f21288q++;
                }
            }
        }
    }

    public boolean add(@ts2 E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = mo25486k();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = mo25485j(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f21293n;
        int[] iArr = this.f21291a;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f21292a;
            mo25477e(i5);
            int[] iArr2 = this.f21291a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f21292a, 0, objArr.length);
            }
            m29202g(iArr, objArr, this.f21293n);
        }
        int i6 = this.f21293n;
        if (i3 < i6) {
            int[] iArr3 = this.f21291a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f21292a;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f21293n - i3);
        }
        this.f21291a[i3] = i;
        this.f21292a[i3] = e;
        this.f21293n++;
        return true;
    }

    public boolean addAll(@mr2 Collection<? extends E> collection) {
        mo25479f(this.f21293n + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: b */
    public void mo25473b(@mr2 C3679ua<? extends E> uaVar) {
        int i = uaVar.f21293n;
        mo25479f(this.f21293n + i);
        if (this.f21293n != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(uaVar.mo25489o(i2));
            }
        } else if (i > 0) {
            System.arraycopy(uaVar.f21291a, 0, this.f21291a, 0, i);
            System.arraycopy(uaVar.f21292a, 0, this.f21292a, 0, i);
            this.f21293n = i;
        }
    }

    public void clear() {
        int i = this.f21293n;
        if (i != 0) {
            m29202g(this.f21291a, this.f21292a, i);
            this.f21291a = f21282b;
            this.f21292a = f21283b;
            this.f21293n = 0;
        }
    }

    public boolean contains(@ts2 Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(@mr2 Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void mo25477e(int i) {
        if (i == 8) {
            synchronized (C3679ua.class) {
                Object[] objArr = f21285d;
                if (objArr != null) {
                    this.f21292a = objArr;
                    f21285d = (Object[]) objArr[0];
                    this.f21291a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f21289r--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C3679ua.class) {
                Object[] objArr2 = f21284c;
                if (objArr2 != null) {
                    this.f21292a = objArr2;
                    f21284c = (Object[]) objArr2[0];
                    this.f21291a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f21288q--;
                    return;
                }
            }
        }
        this.f21291a = new int[i];
        this.f21292a = new Object[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f21293n) {
                try {
                    if (!set.contains(mo25489o(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo25479f(int i) {
        int[] iArr = this.f21291a;
        if (iArr.length < i) {
            Object[] objArr = this.f21292a;
            mo25477e(i);
            int i2 = this.f21293n;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f21291a, 0, i2);
                System.arraycopy(objArr, 0, this.f21292a, 0, this.f21293n);
            }
            m29202g(iArr, objArr, this.f21293n);
        }
    }

    public int hashCode() {
        int[] iArr = this.f21291a;
        int i = this.f21293n;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public final nc2<E, E> mo25481i() {
        if (this.f21290a == null) {
            this.f21290a = new C3680a();
        }
        return this.f21290a;
    }

    public int indexOf(@ts2 Object obj) {
        return obj == null ? mo25486k() : mo25485j(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f21293n <= 0;
    }

    public Iterator<E> iterator() {
        return mo25481i().mo21084m().iterator();
    }

    /* renamed from: j */
    public final int mo25485j(Object obj, int i) {
        int i2 = this.f21293n;
        if (i2 == 0) {
            return -1;
        }
        int a = w60.m30693a(this.f21291a, i2, i);
        if (a < 0 || obj.equals(this.f21292a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f21291a[i3] == i) {
            if (obj.equals(this.f21292a[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f21291a[i4] == i) {
            if (obj.equals(this.f21292a[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: k */
    public final int mo25486k() {
        int i = this.f21293n;
        if (i == 0) {
            return -1;
        }
        int a = w60.m30693a(this.f21291a, i, 0);
        if (a < 0 || this.f21292a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f21291a[i2] == 0) {
            if (this.f21292a[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f21291a[i3] == 0) {
            if (this.f21292a[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: l */
    public boolean mo25487l(@mr2 C3679ua<? extends E> uaVar) {
        int i = uaVar.f21293n;
        int i2 = this.f21293n;
        for (int i3 = 0; i3 < i; i3++) {
            remove(uaVar.mo25489o(i3));
        }
        return i2 != this.f21293n;
    }

    /* renamed from: n */
    public E mo25488n(int i) {
        E[] eArr = this.f21292a;
        E e = eArr[i];
        int i2 = this.f21293n;
        if (i2 <= 1) {
            m29202g(this.f21291a, eArr, i2);
            this.f21291a = f21282b;
            this.f21292a = f21283b;
            this.f21293n = 0;
        } else {
            int[] iArr = this.f21291a;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f21293n = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f21292a;
                    System.arraycopy(objArr, i5, objArr, i, this.f21293n - i);
                }
                this.f21292a[this.f21293n] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                mo25477e(i3);
                this.f21293n--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f21291a, 0, i);
                    System.arraycopy(eArr, 0, this.f21292a, 0, i);
                }
                int i6 = this.f21293n;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f21291a, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f21292a, i, this.f21293n - i);
                }
            }
        }
        return e;
    }

    @ts2
    /* renamed from: o */
    public E mo25489o(int i) {
        return this.f21292a[i];
    }

    public boolean remove(@ts2 Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo25488n(indexOf);
        return true;
    }

    public boolean removeAll(@mr2 Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(@mr2 Collection<?> collection) {
        boolean z = false;
        for (int i = this.f21293n - 1; i >= 0; i--) {
            if (!collection.contains(this.f21292a[i])) {
                mo25488n(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f21293n;
    }

    @mr2
    public Object[] toArray() {
        int i = this.f21293n;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f21292a, 0, objArr, 0, i);
        return objArr;
    }

    @mr2
    public <T> T[] toArray(@mr2 T[] tArr) {
        if (tArr.length < this.f21293n) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f21293n);
        }
        System.arraycopy(this.f21292a, 0, tArr, 0, this.f21293n);
        int length = tArr.length;
        int i = this.f21293n;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f21293n * 14);
        sb.append('{');
        for (int i = 0; i < this.f21293n; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object o = mo25489o(i);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

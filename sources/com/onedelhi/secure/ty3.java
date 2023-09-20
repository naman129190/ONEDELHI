package com.onedelhi.secure;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class ty3<K, V> {

    /* renamed from: b */
    public static final String f21169b = "ArrayMap";

    /* renamed from: b */
    public static final boolean f21170b = false;
    @ts2

    /* renamed from: b */
    public static Object[] f21171b = null;

    /* renamed from: c */
    public static final boolean f21172c = true;
    @ts2

    /* renamed from: c */
    public static Object[] f21173c = null;

    /* renamed from: o */
    public static final int f21174o = 4;

    /* renamed from: p */
    public static final int f21175p = 10;

    /* renamed from: q */
    public static int f21176q;

    /* renamed from: r */
    public static int f21177r;

    /* renamed from: a */
    public int[] f21178a;

    /* renamed from: a */
    public Object[] f21179a;

    /* renamed from: n */
    public int f21180n;

    public ty3() {
        this.f21178a = w60.f22052a;
        this.f21179a = w60.f22054a;
        this.f21180n = 0;
    }

    public ty3(int i) {
        if (i == 0) {
            this.f21178a = w60.f22052a;
            this.f21179a = w60.f22054a;
        } else {
            m29011c(i);
        }
        this.f21180n = 0;
    }

    public ty3(ty3<K, V> ty3) {
        this();
        if (ty3 != null) {
            mo17950n(ty3);
        }
    }

    /* renamed from: c */
    private void m29011c(int i) {
        Class<ty3> cls = ty3.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f21173c;
                if (objArr != null) {
                    this.f21179a = objArr;
                    f21173c = (Object[]) objArr[0];
                    this.f21178a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f21177r--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f21171b;
                if (objArr2 != null) {
                    this.f21179a = objArr2;
                    f21171b = (Object[]) objArr2[0];
                    this.f21178a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f21176q--;
                    return;
                }
            }
        }
        this.f21178a = new int[i];
        this.f21179a = new Object[(i << 1)];
    }

    /* renamed from: d */
    public static int m29012d(int[] iArr, int i, int i2) {
        try {
            return w60.m30693a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public static void m29013g(int[] iArr, Object[] objArr, int i) {
        Class<ty3> cls = ty3.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f21177r < 10) {
                    objArr[0] = f21173c;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f21173c = objArr;
                    f21177r++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f21176q < 10) {
                    objArr[0] = f21171b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f21171b = objArr;
                    f21176q++;
                }
            }
        }
    }

    public void clear() {
        int i = this.f21180n;
        if (i > 0) {
            int[] iArr = this.f21178a;
            Object[] objArr = this.f21179a;
            this.f21178a = w60.f22052a;
            this.f21179a = w60.f22054a;
            this.f21180n = 0;
            m29013g(iArr, objArr, i);
        }
        if (this.f21180n > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@ts2 Object obj) {
        return mo25346i(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo25349l(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ty3) {
            ty3 ty3 = (ty3) obj;
            if (size() != ty3.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f21180n) {
                try {
                    Object m = mo25350m(i);
                    Object q = mo25352q(i);
                    Object obj2 = ty3.get(m);
                    if (q == null) {
                        if (obj2 != null || !ty3.containsKey(m)) {
                            return false;
                        }
                    } else if (!q.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f21180n) {
                try {
                    Object m2 = mo25350m(i2);
                    Object q2 = mo25352q(i2);
                    Object obj3 = map.get(m2);
                    if (q2 == null) {
                        if (obj3 != null || !map.containsKey(m2)) {
                            return false;
                        }
                    } else if (!q2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo25342f(int i) {
        int i2 = this.f21180n;
        int[] iArr = this.f21178a;
        if (iArr.length < i) {
            Object[] objArr = this.f21179a;
            m29011c(i);
            if (this.f21180n > 0) {
                System.arraycopy(iArr, 0, this.f21178a, 0, i2);
                System.arraycopy(objArr, 0, this.f21179a, 0, i2 << 1);
            }
            m29013g(iArr, objArr, i2);
        }
        if (this.f21180n != i2) {
            throw new ConcurrentModificationException();
        }
    }

    @ts2
    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int i = mo25346i(obj);
        return i >= 0 ? this.f21179a[(i << 1) + 1] : v;
    }

    /* renamed from: h */
    public int mo25345h(Object obj, int i) {
        int i2 = this.f21180n;
        if (i2 == 0) {
            return -1;
        }
        int d = m29012d(this.f21178a, i2, i);
        if (d < 0 || obj.equals(this.f21179a[d << 1])) {
            return d;
        }
        int i3 = d + 1;
        while (i3 < i2 && this.f21178a[i3] == i) {
            if (obj.equals(this.f21179a[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = d - 1;
        while (i4 >= 0 && this.f21178a[i4] == i) {
            if (obj.equals(this.f21179a[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public int hashCode() {
        int[] iArr = this.f21178a;
        Object[] objArr = this.f21179a;
        int i = this.f21180n;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public int mo25346i(@ts2 Object obj) {
        return obj == null ? mo25348j() : mo25345h(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f21180n <= 0;
    }

    /* renamed from: j */
    public int mo25348j() {
        int i = this.f21180n;
        if (i == 0) {
            return -1;
        }
        int d = m29012d(this.f21178a, i, 0);
        if (d < 0 || this.f21179a[d << 1] == null) {
            return d;
        }
        int i2 = d + 1;
        while (i2 < i && this.f21178a[i2] == 0) {
            if (this.f21179a[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = d - 1;
        while (i3 >= 0 && this.f21178a[i3] == 0) {
            if (this.f21179a[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo25349l(Object obj) {
        int i = this.f21180n * 2;
        Object[] objArr = this.f21179a;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public K mo25350m(int i) {
        return this.f21179a[i << 1];
    }

    /* renamed from: n */
    public void mo17950n(@mr2 ty3<? extends K, ? extends V> ty3) {
        int i = ty3.f21180n;
        mo25342f(this.f21180n + i);
        if (this.f21180n != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(ty3.mo25350m(i2), ty3.mo25352q(i2));
            }
        } else if (i > 0) {
            System.arraycopy(ty3.f21178a, 0, this.f21178a, 0, i);
            System.arraycopy(ty3.f21179a, 0, this.f21179a, 0, i << 1);
            this.f21180n = i;
        }
    }

    /* renamed from: o */
    public V mo4015o(int i) {
        V[] vArr = this.f21179a;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f21180n;
        int i4 = 0;
        if (i3 <= 1) {
            m29013g(this.f21178a, vArr, i3);
            this.f21178a = w60.f22052a;
            this.f21179a = w60.f22054a;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f21178a;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f21179a;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f21179a;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m29011c(i6);
                if (i3 == this.f21180n) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f21178a, 0, i);
                        System.arraycopy(vArr, 0, this.f21179a, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f21178a, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f21179a, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f21180n) {
            this.f21180n = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: p */
    public V mo4016p(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f21179a;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    @ts2
    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f21180n;
        if (k == null) {
            i2 = mo25348j();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo25345h(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f21179a;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f21178a;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f21179a;
            m29011c(i6);
            if (i3 == this.f21180n) {
                int[] iArr2 = this.f21178a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f21179a, 0, objArr.length);
                }
                m29013g(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f21178a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f21179a;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f21180n - i5) << 1);
        }
        int i8 = this.f21180n;
        if (i3 == i8) {
            int[] iArr4 = this.f21178a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f21179a;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f21180n = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @ts2
    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    /* renamed from: q */
    public V mo25352q(int i) {
        return this.f21179a[(i << 1) + 1];
    }

    @ts2
    public V remove(Object obj) {
        int i = mo25346i(obj);
        if (i >= 0) {
            return mo4015o(i);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int i = mo25346i(obj);
        if (i < 0) {
            return false;
        }
        Object q = mo25352q(i);
        if (obj2 != q && (obj2 == null || !obj2.equals(q))) {
            return false;
        }
        mo4015o(i);
        return true;
    }

    @ts2
    public V replace(K k, V v) {
        int i = mo25346i(k);
        if (i >= 0) {
            return mo4016p(i, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int i = mo25346i(k);
        if (i < 0) {
            return false;
        }
        V q = mo25352q(i);
        if (q != v && (v == null || !v.equals(q))) {
            return false;
        }
        mo4016p(i, v2);
        return true;
    }

    public int size() {
        return this.f21180n;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f21180n * 28);
        sb.append('{');
        for (int i = 0; i < this.f21180n; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object m = mo25350m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object q = mo25352q(i);
            if (q != this) {
                sb.append(q);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

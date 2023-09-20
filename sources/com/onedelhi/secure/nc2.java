package com.onedelhi.secure;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class nc2<K, V> {
    @ts2

    /* renamed from: a */
    public nc2<K, V>.b f17303a;
    @ts2

    /* renamed from: a */
    public nc2<K, V>.c f17304a;
    @ts2

    /* renamed from: a */
    public nc2<K, V>.e f17305a;

    /* renamed from: com.onedelhi.secure.nc2$a */
    public final class C2960a<T> implements Iterator<T> {

        /* renamed from: b */
        public boolean f17307b = false;

        /* renamed from: n */
        public final int f17308n;

        /* renamed from: o */
        public int f17309o;

        /* renamed from: p */
        public int f17310p;

        public C2960a(int i) {
            this.f17308n = i;
            this.f17309o = nc2.this.mo21077d();
        }

        public boolean hasNext() {
            return this.f17310p < this.f17309o;
        }

        public T next() {
            if (hasNext()) {
                T b = nc2.this.mo21075b(this.f17310p, this.f17308n);
                this.f17310p++;
                this.f17307b = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f17307b) {
                int i = this.f17310p - 1;
                this.f17310p = i;
                this.f17309o--;
                this.f17307b = false;
                nc2.this.mo21081h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.onedelhi.secure.nc2$b */
    public final class C2961b implements Set<Map.Entry<K, V>> {
        public C2961b() {
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = nc2.this.mo21077d();
            for (Map.Entry entry : collection) {
                nc2.this.mo21080g(entry.getKey(), entry.getValue());
            }
            return d != nc2.this.mo21077d();
        }

        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            nc2.this.mo21074a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = nc2.this.mo21078e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return w60.m30695c(nc2.this.mo21075b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return nc2.m22659k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = nc2.this.mo21077d() - 1; d >= 0; d--) {
                Object b = nc2.this.mo21075b(d, 0);
                Object b2 = nc2.this.mo21075b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return nc2.this.mo21077d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C2963d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return nc2.this.mo21077d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.onedelhi.secure.nc2$c */
    public final class C2962c implements Set<K> {
        public C2962c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            nc2.this.mo21074a();
        }

        public boolean contains(Object obj) {
            return nc2.this.mo21078e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return nc2.m22658j(nc2.this.mo21076c(), collection);
        }

        public boolean equals(Object obj) {
            return nc2.m22659k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = nc2.this.mo21077d() - 1; d >= 0; d--) {
                Object b = nc2.this.mo21075b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return nc2.this.mo21077d() == 0;
        }

        public Iterator<K> iterator() {
            return new C2960a(0);
        }

        public boolean remove(Object obj) {
            int e = nc2.this.mo21078e(obj);
            if (e < 0) {
                return false;
            }
            nc2.this.mo21081h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return nc2.m22660o(nc2.this.mo21076c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return nc2.m22661p(nc2.this.mo21076c(), collection);
        }

        public int size() {
            return nc2.this.mo21077d();
        }

        public Object[] toArray() {
            return nc2.this.mo21086q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return nc2.this.mo21087r(tArr, 0);
        }
    }

    /* renamed from: com.onedelhi.secure.nc2$d */
    public final class C2963d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        public boolean f17314b = false;

        /* renamed from: n */
        public int f17315n;

        /* renamed from: o */
        public int f17316o;

        public C2963d() {
            this.f17315n = nc2.this.mo21077d() - 1;
            this.f17316o = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f17316o++;
                this.f17314b = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f17314b) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return w60.m30695c(entry.getKey(), nc2.this.mo21075b(this.f17316o, 0)) && w60.m30695c(entry.getValue(), nc2.this.mo21075b(this.f17316o, 1));
            }
        }

        public K getKey() {
            if (this.f17314b) {
                return nc2.this.mo21075b(this.f17316o, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f17314b) {
                return nc2.this.mo21075b(this.f17316o, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f17316o < this.f17315n;
        }

        public int hashCode() {
            if (this.f17314b) {
                int i = 0;
                Object b = nc2.this.mo21075b(this.f17316o, 0);
                Object b2 = nc2.this.mo21075b(this.f17316o, 1);
                int hashCode = b == null ? 0 : b.hashCode();
                if (b2 != null) {
                    i = b2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f17314b) {
                nc2.this.mo21081h(this.f17316o);
                this.f17316o--;
                this.f17315n--;
                this.f17314b = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f17314b) {
                return nc2.this.mo21082i(this.f17316o, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + a13.f25713a + getValue();
        }
    }

    /* renamed from: com.onedelhi.secure.nc2$e */
    public final class C2964e implements Collection<V> {
        public C2964e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            nc2.this.mo21074a();
        }

        public boolean contains(Object obj) {
            return nc2.this.mo21079f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return nc2.this.mo21077d() == 0;
        }

        public Iterator<V> iterator() {
            return new C2960a(1);
        }

        public boolean remove(Object obj) {
            int f = nc2.this.mo21079f(obj);
            if (f < 0) {
                return false;
            }
            nc2.this.mo21081h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = nc2.this.mo21077d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(nc2.this.mo21075b(i, 1))) {
                    nc2.this.mo21081h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = nc2.this.mo21077d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(nc2.this.mo21075b(i, 1))) {
                    nc2.this.mo21081h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return nc2.this.mo21077d();
        }

        public Object[] toArray() {
            return nc2.this.mo21086q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return nc2.this.mo21087r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m22658j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m22659k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m22660o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m22661p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public abstract void mo21074a();

    /* renamed from: b */
    public abstract Object mo21075b(int i, int i2);

    /* renamed from: c */
    public abstract Map<K, V> mo21076c();

    /* renamed from: d */
    public abstract int mo21077d();

    /* renamed from: e */
    public abstract int mo21078e(Object obj);

    /* renamed from: f */
    public abstract int mo21079f(Object obj);

    /* renamed from: g */
    public abstract void mo21080g(K k, V v);

    /* renamed from: h */
    public abstract void mo21081h(int i);

    /* renamed from: i */
    public abstract V mo21082i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo21083l() {
        if (this.f17303a == null) {
            this.f17303a = new C2961b();
        }
        return this.f17303a;
    }

    /* renamed from: m */
    public Set<K> mo21084m() {
        if (this.f17304a == null) {
            this.f17304a = new C2962c();
        }
        return this.f17304a;
    }

    /* renamed from: n */
    public Collection<V> mo21085n() {
        if (this.f17305a == null) {
            this.f17305a = new C2964e();
        }
        return this.f17305a;
    }

    /* renamed from: q */
    public Object[] mo21086q(int i) {
        int d = mo21077d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo21075b(i2, i);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] mo21087r(T[] tArr, int i) {
        int d = mo21077d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo21075b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}

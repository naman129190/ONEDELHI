package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class nq3<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    public C2998c<K, V> f17530a;

    /* renamed from: a */
    public WeakHashMap<C3001f<K, V>, Boolean> f17531a = new WeakHashMap<>();

    /* renamed from: b */
    public C2998c<K, V> f17532b;

    /* renamed from: n */
    public int f17533n = 0;

    /* renamed from: com.onedelhi.secure.nq3$a */
    public static class C2996a<K, V> extends C3000e<K, V> {
        public C2996a(C2998c<K, V> cVar, C2998c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public C2998c<K, V> mo21430b(C2998c<K, V> cVar) {
            return cVar.f17536b;
        }

        /* renamed from: d */
        public C2998c<K, V> mo21431d(C2998c<K, V> cVar) {
            return cVar.f17534a;
        }
    }

    /* renamed from: com.onedelhi.secure.nq3$b */
    public static class C2997b<K, V> extends C3000e<K, V> {
        public C2997b(C2998c<K, V> cVar, C2998c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public C2998c<K, V> mo21430b(C2998c<K, V> cVar) {
            return cVar.f17534a;
        }

        /* renamed from: d */
        public C2998c<K, V> mo21431d(C2998c<K, V> cVar) {
            return cVar.f17536b;
        }
    }

    /* renamed from: com.onedelhi.secure.nq3$c */
    public static class C2998c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        public C2998c<K, V> f17534a;
        @mr2

        /* renamed from: a */
        public final K f17535a;

        /* renamed from: b */
        public C2998c<K, V> f17536b;
        @mr2

        /* renamed from: b */
        public final V f17537b;

        public C2998c(@mr2 K k, @mr2 V v) {
            this.f17535a = k;
            this.f17537b = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2998c)) {
                return false;
            }
            C2998c cVar = (C2998c) obj;
            return this.f17535a.equals(cVar.f17535a) && this.f17537b.equals(cVar.f17537b);
        }

        @mr2
        public K getKey() {
            return this.f17535a;
        }

        @mr2
        public V getValue() {
            return this.f17537b;
        }

        public int hashCode() {
            return this.f17535a.hashCode() ^ this.f17537b.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f17535a + a13.f25713a + this.f17537b;
        }
    }

    /* renamed from: com.onedelhi.secure.nq3$d */
    public class C2999d implements Iterator<Map.Entry<K, V>>, C3001f<K, V> {

        /* renamed from: a */
        public C2998c<K, V> f17538a;

        /* renamed from: b */
        public boolean f17540b = true;

        public C2999d() {
        }

        /* renamed from: a */
        public void mo21438a(@mr2 C2998c<K, V> cVar) {
            C2998c<K, V> cVar2 = this.f17538a;
            if (cVar == cVar2) {
                C2998c<K, V> cVar3 = cVar2.f17536b;
                this.f17538a = cVar3;
                this.f17540b = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            C2998c<K, V> cVar;
            if (this.f17540b) {
                this.f17540b = false;
                cVar = nq3.this.f17530a;
            } else {
                C2998c<K, V> cVar2 = this.f17538a;
                cVar = cVar2 != null ? cVar2.f17534a : null;
            }
            this.f17538a = cVar;
            return this.f17538a;
        }

        public boolean hasNext() {
            if (this.f17540b) {
                return nq3.this.f17530a != null;
            }
            C2998c<K, V> cVar = this.f17538a;
            return (cVar == null || cVar.f17534a == null) ? false : true;
        }
    }

    /* renamed from: com.onedelhi.secure.nq3$e */
    public static abstract class C3000e<K, V> implements Iterator<Map.Entry<K, V>>, C3001f<K, V> {

        /* renamed from: a */
        public C2998c<K, V> f17541a;

        /* renamed from: b */
        public C2998c<K, V> f17542b;

        public C3000e(C2998c<K, V> cVar, C2998c<K, V> cVar2) {
            this.f17541a = cVar2;
            this.f17542b = cVar;
        }

        /* renamed from: a */
        public void mo21438a(@mr2 C2998c<K, V> cVar) {
            if (this.f17541a == cVar && cVar == this.f17542b) {
                this.f17542b = null;
                this.f17541a = null;
            }
            C2998c<K, V> cVar2 = this.f17541a;
            if (cVar2 == cVar) {
                this.f17541a = mo21430b(cVar2);
            }
            if (this.f17542b == cVar) {
                this.f17542b = mo21443f();
            }
        }

        /* renamed from: b */
        public abstract C2998c<K, V> mo21430b(C2998c<K, V> cVar);

        /* renamed from: d */
        public abstract C2998c<K, V> mo21431d(C2998c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            C2998c<K, V> cVar = this.f17542b;
            this.f17542b = mo21443f();
            return cVar;
        }

        /* renamed from: f */
        public final C2998c<K, V> mo21443f() {
            C2998c<K, V> cVar = this.f17542b;
            C2998c<K, V> cVar2 = this.f17541a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo21431d(cVar);
        }

        public boolean hasNext() {
            return this.f17542b != null;
        }
    }

    /* renamed from: com.onedelhi.secure.nq3$f */
    public interface C3001f<K, V> {
        /* renamed from: a */
        void mo21438a(@mr2 C2998c<K, V> cVar);
    }

    /* renamed from: b */
    public Iterator<Map.Entry<K, V>> mo21420b() {
        C2997b bVar = new C2997b(this.f17532b, this.f17530a);
        this.f17531a.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: e */
    public Map.Entry<K, V> mo21421e() {
        return this.f17530a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nq3)) {
            return false;
        }
        nq3 nq3 = (nq3) obj;
        if (size() != nq3.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = nq3.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    /* renamed from: f */
    public C2998c<K, V> mo13877f(K k) {
        C2998c<K, V> cVar = this.f17530a;
        while (cVar != null && !cVar.f17535a.equals(k)) {
            cVar = cVar.f17534a;
        }
        return cVar;
    }

    /* renamed from: g */
    public nq3<K, V>.d mo21423g() {
        nq3<K, V>.d dVar = new C2999d();
        this.f17531a.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public Map.Entry<K, V> mo21425i() {
        return this.f17532b;
    }

    @mr2
    public Iterator<Map.Entry<K, V>> iterator() {
        C2996a aVar = new C2996a(this.f17530a, this.f17532b);
        this.f17531a.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: j */
    public C2998c<K, V> mo21427j(@mr2 K k, @mr2 V v) {
        C2998c<K, V> cVar = new C2998c<>(k, v);
        this.f17533n++;
        C2998c<K, V> cVar2 = this.f17532b;
        if (cVar2 == null) {
            this.f17530a = cVar;
        } else {
            cVar2.f17534a = cVar;
            cVar.f17536b = cVar2;
        }
        this.f17532b = cVar;
        return cVar;
    }

    /* renamed from: k */
    public V mo13878k(@mr2 K k, @mr2 V v) {
        C2998c f = mo13877f(k);
        if (f != null) {
            return f.f17537b;
        }
        mo21427j(k, v);
        return null;
    }

    /* renamed from: l */
    public V mo13879l(@mr2 K k) {
        C2998c f = mo13877f(k);
        if (f == null) {
            return null;
        }
        this.f17533n--;
        if (!this.f17531a.isEmpty()) {
            for (C3001f<K, V> a : this.f17531a.keySet()) {
                a.mo21438a(f);
            }
        }
        C2998c<K, V> cVar = f.f17536b;
        C2998c<K, V> cVar2 = f.f17534a;
        if (cVar != null) {
            cVar.f17534a = cVar2;
        } else {
            this.f17530a = cVar2;
        }
        C2998c<K, V> cVar3 = f.f17534a;
        if (cVar3 != null) {
            cVar3.f17536b = cVar;
        } else {
            this.f17532b = cVar;
        }
        f.f17534a = null;
        f.f17536b = null;
        return f.f17537b;
    }

    public int size() {
        return this.f17533n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

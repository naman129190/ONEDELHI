package com.onedelhi.secure;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class t32<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: b */
    public static final Comparator<Comparable> f35393b = new C6827a();

    /* renamed from: b */
    public static final /* synthetic */ boolean f35394b = false;

    /* renamed from: a */
    public t32<K, V>.b f35395a;

    /* renamed from: a */
    public t32<K, V>.c f35396a;

    /* renamed from: a */
    public C6833e<K, V> f35397a;

    /* renamed from: a */
    public Comparator<? super K> f35398a;

    /* renamed from: b */
    public final C6833e<K, V> f35399b;

    /* renamed from: n */
    public int f35400n;

    /* renamed from: o */
    public int f35401o;

    /* renamed from: com.onedelhi.secure.t32$a */
    public class C6827a implements Comparator<Comparable> {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.onedelhi.secure.t32$b */
    public class C6828b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.onedelhi.secure.t32$b$a */
        public class C6829a extends t32<K, V>.d<Map.Entry<K, V>> {
            public C6829a() {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return mo44808a();
            }
        }

        public C6828b() {
        }

        public void clear() {
            t32.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && t32.this.mo44778f((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C6829a();
        }

        public boolean remove(Object obj) {
            C6833e f;
            if (!(obj instanceof Map.Entry) || (f = t32.this.mo44778f((Map.Entry) obj)) == null) {
                return false;
            }
            t32.this.mo44783j(f, true);
            return true;
        }

        public int size() {
            return t32.this.f35400n;
        }
    }

    /* renamed from: com.onedelhi.secure.t32$c */
    public final class C6830c extends AbstractSet<K> {

        /* renamed from: com.onedelhi.secure.t32$c$a */
        public class C6831a extends t32<K, V>.d<K> {
            public C6831a() {
                super();
            }

            public K next() {
                return mo44808a().f35411a;
            }
        }

        public C6830c() {
        }

        public void clear() {
            t32.this.clear();
        }

        public boolean contains(Object obj) {
            return t32.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C6831a();
        }

        public boolean remove(Object obj) {
            return t32.this.mo44785l(obj) != null;
        }

        public int size() {
            return t32.this.f35400n;
        }
    }

    /* renamed from: com.onedelhi.secure.t32$d */
    public abstract class C6832d<T> implements Iterator<T> {

        /* renamed from: a */
        public C6833e<K, V> f35406a;

        /* renamed from: b */
        public C6833e<K, V> f35408b = null;

        /* renamed from: n */
        public int f35409n;

        public C6832d() {
            this.f35406a = t32.this.f35399b.f35415d;
            this.f35409n = t32.this.f35401o;
        }

        /* renamed from: a */
        public final C6833e<K, V> mo44808a() {
            C6833e<K, V> eVar = this.f35406a;
            t32 t32 = t32.this;
            if (eVar == t32.f35399b) {
                throw new NoSuchElementException();
            } else if (t32.f35401o == this.f35409n) {
                this.f35406a = eVar.f35415d;
                this.f35408b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f35406a != t32.this.f35399b;
        }

        public final void remove() {
            C6833e<K, V> eVar = this.f35408b;
            if (eVar != null) {
                t32.this.mo44783j(eVar, true);
                this.f35408b = null;
                this.f35409n = t32.this.f35401o;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.onedelhi.secure.t32$e */
    public static final class C6833e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        public C6833e<K, V> f35410a;

        /* renamed from: a */
        public final K f35411a;

        /* renamed from: b */
        public C6833e<K, V> f35412b;

        /* renamed from: b */
        public V f35413b;

        /* renamed from: c */
        public C6833e<K, V> f35414c;

        /* renamed from: d */
        public C6833e<K, V> f35415d;

        /* renamed from: e */
        public C6833e<K, V> f35416e;

        /* renamed from: n */
        public int f35417n;

        public C6833e() {
            this.f35411a = null;
            this.f35416e = this;
            this.f35415d = this;
        }

        public C6833e(C6833e<K, V> eVar, K k, C6833e<K, V> eVar2, C6833e<K, V> eVar3) {
            this.f35410a = eVar;
            this.f35411a = k;
            this.f35417n = 1;
            this.f35415d = eVar2;
            this.f35416e = eVar3;
            eVar3.f35415d = this;
            eVar2.f35416e = this;
        }

        /* renamed from: a */
        public C6833e<K, V> mo44811a() {
            C6833e<K, V> eVar = this;
            for (C6833e<K, V> eVar2 = this.f35412b; eVar2 != null; eVar2 = eVar2.f35412b) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C6833e<K, V> mo44812b() {
            C6833e<K, V> eVar = this;
            for (C6833e<K, V> eVar2 = this.f35414c; eVar2 != null; eVar2 = eVar2.f35414c) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f35411a
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f35413b
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.t32.C6833e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f35411a;
        }

        public V getValue() {
            return this.f35413b;
        }

        public int hashCode() {
            K k = this.f35411a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f35413b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f35413b;
            this.f35413b = v;
            return v2;
        }

        public String toString() {
            return this.f35411a + a13.f25713a + this.f35413b;
        }
    }

    static {
        Class<t32> cls = t32.class;
    }

    public t32() {
        this(f35393b);
    }

    public t32(Comparator<? super K> comparator) {
        this.f35400n = 0;
        this.f35401o = 0;
        this.f35399b = new C6833e<>();
        this.f35398a = comparator == null ? f35393b : comparator;
    }

    /* renamed from: c */
    public final boolean mo44773c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void clear() {
        this.f35397a = null;
        this.f35400n = 0;
        this.f35401o++;
        C6833e<K, V> eVar = this.f35399b;
        eVar.f35416e = eVar;
        eVar.f35415d = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo44779g(obj) != null;
    }

    /* renamed from: d */
    public C6833e<K, V> mo44776d(K k, boolean z) {
        int i;
        C6833e<K, V> eVar;
        Comparator<? super K> comparator = this.f35398a;
        C6833e<K, V> eVar2 = this.f35397a;
        if (eVar2 != null) {
            Comparable comparable = comparator == f35393b ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.f35411a;
                i = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (i == 0) {
                    return eVar2;
                }
                C6833e<K, V> eVar3 = i < 0 ? eVar2.f35412b : eVar2.f35414c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C6833e<K, V> eVar4 = this.f35399b;
        if (eVar2 != null) {
            eVar = new C6833e<>(eVar2, k, eVar4, eVar4.f35416e);
            if (i < 0) {
                eVar2.f35412b = eVar;
            } else {
                eVar2.f35414c = eVar;
            }
            mo44782i(eVar2, true);
        } else if (comparator != f35393b || (k instanceof Comparable)) {
            eVar = new C6833e<>(eVar2, k, eVar4, eVar4.f35416e);
            this.f35397a = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.f35400n++;
        this.f35401o++;
        return eVar;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        t32<K, V>.b bVar = this.f35395a;
        if (bVar != null) {
            return bVar;
        }
        t32<K, V>.b bVar2 = new C6828b();
        this.f35395a = bVar2;
        return bVar2;
    }

    /* renamed from: f */
    public C6833e<K, V> mo44778f(Map.Entry<?, ?> entry) {
        C6833e<K, V> g = mo44779g(entry.getKey());
        if (g != null && mo44773c(g.f35413b, entry.getValue())) {
            return g;
        }
        return null;
    }

    /* renamed from: g */
    public C6833e<K, V> mo44779g(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo44776d(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public V get(Object obj) {
        C6833e g = mo44779g(obj);
        if (g != null) {
            return g.f35413b;
        }
        return null;
    }

    /* renamed from: h */
    public final void mo44781h(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    /* renamed from: i */
    public final void mo44782i(C6833e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C6833e<K, V> eVar2 = eVar.f35412b;
            C6833e<K, V> eVar3 = eVar.f35414c;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f35417n : 0;
            int i3 = eVar3 != null ? eVar3.f35417n : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C6833e<K, V> eVar4 = eVar3.f35412b;
                C6833e<K, V> eVar5 = eVar3.f35414c;
                int i5 = eVar5 != null ? eVar5.f35417n : 0;
                if (eVar4 != null) {
                    i = eVar4.f35417n;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    mo44788o(eVar3);
                }
                mo44787n(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C6833e<K, V> eVar6 = eVar2.f35412b;
                C6833e<K, V> eVar7 = eVar2.f35414c;
                int i7 = eVar7 != null ? eVar7.f35417n : 0;
                if (eVar6 != null) {
                    i = eVar6.f35417n;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    mo44787n(eVar2);
                }
                mo44788o(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f35417n = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f35417n = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f35410a;
        }
    }

    /* renamed from: j */
    public void mo44783j(C6833e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C6833e<K, V> eVar2 = eVar.f35416e;
            eVar2.f35415d = eVar.f35415d;
            eVar.f35415d.f35416e = eVar2;
        }
        C6833e<K, V> eVar3 = eVar.f35412b;
        C6833e<K, V> eVar4 = eVar.f35414c;
        C6833e<K, V> eVar5 = eVar.f35410a;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                mo44786m(eVar, eVar3);
                eVar.f35412b = null;
            } else if (eVar4 != null) {
                mo44786m(eVar, eVar4);
                eVar.f35414c = null;
            } else {
                mo44786m(eVar, (C6833e<K, V>) null);
            }
            mo44782i(eVar5, false);
            this.f35400n--;
            this.f35401o++;
            return;
        }
        C6833e<K, V> b = eVar3.f35417n > eVar4.f35417n ? eVar3.mo44812b() : eVar4.mo44811a();
        mo44783j(b, false);
        C6833e<K, V> eVar6 = eVar.f35412b;
        if (eVar6 != null) {
            i = eVar6.f35417n;
            b.f35412b = eVar6;
            eVar6.f35410a = b;
            eVar.f35412b = null;
        } else {
            i = 0;
        }
        C6833e<K, V> eVar7 = eVar.f35414c;
        if (eVar7 != null) {
            i2 = eVar7.f35417n;
            b.f35414c = eVar7;
            eVar7.f35410a = b;
            eVar.f35414c = null;
        }
        b.f35417n = Math.max(i, i2) + 1;
        mo44786m(eVar, b);
    }

    public Set<K> keySet() {
        t32<K, V>.c cVar = this.f35396a;
        if (cVar != null) {
            return cVar;
        }
        t32<K, V>.c cVar2 = new C6830c();
        this.f35396a = cVar2;
        return cVar2;
    }

    /* renamed from: l */
    public C6833e<K, V> mo44785l(Object obj) {
        C6833e<K, V> g = mo44779g(obj);
        if (g != null) {
            mo44783j(g, true);
        }
        return g;
    }

    /* renamed from: m */
    public final void mo44786m(C6833e<K, V> eVar, C6833e<K, V> eVar2) {
        C6833e<K, V> eVar3 = eVar.f35410a;
        eVar.f35410a = null;
        if (eVar2 != null) {
            eVar2.f35410a = eVar3;
        }
        if (eVar3 == null) {
            this.f35397a = eVar2;
        } else if (eVar3.f35412b == eVar) {
            eVar3.f35412b = eVar2;
        } else {
            eVar3.f35414c = eVar2;
        }
    }

    /* renamed from: n */
    public final void mo44787n(C6833e<K, V> eVar) {
        C6833e<K, V> eVar2 = eVar.f35412b;
        C6833e<K, V> eVar3 = eVar.f35414c;
        C6833e<K, V> eVar4 = eVar3.f35412b;
        C6833e<K, V> eVar5 = eVar3.f35414c;
        eVar.f35414c = eVar4;
        if (eVar4 != null) {
            eVar4.f35410a = eVar;
        }
        mo44786m(eVar, eVar3);
        eVar3.f35412b = eVar;
        eVar.f35410a = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f35417n : 0, eVar4 != null ? eVar4.f35417n : 0) + 1;
        eVar.f35417n = max;
        if (eVar5 != null) {
            i = eVar5.f35417n;
        }
        eVar3.f35417n = Math.max(max, i) + 1;
    }

    /* renamed from: o */
    public final void mo44788o(C6833e<K, V> eVar) {
        C6833e<K, V> eVar2 = eVar.f35412b;
        C6833e<K, V> eVar3 = eVar.f35414c;
        C6833e<K, V> eVar4 = eVar2.f35412b;
        C6833e<K, V> eVar5 = eVar2.f35414c;
        eVar.f35412b = eVar5;
        if (eVar5 != null) {
            eVar5.f35410a = eVar;
        }
        mo44786m(eVar, eVar2);
        eVar2.f35414c = eVar;
        eVar.f35410a = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f35417n : 0, eVar5 != null ? eVar5.f35417n : 0) + 1;
        eVar.f35417n = max;
        if (eVar4 != null) {
            i = eVar4.f35417n;
        }
        eVar2.f35417n = Math.max(max, i) + 1;
    }

    /* renamed from: p */
    public final Object mo44789p() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C6833e d = mo44776d(k, true);
        V v2 = d.f35413b;
        d.f35413b = v;
        return v2;
    }

    public V remove(Object obj) {
        C6833e l = mo44785l(obj);
        if (l != null) {
            return l.f35413b;
        }
        return null;
    }

    public int size() {
        return this.f35400n;
    }
}

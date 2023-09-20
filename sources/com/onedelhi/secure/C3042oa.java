package com.onedelhi.secure;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.onedelhi.secure.oa */
public class C3042oa<K, V> extends ty3<K, V> implements Map<K, V> {
    @ts2

    /* renamed from: a */
    public nc2<K, V> f17886a;

    /* renamed from: com.onedelhi.secure.oa$a */
    public class C3043a extends nc2<K, V> {
        public C3043a() {
        }

        /* renamed from: a */
        public void mo21074a() {
            C3042oa.this.clear();
        }

        /* renamed from: b */
        public Object mo21075b(int i, int i2) {
            return C3042oa.this.f21179a[(i << 1) + i2];
        }

        /* renamed from: c */
        public Map<K, V> mo21076c() {
            return C3042oa.this;
        }

        /* renamed from: d */
        public int mo21077d() {
            return C3042oa.this.f21180n;
        }

        /* renamed from: e */
        public int mo21078e(Object obj) {
            return C3042oa.this.mo25346i(obj);
        }

        /* renamed from: f */
        public int mo21079f(Object obj) {
            return C3042oa.this.mo25349l(obj);
        }

        /* renamed from: g */
        public void mo21080g(K k, V v) {
            C3042oa.this.put(k, v);
        }

        /* renamed from: h */
        public void mo21081h(int i) {
            C3042oa.this.mo4015o(i);
        }

        /* renamed from: i */
        public V mo21082i(int i, V v) {
            return C3042oa.this.mo4016p(i, v);
        }
    }

    public C3042oa() {
    }

    public C3042oa(int i) {
        super(i);
    }

    public C3042oa(ty3 ty3) {
        super(ty3);
    }

    /* renamed from: s */
    private nc2<K, V> m23620s() {
        if (this.f17886a == null) {
            this.f17886a = new C3043a();
        }
        return this.f17886a;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m23620s().mo21083l();
    }

    public Set<K> keySet() {
        return m23620s().mo21084m();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo25342f(this.f21180n + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    /* renamed from: r */
    public boolean mo21844r(@mr2 Collection<?> collection) {
        return nc2.m22658j(this, collection);
    }

    /* renamed from: t */
    public boolean mo4018t(@mr2 Collection<?> collection) {
        return nc2.m22660o(this, collection);
    }

    /* renamed from: u */
    public boolean mo4019u(@mr2 Collection<?> collection) {
        return nc2.m22661p(this, collection);
    }

    public Collection<V> values() {
        return m23620s().mo21085n();
    }
}

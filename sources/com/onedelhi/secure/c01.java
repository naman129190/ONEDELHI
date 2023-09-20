package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import com.onedelhi.secure.nq3;
import java.util.HashMap;
import java.util.Map;

@hl3({hl3.C2354a.f13188c})
public class c01<K, V> extends nq3<K, V> {

    /* renamed from: a */
    public HashMap<K, nq3.C2998c<K, V>> f10057a = new HashMap<>();

    public boolean contains(K k) {
        return this.f10057a.containsKey(k);
    }

    /* renamed from: f */
    public nq3.C2998c<K, V> mo13877f(K k) {
        return this.f10057a.get(k);
    }

    /* renamed from: k */
    public V mo13878k(@mr2 K k, @mr2 V v) {
        nq3.C2998c f = mo13877f(k);
        if (f != null) {
            return f.f17537b;
        }
        this.f10057a.put(k, mo21427j(k, v));
        return null;
    }

    /* renamed from: l */
    public V mo13879l(@mr2 K k) {
        V l = super.mo13879l(k);
        this.f10057a.remove(k);
        return l;
    }

    /* renamed from: n */
    public Map.Entry<K, V> mo13880n(K k) {
        if (contains(k)) {
            return this.f10057a.get(k).f17536b;
        }
        return null;
    }
}

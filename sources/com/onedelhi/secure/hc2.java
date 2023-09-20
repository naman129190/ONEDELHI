package com.onedelhi.secure;

import java.util.Collections;
import java.util.Map;

public final class hc2<K, V> {

    /* renamed from: a */
    public final Map<K, V> f29572a;

    public hc2(int i) {
        this.f29572a = xc0.m70132d(i);
    }

    /* renamed from: b */
    public static <K, V> hc2<K, V> m50440b(int i) {
        return new hc2<>(i);
    }

    /* renamed from: a */
    public Map<K, V> mo37270a() {
        return this.f29572a.size() != 0 ? Collections.unmodifiableMap(this.f29572a) : Collections.emptyMap();
    }

    /* renamed from: c */
    public hc2<K, V> mo37271c(K k, V v) {
        this.f29572a.put(k, v);
        return this;
    }

    /* renamed from: d */
    public hc2<K, V> mo37272d(Map<K, V> map) {
        this.f29572a.putAll(map);
        return this;
    }
}

package com.onedelhi.secure;

import java.util.Collections;
import java.util.Map;

public final class jc2<K, V> {

    /* renamed from: a */
    public final Map<K, V> f14089a;

    public jc2(int i) {
        this.f14089a = yc0.m32177d(i);
    }

    /* renamed from: b */
    public static <K, V> jc2<K, V> m18382b(int i) {
        return new jc2<>(i);
    }

    /* renamed from: a */
    public Map<K, V> mo18250a() {
        return this.f14089a.size() != 0 ? Collections.unmodifiableMap(this.f14089a) : Collections.emptyMap();
    }

    /* renamed from: c */
    public jc2<K, V> mo18251c(K k, V v) {
        this.f14089a.put(k, v);
        return this;
    }

    /* renamed from: d */
    public jc2<K, V> mo18252d(Map<K, V> map) {
        this.f14089a.putAll(map);
        return this;
    }
}

package com.onedelhi.secure;

import com.onedelhi.secure.C3882x0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class pc2<K, V> extends C3882x0<K, V, V> {

    /* renamed from: a */
    public static final a73<Map<Object, Object>> f18424a = or1.m24043a(Collections.emptyMap());

    /* renamed from: com.onedelhi.secure.pc2$b */
    public static final class C3143b<K, V> extends C3882x0.C3883a<K, V, V> {
        public C3143b(int i) {
            super(i);
        }

        /* renamed from: c */
        public pc2<K, V> mo22382c() {
            return new pc2<>(this.f22368a);
        }

        /* renamed from: d */
        public C3143b<K, V> mo22380a(K k, a73<V> a73) {
            super.mo22380a(k, a73);
            return this;
        }

        /* renamed from: e */
        public C3143b<K, V> mo22381b(a73<Map<K, V>> a73) {
            super.mo22381b(a73);
            return this;
        }
    }

    public pc2(Map<K, a73<V>> map) {
        super(map);
    }

    /* renamed from: c */
    public static <K, V> C3143b<K, V> m24577c(int i) {
        return new C3143b<>(i);
    }

    /* renamed from: d */
    public static <K, V> a73<Map<K, V>> m24578d() {
        return f18424a;
    }

    /* renamed from: e */
    public Map<K, V> get() {
        LinkedHashMap d = yc0.m32177d(mo26732b().size());
        for (Map.Entry entry : mo26732b().entrySet()) {
            d.put(entry.getKey(), ((a73) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(d);
    }
}

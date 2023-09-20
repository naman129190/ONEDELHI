package com.onedelhi.secure;

import com.onedelhi.secure.C7288y0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class qc2<K, V> extends C7288y0<K, V, V> {

    /* renamed from: a */
    public static final a73<Map<Object, Object>> f34060a = nr1.m58727a(Collections.emptyMap());

    /* renamed from: com.onedelhi.secure.qc2$b */
    public static final class C6532b<K, V> extends C7288y0.C7289a<K, V, V> {
        public C6532b(int i) {
            super(i);
        }

        /* renamed from: c */
        public qc2<K, V> mo43341c() {
            return new qc2<>(this.f37738a);
        }

        /* renamed from: d */
        public C6532b<K, V> mo30883a(K k, a73<V> a73) {
            super.mo30883a(k, a73);
            return this;
        }

        /* renamed from: e */
        public C6532b<K, V> mo30884b(a73<Map<K, V>> a73) {
            super.mo30884b(a73);
            return this;
        }
    }

    public qc2(Map<K, a73<V>> map) {
        super(map);
    }

    /* renamed from: c */
    public static <K, V> C6532b<K, V> m62451c(int i) {
        return new C6532b<>(i);
    }

    /* renamed from: d */
    public static <K, V> a73<Map<K, V>> m62452d() {
        return f34060a;
    }

    /* renamed from: e */
    public Map<K, V> get() {
        LinkedHashMap d = xc0.m70132d(mo47504b().size());
        for (Map.Entry entry : mo47504b().entrySet()) {
            d.put(entry.getKey(), ((a73) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(d);
    }
}

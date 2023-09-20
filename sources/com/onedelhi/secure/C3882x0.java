package com.onedelhi.secure;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.onedelhi.secure.x0 */
public abstract class C3882x0<K, V, V2> implements lz0<Map<K, V2>> {

    /* renamed from: a */
    public final Map<K, a73<V>> f22367a;

    /* renamed from: com.onedelhi.secure.x0$a */
    public static abstract class C3883a<K, V, V2> {

        /* renamed from: a */
        public final LinkedHashMap<K, a73<V>> f22368a;

        public C3883a(int i) {
            this.f22368a = yc0.m32177d(i);
        }

        /* renamed from: a */
        public C3883a<K, V, V2> mo22380a(K k, a73<V> a73) {
            this.f22368a.put(h43.m16476c(k, "key"), h43.m16476c(a73, "provider"));
            return this;
        }

        /* renamed from: b */
        public C3883a<K, V, V2> mo22381b(a73<Map<K, V2>> a73) {
            if (a73 instanceof hi0) {
                return mo22381b(((hi0) a73).mo17286a());
            }
            this.f22368a.putAll(((C3882x0) a73).f22367a);
            return this;
        }
    }

    public C3882x0(Map<K, a73<V>> map) {
        this.f22367a = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<K, a73<V>> mo26732b() {
        return this.f22367a;
    }
}

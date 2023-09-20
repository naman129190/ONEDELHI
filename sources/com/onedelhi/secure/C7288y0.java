package com.onedelhi.secure;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.onedelhi.secure.y0 */
public abstract class C7288y0<K, V, V2> implements kz0<Map<K, V2>> {

    /* renamed from: a */
    public final Map<K, a73<V>> f37737a;

    /* renamed from: com.onedelhi.secure.y0$a */
    public static abstract class C7289a<K, V, V2> {

        /* renamed from: a */
        public final LinkedHashMap<K, a73<V>> f37738a;

        public C7289a(int i) {
            this.f37738a = xc0.m70132d(i);
        }

        /* renamed from: a */
        public C7289a<K, V, V2> mo30883a(K k, a73<V> a73) {
            this.f37738a.put(j43.m52915c(k, "key"), j43.m52915c(a73, "provider"));
            return this;
        }

        /* renamed from: b */
        public C7289a<K, V, V2> mo30884b(a73<Map<K, V2>> a73) {
            if (a73 instanceof gi0) {
                return mo30884b(((gi0) a73).mo36743a());
            }
            this.f37738a.putAll(((C7288y0) a73).f37737a);
            return this;
        }
    }

    public C7288y0(Map<K, a73<V>> map) {
        this.f37737a = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map<K, a73<V>> mo47504b() {
        return this.f37737a;
    }
}

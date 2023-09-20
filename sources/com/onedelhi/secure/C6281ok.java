package com.onedelhi.secure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.onedelhi.secure.ok */
public class C6281ok<K> extends HashMap<K, Object> {

    /* renamed from: a */
    public final Map<Object, K> f33066a = new HashMap();

    /* renamed from: c */
    public C6281ok<K> clone() {
        C6281ok<K> okVar = new C6281ok<>();
        okVar.putAll((Map) super.clone());
        return okVar;
    }

    public void clear() {
        super.clear();
        this.f33066a.clear();
    }

    /* renamed from: d */
    public K mo41802d(Object obj) {
        return this.f33066a.get(obj);
    }

    /* renamed from: f */
    public Object mo41803f(K k, Collection collection) {
        for (Object put : collection) {
            this.f33066a.put(put, k);
        }
        return super.put(k, collection);
    }

    public Object put(K k, Object obj) {
        this.f33066a.put(obj, k);
        return super.put(k, obj);
    }

    public void putAll(Map<? extends K, ?> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Object remove(Object obj) {
        Object remove = super.remove(obj);
        if (remove instanceof Collection) {
            for (Object remove2 : (Collection) remove) {
                this.f33066a.remove(remove2);
            }
        } else {
            this.f33066a.remove(remove);
        }
        return remove;
    }
}

package com.onedelhi.secure;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class tc6 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zc6 f20748a;

    public /* synthetic */ tc6(zc6 zc6, qc6 qc6) {
        this.f20748a = zc6;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f20748a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f20748a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f20748a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator iterator() {
        return new nc6(this.f20748a, (kc6) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f20748a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f20748a.size();
    }
}

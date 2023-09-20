package com.onedelhi.secure;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class ju6 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ lu6 f14573a;

    public /* synthetic */ ju6(lu6 lu6, iu6 iu6) {
        this.f14573a = lu6;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f14573a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f14573a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f14573a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator iterator() {
        return new hu6(this.f14573a, (gu6) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f14573a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f14573a.size();
    }
}

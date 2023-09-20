package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class q86 extends LinkedHashMap {

    /* renamed from: a */
    public static final q86 f18968a;

    /* renamed from: b */
    public boolean f18969b = true;

    static {
        q86 q86 = new q86();
        f18968a = q86;
        q86.f18969b = false;
    }

    public q86() {
    }

    public q86(Map map) {
        super(map);
    }

    /* renamed from: c */
    public static q86 m25463c() {
        return f18968a;
    }

    /* renamed from: i */
    public static int m25464i(Object obj) {
        if (obj instanceof byte[]) {
            return t56.m28110b((byte[]) obj);
        }
        if (!(obj instanceof k56)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        mo22952j();
        super.clear();
    }

    /* renamed from: d */
    public final q86 mo22945d() {
        return isEmpty() ? new q86() : new q86(this);
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo22948f() {
        this.f18969b = false;
    }

    /* renamed from: g */
    public final void mo22949g(q86 q86) {
        mo22952j();
        if (!q86.isEmpty()) {
            putAll(q86);
        }
    }

    /* renamed from: h */
    public final boolean mo22950h() {
        return this.f18969b;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m25464i(entry.getValue()) ^ m25464i(entry.getKey());
        }
        return i;
    }

    /* renamed from: j */
    public final void mo22952j() {
        if (!this.f18969b) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object put(Object obj, Object obj2) {
        mo22952j();
        t56.m28113e(obj);
        t56.m28113e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        mo22952j();
        for (Object next : map.keySet()) {
            t56.m28113e(next);
            t56.m28113e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        mo22952j();
        return super.remove(obj);
    }
}

package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class ps6 extends LinkedHashMap {

    /* renamed from: a */
    public static final ps6 f18699a;

    /* renamed from: b */
    public boolean f18700b = true;

    static {
        ps6 ps6 = new ps6();
        f18699a = ps6;
        ps6.f18700b = false;
    }

    public ps6() {
    }

    public ps6(Map map) {
        super(map);
    }

    /* renamed from: c */
    public static ps6 m25002c() {
        return f18699a;
    }

    /* renamed from: i */
    public static int m25003i(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = zq6.f23858a;
            int length = bArr.length;
            int b = zq6.m33323b(length, bArr, 0, length);
            if (b == 0) {
                return 1;
            }
            return b;
        } else if (!(obj instanceof nq6)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        mo22629j();
        super.clear();
    }

    /* renamed from: d */
    public final ps6 mo22622d() {
        return isEmpty() ? new ps6() : new ps6(this);
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
    public final void mo22625f() {
        this.f18700b = false;
    }

    /* renamed from: g */
    public final void mo22626g(ps6 ps6) {
        mo22629j();
        if (!ps6.isEmpty()) {
            putAll(ps6);
        }
    }

    /* renamed from: h */
    public final boolean mo22627h() {
        return this.f18700b;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m25003i(entry.getValue()) ^ m25003i(entry.getKey());
        }
        return i;
    }

    /* renamed from: j */
    public final void mo22629j() {
        if (!this.f18700b) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object put(Object obj, Object obj2) {
        mo22629j();
        byte[] bArr = zq6.f23858a;
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        mo22629j();
        for (Object next : map.keySet()) {
            byte[] bArr = zq6.f23858a;
            Objects.requireNonNull(next);
            Objects.requireNonNull(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        mo22629j();
        return super.remove(obj);
    }
}

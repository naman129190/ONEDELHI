package com.onedelhi.secure;

import com.onedelhi.secure.vs1;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class rc2<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    public static final rc2 f34552a;

    /* renamed from: b */
    public boolean f34553b = true;

    static {
        rc2 rc2 = new rc2();
        f34552a = rc2;
        rc2.mo43842o();
    }

    public rc2() {
    }

    public rc2(Map<K, V> map) {
        super(map);
    }

    /* renamed from: c */
    public static <K, V> int m63476c(Map<K, V> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            i += m63477d(next.getValue()) ^ m63477d(next.getKey());
        }
        return i;
    }

    /* renamed from: d */
    public static int m63477d(Object obj) {
        if (obj instanceof byte[]) {
            return vs1.m68441m((byte[]) obj);
        }
        if (!(obj instanceof vs1.C7081c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public static void m63478f(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            vs1.m68432d(next);
            vs1.m68432d(map.get(next));
        }
    }

    /* renamed from: g */
    public static Object m63479g(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: h */
    public static <K, V> Map<K, V> m63480h(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            linkedHashMap.put(next.getKey(), m63479g(next.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: i */
    public static <K, V> rc2<K, V> m63481i() {
        return f34552a;
    }

    /* renamed from: l */
    public static boolean m63482l(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> boolean m63483m(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = m63482l(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rc2.m63483m(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        mo43840j();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && m63483m(this, (Map) obj);
    }

    public int hashCode() {
        return m63476c(this);
    }

    /* renamed from: j */
    public final void mo43840j() {
        if (!mo43841n()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n */
    public boolean mo43841n() {
        return this.f34553b;
    }

    /* renamed from: o */
    public void mo43842o() {
        this.f34553b = false;
    }

    /* renamed from: p */
    public void mo43843p(rc2<K, V> rc2) {
        mo43840j();
        if (!rc2.isEmpty()) {
            putAll(rc2);
        }
    }

    public V put(K k, V v) {
        mo43840j();
        vs1.m68432d(k);
        vs1.m68432d(v);
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo43840j();
        m63478f(map);
        super.putAll(map);
    }

    /* renamed from: q */
    public rc2<K, V> mo43846q() {
        return isEmpty() ? new rc2<>() : new rc2<>(this);
    }

    /* renamed from: r */
    public V mo43847r(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    public V remove(Object obj) {
        mo43840j();
        return super.remove(obj);
    }
}

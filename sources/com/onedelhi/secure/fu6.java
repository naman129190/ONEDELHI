package com.onedelhi.secure;

import java.util.Map;

public final class fu6 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final /* synthetic */ lu6 f12332a;

    /* renamed from: a */
    public final Comparable f12333a;

    /* renamed from: a */
    public Object f12334a;

    public fu6(lu6 lu6, Comparable comparable, Object obj) {
        this.f12332a = lu6;
        this.f12333a = comparable;
        this.f12334a = obj;
    }

    /* renamed from: b */
    public static final boolean m15311b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable mo16176a() {
        return this.f12333a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f12333a.compareTo(((fu6) obj).f12333a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m15311b(this.f12333a, entry.getKey()) && m15311b(this.f12334a, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f12333a;
    }

    public final Object getValue() {
        return this.f12334a;
    }

    public final int hashCode() {
        Comparable comparable = this.f12333a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f12334a;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f12332a.mo19916r();
        Object obj2 = this.f12334a;
        this.f12334a = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12333a);
        String valueOf2 = String.valueOf(this.f12334a);
        return valueOf + a13.f25713a + valueOf2;
    }
}

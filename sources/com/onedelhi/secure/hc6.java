package com.onedelhi.secure;

import java.util.Map;

public final class hc6 implements Map.Entry, Comparable {

    /* renamed from: a */
    public final /* synthetic */ zc6 f13048a;

    /* renamed from: a */
    public final Comparable f13049a;

    /* renamed from: a */
    public Object f13050a;

    public hc6(zc6 zc6, Comparable comparable, Object obj) {
        this.f13048a = zc6;
        this.f13049a = comparable;
        this.f13050a = obj;
    }

    /* renamed from: b */
    public static final boolean m16636b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable mo17192a() {
        return this.f13049a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f13049a.compareTo(((hc6) obj).f13049a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m16636b(this.f13049a, entry.getKey()) && m16636b(this.f13050a, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f13049a;
    }

    public final Object getValue() {
        return this.f13050a;
    }

    public final int hashCode() {
        Comparable comparable = this.f13049a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f13050a;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f13048a.mo27937r();
        Object obj2 = this.f13050a;
        this.f13050a = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13049a);
        String valueOf2 = String.valueOf(this.f13050a);
        return valueOf + a13.f25713a + valueOf2;
    }
}

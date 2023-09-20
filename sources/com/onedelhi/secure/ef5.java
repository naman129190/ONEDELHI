package com.onedelhi.secure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class ef5 implements qh5, jg5 {

    /* renamed from: a */
    public final Map f11214a = new HashMap();

    /* renamed from: b */
    public final String f11215b;

    public ef5(String str) {
        this.f11215b = str;
    }

    /* renamed from: a */
    public abstract qh5 mo14991a(w96 w96, List list);

    /* renamed from: b */
    public final String mo13084b() {
        return this.f11215b;
    }

    /* renamed from: c */
    public final String mo15164c() {
        return this.f11215b;
    }

    /* renamed from: e */
    public final Double mo13085e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef5)) {
            return false;
        }
        ef5 ef5 = (ef5) obj;
        String str = this.f11215b;
        if (str != null) {
            return str.equals(ef5.f11215b);
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean mo13087f() {
        return Boolean.TRUE;
    }

    /* renamed from: g */
    public final qh5 mo13088g(String str, w96 w96, List list) {
        return "toString".equals(str) ? new wi5(this.f11215b) : pf5.m24652a(this, new wi5(str), w96, list);
    }

    public final int hashCode() {
        String str = this.f11215b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: i */
    public final qh5 mo15167i(String str) {
        return this.f11214a.containsKey(str) ? (qh5) this.f11214a.get(str) : qh5.f19182a;
    }

    /* renamed from: j */
    public final boolean mo15168j(String str) {
        return this.f11214a.containsKey(str);
    }

    /* renamed from: k */
    public qh5 mo13090k() {
        return this;
    }

    /* renamed from: l */
    public final Iterator mo13091l() {
        return pf5.m24653b(this.f11214a);
    }

    /* renamed from: n */
    public final void mo15169n(String str, qh5 qh5) {
        if (qh5 == null) {
            this.f11214a.remove(str);
        } else {
            this.f11214a.put(str, qh5);
        }
    }
}

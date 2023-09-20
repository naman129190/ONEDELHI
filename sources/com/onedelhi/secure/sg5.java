package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class sg5 implements qh5, jg5 {

    /* renamed from: a */
    public final Map f20368a = new HashMap();

    /* renamed from: a */
    public final List mo24374a() {
        return new ArrayList(this.f20368a.keySet());
    }

    /* renamed from: b */
    public final String mo13084b() {
        return "[object Object]";
    }

    /* renamed from: e */
    public final Double mo13085e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg5)) {
            return false;
        }
        return this.f20368a.equals(((sg5) obj).f20368a);
    }

    /* renamed from: f */
    public final Boolean mo13087f() {
        return Boolean.TRUE;
    }

    /* renamed from: g */
    public qh5 mo13088g(String str, w96 w96, List list) {
        return "toString".equals(str) ? new wi5(toString()) : pf5.m24652a(this, new wi5(str), w96, list);
    }

    public final int hashCode() {
        return this.f20368a.hashCode();
    }

    /* renamed from: i */
    public final qh5 mo15167i(String str) {
        return this.f20368a.containsKey(str) ? (qh5) this.f20368a.get(str) : qh5.f19182a;
    }

    /* renamed from: j */
    public final boolean mo15168j(String str) {
        return this.f20368a.containsKey(str);
    }

    /* renamed from: k */
    public final qh5 mo13090k() {
        String str;
        Map map;
        qh5 qh5;
        sg5 sg5 = new sg5();
        for (Map.Entry entry : this.f20368a.entrySet()) {
            if (entry.getValue() instanceof jg5) {
                map = sg5.f20368a;
                str = (String) entry.getKey();
                qh5 = (qh5) entry.getValue();
            } else {
                map = sg5.f20368a;
                str = (String) entry.getKey();
                qh5 = ((qh5) entry.getValue()).mo13090k();
            }
            map.put(str, qh5);
        }
        return sg5;
    }

    /* renamed from: l */
    public final Iterator mo13091l() {
        return pf5.m24653b(this.f20368a);
    }

    /* renamed from: n */
    public final void mo15169n(String str, qh5 qh5) {
        if (qh5 == null) {
            this.f20368a.remove(str);
        } else {
            this.f20368a.put(str, qh5);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(to1.f35745h);
        if (!this.f20368a.isEmpty()) {
            for (String str : this.f20368a.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f20368a.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(vf4.f36537c));
        }
        sb.append("}");
        return sb.toString();
    }
}

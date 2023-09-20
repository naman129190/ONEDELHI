package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class jh6 {
    /* renamed from: a */
    public static qh5 m18590a(jd6 jd6) {
        if (jd6 == null) {
            return qh5.f19182a;
        }
        int K = jd6.mo18298K() - 1;
        if (K == 1) {
            return jd6.mo18297J() ? new wi5(jd6.mo18292E()) : qh5.f19189h;
        }
        if (K == 2) {
            return jd6.mo18296I() ? new te5(Double.valueOf(jd6.mo18290B())) : new te5((Double) null);
        }
        if (K == 3) {
            return jd6.mo18295H() ? new xd5(Boolean.valueOf(jd6.mo18294G())) : new xd5((Boolean) null);
        }
        if (K == 4) {
            List<jd6> F = jd6.mo18293F();
            ArrayList arrayList = new ArrayList();
            for (jd6 a : F) {
                arrayList.add(m18590a(a));
            }
            return new yh5(jd6.mo18291D(), arrayList);
        }
        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
    }

    /* renamed from: b */
    public static qh5 m18591b(Object obj) {
        if (obj == null) {
            return qh5.f19183b;
        }
        if (obj instanceof String) {
            return new wi5((String) obj);
        }
        if (obj instanceof Double) {
            return new te5((Double) obj);
        }
        if (obj instanceof Long) {
            return new te5(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new te5(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new xd5((Boolean) obj);
        }
        if (obj instanceof Map) {
            sg5 sg5 = new sg5();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                qh5 b = m18591b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    sg5.mo15169n((String) next, b);
                }
            }
            return sg5;
        } else if (obj instanceof List) {
            ld5 ld5 = new ld5();
            for (Object b2 : (List) obj) {
                ld5.mo19465z(ld5.mo19456r(), m18591b(b2));
            }
            return ld5;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}

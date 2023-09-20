package com.onedelhi.secure;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class pf5 {
    /* renamed from: a */
    public static qh5 m24652a(jg5 jg5, qh5 qh5, w96 w96, List list) {
        if (jg5.mo15168j(qh5.mo13084b())) {
            qh5 i = jg5.mo15167i(qh5.mo13084b());
            if (i instanceof ef5) {
                return ((ef5) i).mo14991a(w96, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{qh5.mo13084b()}));
        } else if ("hasOwnProperty".equals(qh5.mo13084b())) {
            sd6.m27480h("hasOwnProperty", 1, list);
            return jg5.mo15168j(w96.mo26465b((qh5) list.get(0)).mo13084b()) ? qh5.f19187f : qh5.f19188g;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{qh5.mo13084b()}));
        }
    }

    /* renamed from: b */
    public static Iterator m24653b(Map map) {
        return new ag5(map.keySet().iterator());
    }
}

package com.onedelhi.secure;

import java.util.Iterator;
import java.util.Map;

public final class qs6 {
    /* renamed from: a */
    public static final int m26153a(int i, Object obj, Object obj2) {
        ps6 ps6 = (ps6) obj;
        os6 os6 = (os6) obj2;
        if (ps6.isEmpty()) {
            return 0;
        }
        Iterator it = ps6.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final Object m26154b(Object obj, Object obj2) {
        ps6 ps6 = (ps6) obj;
        ps6 ps62 = (ps6) obj2;
        if (!ps62.isEmpty()) {
            if (!ps6.mo22627h()) {
                ps6 = ps6.mo22622d();
            }
            ps6.mo22626g(ps62);
        }
        return ps6;
    }
}

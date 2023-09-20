package com.onedelhi.secure;

import com.onedelhi.secure.oc2;
import java.util.Map;

public class tc2 implements sc2 {
    /* renamed from: i */
    public static <K, V> int m65568i(int i, Object obj, Object obj2) {
        rc2 rc2 = (rc2) obj;
        oc2 oc2 = (oc2) obj2;
        int i2 = 0;
        if (rc2.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : rc2.entrySet()) {
            i2 += oc2.mo41670a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    public static <K, V> rc2<K, V> m65569j(Object obj, Object obj2) {
        rc2<K, V> rc2 = (rc2) obj;
        rc2 rc22 = (rc2) obj2;
        if (!rc22.isEmpty()) {
            if (!rc2.mo43841n()) {
                rc2 = rc2.mo43846q();
            }
            rc2.mo43843p(rc22);
        }
        return rc2;
    }

    /* renamed from: a */
    public Map<?, ?> mo44274a(Object obj) {
        return (rc2) obj;
    }

    /* renamed from: b */
    public boolean mo44275b(Object obj) {
        return !((rc2) obj).mo43841n();
    }

    /* renamed from: c */
    public Object mo44276c(Object obj, Object obj2) {
        return m65569j(obj, obj2);
    }

    /* renamed from: d */
    public Object mo44277d(Object obj) {
        ((rc2) obj).mo43842o();
        return obj;
    }

    /* renamed from: e */
    public int mo44278e(int i, Object obj, Object obj2) {
        return m65568i(i, obj, obj2);
    }

    /* renamed from: f */
    public oc2.C6267b<?, ?> mo44279f(Object obj) {
        return ((oc2) obj).mo41672d();
    }

    /* renamed from: g */
    public Map<?, ?> mo44280g(Object obj) {
        return (rc2) obj;
    }

    /* renamed from: h */
    public Object mo44281h(Object obj) {
        return rc2.m63481i().mo43846q();
    }
}

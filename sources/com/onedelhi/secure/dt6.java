package com.onedelhi.secure;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class dt6 {

    /* renamed from: a */
    public static final dt6 f10924a = new dt6();

    /* renamed from: a */
    public final ht6 f10925a = new ns6();

    /* renamed from: a */
    public final ConcurrentMap f10926a = new ConcurrentHashMap();

    /* renamed from: a */
    public static dt6 m13329a() {
        return f10924a;
    }

    /* renamed from: b */
    public final gt6 mo14854b(Class cls) {
        zq6.m33324c(cls, "messageType");
        gt6 gt6 = (gt6) this.f10926a.get(cls);
        if (gt6 == null) {
            gt6 = this.f10925a.mo17409a(cls);
            zq6.m33324c(cls, "messageType");
            zq6.m33324c(gt6, "schema");
            gt6 gt62 = (gt6) this.f10926a.putIfAbsent(cls, gt6);
            return gt62 == null ? gt6 : gt62;
        }
    }
}

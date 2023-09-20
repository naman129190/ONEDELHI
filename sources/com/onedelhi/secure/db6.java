package com.onedelhi.secure;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class db6 {

    /* renamed from: a */
    public static final db6 f10696a = new db6();

    /* renamed from: a */
    public final pb6 f10697a = new k86();

    /* renamed from: a */
    public final ConcurrentMap f10698a = new ConcurrentHashMap();

    /* renamed from: a */
    public static db6 m13046a() {
        return f10696a;
    }

    /* renamed from: b */
    public final mb6 mo14594b(Class cls) {
        t56.m28114f(cls, "messageType");
        mb6 mb6 = (mb6) this.f10698a.get(cls);
        if (mb6 == null) {
            mb6 = this.f10697a.mo18960a(cls);
            t56.m28114f(cls, "messageType");
            t56.m28114f(mb6, "schema");
            mb6 mb62 = (mb6) this.f10698a.putIfAbsent(cls, mb6);
            return mb62 == null ? mb6 : mb62;
        }
    }
}

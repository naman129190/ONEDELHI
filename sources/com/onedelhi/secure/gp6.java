package com.onedelhi.secure;

public final class gp6 implements ts6 {

    /* renamed from: a */
    public static final gp6 f12701a = new gp6();

    /* renamed from: c */
    public static gp6 m16040c() {
        return f12701a;
    }

    /* renamed from: a */
    public final boolean mo16804a(Class cls) {
        return jq6.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final ss6 mo16805b(Class cls) {
        Class<jq6> cls2 = jq6.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (ss6) jq6.m18742l(cls.asSubclass(cls2)).mo12815A(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }
}

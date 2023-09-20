package com.onedelhi.secure;

public final class v46 implements c96 {

    /* renamed from: a */
    public static final v46 f21665a = new v46();

    /* renamed from: c */
    public static v46 m29825c() {
        return f21665a;
    }

    /* renamed from: a */
    public final boolean mo14072a(Class cls) {
        return e56.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final z86 mo14073b(Class cls) {
        Class<e56> cls2 = e56.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (z86) e56.m13584c(cls.asSubclass(cls2)).mo15053i(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }
}

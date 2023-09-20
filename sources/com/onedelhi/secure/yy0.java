package com.onedelhi.secure;

public final class yy0 {

    /* renamed from: a */
    public static final Class<?> f38104a = m72379e();

    /* renamed from: a */
    public static final String f38105a = "com.google.protobuf.ExtensionRegistry";

    /* renamed from: a */
    public static zy0 m72375a() {
        zy0 c = m72377c("newInstance");
        return c != null ? c : new zy0();
    }

    /* renamed from: b */
    public static zy0 m72376b() {
        zy0 c = m72377c("getEmptyRegistry");
        return c != null ? c : zy0.f38497b;
    }

    /* renamed from: c */
    public static final zy0 m72377c(String str) {
        Class<?> cls = f38104a;
        if (cls == null) {
            return null;
        }
        try {
            return (zy0) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m72378d(zy0 zy0) {
        Class<?> cls = f38104a;
        return cls != null && cls.isAssignableFrom(zy0.getClass());
    }

    /* renamed from: e */
    public static Class<?> m72379e() {
        try {
            return Class.forName(f38105a);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}

package com.onedelhi.secure;

public final class uo6 {

    /* renamed from: a */
    public static final qo6 f21461a = new so6();

    /* renamed from: b */
    public static final qo6 f21462b;

    static {
        qo6 qo6;
        try {
            qo6 = (qo6) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            qo6 = null;
        }
        f21462b = qo6;
    }

    /* renamed from: a */
    public static qo6 m29488a() {
        qo6 qo6 = f21462b;
        if (qo6 != null) {
            return qo6;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static qo6 m29489b() {
        return f21461a;
    }
}

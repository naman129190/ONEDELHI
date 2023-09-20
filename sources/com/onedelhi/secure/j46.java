package com.onedelhi.secure;

public final class j46 {

    /* renamed from: a */
    public static final d46 f14013a = new g46();

    /* renamed from: b */
    public static final d46 f14014b;

    static {
        d46 d46;
        try {
            d46 = (d46) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            d46 = null;
        }
        f14014b = d46;
    }

    /* renamed from: a */
    public static d46 m18164a() {
        d46 d46 = f14014b;
        if (d46 != null) {
            return d46;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static d46 m18165b() {
        return f14013a;
    }
}

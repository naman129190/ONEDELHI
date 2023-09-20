package com.onedelhi.secure;

public final class cz0 {

    /* renamed from: a */
    public static final az0<?> f27140a = new bz0();

    /* renamed from: b */
    public static final az0<?> f27141b = m44382c();

    /* renamed from: a */
    public static az0<?> m44380a() {
        az0<?> az0 = f27141b;
        if (az0 != null) {
            return az0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static az0<?> m44381b() {
        return f27140a;
    }

    /* renamed from: c */
    public static az0<?> m44382c() {
        try {
            return (az0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

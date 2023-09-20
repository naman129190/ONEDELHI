package com.onedelhi.secure;

public final class uc2 {

    /* renamed from: a */
    public static final sc2 f36033a = m66946c();

    /* renamed from: b */
    public static final sc2 f36034b = new tc2();

    /* renamed from: a */
    public static sc2 m66944a() {
        return f36033a;
    }

    /* renamed from: b */
    public static sc2 m66945b() {
        return f36034b;
    }

    /* renamed from: c */
    public static sc2 m66946c() {
        try {
            return (sc2) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
